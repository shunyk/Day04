package com.shunyk.array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		int select;

		int student=0;
	
		String stuName[]= new String[50];
		int stuNo[]= null;
		int kr[]= null;
		int math[]= null;
		int eng[]= null;
		int total[]=null;

		int find=0;
		do {


			System.out.println("원하는 버튼을 선택해주세요 \n1번 학생 등록\n2번 전체정보 조회\n3번 학생정보 검색\n4번 전체 정보 총점순으로 출력\n5번 프로그램 종료\n");
			select = sc.nextInt();
		
			switch(select) {
			case 1:
				System.out.println("총 학생 수 입력");
				student =sc.nextInt();
			
				stuNo = new int[student];
				stuName = new String[student];
				kr = new int[student];
				math = new int[student];
				eng = new int[student];
				total = new int[student];
				
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
					total[i] = kr[i]+eng[i]+math[i];
				}
				break;
			case 2:
				System.out.println("=====전체 정보 조회=====");
				System.out.println("번호\t이름\t국어점수\t수학점수\t영어점수\t총 점수");
				for(int i=0; i<student; i++) {
					System.out.println(stuNo[i] + "\t" + stuName[i] + "\t" + kr[i] + "\t" + math[i] + "\t" + eng[i] + "\t" + total[i]);
				}
				break;
			case 3:
				System.out.println("찾으시는 학생의 번호를 입력해주세요");
				find = sc.nextInt();
				for(int i=0; i<student;i++) {
					if(find == stuNo[i]) {
						System.out.println(stuNo[i] + "\t" + stuName[i] + "\t" + kr[i] + "\t" + math[i] + "\t" + eng[i] + "\t" + total[i]);
					}
					if(i== student-1) {
						System.out.println("찾으시는 학생이 없습니다.");
					}
				}
				break;
			case 4:
				System.out.println("=====총 점수를 오름 차순으로 정렬합니다.=====");
				System.out.println("번호\t이름\t국어점수\t수학점수\t영어점수\t총 점수");
				int b;
				int c;
				int d;
				int f;
				int e;
				String z;
				for(int i=0; i<student; i++) {
					for(int j=i+1; j<student; j++) {
						if (total[i]<total[j]) {
							b=total[j];
							total[j]=total[i];
							total[i]=b;
							
							b=stuNo[j];
							stuNo[j]=stuNo[i];
							stuNo[i]=b;
							
							z=stuName[j];
							stuName[j]=stuName[i];
							stuName[i]=z;
							
							b=kr[j];
							kr[j]=kr[i];
							kr[i]=b;
							
							b=math[j];
							math[j]=math[i];
							math[i]=b;
							
							b=eng[j];
							eng[j]=eng[i];
							eng[i]=b;
						}
					}
				}
				for(int x=0; x<student; x++) {
					System.out.println(stuNo[x] + "\t" + stuName[x] + "\t" + kr[x] + "\t" + math[x] + "\t" + eng[x] + "\t" + total[x]);
				}
				break;
			case 5:
				a = false;
				break;
			}
			
		}while(a == true);
		System.out.println("프로그램 종료");
	}

}
