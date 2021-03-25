package org.fade.pattern.bp.interpreter;

import java.util.Map;

/**
 * 解释器模式
 * 加号表达式（非终结符表达式）
 * @author fade
 * */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left,Expression right){
        super(left,right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
