import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        
        System.out.println("Enter a first value");
        int x = new Scanner(System.in).nextInt();
        
        System.out.println("Enter a second value");
        int y = new Scanner(System.in).nextInt();

        System.out.println("Addition : "+(x+y));
    }
}