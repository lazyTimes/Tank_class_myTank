package version6;

import java.util.Vector;

/*
 * 		此类中装的是坦克类
 * 		包含敌人坦克类和我方坦克类
 *
 * 		子弹类需要不断地重画与改变坐标轴，所以可以设计一个线程
 * 		子弹需要多线程化，减少内存占用
 *
 * 		已知问题，子弹需要在射中敌人或者越界的时候销毁
 * 		解决方法：越界问题经由一个if判断边界解决
 *
 * 		已知问题：敌方子弹无法移动
 *
 * 		已知问题;我方只能发射一个子弹
 * */

//我的坦克类
public class MyTank extends FatherTank {
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

        switch (this.direct) {

            case 0:
                but = new Bullet(x + 10, y, 0);
                //将创建的子弹加入到集合当中
                vecs.add(but);
                break;
            case 1:
                but = new Bullet(x + 30, y + 10, 1);
                vecs.add(but);
                break;
            case 2:
                but = new Bullet(x + 10, y + 30, 2);
                vecs.add(but);
                break;
            case 3:
                but = new Bullet(x, y + 10, 3);
                vecs.add(but);
                break;
        }

        //开启子弹移动的线程
        Thread t = new Thread(but);
        t.start();
    }

}

	
