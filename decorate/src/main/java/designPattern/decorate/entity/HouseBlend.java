package designPattern.decorate.entity;

/**
 * Created by ht002 on 2016/5/24.
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
