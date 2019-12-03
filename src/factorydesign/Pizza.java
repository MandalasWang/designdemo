package factorydesign;


/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:05
 * @description
 **/
public abstract class Pizza {

   public String name;
   public double price;
   public Integer count;

    void prepare(String storeName){
        System.out.println(storeName+" preparing "+name);
        }

    void cut(){
        System.out.println("cutting the pizza ");
    }

    void bake(){
        System.out.println("baking the pizza");
    }

    void box(){
        System.out.println("boxing the pizza");
        System.out.println("一共："+price);
        System.out.println("还剩："+(count-1));
    }



}
