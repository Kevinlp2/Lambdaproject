package demo44;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    private static void consumeString(Consumer<String> one, Consumer<String> two,String arr) {
        one.andThen(two).accept(arr);
    }

    private static boolean method(Predicate<String> one,Predicate<String> two,String arr){
        boolean test = one.and( two ).test( arr );

        return test;
    }
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        for (int i = 0; i <array.length ; i++) {
            consumeString( s -> System.out.print("姓名:"+s.split( "," )[0]),s -> System.out.println("。性别:"+s.split( "," )[1]), array[i]);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            boolean b = method( s -> s.split( "," )[0].length() == 4, s -> s.split( "," )[1].equals( "女" ), array[i] );
            if(b){
                arrayList.add( array[i] );
            }
        }
        System.out.println(arrayList);
    }
}
