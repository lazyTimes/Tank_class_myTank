package version1;

import javax.swing.*;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : version1
 * @Description : �ع�̹�˴�ս - ��һ��
 * @Create on : 2021/1/29 16:01
 **/
public class MethodTank extends JFrame {

    /**
     * ������Ҫ�����
     */
    DrawTank draw;

    /**
     * �������
     */
    MethodTank() {
        draw = new DrawTank();
        this.add();
    }

    public void add() {
        this.add(draw);
        //���ô����һЩ��������
        this.setBounds(600, 400, 600, 400);
        // �رհ�ť
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // ��ʾ
        this.setVisible(true);
    }
}
