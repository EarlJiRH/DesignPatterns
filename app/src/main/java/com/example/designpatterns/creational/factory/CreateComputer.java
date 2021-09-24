package com.example.designpatterns.creational.factory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factory
 * 时间：2021/9/24 11:06
 * 描述：客户端创建电脑
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class CreateComputer {

    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
    }
}
