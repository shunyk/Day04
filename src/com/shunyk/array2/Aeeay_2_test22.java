package com.shunyk.array2;

import java.util.Scanner;

public class Aeeay_2_test22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;


		int points[]  = new int[5];
		for(int i=0; i<points.length; i++) {
			System.out.println(1+i+"번 점수 입력");
			points[i] = sc.nextInt();
			sum += points[i];
			
		}
		int max=points[0];
		int min=points[0];
		for(int i=1; i<points.length; i++) {
			if(max<points[i]) {
				max=points[i];
			}else if(min>points[i]) {
				min=points[i];
			}
		}
		System.out.println("최대 점수: " +max);
		System.out.println("최소 점수: " +min);
		System.out.println("평균: " +(double)(sum-max-min)/(points.length-2));

	}
}