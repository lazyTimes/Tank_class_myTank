# ̹�˴�ս

## ǰ�ԣ�

��Ȼ�Ҳ�����������ʵ��˿�����Ƕ���90����˵̹�˴�ս���������˶������һ��С������Ϸ������Ϸ�������Ŀ��֮ǰ���ݵ������ϵ�ʱ�򿴵��ģ�����һ��п��Լ�������ѧ��̵��������ˮ�����Է���һ���Լ��ġ��������롱��

�����Ŀ�����Ѿ����е�����˵û�м�ֵ�����������Ҫ��ϣ�����ڳ�ѧ��̵��˸�һ�� ���������ɣ�ԭ���������������ô�������顣���̹�˴�սҲ���Լ�������ѵ�Ľ�ѧ��Ƶ�߿����õġ�

���ڸ��˵ĳɳ����Ƕ������������ܶණ��������֮���漰�Լ���ä�����ʹ�㲻�ϵ�ѧϰ�ͽ�����



> PS������ʹ��Eclipseд�ģ�������IDEA������һ�´���
>
> �˴�������Ķ������Ѷȣ����鿴һ�º�˳ƽ��JAVA����̹�˴�ս�Ŀγ̡������Դ����Ҳ�Ǹ��ſγ��õġ�
>
> https://www.bilibili.com/video/BV157411g78y?p=47
>
> ����һ����ʱ����������Щ��Դ��Ҫ���Ϸ�����

## ��Ŀ��ַ



## ����Ⱥ�壺

1. ��ѧJAVA�ߣ����Կ��������Ŀ������������
2. ��ȫ���˽�ʲô���������
3. ����С��Ϸ�е���Ȥ��
4. ������������ѧϰ����һ��С��Ϸ�����ܸ���һ�㶯��

## ����̹�˵ķ�����

���һ�汾��Ч������汾���ֹ��ܻ������й��ܰ�����Ч

+ WASD
+ J��Ϊ����ӵ�



## ��Ŀ��飺
����ǰ������ѧ��ʱ���һ����ѧ��Ƶ�ģ�**��˳ƽ��ʦ��JAVA����̹�˴�ս**�����˸�����Ƶ��ѧ����֮�󣬶��ڱ�̵���Ȥ��������������ԽѧԽ���֡�

## ���ü���

1. JAVA GUI��Զ�ż�����**ǧ�������**���������ɣ�
2. JAVA



## �����ĵ��������ǣ���

���ڵ����Ǹ�����Ƶ���ģ���Ȼ����ļ������ˣ������Լ������õ�ͬʱ����������ĸ��£����������в��������˼·���ˡ�����в�ͬ�ģ���������GIT��README�ĵ���

