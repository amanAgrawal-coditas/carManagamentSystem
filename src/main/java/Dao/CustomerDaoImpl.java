package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Customer;

public class CustomerDaoImpl implements CustomerDao
{
    public void addCustomer(Customer customer)
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
