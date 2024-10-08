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
// main-thread, thread-schedular, gc
class TestMain{
   public static void main(String args[]){
       Thread mainThread = Thread.currentThread();
       mainThread.setPriority(Thread.MAX_PRIORITY);
       System.out.println("Main Thread Ki Priority : "+mainThread.getPriority());
       First t1 = new First();
       Second t2 = new Second();
       System.out.println("T1 ki priority : "+t1.getPriority());
       System.out.println("T2 ki priority : "+t2.getPriority());
       t1.start(); // run()
       t2.start();
       try{
         for(int i=1; i<=5; i++){
            System.out.println("Main - Thread...");
            Thread.sleep(500);
         }
       }
       catch(InterruptedException e){
        e.printStackTrace();
       }      
   }
}