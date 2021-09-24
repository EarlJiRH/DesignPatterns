package com.example.designpatterns.creational.factorymethod;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factorymethod
 * 时间：2021/9/24 11:42
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class Client {

    public static void main(String[] args) {
        ComputerFactory computerFactor = new GDComputerFactory();

        LenovoComputer lenovoComputer = computerFactor.createComputer(LenovoComputer.class);
        lenovoComputer.start();

        HpComputer hpComputer = computerFactor.createComputer(HpComputer.class);
        hpComputer.start();

        AsusComputer asusComputer = computerFactor.createComputer(AsusComputer.class);
        asusComputer.start();

        UnKnownComputer unKnownComputer = computerFactor.createComputer(UnKnownComputer.class);
        unKnownComputer.start();
    }
}
