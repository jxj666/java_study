package j0516;

import java.util.Arrays;

public class HelloWorld {

	// 完成 main 方法
	public static void main(String[] args) {
		int[] scores = { 89, -23, 64, 91, 119, 52, 73 };
		HelloWorld hello = new HelloWorld();
		int[] scores_re = hello.sort(scores);
		System.out.println(scores_re[0]);
		System.out.println(scores_re[1]);
		System.out.println(scores_re[2]);
	}

	// 定义方法完成成绩排序并输出前三名的功能

	public int[] sort(int[] stus) {
		Arrays.sort(stus);
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = stus.length - 1; i >= 0; i--) {
			if (stus[i] < 0 || stus[i] > 100) {

			} else {
				a = stus[i];
				b = stus[i - 1];
				c = stus[i - 2];
				break;
			}
		}
		int[] stutop = { a, b, c };

		return stutop;
	}

}
