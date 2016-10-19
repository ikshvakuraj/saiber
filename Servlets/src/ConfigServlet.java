

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ConfigServlet
 */
@WebServlet(
		urlPatterns = { "/ConfigServlet" }, 
		initParams = { 
				@WebInitParam(name = "value", value = "10")
		})
public class ConfigServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
int count;
PrintWriter p;	
/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		count=Integer.parseInt(config.getInitParameter("value"));
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		p=response.getWriter();
		p.println("<html>");
		p.println("<body>");
		count++;
		p.println("Message from Servlet:"+count);
		p.println("</body>");
		p.println("</html>");
	
	
	
	}
	
	public void destroy()
	{
		
		p=null;
		
	}

}
