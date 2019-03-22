package com.shunyk.array2;

import java.util.Arrays;

public class Array_2_test3 {

	public static void main(String[] args) {
		int [] points = {3,5,1,9,2};
		int a=0;
		/*for(int i=0; i<points.length-1; i++) {
			for(int j=i+1; j<points.length; j++) {
				if (points[i]>points[j]) {
					a=points[j];
					points[j]=points[i];
					points[i]=a;
				}
			}
			for(int z=0; z<points.length; z++) {
				System.out.print(points[z]);
			}
			System.out.println();
		}*/
		Arrays.sort(points);
		for(int z=0; z<points.length; z++) {
			System.out.print(points[z]);
		} 
	}

}
