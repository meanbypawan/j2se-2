class Task{
   synchronized public void m1(){
      try{
         for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" in m1()");
            Thread.sleep(2000);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
   synchronized public void m2(){
      try{
         for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" in m2()");
            Thread.sleep(2000);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
class First extends Thread{
   Task task;
   public First(Task task){
      this.task = task;
   }
   public void run(){
     task.m1();
   }
}
class Second extends Thread{
   Task task;
   public Second(Task task){
      this.task = task;
   }
   public void run(){
     task.m2();
   }
}
class TestMain{
   public static void main(String args[]){
      Task task = new Task();
      First t1 = new First(task); // task.m1()
      Second t2 = new Second(task);// task.m2()

      t1.setName("Thread - T1 : ");
      t2.setName("Thread - T2 : ");
   
      t1.start();
      t2.start();
   }
}


