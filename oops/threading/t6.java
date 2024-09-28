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
class TestMain{
   public static void main(String args[]) throws Exception{
      First t1 = new First();
      System.out.println("After Create : "+t1.getState());
      System.out.println("isAlive : "+t1.isAlive());
      t1.start();
      System.out.println("After Start : "+t1.getState());
      System.out.println("isAlive : "+t1.isAlive());
      t1.join(); 
      System.out.println("After Completion : "+t1.getState());
      System.out.println("isAlive : "+t1.isAlive());
   }
}