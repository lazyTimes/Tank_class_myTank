package version4;

import java.util.Vector;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version4
 * @Description : �ع�̹�� - ���İ�
 * @Create on : 2021/1/29 17:41
 **/ //����̹����,��̹������
//ʵ�ֶ��߳�
public class EnemyTank extends FatherTank implements Runnable {
    /**
     * װ�ص����ӵ��ļ���
     */
    Vector<Bullet> vecs;

    /**
     * �Ƿ���
     */
    boolean isLive = true;
    /**
     * �ٶ�
     */
    private int sreed;

    public EnemyTank(int x, int y) {
        super(x, y);
        super.setColor(1);

        this.direct = 2;
        this.sreed = 1;

        vecs = new Vector<Bullet>();
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    @Override
    //���Ƿ���̹����ԭ�س鴤������Ҫʵ��̹�˵�ƽ������
    //ʵ��̹���˶�����Խ��
    public void run() {
        //
        //�߳���ʵ��̹�˵Ĳ����ƶ�

        /*
         * 	ʵ�ַ�����ӵ�����
         * 		1.�ȼ�⼯���е��ӵ��������������ܳ���һ������
         * 		2.�ȱ�������̹�ˣ�Ȼ���ÿһ��̹���м��ϵ��ӵ������ж�
         * 		3.�������󣬰Ѷ�����ӵ����ϵ���
         */
//		if(this.vecs.size()<1)
//		{
//			//���̹�˴��ڲ�ִ������ӵ�����
//			if(this.isLive)
//			{
//
//				Bullet but = new Bullet(vecs.get(x).getX(), vecs.get(x).getY(), this.direct);
//				vecs.add(but);
//			}
//		}
        do {
            switch (this.direct) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (y > 0)
                            y -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (x < 500)
                            x += sreed;
                        try {
                            // ���ݵ�ͣ��
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (y < 400)
                            y += sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (x > 0)
                            x -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;

            }
            //��ͬ�ķ����ƶ��ķ���ͬ
            this.direct = (int) (Math.random() * 4);

        } while (this.isLive);
    }

}
