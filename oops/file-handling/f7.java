/*
  OutputStream
    FileOutputStream
  InputStream
    FileInputStream
  ObjectOutputStream
  ObjectInputStream
  ------------------------------
  Reader
   FileReader
  Write
   FileWriter     
 */
import java.io.FileWriter;

class TestMain{
    public static void main(String args[]){
       try(FileWriter fw = new FileWriter("data.txt",true);){
         String data = "Java is Blockbuster cinema..";
         fw.write(data);
         System.out.println("Operation success...");
       }
       catch(Exception e){
         e.printStackTrace();
       }
    }
}
