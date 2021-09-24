package com.example.designpatterns.creational.builder;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.builder
 * 时间：2021/9/24 10:25
 * 描述：电脑类 电脑被抽象为Computer类，它有三个部件:CPU 、主板和内存。并在里面提供了三个方法分别用来设置CPU 、主板和内存：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class Computer {

    private String mCpu;
    private String mMainBoard;
    private String mRam;

    public void setCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setMainBoard(String mMainBoard) {
        this.mMainBoard = mMainBoard;
    }

    public void setRam(String mRam) {
        this.mRam = mRam;
    }

    public String getCpu() {
        return mCpu;
    }

    public String getMainBoard() {
        return mMainBoard;
    }

    public String getRam() {
        return mRam;
    }
}
