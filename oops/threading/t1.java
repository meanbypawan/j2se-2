class First extends Thread{
  public void run(){
     for(int i=1; i<=5; i++){
        System.out.println("First Thread...");
     }
  }
}
class Second extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Second Thread....");
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