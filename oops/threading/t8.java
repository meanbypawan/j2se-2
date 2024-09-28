class TestMain{
    public static void main(String args[]){
        Runnable r1 = ()->{
            try{
              for(int i=1; i<=5; i++){
                System.out.println("First Thread.....");
                Thread.sleep(1400); 
              }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        };
        Runnable r2 = ()->{
            try{
              for(int i=1; i<=5; i++){
                System.out.println("Second Thread.....");
                Thread.sleep(2000);
              }
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}