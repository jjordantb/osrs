public class class187 {
   static final int[] field2431 = new int[2048];
   static final int[] field2432 = new int[2048];
   static int field2433;

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field2431[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field2432[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
      }

   }

   public static class255 method4011(int var0) {
      class255 var1 = (class255)class255.field3298.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class255.field3301.method4831(5, var0);
         var1 = new class255();
         if (var2 != null) {
            var1.method5004(new class184(var2));
         }

         class255.field3298.method4204(var1, (long)var0);
         return var1;
      }
   }
}
