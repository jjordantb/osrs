public class class25 {
   static final class25 field258 = new class25(0);
   static final class25 field252 = new class25(1);
   public static int field256;
   static int[] field253;
   final int field254;

   class25(int var1) {
      this.field254 = var1;
   }

   public static class266 method479(int var0) {
      class266 var1 = (class266)class266.field3406.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class6.field49.method4831(11, var0);
         var1 = new class266();
         if (var2 != null) {
            var1.method5176(new class184(var2));
         }

         var1.method5186();
         class266.field3406.method4204(var1, (long)var0);
         return var1;
      }
   }

   public static String method477(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var3 = var0[var1];
         return var3 == null ? "null" : var3.toString();
      } else {
         int var8 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var8; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var8; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static void method478(int var0, class249 var1, int var2, int var3, int var4, boolean var5) {
      class219.field2529 = 1;
      class137.field1911 = var1;
      class219.field2533 = var2;
      class164.field2073 = var3;
      class318.field3851 = var4;
      class219.field2534 = var5;
      class0.field0 = var0;
   }

   static void method480(int var0) {
      if (var0 != -1) {
         if (class189.method4028(var0)) {
            class232[] var1 = class145.field1951[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               class232 var3 = var1[var2];
               if (var3.field2754 != null) {
                  class57 var4 = new class57();
                  var4.field570 = var3;
                  var4.field575 = var3.field2754;
                  client.method1655(var4, 5000000);
               }
            }

         }
      }
   }

   static final void method476() {
      for(class63 var0 = (class63)client.field688.method4298(); var0 != null; var0 = (class63)client.field688.method4283()) {
         if (var0.field933 > 0) {
            --var0.field933;
         }

         if (var0.field933 == 0) {
            if (var0.field923 < 0 || class114.method2769(var0.field923, var0.field924)) {
               class69.method1831(var0.field934, var0.field926, var0.field922, var0.field925, var0.field923, var0.field935, var0.field924);
               var0.method4271();
            }
         } else {
            if (var0.field932 > 0) {
               --var0.field932;
            }

            if (var0.field932 == 0 && var0.field922 >= 1 && var0.field925 >= 1 && var0.field922 <= 102 && var0.field925 <= 102 && (var0.field929 < 0 || class114.method2769(var0.field929, var0.field931))) {
               class69.method1831(var0.field934, var0.field926, var0.field922, var0.field925, var0.field929, var0.field930, var0.field931);
               var0.field932 = -1;
               if (var0.field923 == var0.field929 && var0.field923 == -1) {
                  var0.method4271();
               } else if (var0.field929 == var0.field923 && var0.field930 == var0.field935 && var0.field931 == var0.field924) {
                  var0.method4271();
               }
            }
         }
      }

   }
}
