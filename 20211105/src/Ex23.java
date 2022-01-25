import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("시작 단을 입력하세요: ");
			int startDan = Integer.parseInt(br.readLine());
			System.out.print("종료 단을 입력하세요: ");
			int endDan = Integer.parseInt(br.readLine());
			System.out.print("시작 곱을 입력하세요: ");
			int startGop = Integer.parseInt(br.readLine());
			System.out.print("종료 곱을 입력하세요: ");
			int endGop = Integer.parseInt(br.readLine());
			
			int dan = startDan;
			while (dan <= endDan) {
				int gop = startGop;
				while(gop <= endGop) {
					System.out.println(dan+"*"+gop+"="+dan*gop);
					gop++;
				}
				dan++;
			}
			
			System.out.println("종료하려면 'y'를 입력하세요 ");
			String stop = br.readLine();
			if(stop.equals("y")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
