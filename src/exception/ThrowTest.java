package exception;

/*
    throw 程序终止，后续代码不执行，异常可以try catch处理和throw出去
    try catch finally try必须和finally一起使用，try有异常，try里异常后面代码不能执行，可以放在finally里执行
 */
public class ThrowTest {
    public static void main(String[] args) {
        //try catch捕获异常，throw抛出异常
        try {
            int[] arr = {1, 2, 3};
            index(arr, 3);
        } catch (IndexOutOfBoundsException e) {
            /*
            java.lang.IndexOutOfBoundsException: 索引越界异常！
                at exception.ThrowTest.index(ThrowTest.java:38)
                at exception.ThrowTest.main(ThrowTest.java:17)
             */
            // e.printStackTrace();//打印异常类，异常位置，异常信息
            // System.out.println(e.getMessage());  //索引越界异常！异常信息
            // System.out.println(e.toString()); //java.lang.ArrayIndexOutOfBoundsException: 索引越界异常！异常类和异常原因
            throw new IndexOutOfBoundsException();// try把异常抛出，catch创建一个异常对象，捕获（接收）异常，再把异常抛出去,jvm处理异常，终止程序
        }
        System.out.println("后续代码");//不会执行
    }

    //运行期异常
    public static int index(int[] arr, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException("索引越界异常");
        }
        return arr[index];
    }
}
