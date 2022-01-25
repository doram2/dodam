
public class Writing {
	
	int num;
	String writer;
	String subject;
	String content;
	int view = 0;
	
	public Writing() {}
	
	public Writing(int num, String writer, String subject, String content, int view) {
		this(num, writer, subject, content);
		this.view = view;
	}
	
	public Writing(int num, String writer, String subject, String content) {
		
		this.num = num;
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}
	
	public int getNum() {
		return num;
	}
	public String getWriter() {
		return writer;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public int getView() {
		return view;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setView(int view) {
		this.view = view;
	}
	
}
