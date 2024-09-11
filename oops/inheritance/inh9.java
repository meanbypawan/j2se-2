/*
  Co-varient return type
 */
class A{
    public byte m1(){
        System.out.println("A-m1()");
        return 1;
    }
}
class B extends A{
    public int m1(){
         System.out.println("B-m1()");
         return 100;
    }
}