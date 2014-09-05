package br.com.webproject.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Result() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		String nome = request.getParameter("primeiro_nome");
		writer.println("<!DOCTYPE HTML>");
		writer.println("<HTML>");
		writer.println("<HEAD>");
		writer.println("<META CHARSET=\"UTF-8\">");
		writer.println("<TITLE>Formulário</TITLE>");
		writer.println("</HEAD>");
		writer.println("<BODY>");
		writer.println("<span>Cadastro Realizado com Sucesso " + nome + "!!!</span>");
		writer.println("</BODY>");
		writer.println("</HTML>");
	}

}
