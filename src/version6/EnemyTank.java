package version6;

import java.util.Vector;

/**
 * ����̹����
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/30 14:49
 */ //����̹����,��̹������
//ʵ�ֶ��߳�
class EnemyTank extends FatherTank implements Runnable {


    //ͨ��һ�����Ϸ������ı���
    private Vector<EnemyTank> enevec;


    public EnemyTank(int x, int y) {
        super(x, y);

        super.setColor(1);

        //���ó�ʼ��������ٶ�
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

    /**
     * ����һ���������ж��Ƿ������ײ
     * �Ƿ񹥻���������̹��
     *
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

    //����һ�������������е�̹�˶���
    public void setVector(Vector<EnemyTank> enevec) {
        this.enevec = enevec;

    }

    /*
     * 	ʵ�ַ�����ӵ�����
     * 		1.�ȼ�⼯���е��ӵ��������������ܳ���һ������
     * 		2.�ȱ�������̹�ˣ�Ȼ���ÿһ��̹���м��ϵ��ӵ������ж�
     * 		3.�������󣬰ɶ�����ӵ����ϵ���
     */

    /**
     * ̹���ƶ������ƶ��ķ���
     */
    private void EnemyTank_Move() {
        switch (this.direct) {
            case 0:
                for (int i = 0; i < 30; i++) {
                    if (y > 0 && this.isTouchOther() == false && this.isSuspend)
                        y -= sreed;
                    //�������ٶȼ���
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
                break;
            case 1:
                for (int i = 0; i < 30; i++) {
                    if (x < 500 && this.isTouchOther() == false && this.isSuspend)
                        x += sreed;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 30; i++) {
                    if (y < 400 && this.isTouchOther() == false && this.isSuspend)
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
                    if (x > 0 && this.isTouchOther() == false && this.isSuspend)
                        x -= sreed;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
                break;

        }
    }

    public void shot() {
        if (this.isSuspend) {
            //����ÿһ��̹�˵��ӵ�����
            if (this.isLive()) {
                if (this.vecs.size() < 5) {
                    //���ڲ�ͬ��̹�˷��������ӵ��ķ���Ҳ��ͬ
                    Bullet enybut = null;
                    switch (this.getDirect()) {
                        case 0:
                            enybut = new Bullet(this.getX() + 10, this.getY(), 0);
                            //���������ӵ����뵽���ϵ���
                            this.vecs.addElement(enybut);
                            break;
                        case 1:
                            enybut = new Bullet(this.getX() + 30, this.getY() + 10, 1);
                            this.vecs.addElement(enybut);
                            break;
                        case 2:
                            enybut = new Bullet(this.getX() + 10, this.getY() + 30, 2);
                            this.vecs.addElement(enybut);
                            break;
                        case 3:
                            enybut = new Bullet(this.getX(), this.getY() + 10, 3);
                            this.vecs.addElement(enybut);
                            break;

                    }
                    new Thread(enybut).start();

                }

            }

        }
    }

    @Override
    //���Ƿ���̹����ԭ�س鴤������Ҫʵ��̹�˵�ƽ������
    //ʵ��̹���˶�����Խ��
    public void run() {

        //�߳���ʵ��̹�˵Ĳ����ƶ�
        while (true) {
            this.EnemyTank_Move();

            //����������߳�
            this.shot();

            //��ͬ�ķ����ƶ��ķ���ͬ,�ж��Ƿ�����ת��
            if (this.isSuspend == true)
                this.direct = (int) (Math.random() * 4);

            //���̹�˲����ڹر��߳�
            if (this.isLive == false)
                break;
        }
    }

}
