package com.ssafy.extra01;

import java.util.Scanner;

public class Solution_1954 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			// 입력
			int N = scan.nextInt();
			int[][] arr = new int[N][N];
			int r = 0, c = -1;
			int number = 1;
			int step = N;
			while (step > 0) {
				// 우
				for (int j2 = 0; j2 < step; j2++) {
					c++;
					arr[r][c] = number++;
				}
				step--;
				// 하
				for (int j2 = 0; j2 < step; j2++) {
					r++;
					arr[r][c] = number++;
				}
				// 좌
				for (int j2 = 0; j2 < step; j2++) {
					c--;
					arr[r][c] = number++;
				}
				step--;
				// 상
				for (int j2 = 0; j2 < step; j2++) {
					r--;
					arr[r][c] = number++;
				}
			}
			// 출력
			System.out.println("#" + tc);
			// 달팽이 출력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
