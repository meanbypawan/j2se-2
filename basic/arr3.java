class TestMain{
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int luckyCoupenNumber[] = {234, 567, 129, 786, 143, 908, 3332};
        System.out.println("please let me know your coupen number");
        int cn = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<luckyCoupenNumber.length; i++){
         if(cn == luckyCoupenNumber[i]){
           flag = true;
           break;
         }
        } 
        if(flag)
         System.out.println("you are eligible for bumber gift...");
        else
         System.out.println("Better luck next time"); 
    }
}