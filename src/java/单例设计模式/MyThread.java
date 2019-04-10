package 单例设计模式;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            ExceptionUntils instance = ExceptionUntils.getInstance();
            Singleton instance1 = Singleton.getInstance();

            System.out.println(Thread.currentThread().getName()+":"+instance);
//            System.out.println(Thread.currentThread().getName()+instance1);
        }

    }
}
