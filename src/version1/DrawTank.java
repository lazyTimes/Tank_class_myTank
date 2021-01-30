package version1;

import javax.swing.*;
import java.awt.*;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : version1.Tanks
 * @Description : 重构坦克大战 - 第一版
 * @Create on : 2021/1/29 15:55
 **/
public class DrawTank extends JPanel {

    /**
     * 创建一个坦克
     */
    MyTank mytank;

    /**
     * 初始化创建一个坦克
     */
    public DrawTank() {
        mytank = new MyTank(10, 10);

    }

    public void paint(Graphics g) {
        super.paint(g);

        //画出背景色
        g.fill3DRect(0, 0, 600, 400, false);
        paintMyTank(mytank.getX(), mytank.getY(), g, 0, "enemytank");
    }

    /**
     * 画坦克需要提取封装
     * 1.画出来之前先确定颜色，是敌人坦克还是我方坦克
     * 2.参数为坐标做，画笔（重要）,以及坦克类型和方向
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, String type) {
        //画之前先确定坦克的颜色
        switch (type) {
            case "mytank": {
                g.setColor(Color.red);
                break;
            }
            case "enemytank": {
                g.setColor(Color.cyan);
                break;
            }
        }
        //向上
        if (direct == 0) {//先画出我的坦克
            //画出左边的矩形，先设置颜色
            g.fill3DRect(x, x, 5, 30, false);

            //画出中间的长方形
            g.fill3DRect(x + 5, x + 5, 10, 20, false);

            //画出中间圆圈,使用填充椭圆
            g.fillOval(x + 6, x + 9, 7, 7);

            //画出一条直线
            g.drawLine(x + 10, x, x + 10, x + 15);

            //画出另一边矩形
            g.fill3DRect(x + 15, x, 5, 30, false);
        }

    }


}
