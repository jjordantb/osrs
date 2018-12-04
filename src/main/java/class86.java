public class class86 extends class208 {
   static class202 field1261 = new class202(128);
   static int field1260;
   int[] field1257;
   int[] field1252;
   String[] field1255;
   int field1256;
   int field1254;
   int field1258;
   int field1259;
   class199[] field1253;

   class199[] method2151(int var1) {
      return new class199[var1];
   }

   public static void method2165(int var0) {
      class48.field484 = var0;
   }

   public static class268 method2166(int var0) {
      class268 var1 = (class268)class268.field3414.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class268.field3419.method4831(8, var0);
         var1 = new class268();
         if (var2 != null) {
            var1.method5223(new class184(var2));
         }

         class268.field3414.method4204(var1, (long)var0);
         return var1;
      }
   }

   static class86 method2153(int var0, int var1) {
      class86 var2 = (class86)field1261.method4198((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class137.field1914.method4825(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = class137.field1914.method4835(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = class80.method2052(var5);
               if (var2 != null) {
                  field1261.method4204(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static boolean method2162(class191 var0, int var1) {
      int var2 = var0.method4052(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.method4052(1) != 0) {
            method2162(var0, var1);
         }

         var3 = var0.method4052(13);
         var4 = var0.method4052(13);
         boolean var12 = var0.method4052(1) == 1;
         if (var12) {
            class83.field1234[++class83.field1227 - 1] = var1;
         }

         if (client.field698[var1] != null) {
            throw new RuntimeException();
         } else {
            class61 var6 = client.field698[var1] = new class61();
            var6.field628 = var1;
            if (class83.field1233[var1] != null) {
               var6.method1172(class83.field1233[var1]);
            }

            var6.field990 = class83.field1231[var1];
            var6.field965 = class83.field1232[var1];
            var7 = class83.field1230[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var6.field996[0] = class83.field1224[var1];
            var6.field620 = (byte)var8;
            var6.method1210((var9 << 13) + var3 - class49.field490, (var10 << 13) + var4 - class11.field91);
            var6.field631 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.method4052(2);
         var4 = class83.field1230[var1];
         class83.field1230[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
         return false;
      } else {
         int var5;
         int var11;
         if (var2 == 2) {
            var3 = var0.method4052(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var11 = class83.field1230[var1];
            var7 = (var11 >> 28) + var4 & 3;
            var8 = var11 >> 14 & 255;
            var9 = var11 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            class83.field1230[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.method4052(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var11 = var3 & 255;
            var7 = class83.field1230[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var7 + var11 & 255;
            class83.field1230[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }

   static String method2167(class232 var0) {
      if (class9.method98(class254.method5000(var0)) == 0) {
         return null;
      } else {
         return var0.field2752 != null && var0.field2752.trim().length() != 0 ? var0.field2752 : null;
      }
   }

   static void method2163(class184 var0, int var1) {
      byte[] var2 = var0.field2404;
      if (client.field708 == null) {
         client.field708 = new byte[24];
      }

      class195.method4102(var2, var1, client.field708, 0, 24);
      if (class157.field2038 != null) {
         try {
            class157.field2038.method2683(0L);
            class157.field2038.method2692(var0.field2404, var1, 24);
         } catch (Exception var4) {
            ;
         }
      }

   }
}
