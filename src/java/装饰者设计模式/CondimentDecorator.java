package 装饰者设计模式;

public abstract class CondimentDecorator extends Beverage {

    // 调料材料子类必须实现的抽象方法
    public abstract String getDescription();

}
