package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardService;
import command.CommandHandler;

public class ListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		String tmp = req.getParameter("page");
        int pageNo = (tmp != null && tmp.length() > 0)
                ? Integer.parseInt(tmp) : 1;

        req.setAttribute("msgList",
                new BoardService().getMsgList(pageNo));
        req.setAttribute("pgnList",
                new BoardService().getPagination(pageNo));
		return "/WEB-INF/view/list.jsp";
	}

}
