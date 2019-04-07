package 装饰者设计模式;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    double myCost = 20;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return myCost + beverage.cost();
    }

}
