import java.io.*;

class TestMain{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter some text");
        String s = br.readLine();
        System.out.println(s);
    }
}