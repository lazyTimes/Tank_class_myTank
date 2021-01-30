package version1;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : version1.Tanks
 * @Description : 重构坦克大战 - 第一版
 * @Create on : 2021/1/29 15:57
 **/
public class FatherTank {

    /**
     * 定义的坦克的横坐标与纵坐标
     */
    private int x;
    /**
     * 坦克的纵坐标
     */
    private int y;

    public FatherTank(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
