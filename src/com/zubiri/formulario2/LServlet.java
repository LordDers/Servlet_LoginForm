package com.zubiri.formulario2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LServlet
 */
public class LServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Contraseina: " + password);
		
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>" + usuario + " " + password + "</p>");	
		out.println("</body>");
		out.println("</html>");*/
		
		if (usuario.equals("ruben") && password.equals("alvarez")) {
			response(response, "Bienvenido", usuario);
		} else {
			response(response, usuario, password);
		}
	}
	
	private void response(HttpServletResponse response, String usuario, String password) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>" + usuario + " " + password + "</p>");	
		out.println("</body>");
		out.println("</html>");
	}

}
