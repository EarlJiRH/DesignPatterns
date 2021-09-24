package com.example.designpatterns.creational.singleton;

import java.io.ObjectStreamException;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:31
 * 描述：1.饿汉模式创建单例对象
 * 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快。
 * 这种方式基于类加载机制避免了多线程的同步问题，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化instance显然没有达到懒加载的效果。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */

public class HungryMode {
    private static HungryMode instance = new HungryMode();

    public HungryMode() {
    }

    public static HungryMode getInstance() {
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
