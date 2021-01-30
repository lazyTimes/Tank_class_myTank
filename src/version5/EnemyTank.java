package version5;

import java.util.Vector;

/*
 * 		此类中装的是坦克类
 * 		包含敌人坦克类和我方坦克类
 * 			
 * 		子弹类需要不断地重画与改变坐标轴，所以可以设计一个线程
 * 		子弹需要多线程化，减少内存占用
 * 
 * 		已知问题，子弹需要在射中敌人或者越界的时候销毁
 * 		解决方法：越界问题经由一个if判断边界解决
 * 
 * 		已知问题：敌方子弹无法移动
 * 
 * 		已知问题;我方只能发射一个子弹
 * */


//敌人坦克类,给坦克升级
//实现多线程
public class EnemyTank extends FatherTank implements Runnable
{
	
	

	//通过一个集合访问外界的变量
	private Vector<EnemyTank> enevec;
	

	public EnemyTank(int x, int y) {
		super(x, y);

		super.setColor(1);
		
		//设置初始化方向和速度
		this.direct = 2;
		this.sreed = 1;
		
		vecs = new Vector<Bullet>();
		enevec = new Vector<EnemyTank>();
	}
	
	
	
	public boolean isLive() {
		return isLive;
	}
	
	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}
	
	//建立一个方法，判断是否产生碰撞
	private boolean isTouchOther() {

		// 根据自己的方向进行选择判断
		switch (this.direct) {
		// 坦克向上走的时候
		case 0:
			// 取出所有的坦克对象
			for (int x = 0; x < enevec.size(); x++) {
				EnemyTank et = enevec.get(x);
				//如果不是自己的坦克
				if(et != this)
				{
					//如果敌人的坦克朝上或者朝下的时候
					if(et.direct==0 || et.direct ==2)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+20
								&& this.y >= et.y && this.y <= et.y+30)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+20 >= et.x && this.x+20 <= et.x+20
								&& this.y >= et.y && this.y <= et.y+30)
						{
							return true;
						}
					}
					//如果敌人是朝左边或者右边的时候
					if(et.direct==1 || et.direct==3)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+30
								&& this.y >= et.y && this.y <= et.y+20)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+20 >= et.x && this.x+20 <= et.x+30
								&& this.y >= et.y && this.y <= et.y+20)
						{
							return true;
						}
					}
				}
				
			}
			break;
		//	坦克想右边走的时候
		case 1:
			// 取出所有的坦克对象
			for (int x = 0; x < enevec.size(); x++) {
				EnemyTank et = enevec.get(x);
				//如果不是自己的坦克
				if(et != this)
				{
					//如果敌人的坦克朝上或者朝下的时候
					if(et.direct==0 || et.direct ==2)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x+30 >= et.x && this.x+30 <=et.x+20
								&& this.y >= et.y && this.y <= et.y+30)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+30 >= et.x && this.x+30 <= et.x+20
								&& this.y >= et.y && this.y <= et.y+30)
						{
							return true;
						}
					}
					//如果敌人是朝左边或者右边的时候
					if(et.direct==1 || et.direct==3)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x+30 >= et.x && this.x+30 <=et.x+30
								&& this.y+20 >= et.y && this.y <= et.y+20)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+30 >= et.x && this.x+30 <= et.x+30
								&& this.y+20 >= et.y && this.y <= et.y+20)
						{
							return true;
						}
					}
				}
				
			}
			
		// 坦克想下的时候
		case 2:
			// 取出所有的坦克对象
			for (int x = 0; x < enevec.size(); x++) {
				EnemyTank et = enevec.get(x);
				//如果不是自己的坦克
				if(et != this)
				{
					//如果敌人的坦克朝上或者朝下的时候
					if(et.direct==0 || et.direct ==2)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+20
								&& this.y+30 >= et.y && this.y+30 <= et.y+30)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+20 >= et.x && this.x+20 <= et.x+20
								&& this.y+30 >= et.y && this.y+30 <= et.y+30)
						{
							return true;
						}
					}
					//如果敌人是朝左边或者右边的时候
					if(et.direct==1 || et.direct==3)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+30
								&& this.y+30 >= et.y && this.y+30 <= et.y+20)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x+20 >= et.x && this.x+20 <= et.x+30
								&& this.y+30 >= et.y && this.y+30 <= et.y+20)
						{
							return true;
						}
					}
				}
				
			}
			break;
			
		// 坦克向左移动的时候
		case 3:
			// 取出所有的坦克对象
			for (int x = 0; x < enevec.size(); x++) {
				EnemyTank et = enevec.get(x);
				//如果不是自己的坦克
				if(et != this)
				{
					//如果敌人的坦克朝上或者朝下的时候
					if(et.direct==0 || et.direct ==2)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+20
								&& this.y >= et.y && this.y <= et.y+30)
						{
							return true;
						}
						//对于第二个点进行判断
						if(this.x >= et.x && this.x <= et.x+20
								&& this.y+20 >= et.y && this.y+20 <= et.y+30)
						{
							return true;
						}
					}
					//如果敌人是朝左边或者右边的时候
					if(et.direct==1 || et.direct==3)
					{
						//判断边界
						//对于第一个点进行判断
						if(this.x >= et.x && this.x <=et.x+30
								&& this.y >= et.y && this.y <= et.y+20)
						{
							
							return true;
						}
						//对于第二个点进行判断
						if(this.x >= et.x && this.x <= et.x+30
								&& this.y+20 >= et.y && this.y+20 <= et.y+20)
						{
							return true;
						}
					}
				}
				
			}	
		}
		return false;

	}
	
	//建立一个方法保存所有的坦克对象
	public void setVector(Vector<EnemyTank> enevec)
	{
		this.enevec = enevec;
		
	}
	
	/*
	 * 	实现发多个子弹功能
	 * 		1.先检测集合中的子弹数量，数量不能超过一定数量
	 * 		2.先遍历所有坦克，然后对每一个坦克中集合的子弹进行判断
	 * 		3.建立对象，吧对象添加到集合当中
	 */
	
	//坦克移动自我移动的方法
	private void EnemyTank_Move()
	{
		switch(this.direct)
		{
			case 0:
				for(int i=0; i<30; i++)
				{
					if(y>0 && this.isTouchOther()==false && this.isSuspend)
						y-=sreed;
					//让运行速度减慢
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}			
				}
				break;
			case 1:
				for(int i=0; i<30; i++)
				{
					if(x<500 && this.isTouchOther()==false && this.isSuspend)
						x+=sreed;
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			case 2:
				for(int i=0; i<30; i++)
				{
					if(y<400 && this.isTouchOther()==false && this.isSuspend)
						y+=sreed;
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			case 3:
				for(int i=0; i<30; i++)
				{
					if(x>0 && this.isTouchOther()==false && this.isSuspend)
						x-=sreed;
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			
		}
	}

	public void shot()
	{
		if(this.isSuspend)
		{
			//遍历每一辆坦克的子弹集合
			if(this.isLive())
			{
				if(this.vecs.size()<5)
				{
					//对于不同的坦克方向生成子弹的方向也不同
					Bullet enybut = null;
					switch(this.getDirect())
					{
					case 0:
						enybut = new Bullet(this.getX()+10, this.getY(), 0);
						//将创建的子弹加入到集合当中
						this.vecs.addElement(enybut);
						break;
					case 1:
						enybut = new Bullet(this.getX()+30, this.getY()+10, 1);
						this.vecs.addElement(enybut);
						break;
					case 2:
						enybut = new Bullet(this.getX()+10, this.getY()+30, 2);
						this.vecs.addElement(enybut);
						break;
					case 3:
						enybut = new Bullet(this.getX(), this.getY()+10, 3);
						this.vecs.addElement(enybut);
						break;
						
					}
					new Thread(enybut).start();
					
				}
				
			}
			
		}
	}

	@Override
	//我们发现坦克在原地抽搐，我们要实现坦克的平稳运行
	//实现坦克运动不会越界
	public void run() {

		//线程中实现坦克的不断移动
		while(true)
		{
			this.EnemyTank_Move();
			
			//敌人射击的线程
			this.shot();
			
			//不同的方向移动的方向不同,判断是否允许转向			
			if(this.isSuspend == true)
				this.direct = (int)(Math.random()*4);
			
			//如果坦克不存在关闭线程
			if(this.isLive==false)
				break;
		}			
	}

}

