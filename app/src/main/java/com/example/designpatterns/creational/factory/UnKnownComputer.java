package com.example.designpatterns.creational.factory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factory
 * 时间：2021/9/24 10:56
 * 描述：不知名品牌电脑(产品类)
 * 各个品牌的电脑，他们都继承了他们的父类Computer ，并实现了父类的start方法
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class UnKnownComputer extends Computer {
    @Override
    public void start() {
        System.out.println("不知名品牌电脑启动");
    }
}
