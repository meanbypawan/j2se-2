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
class TestMain{
    public static void main(String args[]){
        First t1 = new First();
        Second t2 = new Second();
        t1.start(); // run()
        t2.start(); // run();
    }
}