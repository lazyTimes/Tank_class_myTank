package version4;

/**
 * ����Ϊ�����࣬��Ҫ�����ӵ���ǰ�˲���
 * ��Ҫ������
 * ����̹�˱�����֮����ʧ
 * <p>
 * ը���������κ�һ�����󣬶�����Ҫ����ͼƬ��һ�������װ
 * <p>
 * ����ʹ��һ������ϵͳ����ը������������һ���̶Ⱦ�Ҫ�ı�ͼƬ
 * ����ͼƬ���л�ʵ��
 * <p>
 * �õ��˷������ӵ�
 * ʵ�ַ���
 * �ع�̹�� - ���İ�
 */
//����һ��ը����
public class Booms {
    /**
     * ը��x����
     */
    int x;
    /**
     * ը����y����
     */
    int y;
    /**
     * ��Ҫ����������
     */
    int life = 9;

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


