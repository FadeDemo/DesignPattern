package org.fade.pattern.bp.command;

/**
 * 命令模式
 * 遥控器
 * @author fade
 * */
public class RemoteController {

    private Command[] onCommands;

    private Command[] offCommands;

    private Command undoCommand;

    public RemoteController(){
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0;i<5;i++){
            this.onCommands[i] = new NullCommand();
            this.offCommands[i] = new NullCommand();
        }
    }

    public void setCommands(int no,Command onCommand,Command offCommand){
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    public void onOpenButtonPushed(int no){
        this.onCommands[no].execute();
        this.undoCommand = this.onCommands[no];
    }

    public void onCloseButtonPushed(int no){
        this.offCommands[no].execute();
        this.undoCommand = this.offCommands[no];
    }

    public void onUndoButtonPushed(){
        this.undoCommand.undo();
    }

}
