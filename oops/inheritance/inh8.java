/*
   access-modifier other-modifier return-type method(arg1,...argn) throws Ex1, Ex2{
   
   }
   ------------
   private---------> Weaker access priviledge [we canot override the private method]

   <default>
   protected
   public ---------> Higher access priviledge
 */
class A{
    public void m1(){
        System.out.println("A-m1()");
    }
}
class B extends A{
    public void m1(){
        System.out.println("B-m1()");
    }
}

class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}