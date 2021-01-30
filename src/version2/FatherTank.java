package version2;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : �ع�̹�� - �ڶ��� ̹�˵ĸ���
 * @Create on : 2021/1/29 16:47
 **/
public class FatherTank {

    //�����̹�˵ĺ�������������
    int x;
    int y;

    /**
     * �����ٶȺͷ�����������
     */
    int direct = 0;
    int seed = 4;

    /**
     * ���̹����ɫ����
     */
    int color = 0;

    public FatherTank(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // TODO ����ӵ�

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
        y -= seed;
    }

    public void move_down() {
        y += seed;
    }

    public void move_left() {
        x -= seed;
    }

    public void move_right() {
        x += seed;
    }

}
