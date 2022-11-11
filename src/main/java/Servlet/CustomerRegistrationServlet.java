package Servlet;

import Dao.CustomerDaoImpl;
import pojo.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegisterCustomer")
public class CustomerRegistrationServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();
        String customerName=req.getParameter("name");
        String address=req.getParameter("Address");
        long aadharNumber=Long.parseLong(req.getParameter("aadhar").trim());
        String purpose=req.getParameter("purpose");
        Customer customer=new Customer(customerName,address,aadharNumber,purpose);
        CustomerDaoImpl customerDao=new CustomerDaoImpl();
        customerDao.addCustomer(customer);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("index.jsp");
        printWriter.println("Customer has been added");
        requestDispatcher.forward(req,resp);
    }
}
