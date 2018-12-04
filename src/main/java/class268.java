import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class class268 extends class208 {
   static class249 field3419;
   static class202 field3414 = new class202(64);
   public char field3425;
   public char field3417;
   public String field3421 = "null";
   public int field3415;
   public int field3420 = 0;
   public int[] field3416;
   public int[] field3422;
   public String[] field3423;

   void method5223(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5224(var1, var2);
      }
   }

   void method5224(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3425 = (char)var1.method3983();
      } else if (var2 == 2) {
         this.field3417 = (char)var1.method3983();
      } else if (var2 == 3) {
         this.field3421 = var1.method3778();
      } else if (var2 == 4) {
         this.field3415 = var1.method3892();
      } else {
         int var3;
         if (var2 == 5) {
            this.field3420 = var1.method3771();
            this.field3416 = new int[this.field3420];
            this.field3423 = new String[this.field3420];

            for(var3 = 0; var3 < this.field3420; ++var3) {
               this.field3416[var3] = var1.method3892();
               this.field3423[var3] = var1.method3778();
            }
         } else if (var2 == 6) {
            this.field3420 = var1.method3771();
            this.field3416 = new int[this.field3420];
            this.field3422 = new int[this.field3420];

            for(var3 = 0; var3 < this.field3420; ++var3) {
               this.field3416[var3] = var1.method3892();
               this.field3422[var3] = var1.method3892();
            }
         }
      }

   }

   public int method5225() {
      return this.field3420;
   }

   static long method5222() {
      try {
         URL var0 = new URL(class56.method1109("services", false) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(5000);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         class184 var4 = new class184(new byte[1000]);

         do {
            int var5 = var3.read(var4.field2404, var4.field2405, 1000 - var4.field2405);
            if (var5 == -1) {
               var4.field2405 = 0;
               long var7 = var4.method3775();
               return var7;
            }

            var4.field2405 += var5;
         } while(var4.field2405 < 1000);

         return 0L;
      } catch (Exception var9) {
         return 0L;
      }
   }

   static void method5228() {
      if (class69.field1063.field953 >> 7 == client.field722 && class69.field1063.field999 >> 7 == client.field875) {
         client.field722 = 0;
      }

   }
}
