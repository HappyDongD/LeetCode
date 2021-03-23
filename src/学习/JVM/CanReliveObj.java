package 学习.JVM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhang dong
 * @Description 测试finalize（）方法，让对象进行复活
 * @date 2021/2/28-11:29
 */
public class CanReliveObj {
    public static CanReliveObj canReliveObj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行了一次finalize");
        canReliveObj = this;
    }

    public static void main(String[] args) {


        try {
            canReliveObj = new CanReliveObj();
            canReliveObj = null;
            System.gc();
            System.out.println("第一次执行gc");
            Thread.sleep(2000);
            if (canReliveObj==null){
                System.out.println("对象死亡");
            }else{
                System.out.println("对象存活");
            }
            canReliveObj = null;
            System.gc();
            System.out.println("第二次执行gc");
            Thread.sleep(2000);
            if (canReliveObj==null){
                System.out.println("对象死亡");
            }else{
                System.out.println("对象存活");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
