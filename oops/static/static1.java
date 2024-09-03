/*
   static  :-
     Data member
     method
     class
     block
 */
class Test{
    private int a = 20;
    private static int b = 10;
    public void increment(){
        ++a;
        ++b;
    }
    public static void display(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj1 = new Test(); // obj1 : {a : 21, increment()}
        Test obj2 = new Test(); // obj2 : {a : 21, increment()}
        //                         Test : {b : 12}
        obj1.increment();
        obj2.increment();

        obj1.display();
        obj2.display();
     
    }
}