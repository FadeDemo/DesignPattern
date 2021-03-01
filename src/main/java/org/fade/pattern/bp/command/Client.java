package org.fade.pattern.bp.command;

/**
 * 命令模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteController remoteController = new RemoteController();
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);
        System.out.println("----------按下遥控器上打开灯的开关----------");
        remoteController.onOpenButtonPushed(0);
        System.out.println("----------按下遥控器上关闭灯的开关----------");
        remoteController.onCloseButtonPushed(0);
        System.out.println("----------按下遥控器上的撤销开关----------");
        remoteController.onUndoButtonPushed();
    }

}
