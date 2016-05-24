package designPattern;

import designPattern.decorate.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Beverage beverage=new Espresso();
        System.out.printf("%s $%.2f\n",beverage.getDescription(),beverage.cost());

        Beverage beverage2=new HouseBlend();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.printf("%s $%.2f\n",beverage2.getDescription(),beverage2.cost());
    }
}
