package com.example.designpatterns.creational.factorymethod;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factorymethod
 * 时间：2021/9/24 11:39
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}
