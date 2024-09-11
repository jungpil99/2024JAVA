package board;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.UpdateArticleService;
import mvjsp.chap17.board.service.UpdateRequest;

public class UpdateHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int articleId = Integer.parseInt(req.getParameter("articleId"));
		String title = req.getParameter("title");
		String password = req.getParameter("password");
		String content = req.getParameter("content");
		UpdateRequest updateRequest = new UpdateRequest(articleId, title, content, password);
		
		
		try {
			Article article = UpdateArticleService.getInstance().
					update(updateRequest);
			req.setAttribute("updatedArticle", article);
		} catch (Exception ex) {
			req.setAttribute("updateException", ex);
			try {
				res.sendRedirect("update_error.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		

		return "/WEB-INF/view/update_success.jsp";
	}

}
