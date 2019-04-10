package 工厂设计模式.抽象工厂设计模式;

/**
 * 工厂接口
 */
public interface PhoneFactory {
    Cpu getCpu();//使用的cpu
    Screen getScreen();//使用的屏幕


}
