package version5;

/*
 * 		�ӵ��ࣺ
 *
 * 		�����ӵ�������ڶ��߳�����ʵ���ӵ����ƶ�����
 * 		���ҷ�̹�˲�ͬ���з�̹�˿��������ƶ�
 *
 *
 * */


//�ӵ���

/**
 * �ع�̹�� - �����
 */
public class Bullet implements Runnable {
    private int x;
    private int y;
    private int color;
    private int direct;
    //�ӵ��ƶ��ٶ�
    private int screed;

    //Խ�緶Χ
    private int outx = 500;
    private int outy = 350;

    //����̹�˶���
    EnemyTank en;

    //���캯��
    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.screed = 1;


    }


    //�ж��Ƿ�Խ��
    public boolean isOut = false;

    //�ж��Ƿ���ͣ
    private boolean isSuspend = true;

    public boolean isSuspend() {
        return isSuspend;
    }

    public void setSuspend(boolean isSuspend) {
        this.isSuspend = isSuspend;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean isOut) {
        this.isOut = isOut;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getScreed() {
        return screed;
    }

    public void setScreed(int screed) {
        this.screed = screed;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    private void BulletRun() {
        //���߳�ͣЪ
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        if (this.isSuspend) {
            switch (this.direct) {
                case 0:
                    this.y -= screed;
                    break;
                case 1:
                    this.x += screed;
                    break;
                case 2:
                    this.y += screed;
                    break;
                case 3:
                    this.x -= screed;
                    break;

            }
        }
    }

    @Override
    public void run() {

        //̹��һ��������Ҫ�˶�
        //��Ϊ�ƶ���̫�죬��Ҫ�����ٶ�

        while (true) {
            //Ȼ�ӵ�һ�������߳̾Ϳ�ʼ�ƶ�
            this.BulletRun();
            //System.out.println(x+"..."+y);
            //������Ե��ʧ
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
        }

    }

}
