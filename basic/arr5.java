/*
  1  2  3 ==>0
  4  5  6 ==>1
  7  8  9 ==>2
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int r=0; r<matrix.length; r++){
            System.out.println("enter "+matrix[r].length+" element of "+(r+1)+" row");
            for(int c=0; c<matrix[r].length; c++){
              matrix[r][c] =  sc.nextInt();
            }
        }

        System.out.println("Given Matrix is...");
        for(int r=0; r<matrix.length; r++){
            for(int c=0; c<matrix[r].length; c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}