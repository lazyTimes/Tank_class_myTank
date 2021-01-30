# 坦克大战

## 前言：

这个项目是之前备份电脑资料的时候看到的，不禁一阵感慨自己当初自学编程的心酸和泪水。所以分享一下自己的“垃圾代码”。虽然我不是任天堂忠实粉丝，但是对于90后来说坦克大战基本是人人都玩过的一款小霸王游戏机的游戏。

这个项目对于已经入行的人来说没有价值，分享出来主要是希望对于初学编程的人给一点 “吸引”吧，原来代码可以做到这么愉快的事情。这个坦克大战也是自己跟着培训机构的教学视频边看边敲的。

花了一天左右的时间把代码稍微整理了一下代码，这里分享出来。

对于入行编程的同学个人的建议如果要快速成长还是多练，多做。很多东西做多了之后，涉及自己的盲区会促使你不断的学习和进步。



> PS：代码使用Eclipse写的，这里用IDEA整理了一下代码
>
> 此代码如果阅读存在难度，建议看一下韩顺平的JAVA基础坦克大战的课程。这里的源代码也是跟着课程敲的。
>
> https://www.bilibili.com/video/BV157411g78y?p=47
>
> 真是一个好时代，当初这些资源还要网上翻半天

<!-- more -->

## 项目地址

https://github.com/lazyTimes/Tank_class_myTank



## 项目简介：

个人前几年自学的时候从一个教学视频的，**韩顺平老师的JAVA初级坦克大战**。个人跟着视频边学边敲之后，对于编程的兴趣大大的提升。后面越学越快乐。

## 所用技术

1. JAVA GUI（远古技术，**千万别深入**，看看即可）
2. JAVA

## 面向群体：

1. 初学JAVA者，可以看看这个项目锻炼动手能力
2. 完全不了解什么是面向对象
3. 对于小游戏有点兴趣的
4. 如果你厌恶枯燥的学习，做一个小游戏或许能给你一点动力

## 项目截图：

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130151243.png)

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130151301.png)

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130151329.png)





## 操作坦克的方法：

最后一版本有效，早起版本部分功能或者所有功能按键无效

+ WASD
+ J：为射出子弹



## 需求文档（或许是）：

由于当初是跟着视频做的，虽然具体的记忆忘了，但是自己跟着敲的同时忘了做需求的更新，所以这里有部分需求和思路断了。如果有不同的，后续补充GIT的README文档。

