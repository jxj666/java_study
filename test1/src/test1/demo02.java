package test1;

import java.util.Scanner;

public class demo02 {
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double avg = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= classNum; i++) {
			avg = 0;
			System.out.println("班级" + i);
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("学生" + j);
				int score = input.nextInt();
				sum = sum + score;
			}
			avg = sum / stuNum;
			System.out.println("平均分" + avg);
		}

	}
}
