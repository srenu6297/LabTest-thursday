package com.hibernate;



import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session=HiberUtil.getSession();
    	//Shape s=new Shape();
    	//s.setShapeId(10);
    	
    	
    	Rectangle r=new Rectangle();
    	
    	r.setLength(12);
    	r.setBreadth(50);
    	
    	Circle c=new Circle();
    	
    	c.setRadius(30); 
    	
    	Transaction t=session.beginTransaction();
		//session.save(s);
		session.save(r);
		session.save(c);
		t.commit(); 
		session.close();
    }
}
