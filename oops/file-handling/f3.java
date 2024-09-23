import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class TestMain{
    public static void main(String args[]){
     try{   
      File f = new File("abc.txt");
      FileOutputStream fout = new FileOutputStream(f);
      String data = "Java is very simple";
      
      byte b[] = data.getBytes();
    
      fout.write(b);
      System.out.println("Operation success....");
     }
     catch(IOException e){
        e.printStackTrace();
     }
    }
}