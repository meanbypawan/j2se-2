/*
  task
   |----m1() --I + sync
                       
   |----m2() --I + sync
   |----m3() --S + sync
   |----m4() --S + sync

   T1,T2,T3,T4
   Task task = new Task()

   T1---->task----->m1() -----> seperate lock for (m1,m2)
   T2---->task----->m2()
   T3---->task----->m3() -----> seperate lock for(m3,m4)
   T4---->task----->m4()
 */