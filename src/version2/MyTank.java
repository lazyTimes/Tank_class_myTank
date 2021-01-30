package version2;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : 重构坦克 - 第二版
 * @Create on : 2021/1/29 16:48
 **/
public class MyTank extends FatherTank {

    /**
     * 初始化构建我方坦克位置
     *
     * @param x 坐标轴x
     * @param y 坐标轴Y
     */
    public MyTank(int x, int y) {
        super(x, y);
        //坦克具有上下左右移动的方法
        super.setColor(1);
    }

}
