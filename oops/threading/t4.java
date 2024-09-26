/* */
class First extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
              System.out.println("First Thread....");
              Thread.sleep(2000);
           }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Second extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
              System.out.println("Second Thread....");
              Thread.sleep(1400);
           }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class TestMain{
    public static void main(String args[]){
        First t1 = new First();
        Second t2 = new Second();

        t1.setPriority(1); // int value :- 1 to 10
        t2.setPriority(10);// MAX_PRIORITY, MIN_PRIORITY, NORM_PRIORITY
       
        t1.start();
        t2.start();
    }
}