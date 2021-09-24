package com.example.designpatterns.creational.prototype;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.prototype
 * 时间：2021/9/24 14:34
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class Client {

    public static void main(String[] args) {
        BusinessCard businessCard = new BusinessCard();
        businessCard.setName("钱三");
        businessCard.setCompany("阿里");

        //拷贝名片
        BusinessCard cloneCard1 = businessCard.clone();
        cloneCard1.setName("赵四");
        cloneCard1.setCompany("百度");

        BusinessCard cloneCard2 = businessCard.clone();
        cloneCard2.setName("孙五");
        cloneCard2.setCompany("腾讯");

        businessCard.show();
        cloneCard1.show();
        cloneCard2.show();
    }
}
