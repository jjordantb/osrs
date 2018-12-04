import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public final class class114 {
   static int field1513;
   int field1515;
   int field1516;
   int field1514;
   class129 field1512;
   class129 field1520;
   class129 field1517;
   long field1518;
   int field1519;

   static final int method2768(long var0, String var2) {
      Random var3 = new Random();
      class184 var4 = new class184(128);
      class184 var5 = new class184(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      var4.method3805(10);

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         var4.method3921(var3.nextInt());
      }

      var4.method3921(var6[0]);
      var4.method3921(var6[1]);
      var4.method3758(var0);
      var4.method3758(0L);

      for(var7 = 0; var7 < 4; ++var7) {
         var4.method3921(var3.nextInt());
      }

      var4.method3861(class74.field1104, class74.field1109);
      var5.method3805(10);

      for(var7 = 0; var7 < 3; ++var7) {
         var5.method3921(var3.nextInt());
      }

      var5.method3758(var3.nextLong());
      var5.method3757(var3.nextLong());
      class256.method5023(var5);
      var5.method3758(var3.nextLong());
      var5.method3861(class74.field1104, class74.field1109);
      var7 = class97.method2404(var2);
      if (var7 % 8 != 0) {
         var7 += 8 - var7 % 8;
      }

      class184 var8 = new class184(var7);
      var8.method3889(var2);
      var8.field2405 = var7;
      var8.method3788(var6);
      class184 var9 = new class184(var5.field2405 + var4.field2405 + var8.field2405 + 5);
      var9.method3805(2);
      var9.method3805(var4.field2405);
      var9.method3763(var4.field2404, 0, var4.field2405);
      var9.method3805(var5.field2405);
      var9.method3763(var5.field2404, 0, var5.field2405);
      var9.method3754(var8.field2405);
      var9.method3763(var8.field2404, 0, var8.field2405);
      byte[] var11 = var9.field2404;
      String var10 = class88.method2173(var11, 0, var11.length);
      String var12 = var10;

      try {
         URL var13 = new URL(class56.method1109("services", false) + "m=accountappeal/login.ws");
         URLConnection var14 = var13.openConnection();
         var14.setDoInput(true);
         var14.setDoOutput(true);
         var14.setConnectTimeout(5000);
         OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
         var15.write("data2=" + class74.method1996(var12) + "&dest=" + class74.method1996("passwordchoice.ws"));
         var15.flush();
         InputStream var16 = var14.getInputStream();
         var9 = new class184(new byte[1000]);

         do {
            int var17 = var16.read(var9.field2404, var9.field2405, 1000 - var9.field2405);
            if (var17 == -1) {
               var15.close();
               var16.close();
               String var18 = new String(var9.field2404);
               if (var18.startsWith("OFFLINE")) {
                  return 4;
               } else if (var18.startsWith("WRONG")) {
                  return 7;
               } else if (var18.startsWith("RELOAD")) {
                  return 3;
               } else if (var18.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.method3918(var6);

                  while(var9.field2405 > 0 && var9.field2404[var9.field2405 - 1] == 0) {
                     --var9.field2405;
                  }

                  var18 = new String(var9.field2404, 0, var9.field2405);
                  if (class61.method1218(var18)) {
                     class138.method3291(var18, true, false);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.field2405 += var17;
         } while(var9.field2405 < 1000);

         return 5;
      } catch (Throwable var19) {
         var19.printStackTrace();
         return 5;
      }
   }

   static final boolean method2769(int var0, int var1) {
      class270 var2 = class253.method4993(var0);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method5301(var1);
   }
}
