package version4;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version4
 * @Description : 坦克父类
 * @Create on : 2021/1/29 17:43
 **/ //坦克父类
class FatherTank {
	/**
	 * 定义的坦克的横坐标与纵坐标
	 */
	int x;

	/**
	 * 定义的坦克的横坐标与纵坐标
	 */
    int y;

    //定义速度和方向两个属性
    int direct = 0;
    int seed = 4;

    //添加坦克颜色属性
    int color = 0;

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
        y -= seed;
    }

    public void move_down() {
        y += seed;
    }

    public void move_left() {
        x -= seed;
    }

    public void move_right() {
        x += seed;
    }
}
