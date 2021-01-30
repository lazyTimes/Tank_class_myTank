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
 * @Description : �ع�̹�� - ������ �滭̹�˵ķ���
 * @Create on : 2021/1/29 17:26
 **/
public class DrawTank extends JPanel implements KeyListener {
	/**
	 * ����һ��̹��
	 */
	MyTank mytank;

	/**
	 * ʹ��һ������װ�صط�̹����
	 */
	Vector<EnemyTank> vec;

	/**
	 * �������̹�˵�����
	 */
	int enemytankSize = 3;

    public DrawTank() {
        mytank = new MyTank(10, 10);
        //ʹ��Vector���ϱ���з�̹��
        vec = new Vector<EnemyTank>();

        //��ʼ�����˵�̹��
        for (int x = 0; x < enemytankSize; x++) {
            EnemyTank en = new EnemyTank((x + 1) * 50, 0);
            en.setColor(2);
            vec.add(en);
        }

    }

	/**
	 * �滭����
	 * @param g
	 */
	@Override
	public void paint(Graphics g) {
        super.paint(g);

        //��������ɫ
        g.fill3DRect(0, 0, 600, 400, false);
        //�����Լ���̹��
        paintMyTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), mytank.getColor());
        //�������˵�̹��
        paintEnemyTank(g);

        //�����ӵ�����ȷ��û��Խ��
        if (mytank.but != null && !mytank.but.isOut) {
            g.fill3DRect(mytank.but.getX(), mytank.but.getY(), 5, 5, false);
        }
    }

	/**
	 * ������̹�˵ķ���
	 * @param g
	 */
	public void paintEnemyTank(Graphics g) {
        //ʹ�ü��ϵĴ�С��ȷ��������̹��
        for (int i = 0; i < vec.size(); i++) {
            paintMyTank(vec.get(i).getX(), vec.get(i).getY(), g, vec.get(i).getDirect(), vec.get(i).getColor());
        }
    }

    /**
     * ��̹����Ҫ��ȡ��װ
     * 1.������֮ǰ��ȷ����ɫ���ǵ���̹�˻����ҷ�̹��
     * 2.����Ϊ�����������ʣ���Ҫ��,�Լ�̹�����ͺͷ���
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, int color) {
        //��֮ǰ��ȷ��̹�˵���ɫ
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

        //0�����ϣ�1�����ң�2�����£�3������
        switch (direct) {
            //����
            case 0: {
                //�Ȼ����ҵ�̹��
                //������ߵľ��Σ���������ɫ
                g.fill3DRect(x, y, 5, 30, false);
                //�����м�ĳ�����
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //�����м�ԲȦ,ʹ�������Բ
                g.fillOval(x + 6, y + 9, 7, 7);
                //����һ��ֱ��
                g.drawLine(x + 10, y, x + 10, y + 15);
                //������һ�߾���
                g.fill3DRect(x + 15, y, 5, 30, false);
                this.repaint();
                break;

            }
            //��չ��������ͬ���������
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
                //�Ȼ����ҵ�̹��
                //������ߵľ��Σ���������ɫ
                g.fill3DRect(x, y, 5, 30, false);
                //�����м�ĳ�����
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //�����м�ԲȦ,ʹ�������Բ
                g.fillOval(x + 6, y + 9, 7, 7);
                //����һ��ֱ��
                g.drawLine(x + 10, y + 10, x + 10, y + 30);
                //������һ�߾���
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
            //�ı䷽��
            this.mytank.setDirect(3);
            this.mytank.move_left();

        }

        //�ж��Ƿ�����J�����������
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
