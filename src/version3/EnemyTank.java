package version3;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : �ع�̹�� - ������ ���˵�̹����
 * @Create on : 2021/1/29 17:20
 **/
//����̹����
class EnemyTank extends FatherTank
{
	/**
	 * �ӵ�����
	 */
	Bullet but;

	public EnemyTank(int x, int y) {
		super(x, y);
		super.setColor(1);
	}

	/**
	 * ����ӵ��Ĺ���
	 */
	@Override
	void shot() {


	}


}
