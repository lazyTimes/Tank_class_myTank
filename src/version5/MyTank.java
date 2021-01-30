package version5;

import java.util.Vector;

/**
 * 重构坦克 - 第五版
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */ //我的坦克类
class MyTank extends FatherTank
{
	//我方子弹类

	public MyTank(int x, int y) {
		super(x, y);

		//坦克具有上下左右移动的方法
		super.setColor(1);
		//建立集合
		vecs = new Vector<Bullet>();
	}

	public void shot() {

		//根据坦克的方向来确定射出子弹的方向
		//根据坦克方向建立子弹

		switch(this.direct)
		{

		case 0:
			but = new Bullet(x+10, y, 0);
			//将创建的子弹加入到集合当中
			vecs.add(but);
			break;
		case 1:
			but = new Bullet(x+30, y+10, 1);
			vecs.add(but);
			break;
		case 2:
			but = new Bullet(x+10, y+30, 2);
			vecs.add(but);
			break;
		case 3:
			but = new Bullet(x, y+10, 3);
			vecs.add(but);
			break;
		}

		//开启子弹移动的线程
		Thread t = new Thread(but);
		t.start();
	}

}