```
/*
 * 		����
 * 			̹�˴�ս:
 * 			���ܣ�	
 * 				1.����̹�ˣ�
 * 		
 * 		˼·��
 * 			1.����̹�������������������������Σ�һ�������λ��������Σ�һ��Բ
 * 				һ��ֱ��
 * 
 * 			2.��̹�˵�ʱ����Ҫʹ�õ����ʹ���
 * 				�����ڹ��캯����ʼ��ʹ�û��ʹ���
 * 
 * 			3.�����÷����Լ�������ͬ�����̹��
 * 
 * 			4.�з�̹�˻�������Ҫʹ�ø��෽��
 * 				�з�̹�˵�������Ҫ���ã�	
 * 				ʹ��һ�����ϱ���з�̹��Vector���ϱ���ɾ������� 
 * 
 * 			5.�����ӵ���һ���߳�
 * 				�����̵߳Ĺ���
 * 				�����̶߳����ӵ������˶��켣��ͬ
 * 
 * 			6.��Ҫ���ӵ�������
 * 				�ڰ���J����ʱ�����ӵ�
 * 					ʵ������ʹ�ü��ϴ洢
 * 				
 * 		������
 * 			1.�õ����ܹ������ӵ�
				�������
					1.���˷����ӵ���һ�����̷߳�����Ӧ���ڵ��˵�run��������ʵ��
					2.̹�˷����ӵ����ƶ�����̹�˱�����еĹ���
 * 
 * 			˼·��
 * 				1.�ڵ�����������Ҫ���һ���������
 * 					���ҷ�һ�������ǵ������Զ��������˵ÿ���������һ��
 * 
 * 				2.�ҷ�̹���ӵ�����
 * 					ʹ��һ�����ϱ��潨���Ķ��󣬻����ӵ�ʹ�ü����еĶ���
 * 					�ҷ�̹���ӵ��������죬��Ҫ�޶�		
 * 			
 * 				3.
 * 					�ҷ�̹�˻��е���̹��֮�󣬵���̹�˾�Ҫ��ʧ
 * 					��Ҫ��ȡ�����˵�һ���������꣬Ȼ��綨һ����Χ
 * 					дһ��ר�ŵĺ����ж��Ƿ���е���
 * 					
 * 					�������ж��Ƿ���е���
 * ��				��Ϊÿһ���ӵ���Ҫ�����е�̹��ƥ�䣬����ÿһ��ƥ�䶼Ҫ
 * 					˫���ж�ÿ�ζ�Ҫ���н�������
 * 					ͼƬ����û�еõ����
 * 
 * 		����
 * 				1.��Ҫʵ�ֵ��˵�̹�˲��ϵ��ƶ�ʹ�ö��̵߳��ֶ�ʵ��
 * 
 * 				2.��Ҫʵ�ֵ����ܹ������ӵ��Ĺ���
 * 				ʵ�ַ�����
 * 					����һ�����˵��ӵ�����
 * 					��ε��˺�ʱ�����ӵ���
 * 					ʹ�ö���ѭ���ж��Ƿ���Ҫ���н�ӵ�
 * 
 * 				3.ʵ���Լ����ӵ�����Ҳ����ʧ
 * 					���ڴݻ�̹�˽�������
 * 
 * 				4.
 * 					���ѣ�
 * 					ʵ��̹�˲������˶���
 * 					1.���ȸ��ж���̹������ʵ��
 * 					2.��Ҫ�õ�һ��������ȡ�����ɵ�̹����
 * 					3.���ڵط�����һ��̹�˵�ѡ�񣬶�Ҫѭ������������̹�˽��бȶ�
 * 						����Ҫ�����ж��Ƿ�Ϊ�ҷ�̹��
 * 					4.**���ڵ�λ���ж�Ҫ�ж������㣬���ܹ���֤���������ײ
 * 
 * 				5.ʵ��ѡ��ؿ��Ĺ���
 * 					˼·��
 * 						1.���Խ���һ��ѡ��ؿ������
 * 						2.��ʱ��ʵ�ֲ�ͬ�Ĺؿ�����̹�˵�������ͬ
 * 						3.ʵ����˸���ܣ�ʹ�ö��̵߳ķ���,ע���̵߳Ĺر�
 * 						4.����ѡ������¼�����,����¼�
 * 
 * 				5.�����ҷ�̹�˻����˶������ط�̹��
 * 					1.���������������޸�
 * 					2.��ʾ����̹�˵�����
 * 					��չ��
 * 						1.���������ĵ�
 * 					3.��չ:�ҷ�̹�˵�����ֵ��������ֵΪ0��ʱ����Ϸ����
 * 					4.��¼�ҷ������˶��ٵط�̹��
 * 						ʹ���ļ��������
 * 
 * 				6.ʵ�����¿�ʼ�Ĺ���
 * 
 * 				7.ʵ�ִ����˳��Ĺ���
 * 					˼·��
 * 						ѡ������������������ť
 * 						1.��¼����̹�˵�����
 * 						
 * 				8.ʵ����ͣ�Ĺ���
 * 					˼·��
 * 						��ͣ���ܿ���ͨ��һ������ֵ�����жϣ�������ĳ����ť��ʱ���Ҫ���в���ֵ�ĸı�
 * 						��Ҫ��ͣ�Ķ���
 * 							�����߳��ӵ����ٶ�ǰ��������ͣ
 * 							����̹���޷�ת���ǰ��
 * 							�ҷ�̹���޷�ת���ǰ��
 * 
 * 				9.ʵ�ֲ������ֵĹ���
 * 					��ѧ - δʵ��
 * 
 * 				
 * 					
 * 
 * */
```

## �汾�����ͽ��ܣ�

### ���ܣ�

