package 猜数字游戏;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 1;
		Scanner in = new Scanner(System.in);
		while (option != 0) {
			System.out.println("*****猜数字游戏，选择等级******");
			System.out.println("      1----等级1:0-10");
			System.out.println("      2----等级2:0-100");
			System.out.println("      3----等级3:0-1000");
			System.out.println("      4----等级4:0-10000");
			System.out.println("      0----退出程序");
			System.out.println("***** 输入数据，开始操作 *******");
			option = in.nextInt();
			if (option == 0) {
				System.out.println("游戏结束！");
				System.exit(0);
			} else if (option > 4 || option < 0) {
				System.out.println("输入有误，请重新输入！");
			} else {
				System.out.println("游戏开始^_^");
				GameNumber a = new GameNumber(option);
				a.playingGame();
			
		
				
			}

		}

	}

}
