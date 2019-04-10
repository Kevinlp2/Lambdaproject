package 单例设计模式;

/**
 * 懒汉式
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    //使用的同步锁，降低了效率，但是在多线程可以防止创建多个实例
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
