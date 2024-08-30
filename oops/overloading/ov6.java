// var-arg :- variable length argument
// zero or any number of argument
// Behing the seen var-arg is 1-d array
class Test{
    public void add(int... x){
      int sum = 0;
      for(int element : x)
        sum = sum + element;
      System.out.println("Addition : "+sum);  
    }
}
class TestMain{
    public static void main(String args[]){
        Test obj = new Test();
        obj.add(10,20);
        obj.add(1,2,3);
        obj.add(1,2,3,4);
    }
}