/*
  JApp.java
  ---------------------
  class A{}
  class B{
     private static int b = 20;
     public void m1(){
       System.out.println("m1-executed...");
     }
  }
  class C{
    public static void main(String args[]){
       System.out.println("Hello...");
       B obj = new B();
       B obj2 = new B();
       obj.m1();
    }
  }
 ------------------
 JApp.java------->Compiler------> ByteCode/.class
                                  [A.class, B.class, C.class]
 ------->JRE/JVM--->java C-----                                  
 */
class A{
    static{
        System.out.println("Block-A");
    }
}
  class B{
     static{
        System.out.println("Block B");
     }
     private static int b = 20;
     public void m1(){
       System.out.println("m1-executed...");
     }
  }
  class C{
    static{
        System.out.println("Block C");
    }
    public static void main(String args[]){
      B obj = new B();
      B obj2 = new B();
    }
  }















