package 工厂设计模式.抽象工厂设计模式;

/**
 * cpu接口和实现类
 */
public interface Cpu {
    void run();

    class Cpu650 implements Cpu{

        @Override
        public void run() {
            System.out.println("Cpu650");
        }
    }

    class Cpu825 implements Cpu{

        @Override
        public void run() {
            System.out.println("Cpu825");
        }
    }
}
