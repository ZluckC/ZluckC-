package ��������Ϸ;

import java.util.*;

public class GameNumber {
	// ���Խ�������ĵȼ�
	int num;
	// һ�������Ĺ��췽��

	public GameNumber(int num) {
		// super();
		this.num = num;
	}
	// mΪ�û���������ݣ�n��ʾϵͳ�����������
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
		int count = 0;// �������
		double k = (Math.pow(10, num));
		int x = (int) (Math.random() * k + 1);// ���������
		System.out.println("******�����������Ϊ" + x + "******");
		Scanner in = new Scanner(System.in);
		while (true) {
			count++;
			System.out.println("����²�����ݣ�ֹͣ�²�����0��");
			int number = in.nextInt();
			if (number == 0)
				break;
			if (judge(number, x) == 1) {
				System.out.println("��������ݴ���");
			}
			if (judge(number, x) == -1) {
				System.out.println("���������С��");
			}
			if (judge(number, x) == 0) {
				System.out.println("��ϲ����������" + ",����" + count + "�Σ�");
				break;
			}

		}

	}

}