```
/*
 * 		需求：
 * 			坦克大战:
 * 			功能：	
 * 				1.画出坦克，
 * 		
 * 		思路：
 * 			1.首先坦克想象由五个部件组成两个矩形，一个长方形或者正方形，一个圆
 * 				一条直线
 * 
 * 			2.画坦克的时候需要使用到画笔工具
 * 				必须在构造函数初始化使用画笔工具
 * 
 * 			3.在设置方向以及画出不同方向的坦克
 * 
 * 			4.敌方坦克画出来需要使用父类方法
 * 				敌方坦克的坐标需要设置，	
 * 				使用一个集合保存敌方坦克Vector集合便于删除和添加 
 * 
 * 			5.发射子弹是一个线程
 * 				具有线程的功能
 * 				另外线程对与子弹方向运动轨迹不同
 * 
 * 			6.需要把子弹画出来
 * 				在按下J键的时候发射子弹
 * 					实现连发使用集合存储
 * 				
 * 		升级：
 * 			1.让敌人能够发射子弹
				解决方法
					1.敌人发射子弹是一个多线程方法，应当在敌人的run函数当中实现
					2.坦克发射子弹和移动都是坦克本身具有的功能
 * 
 * 			思路：
 * 				1.在敌人类里面需要添加一个射击方法
 * 					与我方一样，但是敌人是自动射击或者说每过几秒射击一次
 * 
 * 				2.我方坦克子弹连发
 * 					使用一个集合保存建立的对象，画出子弹使用集合中的对象
 * 					我方坦克子弹连发过快，需要限定		
 * 			
 * 				3.
 * 					我方坦克击中敌人坦克之后，敌人坦克就要消失
 * 					需要获取到敌人的一个定点坐标，然后界定一个范围
 * 					写一个专门的函数判断是否击中敌人
 * 					
 * 					在哪里判断是否击中敌人
 * ·				因为每一颗子弹都要与所有的坦克匹配，并且每一次匹配都要
 * 					双重判断每次都要进行建立对象
 * 					图片问题没有得到解决
 * 
 * 		升级
 * 				1.需要实现敌人的坦克不断的移动使用多线程的手段实现
 * 
 * 				2.需要实现敌人能够发射子弹的功能
 * 				实现方法：
 * 					建立一个敌人的子弹集合
 * 					如何敌人何时发射子弹？
 * 					使用多重循环判断是否需要添加薪子弹
 * 
 * 				3.实现自己被子弹击中也会消失
 * 					对于摧毁坦克进行升级
 * 
 * 				4.
 * 					较难！
 * 					实现坦克不覆盖运动，
 * 					1.首先改判断在坦克类中实现
 * 					2.需要用到一个方法获取到生成的坦克类
 * 					3.对于地方其中一辆坦克的选择，都要循环与其他所有坦克进行比对
 * 						并且要事先判断是否为我方坦克
 * 					4.**对于点位的判断要判断两个点，才能够保证不会产生碰撞
 * 
 * 				5.实现选择关卡的功能
 * 					思路：
 * 						1.可以建立一个选择关卡的面板
 * 						2.暂时先实现不同的关卡敌人坦克的数量不同
 * 						3.实现闪烁功能，使用多线程的方法,注意线程的关闭
 * 						4.对于选项添加事件属性,添加事件
 * 
 * 				5.画出我方坦克击中了多少辆地方坦克
 * 					1.对于总体界面进行修改
 * 					2.显示敌人坦克的数量
 * 					扩展：
 * 						1.建立帮助文档
 * 					3.扩展:我方坦克的生命值，当生命值为0的时候游戏结束
 * 					4.记录我方击中了多少地方坦克
 * 						使用文件操作完成
 * 
 * 				6.实现重新开始的功能
 * 
 * 				7.实现存盘退出的功能
 * 					思路：
 * 						选在主界面增加两个按钮
 * 						1.记录所有坦克的坐标
 * 						
 * 				8.实现暂停的功能
 * 					思路：
 * 						暂停功能可以通过一个布尔值进行判断，当按下某个按钮的时候就要进行布尔值的改变
 * 						需要暂停的对象
 * 							将多线程子弹的速度前进功能暂停
 * 							敌人坦克无法转向和前进
 * 							我方坦克无法转向和前进
 * 
 * 				9.实现播放音乐的功能
 * 					自学 - 未实现
 * 
 * 				
 * 					
 * 
 * */
```

## 版本迭代和介绍：

### 介绍：

代码比较多，我会抽几处理解起来比较难以理解的地方说明一下，其他的代码需要看细节。如果有不懂的欢迎在issue提出，个人只要有空一定给予答复。



### 第一个版本 

版本概述：画出坦克(version1)

我们的第一步是画出我们的坦克，画出我方坦克的方法还是非常简单的。

```
 * 		思路：
 * 			1.首先坦克想象由五个部件组成两个矩形，一个长方形或者正方形，一个圆
 * 				一条直线
 * 
 * 			2.画坦克的时候需要使用到画笔工具
 * 				必须在构造函数初始化使用画笔工具
 * 
 * 			3.在设置方向以及画出不同方向的坦克
```

拥有坦克的第一步是画出坦克

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210129160413.png)

画出坦克的核心代码如下：

```java
/**
     * 画坦克需要提取封装
     * 1.画出来之前先确定颜色，是敌人坦克还是我方坦克
     * 2.参数为坐标做，画笔（重要）,以及坦克类型和方向
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, String type) {
        //画之前先确定坦克的颜色
        switch (type) {
            case "mytank": {
                g.setColor(Color.red);
                break;
            }
            case "enemytank": {
                g.setColor(Color.cyan);
                break;
            }
        }
        //向上
        if (direct == 0) {//先画出我的坦克
            //画出左边的矩形，先设置颜色
            g.fill3DRect(x, x, 5, 30, false);

            //画出中间的长方形
            g.fill3DRect(x + 5, x + 5, 10, 20, false);

            //画出中间圆圈,使用填充椭圆
            g.fillOval(x + 6, x + 9, 7, 7);

            //画出一条直线
            g.drawLine(x + 10, x, x + 10, x + 15);

            //画出另一边矩形
            g.fill3DRect(x + 15, x, 5, 30, false);
        }

    }
```

