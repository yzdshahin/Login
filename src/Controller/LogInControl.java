package Controller;

import Model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shahin_yzd on 8/15/2020.
 */
public class LogInControl extends HttpServlet {


    public void Pot(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html"); // by this we show our output type
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Person person = new Person();
        person.setUser(name);
        person.setPass(password);

        request.setAttribute("Person", person);

        boolean validatestatus =person.validate();

        if (validatestatus){
            RequestDispatcher requestDispatcher= request.getRequestDispatcher("login-success.jsp");
            requestDispatcher.forward(request,response);
        }else {
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("login-error.jsp");
            requestDispatcher.forward(request,response);
        }

    }
}