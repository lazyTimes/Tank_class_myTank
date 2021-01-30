package version3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : 重构坦克 - 第三版 绘画坦克的方法
 * @Create on : 2021/1/29 17:26
 **/
public class DrawTank extends JPanel implements KeyListener {
	/**
	 * 创建一个坦克
	 */
	MyTank mytank;

	/**
	 * 使用一个集合装载地方坦克类
	 */
	Vector<EnemyTank> vec;

	/**
	 * 定义敌人坦克的数量
	 */
	int enemytankSize = 3;

    public DrawTank() {
        mytank = new MyTank(10, 10);
        //使用Vector集合保存敌方坦克
        vec = new Vector<EnemyTank>();

        //初始化敌人的坦克
        for (int x = 0; x < enemytankSize; x++) {
            EnemyTank en = new EnemyTank((x + 1) * 50, 0);
            en.setColor(2);
            vec.add(en);
        }

    }

	/**
	 * 绘画方法
	 * @param g
	 */
	@Override
	public void paint(Graphics g) {
        super.paint(g);

        //画出背景色
        g.fill3DRect(0, 0, 600, 400, false);
        //画出自己的坦克
        paintMyTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), mytank.getColor());
        //画出敌人的坦克
        paintEnemyTank(g);

        //画出子弹并且确定没有越界
        if (mytank.but != null && !mytank.but.isOut) {
            g.fill3DRect(mytank.but.getX(), mytank.but.getY(), 5, 5, false);
        }
    }

	/**
	 * 画敌人坦克的方法
	 * @param g
	 */
	public void paintEnemyTank(Graphics g) {
        //使用集合的大小来确定画几个坦克
        for (int i = 0; i < vec.size(); i++) {
            paintMyTank(vec.get(i).getX(), vec.get(i).getY(), g, vec.get(i).getDirect(), vec.get(i).getColor());
        }
    }

    /**
     * 画坦克需要提取封装
     * 1.画出来之前先确定颜色，是敌人坦克还是我方坦克
     * 2.参数为坐标做，画笔（重要）,以及坦克类型和方向
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, int color) {
        //画之前先确定坦克的颜色
        switch (color) {
            case 1: {
                g.setColor(Color.red);
                break;
            }
            case 2: {
                g.setColor(Color.cyan);
                break;
            }
        }

        //0是向上，1是向右，2是想下，3是向左
        switch (direct) {
            //向上
            case 0: {
                //先画出我的坦克
                //画出左边的矩形，先设置颜色
                g.fill3DRect(x, y, 5, 30, false);
                //画出中间的长方形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //画出中间圆圈,使用填充椭圆
                g.fillOval(x + 6, y + 9, 7, 7);
                //画出一条直线
                g.drawLine(x + 10, y, x + 10, y + 15);
                //画出另一边矩形
                g.fill3DRect(x + 15, y, 5, 30, false);
                this.repaint();
                break;

            }
            //扩展，画出不同朝向的样子
            case 1: {
                g.fill3DRect(x, y, 30, 5, false);
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                g.fillOval(x + 10, y + 7, 7, 7);
                g.drawLine(x + 10, y + 10, x + 30, y + 10);
                g.fill3DRect(x, y + 15, 30, 5, false);
                this.repaint();
                break;
            }
            case 2: {
                //先画出我的坦克
                //画出左边的矩形，先设置颜色
                g.fill3DRect(x, y, 5, 30, false);
                //画出中间的长方形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //画出中间圆圈,使用填充椭圆
                g.fillOval(x + 6, y + 9, 7, 7);
                //画出一条直线
                g.drawLine(x + 10, y + 10, x + 10, y + 30);
                //画出另一边矩形
                g.fill3DRect(x + 15, y, 5, 30, false);
                this.repaint();
                break;
            }
            case 3: {
                g.fill3DRect(x, y, 30, 5, false);
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                g.fillOval(x + 10, y + 7, 7, 7);
                g.drawLine(x, y + 10, x + 10, y + 10);
                g.fill3DRect(x, y + 15, 30, 5, false);
                this.repaint();
                break;
            }
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            this.mytank.setDirect(0);
            this.mytank.move_up();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            this.mytank.setDirect(1);
            this.mytank.move_right();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            this.mytank.setDirect(2);
            this.mytank.move_down();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            //改变方向
            this.mytank.setDirect(3);
            this.mytank.move_left();

        }

        //判断是否按下了J键，是则射击
        if (e.getKeyCode() == KeyEvent.VK_J) {
            mytank.shot();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}
