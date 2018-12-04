public class class65 extends class206 {
   int field1006;
   int field1004;
   int field1002;
   int field1003;

   class65(int var1, int var2, int var3, int var4) {
      this.field1006 = var1;
      this.field1004 = var2;
      this.field1002 = var3;
      this.field1003 = var4;
   }

   void method1681(int var1, int var2, int var3, int var4) {
      this.field1006 = var1;
      this.field1004 = var2;
      this.field1002 = var3;
      this.field1003 = var4;
   }

   static int method1683(int var0, int var1) {
      class274 var3 = (class274)class274.field3601.method4198((long)var0);
      class274 var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = class274.field3611.method4831(4, var0);
         var3 = new class274();
         if (var4 != null) {
            var3.method5452(new class184(var4), var0);
         }

         var3.method5432();
         class274.field3601.method4204(var3, (long)var0);
         var2 = var3;
      }

      if (var2 == null) {
         return var1;
      } else if (var2.field3606 >= 0) {
         return var2.field3606 | -16777216;
      } else if (var2.field3604 >= 0) {
         int var10 = class123.method2974(class124.field1752.vmethod3247(var2.field3604), 96);
         return class124.field1749[var10] | -16777216;
      } else if (var2.field3603 == 16711935) {
         return var1;
      } else {
         int var5 = var2.field3607;
         int var6 = var2.field3608;
         int var7 = var2.field3610;
         if (var7 > 179) {
            var6 /= 2;
         }

         if (var7 > 192) {
            var6 /= 2;
         }

         if (var7 > 217) {
            var6 /= 2;
         }

         if (var7 > 243) {
            var6 /= 2;
         }

         int var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
         int var9 = class123.method2974(var8, 96);
         return class124.field1749[var9] | -16777216;
      }
   }

   public static final void method1682(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         class97.field1377 = var0;
         class26.field264 = var1;
         class19.field189 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
