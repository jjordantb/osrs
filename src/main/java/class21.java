public final class class21 {
   static int field208;
   static int[] field209;
   static String field206;
   final int[] field207 = new int[4096];

   final void method320(class32 var1) {
      for(int var2 = 0; var2 < 64; ++var2) {
         for(int var3 = 0; var3 < 64; ++var3) {
            this.field207[var2 * 64 + var3] = var1.method600(var2, var3) | -16777216;
         }
      }

   }

   final int method321(int var1, int var2) {
      return this.field207[var1 * 64 + var2];
   }

   static void method322(int var0, int var1, int var2, int var3) {
      for(class69 var4 = (class69)class69.field1051.method4298(); var4 != null; var4 = (class69)class69.field1051.method4283()) {
         if (var4.field1054 != -1 || var4.field1058 != null) {
            int var5 = 0;
            if (var1 > var4.field1062) {
               var5 += var1 - var4.field1062;
            } else if (var1 < var4.field1049) {
               var5 += var4.field1049 - var1;
            }

            if (var2 > var4.field1052) {
               var5 += var2 - var4.field1052;
            } else if (var2 < var4.field1059) {
               var5 += var4.field1059 - var2;
            }

            if (var5 - 64 <= var4.field1053 && client.field881 != 0 && var0 == var4.field1048) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field1053 - var5) * client.field881 / var4.field1053;
               if (var4.field1064 == null) {
                  if (var4.field1054 >= 0) {
                     class93 var7 = class93.method2275(class9.field72, var4.field1054, 0);
                     if (var7 != null) {
                        class95 var8 = var7.method2281().method2322(class286.field3697);
                        class105 var9 = class105.method2479(var8, 100, var6);
                        var9.method2471(-1);
                        class43.field413.method2215(var9);
                        var4.field1064 = var9;
                     }
                  }
               } else {
                  var4.field1064.method2472(var6);
               }

               if (var4.field1060 == null) {
                  if (var4.field1058 != null && (var4.field1055 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.field1058.length);
                     class93 var12 = class93.method2275(class9.field72, var4.field1058[var11], 0);
                     if (var12 != null) {
                        class95 var13 = var12.method2281().method2322(class286.field3697);
                        class105 var10 = class105.method2479(var13, 100, var6);
                        var10.method2471(0);
                        class43.field413.method2215(var10);
                        var4.field1060 = var10;
                        var4.field1055 = var4.field1056 + (int)(Math.random() * (double)(var4.field1057 - var4.field1056));
                     }
                  }
               } else {
                  var4.field1060.method2472(var6);
                  if (!var4.field1060.method4272()) {
                     var4.field1060 = null;
                  }
               }
            } else {
               if (var4.field1064 != null) {
                  class43.field413.method2214(var4.field1064);
                  var4.field1064 = null;
               }

               if (var4.field1060 != null) {
                  class43.field413.method2214(var4.field1060);
                  var4.field1060 = null;
               }
            }
         }
      }

   }

   public static Object method330(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else {
         if (var0.length > 136 && !class188.field2437) {
            try {
               class182 var2 = new class182();
               var2.vmethod4022(var0);
               return var2;
            } catch (Throwable var3) {
               class188.field2437 = true;
            }
         }

         return var0;
      }
   }

   static int method319(int var0, class86 var1, boolean var2) {
      if (var0 == 5306) {
         class70.field1070[++class60.field600 - 1] = class17.method211();
         return 1;
      } else {
         int var3;
         if (var0 == 5307) {
            var3 = class70.field1070[--class60.field600];
            if (var3 == 1 || var3 == 2) {
               class27.method513(var3);
            }

            return 1;
         } else if (var0 == 5308) {
            class70.field1070[++class60.field600 - 1] = class47.field435.field1031;
            return 1;
         } else if (var0 != 5309) {
            return 2;
         } else {
            var3 = class70.field1070[--class60.field600];
            if (var3 == 1 || var3 == 2) {
               class47.field435.field1031 = var3;
               class61.method1202();
            }

            return 1;
         }
      }
   }
}
