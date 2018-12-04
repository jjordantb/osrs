public class class174 extends class206 {
   static class174[] field2334 = new class174[300];
   static int field2335 = 0;
   class171 field2331;
   int field2330;
   public class191 field2332;
   public int field2333;

   public void method3668() {
      if (field2335 < field2334.length) {
         field2334[++field2335 - 1] = this;
      }
   }

   static void method3670(class191 var0, int var1) {
      boolean var2 = var0.method4052(1) == 1;
      if (var2) {
         class83.field1234[++class83.field1227 - 1] = var1;
      }

      int var3 = var0.method4052(2);
      class61 var4 = client.field698[var1];
      if (var3 == 0) {
         if (var2) {
            var4.field631 = false;
         } else if (client.field747 == var1) {
            throw new RuntimeException();
         } else {
            class83.field1230[var1] = (var4.field620 << 28) + (class11.field91 + var4.field952[0] >> 13) + (class49.field490 + var4.field994[0] >> 13 << 14);
            if (var4.field967 != -1) {
               class83.field1231[var1] = var4.field967;
            } else {
               class83.field1231[var1] = var4.field990;
            }

            class83.field1232[var1] = var4.field965;
            client.field698[var1] = null;
            if (var0.method4052(1) != 0) {
               class86.method2162(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if (var3 == 1) {
            var5 = var0.method4052(3);
            var6 = var4.field994[0];
            var7 = var4.field952[0];
            if (var5 == 0) {
               --var6;
               --var7;
            } else if (var5 == 1) {
               --var7;
            } else if (var5 == 2) {
               ++var6;
               --var7;
            } else if (var5 == 3) {
               --var6;
            } else if (var5 == 4) {
               ++var6;
            } else if (var5 == 5) {
               --var6;
               ++var7;
            } else if (var5 == 6) {
               ++var7;
            } else if (var5 == 7) {
               ++var6;
               ++var7;
            }

            if (client.field747 != var1 || var4.field953 >= 1536 && var4.field999 >= 1536 && var4.field953 < 11776 && var4.field999 < 11776) {
               if (var2) {
                  var4.field631 = true;
                  var4.field632 = var6;
                  var4.field633 = var7;
               } else {
                  var4.field631 = false;
                  var4.method1180(var6, var7, class83.field1224[var1]);
               }
            } else {
               var4.method1210(var6, var7);
               var4.field631 = false;
            }

         } else if (var3 == 2) {
            var5 = var0.method4052(4);
            var6 = var4.field994[0];
            var7 = var4.field952[0];
            if (var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if (var5 == 1) {
               --var6;
               var7 -= 2;
            } else if (var5 == 2) {
               var7 -= 2;
            } else if (var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if (var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if (var5 == 5) {
               var6 -= 2;
               --var7;
            } else if (var5 == 6) {
               var6 += 2;
               --var7;
            } else if (var5 == 7) {
               var6 -= 2;
            } else if (var5 == 8) {
               var6 += 2;
            } else if (var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if (var5 == 10) {
               var6 += 2;
               ++var7;
            } else if (var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if (var5 == 12) {
               --var6;
               var7 += 2;
            } else if (var5 == 13) {
               var7 += 2;
            } else if (var5 == 14) {
               ++var6;
               var7 += 2;
            } else if (var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if (client.field747 == var1 && (var4.field953 < 1536 || var4.field999 < 1536 || var4.field953 >= 11776 || var4.field999 >= 11776)) {
               var4.method1210(var6, var7);
               var4.field631 = false;
            } else if (var2) {
               var4.field631 = true;
               var4.field632 = var6;
               var4.field633 = var7;
            } else {
               var4.field631 = false;
               var4.method1180(var6, var7, class83.field1224[var1]);
            }

         } else {
            var5 = var0.method4052(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if (var5 == 0) {
               var6 = var0.method4052(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if (var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.field994[0];
               var11 = var9 + var4.field952[0];
               if (client.field747 != var1 || var4.field953 >= 1536 && var4.field999 >= 1536 && var4.field953 < 11776 && var4.field999 < 11776) {
                  if (var2) {
                     var4.field631 = true;
                     var4.field632 = var10;
                     var4.field633 = var11;
                  } else {
                     var4.field631 = false;
                     var4.method1180(var10, var11, class83.field1224[var1]);
                  }
               } else {
                  var4.method1210(var10, var11);
                  var4.field631 = false;
               }

               var4.field620 = (byte)(var7 + var4.field620 & 3);
               if (client.field747 == var1) {
                  class60.field599 = var4.field620;
               }

            } else {
               var6 = var0.method4052(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (var8 + class49.field490 + var4.field994[0] & 16383) - class49.field490;
               var11 = (var9 + class11.field91 + var4.field952[0] & 16383) - class11.field91;
               if (client.field747 != var1 || var4.field953 >= 1536 && var4.field999 >= 1536 && var4.field953 < 11776 && var4.field999 < 11776) {
                  if (var2) {
                     var4.field631 = true;
                     var4.field632 = var10;
                     var4.field633 = var11;
                  } else {
                     var4.field631 = false;
                     var4.method1180(var10, var11, class83.field1224[var1]);
                  }
               } else {
                  var4.method1210(var10, var11);
                  var4.field631 = false;
               }

               var4.field620 = (byte)(var7 + var4.field620 & 3);
               if (client.field747 == var1) {
                  class60.field599 = var4.field620;
               }

            }
         }
      }
   }
}
