package 工厂设计模式.工厂方法设计模式;

import 工厂设计模式.简单工厂.Fruit;

/**
 * 工厂接口
 */
public interface FruitFactory {
    Fruit createFruit();
}
