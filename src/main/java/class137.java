import java.awt.FontMetrics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class class137 implements Runnable {
   public static class249 field1911;
   static FontMetrics field1917;
   static class251 field1914;
   static class323[] field1913;
   final Thread field1915 = new Thread(this);
   volatile boolean field1909;
   Queue field1908 = new LinkedList();

   public class137() {
      this.field1915.setPriority(1);
      this.field1915.start();
   }

   public class138 method3278(URL var1) {
      class138 var2 = new class138(var1);
      synchronized(this) {
         this.field1908.add(var2);
         this.notify();
         return var2;
      }
   }

   public void method3274() {
      this.field1909 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1915.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public void run() {
      while(!this.field1909) {
         try {
            class138 var1;
            synchronized(this) {
               var1 = (class138)this.field1908.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var13) {
                     ;
                  }
                  continue;
               }
            }

            DataInputStream var2 = null;
            URLConnection var3 = null;

            try {
               var3 = var1.field1920.openConnection();
               var3.setConnectTimeout(5000);
               var3.setReadTimeout(5000);
               var3.setUseCaches(false);
               var3.setRequestProperty("Connection", "close");
               int var7 = var3.getContentLength();
               if (var7 >= 0) {
                  byte[] var5 = new byte[var7];
                  var2 = new DataInputStream(var3.getInputStream());
                  var2.readFully(var5);
                  var1.field1921 = var5;
               }

               var1.field1922 = true;
            } catch (IOException var14) {
               var1.field1922 = true;
            } finally {
               if (var2 != null) {
                  var2.close();
               }

               if (var3 != null && var3 instanceof HttpURLConnection) {
                  ((HttpURLConnection)var3).disconnect();
               }

            }
         } catch (Exception var17) {
            class80.method2041((String)null, var17);
         }
      }

   }

   public static boolean method3280(class249 var0, class249 var1, class249 var2, class220 var3) {
      class219.field2535 = var0;
      class219.field2530 = var1;
      class219.field2531 = var2;
      class193.field2461 = var3;
      return true;
   }
}
