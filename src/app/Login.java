package app;

import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login")
public class Login extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User userObject = new User();
        req.setAttribute("username", req.getParameter("loginname"));
        req.setAttribute("password", req.getParameter("password"));
        if (userObject.isValidUserCredentials(req.getParameter("loginname"), req.getParameter("password"))){
            req.getRequestDispatcher("/welcome.jsp").forward(req,resp);
        }
        else {
            req.setAttribute("errorMessage", "Invalid Login credentials. try again please!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("login-name"+req.getParameter("loginname")+"Password"+req.getParameter("password"));
    }
}
