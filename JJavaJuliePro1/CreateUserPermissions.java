package JJavaJuliePro1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateUserPermissions {

	public static List<Permission> main(){
	
List<Permission> PermissionList = new ArrayList <Permission> ();
	
System.out.println("Start creating Permission List for roles");
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	
	for(int i=0; i<3; i++) {
		
	System.out.print("Enter your role ");  
	String rolename= sc.nextLine();  
	System.out.print("Enter Your permission "); 
	String permission= sc.nextLine();
	System.out.print("Is Your active? ( enter True or False only "); 
	String activea=sc.nextLine();
	
	Boolean Active= Boolean.parseBoolean(activea);
	Permission P = new Permission(rolename,permission,Active);
	 PermissionList.add(i,P);
	
	}//end for 
	//sc.close();
	return PermissionList;
	
	}//end main
	
} //end class
