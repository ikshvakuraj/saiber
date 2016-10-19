<%!
String username,password;

%>
<%
username = request.getParameter("username");
password = request.getParameter("password");

if((username.compareTo("admin")== 0)&&(password.compareTo("admin")==0))
{

out.print("Login Success");

}
else
out.println("login Fail");

 %>