class TestMain{
    public static void main(String args[]){
        /*
        String x[] = new String[0];
        x[0] = "A";
        
        obj
         obj.getClass().getName()
        */
       int x[] = new int[10];
       byte b[] = new byte[10];
       short s[] = new short[10];
       long l[] = new long[10];
       char c[] = new char[10];
       float f[] = new float[10];
       double d[] = new double[10];
       boolean z[] = new boolean[10];

       System.out.println(x.getClass().getName());
       System.out.println(b.getClass().getName());
       System.out.println(s.getClass().getName());
       System.out.println(l.getClass().getName());
       System.out.println(c.getClass().getName());
       System.out.println(f.getClass().getName());
       System.out.println(d.getClass().getName());
       System.out.println(z.getClass().getName());
    }
}