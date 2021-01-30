package version4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version4
 * @Description : 重构坦克 - 第四版
 * @Create on : 2021/1/29 17:44
 **/ //敌人已创建就要发射子弹，但是每个坦克发射子弹都是不同的所以需要使用多线程
class DrawTank extends JPanel implements KeyListener, Runnable {
    //创建一个坦克
    MyTank mytank;

    //使用一个集合装载敌人坦克类
    Vector<EnemyTank> vec;

    //定义敌人坦克的数量
    int enemytankSize = 3;

    //敌人坦克对象
    EnemyTank en;

    //建立子弹类
    Bullet buts;

    //三张图片
    Image img1;
    Image img2;
    Image img3;

    //建立一个炸弹的集合
    Vector<Booms> bosvec;

    /**
     * 绘画坦克和子弹
     */
    public DrawTank() {
        mytank = new MyTank(10, 10);
        //使用Vector集合保存敌方坦克
        vec = new Vector<EnemyTank>();

        //初始化敌人的坦克
        //升级:初始化敌人的坦克的时候要开启线程
        for (int x = 0; x < enemytankSize; x++) {
            en = new EnemyTank((x + 1) * 50, 0);
            new Thread(en).start();

            //初始化坦克的同时创建一颗子弹
            Bullet buts = new Bullet(en.getX() + 10, en.getY() + 20, en.getDirect());
            //把子弹添加到对应的子弹集合当中
            en.vecs.add(buts);
            //开启敌人子弹移动的线程
            new Thread(buts).start();
            // 敌人坦克颜色
            en.setColor(2);
            // 敌人装载
            vec.add(en);
        }

        //初始化图片
//		img1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms1.png"));
//		img2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms2.png"));
//		img3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms3.png"));

        //炸弹集合的初始化
        bosvec = new Vector<Booms>();
    }

    public void paint(Graphics g) {
        super.paint(g);

        //画出背景色
        g.fill3DRect(0, 0, 600, 400, false);
        //画出自己的坦克
        paintMyTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), mytank.getColor());

        //画出炸弹
        for (int x = 0; x < bosvec.size(); x++) {
            //取出炸弹对象
            Booms bos = bosvec.get(x);

            //将生命分成三段

            //生命值大于6的时候
            if (bos.getLife() > 6) {
                //是否画出了炸弹
                g.drawImage(img1, bos.x, bos.y, 100, 100, this);
            }
            if (bos.getLife() > 3) {
                g.drawImage(img2, bos.x, bos.y, 100, 100, this);
            } else {
                g.drawImage(img3, bos.x, bos.y, 30, 30, this);
            }

            bos.lifeDown();
            if (bos.getLife() == 0) {
                //当生命值为0，就要移除炸弹
                bosvec.remove(bos);
            }

        }

        //画出敌人的坦克
        paintEnemyTank(g);

        //画出自己坦克的子弹
        for (int x = 0; x < this.mytank.vecs.size(); x++) {
            //画出子弹并且确定没有越界
            mytank.but = mytank.vecs.get(x);

            //如果子弹没有越界或者子弹不为空就画出子弹
            if (mytank.but != null && !mytank.but.isOut) {
                g.fill3DRect(mytank.but.getX(), mytank.but.getY(), 5, 5, false);
            }
            //当子弹越界或者击中敌人，就要从集合中去掉对象
            if (mytank.but.isOut) {
                mytank.vecs.remove(mytank.but);
            }
        }