如果知道数字的意思，直接将数字修改大小就可以知道效果了

### 第二个版本 

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130150035.png)

版本概述：画出我方坦克不同形状，敌方坦克(version2)，我方坦克可以进行行动

在上个版本当中，我们发现我们的坦克只有一个朝向，在这个版本中，增加了坦克的不同朝向。同时增加了敌人的坦克类。

由于敌人有很多个，所以用了一个集合来维护和设置。同时加入了坐标系统，可以实现不同的坦克挪到不同的位置。

这个版本的关键代码，不是在画坦克的上面，而是在于加入了键盘的监听事件：

```java
// version2.DrawTank.java 更多细节请查看
public class DrawTank extends JPanel implements KeyListener { 
    // 省略一大坨代码
    
    
/**
     * 使用wsad进行控制
     * 也可以改为上下左右键
     *
     * @param e
     */
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
    }
}
```

> 实现`KeyListener`接口并且监听对应的方法。
>
> JAVA的GUI有一个事件监听驱动模型，意思就是说我们实现对应的驱动接口，并且覆盖对应的方法，在代码运行并且触发相关事件的适合，模型就可以触发我们实现定义好的代码，这里很明显就是设计模式，有兴趣可以去了解一下

### 第三个版本

从这个版本就开始变得稍微复杂一点了，用了多线程的内容，因为要让我们的坦克和敌人的坦克“动”起来，其实让坦克移动和我方坦克移动的道理都是一样的：高速的**擦写和描绘**。和我们的鼠标以及计算机显示画面的本质都是一样的。

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210129173134.png)

这个版本中，比较核心的内容是如何发射子弹和让子弹消失：

```java
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
    
    // 省略get/set

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

```

1. 在坦克的内部维护一个变量`isOut`，判定有没有越界
2. 如果出现了越界，则flag进行设置

接着，在绘画的方法里面，判定有没有越界：

```java
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
```

### 第四个版本：

从这一个版本开始，一个游戏的简单雏形已经有了，这一个版本实现了让敌人移动的同时发射子弹的功能，同时我方的坦克射击敌人的时候，可以让敌人消失

#### 怎么样让敌人可以边移动边发射子弹：

我们需要在敌人的多线程`run`代码里面，然敌人进行间歇性的走动：

```java
 @Override
    //我们发现坦克在原地抽搐，我们要实现坦克的平稳运行
    //实现坦克运动不会越界
    public void run() {
  
        do {
            switch (this.direct) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (y > 0)
                            y -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (x < 500)
                            x += sreed;
                        try {
                            // 短暂的停顿
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (y < 400)
                            y += sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (x > 0)
                            x -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;

            }
            //不同的方向移动的方向不同
            this.direct = (int) (Math.random() * 4);

        } while (this.isLive);
    }

```

至于生成子弹，需要定时去轮询所有的坦克，检查坦克中组合的子弹集合是否存在子弹，如果小于一定的数量，需要生成对应的子弹对象同时加入到敌人的坦克当中。由于子弹创建就会开始执行线程进行

```java
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
```

在子弹类当中进行不断的数值改变：

下面的内容表示子弹的类

```java
public class Bullet implements Runnable {
    //隐藏一大段代码：
    
public void run() {
      
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
           
        }
    }
}
```

### 第五个版本：

在第五个版本当中，我们实现了开始菜单的界面，同时视线菜单的不断显示：

界面会不断的闪烁

接着，敌人增加了子弹可以摧毁我们的方法

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145231.png)

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145253.png)

接着，我们可以实现爆炸的效果：

> 由于爆炸的效果不好截图，请看源代码

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145348.png)

