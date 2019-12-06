<html>
<head>
	<title>Student Information</title>
</head>
<body bgcolor=pink>
	<jsp:useBean id="student" scope="request" class="beans.Student"/>
	<h2>Enter Student Information</h2>
	<br><br>
	Student Name: <jsp:getProperty name="student" property="sname"/><br>
	Usn: <jsp:getProperty name="student" property="usn"/><br>
	Total Marks: <jsp:getProperty name="student" property="smarks"/><br>
</body>
</html>