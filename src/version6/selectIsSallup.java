package version6;

import javax.swing.*;
import java.awt.*;

/**
 * ���հ汾
 * ѡ��Ϳ�ʼ�Ļ���
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:50
 */
//��ʼ�Ľ���
/*
 * 		ʵ����˸����
 * 		ʹ��һ�����߳̿���ʱ������
 * 		ÿ�������ͽ���һ����˸Ч��
 *
 * */
class selectIsSallup extends JPanel implements Runnable {
    //ʱ������
    int times = 0;

    public void paint(Graphics g) {
        super.paint(g);
        //g.setColor(Color.gray);
        g.fillRect(0, 0, 600, 400);

        if (times % 2 == 0) {
            //��������
            Font font1 = new Font("������κ", Font.BOLD, 20);
            //�����������ɫ
            g.setColor(Color.yellow);
            g.setFont(font1);
            g.drawString("stage 1", 200, 150);
        }
        //System.out.println(times);

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
