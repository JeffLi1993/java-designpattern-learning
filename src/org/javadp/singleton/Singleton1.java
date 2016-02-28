package org.javadp.singleton;

/**
 * 描述：内存泄露版 单例模式
 * Created by 子木 on 2016/2/28.
 */
public class Singleton1 {
    private Singleton1 (){}

    private static Singleton1 singleton = null;

    public static Singleton1 getInstance() {
        if (singleton == null)
            singleton = new Singleton1();
        return singleton;
    }
}
