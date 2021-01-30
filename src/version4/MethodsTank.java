package version4;

import javax.swing.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version4
 * @Description : 充当运行的容器
 * @Create on : 2021/1/29 17:43
 **/
class MethodsTank extends JFrame {
    /**
     * 建立需要的组件
     */
    DrawTank draw;

    /**
     * 创建组件
     */
    MethodsTank() {
        draw = new DrawTank();
        this.add();
    }

    public void add() {
        this.add(draw);
        //注册监听
        this.addKeyListener(draw);

        //开启重新绘制的缓冲线程
        new Thread(draw).start();

        //设置窗体的一些基本属性
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
