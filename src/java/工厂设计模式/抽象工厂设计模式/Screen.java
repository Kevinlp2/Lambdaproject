package 工厂设计模式.抽象工厂设计模式;

/**
 * 屏幕接口和实现类
 */
public interface Screen {
    void size();

    class Scrren5 implements Screen{

        @Override
        public void size() {
            System.out.println("5寸");
        }
    }

    class Scrren6 implements Screen{

        @Override
        public void size() {
            System.out.println("6寸");
        }
    }
}
