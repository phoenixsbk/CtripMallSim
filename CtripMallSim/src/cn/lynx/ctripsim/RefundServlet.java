package cn.lynx.ctripsim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RefundServlet
 */
@WebServlet("/mall-api/openapi/updateorderrefundinfo")
public class RefundServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	    IOException {
	request.setCharacterEncoding("UTF-8");
	PrintWriter pw = response.getWriter();
	response.setStatus(200);
	response.setContentType("application/json");

	pw.write("{\"result\": 0, \"resultmessage\":\"成功更新refund数据\"}");
	pw.flush();
	pw.close();
    }

}
