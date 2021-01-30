package version5;

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


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * ����һ����¼�࣬ר�����ڼ�¼
 * �ع�̹�� - ������
 */
public class ReCord {
    //������˵ļ�¼
    private static int AllSum;

    //��ȡ���еĻ�ɱ����
    public static int getAllSum() {
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
        return AllSum;

    }

    public static void setAllSum(int allSum) {

        AllSum = allSum;
    }


}



