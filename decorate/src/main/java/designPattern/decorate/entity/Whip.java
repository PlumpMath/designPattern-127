package designPattern.decorate.entity;

/**
 * Created by ht002 on 2016/5/24.
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.31;
    }
}
