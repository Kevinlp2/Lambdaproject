package 工厂设计模式;

public class FactoryB implements Factory {
    @Override
    public Product create() {
        return  new ProductB();
    }
}
