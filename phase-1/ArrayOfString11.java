package assignment;

import java.util.Scanner;

public class ArrayOfString11 {

	public static void main(String[] args) {
				
				String[] strA = { "vasanth", "vandana", "surekha" };
				
				
				for (String element: strA) 
				{
		            System.out.println("strArray elements are:" +element);
				}
				
				
				Scanner ip = new Scanner(System.in);
				 System.out.println("Enter a string");
		         String str = ip.nextLine();
				
		        
		                
		         if(str == "strA[0]" || str == "strA[1]" || str == "strA[2]")
		         {
		            System.out.println(" String is found  :" +str);  
		         }
		         else  
		         {
		             System.out.println(" String is not found in the array :");  
		         }
		         }  
		}