<%! String username = null, password = null; %>
<%
	username = request.getParameter("uname");
	password = request.getParameter("pname");
%>
<%
	if(username.equals("saurav") && password.equals("12345"))
		response.sendRedirect("Welcome.jsp");
	else
		out.println("<center><h4>Invalid Username or Password</h4></center>");
%>
