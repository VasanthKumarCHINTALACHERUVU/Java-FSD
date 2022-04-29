package assignment;

public class Inner7 {



			 private String msg="Welcome to Java"; 
			 
			 class Inner
			 {  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) 
			{

				Inner7 obj=new Inner7();
				Inner7.Inner in=obj.new Inner();  
				in.hello();  
			}
		}


		class Program7Inner2{

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			Program7Inner2 ob=new Program7Inner2();  
			ob.display();  
			}
		}

