public class class279 {
   public static class323[] method5496(class249 var0, String var1, String var2) {
      int var3 = var0.method4825(var1);
      int var4 = var0.method4847(var3, var2);
      byte[] var7 = var0.method4831(var3, var4);
      boolean var6;
      if (var7 == null) {
         var6 = false;
      } else {
         class125.method3051(var7);
         var6 = true;
      }

      class323[] var5;
      if (!var6) {
         var5 = null;
      } else {
         class323[] var8 = new class323[class324.field3893];

         for(int var9 = 0; var9 < class324.field3893; ++var9) {
            class323 var10 = var8[var9] = new class323();
            var10.field3883 = class324.field3891;
            var10.field3884 = class324.field3896;
            var10.field3881 = class324.field3890[var9];
            var10.field3882 = class324.field3892[var9];
            var10.field3879 = class324.field3895[var9];
            var10.field3887 = class258.field3334[var9];
            int var11 = var10.field3879 * var10.field3887;
            byte[] var12 = class324.field3897[var9];
            var10.field3889 = new int[var11];

            for(int var13 = 0; var13 < var11; ++var13) {
               var10.field3889[var13] = class324.field3894[var12[var13] & 255];
            }
         }

         class324.field3890 = null;
         class324.field3892 = null;
         class324.field3895 = null;
         class258.field3334 = null;
         class324.field3894 = null;
         class324.field3897 = null;
         var5 = var8;
      }

      return var5;
   }
}
