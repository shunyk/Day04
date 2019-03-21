package com.shunyk.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int student = sc.nextInt();
		String stuName[] = new String[student];
		int kr[] = new int[student];
		int math[] = new int[student];
		int krSum = 0;
		int mathSum = 0;
		for (int i=0; i<student; i++) {
			System.out.println((i+1)+ "번 학생의 이름을 입력하세요");
			stuName[i] = sc.next();
			System.out.println(stuName[i]+ "학생의 국어 점수를 입력하세요");
			kr[i] = sc.nextInt();
			System.out.println(stuName[i]+ "학생의 수학 점수를 입력하세요");
			math[i] = sc.nextInt();
		}
		System.out.println();
		for (int i=0; i<student; i++) {
			krSum += kr[i];
			
		}
		for (int i=0; i<student; i++) {
			mathSum += math[i];
			
		}
		System.out.println("국어 점수 반 평균: " + krSum/student);
		System.out.println("수학 점수 반 평균: " + mathSum/student);
		/*System.out.println("국어 성적표");
		for (int i=0; i<student; i++) {
			System.out.println(stuName[i]+": "+kr[i]);
		}*/

	}

}
