/*
  Loop 
    while, do-while, for
    a. initailization
    b. condition [loop counter]
    c. inc/dec[loop counter must be change] [++,--,*,/]
 */
class TestMain{
    public static void main(String args[]){
        int i=1;
        // 1 3 4 5
        while(i <= 5){
            if( i == 2){
              i++;
              continue;
            }  
            System.out.println(i);
            i++;
        }
    }
}