```java
/**
 * 实现闪烁功能
 * 重构坦克 - 第五版
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */
class SelectIsSallup extends JPanel implements Runnable {
	/**
	 * 时间属性
	 */
	int times = 0;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 600, 400);
        if (times % 2 == 0) {
            //画出文字
            Font font1 = new Font("华文新魏", Font.BOLD, 20);
            //设置字体的颜色
            g.setColor(Color.yellow);
            g.setFont(font1);
            g.drawString("stage 1", 200, 150);
        }

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if (times > 500)
                times = 0;
            times++;
            this.repaint();

        }
    }
}

```

#### 如何让敌人的子弹对我们造成伤害：

```java
/**
	 * 建立一个方法，判断是否产生碰撞
	 * 是否攻击了其他的坦克
	 * @return
	 */
	private boolean isTouchOther() {
        // 根据自己的方向进行选择判断
        switch (this.direct) {
            // 坦克向上走的时候
            case 0:
                // 取出所有的坦克对象
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //如果不是自己的坦克
                    if (et != this) {
                        //如果敌人的坦克朝上或者朝下的时候
                        if (et.direct == 0 || et.direct == 2) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                        }
                        //如果敌人是朝左边或者右边的时候
                        if (et.direct == 1 || et.direct == 3) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
                break;
            //	坦克想右边走的时候
            case 1:
                // 取出所有的坦克对象
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //如果不是自己的坦克
                    if (et != this) {
                        //如果敌人的坦克朝上或者朝下的时候
                        if (et.direct == 0 || et.direct == 2) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                        }
                        //如果敌人是朝左边或者右边的时候
                        if (et.direct == 1 || et.direct == 3) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30
                                    && this.y + 20 >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30
                                    && this.y + 20 >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }

                // 坦克想下的时候
            case 2:
                // 取出所有的坦克对象
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //如果不是自己的坦克
                    if (et != this) {
                        //如果敌人的坦克朝上或者朝下的时候
                        if (et.direct == 0 || et.direct == 2) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                return true;
                            }
                        }
                        //如果敌人是朝左边或者右边的时候
                        if (et.direct == 1 || et.direct == 3) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
                break;

            // 坦克向左移动的时候
            case 3:
                // 取出所有的坦克对象
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //如果不是自己的坦克
                    if (et != this) {
                        //如果敌人的坦克朝上或者朝下的时候
                        if (et.direct == 0 || et.direct == 2) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y + 20 >= et.y && this.y + 20 <= et.y + 30) {
                                return true;
                            }
                        }
                        //如果敌人是朝左边或者右边的时候
                        if (et.direct == 1 || et.direct == 3) {
                            //判断边界
                            //对于第一个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {

                                return true;
                            }
                            //对于第二个点进行判断
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y + 20 >= et.y && this.y + 20 <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
        }
        return false;

    }
```

### 最终版本：

在最终的版本当中，一个坦克大战的基本游戏算是完成了，当然还有很多需要完成点。

这里主要提示一下暂停这一个功能点：

暂停的主要思想是为坦克加一个状态去控制坦克的所有行为。让暂停的flag为false的时候，线程不在执行，绘画每次都是绘制在同一个位置。这样就造成了“暂停”的假象。

```java
//暂停功能
if(e.getKeyCode()==KeyEvent.VK_P)
{
    if(this.clickcount%2 == 0)
        mytank.setSuspend(false);
    else
        mytank.setSuspend(true);

    //利用循环将坦克类中的子弹速度变成0
    for(int x=0; x<vec.size(); x++)
    {
        en = vec.get(x);
        //敌方坦克移动速度归于0

        //坦克不允许移动
        if(this.clickcount%2 == 0)
            en.setSuspend(false);
        else
            en.setSuspend(true);
        for(int y=0; y<en.vecs.size(); y++)
        {
            //子弹的速度变成0
            if(this.clickcount%2 == 0)
                en.vecs.get(y).setSuspend(false);
            else
                en.vecs.get(y).setSuspend(true);

        }
    }
    this.clickcount++;

}
```

# 总结：

这个文档不是最终版本，如果有不懂的欢迎提issue，承诺给予答复但是不会再改动代码了。