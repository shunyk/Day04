package com.shunyk.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {10, 32, 15, 27, 46, 52};
		
		System.out.println("검색할 숫자를 입력하세요");
		int a = sc.nextInt();
		if(ar.length != a) {
			System.out.println("없는 숫자입니다.");
		}else {
			System.out.println(ar[a]);
		}

	}

}
