package decoratordesign;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/28 13:44
 * @description  饮料超类
 **/
public abstract class Beverage {

   public String description = "默认饮料" ;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