//		//画出敌人坦克的子弹
//		for(int x=0; x<vec.size(); x++)
//		{
//			System.out.println("取出子弹");
//			//取出坦克对象
//			enemy_Tank ens = vec.get(x);
//			for(int y=0; y<ens.vecs.size(); y++)
//			{
//				g.fill3DRect(ens.getX(), ens.getY(), 5, 5, false);
//			}
//		}


    }

    /**
     * 写一个函数专门判断是否击中目标,需要子弹对象和敌人坦克对象
     *
     * @param ens 敌人坦克
     * @param bul 子弹
     */
    private void hitTank(EnemyTank ens, Bullet bul) {
        //先判断地方坦克的方向
        switch (ens.getDirect()) {
            case 0:
            case 2: {
                //击中了地方坦克
                //击中了子弹消灭，敌人死亡
                if (bul.getX() > ens.getX() && bul.getX() < ens.getX() + 20
                        && bul.getY() < ens.getY() + 30 && bul.getY() > ens.getY()) {
                    //是否到达指定范围
                    ens.setLive(false);
                    bul.setOut(true);
                    //当敌人坦克被击中创建炸弹,将敌人的坐标位置传过去
                    Booms bo = new Booms(ens.getX(), ens.getY());
                    //将炸弹加入到集合当中
                    bosvec.add(bo);
                    break;
                }
            }
            case 1:
            case 3: {
                if (bul.getX() > ens.getX() && bul.getX() < ens.getX() + 30
                        && bul.getY() < ens.getY() + 20 && bul.getY() > ens.getY()) {
                    ens.setLive(false);
                    bul.setOut(true);

                    //当敌人坦克被击中创建炸弹,将敌人的坐标位置传过去
                    Booms bo = new Booms(ens.getX(), ens.getY());
                    //将炸弹加入到集合当中
                    bosvec.add(bo);
                    break;
                }

            }
        }
    }

    /**
     * 画出敌人的坦克
     *
     * @param g
     */
    private void paintEnemyTank(Graphics g) {
        //使用集合的大小来确定画几个坦克
        for (int i = 0; i < vec.size(); i++) {
            EnemyTank et = vec.get(i);
            //如果坦克已经被消灭，就不要画出来
            if (et.isLive) {
                paintMyTank(et.getX(), et.getY(), g, et.getDirect(), et.getColor());

                //画出坦克的同时画出子弹
                for (int y = 0; y < et.vecs.size(); y++) {
                    //取出子弹
                    Bullet but = et.vecs.get(y);
                    if (!but.isOut())
                        g.fill3DRect(but.getX(), but.getY(), 5, 5, false);
                    else
                        et.vecs.remove(but);
                }
            }


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

        //判断是否按下了J键
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //限定射击速度。
            if (mytank.vecs.size() < 5) {
                mytank.shot();
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void run() {
        //限定一段时间重新绘制
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //判断是否击中
            for (int x = 0; x < mytank.vecs.size(); x++) {
                //每一颗子弹和每一个坦克匹配
                //取出一颗子弹之前判断是否有子弹
                buts = mytank.vecs.get(x);

                //判断子弹是否有效
                if (buts.isOut()) {
                    continue;
                }
                //取出每一个坦克与它判断
                for (int y = 0; y < vec.size(); y++) {
                    //判断敌方坦克是否死亡
                    if (vec.get(y).isLive) {
                        en = vec.get(y);
                        //记性判断是否击中操作
                        hitTank(en, buts);
                    }
                }

            }

            //如果子弹数小于一定数目
            for (int x = 0; x < vec.size(); x++) {
                EnemyTank et = vec.get(x);
                //遍历每一辆坦克的子弹集合
                if (!et.isLive()) {
                    continue;
                }
                if (et.vecs.size() < 1) {
                    //对于不同的坦克方向生成子弹的方向也不同
                    Bullet enybut = null;
                    switch (et.getDirect()) {
                        case 0:
                            enybut = new Bullet(et.getX() + 10, et.getY(), 0);
                            //将创建的子弹加入到集合当中
                            et.vecs.addElement(enybut);
                            break;
                        case 1:
                            enybut = new Bullet(et.getX() + 30, et.getY() + 10, 1);
                            et.vecs.addElement(enybut);
                            break;
                        case 2:
                            enybut = new Bullet(et.getX() + 10, et.getY() + 30, 2);
                            et.vecs.addElement(enybut);
                            break;
                        case 3:
                            enybut = new Bullet(et.getX(), et.getY() + 10, 3);
                            et.vecs.addElement(enybut);
                            break;

                    }
                    new Thread(enybut).start();

                }
            }
            //重绘
            this.repaint();
        }
    }


}
