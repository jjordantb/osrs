public class class13 {
   static int field103;
   static class155 field106;
   static class232 field104;
   int field108;
   class228 field109;

   class13(int var1, class228 var2) {
      this.field108 = var1;
      this.field109 = var2;
   }

   static final void method143() {
      if (class60.field599 != client.field661) {
         client.field661 = class60.field599;
         int var0 = class60.field599;
         int[] var1 = class3.field29.field3889;
         int var2 = var1.length;

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            var1[var3] = 0;
         }

         int var4;
         int var5;
         for(var3 = 1; var3 < 103; ++var3) {
            var4 = (103 - var3) * 2048 + 24628;

            for(var5 = 1; var5 < 103; ++var5) {
               if ((class50.field492[var0][var5][var3] & 24) == 0) {
                  class243.field3173.method3091(var1, var4, 512, var0, var5, var3);
               }

               if (var0 < 3 && (class50.field492[var0 + 1][var5][var3] & 8) != 0) {
                  class243.field3173.method3091(var1, var4, 512, var0 + 1, var5, var3);
               }

               var4 += 4;
            }
         }

         var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         class3.field29.method6155();

         int var6;
         for(var5 = 1; var5 < 103; ++var5) {
            for(var6 = 1; var6 < 103; ++var6) {
               if ((class50.field492[var0][var6][var5] & 24) == 0) {
                  class136.method3269(var0, var6, var5, var3, var4);
               }

               if (var0 < 3 && (class50.field492[var0 + 1][var6][var5] & 8) != 0) {
                  class136.method3269(var0 + 1, var6, var5, var3, var4);
               }
            }
         }

         client.field820 = 0;

         for(var5 = 0; var5 < 104; ++var5) {
            for(var6 = 0; var6 < 104; ++var6) {
               long var7 = class243.field3173.method3182(class60.field599, var5, var6);
               if (var7 != 0L) {
                  int var9 = class56.method1110(var7);
                  int var10 = class253.method4993(var9).field3479;
                  if (var10 >= 0) {
                     client.field873[client.field820] = class162.method3533(var10).method5064(false);
                     client.field871[client.field820] = var5;
                     client.field872[client.field820] = var6;
                     ++client.field820;
                  }
               }
            }
         }

         class30.field313.method6119();
      }

   }

   static final void method144(int var0, int var1, int var2, int var3) {
      client.field680 = 0;
      int var4 = (class69.field1063.field953 >> 7) + class49.field490;
      int var5 = (class69.field1063.field999 >> 7) + class11.field91;
      if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
         client.field680 = 1;
      }

      if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
         client.field680 = 1;
      }

      if (client.field680 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
         client.field680 = 0;
      }

   }

   static final void method142(class232 var0, class271 var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.field3541;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         class183.method3749(var7, class128.method3233(16748608) + var1.field3515, var6, var1.field3557, var2, var0.field2770, var4);
      }

   }
}
