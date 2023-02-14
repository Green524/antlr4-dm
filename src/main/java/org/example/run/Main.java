package org.example.run;

import g4.CalcLexer;
import g4.CalcParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import template.TemplateReader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("D:\\IdeaProjects\\antlr4-dm\\src\\main\\resources\\g4\\input.txt"));
        CharStream stream = CharStreams.fromStream(inputStream);
        CalcLexer lexer = new CalcLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);

        CalcParser.ProgContext progContext = parser.prog();
        FunctionParser functionParser = new FunctionParser();
        Function function = functionParser.parser(progContext);

        TemplateReader reader = new TemplateReader();
        String path = Thread.currentThread().getContextClassLoader().getResource("python/template/calc.template").getFile();
        String f = functionParser.createPy(reader.reader(path),function);
        System.out.println(f);

//        List<CalcParser.ExprContext> exprContexts = progContext.expr();
//        CalcParser.StatContext statContext = progContext.stat();
//        CalcParser.FuncContext funcContext = progContext.func();
//        CalcParser.PrintContext printContext = progContext.print();
//
//        for (CalcParser.ExprContext exprContext : exprContexts) {
//            System.out.println(exprContext.ID() + exprContext.Equals().getSymbol().getText() + (Objects.nonNull(exprContext.INT()) ? exprContext.INT():exprContext.stat().getText()));
//        }
//        System.out.println(printContext.toStringTree());
//        System.out.println(statContext.toStringTree());

    }

}
