package assignment;

public class Accessmodifiers2 {
	
		void display() 
	    { 
	        System.out.println("You are using defalut access specifier"); 
	    } 
	 private void methodPrivate() 
	    { 
	       System.out.println("You are using private access specifier");   
	    } 
	 protected void methodProtected() 
	    { 
	     System.out.println("This is protected access specifier"); 
	    } 
	 public void methodPublic() 
	    { 
	     System.out.println("This is Public Access Specifiers"); 
	    } 
	 
	 
	 public static void main(String[] args) 
	 {
		  System.out.println("Dafault Access Specifier");
		  Accessmodifiers2 obj = new Accessmodifiers2(); 		  
	     obj.display(); 
	     
	     System.out.println("Private Access Specifier");
	     Accessmodifiers2  obj1 = new Accessmodifiers2();  
	     obj1.display();
	     
	     System.out.println("Protected Access Specifier");
	     
	     System.out.println("Public Access Specifier");
	     
	 }

	 
	}