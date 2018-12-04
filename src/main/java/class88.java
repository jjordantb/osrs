public class class88 {
   static int field1276;
   class59[] field1273 = new class59[100];
   int field1275;

   class59 method2174(int var1, String var2, String var3, String var4) {
      class59 var5 = this.field1273[99];

      for(int var6 = this.field1275; var6 > 0; --var6) {
         if (var6 != 100) {
            this.field1273[var6] = this.field1273[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new class59(var1, var2, var4, var3);
      } else {
         var5.method4271();
         var5.method4308();
         var5.method1134(var1, var2, var4, var3);
      }

      this.field1273[0] = var5;
      if (this.field1275 < 100) {
         ++this.field1275;
      }

      return var5;
   }

   class59 method2176(int var1) {
      return var1 >= 0 && var1 < this.field1275 ? this.field1273[var1] : null;
   }

   int method2180() {
      return this.field1275;
   }

   public static String method2173(byte[] var0, int var1, int var2) {
      StringBuilder var3 = new StringBuilder();

      for(int var4 = var1; var4 < var2 + var1; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class306.field3800[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class306.field3800[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class306.field3800[(var6 & 15) << 2 | var7 >>> 6]).append(class306.field3800[var7 & 63]);
            } else {
               var3.append(class306.field3800[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class306.field3800[(var5 & 3) << 4]).append("==");
         }
      }

      return var3.toString();
   }

   static synchronized byte[] method2184(int var0) {
      return class185.method3999(var0, false);
   }

   static final void method2185(class232 var0, int var1, int var2, int var3) {
      class160.method3502();
      class226 var4 = var0.method4745(false);
      if (var4 != null) {
         class319.method6067(var1, var2, var4.field2626 + var1, var2 + var4.field2621);
         if (client.field876 != 2 && client.field876 != 5) {
            int var5 = client.field658 & 2047;
            int var6 = class69.field1063.field953 / 32 + 48;
            int var7 = 464 - class69.field1063.field999 / 32;
            class3.field29.method6180(var1, var2, var4.field2626, var4.field2621, var6, var7, var5, 256, var4.field2623, var4.field2622);

            int var8;
            int var9;
            int var10;
            for(var8 = 0; var8 < client.field820; ++var8) {
               var9 = client.field871[var8] * 4 + 2 - class69.field1063.field953 / 32;
               var10 = client.field872[var8] * 4 + 2 - class69.field1063.field999 / 32;
               class56.method1111(var1, var2, var9, var10, client.field873[var8], var4);
            }

            int var11;
            int var12;
            for(var8 = 0; var8 < 104; ++var8) {
               for(var9 = 0; var9 < 104; ++var9) {
                  class207 var15 = client.field829[class60.field599][var8][var9];
                  if (var15 != null) {
                     var11 = var8 * 4 + 2 - class69.field1063.field953 / 32;
                     var12 = var9 * 4 + 2 - class69.field1063.field999 / 32;
                     class56.method1111(var1, var2, var11, var12, class47.field461[0], var4);
                  }
               }
            }

            for(var8 = 0; var8 < client.field686; ++var8) {
               class73 var16 = client.field806[client.field687[var8]];
               if (var16 != null && var16.vmethod1973()) {
                  class273 var18 = var16.field1102;
                  if (var18 != null && var18.field3595 != null) {
                     var18 = var18.method5397();
                  }

                  if (var18 != null && var18.field3585 && var18.field3589) {
                     var11 = var16.field953 / 32 - class69.field1063.field953 / 32;
                     var12 = var16.field999 / 32 - class69.field1063.field999 / 32;
                     class56.method1111(var1, var2, var11, var12, class47.field461[1], var4);
                  }
               }
            }

            var8 = class83.field1226;
            int[] var19 = class83.field1222;

            for(var10 = 0; var10 < var8; ++var10) {
               class61 var17 = client.field698[var19[var10]];
               if (var17 != null && var17.vmethod1973() && !var17.field626 && var17 != class69.field1063) {
                  var12 = var17.field953 / 32 - class69.field1063.field953 / 32;
                  int var13 = var17.field999 / 32 - class69.field1063.field999 / 32;
                  boolean var14 = false;
                  if (class69.field1063.field622 != 0 && var17.field622 != 0 && var17.field622 == class69.field1063.field622) {
                     var14 = true;
                  }

                  if (var17.method1173()) {
                     class56.method1111(var1, var2, var12, var13, class47.field461[3], var4);
                  } else if (var14) {
                     class56.method1111(var1, var2, var12, var13, class47.field461[4], var4);
                  } else if (var17.method1176()) {
                     class56.method1111(var1, var2, var12, var13, class47.field461[5], var4);
                  } else {
                     class56.method1111(var1, var2, var12, var13, class47.field461[2], var4);
                  }
               }
            }

            if (client.field663 != 0 && client.field655 % 20 < 10) {
               if (client.field663 == 1 && client.field664 >= 0 && client.field664 < client.field806.length) {
                  class73 var20 = client.field806[client.field664];
                  if (var20 != null) {
                     var11 = var20.field953 / 32 - class69.field1063.field953 / 32;
                     var12 = var20.field999 / 32 - class69.field1063.field999 / 32;
                     class257.method5065(var1, var2, var11, var12, class186.field2421[1], var4);
                  }
               }

               if (client.field663 == 2) {
                  var10 = client.field666 * 4 - class49.field490 * 4 + 2 - class69.field1063.field953 / 32;
                  var11 = client.field667 * 4 - class11.field91 * 4 + 2 - class69.field1063.field999 / 32;
                  class257.method5065(var1, var2, var10, var11, class186.field2421[1], var4);
               }

               if (client.field663 == 10 && client.field665 >= 0 && client.field665 < client.field698.length) {
                  class61 var21 = client.field698[client.field665];
                  if (var21 != null) {
                     var11 = var21.field953 / 32 - class69.field1063.field953 / 32;
                     var12 = var21.field999 / 32 - class69.field1063.field999 / 32;
                     class257.method5065(var1, var2, var11, var12, class186.field2421[1], var4);
                  }
               }
            }

            if (client.field722 != 0) {
               var10 = client.field722 * 4 + 2 - class69.field1063.field953 / 32;
               var11 = client.field875 * 4 + 2 - class69.field1063.field999 / 32;
               class56.method1111(var1, var2, var10, var11, class186.field2421[0], var4);
            }

            if (!class69.field1063.field626) {
               class319.method6047(var4.field2626 / 2 + var1 - 1, var4.field2621 / 2 + var2 - 1, 3, 3, 16777215);
            }
         } else {
            class319.method6058(var1, var2, 0, var4.field2623, var4.field2622);
         }

         client.field849[var3] = true;
      }
   }
}
