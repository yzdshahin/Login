package View;
import Model.LogInModel;
import Model.Person;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by shahin_yzd on 8/14/2020.
 * https://www.javatpoint.com/MVC-in-jsp
 */
public class LogInView extends HttpServlet {
    public void Pot(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html"); // ny this we show our output type
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Person person=new Person();
        person.setUser(name);
        person.setPass(password);

        request.setAttribute("Person",person);





    }


    }

}