����Ƚ϶࣬�һ�鼸����������Ƚ��������ĵط�˵��һ�£������Ĵ�����Ҫ��ϸ�ڡ�����в����Ļ�ӭ��issue���������ֻҪ�п�һ������𸴡�



### ��һ���汾 

�汾����������̹��(version1)

���ǵĵ�һ���ǻ������ǵ�̹�ˣ������ҷ�̹�˵ķ������Ƿǳ��򵥵ġ�

```
 * 		˼·��
 * 			1.����̹�������������������������Σ�һ�������λ��������Σ�һ��Բ
 * 				һ��ֱ��
 * 
 * 			2.��̹�˵�ʱ����Ҫʹ�õ����ʹ���
 * 				�����ڹ��캯����ʼ��ʹ�û��ʹ���
 * 
 * 			3.�����÷����Լ�������ͬ�����̹��
```

ӵ��̹�˵ĵ�һ���ǻ���̹��

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210129160413.png)

����̹�˵ĺ��Ĵ������£�

```java
/**
     * ��̹����Ҫ��ȡ��װ
     * 1.������֮ǰ��ȷ����ɫ���ǵ���̹�˻����ҷ�̹��
     * 2.����Ϊ�����������ʣ���Ҫ��,�Լ�̹�����ͺͷ���
     */
    private void paintMyTank(int x, int y, Graphics g, int direct, String type) {
        //��֮ǰ��ȷ��̹�˵���ɫ
        switch (type) {
            case "mytank": {
                g.setColor(Color.red);
                break;
            }
            case "enemytank": {
                g.setColor(Color.cyan);
                break;
            }
        }
        //����
        if (direct == 0) {//�Ȼ����ҵ�̹��
            //������ߵľ��Σ���������ɫ
            g.fill3DRect(x, x, 5, 30, false);

            //�����м�ĳ�����
            g.fill3DRect(x + 5, x + 5, 10, 20, false);

            //�����м�ԲȦ,ʹ�������Բ
            g.fillOval(x + 6, x + 9, 7, 7);

            //����һ��ֱ��
            g.drawLine(x + 10, x, x + 10, x + 15);

            //������һ�߾���
            g.fill3DRect(x + 15, x, 5, 30, false);
        }

    }
```

���֪�����ֵ���˼��ֱ�ӽ������޸Ĵ�С�Ϳ���֪��Ч����

### �ڶ����汾 

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130150035.png)

�汾�����������ҷ�̹�˲�ͬ��״���з�̹��(version2)���ҷ�̹�˿��Խ����ж�

���ϸ��汾���У����Ƿ������ǵ�̹��ֻ��һ������������汾�У�������̹�˵Ĳ�ͬ����ͬʱ�����˵��˵�̹���ࡣ

���ڵ����кܶ������������һ��������ά�������á�ͬʱ����������ϵͳ������ʵ�ֲ�ͬ��̹��Ų����ͬ��λ�á�

����汾�Ĺؼ����룬�����ڻ�̹�˵����棬�������ڼ����˼��̵ļ����¼���

```java
// version2.DrawTank.java ����ϸ����鿴
public class DrawTank extends JPanel implements KeyListener { 
    // ʡ��һ�������
    
    
/**
     * ʹ��wsad���п���
     * Ҳ���Ը�Ϊ�������Ҽ�
     *
     * @param e
     */
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
    }
}
```

> ʵ��`KeyListener`�ӿڲ��Ҽ�����Ӧ�ķ�����
>
> JAVA��GUI��һ���¼���������ģ�ͣ���˼����˵����ʵ�ֶ�Ӧ�������ӿڣ����Ҹ��Ƕ�Ӧ�ķ������ڴ������в��Ҵ�������¼����ʺϣ�ģ�;Ϳ��Դ�������ʵ�ֶ���õĴ��룬��������Ծ������ģʽ������Ȥ����ȥ�˽�һ��

### �������汾

������汾�Ϳ�ʼ�����΢����һ���ˣ����˶��̵߳����ݣ���ΪҪ�����ǵ�̹�˺͵��˵�̹�ˡ�������������ʵ��̹���ƶ����ҷ�̹���ƶ��ĵ�����һ���ģ����ٵ�**��д�����**�������ǵ�����Լ��������ʾ����ı��ʶ���һ���ġ�

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210129173134.png)

