// Calculate the square of number
/*
  square
   property : n
   behaviour: getSquare() : int
 */
class Square{
    private int n;
    public void setN(int n){
        this.n = n;
    }
    public int getSquare(){
        return n*n;
    }
}
class TestMain{
    public static void main(String args[]){
        Square s1 = new Square();
        Square s2 = new Square();

        s1.setN(2);
        s2.setN(3);
        System.out.println(s1.getSquare());
    }
}