package assignment;



	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  

	public class Diamond20 implements First, Second  {
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 



		public static void main(String[] args) {
		    { 
		        Diamond20 ob = new Diamond20(); 
		        ob.show(); 


		}

		}
	}
	
