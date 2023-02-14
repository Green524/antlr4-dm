package org.example.run;

import java.util.Map;

public class Function {

    private String funcName;
    private String args;

    private String funcBody;

    private String funcReturn;


    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public String getFuncReturn() {
        return funcReturn;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getFuncBody() {
        return funcBody;
    }

    public void setFuncBody(String funcBody) {
        this.funcBody = funcBody;
    }

    public void setFuncReturn(String funcReturn) {
        this.funcReturn = funcReturn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Function{");
        sb.append("funcName='").append(funcName).append('\'');
        sb.append(", args=").append(args);
        sb.append(", funcBody='").append(funcBody).append('\'');
        sb.append(", funcReturn=").append(funcReturn);
        sb.append('}');
        return sb.toString();
    }
}
