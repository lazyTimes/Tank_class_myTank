package tankmove;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : tankmove
 * @Description : 画布
 * @Create on : 2021/1/29 18:07
 **/ //界面
class AwtDemo extends JFrame {
    /**
     * 原点
     */
    DrawDian dian;
    /**
     * 存储点的X与Y轴
     */
    int dian_x;
    /**
     * 存储点的X与Y轴
     */
    int dian_y;

    AwtDemo() {
        dian = new DrawDian();
        dian_x = dian.getX();
        dian_y = dian.getY();
        add();
    }

    public void add() {
        this.add(dian);
        myEvent();
        //设置窗体的一些基本属性
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * 添加事件
     * 让当前的点可以实现上下左右的移动
     */
    public void myEvent() {
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    dian.setX(dian_x--);
                } else if (e.getKeyCode() == KeyEvent.VK_D) {
                    dian.setX(dian_x++);
                } else if (e.getKeyCode() == KeyEvent.VK_W) {
                    dian.setY(dian_y--);
                } else if (e.getKeyCode() == KeyEvent.VK_S) {
                    dian.setY(dian_y++);
                }
            }

        });
    }
}
