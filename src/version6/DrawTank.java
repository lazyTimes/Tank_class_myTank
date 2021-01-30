package version6;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * ���հ�
 * ����̹��
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:50
 */
class DrawTank extends JPanel implements KeyListener,Runnable
{
	//����һ��̹��
	MyTank mytank;

	//������
	int mytank_x;
	int mytank_y;

	//ʹ��һ������װ�ص���̹����
	Vector<EnemyTank> vec;

	//�������̹�˵�����
	static int enemytankSize = 3;

	//����̹�˶���
	EnemyTank en;

	//�����ӵ���
	Bullet buts;


	//��������������ͣ��������
	private int clickcount = 0;

	//����ͼƬ
	Image img1;
	Image img2;
	Image img3;

	//����һ��ը���ļ���
	Vector<Booms> bosvec;



	public DrawTank()
	{
		//���캯����ʼ����ȡ�ļ�
		ReCord.readALLSum();


		mytank = new MyTank(200, 200);
		//ʹ��Vector���ϱ���з�̹��
		vec = new Vector<EnemyTank>();

		//��ʼ�����˵�̹��
		//����:��ʼ�����˵�̹�˵�ʱ��Ҫ�����߳�
		//�������ڳ�ʼ��������ʼ��Ҫ�������뵽̹���൱��
		for (int x=0; x<enemytankSize; x++)
		{
			en = new EnemyTank((x+1)*50, 0);
			en.setVector(vec);
			new Thread(en).start();

			//��ʼ��̹�˵�ͬʱ����һ���ӵ�
			Bullet buts = new Bullet(en.getX()+10, en.getY()+20, en.getDirect());
			//���ӵ���ӵ���Ӧ���ӵ����ϵ���
			en.vecs.add(buts);
			//���������ӵ��ƶ����߳�
			new Thread(buts).start();

			en.setColor(2);
			vec.add(en);
		}

		try {
			img1 = ImageIO.read(new File("image/bomb1.gif"));
			img2 = ImageIO.read(new File("image/bomb2.gif"));
			img3 = ImageIO.read(new File("image/bomb3.gif"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		//ը�����ϵĳ�ʼ��
		bosvec = new Vector<Booms>();
	}

	public void hitMyTank()
	{
		//ʵ���ҷ�̹�˱�����֮�������ը
		for(int x=0; x<vec.size(); x++)
		{

			EnemyTank enny = vec.get(x);
			if(enny.isLive())
			{
				for(int y=0; y<enny.vecs.size(); y++)
				{
					Bullet bult = enny.vecs.get(y);
					if(bult.isOut==false && mytank.isLive)
						this.hitTank(mytank, bult);
				}
			}
		}
	}

	//�ڿ�ʼ��Ϸ֮ǰ�Ȼ�����ʾ��Ϣ
	private void paintInfomation(Graphics g)
	{
		//�����з���ʾ̹��
		g.setColor(Color.blue);
		Font f1 = new Font("����", Font.BOLD, 20);
		g.setFont(f1);
		g.drawString("X"+vec.size(), 650, 35);
		//�����Ͻǻ���һ��̹��
		paintTank(620, 25, g, 2, 0);

		//�����ҷ���ʾ̹��
		g.setColor(Color.red);
		Font f2 = new Font("����", Font.BOLD, 20);
		g.setFont(f2);

		g.drawString("X"+ ReCord.getAllSum(), 650, 75);
		//�����Ͻǻ���һ��̹��
		paintTank(620, 60, g, 2, 1);

	}


	public void paint(Graphics g)
	{
		super.paint(g);



		//��������ɫ
		g.setColor(Color.black);
		g.fill3DRect(0, 0, 600, 400, false);

		this.paintInfomation(g);

		//�����Լ���̹��,���ж�̹���Ƿ����
		if(mytank.isLive)
			paintTank(mytank.getX(), mytank.getY(), g, mytank.getDirect(), mytank.getColor());


		//����ը��
		for(int x=0; x<bosvec.size(); x++)
		{
			//ȡ��ը������
			Booms bos = bosvec.get(x);

			//�������ֳ�����

			//����ֵ����6��ʱ��
			if(bos.getLife()>6)
			{
				//�Ƿ񻭳���ը��
				g.drawImage(img1, bos.x, bos.y, 50, 50, this);
			}
			else if(bos.getLife()>3)
			{
				g.drawImage(img2, bos.x, bos.y,  50, 50, this);
			}
			else
			{
				g.drawImage(img3, bos.x, bos.y,  50, 50, this);
			}

			bos.lifeDown();
			if(bos.getLife()==0)
			{
				//������ֵΪ0����Ҫ�Ƴ�ը��
				bosvec.remove(bos);
			}

		}

		//�������˵�̹��
		this.paintEnemyTank(g);

		//�����Լ�̹�˵��ӵ�
		for(int x=0; x<this.mytank.vecs.size(); x++)
		{
			//�����ӵ�����ȷ��û��Խ��
			mytank.but = mytank.vecs.get(x);

			//����ӵ�û��Խ������ӵ���Ϊ�վͻ����ӵ�
			if(mytank.but!=null &&  mytank.but.isOut!=true)
			{
				g.setColor(Color.red);
				g.fill3DRect(mytank.but.getX(), mytank.but.getY(), 5, 5, false);
			}
			//���ӵ�Խ����߻��е��ˣ���Ҫ�Ӽ�����ȥ������
			if(mytank.but.isOut==true)
			{
				mytank.vecs.remove(mytank.but);
			}
		}
	}

	//дһ������ר���ж��Ƿ����Ŀ��,��Ҫ�ӵ�����͵���̹�˶���
	/*
	 * 		�����ٵ���̹�˵ķ������ó�һ��Booleanֵ
	 *
	 * */
	public boolean hitTank(FatherTank ens, Bullet bul)
	{
		//�ж��Ƿ񱻻��ٵĲ���
		boolean istouch = false;

		//�����ж�̹���Ƿ����

		//���жϵз�̹�˵ķ���
		switch(ens.getDirect())
		{
			case 0:
			case 2:
			{
				//�����˵з�̹��
				//�������ӵ����𣬵�������
				if(bul.getX()>ens.getX() && bul.getX()<ens.getX()+20
						&& bul.getY()<ens.getY()+30 && bul.getY()>ens.getY())
				{
					//�Ƿ񵽴�ָ����Χ

					istouch = true;

					ens.setLive(false);
					bul.setOut(true);
					//�Ӽ��ϵ����Ƴ�̹��
					vec.remove(ens);

					//������̹�˱����д���ը��,�����˵�����λ�ô���ȥ
					Booms bo = new Booms(ens.getX(), ens.getY());
					//��ը�����뵽���ϵ���
					bosvec.add(bo);

				}

			}
			break;
			case 1:
			case 3:
			{
				if(bul.getX()>ens.getX() && bul.getX()<ens.getX()+30
						&& bul.getY()<ens.getY()+20 && bul.getY()>ens.getY())
				{

					ens.setLive(false);
					bul.setOut(true);

					//�Ӽ��ϵ����Ƴ�̹��
					vec.remove(ens);
					istouch = true;


					//������̹�˱����д���ը��,�����˵�����λ�ô���ȥ
					Booms bo = new Booms(ens.getX(), ens.getY());
					//��ը�����뵽���ϵ���
					bosvec.add(bo);
					break;
				}

			}
		}
		return istouch;
	}

	public void paintEnemyTank(Graphics g)
	{
		//ʹ�ü��ϵĴ�С��ȷ��������̹��
		for(int i=0; i<vec.size(); i++)
		{
			EnemyTank et = vec.get(i);
			//���̹���Ѿ������𣬾Ͳ�Ҫ������
			if(et.isLive)
			{
				paintTank(vec.get(i).getX(), vec.get(i).getY(), g, vec.get(i).getDirect(), vec.get(i).getColor());

				//����̹�˵�ͬʱ�����ӵ�
				for(int y=0; y<et.vecs.size(); y++)
				{
					//ȡ���ӵ�
					Bullet but = et.vecs.get(y);
					if(but.isOut()==false)
						g.fill3DRect(but.getX(), but.getY(), 5, 5, false);
					else
						et.vecs.remove(but);
				}
			}


		}

	}

	/*
	 * 		��̹����Ҫ��ȡ��װ
	 * 		1.������֮ǰ��ȷ����ɫ���ǵ���̹�˻����ҷ�̹��
	 * 		2.����Ϊ�����������ʣ���Ҫ��,�Լ�̹�����ͺͷ���
	 * */
	private void paintTank(int x, int y, Graphics g, int direct, int color)
	{
		//��֮ǰ��ȷ��̹�˵���ɫ
		switch(color)
		{
			case 1:
			{
				g.setColor(Color.red);
				break;
			}
			case 2:
			{
				g.setColor(Color.cyan);
				break;
			}
		}

		//0�����ϣ�1�����ң�2�����£�3������
		switch(direct)
		{
			//����
			case 0:
			{
				//�Ȼ����ҵ�̹��
				//������ߵľ��Σ���������ɫ
				g.fill3DRect(x, y, 5, 30, false);
				//�����м�ĳ�����
				g.fill3DRect(x+5, y+5, 10, 20, false);
				//�����м�ԲȦ,ʹ�������Բ
				g.fillOval(x+6, y+9, 7, 7);
				//����һ��ֱ��
				g.drawLine(x+10, y, x+10, y+15);
				//������һ�߾���
				g.fill3DRect(x+15, y, 5, 30, false);
				this.repaint();
				break;

			}
			//��չ��������ͬ���������
			case 1:
			{
				g.fill3DRect(x, y, 30, 5, false);
				g.fill3DRect(x+5, y+5, 20, 10, false);
				g.fillOval(x+10, y+7, 7, 7);
				g.drawLine(x+10, y+10, x+30, y+10);
				g.fill3DRect(x, y+15, 30, 5, false);
				this.repaint();
				break;
			}
			case 2:
			{
				//�Ȼ����ҵ�̹��
				//������ߵľ��Σ���������ɫ
				g.fill3DRect(x, y, 5, 30, false);
				//�����м�ĳ�����
				g.fill3DRect(x+5, y+5, 10, 20, false);
				//�����м�ԲȦ,ʹ�������Բ
				g.fillOval(x+6, y+9, 7, 7);
				//����һ��ֱ��
				g.drawLine(x+10, y+10, x+10, y+30);
				//������һ�߾���
				g.fill3DRect(x+15, y, 5, 30, false);
				this.repaint();
				break;
			}
			case 3:
			{
				g.fill3DRect(x, y, 30, 5, false);
				g.fill3DRect(x+5, y+5, 20, 10, false);
				g.fillOval(x+10, y+7, 7, 7);
				g.drawLine(x, y+10, x+10, y+10);
				g.fill3DRect(x, y+15, 30, 5, false);
				this.repaint();
				break;
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		//���̹��û�б��������ִ�����в���

		if(mytank.isLive)
		{

			if (e.getKeyCode()==KeyEvent.VK_W)
			{
				//System.out.println(mytank.getX());
				if(mytank.isSuspend())
					this.mytank.setDirect(0);
				this.mytank.move_up();
			}
			else if (e.getKeyCode()==KeyEvent.VK_D)
			{
				//System.out.println(mytank.getX());
				if(mytank.isSuspend())
					this.mytank.setDirect(1);
				this.mytank.move_right();
			}
			else if (e.getKeyCode()==KeyEvent.VK_S)
			{
				//System.out.println(mytank.getX());
				if(mytank.isSuspend())
					this.mytank.setDirect(2);
				this.mytank.move_down();
			}
			else if (e.getKeyCode()==KeyEvent.VK_A)
			{
				//System.out.println("x = "+mytank.getX());
				//�ı䷽��
				if(mytank.isSuspend())
					this.mytank.setDirect(3);
				this.mytank.move_left();

			}

			//�ж��Ƿ�����J��
			if (e.getKeyCode()==KeyEvent.VK_J)
			{
				//�޶�����ٶȡ�
				if(mytank.vecs.size()<5)
				{
					if(mytank.isSuspend())
						mytank.shot();
					//System.out.println("���");
				}

			}

			//��ͣ����
			if(e.getKeyCode()==KeyEvent.VK_P)
			{
				if(this.clickcount%2 == 0)
					mytank.setSuspend(false);
				else
					mytank.setSuspend(true);

				//����ѭ����̹�����е��ӵ��ٶȱ��0
				for(int x=0; x<vec.size(); x++)
				{
					en = vec.get(x);
					//�з�̹���ƶ��ٶȹ���0

					//̹�˲������ƶ�
					if(this.clickcount%2 == 0)
						en.setSuspend(false);
					else
						en.setSuspend(true);
					for(int y=0; y<en.vecs.size(); y++)
					{
						//�ӵ����ٶȱ��0
						if(this.clickcount%2 == 0)
							en.vecs.get(y).setSuspend(false);
						else
							en.vecs.get(y).setSuspend(true);

					}
				}
				this.clickcount++;

			}
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {


	}

	@Override
	public void keyTyped(KeyEvent e) {


	}

	//�з�̹�˱��ӵ�����
	private void HitEnemy_Tank()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		//�ж��Ƿ����
		for(int x=0; x<mytank.vecs.size(); x++)
		{
			//ÿһ���ӵ���ÿһ��̹��ƥ��
			//ȡ��һ���ӵ�֮ǰ�ж��Ƿ����ӵ�
			buts = mytank.vecs.get(x);

			//�ж��ӵ��Ƿ���Ч
			if(buts.isOut()!=true)
			{
				//ȡ��ÿһ��̹�������ж�
				for(int y=0; y<vec.size(); y++)
				{
					//�жϵз�̹���Ƿ�����
					if(vec.get(y).isLive())
					{
						en = vec.get(y);
						//�����ж��Ƿ���в���
						if(this.hitTank(en, buts)==true)
						{
							ReCord.addAllSum();

						}
					}
				}
			}

		}
	}

	@Override
	public void run() {

		//�޶�һ��ʱ�����»���

		while(true)
		{
			//�ж��Ƿ���е���
			this.HitEnemy_Tank();

			//�ж��Ƿ�����ҷ�̹��
			this.hitMyTank();

			//�ػ�
			this.repaint();
		}
	}
}
