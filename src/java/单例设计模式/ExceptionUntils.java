package 单例设计模式;

/**
 * 饿汉模式
 */
public class ExceptionUntils {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static  ExceptionUntils untils =new ExceptionUntils();
    private ExceptionUntils(){}

    public static   ExceptionUntils getInstance(){
        return untils;
    }
}
