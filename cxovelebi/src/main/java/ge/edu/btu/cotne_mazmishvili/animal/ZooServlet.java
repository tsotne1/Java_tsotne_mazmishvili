package ge.edu.btu.cotne_mazmishvili.animal;

import ge.edu.btu.cotne_mazmishvili.animal.model.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/zooservlet")
public class ZooServlet extends HttpServlet {

    public static final String VIEW = "/zoo.jsp";
    Animal animal = new Animal();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("animal",new Animal("jeka", "dog", "labrador", "black", "12"));

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        animal.setName(req.getParameter("name"));
        animal.setType(req.getParameter("type"));
        animal.setBreed(req.getParameter("breed"));
        animal.setColor(req.getParameter("color"));
        animal.setAge(req.getParameter("age"));

        System.out.println(animal.getName());
        System.out.println(animal.getType());
        System.out.println(animal.getBreed());
        System.out.println(animal.getColor());
        System.out.println(animal.getAge());


    }
}