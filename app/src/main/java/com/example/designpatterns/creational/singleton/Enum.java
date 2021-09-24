package com.example.designpatterns.creational.singleton;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:51
 * 描述：6.枚举单例
 * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例，上述讲的几种单例模式实现中，
 * 有一种情况下他们会重新创建对象，那就是反序列化，将一个单例实例对象写到磁盘再读回来，从而获得了一个实例。
 * 反序列化操作提供了readResolve方法，这个方法可以让开发人员控制对象的反序列化。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public enum Enum {
    INSTANCE;


    public void doSomeThing() {
    }
}
