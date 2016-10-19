

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter p;
String username,password;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		p= response.getWriter();
		username = request.getParameter("username");
		password=request.getParameter("password");
		p.println("given name:"+username);
	}

}
