package org.fade.pattern.bp.command;

/**
 * 命令模式
 * 空命令
 * @author fade
 * */
public class NullCommand implements Command{


    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }

}
