public final class class71 extends class129 {
   static class251 field1091;
   int field1092;
   int field1085;
   int field1086;
   int field1087;
   int field1088;
   int field1089;
   class275 field1090;
   int field1084 = 0;
   int field1094 = 0;
   boolean field1093 = false;

   class71(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field1092 = var1;
      this.field1086 = var2;
      this.field1087 = var3;
      this.field1088 = var4;
      this.field1089 = var5;
      this.field1085 = var7 + var6;
      int var8 = class250.method4918(this.field1092).field3348;
      if (var8 != -1) {
         this.field1093 = false;
         this.field1090 = class29.method532(var8);
      } else {
         this.field1093 = true;
      }

   }

   final void method1954(int var1) {
      if (!this.field1093) {
         this.field1094 += var1;

         while(this.field1094 > this.field1090.field3630[this.field1084]) {
            this.field1094 -= this.field1090.field3630[this.field1084];
            ++this.field1084;
            if (this.field1084 >= this.field1090.field3623.length) {
               this.field1093 = true;
               break;
            }
         }

      }
   }

   protected final class121 vmethod3236() {
      class260 var1 = class250.method4918(this.field1092);
      class121 var2;
      if (!this.field1093) {
         var2 = var1.method5088(this.field1084);
      } else {
         var2 = var1.method5088(-1);
      }

      return var2 == null ? null : var2;
   }

   static void method1957(int var0) {
      class54 var1 = (class54)class54.field534.method4224((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.field533.length; ++var2) {
            var1.field533[var2] = -1;
            var1.field532[var2] = 0;
         }

      }
   }

