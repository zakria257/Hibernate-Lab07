import java.io.IOException;
import java.sql.SQLException;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 

public class DBMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    	Session session = factory.openSession();  
    	Transaction t = session.beginTransaction();  
      
    	Person e1=new Person();    
        e1.setPerson_id(1);    
        e1.setName("zakria");
        e1.setFathername("rashid");
        e1.setOrganization("AREX");
        e1.setMobile("2345675");
     
        session.save(e1);  
        t.commit();  
        System.out.println("successfully saved");    
        factory.close();  
        session.close();     
		
	}
}
