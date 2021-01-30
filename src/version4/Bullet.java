package version4;

/**
 * 子弹类： 重构坦克 - 第四版
 * <p>
 * 敌人子弹类可以在多线程里面实现子弹的移动功能
 * 与我方坦克不同，敌方坦克可以自行移动
 */
public class Bullet implements Runnable {
    // x 轴坐标
    int x;
    // y轴坐标
    int y;
    // 颜色
    int color;
    // 方向
    int direct;

    //子弹移动速度
    int screed;
    //判断是否越界
    boolean isOut = false;

    public boolean isOut() {
        return isOut;
    }

    public void setOut(boolean isOut) {
        this.isOut = isOut;
    }

    //越界范围
    int outx = 400;
    int outy = 300;

    /**
     * 敌人坦克对象
     */
    EnemyTank en;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.screed = 1;


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

    @Override

    public void run() {
        //坦克一旦建立就要运动
        //因为移动的太快，需要减慢速度

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
            //碰到边缘消失
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
            //增加判断获取到敌人的坐标点
            //敌人坦克方向不同，判断条件不同
        }
    }
}
