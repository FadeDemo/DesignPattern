package org.fade.pattern.bp.interpreter;

import java.util.Map;

/**
 * 解释器模式
 * 减号表达式（非终结符表达式）
 * @author fade
 * */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left,Expression right){
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }

}
