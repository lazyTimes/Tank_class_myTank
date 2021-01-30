package version5;

import javax.swing.*;
import java.awt.*;

//开始的界面
/*
 * 		实现闪烁功能
 * 		使用一个多线程控制时间推移
 * 		每间隔几秒就进行一次闪烁效果
 *
 * */
/**
 * 实现闪烁功能
 * 重构坦克 - 第五版
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */
class SelectIsSallup extends JPanel implements Runnable {
	/**
	 * 时间属性
	 */
	int times = 0;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 600, 400);
        if (times % 2 == 0) {
            //画出文字
            Font font1 = new Font("华文新魏", Font.BOLD, 20);
            //设置字体的颜色
            g.setColor(Color.yellow);
            g.setFont(font1);
            g.drawString("stage 1", 200, 150);
        }

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if (times > 500)
                times = 0;
            times++;
            this.repaint();

        }
    }
}
