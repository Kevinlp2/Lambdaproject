package 工厂设计模式;

public class FactoryMethod {
    private static Factory factoryA,factoryB;
    private static Product productA,productB;
    public static void main(String[] args) {
              factoryA = new FactoryA();
              factoryB = new FactoryB();
              productA = factoryA.create();
              productB = factoryB.create();
              productA.getName();
              productB.getName();
          }
}
