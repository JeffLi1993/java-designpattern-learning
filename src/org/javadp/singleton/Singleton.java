package org.javadp.singleton;

/**
 * 描述：推荐版 单例模式
 * Created by 子木 on 2016/2/28.
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}
    private static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
