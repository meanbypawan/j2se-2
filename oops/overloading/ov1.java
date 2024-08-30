class Arithmetic{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class TestMain{
    public static void main(String args[]){
        Arithmetic obj = new Arithmetic();
        obj.add(20,10,5);
        obj.add(5,4);
    }
}