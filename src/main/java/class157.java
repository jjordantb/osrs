import java.io.File;
import java.util.Iterator;

public class class157 {
   static File field2023;
   static int field2024;
   public static class111 field2038 = null;
   public static class111 field2028 = null;
   public static class111 field2029 = null;
   public static class111[] field2030;
   static int field2033;
   static client field2037;
   static class251 field2020;
   static int field2036;

   public static void method3462(class249 var0) {
      class256.field3303 = var0;
      class256.field3302 = class256.field3303.method4889(16);
   }

   static void method3460() {
      Iterator var0 = class85.field1249.iterator();

      while(var0.hasNext()) {
         class59 var1 = (class59)var0.next();
         var1.method1138();
      }

   }

   static boolean method3456(class61 var0) {
      if (client.field676 == 0) {
         return false;
      } else if (class69.field1063 == var0) {
         return class234.method4768();
      } else {
         return class66.method1727() || class12.method137() && var0.method1173() || class181.method3738() && var0.method1176();
      }
   }

   static final void method3463(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = class152.method3394(var0, var1, class60.field599) - var2;
         var0 -= field2036;
         var3 -= class184.field2409;
         var1 -= class50.field508;
         int var4 = class124.field1747[class57.field576];
         int var5 = class124.field1754[class57.field576];
         int var6 = class124.field1747[class15.field143];
         int var7 = class124.field1754[class15.field143];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var3 * var5 - var4 * var1 >> 16;
         var1 = var3 * var4 + var5 * var1 >> 16;
         if (var1 >= 50) {
            client.field652 = var0 * client.field907 / var1 + client.field644 / 2;
            client.field903 = client.field764 / 2 + var8 * client.field907 / var1;
         } else {
            client.field652 = -1;
            client.field903 = -1;
         }

      } else {
         client.field652 = -1;
         client.field903 = -1;
      }
   }
}
