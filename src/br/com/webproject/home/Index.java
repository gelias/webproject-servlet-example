package br.com.webproject.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<!DOCTYPE HTML>");
		writer.println("<HTML>");
		writer.println("<HEAD>");
		writer.println("<META CHARSET=\"UTF-8\">");
		writer.println("<TITLE>Formulário</TITLE>");
		writer.println("</HEAD>");
		writer.println("<BODY>");
		writer.println("<FORM action=\"http://localhost:8080/webproject/Result\" method=\"POST\">");
		writer.println("<label for=\"masculino\">Masculino</label>");
		writer.println("<input type=\"radio\" name=\"sexo\" id=\"masculino\" value=\"masculino\"><br>");
		writer.println("<label for=\"feminino\">Feminino</label>");
		writer.println("<input type=\"radio\" name=\"sexo\" id=\"masculino\" value=\"feminino\"><br><br>");
		writer.println("<label for=\"primeiro_nome\">Nome:</label><br>");
		writer.println("<input type=\"text\" name=\"primeiro_nome\" id=\"nome\" ><br><br>");
		writer.println("<label for=\"primeiro_nome\">Sobrenome:</label><br>");
		writer.println("<input type=\"text\" name=\"sobrenome\" id=\"sobrenome\" ><br><br>");
		writer.println("<input type=\"submit\" value=\"Cadastrar\">");
		writer.println("</FORM>");
		writer.println("</BODY>");
		writer.println("</HTML>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
