package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Car;

public class CarDaoImpl implements CarDao{
    public void addCar(Car car)
    {
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(car);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
