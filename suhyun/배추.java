package suhyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배추 {
	
	public static int cabbage[][];
	public static boolean visit[][];
	public static int w, h, cnt;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken()); //가로길이
			h = Integer.parseInt(st.nextToken()); //세로길이
			
			cabbage = new int[w][h];
			visit = new boolean [w][h];
			
			int k = Integer.parseInt(st.nextToken()); //배추의 갯수
			
			for(int j = 0; j < k; j++) { //배추의 좌표
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				cabbage[a][b] = 1;
			}
			
			
			for(int a = 0; a < w; a++) {
				for(int b = 0; b < k; b++) {
					if(cabbage[a][b] == 1 && visit[a][b] != true) {
						cnt += 1;
						worm(a,b);
					}
				}
			}
			
		}
		
	}
	
	public static int worm(int a, int b) {
		visit[a][b] = true;
		for(int k = 0; k < 4; k++) {
			int nx = a+dx[k];
			int ny = b+dy[k];
			
			if(nx >= 0 && ny >=0 && nx < w && ny < h) {
				worm(nx, ny);
			}
		}
		return cnt;
	}

}
