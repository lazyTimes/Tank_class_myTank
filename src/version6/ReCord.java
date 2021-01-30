package version6;

/*
 * 		����Ϊ�����࣬��Ҫ�����ӵ���ǰ�˲���
 * 		��Ҫ������
 * 			����̹�˱�����֮����ʧ
 *
 * 			ը���������κ�һ�����󣬶�����Ҫ����ͼƬ��һ�������װ
 *
 * 			����ʹ��һ������ϵͳ����ը������������һ���̶Ⱦ�Ҫ�ı�ͼƬ
 * 			����ͼƬ���л�ʵ��
 *
 * 			�õ��˷������ӵ�
 * 			ʵ�ַ���
 *
 * */


import java.io.*;


//����һ����¼�࣬ר�����ڼ�¼
public class ReCord {
    //������˵ļ�¼
    private static int AllSum = 0;


    //��ȡ�ļ�, ���˱����ٵ������ļ�¼
    public static void readALLSum() {
        BufferedReader bufread = null;
        try {
            bufread = new BufferedReader(new FileReader("data\\haha.txt"));
        } catch (FileNotFoundException e1) {

            e1.printStackTrace();
        }

        try {
            AllSum = Integer.parseInt(bufread.readLine());
        } catch (NumberFormatException | IOException e) {

            e.printStackTrace();
        } finally {
            //�ر���
            if (bufread != null)
                try {
                    bufread.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
        }

    }

    /**
     * �浵�Ĺ���
     */
    public static void SaveAllSum() {
        BufferedWriter bufwriter = null;
        try {
            bufwriter = new BufferedWriter(new FileWriter("data\\haha.txt"));
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        try {
            bufwriter.write(AllSum + "\r\n");
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (bufwriter != null)
                try {
                    bufwriter.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
        }


    }

    //����¼����������Ŀ��1
    public static void addAllSum() {
        AllSum++;
    }

    //��ȡ���еĻ�ɱ����
    public static int getAllSum() {
        return AllSum;

    }
}


//�����Ѵ�����Ҫ�����ӵ�������ÿ��̹�˷����ӵ����ǲ�ͬ��������Ҫʹ�ö��߳�

