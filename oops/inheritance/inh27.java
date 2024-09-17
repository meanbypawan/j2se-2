interface I{
    int x = 100; // public static final
    int operation(int x, int y);
}
class TestMain {
    public static void main(String args[]){
        I obj1 = (a, b)-> a + b;
        I obj2 = (a,b)->a * b;
        I obj3 = (a,b)->{
          return a > b ? a : b;
        };

        int result = obj3.operation(20,10);
        System.out.println(result);
        System.out.println(I.x);
    }
}
