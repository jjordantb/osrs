public class class29 {
   public static final class29 field291 = new class29("details");
   public static final class29 field288 = new class29("compositemap");
   public static final class29 field289 = new class29("compositetexture");
   public static final class29 field290 = new class29("area");
   public static final class29 field292 = new class29("labels");
   static int[] field295;
   public final String field298;

   class29(String var1) {
      this.field298 = var1;
   }

   static boolean method533(long var0) {
      int var2 = (int)(var0 >>> 14 & 3L);
      return var2 == 2;
   }

   public static class275 method532(int var0) {
      class275 var1 = (class275)class275.field3618.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class275.field3631.method4831(12, var0);
         var1 = new class275();
         if (var2 != null) {
            var1.method5464(new class184(var2));
         }

         var1.method5456();
         class275.field3618.method4204(var1, (long)var0);
         return var1;
      }
   }

   static int method530(int var0, class86 var1, boolean var2) {
      class232 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class18.method213(class70.field1070[--class60.field600]);
      } else {
         var3 = var2 ? class10.field75 : class70.field1080;
      }

      class37.method721(var3);
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var3.field2740 = 2;
            var3.field2755 = class70.field1070[--class60.field600];
            return 1;
         } else if (var0 == 1202) {
            var3.field2740 = 3;
            var3.field2755 = class69.field1063.field630.method4672();
            return 1;
         } else {
            return 2;
         }
      } else {
         class60.field600 -= 2;
         int var4 = class70.field1070[class60.field600];
         int var5 = class70.field1070[class60.field600 + 1];
         var3.field2793 = var4;
         var3.field2794 = var5;
         class271 var6 = class84.method2125(var4);
         var3.field2732 = var6.field3524;
         var3.field2719 = var6.field3519;
         var3.field2720 = var6.field3520;
         var3.field2718 = var6.field3521;
         var3.field2717 = var6.field3522;
         var3.field2721 = var6.field3517;
         if (var0 == 1205) {
            var3.field2797 = 0;
         } else if (var0 == 1212 | var6.field3523 == 1) {
            var3.field2797 = 1;
         } else {
            var3.field2797 = 2;
         }

         if (var3.field2722 > 0) {
            var3.field2721 = var3.field2721 * 32 / var3.field2722;
         } else if (var3.field2678 > 0) {
            var3.field2721 = var3.field2721 * 32 / var3.field2678;
         }

         return 1;
      }
   }

   public static final class323 method531(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var3 << 42);
      class323 var8;
      if (!var5) {
         var8 = (class323)class271.field3546.method4198(var6);
         if (var8 != null) {
            return var8;
         }
      }

      class271 var9 = class84.method2125(var0);
      if (var1 > 1 && var9.field3553 != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.field3542[var11] && var9.field3542[var11] != 0) {
               var10 = var9.field3553[var11];
            }
         }

         if (var10 != -1) {
            var9 = class84.method2125(var10);
         }
      }

      class121 var21 = var9.method5350(1);
      if (var21 == null) {
         return null;
      } else {
         class323 var22 = null;
         if (var9.field3552 != -1) {
            var22 = method531(var9.field3549, 10, 1, 0, 0, true);
            if (var22 == null) {
               return null;
            }
         } else if (var9.field3518 != -1) {
            var22 = method531(var9.field3511, var1, var2, var3, 0, false);
            if (var22 == null) {
               return null;
            }
         } else if (var9.field3510 != -1) {
            var22 = method531(var9.field3555, var1, 0, 0, 0, false);
            if (var22 == null) {
               return null;
            }
         }

         int[] var12 = class319.field3856;
         int var13 = class319.field3854;
         int var14 = class319.field3855;
         int[] var15 = new int[4];
         class319.method6110(var15);
         var8 = new class323(36, 32);
         class319.method6038(var8.field3889, 36, 32);
         class319.method6043();
         class124.method3000();
         class124.method2986(16, 16);
         class124.field1731 = false;
         if (var9.field3510 != -1) {
            var22.method6164(0, 0);
         }

         int var16 = var9.field3517;
         if (var5) {
            var16 = (int)(1.5D * (double)var16);
         } else if (var2 == 2) {
            var16 = (int)((double)var16 * 1.04D);
         }

         int var17 = var16 * class124.field1747[var9.field3524] >> 16;
         int var18 = var16 * class124.field1754[var9.field3524] >> 16;
         var21.method2873();
         var21.method2925(0, var9.field3519, var9.field3520, var9.field3524, var9.field3521, var21.field1840 / 2 + var17 + var9.field3522, var18 + var9.field3522);
         if (var9.field3518 != -1) {
            var22.method6164(0, 0);
         }

         if (var2 >= 1) {
            var8.method6160(1);
         }

         if (var2 >= 2) {
            var8.method6160(16777215);
         }

         if (var3 != 0) {
            var8.method6161(var3);
         }

         class319.method6038(var8.field3889, 36, 32);
         if (var9.field3552 != -1) {
            var22.method6164(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var9.field3523 == 1) {
            class300 var19 = class140.field1931;
            String var20;
            if (var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.method5846(var20, 0, 9, 16776960, 1);
         }

         if (!var5) {
            class271.field3546.method4204(var8, var6);
         }

         class319.method6038(var12, var13, var14);
         class319.method6050(var15);
         class124.method3000();
         class124.field1731 = true;
         return var8;
      }
   }
}
