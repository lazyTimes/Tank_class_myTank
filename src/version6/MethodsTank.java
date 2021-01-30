package version6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 最终版：
 * 坦克的画布
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:50
 */
class MethodsTank extends JFrame implements ActionListener {
	/**
	 * 建立需要的组件
	 */
	DrawTank draw;
	/**
	 * 开始界面
	 * 闪烁
	 */
	selectIsSallup ses;

    //建立宽与高两个属性
    private int width = 700, height = 450;

    //定义需要的组件
    /*
     * 		菜单栏目以及关卡选项
     * */
    JMenu jm;
	/**
	 * 菜单
	 */
	JMenuBar jmb;

	/**
	 * 菜单按钮
	 */
	JMenuItem jl1, jl2, jl3, jl4, jl5;


    //创建组件
    public MethodsTank() {
        //创建组件等
        jm = new JMenu("我的菜单(G)");
        jmb = new JMenuBar();
        jl1 = new JMenuItem("开始新游戏(F)");
        jl2 = new JMenuItem("结束游戏");
        jl3 = new JMenuItem("重新开始(R)");
        jl4 = new JMenuItem("存盘退出");
        jl5 = new JMenuItem("回到上次游戏");

        draw = new DrawTank();
        ses = new selectIsSallup();

        //设置快捷键方式
        jm.setMnemonic('G');
        jl1.setMnemonic('f');
        jl3.setMnemonic('r');
        jl4.setMnemonic('q');
        jl5.setMnemonic('w');

        //开启闪烁线程
        new Thread(ses).start();
        //先运行开始画面
        this.addTank();

    }


    public void addTank() {
        //添加菜单栏目
        jm.add(jl1);
        jm.add(jl2);
        jm.add(jl3);
        jm.add(jl4);
        jm.add(jl5);
        jmb.add(jm);

        //运行选关界面
        this.add(ses);


        //对于子菜单添加事件
        jl1.addActionListener(this);
        jl1.setActionCommand("newgame");
        jl2.addActionListener(this);
        jl2.setActionCommand("gameexit");
        jl3.addActionListener(this);
        jl3.setActionCommand("restart");


        //设置窗体的一些基本属性
        this.setTitle("我的坦克大战");
        this.setBounds(600, 350, width, height);
        //添加菜单栏的方式
        this.setJMenuBar(jmb);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);


        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //标记
        if (e.getActionCommand().equals("newgame")) {

            this.add(draw);
            this.remove(ses);
            //注册监听
            this.addKeyListener(draw);
            //开启新界面之前要移除旧的界面
            //开启重新绘制的缓冲线程
            new Thread(draw).start();
            //显示一下，刷新界面
            this.setVisible(true);
        }
        if (e.getActionCommand().equals("gameexit")) {

            ReCord.SaveAllSum();

            System.exit(0);
        }
        if (e.getActionCommand().equals("restart")) {
            this.remove(draw);
            draw = new DrawTank();
            this.add(draw);
            //注册监听
            this.addKeyListener(draw);
            //开启新界面之前要移除旧的界面
            //开启重新绘制的缓冲线程
            new Thread(draw).start();
            //显示一下，刷新界面
            this.setVisible(true);
        }
    }
}
