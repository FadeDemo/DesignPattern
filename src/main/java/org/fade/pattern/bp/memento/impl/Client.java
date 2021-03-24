package org.fade.pattern.bp.memento.impl;

/**
 * 备忘录模式
 * 实现
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        GameRole Mike = new GameRole(5,5);
        System.out.print("Mike的初始状态为：");
        Mike.displayState();
        System.out.println("-----------即将开始太平洋标准银行差事-----------");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(Mike.saveState());
        System.out.println("游戏已保存");
        System.out.println("-----------太平洋标准银行差事开始-----------");
        System.out.println("角色全部属性各提升1点");
        Mike.setVit(Mike.getVit()+1);
        Mike.setDef(Mike.getDef()+1);
        System.out.print("Mike的状态现在是：");
        Mike.displayState();
        System.out.println("-----------任务失败-----------");
        Mike.recoverState(caretaker.getMemento());
        System.out.print("Mike的状态将恢复为：");
        Mike.displayState();
    }

}
