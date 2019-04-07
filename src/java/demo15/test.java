package demo15;

public class test {
    private static void doSomething(Eatable eatable){
        eatable.eat();
    }

    public static void main(String[] args) {
        doSomething(()-> System.out.println("Lambda执行了") );

    }
}
