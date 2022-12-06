package it.unicr.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/corso")
public class CorsoServlet extends HttpServlet {

	@Inject
	private CorsoService servizio;
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// MIME type della risposta
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Benvenuto al corso</h1>");
		out.println(servizio.messaggio());
		out.close();
	}
}
