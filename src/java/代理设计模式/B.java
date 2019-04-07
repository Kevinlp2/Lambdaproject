package 代理设计模式;

public class B implements A {
    @Override
    public void action() {
        System.out.println("被代理对象");
    }
}
