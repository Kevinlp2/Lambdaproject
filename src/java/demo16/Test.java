package demo16;

public class Test {
    private static int doSuming(Sumable sumable){
        return  sumable.sum( 4,5 );
    }
    public static void main(String[] args) {
        Sumable sumable = (a,b) -> a+b;
        System.out.println(doSuming(sumable));

    }
}
