package 代理设计模式;

public class D {
    public static void main(String[] args) {
        //1.创建一个被代理类的对象
        B rs = new B();
        //2.创建一个实现了InvocationHandler实现类的对象
        C handler = new C();
        //3.调用blind方法，返回一个同样实现了rs所在类实现的接口Subject的代理类的对象
        Object obj = handler.blind(rs);
        A sub = (A)obj;
        //转到对实现了InvocationHandler接口的实现类的invoke方法的调用
        sub.action();

    }

}
