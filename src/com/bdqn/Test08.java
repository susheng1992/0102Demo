package com.bdqn;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶����:");
		int num = sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			System.out.println("�������"+i+"��ѧԱ�ĳɼ�:");
			int score = sc.nextInt();
			if(score<80) {
				continue;
			}
			count++;
		}
		System.out.println("������:"+(count*1.0/num));
	}
}
