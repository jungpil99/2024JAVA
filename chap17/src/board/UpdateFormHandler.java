package board;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.ArticleNotFoundException;
import mvjsp.chap17.board.service.ReadArticleService;

public class UpdateFormHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			int articleId = Integer.parseInt(req.getParameter("articleId"));
			Article article = ReadArticleService.getInsteance().getArticle(articleId);
			req.setAttribute("article", article);
		} catch (ArticleNotFoundException ex) {
			try {
				res.sendRedirect("/article_not_found.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		return "/WEB-INF/view/update_form_view.jsp";
	}

}
