package com.jikku.study;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Client {
  public static void main(String[] args) throws Exception{
	  
    Configuration c = new Configuration();
    c.configure("/hibernate.cfg.xml");
    SessionFactory sf=c.buildSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
 
    try
    {
      ServiceDAO service=new ServiceDAO();
      service.setServiceId(100);
      service.setSname("S1");
      service.setServiceCharge(10.00);
 
      s.save(service);                              
      s.flush(); 
      System.out.println("Records inserted");
    }
    catch(Exception e)
    {
      tx.rollback();                           
    }
  }
}
