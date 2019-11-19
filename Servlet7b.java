import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet7b")
public class Servlet7b extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String filename = request.getParameter("f1");
		String root = "/" + filename;
		String absolutePath = getServletContext().getRealPath(root);
		System.out.println(root);
		File f = new File(filename);
		if(f.exists()) {
			out.println(f.getName());
			out.println("<hr size='2' style='color:green'>");
			out.println("Contents of file is<br>");
			out.println("<hr size='2' style='color:green'/><br>");
			BufferedReader in = new BufferedReader(new FileReader(f));
			String buf = "";
			while((buf = in.readLine())!=null) {
				out.write(buf);
				out.flush();
				out.println("<br/>");
			}
			in.close();
			out.println("<h3 size='3' style='color:red' </font></p></body>\n</html>>");
		}
		else {
			out.println("Filename: "+filename);
			out.println("File doesn't exists");
		}
	}
}