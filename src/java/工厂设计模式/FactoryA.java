package 工厂设计模式;

public class FactoryA implements Factory {
    @Override
    public Product create() {
        return  new ProductA();
    }
}
