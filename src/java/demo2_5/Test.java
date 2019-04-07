package demo2_5;

import java.util.ArrayList;
import java.util.List;

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
 * 传统方式
 */
public class Test {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        ArrayList<String> namelist1 = new ArrayList<>();
        for (String name : one) {
            if(name.length() == 3){
                namelist1.add( name );
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            list.add( namelist1.get( i ) );
        }
        System.out.println(list);

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        ArrayList<String> nameList2 = new ArrayList<>();
        for (String name:two) {
            if(name.startsWith( "张" )){
                nameList2.add( name );
            }
        }
        nameList2.remove( 0 );
        nameList2.remove( 0 );

        System.out.println(nameList2);

        //就两个队伍合并成一个队伍
        ArrayList<String> totelList = new ArrayList<>();
        totelList.addAll( list );
        totelList.addAll( nameList2 );
        System.out.println(totelList);

        //根据姓名创建对象
        for (String name:totelList) {
            Person person = new Person( name );
            System.out.println(person);
        }
    }
}
