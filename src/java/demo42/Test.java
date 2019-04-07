package demo42;

import java.util.function.Supplier;

public class Test {
    private static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    private static int  getmaxintarr(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4};
        System.out.println(getMax( ()->getmaxintarr( arr ) ));
    }
}
