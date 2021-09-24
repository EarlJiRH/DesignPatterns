package com.example.designpatterns.creational.builder;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.builder
 * 时间：2021/9/24 10:27
 * 描述：Builder类规范产品的组建
 * 商家组装电脑有一套组装方法的模版，就是一个抽象的Builder类,
 * 里面提供了安装CPU、主板和内存的方法，以及组装成电脑的create方法：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildRam(String ram);
    public abstract Computer create();
}
