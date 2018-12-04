public class class24 {
   static final class24 field251 = new class24(0);
   static final class24 field245 = new class24(1);
   final int field247;

   class24(int var1) {
      this.field247 = var1;
   }

   public static class261 method474(int var0) {
      class261 var1 = (class261)class261.field3359.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class261.field3365.method4831(1, var0);
         var1 = new class261();
         if (var2 != null) {
            var1.method5126(new class184(var2), var0);
         }

         var1.method5111();
         class261.field3359.method4204(var1, (long)var0);
         return var1;
      }
   }

   static class132 method475(int var0) {
      class132 var1 = (class132)class275.field3619.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         class249 var3 = class275.field3616;
         class249 var4 = class275.field3617;
         boolean var5 = true;
         int[] var6 = var3.method4839(var0);

         for(int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var3.method4836(var0, var6[var7]);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
               byte[] var10 = var4.method4836(var9, 0);
               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         class132 var2;
         if (!var5) {
            var2 = null;
         } else {
            try {
               var2 = new class132(var3, var4, var0, false);
            } catch (Exception var12) {
               var2 = null;
            }
         }

         if (var2 != null) {
            class275.field3619.method4204(var2, (long)var0);
         }

         return var2;
      }
   }

   public static boolean method473(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= ' ' && var0 <= 'ÿ') {
         return true;
      } else {
         return var0 == '€' || var0 == 'Œ' || var0 == '—' || var0 == 'œ' || var0 == 'Ÿ';
      }
   }

   static void method472(int var0) {
      client.field718 = var0;
   }
}
