import java.net.URL;

public class class11 {
   static int field91;

   static boolean method121() {
      try {
         if (class66.field1010 == null) {
            class66.field1010 = class37.field352.method3278(new URL(class112.field1496));
         } else if (class66.field1010.method3286()) {
            byte[] var0 = class66.field1010.method3281();
            class184 var1 = new class184(var0);
            var1.method3892();
            class66.field1013 = var1.method3771();
            class66.field1017 = new class66[class66.field1013];

            class66 var3;
            for(int var2 = 0; var2 < class66.field1013; var3.field1024 = var2++) {
               var3 = class66.field1017[var2] = new class66();
               var3.field1015 = var1.method3771();
               var3.field1008 = var1.method3892();
               var3.field1019 = var1.method3778();
               var3.field1022 = var1.method3778();
               var3.field1021 = var1.method3983();
               var3.field1020 = var1.method3814();
            }

            class305.method5919(class66.field1017, 0, class66.field1017.length - 1, class66.field1016, class66.field1018);
            class66.field1010 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         class66.field1010 = null;
      }

      return false;
   }

   static class59 method119(int var0) {
      return (class59)class85.field1249.method4185((long)var0);
   }

   static final void method120(boolean var0, class191 var1) {
      client.field702 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      if (!client.field702) {
         var2 = var1.method3792();
         var3 = var1.method3808();
         int var4 = var1.method3771();
         class250.field3247 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class250.field3247[var5][var6] = var1.method3892();
            }
         }

         class37.field367 = new int[var4];
         class219.field2532 = new int[var4];
         class29.field295 = new int[var4];
         class192.field2458 = new byte[var4][];
         class111.field1487 = new byte[var4][];
         boolean var16 = false;
         if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
            var16 = true;
         }

         if (var3 / 8 == 48 && var2 / 8 == 148) {
            var16 = true;
         }

         var4 = 0;

         for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
            for(var7 = (var2 - 6) / 8; var7 <= (var2 + 6) / 8; ++var7) {
               var8 = var7 + (var6 << 8);
               if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
                  class37.field367[var4] = var8;
                  class219.field2532[var4] = class332.field4017.method4825("m" + var6 + "_" + var7);
                  class29.field295[var4] = class332.field4017.method4825("l" + var6 + "_" + var7);
                  ++var4;
               }
            }
         }

         class156.method3442(var3, var2, true);
      } else {
         var2 = var1.method3808();
         var3 = var1.method3792();
         boolean var15 = var1.method3983() == 1;
         var5 = var1.method3771();
         var1.method4056();

         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method4052(1);
                  if (var9 == 1) {
                     client.field703[var6][var7][var8] = var1.method4052(26);
                  } else {
                     client.field703[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method4053();
         class250.field3247 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class250.field3247[var6][var7] = var1.method3892();
            }
         }

         class37.field367 = new int[var5];
         class219.field2532 = new int[var5];
         class29.field295 = new int[var5];
         class192.field2458 = new byte[var5][];
         class111.field1487 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.field703[var6][var7][var8];
                  if (var9 != -1) {
                     int var10 = var9 >> 14 & 1023;
                     int var11 = var9 >> 3 & 2047;
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if (class37.field367[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        class37.field367[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class219.field2532[var5] = class332.field4017.method4825("m" + var13 + "_" + var14);
                        class29.field295[var5] = class332.field4017.method4825("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class156.method3442(var3, var2, !var15);
      }

   }
}
