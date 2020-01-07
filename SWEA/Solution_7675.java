package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7675 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine().trim());
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			int count = 0;
			String ans = "";
			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				int capital = 0;
				boolean boo = true;
				if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
					for (int i = 0; i < s.length(); i++) {
						if (i > 0 && boo == true && s.charAt(i) != '!' && s.charAt(i) != '.' && s.charAt(i) != '?'
								&& s.charAt(i) < 97 || s.charAt(i) > 122) {
							boo = false;
						}
						if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
							capital++;
						}
					}
				}
				if (capital == 1 && boo == true) {
					count++;
				}
				if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '?'
						|| s.charAt(s.length() - 1) == '!') {
					ans += (count + " ");
					count = 0;
				}
			}

			System.out.println("#" + tc + " " + ans);
		}
	}
}
