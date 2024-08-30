/*
  In case of overloading compiler first go for perfact matching
  if perfact matching is not found then compiler go for
  suitable matching if sutable is not found alos then
  compiler generate an error.
 */
class Test{
  /*   
  public void m1(int x){
    System.out.println("Integer version...");
  }
  */
  public void m1(float x){
    System.out.println("Float version....");
  }
}
class TestMain{
    public static void main(String args[]){
      Test obj = new Test();
      obj.m1(100);// HMP : 1, type : int 
    }
}