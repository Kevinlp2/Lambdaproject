package demo1_4;

import java.util.function.Function;

/**
 * 请使用	进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 * 1.将字符串截取数字年龄部分，得到字符串；
 * 2.将上一步的字符串转换成为int类型的数字；
 * 3.将上一步的int数字累加100，得到结果int数字。
 */
public class Test {
    private static void method(Function<String, String> one, Function<String, Integer> two,Function<Integer, Integer> three) {
        int num = one.andThen(two).andThen( three ).apply("zs,18");
        System.out.println(num );
    }

    public static void main(String[] args) {
        method(  s -> s.split( "," )[1],Integer::parseInt, i -> i += 100);
    }
}
