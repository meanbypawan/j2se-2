/*
   Producer - Consumer Problem
   Interthread - communication
*/
class Task{
    synchronized public void producingData(){
        try{
          System.out.println(Thread.currentThread().getName()+" got a lock and executing...");  
          for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " is producing Data..");
            Thread.sleep(2000);
          }
          System.out.println("Data produced...");
          //notify();
          notifyAll();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    synchronized public void consumingData(){
        try{
          System.out.println(Thread.currentThread().getName() + " got lock & executing...");
          System.out.println(Thread.currentThread().getName()+" release d lock and waiting...");  
          wait();
          for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " is consuming data...");
            Thread.sleep(2000);
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Producer extends Thread{
  Task task;
  public Producer(Task task){
    this.task = task;
  }
  public void run(){
    task.producingData();
  }
}
class Consumer extends Thread{
  Task task;
  public Consumer(Task task){
    this.task = task;
  }  
  public void run(){
    task.consumingData();
  }
}
class TestMain{
    public static void main(String args[]) throws Exception{
       Task task = new Task();
       Producer p = new Producer(task);
       Consumer c1 = new Consumer(task);
       Consumer c2 = new Consumer(task);
       Consumer c3 = new Consumer(task);
       p.setName("Producer ");
       c1.setName("Consmer - 1");
       c2.setName("Consmer - 2");
       c3.setName("Consmer - 3");
       c1.start();
       c1.join(2000);
       c2.start();
       c2.join(2000);
       c3.start();
       c3.join(2000);
       p.start();      
    }
}