import decoratordesign.Beverage;
import decoratordesign.condecorator.BigCup;
import decoratordesign.condecorator.Milk;
import decoratordesign.condecorator.Mocha;
import decoratordesign.condecorator.Soy;
import decoratordesign.juice.Espresso;
import decoratordesign.juice.HouseBland;
import factorydesign.FactoryBean;
import factorydesign.Pizza;
import factorydesign.PizzaStore;
import factorydesign.PizzaStyle;
import factorydesign.pizzaimpl.NyStyleCheesePizza;
import factorydesign.pizzaimpl.ZjgClamPizza;
import factorydesign.pizzastoreimpl.NyPizzaStore;
import factorydesign.pizzastoreimpl.ZjgPizzaStore;
import observedesign.impl.CurrentConditionDisplay;
import observedesign.impl.StaticDisplay;
import observedesign.impl.WeatherData;
import strategydesign.Duck;
import strategydesign.implementdemo.CanFlyDuck;
import strategydesign.implementdemo.CanQuckDuck;

/**
 * @author 有缘
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 策略模式
         */
//        Duck duck = new CanFlyDuck();
//        ((CanFlyDuck) duck).display();
//        duck.fly();
//        duck.quck();
//        Duck duck1 = new CanQuckDuck();
//        ((CanQuckDuck) duck1).display();
//        duck1.quck();
//        duck1.fly();

        /**
         * 观察者模式
         */
//        WeatherData weatherData = new WeatherData();
//        //创建观察者类并注册
//        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
//        StaticDisplay staticDisplay = new StaticDisplay(weatherData);
//        weatherData.setMessureMent(12, 23, 0);
//        weatherData.messurementChanged();
//        weatherData.removeObj(staticDisplay);
//        weatherData.messurementChanged();

        /**
         * 装饰者模式
         */
//        Beverage beverage = new Espresso();
//        System.out.println("点了一杯 "+beverage.getDescription()+"共花费了 :"+beverage.cost());
//
//        Beverage beverage1 = new HouseBland();
//        beverage1 = new Milk(beverage1);
//        beverage1 = new Mocha(beverage1);
//        beverage1 = new Soy(beverage1);
//        System.out.println("点了一杯 "+beverage1.getDescription()+"共花费了 :"+beverage1.cost());
//
//        Beverage beverage2 = new Espresso();
//        beverage2 = new Milk(beverage2);
//        beverage2 = new Mocha(beverage2);
//        System.out.println("点了一杯 "+beverage2.getDescription()+"共花费了 :"+beverage2.cost());

        /**
         * 工厂模式
         */
          PizzaStore pizzaStore = new NyPizzaStore(new FactoryBean());
          pizzaStore.orderPizza("clam1");


    }

}
