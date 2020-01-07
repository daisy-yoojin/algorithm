package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2068 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String[] arr = br.readLine().split("");
			
			int max=Integer.parseInt(arr[0]);
			for (int j = 0; j < 10; j++) {
				if(max<=Integer.parseInt(arr[j])) {
					max = Integer.parseInt(arr[0]);
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}
}
