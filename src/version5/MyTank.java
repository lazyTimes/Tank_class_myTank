package version5;

import java.util.Vector;

/**
 * �ع�̹�� - �����
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */ //�ҵ�̹����
class MyTank extends FatherTank
{
	//�ҷ��ӵ���

	public MyTank(int x, int y) {
		super(x, y);

		//̹�˾������������ƶ��ķ���
		super.setColor(1);
		//��������
		vecs = new Vector<Bullet>();
	}

	public void shot() {

		//����̹�˵ķ�����ȷ������ӵ��ķ���
		//����̹�˷������ӵ�

		switch(this.direct)
		{

		case 0:
			but = new Bullet(x+10, y, 0);
			//���������ӵ����뵽���ϵ���
			vecs.add(but);
			break;
		case 1:
			but = new Bullet(x+30, y+10, 1);
			vecs.add(but);
			break;
		case 2:
			but = new Bullet(x+10, y+30, 2);
			vecs.add(but);
			break;
		case 3:
			but = new Bullet(x, y+10, 3);
			vecs.add(but);
			break;
		}

		//�����ӵ��ƶ����߳�
		Thread t = new Thread(but);
		t.start();
	}

}
