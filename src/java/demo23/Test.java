package demo23;

public class Test {

    private static Object doSomething1(MySupplier mySupplier){
        return  mySupplier.get();
    }

    private static MySupplier doSomething2(){
        return ()->"当返回值";
    }

    public static void main(String[] args) {

        System.out.println(doSomething1( () -> "当参数返回" ));

        System.out.println(doSomething2().get());
    }
}
