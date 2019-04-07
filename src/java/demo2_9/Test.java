package demo2_9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        Stream<int[]> stream = Stream.of( array );
        List<int[]> collect = stream.collect( Collectors.toList() );
        System.out.println(collect);
    }
}
