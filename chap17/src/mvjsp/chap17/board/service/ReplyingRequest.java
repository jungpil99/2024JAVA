package mvjsp.chap17.board.service;

public class ReplyingRequest extends WritingRequest {

	private int parentArticleId;
	
	public ReplyingRequest(String writerName, String password, String title, String content, int parentArticleId) {
		super(writerName, password, title, content);
		this.parentArticleId = parentArticleId;
	}
	public int getParentArticleId() {
		return parentArticleId;
	}
	public void setParentArticleId(int parentArticleId) {
		this.parentArticleId = parentArticleId;
	}
	
}
