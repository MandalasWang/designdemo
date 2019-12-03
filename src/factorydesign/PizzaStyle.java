package factorydesign;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/12/2 10:18
 * @description
 **/
public enum  PizzaStyle {
    /**
     * 纽约芝士风味pizza
     */
    NY_STYLE_CHEESE_PIZZA("cheese1"),
    /**
     * clam风味
     */
    NY_STYLE_CLAM_PIZZA("clam1"),
    /**
     * 芝加哥芝士风味pizza
     */
    ZJG_STYLE_CHEESE_PIZZA("cheese2"),
    /**
     * 芝加哥clam风味
     */
    ZJG_STYLE_CLAM_PIZZA("clam2"),
    ;

    private String name;

    PizzaStyle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
