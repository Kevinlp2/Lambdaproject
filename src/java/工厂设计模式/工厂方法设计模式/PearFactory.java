package 工厂设计模式.工厂方法设计模式;

import 工厂设计模式.简单工厂.Fruit;
import 工厂设计模式.简单工厂.Pear;

/**
 * 梨工厂
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}
