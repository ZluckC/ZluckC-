package ��������Ϸ;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 1;
		Scanner in = new Scanner(System.in);
		while (option != 0) {
			System.out.println("*****��������Ϸ��ѡ��ȼ�******");
			System.out.println("      1----�ȼ�1:0-10");
			System.out.println("      2----�ȼ�2:0-100");
			System.out.println("      3----�ȼ�3:0-1000");
			System.out.println("      4----�ȼ�4:0-10000");
			System.out.println("      0----�˳�����");
			System.out.println("***** �������ݣ���ʼ���� *******");
			option = in.nextInt();
			if (option == 0) {
				System.out.println("��Ϸ������");
				System.exit(0);
			} else if (option > 4 || option < 0) {
				System.out.println("�����������������룡");
			} else {
				System.out.println("��Ϸ��ʼ^_^");
				GameNumber a = new GameNumber(option);
				a.playingGame();
			
		
				
			}

		}

	}

}
