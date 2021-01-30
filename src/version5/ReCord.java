package version5;

/*
 * 		此类为画笔类，需要画出子弹的前端操作
 * 		重要方法：
 * 			敌人坦克被击中之后消失
 *
 * 			炸弹不属于任何一个对象，而且需要三张图片成一个对象封装
 *
 * 			可以使用一个生命系统，当炸弹的生命到达一定程度就要改变图片
 * 			三张图片的切换实现
 *
 * 			让敌人发射多个子弹
 * 			实现方法
 *
 * */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * 建立一个记录类，专门用于记录
 * 重构坦克 - 第六版
 */
public class ReCord {
    //消灭敌人的记录
    private static int AllSum;

    //获取所有的击杀人数
    public static int getAllSum() {
        BufferedReader bufread = null;
        try {
            bufread = new BufferedReader(new FileReader("data\\haha.txt"));
        } catch (FileNotFoundException e1) {

            e1.printStackTrace();
        }

        try {
            AllSum = Integer.parseInt(bufread.readLine());
        } catch (NumberFormatException | IOException e) {

            e.printStackTrace();
        } finally {
            //关闭流
            if (bufread != null)
                try {
                    bufread.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
        }
        return AllSum;

    }

    public static void setAllSum(int allSum) {

        AllSum = allSum;
    }


}



