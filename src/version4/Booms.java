package version4;

/**
 * 此类为画笔类，需要画出子弹的前端操作
 * 重要方法：
 * 敌人坦克被击中之后消失
 * <p>
 * 炸弹不属于任何一个对象，而且需要三张图片成一个对象封装
 * <p>
 * 可以使用一个生命系统，当炸弹的生命到达一定程度就要改变图片
 * 三张图片的切换实现
 * <p>
 * 让敌人发射多个子弹
 * 实现方法
 * 重构坦克 - 第四版
 */
//定义一个炸弹类
public class Booms {
    /**
     * 炸弹x坐标
     */
    int x;
    /**
     * 炸弹的y坐标
     */
    int y;
    /**
     * 重要：生命属性
     */
    int life = 9;

    //炸弹是否存活
    boolean isLive = true;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean isLive) {
        this.isLive = isLive;
    }

    public Booms(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //炸弹有生命，生命不断减少才能实现图片的切换
    public void lifeDown() {
        if (life > 0)
            life--;
        else
            this.isLive = false;
    }
}


