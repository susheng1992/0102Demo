package com.bdqn;

public class Test05 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//����
			for(int j=1;j<=5-i;j++) {//���ƿո�
				System.out.print(" ");
			}
			System.out.print("*");
			if(i!=1) {
				for(int j=1;j<=2*i-3;j++) {//�����Ǻ�
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {//����
			
			for(int j=1;j<=5-i;j++) {//���ƿո�
				System.out.print(" ");
			}
			System.out.print("*");
			if(i!=1) {
				for(int j=1;j<=2*i-3;j++) {//�����Ǻ�
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
