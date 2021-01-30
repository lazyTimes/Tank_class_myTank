package version1;

import javax.swing.*;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : version1
 * @Description : 重构坦克大战 - 第一版
 * @Create on : 2021/1/29 16:01
 **/
public class MethodTank extends JFrame {

    /**
     * 建立需要的组件
     */
    DrawTank draw;

    /**
     * 创建组件
     */
    MethodTank() {
        draw = new DrawTank();
        this.add();
    }

    public void add() {
        this.add(draw);
        //设置窗体的一些基本属性
        this.setBounds(600, 400, 600, 400);
        // 关闭按钮
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 显示
        this.setVisible(true);
    }
}
