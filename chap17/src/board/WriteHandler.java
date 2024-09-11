package board;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.IdGenerationFailedException;
import mvjsp.chap17.board.service.WriteArticleService;
import mvjsp.chap17.board.service.WritingRequest;

public class WriteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String writerName = req.getParameter("writerName");
		String password = req.getParameter("password");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		WritingRequest writingRequest = new WritingRequest(writerName, password, title, content);
		Article postedArticle = null;
		try {
			postedArticle = WriteArticleService.getInstance().write(writingRequest);
			req.setAttribute("postedArticle", postedArticle);
		} catch (IdGenerationFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return "/WEB-INF/view/write.jsp";
	}

}
