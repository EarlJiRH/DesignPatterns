package com.example.designpatterns.creational.factorymethod;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factorymethod
 * 时间：2021/9/24 11:35
 * 描述：创建一个电脑的抽象产品类，它有一个抽象方法用于启动电脑
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public abstract class Computer {

    /**
     * 产品的抽象方法，由具体的产品类去实现
     */
    public abstract void start();
}
