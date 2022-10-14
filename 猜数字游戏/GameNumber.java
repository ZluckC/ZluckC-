package 猜数字游戏;

import java.util.*;

public class GameNumber {
	// 属性接受主类的等级
	int num;
	// 一个参数的构造方法

	public GameNumber(int num) {
		// super();
		this.num = num;
	}
	// m为用户输入的数据，n表示系统产生的随机数
	public int judge(int m, int n) {
		if (m > n)
			return 1;
		else if (m < n)
			return -1;
		else if (m == n)
			return 0;

		return 0;
	}

	public void playingGame() {
		int count = 0;// 输入次数
		double k = (Math.pow(10, num));
		int x = (int) (Math.random() * k + 1);// 产生随机数
		System.out.println("******产生的随机数为" + x + "******");
		Scanner in = new Scanner(System.in);
		while (true) {
			count++;
			System.out.println("输入猜测的数据，停止猜测输入0！");
			int number = in.nextInt();
			if (number == 0)
				break;
			if (judge(number, x) == 1) {
				System.out.println("输入的数据大了");
			}
			if (judge(number, x) == -1) {
				System.out.println("输入的数据小了");
			}
			if (judge(number, x) == 0) {
				System.out.println("恭喜您，猜中了" + ",猜了" + count + "次！");
				break;
			}

		}

	}

}
