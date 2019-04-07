package demo36;

public class Test {
    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(WorkHelper inter) {
        inter.help("E://text.txt"); // 调用自定义的函数式接口方法
    }


    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        doSomething(assistant::dealFile);
    }
}
