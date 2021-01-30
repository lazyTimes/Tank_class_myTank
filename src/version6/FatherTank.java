package version6;

import java.util.Vector;

/**
 * 最终版本
 * 坦克父类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:49
 */ //坦克父类
class FatherTank {
    //定义的坦克的横坐标与纵坐标
    int x;
    int y;

    protected Bullet but;

    //装载子弹的集合
    protected Vector<Bullet> vecs;

    //定义速度和方向两个属性
    int direct = 0;
    int seed = 2;
    int sreed;

    //添加坦克颜色属性
    int color = 0;
    //坦克是否存在属性
    boolean isLive = true;

    //坦克是否允许转向
    boolean isSuspend = true;

    public boolean isSuspend() {
        return isSuspend;
    }

    public void setSuspend(boolean isSuspend) {
        this.isSuspend = isSuspend;
    }

    public int getSreed() {
        return sreed;
    }

    public void setSreed(int sreed) {
        this.sreed = sreed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public FatherTank(int x, int y) {

        this.x = x;
        this.y = y;
    }

    //颜色的获取设置
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    //设置方向和获取方向
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {

        this.direct = direct;
    }

    //获取速度与设置速度
    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    //获取坐标轴
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

    public void move_up() {
        if (this.isSuspend)
            y -= seed;
    }

    public void move_down() {
        if (this.isSuspend)
            y += seed;
    }

    public void move_left() {
        if (this.isSuspend)
            x -= seed;
    }

    public void move_right() {
        if (this.isSuspend)
            x += seed;
    }
}
