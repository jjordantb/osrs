public class class53 {
   final class251 field528;
   final int field529;
   int field530 = 0;

   class53(class251 var1, String var2) {
      this.field528 = var1;
      this.field529 = var1.method4841();
   }

   boolean method1075() {
      this.field530 = 0;

      for(int var1 = 0; var1 < this.field529; ++var1) {
         if (!this.field528.method4961(var1) || this.field528.method4931(var1)) {
            ++this.field530;
         }
      }

      return this.field530 >= this.field529;
   }

   public static void method1076(class57 var0) {
      client.method1655(var0, 500000);
   }

   static final void method1082(boolean var0, class191 var1) {
      client.field850 = 0;
      client.field779 = 0;
      class191 var2 = client.field690.field1283;
      var2.method4056();
      int var3 = var2.method4052(8);
      int var4;
      if (var3 < client.field686) {
         for(var4 = var3; var4 < client.field686; ++var4) {
            client.field743[++client.field850 - 1] = client.field687[var4];
         }
      }

      if (var3 > client.field686) {
         throw new RuntimeException("");
      } else {
         client.field686 = 0;

         int var5;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = client.field687[var4];
            class73 var6 = client.field806[var5];
            var7 = var2.method4052(1);
            if (var7 == 0) {
               client.field687[++client.field686 - 1] = var5;
               var6.field988 = client.field655;
            } else {
               var8 = var2.method4052(2);
               if (var8 == 0) {
                  client.field687[++client.field686 - 1] = var5;
                  var6.field988 = client.field655;
                  client.field689[++client.field779 - 1] = var5;
               } else if (var8 == 1) {
                  client.field687[++client.field686 - 1] = var5;
                  var6.field988 = client.field655;
                  var9 = var2.method4052(3);
                  var6.method1970(var9, (byte)1);
                  var10 = var2.method4052(1);
                  if (var10 == 1) {
                     client.field689[++client.field779 - 1] = var5;
                  }
               } else if (var8 == 2) {
                  client.field687[++client.field686 - 1] = var5;
                  var6.field988 = client.field655;
                  var9 = var2.method4052(3);
                  var6.method1970(var9, (byte)2);
                  var10 = var2.method4052(3);
                  var6.method1970(var10, (byte)2);
                  var11 = var2.method4052(1);
                  if (var11 == 1) {
                     client.field689[++client.field779 - 1] = var5;
                  }
               } else if (var8 == 3) {
                  client.field743[++client.field850 - 1] = var5;
               }
            }
         }

         int var14;
         class73 var15;
         int var16;
         while(var1.method4054(client.field690.field1285) >= 27) {
            var14 = var1.method4052(15);
            if (var14 == 32767) {
               break;
            }

            boolean var17 = false;
            if (client.field806[var14] == null) {
               client.field806[var14] = new class73();
               var17 = true;
            }

            var15 = client.field806[var14];
            client.field687[++client.field686 - 1] = var14;
            var15.field988 = client.field655;
            if (var0) {
               var5 = var1.method4052(8);
               if (var5 > 127) {
                  var5 -= 256;
               }
            } else {
               var5 = var1.method4052(5);
               if (var5 > 15) {
                  var5 -= 32;
               }
            }

            var16 = var1.method4052(1);
            var7 = client.field699[var1.method4052(3)];
            if (var17) {
               var15.field990 = var15.field940 = var7;
            }

            var8 = var1.method4052(1);
            if (var8 == 1) {
               client.field689[++client.field779 - 1] = var14;
            }

            if (var0) {
               var9 = var1.method4052(8);
               if (var9 > 127) {
                  var9 -= 256;
               }
            } else {
               var9 = var1.method4052(5);
               if (var9 > 15) {
                  var9 -= 32;
               }
            }

            var15.field1102 = class248.method4823(var1.method4052(14));
            var15.field964 = var15.field1102.field3600;
            var15.field947 = var15.field1102.field3599;
            if (var15.field947 == 0) {
               var15.field940 = 0;
            }

            var15.field942 = var15.field1102.field3593;
            var15.field948 = var15.field1102.field3577;
            var15.field949 = var15.field1102.field3578;
            var15.field950 = var15.field1102.field3579;
            var15.field944 = var15.field1102.field3573;
            var15.field945 = var15.field1102.field3580;
            var15.field957 = var15.field1102.field3575;
            var15.method1982(class69.field1063.field994[0] + var5, class69.field1063.field952[0] + var9, var16 == 1);
         }

         var1.method4053();

         for(var14 = 0; var14 < client.field779; ++var14) {
            var3 = client.field689[var14];
            var15 = client.field806[var3];
            var5 = var1.method3983();
            if ((var5 & 1) != 0) {
               var15.field965 = var1.method3807();
               if (var15.field965 == 65535) {
                  var15.field965 = -1;
               }
            }

            if ((var5 & 64) != 0) {
               var16 = var1.method3792();
               var7 = var1.method3792();
               var8 = var15.field953 - (var16 - class49.field490 - class49.field490) * 64;
               var9 = var15.field999 - (var7 - class11.field91 - class11.field91) * 64;
               if (var8 != 0 || var9 != 0) {
                  var15.field967 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
               }
            }

            if ((var5 & 32) != 0) {
               var16 = var1.method3771();
               if (var16 == 65535) {
                  var16 = -1;
               }

               var7 = var1.method3891();
               if (var16 == var15.field971 && var16 != -1) {
                  var8 = class29.method532(var16).field3615;
                  if (var8 == 1) {
                     var15.field986 = 0;
                     var15.field989 = 0;
                     var15.field998 = var7;
                     var15.field975 = 0;
                  }

                  if (var8 == 2) {
                     var15.field975 = 0;
                  }
               } else if (var16 == -1 || var15.field971 == -1 || class29.method532(var16).field3627 >= class29.method532(var15.field971).field3627) {
                  var15.field971 = var16;
                  var15.field986 = 0;
                  var15.field989 = 0;
                  var15.field998 = var7;
                  var15.field975 = 0;
                  var15.field959 = var15.field939;
               }
            }

            if ((var5 & 4) != 0) {
               var15.field1102 = class248.method4823(var1.method3771());
               var15.field964 = var15.field1102.field3600;
               var15.field947 = var15.field1102.field3599;
               var15.field942 = var15.field1102.field3593;
               var15.field948 = var15.field1102.field3577;
               var15.field949 = var15.field1102.field3578;
               var15.field950 = var15.field1102.field3579;
               var15.field944 = var15.field1102.field3573;
               var15.field945 = var15.field1102.field3580;
               var15.field957 = var15.field1102.field3575;
            }

            if ((var5 & 16) != 0) {
               var16 = var1.method3799();
               int var12;
               if (var16 > 0) {
                  for(var7 = 0; var7 < var16; ++var7) {
                     var9 = -1;
                     var10 = -1;
                     var11 = -1;
                     var8 = var1.method3783();
                     if (var8 == 32767) {
                        var8 = var1.method3783();
                        var10 = var1.method3783();
                        var9 = var1.method3783();
                        var11 = var1.method3783();
                     } else if (var8 != 32766) {
                        var10 = var1.method3783();
                     } else {
                        var8 = -1;
                     }

                     var12 = var1.method3783();
                     var15.method1675(var8, var10, var9, var11, client.field655, var12);
                  }
               }

               var7 = var1.method3883();
               if (var7 > 0) {
                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var1.method3783();
                     var10 = var1.method3783();
                     if (var10 != 32767) {
                        var11 = var1.method3783();
                        var12 = var1.method3983();
                        int var13 = var10 > 0 ? var1.method3891() : var12;
                        var15.method1677(var9, client.field655, var10, var11, var12, var13);
                     } else {
                        var15.method1663(var9);
                     }
                  }
               }
            }

            if ((var5 & 8) != 0) {
               var15.field976 = var1.method3807();
               var16 = var1.method3964();
               var15.field980 = var16 >> 16;
               var15.field979 = (var16 & '\uffff') + client.field655;
               var15.field993 = 0;
               var15.field978 = 0;
               if (var15.field979 > client.field655) {
                  var15.field993 = -1;
               }

               if (var15.field976 == 65535) {
                  var15.field976 = -1;
               }
            }

            if ((var5 & 2) != 0) {
               var15.field968 = var1.method3778();
               var15.field981 = 100;
            }
         }

         for(var14 = 0; var14 < client.field850; ++var14) {
            var3 = client.field743[var14];
            if (client.field806[var3].field988 != client.field655) {
               client.field806[var3].field1102 = null;
               client.field806[var3] = null;
            }
         }

         if (var1.field2405 != client.field690.field1285) {
            throw new RuntimeException(var1.field2405 + "," + client.field690.field1285);
         } else {
            for(var14 = 0; var14 < client.field686; ++var14) {
               if (client.field806[client.field687[var14]] == null) {
                  throw new RuntimeException(var14 + "," + client.field686);
               }
            }

         }
      }
   }

   static final void method1080(class232 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field694) {
         client.field802 = 32;
      } else {
         client.field802 = 0;
      }

      client.field694 = false;
      int var7;
      if (class48.field469 == 1 || !class14.field132 && class48.field469 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field2689 -= 4;
            class37.method721(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field2689 += 4;
            class37.method721(var0);
         } else if (var5 >= var1 - client.field802 && var5 < client.field802 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.field2689 = var8 * (var4 - var3) / var9;
            class37.method721(var0);
            client.field694 = true;
         }
      }

      if (client.field841 != 0) {
         var7 = var0.field2682;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field2689 += client.field841 * 45;
            class37.method721(var0);
         }
      }

   }

   static final void method1077(class232[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class232 var3 = var0[var2];
         if (var3 != null && var3.field2700 == var1 && (!var3.field2685 || !class42.method784(var3))) {
            int var5;
            if (var3.field2808 == 0) {
               if (!var3.field2685 && class42.method784(var3) && var3 != class153.field1993) {
                  continue;
               }

               method1077(var0, var3.field2770);
               if (var3.field2791 != null) {
                  method1077(var3.field2791, var3.field2770);
               }

               class56 var4 = (class56)client.field804.method4224((long)var3.field2770);
               if (var4 != null) {
                  var5 = var4.field556;
                  if (class189.method4028(var5)) {
                     method1077(class145.field1951[var5], -1);
                  }
               }
            }

            if (var3.field2808 == 6) {
               if (var3.field2714 != -1 || var3.field2715 != -1) {
                  boolean var7 = class18.method239(var3);
                  if (var7) {
                     var5 = var3.field2715;
                  } else {
                     var5 = var3.field2714;
                  }

                  if (var5 != -1) {
                     class275 var6 = class29.method532(var5);

                     for(var3.field2750 += client.field705; var3.field2750 > var6.field3630[var3.field2795]; class37.method721(var3)) {
                        var3.field2750 -= var6.field3630[var3.field2795];
                        ++var3.field2795;
                        if (var3.field2795 >= var6.field3623.length) {
                           var3.field2795 -= var6.field3624;
                           if (var3.field2795 < 0 || var3.field2795 >= var6.field3623.length) {
                              var3.field2795 = 0;
                           }
                        }
                     }
                  }
               }

               if (var3.field2723 != 0 && !var3.field2685) {
                  int var8 = var3.field2723 >> 16;
                  var5 = var3.field2723 << 16 >> 16;
                  var8 *= client.field705;
                  var5 *= client.field705;
                  var3.field2732 = var8 + var3.field2732 & 2047;
                  var3.field2719 = var5 + var3.field2719 & 2047;
                  class37.method721(var3);
               }
            }
         }
      }

   }
}
