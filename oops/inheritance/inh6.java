/*
  Method Overriding :-
 */
class A{
  public void wish(){
    System.out.println("GM.....");
  }
}
class B{
  public void wish(){
    System.out.println("GN....");
  }
}
class TestMain{
    public static void main(String args[]){
       B obj = new B();
       obj.wish();
    }
}