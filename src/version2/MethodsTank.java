package version2;

import javax.swing.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : Tanks2
 * @Description : 重构坦克 - 第二版 坦克运行类
 * @Create on : 2021/1/29 16:36
 **/
public class MethodsTank extends JFrame {

    /**
     * 建立需要的组件
     * 绘制坦克的组件
     */
    DrawTank draw;

    //创建组件
    MethodsTank()
    {
        draw = new DrawTank();
        this.add();
    }

    public void add()
    {
        this.add(draw);

        //注册监听
        this.addKeyListener(draw);

        //设置窗体的一些基本属性
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
