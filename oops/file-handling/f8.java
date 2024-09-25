/*
  ObjectInputStream
  ObjectOutStream 
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class TestMain{
    public static void main(String args[]){
       try{
          FileReader fin = new FileReader("data.txt");
          String data = "";
          while(true){
            int x = fin.read(); // 'v'
            if(x == -1)
              break;
            data = data + (char)x;  // data = "Jav"
          }
          System.out.println(data);
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }
}