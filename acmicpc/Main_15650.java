import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_15650 {
	public static int[] mArr;
	public static int[] nArr;
	private static int M;
	private static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		N = s.charAt(0) - '0';
		M = s.charAt(2) - '0';
		nArr = new int[N];
		for (int i = 0; i < N; i++) {
			nArr[i] = i+1;
		}
		mArr = new int [M]; // 뽑을 수 저장 
		comb(0,0);
		
	}// end of main
	public static void comb(int n, int m) {
		if(m==M) { // 종료 조건
			for (int i = 0; i < mArr.length; i++) {
				System.out.print(mArr[i]+" ");
			}
			System.out.println();
		}else if(n==N) {
			return;
		}else { // 재귀
			mArr[m] = nArr[n];
			comb(n+1,m+1);
			comb(n+1,m);
		}
	}// end of comb
}// end of class
