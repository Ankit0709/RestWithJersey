package beans;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeData 
{
	static Session session=new Configuration().
			addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
	public  static void  store()
	{
		
		 try
		 {
			session.save(new Employee("Raman","Java Developer",40000));
			session.save(new Employee("Seeta",".Net Developer",30000));
			session.save(new Employee("Shyam","Javascript Developer",50000));
			session.save(new Employee("Priyanka","Ios Developer",40000));
			session.save(new Employee("Aman","Android Developer",30000));
	       session.beginTransaction().commit();
		 }
		 catch(Exception e)
		 {
			 session.beginTransaction().rollback();
		 }
		
		
	
	}
	
	public static  List<Employee> fetch()
	{  Query<Employee> e1=session.createQuery("from Employee");
		
	return  e1.getResultList() ;
	}
	
	
	public static Employee fetchById(int id)
	{
		Employee e=session.get(Employee.class,id);
		if(e!=null)
			return e;
		else
			return (new Employee("NA","NA",0));
	}

	
	public static String storeData(Employee e)
	{
		session.save(e);
		session.beginTransaction().commit();
		return "Data Stored";
		
	}
	
	public static String updateData(Employee e)
	{ 
		session.update(e);
		session.beginTransaction().commit();
		return "Data Updated";
	}
	public static String removeData(Employee e)
	{
		session.remove(e);
		session.beginTransaction().commit();
		return "Data Removed";
				
	}
	public static String removeDataById(int id)
	{
		session.remove(session.get(Employee.class, id));
		session.beginTransaction().commit();
		return "Data Removed";
	}
}
