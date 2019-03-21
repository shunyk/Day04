package com.shunyk.array1;

import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select=0;
		boolean a = true;
		int student=0;
		System.out.println("총 학생 수 입력");
		student =sc.nextInt();
		String stuName[] = new String [student];
		int stuNo[] = new int[student];
		int kr[] = new int[student];
		int math[] = new int[student];
		int eng[] = new int[student];

		int find=0;
		do {
			System.out.println("원하는 버튼을 선택해주세요 \n1번 학생 등록\n2번 전체정보 조회\n3번 학생정보 검색\n4번 프로그램 종료\n");
			select = sc.nextInt();
			switch(select) {
			case 1:
				
				
				for(int i=0; i<student; i++) {
					System.out.println("학생 번호");
					stuNo[i] = sc.nextInt();
					System.out.println("학생 이름");
					stuName[i] = sc.next();
					System.out.println("국어 점수");
					kr[i] = sc.nextInt();
					System.out.println("수학 점수");
					math[i] = sc.nextInt();
					System.out.println("영어 점수");
					eng[i] = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("=====전체 정보 조회=====");
				System.out.println("번호\t이름\t국어점수\t수학점수\t영어점수");
				for(int i=0; i<student; i++) {
					System.out.println(stuNo[i] + "\t" + stuName[i] + "\t" + kr[i] + "\t" + math[i] + "\t" + eng[i]);
				}
				break;
			case 3:
				System.out.println("찾으시는 학생의 번호를 입력해주세요");
				find = sc.nextInt();
				System.out.println(stuNo[find] + "\t" + stuName[find] + "\t" + kr[find] + "\t" + math[find] + "\t" + eng[find]);
				break;
			case 4:
				a = false;
				break;
			}
			
		}while(a == true);
		System.out.println("프로그램 종료");

	}

}
