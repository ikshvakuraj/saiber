<html>
<body>
<%@ page import = "java.sql.*,javax.servlet.http.*"%>
<%!
Connection con;
Statement st;
ResultSet rs;

String value;
String insert,search;

%>

<% 
	
	insert = request.getParameter("Insert");
	search = request.getParameter("Search");
out.println(insert);
out.println(search);
	
	
	
	if((insert.compareTo("Insert") == 0)&&(search.compareTo("null") == 0) )
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Mylove1718");
	
	st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	rs = st.executeQuery("select * from users");

	while(rs.next())
	{
	
		   
		 out.println(rs.getString(1) 
		   +" "+rs.getString(2));


	}
	
	
	
	}
	
	
	if((insert.compareTo("null") == 0)&&(search.compareTo("Search") == 0) )
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Mylove1718");
	
	st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	rs = st.executeQuery("select * from bank");

	while(rs.next())
	{
	
		   
		
	  out.println(rs.getString(1) +" "+rs.getInt(2)
	   +" "+rs.getString(3));


	}
	
	}
	
%>
</body>
</html>

