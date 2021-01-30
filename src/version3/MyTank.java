package version3;


/**
 * 重构坦克 - 第三版
 * 我方坦克类
 */
public class MyTank extends FatherTank {
    /**
     * 我方的子弹
     */
    Bullet but;

    public MyTank(int x, int y) {
        super(x, y);
        //坦克具有上下左右移动的方法
        super.setColor(1);
    }

    @Override
    public void shot() {
        //根据坦克的方向来确定射出子弹的方向
        //根据坦克方向建立子弹
        switch (this.direct) {
            case 0:
                but = new Bullet(x + 10, y, 0);
                break;
            case 1:
                but = new Bullet(x + 30, y + 10, 1);
                break;
            case 2:
                but = new Bullet(x + 10, y + 30, 2);
                break;
            case 3:
                but = new Bullet(x, y + 10, 3);
                break;
        }
        // 开启子弹移动的线程
        Thread t = new Thread(but);
        t.start();
    }


}

	
