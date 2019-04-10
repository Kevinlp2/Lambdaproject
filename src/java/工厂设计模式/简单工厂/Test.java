package 工厂设计模式.简单工厂;

public class Test {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit apple = factory.createFruit( "apple" );
        apple.whatIm();
        Fruit pear = factory.createFruit( "pear" );
        pear.whatIm();
    }
}
