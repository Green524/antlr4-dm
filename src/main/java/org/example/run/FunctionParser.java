package org.example.run;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import g4.CalcParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public class FunctionParser {

    public Function parser(CalcParser.ProgContext progContext) {
        Function function = new Function();
        //获取函数体信息
        CalcParser.FuncContext funcContext = progContext.func();
        function.setFuncName(funcContext.ID().getText());

        List<CalcParser.ExprContext> exprContexts = progContext.expr();
//        Map<Object, Object> argsMap = new HashMap<>();
//        for (CalcParser.ExprContext exprContext : exprContexts) {
//            System.out.println(exprContext.ID() + exprContext.Equals().getSymbol().getText() + exprContext.INT());
//            argsMap.put(exprContext.ID().getText(), exprContext.INT().getText());
//        }
//        function.setArgs(argsMap);

        StringBuilder sb = new StringBuilder();
        for (CalcParser.ExprContext exprContext : exprContexts) {
            sb
                    .append(exprContext.ID())
                    .append(exprContext.Equals())
                    .append((Objects.nonNull(exprContext.INT()) ? exprContext.INT() : exprContext.stat().getText()))
                    .append("\n        ");
        }

        CalcParser.PrintContext printContext = progContext.print();
        sb.append(printContext.KeywordPrint())
                .append("(")
                .append(printContext.ID())
                .append(")");

        function.setFuncBody(sb.toString());

        CalcParser.StatContext statContext = progContext.stat();
        if (Objects.nonNull(statContext.BinOpPlus())) {
            List<TerminalNode> statIDs = statContext.ID();
            String binOpPlus = statContext.BinOpPlus().getText();
            function.setFuncReturn(statIDs.get(0) + binOpPlus + statIDs.get(1));
        } else {
            function.setFuncReturn(progContext.KeywordReturn().getText() + " " + statContext.ID(0).getText());
        }

        return function;
    }

    public String createPy(String template, Function function) {
        template = template.replace("#{funcName}", function.getFuncName());
        template = template.replace("#{args}", Objects.isNull(function.getArgs()) ? "self" : function.getArgs());
        template = template.replace("#{funcBody}", function.getFuncBody());
        template = template.replace("#{funcReturn}", function.getFuncReturn());

        String file = function.getFuncName() + ".py";
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(template);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
