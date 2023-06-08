package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
//@WebServlet("/test1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("In init by"+getClass());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("In destroy by"+getClass());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){
			pw.print("<h4>Welcome to Servlets"+LocalDateTime.now()+"</h4>");
		}
		
	}

}
