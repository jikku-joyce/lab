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
      service.setServiceId(102);
      service.setServiceName("S3");
      service.setServiceCharge(11.00);
 
      s.save(service);                              
      s.flush(); 
      tx.commit();
      System.out.println("Records inserted");
      s.close();
      sf.close();
    }
    catch(Exception e){
    	s.close();
    	sf.close();
    	tx.rollback();                           
    }
  }
}