   static final void method1950(class232 var0, int var1, int var2) {
      if (var0.field2670 == 1) {
         class79.method2039(var0.field2790, "", 24, 0, 0, var0.field2770);
      }

      String var3;
      if (var0.field2670 == 2 && !client.field798) {
         var3 = class86.method2167(var0);
         if (var3 != null) {
            class79.method2039(var3, class128.method3233(65280) + var0.field2677, 25, 0, -1, var0.field2770);
         }
      }

      if (var0.field2670 == 3) {
         class79.method2039("Close", "", 26, 0, 0, var0.field2770);
      }

      if (var0.field2670 == 4) {
         class79.method2039(var0.field2790, "", 28, 0, 0, var0.field2770);
      }

      if (var0.field2670 == 5) {
         class79.method2039(var0.field2790, "", 29, 0, 0, var0.field2770);
      }

      if (var0.field2670 == 6 && client.field880 == null) {
         class79.method2039(var0.field2790, "", 30, 0, -1, var0.field2770);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      int var15;
      if (var0.field2808 == 2) {
         var15 = 0;

         for(var4 = 0; var4 < var0.field2683; ++var4) {
            for(var5 = 0; var5 < var0.field2682; ++var5) {
               var6 = (var0.field2734 + 32) * var5;
               var7 = (var0.field2708 + 32) * var4;
               if (var15 < 20) {
                  var6 += var0.field2726[var15];
                  var7 += var0.field2737[var15];
               }

               if (var1 >= var6 && var2 >= var7 && var1 < var6 + 32 && var2 < var7 + 32) {
                  client.field797 = var15;
                  class13.field104 = var0;
                  if (var0.field2762[var15] > 0) {
                     class271 var8 = class84.method2125(var0.field2762[var15] - 1);
                     if (client.field796 == 1 && class172.method3662(class254.method5000(var0))) {
                        if (var0.field2770 != class88.field1276 || var15 != class22.field220) {
                           class79.method2039("Use", client.field766 + " " + "->" + " " + class128.method3233(16748608) + var8.field3515, 31, var8.field3557, var15, var0.field2770);
                        }
                     } else if (client.field798 && class172.method3662(class254.method5000(var0))) {
                        if ((class297.field3740 & 16) == 16) {
                           class79.method2039(client.field801, client.field716 + " " + "->" + " " + class128.method3233(16748608) + var8.field3515, 32, var8.field3557, var15, var0.field2770);
                        }
                     } else {
                        String[] var9 = var8.field3541;
                        int var10 = -1;
                        boolean var11;
                        if (client.field789) {
                           var11 = client.field790 || class39.field380[81];
                           if (var11) {
                              var10 = var8.method5336();
                           }
                        }

                        if (class172.method3662(class254.method5000(var0))) {
                           for(int var22 = 4; var22 >= 3; --var22) {
                              if (var10 != var22) {
                                 class13.method142(var0, var8, var15, var22, false);
                              }
                           }
                        }

                        int var12 = class254.method5000(var0);
                        var11 = (var12 >> 31 & 1) != 0;
                        if (var11) {
                           class79.method2039("Use", class128.method3233(16748608) + var8.field3515, 38, var8.field3557, var15, var0.field2770);
                        }

                        Object var10000 = null;
                        int var13;
                        if (class172.method3662(class254.method5000(var0))) {
                           for(var13 = 2; var13 >= 0; --var13) {
                              if (var13 != var10) {
                                 class13.method142(var0, var8, var15, var13, false);
                              }
                           }

                           if (var10 >= 0) {
                              class13.method142(var0, var8, var15, var10, true);
                           }
                        }

                        var9 = var0.field2739;
                        if (var9 != null) {
                           for(var13 = 4; var13 >= 0; --var13) {
                              if (var9[var13] != null) {
                                 byte var14 = 0;
                                 if (var13 == 0) {
                                    var14 = 39;
                                 }

                                 if (var13 == 1) {
                                    var14 = 40;
                                 }

                                 if (var13 == 2) {
                                    var14 = 41;
                                 }

                                 if (var13 == 3) {
                                    var14 = 42;
                                 }

                                 if (var13 == 4) {
                                    var14 = 43;
                                 }

                                 class79.method2039(var9[var13], class128.method3233(16748608) + var8.field3515, var14, var8.field3557, var15, var0.field2770);
                              }
                           }
                        }

                        class79.method2039("Examine", class128.method3233(16748608) + var8.field3515, 1005, var8.field3557, var15, var0.field2770);
                     }
                  }
               }

               ++var15;
            }
         }
      }

      if (var0.field2685) {
         if (client.field798) {
            var4 = class254.method5000(var0);
            boolean var23 = (var4 >> 21 & 1) != 0;
            if (var23 && (class297.field3740 & 32) == 32) {
               class79.method2039(client.field801, client.field716 + " " + "->" + " " + var0.field2697, 58, 0, var0.field2787, var0.field2770);
            }
         } else {
            for(var15 = 9; var15 >= 5; --var15) {
               var6 = class254.method5000(var0);
               boolean var19 = (var6 >> var15 + 1 & 1) != 0;
               String var16;
               if (!var19 && var0.field2773 == null) {
                  var16 = null;
               } else if (var0.field2731 != null && var0.field2731.length > var15 && var0.field2731[var15] != null && var0.field2731[var15].trim().length() != 0) {
                  var16 = var0.field2731[var15];
               } else {
                  var16 = null;
               }

               if (var16 != null) {
                  class79.method2039(var16, var0.field2697, 1007, var15 + 1, var0.field2787, var0.field2770);
               }
            }

            var3 = class86.method2167(var0);
            if (var3 != null) {
               class79.method2039(var3, var0.field2697, 25, 0, var0.field2787, var0.field2770);
            }

            for(var4 = 4; var4 >= 0; --var4) {
               var7 = class254.method5000(var0);
               boolean var21 = (var7 >> var4 + 1 & 1) != 0;
               String var17;
               if (!var21 && var0.field2773 == null) {
                  var17 = null;
               } else if (var0.field2731 != null && var0.field2731.length > var4 && var0.field2731[var4] != null && var0.field2731[var4].trim().length() != 0) {
                  var17 = var0.field2731[var4];
               } else {
                  var17 = null;
               }

               if (var17 != null) {
                  class79.method2039(var17, var0.field2697, 57, var4 + 1, var0.field2787, var0.field2770);
               }
            }

            var5 = class254.method5000(var0);
            boolean var20 = (var5 & 1) != 0;
            if (var20) {
               class79.method2039("Continue", "", 30, 0, var0.field2787, var0.field2770);
            }
         }
      }

   }
}
