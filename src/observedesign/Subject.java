package observedesign;

/**
 * @author 有缘
 * @version 1.0
 * @date 2019/11/27 10:52
 * @description  主题
 **/
public interface Subject {
     /**
      * 注册观察者
      * @param obj
      */
     void register(Observe obj);

     /**
      * 观察者注销
      * @param obj
      */
     void removeObj(Observe obj);

     /**
      * 展示所有观察者方法
      */
     void notifyObserve();
}
