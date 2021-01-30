package version1;

import javax.swing.*;
import java.awt.*;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : version1.Tanks
 * @Description : �ع�̹�˴�ս - ��һ��
 * @Create on : 2021/1/29 15:55
 **/
public class DrawTank extends JPanel {

    /**
     * ����һ��̹��
     */
    MyTank mytank;

    /**
     * ��ʼ������һ��̹��
     */
    public DrawTank() {
        mytank = new MyTank(10, 10);

    }

    public void paint(Graphics g) {
        super.paint(g);

        //��������ɫ
        g.fill3DRect(0, 0, 600, 400, false);
        paintMyTank(mytank.getX(), mytank.getY(), g, 0, "enemytank");
    }

    /**
     * ��̹����Ҫ��ȡ��װ
     * 1.������֮ǰ��ȷ����ɫ���ǵ���̹�˻����ҷ�̹��
     * 2.����Ϊ�����������ʣ���Ҫ��,�Լ�̹�����ͺͷ���
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, String type) {
        //��֮ǰ��ȷ��̹�˵���ɫ
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
        //����
        if (direct == 0) {//�Ȼ����ҵ�̹��
            //������ߵľ��Σ���������ɫ
            g.fill3DRect(x, x, 5, 30, false);

            //�����м�ĳ�����
            g.fill3DRect(x + 5, x + 5, 10, 20, false);

            //�����м�ԲȦ,ʹ�������Բ
            g.fillOval(x + 6, x + 9, 7, 7);

            //����һ��ֱ��
            g.drawLine(x + 10, x, x + 10, x + 15);

            //������һ�߾���
            g.fill3DRect(x + 15, x, 5, 30, false);
        }

    }


}
