package com.shunyk.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 배열 개수 입력");
		int a = sc.nextInt();
		int [] ar = new int[a];
		for(int i=0; i<a;i++) {
			ar [i] = i;
			System.out.println(ar[i]);
		}
		
		int [] ar2 = {10, 20, 30};
		System.out.println("검색할 번호를 입력");
		int b = sc.nextInt();
		System.out.println(ar2[b]);
		

	}

}