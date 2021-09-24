package com.example.designpatterns.creational.singleton;

import java.io.ObjectStreamException;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:40
 * 描述：4.双重检查模式 （DCL）
 * 这种写法在getInstance()方法中对instance进行了两次判空，第一次是为了不必要的同步，
 * 第二次是在instance等于null的情况下才创建实例。
 * DCL优点是资源利用率高，第一次执行getInstance()时单例对象才被实例化，效率高。
 * 缺点是第一次加载时反应稍慢一些，在高并发环境下也有一定的缺陷，虽然发生的概率很小。
 * DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，
 * 也就是DCL失效，在《java并发编程实践》一书建议用静态内部类单例模式来替代DCL。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class LazyMode {

    /**
     * @author Admin
     * @date 2021/9/24 9:43
     * volatile 保证变量的原子性
     */
    private static volatile LazyMode instance;

    public LazyMode() {
    }

    public static LazyMode getInstance() {
        if (instance == null) {
            //方法内加锁 锁住当前类 避免方法加锁导致同步判断问题耗时
            synchronized (LazyMode.class) {
                if (instance == null) {
                    instance = new LazyMode();
                }
            }
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
