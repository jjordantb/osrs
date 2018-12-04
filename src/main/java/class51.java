import java.io.File;

public class class51 {
   static File field519;
   static class76 field520;
   class86 field521;
   int field523 = -1;
   int[] field514;
   String[] field517;

   public static class309 method1060(int var0) {
      class309[] var1 = new class309[]{class309.field3806, class309.field3808, class309.field3805};
      class309[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class309 var4 = var2[var3];
         if (var0 == var4.field3807) {
            return var4;
         }
      }

      return null;
   }

   public static void method1062() {
      class275.field3618.method4199();
      class275.field3619.method4199();
   }

   static final boolean method1061(class121 var0, int var1, int var2, int var3) {
      boolean var4 = class122.field1711;
      if (!var4) {
         return false;
      } else {
         int var5;
         int var6;
         int var7;
         int var8;
         int var11;
         int var12;
         int var13;
         int var16;
         int var17;
         if (!class122.field1708) {
            var5 = class127.field1769;
            var6 = class127.field1796;
            var7 = class127.field1797;
            var8 = class127.field1798;
            byte var9 = 50;
            short var10 = 3500;
            var11 = (class122.field1712 - class124.field1739) * var9 / class124.field1741;
            var12 = (class122.field1715 - class124.field1730) * var9 / class124.field1741;
            var13 = (class122.field1712 - class124.field1739) * var10 / class124.field1741;
            int var14 = (class122.field1715 - class124.field1730) * var10 / class124.field1741;
            int var15 = class124.method2998(var12, var9, var6, var5);
            var16 = class124.method3012(var12, var9, var6, var5);
            var12 = var15;
            var15 = class124.method2998(var14, var10, var6, var5);
            var17 = class124.method3012(var14, var10, var6, var5);
            var14 = var15;
            var15 = class124.method2988(var11, var16, var8, var7);
            var16 = class124.method2997(var11, var16, var8, var7);
            var11 = var15;
            var15 = class124.method2988(var13, var17, var8, var7);
            var17 = class124.method2997(var13, var17, var8, var7);
            class122.field1709 = (var11 + var15) / 2;
            class55.field552 = (var14 + var12) / 2;
            class60.field605 = (var17 + var16) / 2;
            class248.field3222 = (var15 - var11) / 2;
            class84.field1243 = (var14 - var12) / 2;
            class114.field1513 = (var17 - var16) / 2;
            class294.field3725 = Math.abs(class248.field3222);
            class40.field396 = Math.abs(class84.field1243);
            class292.field3719 = Math.abs(class114.field1513);
         }

         var5 = var0.field1676 + var1;
         var6 = var2 + var0.field1671;
         var7 = var3 + var0.field1658;
         var8 = var0.field1673;
         var16 = var0.field1674;
         var17 = var0.field1691;
         var11 = class122.field1709 - var5;
         var12 = class55.field552 - var6;
         var13 = class60.field605 - var7;
         if (Math.abs(var11) > var8 + class294.field3725) {
            return false;
         } else if (Math.abs(var12) > var16 + class40.field396) {
            return false;
         } else if (Math.abs(var13) > var17 + class292.field3719) {
            return false;
         } else if (Math.abs(var13 * class84.field1243 - var12 * class114.field1513) > var17 * class40.field396 + var16 * class292.field3719) {
            return false;
         } else if (Math.abs(var11 * class114.field1513 - var13 * class248.field3222) > var17 * class294.field3725 + var8 * class292.field3719) {
            return false;
         } else {
            return Math.abs(var12 * class248.field3222 - var11 * class84.field1243) <= var16 * class294.field3725 + var8 * class40.field396;
         }
      }
   }
}
