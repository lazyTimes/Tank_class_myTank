package version5;

/*
 * 		子弹类：
 *
 * 		敌人子弹类可以在多线程里面实现子弹的移动功能
 * 		与我方坦克不同，敌方坦克可以自行移动
 *
 *
 * */


//子弹类

/**
 * 重构坦克 - 第五版
 */
public class Bullet implements Runnable {
    private int x;
    private int y;
    private int color;
    private int direct;
    //子弹移动速度
    private int screed;

    //越界范围
    private int outx = 500;
    private int outy = 350;

    //敌人坦克对象
    EnemyTank en;

    //构造函数
    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.screed = 1;


    }


    //判断是否越界
    public boolean isOut = false;

    //判断是否暂停
    private boolean isSuspend = true;

    public boolean isSuspend() {
        return isSuspend;
    }

    public void setSuspend(boolean isSuspend) {
        this.isSuspend = isSuspend;
    }

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean isOut) {
        this.isOut = isOut;
    }


    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getScreed() {
        return screed;
    }

    public void setScreed(int screed) {
        this.screed = screed;
    }


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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    private void BulletRun() {
        //让线程停歇
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        if (this.isSuspend) {
            switch (this.direct) {
                case 0:
                    this.y -= screed;
                    break;
                case 1:
                    this.x += screed;
                    break;
                case 2:
                    this.y += screed;
                    break;
                case 3:
                    this.x -= screed;
                    break;

            }
        }
    }

    @Override
    public void run() {

        //坦克一旦建立就要运动
        //因为移动的太快，需要减慢速度

        while (true) {
            //然子弹一旦运行线程就开始移动
            this.BulletRun();
            //System.out.println(x+"..."+y);
            //碰到边缘消失
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
        }

    }

}
