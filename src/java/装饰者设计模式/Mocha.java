package 装饰者设计模式;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    double myCost = 20;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return myCost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }
}
