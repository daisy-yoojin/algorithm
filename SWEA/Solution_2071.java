package com.ssafy.algo;

import java.util.Scanner;

public class Solution_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int T  = scan.nextInt();
		int[] arr = new int[10];
		for(int i =1 ;i<=T;i++) {
			int sum=0;
			for(int j = 0;j<10;j++) {
				arr[j] =scan.nextInt();
				sum+=arr[j];
			}
			if(sum%10<5) {
				System.out.println("#"+i+ " "+sum/10);
			}else {
				System.out.println("#"+i+ " "+(sum/10+1));				
			}
		}		
	}
}
