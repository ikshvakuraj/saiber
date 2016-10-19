<html>
<body>
<%@ page import = "java.sql.*"%>
<%!
Connection con;
Statement st;
ResultSet rs;
String username,password;
String databasepassword;

%>

<% 
	username = request.getParameter("username");
	password = request.getParameter("password");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Mylove1718");
	
	st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	rs = st.executeQuery("select password from users where username ='"+username+"'");
	
	if(rs.next()== false)
	{
		out.print("Nothing" );
	}
	else
	{
		rs.beforeFirst();
		rs.next();
		
		databasepassword = rs.getString(1);
		
		if(password.equals(databasepassword))
		{
			out.println("login success");
		}
		else
		{
			out.println("login Fail");
		}
	}
	
%>
</body>
</html>

