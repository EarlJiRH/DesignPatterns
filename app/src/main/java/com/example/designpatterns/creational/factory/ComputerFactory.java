package com.example.designpatterns.creational.factory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factory
 * 时间：2021/9/24 11:03
 * 描述：电脑工厂类
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class ComputerFactory {
    public static Computer createComputer(String type) {
        Computer mComputer;
        switch (type) {
            case "lenovo":
                mComputer = new LenovoComputer();
                break;
            case "hp":
                mComputer = new HpComputer();
                break;
            case "asus":
                mComputer = new AsusComputer();
                break;
            default:
                mComputer = new UnKnownComputer();
                break;
        }
        return mComputer;
    }
}
