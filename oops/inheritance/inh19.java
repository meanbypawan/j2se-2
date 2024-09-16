/*
 A.class
 TestMain.class
 A$B.class
 */
class A{
    static class B{
      public void m1(){
        System.out.println("B-m1() executed...");
      }
    }
}
class AA{
    class BB{
        public void sayHello(){
            System.out.println("Hello Friends...");
        }
    }
}
class TestMain {
    public static void main(String args[]){
       A.B obj =  new A.B();
       obj.m1();

       /* 
       AA obj2 = new AA();
       AA.BB obj3 = obj2.new BB();
       obj3.sayHello();
       */
      new AA().new BB().sayHello();
    } 
}
