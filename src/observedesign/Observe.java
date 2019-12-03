package observedesign;

/**
 * @author 有缘
 * @version 1.0
 * @date 2019/11/27 10:53
 * @description 观察者
 **/
public interface Observe  {
     /**
      * 观察者共有方法
      * @param temp
      * @param humidity
      * @param pressure
      */
     void update(float temp,float humidity,float pressure);
}
