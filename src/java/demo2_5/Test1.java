package demo2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 现在有两个
 * 下若干操作步骤：
 *
 * 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以
 *
 * 1.第一个队伍只要名字为3个字的成员姓名；
 * 2.第一个队伍筛选之后只要前3个人；
 * 3.第二个队伍只要姓张的成员姓名；
 * 4.第二个队伍筛选之后不要前2个人；
 * 5.将两个队伍合并为一个队伍；
 * 6.根据姓名创建	对象；
 * 7.打印整个队伍的Person对象信息。
 *
 *
 * Stream方式
 */
public class Test1 {

    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        Stream<String> nameList1 = one.stream().filter( s -> s.length() == 3 ).limit( 3 );
        Stream<String> nameList2 = two.stream().filter( s -> s.startsWith( "张" ) ).skip( 2 );
        Stream<String> totelList = Stream.concat( nameList1, nameList2 );
        totelList.forEach( s -> System.out.println( new Person( s ) ) );

    }
}
