public final class class50 {
   static int[][][] field506 = new int[4][105][105];
   static byte[][][] field492 = new byte[4][104][104];
   static int field493 = 99;
   static byte[][][] field494;
   static byte[][][] field503;
   static int[][] field496;
   static int[] field510;
   static final int[] field491 = new int[]{1, 2, 4, 8};
   static final int[] field499 = new int[]{16, 32, 64, 128};
   static final int[] field497 = new int[]{1, 0, -1, 0};
   static final int[] field501 = new int[]{0, -1, 0, 1};
   static final int[] field502 = new int[]{1, -1, -1, 1};
   static final int[] field507 = new int[]{-1, -1, 1, 1};
   static int field504 = (int)(Math.random() * 17.0D) - 8;
   static int field498 = (int)(Math.random() * 33.0D) - 16;
   static class322[] field513;
   static class251 field505;
   static int field508;
   static class232 field495;

   static int method1031(int var0, class86 var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == 100) {
         class60.field600 -= 3;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         int var5 = class70.field1070[class60.field600 + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            class232 var6 = class18.method213(var3);
            if (var6.field2791 == null) {
               var6.field2791 = new class232[var5 + 1];
            }

            if (var6.field2791.length <= var5) {
               class232[] var7 = new class232[var5 + 1];

               for(int var8 = 0; var8 < var6.field2791.length; ++var8) {
                  var7[var8] = var6.field2791[var8];
               }

               var6.field2791 = var7;
            }

            if (var5 > 0 && var6.field2791[var5 - 1] == null) {
               throw new RuntimeException("" + (var5 - 1));
            } else {
               class232 var12 = new class232();
               var12.field2808 = var4;
               var12.field2700 = var12.field2770 = var6.field2770;
               var12.field2787 = var5;
               var12.field2685 = true;
               var6.field2791[var5] = var12;
               if (var2) {
                  class10.field75 = var12;
               } else {
                  class70.field1080 = var12;
               }

               class37.method721(var6);
               return 1;
            }
         }
      } else {
         class232 var9;
         if (var0 == 101) {
            var9 = var2 ? class10.field75 : class70.field1080;
            class232 var10 = class18.method213(var9.field2770);
            var10.field2791[var9.field2787] = null;
            class37.method721(var10);
            return 1;
         } else if (var0 == 102) {
            var9 = class18.method213(class70.field1070[--class60.field600]);
            var9.field2791 = null;
            class37.method721(var9);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var9 = class18.method213(class70.field1070[--class60.field600]);
               if (var9 != null) {
                  class70.field1070[++class60.field600 - 1] = 1;
                  if (var2) {
                     class10.field75 = var9;
                  } else {
                     class70.field1080 = var9;
                  }
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            class60.field600 -= 2;
            var3 = class70.field1070[class60.field600];
            var4 = class70.field1070[class60.field600 + 1];
            class232 var11 = class9.method102(var3, var4);
            if (var11 != null && var4 != -1) {
               class70.field1070[++class60.field600 - 1] = 1;
               if (var2) {
                  class10.field75 = var11;
               } else {
                  class70.field1080 = var11;
               }
            } else {
               class70.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
         }
      }
   }

   public static int method1058(boolean var0, boolean var1) {
      byte var2 = 0;
      int var3 = var2 + class252.field3262 + class252.field3264;
      return var3;
   }
}
