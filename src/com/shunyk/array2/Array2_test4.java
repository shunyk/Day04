package com.shunyk.array2;

public class Array2_test4 {

	public static void main(String[] args) {
		int num1[] = {1,2,3};
		int num2[] = {4,5,6};
		int nums[] [] = new int[2] [3];
		
		nums[0] = num1;
		nums[1] = num2;
		
		System.out.println(nums[0][1]);
		System.out.println(nums[1][0]);
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.println(nums[i] [j]);
			}
		}
		
		int a = 10;
		int b = 20;
		int ab[] = new int [2];
		ab[0]=a;
		ab[1]=b;

	}

}
