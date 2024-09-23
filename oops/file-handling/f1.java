import java.io.File;
class TestMain{
    public static void main(String args[]){
      File f = new File("introduction1.txt");
      if(f.exists()){
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getAbsolutePath());
        System.out.println("isHidden : "+f.isHidden());
        System.out.println("canWrite : "+f.canWrite());
        System.out.println("canRead : "+f.canRead());
        System.out.println("canExecute : "+f.canExecute());
        System.out.println("size : "+f.length());
        System.out.println("isFile : "+f.isFile());
        System.out.println("isDirectory : "+f.isDirectory());
        System.out.println("lastModified : "+f.lastModified());
      }
      else
       System.out.println("File not existing.....");
    }
}