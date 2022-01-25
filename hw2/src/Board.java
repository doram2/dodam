import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Board {
	
	public static int write_select;
	public static Writing[] writing;
	public static int count = 0;
	public static int select = 0;
	
	public static BufferedReader br;
	public static BufferedWriter bw;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		writing = new Writing[100];
		
		while(true) {
			view();
			
			select = Integer.parseInt(br.readLine());
			
			if(select == 1) {
				write();
				continue;
			}
			else if(select == 2) {
				detail();
			}
		}
	}
	

	private static void write() throws IOException{//글 작성
		while(true) {
			System.out.println("글 작성 페이지입니다.");
			System.out.print("글쓴이: ");
			String writer = br.readLine();
			
			System.out.print("제목: ");
			String subject = br.readLine();
			
			System.out.print("내용: ");				
			String content = br.readLine();
			writing[count] = new Writing(count+1, writer, subject, content);
			
			System.out.println("저장하려면 'y' 다시 쓰려면 'n'을 입력하세요");
			String save = br.readLine();
			if(save.equals("n")) {
				continue;
			}
			else if(save.equals("y")) {
				count++;
				break;
			}
			
		}
	}
	private static void detail() throws IOException { //게시글 세부 목록
		System.out.println("보고 싶은 게시글의 번호를 입력하세요: ");
		select = Integer.parseInt(br.readLine());
		//게시글 출력
		System.out.println("번호: "+writing[select-1].getNum());
		System.out.println("글쓴이: "+writing[select-1].getWriter());
		System.out.println("제목: "+writing[select-1].getSubject());
		System.out.println("내용: "+writing[select-1].getContent());
		writing[select-1].view++;
		//게시글 조회수 증가
		System.out.println();
		System.out.println("==========================================");
		System.out.println("1. 목록으로가기 | 2. 수정 | 3. 삭제");
		System.out.print("번호 선택 >");
		int detail_select = Integer.parseInt(br.readLine());
		if(detail_select == 1) {
			//목록으로 돌아가기
		}
		else if(detail_select == 2) {
			System.out.println("1. 글쓴이 수정 | 2. 제목 수정 | 3. 내용 수정");
			System.out.print("번호 선택 >");
			int k = Integer.parseInt(br.readLine());
			update(k);
		}
		else if(detail_select == 3) {
			writing[select-1].setNum(0);
		}
		
	}
	private static void view() throws IOException{//게시글 조회
		bw.write("게시글 목록\n");
		bw.write("번호\t글쓴이\t\t제목\t\t조회수\n");
		bw.flush();
		
		for(int i = 0; i < count; i++) {
			if(writing[i].getNum() == 0) {
				continue;
			}
			else {
			System.out.println(writing[i].getNum()+"\t"+writing[i].getWriter()+"\t\t"
								+writing[i].getSubject()+"\t\t"+writing[i].getView());
			}
		}
		System.out.println("==========================================");
		bw.write("1. 글쓰기 | 2. 상세보기\n");
		bw.write("번호선택 > ");
		bw.flush();
	}
	private static void update(int k) throws IOException {//1. 글쓴이 수정 2. 제목 수정 3. 내용 수정
		if(k == 1) {
			System.out.println("글쓴이: ");
			writing[select-1].setWriter(br.readLine());
		}
		else if(k == 2) {
			System.out.println("제목: ");
			writing[select-1].setSubject(br.readLine());
		}
		else if(k == 3) {
			System.out.println("내용: ");
			writing[select-1].setContent(br.readLine());
		}
		
		
	}
}