����汾�У��ȽϺ��ĵ���������η����ӵ������ӵ���ʧ��

```java
public class Bullet implements Runnable {

    /**
     * �����ӵ���xy����
     */
    private int x, y;
    /**
     * �ӵ�����ɫ
     */
    int color;
    /**
     * �ӵ��ķ���
     */
    int direct;
    /**
     * �ӵ��ƶ��ٶ�
     */
    int screed;
    /**
     * �ж��Ƿ�Խ��
     */
    boolean isOut = false;

    /**
     * Խ�緶Χ
     */
    int outx = 400;
    /**
     * Խ�緶Χ
     */
    int outy = 300;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
        this.screed = 1;
    }
    
    // ʡ��get/set

    @Override
    public void run() {
        //̹��һ��������Ҫ�˶�
        //��Ϊ�ƶ���̫�죬��Ҫ�����ٶ�
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                //
                e.printStackTrace();
            }

            switch (this.direct) {
                case 0:
                    y -= screed;
                    break;
                case 1:
                    x += screed;
                    break;
                case 2:
                    y += screed;
                    break;
                case 3:
                    x -= screed;
                    break;
            }
            System.out.println(x + "..." + y);
            //������Ե��ʧ
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
        }
        // �ӵ�ʲôʱ��������
    }

    /**
     * �ж��Ƿ�Խ��
     */
    public void outLine() {
    }
}

```

1. ��̹�˵��ڲ�ά��һ������`isOut`���ж���û��Խ��
2. ���������Խ�磬��flag��������

���ţ��ڻ滭�ķ������棬�ж���û��Խ�磺

```java
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
```

### ���ĸ��汾��

����һ���汾��ʼ��һ����Ϸ�ļ򵥳����Ѿ����ˣ���һ���汾ʵ�����õ����ƶ���ͬʱ�����ӵ��Ĺ��ܣ�ͬʱ�ҷ���̹��������˵�ʱ�򣬿����õ�����ʧ

#### ��ô���õ��˿��Ա��ƶ��߷����ӵ���

������Ҫ�ڵ��˵Ķ��߳�`run`�������棬Ȼ���˽��м�Ъ�Ե��߶���

```java
 @Override
    //���Ƿ���̹����ԭ�س鴤������Ҫʵ��̹�˵�ƽ������
    //ʵ��̹���˶�����Խ��
    public void run() {
  
        do {
            switch (this.direct) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (y > 0)
                            y -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (x < 500)
                            x += sreed;
                        try {
                            // ���ݵ�ͣ��
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (y < 400)
                            y += sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (x > 0)
                            x -= sreed;
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }
                    break;

            }
            //��ͬ�ķ����ƶ��ķ���ͬ
            this.direct = (int) (Math.random() * 4);

        } while (this.isLive);
    }

```

���������ӵ�����Ҫ��ʱȥ��ѯ���е�̹�ˣ����̹������ϵ��ӵ������Ƿ�����ӵ������С��һ������������Ҫ���ɶ�Ӧ���ӵ�����ͬʱ���뵽���˵�̹�˵��С������ӵ������ͻῪʼִ���߳̽���

```java
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
```

���ӵ��൱�н��в��ϵ���ֵ�ı䣺

��������ݱ�ʾ�ӵ�����

```java
public class Bullet implements Runnable {
    //����һ��δ��룺
    
public void run() {
      
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (this.direct) {
                case 0:
                    this.y -= screed;
                    break;
                case 1:
                    this.x += screed;
                    break;
                case 2:
                    this.y += screed;
                    break;
                case 3:
                    this.x -= screed;
                    break;
            }
            //������Ե��ʧ
            if (x < 0 || x > outx || y < 0 || y > outy) {
                isOut = true;
                break;
            }
           
        }
    }
}
```

### ������汾��

�ڵ�����汾���У�����ʵ���˿�ʼ�˵��Ľ��棬ͬʱ���߲˵��Ĳ�����ʾ��

����᲻�ϵ���˸

���ţ������������ӵ����Դݻ����ǵķ���

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145231.png)

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145253.png)

