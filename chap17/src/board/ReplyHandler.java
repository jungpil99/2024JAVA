package board;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.ReplyArticleService;
import mvjsp.chap17.board.service.ReplyingRequest;

public class ReplyHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int parentArticleId = Integer.parseInt(req.getParameter("parentArticleId"));
		String writerName = req.getParameter("writerName");
		String password = req.getParameter("password");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		ReplyingRequest replyingRequest = new ReplyingRequest(writerName, password, title, content, parentArticleId);
		
		try {
			Article postedArticle = ReplyArticleService.getInstance().
					reply(replyingRequest);
			req.setAttribute("postedArticle", postedArticle);
		} catch(Exception ex) {
			req.setAttribute("replyException", ex);
			try {
				res.sendRedirect("reply_error.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		return "/WEB-INF/view/reply_success.jsp";
	}

}
