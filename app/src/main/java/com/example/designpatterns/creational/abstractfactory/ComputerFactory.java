package com.example.designpatterns.creational.abstractfactory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.abstractfactory
 * 时间：2021/9/24 14:09
 * 描述：两个方法分别用来生产台式电脑和笔记本电脑
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public abstract class ComputerFactory {
    public abstract DesktopComputer createDesktopComputer();

    public abstract NotebookComputer createNotebookComputer();
}
