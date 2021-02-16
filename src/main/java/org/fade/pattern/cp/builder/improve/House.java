package org.fade.pattern.cp.builder.improve;

/**
 * 建造者模式
 * 改进
 * Product-房子
 * @author fade
 * */
public class House {

    private boolean isLayFoundation;

    private boolean isBuildWall;

    private boolean isBuildRoof;

    public boolean isLayFoundation() {
        return this.isLayFoundation;
    }

    public void setLayFoundation(boolean layFoundation) {
        this.isLayFoundation = layFoundation;
    }

    public boolean isBuildWall() {
        return this.isBuildWall;
    }

    public void setBuildWall(boolean buildWall) {
        this.isBuildWall = buildWall;
    }

    public boolean isBuildRoof() {
        return this.isBuildRoof;
    }

    public void setBuildRoof(boolean buildRoof) {
        this.isBuildRoof = buildRoof;
    }

    @Override
    public String toString() {
        if(this.isLayFoundation&&this.isBuildWall&&this.isBuildRoof){
            return "房子建造完成";
        }
        else if(!(this.isLayFoundation||this.isBuildWall||this.isBuildRoof)){
            return "房子尚未开始建造";
        }
        else{
            return "房子正在建造中";
        }
    }

}
