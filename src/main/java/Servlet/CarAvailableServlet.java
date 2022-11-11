package Servlet;

import Dao.CarDaoImpl;
import Dao.CustomerDaoImpl;
import pojo.Car;
import pojo.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddCar")
public class CarAvailableServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        String carName=req.getParameter("name");
        String modelName=req.getParameter("ModelName");
        int carPrice=Integer.parseInt(req.getParameter("CarPrice").trim());
        int tokenPrice=Integer.parseInt(req.getParameter("tokenPrice"));
        int availableCars=Integer.parseInt(req.getParameter("availableCars"));
        Car car=new Car(carName,modelName,carPrice,tokenPrice,availableCars);
        CarDaoImpl carDao=new CarDaoImpl();
        carDao.addCar(car);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("index.jsp");
        printWriter.println("Car has been added");
        requestDispatcher.forward(req,resp);
    }
}
