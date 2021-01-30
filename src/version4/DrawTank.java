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
 * @Description : �ع�̹�� - ���İ�
 * @Create on : 2021/1/29 17:44
 **/ //�����Ѵ�����Ҫ�����ӵ�������ÿ��̹�˷����ӵ����ǲ�ͬ��������Ҫʹ�ö��߳�
class DrawTank extends JPanel implements KeyListener, Runnable {
    //����һ��̹��
    MyTank mytank;

    //ʹ��һ������װ�ص���̹����
    Vector<EnemyTank> vec;

    //�������̹�˵�����
    int enemytankSize = 3;

    //����̹�˶���
    EnemyTank en;

    //�����ӵ���
    Bullet buts;

    //����ͼƬ
    Image img1;
    Image img2;
    Image img3;

    //����һ��ը���ļ���
    Vector<Booms> bosvec;

    /**
     * �滭̹�˺��ӵ�
     */
    public DrawTank() {
        mytank = new MyTank(10, 10);
        //ʹ��Vector���ϱ���з�̹��
        vec = new Vector<EnemyTank>();

        //��ʼ�����˵�̹��
        //����:��ʼ�����˵�̹�˵�ʱ��Ҫ�����߳�
        for (int x = 0; x < enemytankSize; x++) {
            en = new EnemyTank((x + 1) * 50, 0);
            new Thread(en).start();

            //��ʼ��̹�˵�ͬʱ����һ���ӵ�
            Bullet buts = new Bullet(en.getX() + 10, en.getY() + 20, en.getDirect());
            //���ӵ���ӵ���Ӧ���ӵ����ϵ���
            en.vecs.add(buts);
            //���������ӵ��ƶ����߳�
            new Thread(buts).start();
            // ����̹����ɫ
            en.setColor(2);
            // ����װ��
            vec.add(en);
        }

        //��ʼ��ͼƬ
//		img1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms1.png"));
//		img2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms2.png"));
//		img3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("image/boms3.png"));

        //ը�����ϵĳ�ʼ��
        bosvec = new Vector<Booms>();
    }

    public void paint(Graphics g) {
        super.paint(g);

        //��������ɫ
        g.fill3DRect(0, 0, 600, 400, false);
        //�����Լ���̹��
        paintMyTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), mytank.getColor());

        //����ը��
        for (int x = 0; x < bosvec.size(); x++) {
            //ȡ��ը������
            Booms bos = bosvec.get(x);

            //�������ֳ�����

            //����ֵ����6��ʱ��
            if (bos.getLife() > 6) {
                //�Ƿ񻭳���ը��
                g.drawImage(img1, bos.x, bos.y, 100, 100, this);
            }
            if (bos.getLife() > 3) {
                g.drawImage(img2, bos.x, bos.y, 100, 100, this);
            } else {
                g.drawImage(img3, bos.x, bos.y, 30, 30, this);
            }

            bos.lifeDown();
            if (bos.getLife() == 0) {
                //������ֵΪ0����Ҫ�Ƴ�ը��
                bosvec.remove(bos);
            }

        }

        //�������˵�̹��
        paintEnemyTank(g);

        //�����Լ�̹�˵��ӵ�
        for (int x = 0; x < this.mytank.vecs.size(); x++) {
            //�����ӵ�����ȷ��û��Խ��
            mytank.but = mytank.vecs.get(x);

            //����ӵ�û��Խ������ӵ���Ϊ�վͻ����ӵ�
            if (mytank.but != null && !mytank.but.isOut) {
                g.fill3DRect(mytank.but.getX(), mytank.but.getY(), 5, 5, false);
            }
            //���ӵ�Խ����߻��е��ˣ���Ҫ�Ӽ�����ȥ������
            if (mytank.but.isOut) {
                mytank.vecs.remove(mytank.but);
            }
        }

//		//��������̹�˵��ӵ�
//		for(int x=0; x<vec.size(); x++)
//		{
//			System.out.println("ȡ���ӵ�");
//			//ȡ��̹�˶���
//			enemy_Tank ens = vec.get(x);
//			for(int y=0; y<ens.vecs.size(); y++)
//			{
//				g.fill3DRect(ens.getX(), ens.getY(), 5, 5, false);
//			}
//		}


    }

    /**
     * дһ������ר���ж��Ƿ����Ŀ��,��Ҫ�ӵ�����͵���̹�˶���
     *
     * @param ens ����̹��
     * @param bul �ӵ�
     */
    private void hitTank(EnemyTank ens, Bullet bul) {
        //���жϵط�̹�˵ķ���
        switch (ens.getDirect()) {
            case 0:
            case 2: {
                //�����˵ط�̹��
                //�������ӵ����𣬵�������
                if (bul.getX() > ens.getX() && bul.getX() < ens.getX() + 20
                        && bul.getY() < ens.getY() + 30 && bul.getY() > ens.getY()) {
                    //�Ƿ񵽴�ָ����Χ
                    ens.setLive(false);
                    bul.setOut(true);
                    //������̹�˱����д���ը��,�����˵�����λ�ô���ȥ
                    Booms bo = new Booms(ens.getX(), ens.getY());
                    //��ը�����뵽���ϵ���
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

                    //������̹�˱����д���ը��,�����˵�����λ�ô���ȥ
                    Booms bo = new Booms(ens.getX(), ens.getY());
                    //��ը�����뵽���ϵ���
                    bosvec.add(bo);
                    break;
                }

            }
        }
    }

    /**
     * �������˵�̹��
     *
     * @param g
     */
    private void paintEnemyTank(Graphics g) {
        //ʹ�ü��ϵĴ�С��ȷ��������̹��
        for (int i = 0; i < vec.size(); i++) {
            EnemyTank et = vec.get(i);
            //���̹���Ѿ������𣬾Ͳ�Ҫ������
            if (et.isLive) {
                paintMyTank(et.getX(), et.getY(), g, et.getDirect(), et.getColor());

                //����̹�˵�ͬʱ�����ӵ�
                for (int y = 0; y < et.vecs.size(); y++) {
                    //ȡ���ӵ�
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

        //�ж��Ƿ�����J��
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //�޶�����ٶȡ�
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
        //�޶�һ��ʱ�����»���
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //�ж��Ƿ����
            for (int x = 0; x < mytank.vecs.size(); x++) {
                //ÿһ���ӵ���ÿһ��̹��ƥ��
                //ȡ��һ���ӵ�֮ǰ�ж��Ƿ����ӵ�
                buts = mytank.vecs.get(x);

                //�ж��ӵ��Ƿ���Ч
                if (buts.isOut()) {
                    continue;
                }
                //ȡ��ÿһ��̹�������ж�
                for (int y = 0; y < vec.size(); y++) {
                    //�жϵз�̹���Ƿ�����
                    if (vec.get(y).isLive) {
                        en = vec.get(y);
                        //�����ж��Ƿ���в���
                        hitTank(en, buts);
                    }
                }

            }

            //����ӵ���С��һ����Ŀ
            for (int x = 0; x < vec.size(); x++) {
                EnemyTank et = vec.get(x);
                //����ÿһ��̹�˵��ӵ�����
                if (!et.isLive()) {
                    continue;
                }
                if (et.vecs.size() < 1) {
                    //���ڲ�ͬ��̹�˷��������ӵ��ķ���Ҳ��ͬ
                    Bullet enybut = null;
                    switch (et.getDirect()) {
                        case 0:
                            enybut = new Bullet(et.getX() + 10, et.getY(), 0);
                            //���������ӵ����뵽���ϵ���
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
            //�ػ�
            this.repaint();
        }
    }


}
