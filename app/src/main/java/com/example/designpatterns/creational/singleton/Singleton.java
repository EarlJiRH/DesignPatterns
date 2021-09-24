package com.example.designpatterns.creational.singleton;

import java.io.ObjectStreamException;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:47
 * 描述：5.静态内部类单例模式
 * 第一次加载Singleton类时并不会初始化instance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder
 * 并初始化instance，这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class Singleton {

    public Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     *@author Admin
     *@date 2021/9/24 9:54
     *杜绝单例对象被反序列化是重新生成对象
     */
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.INSTANCE;
    }
}
