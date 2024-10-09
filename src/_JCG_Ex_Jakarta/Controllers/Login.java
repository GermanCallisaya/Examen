package _JCG_Ex_Jakarta.Controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login_Verifica() {
        
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user");
		String password = request.getParameter("pass");
		if(u.equals("Pepe")&& p.equals("123456")) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", u);
			response.sendRedirect("login_bienvenido.jsp");
		}else
			response.sendRedirect("login_login.jsp");
	}

}
