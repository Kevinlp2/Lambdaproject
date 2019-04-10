package 工厂设计模式.工厂方法设计模式;

import 工厂设计模式.简单工厂.Apple;
import 工厂设计模式.简单工厂.Fruit;

/**
 * 苹果工厂
 */
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
