package version6;

import java.util.Vector;

/**
 * ���հ汾
 * ̹�˸���
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:49
 */ //̹�˸���
class FatherTank {
    //�����̹�˵ĺ�������������
    int x;
    int y;

    protected Bullet but;

    //װ���ӵ��ļ���
    protected Vector<Bullet> vecs;

    //�����ٶȺͷ�����������
    int direct = 0;
    int seed = 2;
    int sreed;

    //���̹����ɫ����
    int color = 0;
    //̹���Ƿ��������
    boolean isLive = true;

    //̹���Ƿ�����ת��
    boolean isSuspend = true;

    public boolean isSuspend() {
        return isSuspend;
    }

    public void setSuspend(boolean isSuspend) {
        this.isSuspend = isSuspend;
    }

    public int getSreed() {
        return sreed;
    }

    public void setSreed(int sreed) {
        this.sreed = sreed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public FatherTank(int x, int y) {

        this.x = x;
        this.y = y;
    }

    //��ɫ�Ļ�ȡ����
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    //���÷���ͻ�ȡ����
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {

        this.direct = direct;
    }

    //��ȡ�ٶ��������ٶ�
    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    //��ȡ������
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

    public void move_up() {
        if (this.isSuspend)
            y -= seed;
    }

    public void move_down() {
        if (this.isSuspend)
            y += seed;
    }

    public void move_left() {
        if (this.isSuspend)
            x -= seed;
    }

    public void move_right() {
        if (this.isSuspend)
            x += seed;
    }
}
