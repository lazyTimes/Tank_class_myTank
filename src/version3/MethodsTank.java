package version3;

import javax.swing.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : �ع�̹�� - ������ ̹�˻��ƿ��
 * @Create on : 2021/1/29 17:29
 **/
class MethodsTank extends JFrame {
	/**
	 * ������Ҫ�����
	 */
	DrawTank draw;

	/**
	 * �������
	 */
	MethodsTank() {
        draw = new DrawTank();
        this.add();
    }

	/**
	 * ���������Ļ���
	 */
	public void add() {
        this.add(draw);

        //ע�����
        this.addKeyListener(draw);

        //���ô����һЩ��������
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
