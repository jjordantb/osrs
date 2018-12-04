import java.util.Iterator;

public class class250 implements Runnable {
   static class207 field3242 = new class207();
   static class207 field3244 = new class207();
   public static int field3243 = 0;
   public static Object field3241 = new Object();
   static Thread field3245;
   static boolean field3246;
   static int[][] field3247;

   public void run() {
      try {
         while(true) {
            class207 var2 = field3242;
            class247 var1;
            synchronized(field3242) {
               var1 = (class247)field3242.method4298();
            }

            Object var14;
            if (var1 != null) {
               if (var1.field3213 == 0) {
                  var1.field3215.method3587((int)var1.field2496, var1.field3212, var1.field3212.length);
                  var2 = field3242;
                  synchronized(field3242) {
                     var1.method4271();
                  }
               } else if (var1.field3213 == 1) {
                  var1.field3212 = var1.field3215.method3592((int)var1.field2496);
                  var2 = field3242;
                  synchronized(field3242) {
                     field3244.method4276(var1);
                  }
               }

               var14 = field3241;
               synchronized(field3241) {
                  if (field3243 <= 1) {
                     field3243 = 0;
                     field3241.notifyAll();
                     return;
                  }

                  field3243 = 600;
               }
            } else {
               class272.method5390(100L);
               var14 = field3241;
               synchronized(field3241) {
                  if (field3243 <= 1) {
                     field3243 = 0;
                     field3241.notifyAll();
                     return;
                  }

                  --field3243;
               }
            }
         }
      } catch (Exception var13) {
         class80.method2041((String)null, var13);
      }
   }

   public static class260 method4918(int var0) {
      class260 var1 = (class260)class260.field3344.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class260.field3347.method4831(13, var0);
         var1 = new class260();
         var1.field3357 = var0;
         if (var2 != null) {
            var1.method5089(new class184(var2));
         }

         class260.field3344.method4204(var1, (long)var0);
         return var1;
      }
   }

   static final void method4920() {
      for(int var0 = 0; var0 < class83.field1226; ++var0) {
         class61 var1 = client.field698[class83.field1222[var0]];
         var1.method1174();
      }

      Iterator var2 = class85.field1249.iterator();

      while(var2.hasNext()) {
         class59 var3 = (class59)var2.next();
         var3.method1143();
      }

      if (class3.field26 != null) {
         class3.field26.method5737();
      }

   }
}
