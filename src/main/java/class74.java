import java.math.BigInteger;

public class class74 {
   static final BigInteger field1104 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static final BigInteger field1109 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static int field1113;

   public static String method1996(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class131.method3242(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   static int method1994(int var0, class86 var1, boolean var2) {
      if (var0 == 5630) {
         client.field725 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   static final void method1987() {
      client.field690.method2190();
      class125.method3052();
      class243.field3173.method3057();

      for(int var0 = 0; var0 < 4; ++var0) {
         client.field701[var0].method3612();
      }

      System.gc();
      class180.method3732(2);
      client.field878 = -1;
      client.field879 = false;
      class148.method3368();
      class16.method202(10);
   }

   static final int method1984(class232 var0, int var1) {
      if (var0.field2785 != null && var1 < var0.field2785.length) {
         try {
            int[] var2 = var0.field2785[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = client.field775[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = client.field776[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = client.field777[var2[var4++]];
               }

               int var9;
               class232 var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class18.method213(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class84.method2125(var11).field3512 || client.field647)) {
                     for(var12 = 0; var12 < var10.field2762.length; ++var12) {
                        if (var11 + 1 == var10.field2762[var12]) {
                           var7 += var10.field2792[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = class227.field2629[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = class236.field2844[client.field776[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = class227.field2629[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = class69.field1063.field611;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (class236.field2842[var9]) {
                        var7 += client.field776[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = class18.method213(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!class84.method2125(var11).field3512 || client.field647)) {
                     for(var12 = 0; var12 < var10.field2762.length; ++var12) {
                        if (var11 + 1 == var10.field2762[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = client.field810;
               }

               if (var6 == 12) {
                  var7 = client.field851;
               }

               if (var6 == 13) {
                  var9 = class227.field2629[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = class97.method2405(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = (class69.field1063.field953 >> 7) + class49.field490;
               }

               if (var6 == 19) {
                  var7 = (class69.field1063.field999 >> 7) + class11.field91;
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   static void method1993(boolean var0) {
      client.field790 = var0;
   }
}
