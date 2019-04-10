package 工厂设计模式.工厂方法设计模式;

import 工厂设计模式.简单工厂.Fruit;

public class Test {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        PearFactory pearFactory = new PearFactory();
        Fruit apple = appleFactory.createFruit();
        Fruit pear = pearFactory.createFruit();
        apple.whatIm();
        pear.whatIm();

    }
}
