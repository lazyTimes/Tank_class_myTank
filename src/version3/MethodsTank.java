package version3;

import javax.swing.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : version3
 * @Description : 重构坦克 - 第三版 坦克绘制框架
 * @Create on : 2021/1/29 17:29
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

	/**
	 * 构建基本的画布
	 */
	public void add() {
        this.add(draw);

        //注册监听
        this.addKeyListener(draw);

        //设置窗体的一些基本属性
        this.setBounds(600, 400, 600, 400);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
