package 工厂设计模式.抽象工厂设计模式;

public class VivoFactory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu825();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Scrren6();
    }

}
