class First implements Runnable{
   public void run(){
    try{
      for(int i=1; i<=5; i++){
        System.out.println("Hello....");
        Thread.sleep(2000);
      }
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
   }
}
class TestMain{
    public static void main(String args[]) throws InterruptedException{
      Runnable obj1 = new First();
      //obj1.run();
      Thread t1 = new Thread(obj1);
      t1.start(); // run()-->obj1 ki run means First class ki run()
      for(int i=1; i<=5; i++){
        System.out.println("Main-Thread...");
        Thread.sleep(1300);
      }
    }
}