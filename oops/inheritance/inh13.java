/*
  final
   a. contant [value can't change]
   b. method [Block overriding]
   c. class  [Block inheritance]
 */
class A{
   public void m1(){}
}
class B extends A{
  public void m1(){}
}
class TestMain {
   public static void main(String args[]){
     final int MAX;
     MAX = 404; // Requested resource is not available
     MAX = 500; // Internal Server error
     System.out.println(MAX);
   } 
}
