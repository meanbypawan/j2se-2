class TestMain{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
          System.out.println("Vowel...");
        else
         System.out.println("Not vowel...");   
    }
}