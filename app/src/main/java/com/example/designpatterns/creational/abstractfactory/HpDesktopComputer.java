package com.example.designpatterns.creational.abstractfactory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.abstractfactory
 * 时间：2021/9/24 14:04
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class HpDesktopComputer extends DesktopComputer {

    @Override
    public void start() {
        System.out.println("惠普台式电脑启动");
    }
}
