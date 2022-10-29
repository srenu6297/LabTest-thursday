// Author Name : Renu Sharma

/*
 * 2.Create HibernateUtility class -----HibernateUtil

    Session getSession();
 */

package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session getSession()  {

		Configuration cfg=new Configuration();
        cfg.configure();


        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        return session;
	}

	}
