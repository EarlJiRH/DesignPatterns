package com.example.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational
 * 时间：2021/9/24 9:55
 * 描述：7.使用容器实现单例模式
 * 用SingletonManager 将多种的单例类统一管理，在使用时根据key获取对象对应类型的对象。
 * 这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，
 * 降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class SingletonManager {
    private static Map<String, Object> map = new HashMap<String, Object>();

    private SingletonManager() {

    }

    public static void registerService(String key, Object instance) {
        if (!map.containsKey(key)) {
            map.put(key, instance);
        }
    }


    public static Object getService(String key) {
        return map.get(key);
    }
}
