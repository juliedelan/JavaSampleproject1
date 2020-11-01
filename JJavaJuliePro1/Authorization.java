package JJavaJuliePro1;

import java.util.List;
import JJavaJuliePro1.*;

public class Authorization {
	
		  public List<Permission> permissions; // List of Permission object
		  public List<User> users;  // List of Users object

		  
		// Authorization class constructor : if create authorization object, tht   
		  public Authorization(List<Permission> permissions, List<User> users) {
		    this.permissions = permissions;
		    this.users = users;
		  }
		  
		  

	}//end Authorization class