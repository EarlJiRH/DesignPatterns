package com.example.designpatterns.creational.builder;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.builder
 * 时间：2021/9/24 10:34
 * 描述：商家用指挥者类组装电脑。我们只需要提供我们想要的CPU，主板和内存就可以了，至于商家怎样组装的电脑我们无需知道。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class CreateComputer {

    public static void main(String[] args) {
        Builder mBuilder=new MoonComputerBuilder();
        Direcror mDirecror=new Direcror(mBuilder);
        //组装电脑
        mDirecror.createComputer("i7-6700","华擎玩家至尊","三星DDR4");
        System.out.println(mDirecror.toString());
    }
}
