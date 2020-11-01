package JJavaJuliePro1;

import java.util.List;

//User object class
	public class User {
		
	  public User() {}
	  
// User class constructor.  user class object will have these	  
	  public User(int id, String name, List<String> roles) {
	    this.id = id;
	    this.name = name;
	    this.roles = roles;
	  }
	  public int id;
	  public String name;
	  public List<String> roles;
	  
	}// end user class
