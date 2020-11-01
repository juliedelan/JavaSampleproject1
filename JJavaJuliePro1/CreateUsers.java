package JJavaJuliePro1;

import java.io.IOException;
import java.util.*;

public class CreateUsers {

	public static List<User> main()throws IOException {
				
	List<User> UsersList = new ArrayList <User> ();
	
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	for(int i=0; i<4; i++) {
	
	System.out.print("Enter Employee ID number ");  
	String a= sc.nextLine();
	System.out.print("Enter your name ");  
	String name= sc.nextLine();  
	System.out.print("Enter Your Role1 "); 
	String role1= sc.nextLine();
	System.out.print("Enter Your Role2 "); 
	String role2= sc.nextLine();
	
	int IDnumber = Integer.parseInt( a );
	int j=0; 
	List<String> S = new ArrayList<>();
	S.add(j,role1);
	S.add(j+1,role2);
	 User U = new User(IDnumber,name,S);
	// System.out.println(S.get(j) + "and"+ S.get(j+1));
	UsersList.add(i,U);
//	System.out.println("stored object in list");
	
	//System.out.println(UsersList.get(i).name);
	
	}//end for 
	System.out.println("Done creating User List");//
	//sc.close();
	
	return UsersList;
	
	}//end Main
	
	
	

}
