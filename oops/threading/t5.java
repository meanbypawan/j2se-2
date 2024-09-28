/*
  join()
  join(long milisecond)
  join(long milisecond, long nenosecond)
 */
class First extends Thread{
  public void run(){
     for(int i=1; i<=5; i++){
       try{ 
        System.out.println("First Thread...");
        Thread.sleep(2000);
       }
       catch(InterruptedException e){
        e.printStackTrace();
       } 
     }
  }
}
class Second extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
         try{ 
           System.out.println("Second Thread...");
           Thread.sleep(1400);
         }
         catch(InterruptedException e){
           e.printStackTrace();
         } 
        }
    }
}
class Third extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
         try{ 
           System.out.println("Third Thread...");
           Thread.sleep(1400);
         }
         catch(InterruptedException e){
           e.printStackTrace();
         } 
        }
    }
}
// main-thread, thread-schedular, gc
class TestMain{
   public static void main(String args[]) throws Exception{
       Thread mainThread = Thread.currentThread();
       First t1 = new First();
       Second t2 = new Second();
       Third t3 = new Third();
       t1.start(); // run()
       t1.join(5000); // main-stopped
       t2.start();
       t3.start();
         
   }
}