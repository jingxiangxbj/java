package exception;
/*
    1、自定义异常要继承Exception(编译期异常）或RuntimeException(运行期异常)
    2、要写有参数和无参数构造方法
 */
public class BasicException extends RuntimeException {
    public BasicException(){
        super();
    }
    //模仿NullException写
    public BasicException(String message){
        super(message);
    }
}
