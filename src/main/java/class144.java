public class class144 extends class285 {
   static int field1947;
   static class323[] field1945;
   final boolean field1946;

   public class144(boolean var1) {
      this.field1946 = var1;
   }

   int method3335(class289 var1, class289 var2) {
      if (var1.field3708 != 0) {
         if (var2.field3708 == 0) {
            return this.field1946 ? -1 : 1;
         }
      } else if (var2.field3708 != 0) {
         return this.field1946 ? 1 : -1;
      }

      return this.method5566(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3335((class289)var1, (class289)var2);
   }

   public static final boolean method3342(int var0, int var1, class168 var2, class166 var3) {
      int var4 = var0;
      int var5 = var1;
      byte var6 = 64;
      byte var7 = 64;
      int var8 = var0 - var6;
      int var9 = var1 - var7;
      class167.field2105[var6][var7] = 99;
      class167.field2103[var6][var7] = 0;
      byte var10 = 0;
      int var11 = 0;
      class167.field2106[var10] = var0;
      byte var10001 = var10;
      int var18 = var10 + 1;
      class167.field2110[var10001] = var1;
      int[][] var12 = var3.field2101;

      while(var18 != var11) {
         var4 = class167.field2106[var11];
         var5 = class167.field2110[var11];
         var11 = var11 + 1 & 4095;
         int var16 = var4 - var8;
         int var17 = var5 - var9;
         int var13 = var4 - var3.field2097;
         int var14 = var5 - var3.field2086;
         if (var2.vmethod3646(2, var4, var5, var3)) {
            class233.field2809 = var4;
            class167.field2107 = var5;
            return true;
         }

         int var15 = class167.field2103[var16][var17] + 1;
         if (var16 > 0 && class167.field2105[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
            class167.field2106[var18] = var4 - 1;
            class167.field2110[var18] = var5;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 - 1][var17] = 2;
            class167.field2103[var16 - 1][var17] = var15;
         }

         if (var16 < 126 && class167.field2105[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
            class167.field2106[var18] = var4 + 1;
            class167.field2110[var18] = var5;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 + 1][var17] = 8;
            class167.field2103[var16 + 1][var17] = var15;
         }

         if (var17 > 0 && class167.field2105[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
            class167.field2106[var18] = var4;
            class167.field2110[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16][var17 - 1] = 1;
            class167.field2103[var16][var17 - 1] = var15;
         }

         if (var17 < 126 && class167.field2105[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
            class167.field2106[var18] = var4;
            class167.field2110[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16][var17 + 1] = 4;
            class167.field2103[var16][var17 + 1] = var15;
         }

         if (var16 > 0 && var17 > 0 && class167.field2105[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
            class167.field2106[var18] = var4 - 1;
            class167.field2110[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 - 1][var17 - 1] = 3;
            class167.field2103[var16 - 1][var17 - 1] = var15;
         }

         if (var16 < 126 && var17 > 0 && class167.field2105[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
            class167.field2106[var18] = var4 + 1;
            class167.field2110[var18] = var5 - 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 + 1][var17 - 1] = 9;
            class167.field2103[var16 + 1][var17 - 1] = var15;
         }

         if (var16 > 0 && var17 < 126 && class167.field2105[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
            class167.field2106[var18] = var4 - 1;
            class167.field2110[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 - 1][var17 + 1] = 6;
            class167.field2103[var16 - 1][var17 + 1] = var15;
         }

         if (var16 < 126 && var17 < 126 && class167.field2105[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
            class167.field2106[var18] = var4 + 1;
            class167.field2110[var18] = var5 + 1;
            var18 = var18 + 1 & 4095;
            class167.field2105[var16 + 1][var17 + 1] = 12;
            class167.field2103[var16 + 1][var17 + 1] = var15;
         }
      }

      class233.field2809 = var4;
      class167.field2107 = var5;
      return false;
   }
}
