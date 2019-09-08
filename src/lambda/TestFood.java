package lambda;

import sun.font.EAttribute;

import javax.sound.midi.Soundbank;

public class TestFood {
    public static void main(String[] args) {
//        eat(new Food() {
//            @Override
//            public void eat() {
//                System.out.println("pear");
//            }
//        });
        //无参数，无返回值
        eat(() -> {
            System.out.println("pear");
        });
//        wear(3,"yellow",new Cloth() {
//            @Override
//            public String wear(int num, String color) {
//                System.out.println("yellow");
//                return "yellow";
//            }
//        });
        //有参数，有返回值
        wear(3,"yellow",(int num, String color) ->{
           String result = "yellow";
            return result;
        });
    }

    public static void eat(Food food) {
        food.eat();
    }
    public static void wear(int num, String color, Cloth cloth){
        String wear = cloth.wear(num, color);
        System.out.println(wear);
    }
}
