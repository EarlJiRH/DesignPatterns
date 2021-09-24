package com.example.designpatterns.creational.prototype;

import androidx.annotation.NonNull;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.prototype
 * 时间：2021/9/24 14:24
 * 描述：原型模式的名片类
 * BusinessCard类实现了Cloneable接口，它是一个标识接口，表示这个对象是可拷贝的，
 * 只要重写clone方法就可以实现拷贝。如果实现了Cloneable接口却没有重写clone方法就会报错。
 * 需要注意的是，clone方法不是在Cloneable接口中定义的（Cloneable接口中没有定义任何方法），
 * 而是在Object中定义的。
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class BusinessCard implements Cloneable {

    private String name;
    private String company;

    public BusinessCard() {
        System.out.println("执行构造函数BusinessCard");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @NonNull
    @Override
    protected BusinessCard clone() {
        BusinessCard businessCard = null;
        try {
            businessCard = (BusinessCard) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return businessCard;
    }


    public void show() {
        System.out.println("name: " + name);
        System.out.println("company: " + company);
    }
}
