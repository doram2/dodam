package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int M, N;
	public static boolean[][] cabbage;
	public static boolean[][] visit;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			cnt = 0;
			st = new StringTokenizer(br.readLine()," ");
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			cabbage = new boolean[M][N];
			visit = new boolean[M][N];
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine()," ");
				int w = Integer.parseInt(st.nextToken());
				int h = Integer.parseInt(st.nextToken());
				cabbage[w][h] = true;
			}
			
			for(int j = 0; j < M; j++) {
				for(int k = 0; k < N; k++) {
					if(cabbage[j][k] && !visit[j][k]) {
						worm(j,k);
						cnt++;
					}
					
				}
			}
			System.out.println(cnt);
			
		}
	
	}

	public static void worm(int w, int h) {
		visit[w][h] = true;
		for(int k = 0; k < 4; k++) {
			int nx = w+dx[k];
			int ny = h+dy[k];
			
			if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
				if(cabbage[nx][ny] && !visit[nx][ny]) {
					worm(nx,ny);
				}
			}
		}
	
	}
	

}
