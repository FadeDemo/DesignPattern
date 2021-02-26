package org.fade.pattern.sp.flyweight;

/**
 * 享元模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website news1 = factory.getWebsite("News");
        news1.use("Jack");
        Website blog = factory.getWebsite("Blog");
        blog.use("Tom");
        Website wpa = factory.getWebsite("Wechat Public Account");
        wpa.use("Mike");
        Website news2 = factory.getWebsite("News");
        news2.use("Franklin");
        System.out.println("网站的种类一共有："+factory.getWebsiteCount());
    }

}
