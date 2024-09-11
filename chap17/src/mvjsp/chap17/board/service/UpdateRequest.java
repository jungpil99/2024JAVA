package mvjsp.chap17.board.service;

public class UpdateRequest {

	private int articleId;
	private String title;
	private String content;
	private String password;
	
	public UpdateRequest(int articleId, String title, String content, String password) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.content = content;
		this.password = password;
	}
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
