package version5;

/**
 * �ع�̹�� - �����
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */ //����һ��ը����
class Booms {

    int x;

    int y;
    //��Ҫ����������
    int life = 150;

    //ը���Ƿ���
    boolean isLive = true;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public Booms(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //ը�����������������ϼ��ٲ���ʵ��ͼƬ���л�
    public void lifeDown() {
        if (life > 0)
            life--;
        else
            this.isLive = false;
    }
}
