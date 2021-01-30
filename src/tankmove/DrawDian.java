package tankmove;

import javax.swing.*;
import java.awt.*;

/**
 * @author zxd
 * @version v1.0.0
 * @Package : tankmove
 * @Description : 圆点
 * @Create on : 2021/1/29 18:07
 **/ //绘制点
class DrawDian extends JPanel {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void paint(Graphics g) {
        super.paint(g);
        // 画一个点
        g.fillOval(x, y, 10, 10);
        this.repaint();
    }


}
