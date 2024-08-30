// var-arg :- variable length argument
// zero or any number of argument
// Behing the seen var-arg is 1-d array
class Test{
    public void m1(int... x){
      System.out.println("m1-executed....");
      for(int element : x)
        System.out.println(element);
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(10,20,30,40,50,60,70);
    }
}