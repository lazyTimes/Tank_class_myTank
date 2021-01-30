package version3;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : 重构坦克 - 第三版 敌人的坦克类
 * @Create on : 2021/1/29 17:20
 **/
//敌人坦克类
class EnemyTank extends FatherTank
{
	/**
	 * 子弹对象
	 */
	Bullet but;

	public EnemyTank(int x, int y) {
		super(x, y);
		super.setColor(1);
	}

	/**
	 * 射击子弹的功能
	 */
	@Override
	void shot() {


	}


}
