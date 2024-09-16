class A{
    public void m1(){
        System.out.println("A-m1()");
    }
    static class B{
        static public void sayHello(){
            System.out.println("Hello Friends...");
        }
    }
}
class Child extends A.B{}
class TestMain{
    public static void main(String args[]){
       Child.sayHello();
    }
}
