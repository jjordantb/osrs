public class class248 extends class208 {
   static int field3222;
   class251 field3219;
   int field3220;
   byte field3221;

   public static class273 method4823(int var0) {
      class273 var1 = (class273)class273.field3566.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class273.field3597.method4831(9, var0);
         var1 = new class273();
         var1.field3568 = var0;
         if (var2 != null) {
            var1.method5417(new class184(var2));
         }

         var1.method5392();
         class273.field3566.method4204(var1, (long)var0);
         return var1;
      }
   }

   static class323 method4824() {
      class323 var0 = new class323();
      var0.field3883 = class324.field3891;
      var0.field3884 = class324.field3896;
      var0.field3881 = class324.field3890[0];
      var0.field3882 = class324.field3892[0];
      var0.field3879 = class324.field3895[0];
      var0.field3887 = class258.field3334[0];
      int var1 = var0.field3887 * var0.field3879;
      byte[] var2 = class324.field3897[0];
      var0.field3889 = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.field3889[var3] = class324.field3894[var2[var3] & 255];
      }

      class324.field3890 = null;
      class324.field3892 = null;
      class324.field3895 = null;
      class258.field3334 = null;
      class324.field3894 = null;
      class324.field3897 = null;
      return var0;
   }
}
