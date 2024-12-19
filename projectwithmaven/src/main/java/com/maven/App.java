package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Reads hibernate.cfg.xml
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        student st=new student();
        st.setId(106);
        st.setName("komal");
        st.setCity("stm");
        System.out.println(st);
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        //sessionFactory.getCurrentSession();
       // System.out.print(sessionFactory);
    }
}
