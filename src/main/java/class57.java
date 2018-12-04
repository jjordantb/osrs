public class class57 extends class206 {
   static int field576;
   Object[] field575;
   boolean field563;
   class232 field570;
   int field565;
   int field566;
   int field567;
   class232 field568;
   int field569;
   int field562;
   String field571;
   int field572;
   int field573 = 76;

   public void method1114(Object[] var1) {
      this.field575 = var1;
   }

   public void method1116(int var1) {
      this.field573 = var1;
   }

   static void method1117(int var0, boolean var1, int var2, boolean var3) {
      if (class66.field1017 != null) {
         class278.method5495(0, class66.field1017.length - 1, var0, var1, var2, var3);
      }

   }

   static int method1125(int var0) {
      class59 var1 = (class59)class85.field1249.method4185((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field2502 == class85.field1247.field2518 ? -1 : ((class59)var1.field2502).field595;
      }
   }

   static void method1122(int var0, int var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var3 * 32 + 15 + 128;
         int var5 = var4 * 3 + 600;
         int var7 = class124.field1747[var4];
         int var9 = var1 - 334;
         if (var9 < 0) {
            var9 = 0;
         } else if (var9 > 100) {
            var9 = 100;
         }

         int var10 = (client.field898 - client.field897) * var9 / 100 + client.field897;
         int var8 = var10 * var5 / 256;
         var2[var3] = var7 * var8 >> 16;
      }

      class127.method3168(var2, 500, 800, var0 * 334 / var1, 334);
   }
}
