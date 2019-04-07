package 代理设计模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class C implements InvocationHandler {
    Object obj;

    public Object blind(Object obj) {
        this.obj = obj;
        // 返回代理类的对象
        //参数分别表示（被代理类的类加载器，被代理类实现的接口，实现了InvocationHandler接口类的对象）
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
                .getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }
}
