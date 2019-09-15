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

//        name("xiaoming", new People() {
//            @Override
//            public String name(String name) {
//                return name;
//            }
//        });
        //未省略lambda
        name("xiaoming",(String name) ->{
            return name;
        });
        //省略lambda
        /**
         * 1、小括号里参数类型可以省略
         * 2、如果只有一个参数，小括号可以省略
         * 3、如果大括号内有且只有一个语句，大括号可以省略，分号可以省略，若是返回语句，return可以省略
         */

        name("xiaoming",name -> name);
    }

    public static void eat(Food food) {
        food.eat();
    }
    public static void wear(int num, String color, Cloth cloth){
        String wear = cloth.wear(num, color);
        System.out.println(wear);
    }
    public static String name(String name,People people){
        String s = people.name(name);
        System.out.println(s);
        return s;
    }
}
