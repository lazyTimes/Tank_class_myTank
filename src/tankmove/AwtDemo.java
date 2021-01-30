package tankmove;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : tankmove
 * @Description : ����
 * @Create on : 2021/1/29 18:07
 **/ //����
class AwtDemo extends JFrame {
    /**
     * ԭ��
     */
    DrawDian dian;
    /**
     * �洢���X��Y��
     */
    int dian_x;
    /**
     * �洢���X��Y��
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
        //���ô����һЩ��������
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * ����¼�
     * �õ�ǰ�ĵ����ʵ���������ҵ��ƶ�
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
