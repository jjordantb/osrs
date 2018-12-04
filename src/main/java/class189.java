public class class189 {
   static class245 field2441;

   public static boolean method4028(int var0) {
      if (class148.field1970[var0]) {
         return true;
      } else if (!class232.field2757.method4832(var0)) {
         return false;
      } else {
         int var1 = class232.field2757.method4889(var0);
         if (var1 == 0) {
            class148.field1970[var0] = true;
            return true;
         } else {
            if (class145.field1951[var0] == null) {
               class145.field1951[var0] = new class232[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (class145.field1951[var0][var2] == null) {
                  byte[] var3 = class232.field2757.method4831(var0, var2);
                  if (var3 != null) {
                     class145.field1951[var0][var2] = new class232();
                     class145.field1951[var0][var2].field2770 = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        class145.field1951[var0][var2].method4701(new class184(var3));
                     } else {
                        class145.field1951[var0][var2].method4702(new class184(var3));
                     }
                  }
               }
            }

            class148.field1970[var0] = true;
            return true;
         }
      }
   }

   static final int method4037(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class177.method3702(var3, var5);
      int var8 = class177.method3702(var3 + 1, var5);
      int var9 = class177.method3702(var3, var5 + 1);
      int var10 = class177.method3702(var3 + 1, var5 + 1);
      int var12 = 65536 - class124.field1754[var4 * 1024 / var2] >> 1;
      int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16);
      int var14 = 65536 - class124.field1754[var4 * 1024 / var2] >> 1;
      int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
      int var16 = 65536 - class124.field1754[var6 * 1024 / var2] >> 1;
      int var15 = ((65536 - var16) * var11 >> 16) + (var13 * var16 >> 16);
      return var15;
   }
}
