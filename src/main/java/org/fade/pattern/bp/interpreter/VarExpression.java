package org.fade.pattern.bp.interpreter;

import java.util.Map;

/**
 * 解释器模式
 * 变量表达式（终结符表达式）
 * @author fade
 * */
public class VarExpression extends Expression {

    private String key;

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }

    public VarExpression(String key){
        this.key = key;
    }

}
