/*
  Constructor :-
   It is special member of the class because of the following reasons
   a. Name of the constructor is same as the name of the class
   b. Constructor called automatically when object is created
   c. constructor can not be static
   d. there is no return type of the constructor
   e. consturcotr is used to initialize the object at the time
      of object creation.

  Type of constructor
  a. default constructor | no parameter
  b. parameterized constructor    

 */

class A{
  public A(int a, int b){
    System.out.println("2-parameter....");
  }
  public A(String s){
    System.out.println("string parameter...");
  }
  public A(){
    System.out.println("Default constructor called...");
  }
}

class TestMain{
    public static void main(String args[]){
      A obj = new A(20,10);
      A obj2 = new A("hello");      
      A obj3 = new A(); 
    }
}