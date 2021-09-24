package com.example.designpatterns.creational.abstractfactory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.abstractfactory
 * 时间：2021/9/24 14:17
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
        ComputerFactory lenocoFactory = new LenovoFactory();
        lenocoFactory.createDesktopComputer().start();
        lenocoFactory.createNotebookComputer().start();

        ComputerFactory hpFactory = new HpFactory();
        hpFactory.createDesktopComputer().start();
        hpFactory.createNotebookComputer().start();
    }
}
