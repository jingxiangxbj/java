package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//try catch 后续代码执行  catch里可以记录日志，打印异常信息，throw异常
public class CatchException {
    public static void main(String[] args) {
//      try catch处理异常
        try {
            parse();
            //System.out.println("result");//不会执行
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放资源");//一定执行
        }
        //System.out.println("后续代码"); //会执行
    }

    //编译期异常
    private static void parse() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2019-1010");
        System.out.println(parse);
    }
}
