package org.fade.pattern.bp.interpreter;

import java.util.Map;

/**
 * 解释器模式
 * 符号表达式（非终结符表达式）
 * @author fade
 * */
public class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }

}
