package version2;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : �ع�̹�� - �ڶ���  ����̹��
 * @Create on : 2021/1/29 16:49
 **/
public class EnemyTank extends FatherTank {
    /**
     * ��ʼ�����ݵ��˵�λ��
     *
     * @param x ������ x
     * @param y ������ y
     */
    public EnemyTank(int x, int y) {
        super(x, y);
        super.setColor(1);
    }
}
