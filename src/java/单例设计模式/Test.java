package 单例设计模式;

public class Test {
    public static void main(String[] args) {
//        ExceptionUntils untils1 = ExceptionUntils.getInstance();
//        untils1.setName( "张三" );
//        ExceptionUntils untils2 = ExceptionUntils.getInstance();
//        System.out.println(untils2.getName());
//        untils2.setName( "李四" );
//
//        ExceptionUntils untils3 = ExceptionUntils.getInstance();
//        System.out.println(untils3.getName());

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread thread1 = new Thread(myThread1,"线程一");
        Thread thread2 = new Thread(myThread2,"线程二");

        thread1.start();
        thread2.start();


    }
}
