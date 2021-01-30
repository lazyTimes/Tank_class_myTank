package version3;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : �ع�̹�� - ������ �ӵ���
 * @Create on : 2021/1/29 17:17
 **/
/*
 * 		������װ����̹����
 * 		��������̹������ҷ�̹����
 *
 * 		�ӵ�����Ҫ���ϵ��ػ���ı������ᣬ���Կ������һ���߳�
 * 		�ӵ���Ҫ���̻߳�
 *
 * 		��֪���⣬�ӵ���Ҫ�����е��˻���Խ���ʱ������
 * */
public class Bullet implements Runnable {

    /**
     * �����ӵ���xy����
     */
    private int x, y;
    /**
     * �ӵ�����ɫ
     */
    int color;
    /**
     * �ӵ��ķ���
     */
    int direct;
    /**
     * �ӵ��ƶ��ٶ�
     */
    int screed;
    /**
     * �ж��Ƿ�Խ��
     */
    boolean isOut = false;

    /**
     * Խ�緶Χ
     */
    int outx = 400;
    /**
     * Խ�緶Χ
     */
    int outy = 300;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.screed = 1;
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

    @Override
    public void run() {
        //̹��һ��������Ҫ�˶�
        //��Ϊ�ƶ���̫�죬��Ҫ�����ٶ�
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                //
                e.printStackTrace();
            }

            switch (this.direct) {
                case 0:
                    y -= screed;
                    break;
                case 1:
                    x += screed;
                    break;
                case 2:
                    y += screed;
                    break;
                case 3:
                    x -= screed;
                    break;
            }
            System.out.println(x + "..." + y);
            //������Ե��ʧ
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
        }
        // �ӵ�ʲôʱ��������
    }

    /**
     * �ж��Ƿ�Խ��
     */
    public void outLine() {
    }
}
