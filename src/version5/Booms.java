package version5;

/**
 * 重构坦克 - 第五版
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */ //定义一个炸弹类
class Booms {

    int x;

    int y;
    //重要：生命属性
    int life = 150;

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
