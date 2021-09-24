package com.example.designpatterns.creational.abstractfactory;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.abstractfactory
 * 时间：2021/9/24 14:16
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class LenovoFactory extends ComputerFactory {
    @Override
    public DesktopComputer createDesktopComputer() {
        return new LenovoDesktopComputer();
    }

    @Override
    public NotebookComputer createNotebookComputer() {
        return new LenovoNotebookComputer();
    }
}
