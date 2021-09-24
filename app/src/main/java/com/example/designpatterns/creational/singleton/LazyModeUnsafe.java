package com.example.designpatterns.creational.singleton;

import java.io.ObjectStreamException;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:36
 * 描述：2.懒汉模式（线程不安全）创建单例对象
 * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，
 * 但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。(getInstance()未加锁 多线程访问还是不能保证单例)
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class LazyModeUnsafe {

    private static LazyModeUnsafe instance;

    public LazyModeUnsafe() {
    }

    public static LazyModeUnsafe getInstance() {
        if (instance == null) {
            instance = new LazyModeUnsafe();
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
