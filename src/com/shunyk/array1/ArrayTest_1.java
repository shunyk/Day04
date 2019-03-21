package com.shunyk.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {
		//배열 선언
		//정수형 데이터
		/*int [] ar = new int[3];
		ar [0] = 'a';
		ar [1] = 20; //인덱스 번호를 사용
		ar [2] = (int) 3.2;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);*/
		
		char [] array = new char [5];
		for(int i=0; i<5; i++) {
			array [i] = (char) (i+97);
			System.out.println(array[i]);
		}
		
		int [] num;
		num = new int[3];
		System.out.println(num);
		System.out.println(num[0]);
		
		String name="abc";
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		Scanner [] scs = new Scanner[3];
		scs[0]=sc;
		scs[1]=sc2;
		scs[2]=sc3;
		
		
	}

}
