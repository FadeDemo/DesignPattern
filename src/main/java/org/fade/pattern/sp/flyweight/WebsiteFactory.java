package org.fade.pattern.sp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * 网站工厂类
 * @author fade
 * */
public class WebsiteFactory {

    private Map<String,Website> pool = new HashMap<>();

    public Website getWebsite(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }

}
