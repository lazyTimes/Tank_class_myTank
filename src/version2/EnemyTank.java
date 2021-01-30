package version2;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : 重构坦克 - 第二版  敌人坦克
 * @Create on : 2021/1/29 16:49
 **/
public class EnemyTank extends FatherTank {
    /**
     * 初始化传递敌人的位置
     *
     * @param x 坐标轴 x
     * @param y 坐标轴 y
     */
    public EnemyTank(int x, int y) {
        super(x, y);
        super.setColor(1);
    }
}
