<html>
<head>
	<title>Student Information</title>
</head>
<body>
	<jsp:useBean id="student" scope="request" class="beans.Student"/>
	<jsp:setProperty name="student" property="*"/>
	<jsp:forward page="Display.jsp"/>
</body>	
</html>