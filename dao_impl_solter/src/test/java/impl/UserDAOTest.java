package impl;

import java.util.Date;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.solida.dao.RoleDAO;
import com.solida.dao.UserDAO;
import com.solida.dao.model.impl.RoleImpl;
import com.solida.dao.model.impl.UserImpl;
import com.solida.model.Role;
import com.solida.model.User;


public class UserDAOTest extends TestCase {


	public void testUser() {

		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spring/config/application-context.xml");

		UserDAO userDAO = (UserDAO)appContext.getBean("userDao");

		/** insert **/
		User user = new UserImpl();
		user.setDesUser("solida");
		user.setDesPassword("solida");
		userDAO.save(user);

		/** select **/
		User user2 = userDAO.findByDesUser("solida");
		System.out.println(user2);

		/** update **/
		user2.setDesPassword("solida1234");
		userDAO.update(user2);

		/** delete **/
		userDAO.delete(user2);

		System.out.println("Done");
    }

    public void testCreateUserRole() {

    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/application-context.xml");
  	 
    	UserDAO userDAO = (UserDAO)appContext.getBean("userDao");
    	RoleDAO roleDAO = (RoleDAO)appContext.getBean("roleDao");

    	Role role = new RoleImpl();
      	role.setDesRole("ROLE_ADMIN");
      	role.setDesDescripcion("Perfil Administrador");
      	roleDAO.save(role);
    	
    	/** insert **/
    	UserImpl user = new UserImpl();
    	user.setDesUser("solida");
    	user.setDesPassword("solida");

    	user.setFecCreacion(new Date());
    	user.setFecUltimoAcceso(new Date());
    	user.setFlgActive(true);
    	user.setRole(role);
    	userDAO.save(user);
    }
    
    
}