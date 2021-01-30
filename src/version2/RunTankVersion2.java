package version2;


/**
 * 重构坦克 - 第二版
 * 		需求：
 * 			坦克大战:
 * 			功能：
 * 				1.画出坦克，
 *
 * 		思路：
 * 			1.首先坦克想象由五个部件组成两个矩形，一个长方形或者正方形，一个圆
 * 				一条直线
 * 			2.画坦克的时候需要使用到画笔工具
 * 				必须在构造函数初始化使用画笔工具
 * 			3.在设置方向以及画出不同方向的坦克
 * 			4.敌方坦克画出来需要使用父类方法
 * 				敌方坦克的坐标需要设置，
 * 				使用一个集合保存敌方坦克Vector集合便于删除和添加
 *
 * */
public class RunTankVersion2 {

	public static void main(String[] args) {
		new MethodsTank();
	}

}







