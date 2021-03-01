package org.fade.pattern.bp.command;

/**
 * 命令模式
 * 关灯命令
 * @author fade
 * */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }

}
