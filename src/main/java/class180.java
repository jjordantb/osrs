public class class180 {
   static int field2361;

   static final void method3731(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               class50.field503[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  class50.field506[0][var5][var4] = class50.field506[0][var5 - 1][var4];
               }

               if (var5 == var0 + var2 && var5 < 103) {
                  class50.field506[0][var5][var4] = class50.field506[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  class50.field506[0][var5][var4] = class50.field506[0][var5][var4 - 1];
               }

               if (var3 + var1 == var4 && var4 < 103) {
                  class50.field506[0][var5][var4] = class50.field506[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   public static void method3734() {
      class23.field235.method4216(5);
      class23.field232.method4216(5);
   }

   public static void method3732(int var0) {
      class219.field2529 = 1;
      class137.field1911 = null;
      class219.field2533 = -1;
      class164.field2073 = -1;
      class318.field3851 = 0;
      class219.field2534 = false;
      class0.field0 = var0;
   }

   public static boolean method3733() {
      try {
         if (class219.field2529 == 2) {
            if (class4.field39 == null) {
               class4.field39 = class225.method4626(class137.field1911, class219.field2533, class164.field2073);
               if (class4.field39 == null) {
                  return false;
               }
            }

            if (class82.field1218 == null) {
               class82.field1218 = new class100(class219.field2531, class219.field2530);
            }

            if (class193.field2461.method4398(class4.field39, class219.field2535, class82.field1218, 22050)) {
               class193.field2461.method4399();
               class193.field2461.method4426(class318.field3851);
               class193.field2461.method4401(class4.field39, class219.field2534);
               class219.field2529 = 0;
               class4.field39 = null;
               class82.field1218 = null;
               class137.field1911 = null;
               return true;
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
         class193.field2461.method4521();
         class219.field2529 = 0;
         class4.field39 = null;
         class82.field1218 = null;
         class137.field1911 = null;
      }

      return false;
   }
}
