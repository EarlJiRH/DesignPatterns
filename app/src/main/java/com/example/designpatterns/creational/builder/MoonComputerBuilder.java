package com.example.designpatterns.creational.builder;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.builder
 * 时间：2021/9/24 10:29
 * 描述：MoonComputerBuilder类用于组装电脑
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class MoonComputerBuilder extends Builder {

    private Computer mComputer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        mComputer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        mComputer.setMainBoard(mainBoard);
    }

    @Override
    public void buildRam(String ram) {
        mComputer.setRam(ram);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
