package org.fade.pattern.bp.command;

/**
 * 命令模式
 * Command接口
 * @author fade
 * */
public interface Command {

    void execute();

    void undo();

}