���ţ����ǿ���ʵ�ֱ�ը��Ч����

> ���ڱ�ը��Ч�����ý�ͼ���뿴Դ����

![](https://gitee.com/lazyTimes/imageReposity/raw/master/img/20210130145348.png)

```java
/**
 * ʵ����˸����
 * �ع�̹�� - �����
 * @author zxd
 * @version 1.0
 * @date 2021/1/29 23:54
 */
class SelectIsSallup extends JPanel implements Runnable {
	/**
	 * ʱ������
	 */
	int times = 0;

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 600, 400);
        if (times % 2 == 0) {
            //��������
            Font font1 = new Font("������κ", Font.BOLD, 20);
            //�����������ɫ
            g.setColor(Color.yellow);
            g.setFont(font1);
            g.drawString("stage 1", 200, 150);
        }

    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if (times > 500)
                times = 0;
            times++;
            this.repaint();

        }
    }
}

```

#### ����õ��˵��ӵ�����������˺���

```java
/**
	 * ����һ���������ж��Ƿ������ײ
	 * �Ƿ񹥻���������̹��
	 * @return
	 */
	private boolean isTouchOther() {
        // �����Լ��ķ������ѡ���ж�
        switch (this.direct) {
            // ̹�������ߵ�ʱ��
            case 0:
                // ȡ�����е�̹�˶���
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //��������Լ���̹��
                    if (et != this) {
                        //������˵�̹�˳��ϻ��߳��µ�ʱ��
                        if (et.direct == 0 || et.direct == 2) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                        }
                        //��������ǳ���߻����ұߵ�ʱ��
                        if (et.direct == 1 || et.direct == 3) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
                break;
            //	̹�����ұ��ߵ�ʱ��
            case 1:
                // ȡ�����е�̹�˶���
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //��������Լ���̹��
                    if (et != this) {
                        //������˵�̹�˳��ϻ��߳��µ�ʱ��
                        if (et.direct == 0 || et.direct == 2) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                        }
                        //��������ǳ���߻����ұߵ�ʱ��
                        if (et.direct == 1 || et.direct == 3) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30
                                    && this.y + 20 >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 30 >= et.x && this.x + 30 <= et.x + 30
                                    && this.y + 20 >= et.y && this.y <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }

                // ̹�����µ�ʱ��
            case 2:
                // ȡ�����е�̹�˶���
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //��������Լ���̹��
                    if (et != this) {
                        //������˵�̹�˳��ϻ��߳��µ�ʱ��
                        if (et.direct == 0 || et.direct == 2) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 20
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 30) {
                                return true;
                            }
                        }
                        //��������ǳ���߻����ұߵ�ʱ��
                        if (et.direct == 1 || et.direct == 3) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x + 20 >= et.x && this.x + 20 <= et.x + 30
                                    && this.y + 30 >= et.y && this.y + 30 <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
                break;

            // ̹�������ƶ���ʱ��
            case 3:
                // ȡ�����е�̹�˶���
                for (int x = 0; x < enevec.size(); x++) {
                    EnemyTank et = enevec.get(x);
                    //��������Լ���̹��
                    if (et != this) {
                        //������˵�̹�˳��ϻ��߳��µ�ʱ��
                        if (et.direct == 0 || et.direct == 2) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y >= et.y && this.y <= et.y + 30) {
                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x >= et.x && this.x <= et.x + 20
                                    && this.y + 20 >= et.y && this.y + 20 <= et.y + 30) {
                                return true;
                            }
                        }
                        //��������ǳ���߻����ұߵ�ʱ��
                        if (et.direct == 1 || et.direct == 3) {
                            //�жϱ߽�
                            //���ڵ�һ��������ж�
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y >= et.y && this.y <= et.y + 20) {

                                return true;
                            }
                            //���ڵڶ���������ж�
                            if (this.x >= et.x && this.x <= et.x + 30
                                    && this.y + 20 >= et.y && this.y + 20 <= et.y + 20) {
                                return true;
                            }
                        }
                    }

                }
        }
        return false;

    }
```

### ���հ汾��

�����յİ汾���У�һ��̹�˴�ս�Ļ�����Ϸ��������ˣ���Ȼ���кܶ���Ҫ��ɵ㡣