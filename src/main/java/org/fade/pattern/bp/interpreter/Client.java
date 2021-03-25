package org.fade.pattern.bp.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String,Integer> var = getVar(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为："+expStr+" = "+calculator.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String,Integer> getVar(String expStr){
        Map<String,Integer> var = new HashMap<>();
        for (char ch:expStr.toCharArray()){
            if (ch!='+'&&ch!='-'){
                var.put(ch+"",Integer.valueOf(ch+""));
            }
        }
        return var;
    }

}
