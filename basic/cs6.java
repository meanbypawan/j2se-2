import java.util.Scanner;
class TestMain{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter letter");
    char ch = sc.next().charAt(0);
    switch(ch){ // ch : switch expression :- char
        case 'a':
        case 'A':    
        case 'e' :
        case 'i' :
        case 'o' :
        case 'u' : System.out.println("Vowel");break;
        default: System.out.println("Not vowel..");
    }
   }
}