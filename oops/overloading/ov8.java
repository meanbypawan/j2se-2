class Test{
    public void m1(int... a, int... b){
      System.out.println("a : "+a+" b ; "+b);
      
      for(int element : c)
        System.out.println(element);
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.m1(1,2,3,4,5,6,7,8,9,10);
    }
}