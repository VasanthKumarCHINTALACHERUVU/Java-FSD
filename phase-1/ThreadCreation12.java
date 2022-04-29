package assignment;

public class ThreadCreation12 {
	public static int myCount = 0;
    public ThreadCreation12(){
         
    }
    public void run() {
        while(ThreadCreation12.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++ThreadCreation12.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		ThreadCreation12 mrt = new ThreadCreation12();
		Thread t = new Thread();
        t.start();
        while(ThreadCreation12.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++ThreadCreation12.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");


	}

}