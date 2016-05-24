package designPattern.decorate.entity;

/**
 * Created by ht002 on 2016/5/24.
 */
public class Espresso  extends Beverage{

    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
