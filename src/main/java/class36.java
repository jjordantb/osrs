public class class36 {
   static class84 field348;
   static class58 field347;
   static class322[] field350;
   public int field343;
   public class228 field344;
   public class228 field345;

   public class36(int var1, class228 var2, class228 var3) {
      this.field343 = var1;
      this.field344 = var2;
      this.field345 = var3;
   }

   static void method693(int var0, int var1, int var2) {
      if (client.field888 != 0 && var1 != 0 && client.field905 < 50) {
         client.field884[client.field905] = var0;
         client.field885[client.field905] = var1;
         client.field793[client.field905] = var2;
         client.field710[client.field905] = null;
         client.field887[client.field905] = 0;
         ++client.field905;
      }

   }

   static void method691(int var0, String var1) {
      int var2 = class83.field1226;
      int[] var3 = class83.field1222;
      boolean var4 = false;
      class293 var5 = new class293(var1, client.field920);

      for(int var6 = 0; var6 < var2; ++var6) {
         class61 var7 = client.field698[var3[var6]];
         if (var7 != null && var7 != class69.field1063 && var7.field625 != null && var7.field625.equals(var5)) {
            class174 var8;
            if (var0 == 1) {
               var8 = class131.method3243(class171.field2308, client.field690.field1282);
               var8.field2332.method3754(var3[var6]);
               var8.field2332.method3796(0);
               client.field690.method2193(var8);
            } else if (var0 == 4) {
               var8 = class131.method3243(class171.field2236, client.field690.field1282);
               var8.field2332.method3806(var3[var6]);
               var8.field2332.method3796(0);
               client.field690.method2193(var8);
            } else if (var0 == 6) {
               var8 = class131.method3243(class171.field2300, client.field690.field1282);
               var8.field2332.method3887(var3[var6]);
               var8.field2332.method3797(0);
               client.field690.method2193(var8);
            } else if (var0 == 7) {
               var8 = class131.method3243(class171.field2282, client.field690.field1282);
               var8.field2332.method3797(0);
               var8.field2332.method3869(var3[var6]);
               client.field690.method2193(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         class59.method1163(4, "", "Unable to find " + var1);
      }

   }

   static String method692(String var0, class232 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               var0 = var0.substring(0, var3) + class184.method3994(class74.method1984(var1, var2 - 1)) + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
