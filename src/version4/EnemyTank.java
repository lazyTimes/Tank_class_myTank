package version4;

import java.util.Vector;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version4
 * @Description : 重构坦克 - 第四版
 * @Create on : 2021/1/29 17:41
 **/ //敌人坦克类,给坦克升级
//实现多线程
public class EnemyTank extends FatherTank implements Runnable {
    /**
     * 装载敌人子弹的集合
     */
    Vector<Bullet> vecs;

    /**
     * 是否存活
     */
    boolean isLive = true;
    /**
     * 速度
     */
    private int sreed;

    public EnemyTank(int x, int y) {
        super(x, y);
        super.setColor(1);

        this.direct = 2;
        this.sreed = 1;

        vecs = new Vector<Bullet>();
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    @Override
    //我们发现坦克在原地抽搐，我们要实现坦克的平稳运行
    //实现坦克运动不会越界
    public void run() {
        //
        //线程中实现坦克的不断移动

        /*
         * 	实现发多个子弹功能
         * 		1.先检测集合中的子弹数量，数量不能超过一定数量
         * 		2.先遍历所有坦克，然后对每一个坦克中集合的子弹进行判断
         * 		3.建立对象，把对象添加到集合当中
         */
//		if(this.vecs.size()<1)
//		{
//			//如果坦克存在才执行添加子弹操作
//			if(this.isLive)
//			{
//
//				Bullet but = new Bullet(vecs.get(x).getX(), vecs.get(x).getY(), this.direct);
//				vecs.add(but);
//			}
//		}
        do {
            switch (this.direct) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (y > 0)
                            y -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (x < 500)
                            x += sreed;
                        try {
                            // 短暂的停顿
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (y < 400)
                            y += sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (x > 0)
                            x -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;

            }
            //不同的方向移动的方向不同
            this.direct = (int) (Math.random() * 4);

        } while (this.isLive);
    }

}
