package version4;

import java.util.Vector;

/**
 * ������װ����̹����
 * ��������̹������ҷ�̹����
 * <p>
 * �ӵ�����Ҫ���ϵ��ػ���ı������ᣬ���Կ������һ���߳�
 * �ӵ���Ҫ���̻߳��������ڴ�ռ��
 * <p>
 * ��֪���⣬�ӵ���Ҫ�����е��˻���Խ���ʱ������
 * ���������Խ�����⾭��һ��if�жϱ߽���
 * <p>
 * ��֪���⣺�з��ӵ��޷��ƶ�
 * <p>
 * ��֪����;�ҷ�ֻ�ܷ���һ���ӵ�
 * �ع�̹�� - ���İ�
 */
//�ҵ�̹����
public class MyTank extends FatherTank {
    /**
     * �ҷ��ӵ���
     */
    Bullet but;
    /**
     * װ���ӵ��ļ���
     */
    Vector<Bullet> vecs;

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
        switch (this.direct) {
            case 0:
                but = new Bullet(x + 10, y, 0);
                //���������ӵ����뵽���ϵ���
                vecs.add(but);
                break;
            case 1:
                but = new Bullet(x + 30, y + 10, 1);
                vecs.add(but);
                break;
            case 2:
                but = new Bullet(x + 10, y + 30, 2);
                vecs.add(but);
                break;
            case 3:
                but = new Bullet(x, y + 10, 3);
                vecs.add(but);
                break;
        }
        //�����ӵ��ƶ����߳�
        Thread t = new Thread(but);
        t.start();
    }

}

	
