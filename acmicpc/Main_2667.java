import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main_2667 {
	public static int[][] map;
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 지도 크기
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			String line  = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j)-'0';				
			}
		}//end of input
		List<Integer> danji = new ArrayList<>(); // 집 수 저장
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]==1) { // 
					int cnt = 1;
					Queue<int[]> q = new LinkedList<>();
					q.add(new int[] {i,j});
					map[i][j]=0;
					while(!q.isEmpty()) {
						int[] point = q.poll();
						for (int k = 0; k < dx.length; k++) {
							int newX = dx[k]+point[0];
							int newY = dy[k]+point[1];
							if(newX>=0 && newX<N && newY>=0 && newY<N && map[newX][newY]==1) {
								map[newX][newY]=0; // 0 setting
								cnt++;
								q.add(new int[] {newX,newY});
							}
						}
					}
					danji.add(cnt);
				}
			}
		}
		Collections.sort(danji);
		//단지수출력
		System.out.println(danji.size());
		//잔지내 집수 오름차순 출력
		for (int i = 0; i < danji.size(); i++) {
			System.out.println(danji.get(i));
		}
	}//end of main
}//end of class
