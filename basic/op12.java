import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a first value");
        int x = sc.nextInt();
        
        System.out.println("Enter a second value");
        int y = sc.nextInt();

        System.out.println("Addition : "+(x+y));
    }
}