package com.bdqn;

public class Test03 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//行数
			for(int j=1;j<=5-i;j++) {//控制空格
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {//控制星号
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
