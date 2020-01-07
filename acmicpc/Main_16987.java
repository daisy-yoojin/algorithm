import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16987{
	public static int[] s;
	public static int[] w;
	public static int N;
	public static int maxCnt;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine()); // 계란의 수 N (1<=N<=8)
		//가능하면 무조건 배열로 하자
		s =  new int[N];	// 내구도
		w =  new int[N];	// 무게
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			s[i] = Integer.parseInt(st.nextToken());	//	내구도	1<= s <=300
			w[i] = Integer.parseInt(st.nextToken());	//	무게		1<= w <=300	
		}
		//dfs이용
		maxCnt = 0; // 깨진 계란의 최댓값
		dfs(0,0);
		System.out.println(maxCnt);
	}//end of main
	public static void dfs(int index, int cnt) {
		if(cnt>=N-1 || index == N ) {//종료파트
			if(maxCnt<cnt) maxCnt = cnt; // 최댓값 업데이트
			return ;
		} 
		if(s[index]<=0) {
			dfs(index+1, cnt);
			return;
		}
	//반복문
		for (int i = 0; i < N; i++) {
			if(i==index) continue; // 자기계란을 자기를 깰수 없으므로
			if(s[i]<=0) continue; // 내구도가 0인계란 == 깨진 계란 ==> 때릴수 없다.
			s[i]-=w[index];
			s[index]-=w[i];
			int tmpCnt = 0; // 이번에 깨진 계란
			if(s[i]<=0) tmpCnt++;// 깨졌니?
			if(s[index]<=0) tmpCnt++;// 깨졌니?
			dfs(index+1, cnt+tmpCnt);//다음턴 호출 -->턴을 되돌아 와야하므로 저장 안하고 사용
			s[i]+=w[index];
			s[index]+=w[i];
		}		
	}
}