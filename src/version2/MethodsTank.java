package version2;

import javax.swing.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : �ع�̹�� - �ڶ��� ̹��������
 * @Create on : 2021/1/29 16:36
 **/
public class MethodsTank extends JFrame {

    /**
     * ������Ҫ�����
     * ����̹�˵����
     */
    DrawTank draw;

    //�������
    MethodsTank()
    {
        draw = new DrawTank();
        this.add();
    }

    public void add()
    {
        this.add(draw);

        //ע�����
        this.addKeyListener(draw);

        //���ô����һЩ��������
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
