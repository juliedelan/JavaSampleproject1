package JJavaJuliePro1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
  //import all classes in this package
import java.util.Scanner;

public class EmployeeRolesID {

	static List <User> MyUserList;
	static List <Permission> MyUserPermisionList;
	
	
	
	public static void main(String[] args) throws IOException {
		
		MyUserList = CreateUsers.main();
		//System.out.println(MyUserList.get(0).name);
		MyUserPermisionList = CreateUserPermissions.main();
		
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter Employee ID number whose permission you want to see ");  
		int IDnum= sc.nextInt();
		sc.close();
		EmployeeRolesID ER = new EmployeeRolesID();
		List <String> S = ER.listPermissions(IDnum);
		ER.PrintPermission(S);
		
	}//end main
	
	public List<String> GetUserRole(int id) {
		int ID=id;
		int i=0;
		List<String> L = new ArrayList <>();
		while( i<MyUserList.size()) {
			int j = MyUserList.get(i).id;
			if(j == ID){
			//	System.out.println(" I found user in my user list");
				L= MyUserList.get(i).roles;
				break;
			}//end if
			else {i++;}
		}// end while	
		return L;
	}//end Get user role
	
	public List<String> listPermissions(int userId) {
		  
		List<String> myUserRoles;
		  
	    int user_id=userId ;
	    myUserRoles= GetUserRole(userId) ;// store all roles for this user ID
	    System.out.println(" Roles for "+ "user "+user_id + " are:");
	    System.out.print(myUserRoles.get(0) + " ");
	    System.out.println(myUserRoles.get(1));
	     int m= myUserRoles.size();
	    if( m == 0)
	    {
	    System.out.println("This user has No roles assigned");
	    return null;
	    }//end if
	    	      
	    else 
	    {
	    	  int j =-1; //permission list index
	    	  List<String> myUserPermissions= new ArrayList<>(); // string to store permissions
	    	  
	    	  for (int k =0; k<myUserRoles.size(); k++) 
	    	  {
	    		  String s= myUserRoles.get(k).toString(); 
	    		 //System.out.println(s);
	    	      int i =0;
	    	      for(i=0; i<MyUserPermisionList.size();i++)
	    	      {
	    	    	 // System.out.println("I am in While loop");
	    	    	  // Iterate through permission object list
	    	    	 Permission P= MyUserPermisionList.get(i); // get each permission object
	    	    	// System.out.println("first role in permission LIst is "+ P.role);
	    	    	 if ((P.role).equalsIgnoreCase(s)) 
	    	    	 {  // if find the searching role
	    	    		 j++;
	    	    		 myUserPermissions.add(j, (P.name.toString())); //get the permission name
	    	    		//  System.out.print("I am in if loop "); 
	    	    		   
	    	    	 }//end if
	    	    	 else {
	    	    		 // System.out.print("I am in else loop "); 
	    	    	 	  }//end else
	    	      }// end for1
	    	      
	    	    //  System.out.print("I am out of while loop "); 
	    	  }// end for 
	    	//1
	    	  //System.out.print("I am out of for loop "); 
	    	  
	    	  return myUserPermissions;
	    	 
	    }//end else
	         
	  }//end List permission method
	
	
	public void PrintPermission(List<String> S) {
		System.out.println("Your selected user has the follwoing permissions:");
	for(int i=0; i<S.size();i++) {
		
		System.out.println(S.get(i));
		}//end for
		
	}//end PrintPermission

	  public boolean checkPermitted(String permissionName, int userId) {
	    // TODO: fill this out!
	    throw new RuntimeException("Please remove this when you implement this function");
	  	}
	


}



