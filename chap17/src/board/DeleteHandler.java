package board;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.service.DeleteArticleService;
import mvjsp.chap17.board.service.DeleteRequest;

public class DeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int articleId = Integer.parseInt(req.getParameter("articleId"));
		String password = req.getParameter("password");
		DeleteRequest deleteRequest = new DeleteRequest(articleId, password);
		try {
			DeleteArticleService.getInstance().deleteArticle(deleteRequest);
		} catch (Exception ex) {
			req.setAttribute("deleteException", ex);
			try {
				res.sendRedirect("delete_error.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		

		return "/WEB-INF/view/delete_success.jsp";
	}

}
