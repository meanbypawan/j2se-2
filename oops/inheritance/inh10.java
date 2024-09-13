/*
a. Concrete Implementation
   --> concrete class
    
b. Partial Implementation
   --> Abstract class

c. Fully Abstract
   -->Interface
--------------------------------------
3-Character :-
  a. Team|Developer
  b. Programmer
  c. User
1. Abstract is only serve as Parent|Base|Super class
2. We can not instantiate abstract class or can create object 
*/
abstract class A{
    public void m1(){
        System.out.println("A-m1() called...");
    }
    abstract public void m2();
}
class AChild extends A{
   public void m2(){
    System.out.println("m2()-called...");
   }
}
class TestMain{
    public static void main(String args[]){
      A obj = new AChild();
      obj.m1();
      obj.m2();
    }
}