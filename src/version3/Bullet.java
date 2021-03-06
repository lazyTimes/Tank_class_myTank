package version3;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : 重构坦克 - 第三版 子弹类
 * @Create on : 2021/1/29 17:17
 **/
/*
 * 		此类中装的是坦克类
 * 		包含敌人坦克类和我方坦克类
 *
 * 		子弹类需要不断地重画与改变坐标轴，所以可以设计一个线程
 * 		子弹需要多线程化
 *
 * 		已知问题，子弹需要在射中敌人或者越界的时候销毁
 * */
public class Bullet implements Runnable {

    /**
     * 定义子弹的xy坐标
     */
    private int x, y;
    /**
     * 子弹的颜色
     */
    int color;
    /**
     * 子弹的方向
     */
    int direct;
    /**
     * 子弹移动速度
     */
    int screed;
    /**
     * 判断是否越界
     */
    boolean isOut = false;

    /**
     * 越界范围
     */
    int outx = 400;
    /**
     * 越界范围
     */
    int outy = 300;

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
                //
                e.printStackTrace();
            }

            switch (this.direct) {
                case 0:
                    y -= screed;
                    break;
                case 1:
                    x += screed;
                    break;
                case 2:
                    y += screed;
                    break;
                case 3:
                    x -= screed;
                    break;
            }
            System.out.println(x + "..." + y);
            //碰到边缘消失
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
        }
        // 子弹什么时候消亡？
    }

    /**
     * 判断是否越界
     */
    public void outLine() {
    }
}
