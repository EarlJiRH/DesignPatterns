package com.example.designpatterns.creational.factorymethod;

/**
 * ================================================
 * 类名：com.example.designpatterns.creational.factorymethod
 * 时间：2021/9/24 11:40
 * 描述：广达代工厂
 * 修改人：
 * 修改时间：
 * 修改备注：
 * ================================================
 *
 * @author Admin
 */
public class GDComputerFactory extends ComputerFactory {

    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String classname = clz.getName();

        try {
            //通过反射来生产不同厂家的电脑
            computer = (Computer) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
