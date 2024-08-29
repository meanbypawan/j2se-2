class TestMain{
    public static void main(String args[]){
        int matrix[][] = {
            {10,20,30}, // 0
            {40,50,60,90,98}, // 1
            {70,80,90,1,2,3,4,5,6,78,8}  // 2
        };

        for(int row[] : matrix){
          for(int element : row){
            System.out.print(element+" ");
          }
          System.out.println();
        }
    }
   

}