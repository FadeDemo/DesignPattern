package org.fade.pattern.bp.interpreter;

import java.util.Map;

/**
 * 解释器模式
 * 抽象表达式
 * @author fade
 * */
public abstract class Expression {

    public abstract int interpreter(Map<String,Integer> var);

}
