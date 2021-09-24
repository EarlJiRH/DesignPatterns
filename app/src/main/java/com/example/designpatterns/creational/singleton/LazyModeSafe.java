package com.example.designpatterns.creational.singleton;

import java.io.ObjectStreamException;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:36
 * 描述：3.懒汉模式（线程安全）创建单例对象
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，
 * 造成不必要的同步开销，而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class LazyModeSafe {

    private static LazyModeSafe instance;

    public LazyModeSafe() {
    }

    public static synchronized LazyModeSafe getInstance() {
        if (instance == null) {
            instance = new LazyModeSafe();
        }
        return instance;
    }

    /**
     *@author Admin
     *@date 2021/9/24 9:54
     *杜绝单例对象被反序列化是重新生成对象
     */
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
