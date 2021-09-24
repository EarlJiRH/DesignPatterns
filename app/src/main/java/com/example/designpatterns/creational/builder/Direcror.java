package com.example.designpatterns.creational.builder;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.builder
 * 时间：2021/9/24 10:31
 * 描述：Dirextor指挥者类来统一组装过程
 * 商家的指挥者类用来规范组装电脑的流程规范，先安装主板，再安装CPU，最后安装内存并组装成电脑：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class Direcror {
    Builder mBuild;

    public Direcror(Builder build) {
        this.mBuild = build;
    }

    public Computer createComputer(String cpu, String mainBoard, String ram) {
        //规范建造流程
        this.mBuild.buildMainBoard(mainBoard);
        this.mBuild.buildCpu(cpu);
        this.mBuild.buildRam(ram);
        return mBuild.create();
    }

    @Override
    public String toString() {
        return "Direcror{" +
                "mBuild=" + mBuild +" , "+
                "cpu=" + mBuild.create().getCpu() +" , "+
                "mainBoard=" + mBuild.create().getMainBoard() +" , "+
                "ram=" + mBuild.create().getRam() +
                '}';
    }
}
