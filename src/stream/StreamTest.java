package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * filter 过滤
 * count 统计个数
 * foreach 遍历
 * map 把集合中一个流映射到另一个流中
 * limit 取前几个
 * skip 跳过前几个
 * concat 两个流合并为一个流
 */
public class StreamTest {
    public static void main(String[] args) {
        //方法1：Stream.of(T...T)转换为stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        //过滤1
        Stream<Integer> integerStream1 = integerStream.filter(integer -> integer!=1);
        //遍历输出
        integerStream1.forEach(System.out::println);//2，3，4，5
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //integerStream1.count();
        List<String> list = Arrays.asList("1", "2", "3");
        //方法2：default Stream<E> stream() 转换为stream
        //先把集合转换为流，再过滤"1"，再把流中字符串元素转换(映射)为Integer类型整数，遍历输出
        list.stream().filter(s -> !s.equals("1")).map(s -> Integer.parseInt(s)).forEach(System.out::println);//2 3
        List<String> strings = Arrays.asList("7", "8", "9");
        strings.stream().limit(2).forEach(System.out::println);//7 8
        List<String> list1 = Arrays.asList("11", "22", "33");
        list1.stream().skip(1).forEach(System.out::println);//22 33
        Stream<Integer> stream = Arrays.asList(1, 2, 3).stream();
        Stream<Integer> stream1 = Arrays.asList(4, 5, 6).stream();
        Stream<Integer> concat = Stream.concat(stream, stream1);
        concat.forEach(System.out::println);//1 2 3 4 5 6

    }
}
