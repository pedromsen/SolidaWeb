package impl;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.solida.dao.RoleDAO;
import com.solida.dao.model.Role;


public class RoleDAOTest extends TestCase {


    public void testRole() {

    	ApplicationContext appContext = 
  	    	  new ClassPathXmlApplicationContext("spring/config/application-context.xml");
  	 
  	    	RoleDAO roleDAO = (RoleDAO)appContext.getBean("roleDao");
  	 
  	    	/** insert **/
  	    	Role role = new Role();
  	    	role.setDesRole("ROLE_ADMIN");
  	    	role.setDesDescripcion("Perfil Administrador");
  	    	roleDAO.save(role);
  	 
  	    	/** select **/
  	    	Role role2 = roleDAO.findByDesRole("ROLE_ADMIN");
  	    	System.out.println(role2);
  	 
  	    	/** update **/
  	    	role2.setDesDescripcion("Perfil Super Administrador");
  	    	roleDAO.update(role2);
  	 
  	    	/** delete **/
  	    	roleDAO.delete(role2);
  	 
  	    	System.out.println("Done");
    }

  

}