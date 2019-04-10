package 工厂设计模式.抽象工厂设计模式;

public class Test {
    public static void main(String[] args) {
        String str="sdasd";
        VivoFactory factory = new VivoFactory();
        factory.getCpu().run();
        factory.getScreen().size();
    }
}
