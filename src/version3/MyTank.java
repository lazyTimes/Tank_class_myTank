package version3;


/**
 * �ع�̹�� - ������
 * �ҷ�̹����
 */
public class MyTank extends FatherTank {
    /**
     * �ҷ����ӵ�
     */
    Bullet but;

    public MyTank(int x, int y) {
        super(x, y);
        //̹�˾������������ƶ��ķ���
        super.setColor(1);
    }

    @Override
    public void shot() {
        //����̹�˵ķ�����ȷ������ӵ��ķ���
        //����̹�˷������ӵ�
        switch (this.direct) {
            case 0:
                but = new Bullet(x + 10, y, 0);
                break;
            case 1:
                but = new Bullet(x + 30, y + 10, 1);
                break;
            case 2:
                but = new Bullet(x + 10, y + 30, 2);
                break;
            case 3:
                but = new Bullet(x, y + 10, 3);
                break;
        }
        // �����ӵ��ƶ����߳�
        Thread t = new Thread(but);
        t.start();
    }


}

	
