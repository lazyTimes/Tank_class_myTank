package version2;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : �ع�̹�� - �ڶ���
 * @Create on : 2021/1/29 16:48
 **/
public class MyTank extends FatherTank {

    /**
     * ��ʼ�������ҷ�̹��λ��
     *
     * @param x ������x
     * @param y ������Y
     */
    public MyTank(int x, int y) {
        super(x, y);
        //̹�˾������������ƶ��ķ���
        super.setColor(1);
    }

}
