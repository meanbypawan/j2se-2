class A{
    public void m1(){
        System.out.println("A-m1()");
    }
    class B{
        static public void sayHello(){
            System.out.println("Hello Friends...");
        }
    }
}
class Child extends A.B{
    public Child(){
        new A().super();
    }
}
class TestMain{
    public static void main(String args[]){
       Child.sayHello();
    } 
}
