package version5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * �ع�̹�� - �����
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */
class MethodsTank extends JFrame implements ActionListener {
    //������Ҫ�����
    DrawTank draw;
    SelectIsSallup ses;

    //�����������������
    private int width = 700, height = 450;

    //������Ҫ�����
    /*
     * 		�˵���Ŀ�Լ��ؿ�ѡ��
     * */
    JMenu jm;
    JMenuBar jmb;
    JMenuItem jl1, jl2, jl3;


    //�������
    public MethodsTank() {
        //���������
        jm = new JMenu("�ҵĲ˵�(G)");
        jmb = new JMenuBar();
        jl1 = new JMenuItem("��ʼ����Ϸ(F)");
        jl2 = new JMenuItem("������Ϸ");
        jl3 = new JMenuItem("���¿�ʼ");

        draw = new DrawTank();
        ses = new SelectIsSallup();

        //���ÿ�ݼ���ʽ
        jm.setMnemonic('G');
        jl1.setMnemonic('f');
        jl3.setMnemonic('r');


        //������˸�߳�
        new Thread(ses).start();
        //�����п�ʼ����
        this.addTank();

    }


    public void addTank() {
        //��Ӳ˵���Ŀ
        jm.add(jl1);
        jm.add(jl2);
        jm.add(jl3);
        jmb.add(jm);

        //����ѡ�ؽ���
        this.add(ses);


        //�����Ӳ˵�����¼�
        jl1.addActionListener(this);
        jl1.setActionCommand("newgame");
        jl2.addActionListener(this);
        jl2.setActionCommand("gameexit");
        jl3.addActionListener(this);
        jl3.setActionCommand("restart");

        //���ô����һЩ��������
        this.setTitle("�ҵ�̹�˴�ս");
        this.setBounds(600, 350, width, height);
        //��Ӳ˵����ķ�ʽ
        this.setJMenuBar(jmb);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);


        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //���
        if (e.getActionCommand().equals("newgame")) {

            this.add(draw);
            this.remove(ses);
            //ע�����
            this.addKeyListener(draw);
            //�����½���֮ǰҪ�Ƴ��ɵĽ���
            //�������»��ƵĻ����߳�
            new Thread(draw).start();
            //��ʾһ�£�ˢ�½���
            this.setVisible(true);
        }
        if (e.getActionCommand().equals("gameexit")) {


            System.exit(0);
        }
        if (e.getActionCommand().equals("restart")) {
            this.remove(draw);
            draw = new DrawTank();
            this.add(draw);
            //ע�����
            this.addKeyListener(draw);
            //�����½���֮ǰҪ�Ƴ��ɵĽ���
            //�������»��ƵĻ����߳�
            new Thread(draw).start();
            //��ʾһ�£�ˢ�½���
            this.setVisible(true);
        }
    }
}
