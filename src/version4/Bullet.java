package version4;

/**
 * �ӵ��ࣺ �ع�̹�� - ���İ�
 * <p>
 * �����ӵ�������ڶ��߳�����ʵ���ӵ����ƶ�����
 * ���ҷ�̹�˲�ͬ���з�̹�˿��������ƶ�
 */
public class Bullet implements Runnable {
    // x ������
    int x;
    // y������
    int y;
    // ��ɫ
    int color;
    // ����
    int direct;

    //�ӵ��ƶ��ٶ�
    int screed;
    //�ж��Ƿ�Խ��
    boolean isOut = false;

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean isOut) {
        this.isOut = isOut;
    }

    //Խ�緶Χ
    int outx = 400;
    int outy = 300;

    /**
     * ����̹�˶���
     */
    EnemyTank en;

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
                e.printStackTrace();
            }
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
            //������Ե��ʧ
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
            //�����жϻ�ȡ�����˵������
            //����̹�˷���ͬ���ж�������ͬ
        }
    }
}
