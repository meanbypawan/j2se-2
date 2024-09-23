import java.io.File;
class TestMain{
    public static void main(String args[]){
        File f = new File("/home/administrator/Documents/j2se-2/oops");
        File item[] =  f.listFiles();
        for(File file : item){
           if(file.isDirectory()) 
            System.out.println(file.getName());
        }
    }
}