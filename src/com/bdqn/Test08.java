package com.bdqn;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数:");
		int num = sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			System.out.println("请输入第"+i+"个学员的成绩:");
			int score = sc.nextInt();
			if(score<80) {
				continue;
			}
			count++;
		}
		System.out.println("比例是:"+(count*1.0/num));
	}
}
