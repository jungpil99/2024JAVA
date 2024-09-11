package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandHandler;
import mvjsp.chap17.board.model.Article;
import mvjsp.chap17.board.service.ArticleNotFoundException;
import mvjsp.chap17.board.service.ReadArticleService;

public class ReadHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		int articleId = Integer.parseInt(req.getParameter("articleId"));
		String viewPage = null;
		try {
			Article article = ReadArticleService.getInsteance().readArticle(articleId);
			req.setAttribute("article", article);
		} catch(ArticleNotFoundException ex) {
			viewPage = "/article_not_found.jsp";
		}
		return "/WEB-INF/view/read_view.jsp";
	}

}
