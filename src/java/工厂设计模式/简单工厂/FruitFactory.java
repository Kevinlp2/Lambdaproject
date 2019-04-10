package 工厂设计模式.简单工厂;

/**
 * 水果工厂
 */
public class FruitFactory {
    public Fruit createFruit(String type){
        if(type.equals( "apple" )){
            return new Apple();
        }else if(type.equals( "pear" )){
            return new Pear();
        }
        return null;
    }
}
