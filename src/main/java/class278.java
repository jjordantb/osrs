public class class278 {
   static class322[] field3642;

   static void method5495(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         class66 var8 = class66.field1017[var6];
         class66.field1017[var6] = class66.field1017[var1];
         class66.field1017[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            class66 var11 = class66.field1017[var9];
            int var12 = class135.method3265(var11, var8, var2, var3);
            int var10;
            if (var12 != 0) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = class135.method3265(var11, var8, var4, var5);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               class66 var14 = class66.field1017[var9];
               class66.field1017[var9] = class66.field1017[var7];
               class66.field1017[var7++] = var14;
            }
         }

         class66.field1017[var1] = class66.field1017[var7];
         class66.field1017[var7] = var8;
         method5495(var0, var7 - 1, var2, var3, var4, var5);
         method5495(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   static final void method5494(class322 var0) {
      short var1 = 256;

      int var2;
      for(var2 = 0; var2 < class62.field640.length; ++var2) {
         class62.field640[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * (double)var1);
         class62.field640[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < var1 - 1; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               class32.field322[var5] = (class62.field640[var5 - 128] + class62.field640[var5 + 1] + class62.field640[var5 + 128] + class62.field640[var5 - 1]) / 4;
            }
         }

         int[] var8 = class62.field640;
         class62.field640 = class32.field322;
         class32.field322 = var8;
      }

      if (var0 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var0.field3873; ++var3) {
            for(var4 = 0; var4 < var0.field3872; ++var4) {
               if (var0.field3870[var2++] != 0) {
                  var5 = var4 + var0.field3874 + 16;
                  int var6 = var3 + var0.field3877 + 16;
                  int var7 = var5 + (var6 << 7);
                  class62.field640[var7] = 0;
               }
            }
         }
      }

   }
}
