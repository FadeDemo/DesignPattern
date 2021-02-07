package org.fade.uml.aggregation;

/**
 * 聚合关系
 * @author fade
 * */
public class Computer {

    private Mouse mouse;

    private Monitor monitor;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
