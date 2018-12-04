import java.util.Hashtable;

public class class160 {
   static boolean field2043 = false;
   static Hashtable field2040 = new Hashtable(16);

   static final void method3502() {
      if (class6.field46 != null) {
         class6.field46.method2346();
      }

      if (client.field882 != null) {
         client.field882.method2346();
      }

   }

   static final void method3500(class173 var0) {
      class191 var1 = client.field690.field1283;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (class173.field2319 == var0) {
         var2 = var1.method3771();
         var3 = var1.method3883();
         var4 = var1.method3808();
         var5 = var1.method3983();
         var6 = (var5 >> 4 & 7) + class187.field2433;
         var7 = (var5 & 7) + class72.field1100;
         if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            var6 = var6 * 128 + 64;
            var7 = var7 * 128 + 64;
            class71 var39 = new class71(var2, class60.field599, var6, var7, class152.method3394(var6, var7, class60.field599) - var3, var4, client.field655);
            client.field711.method4276(var39);
         }

      } else {
         int var31;
         if (class173.field2322 == var0) {
            var2 = var1.method3891();
            var3 = var2 >> 2;
            var4 = var2 & 3;
            var5 = client.field704[var3];
            var6 = var1.method3891();
            var7 = (var6 >> 4 & 7) + class187.field2433;
            var31 = (var6 & 7) + class72.field1100;
            if (var7 >= 0 && var31 >= 0 && var7 < 104 && var31 < 104) {
               class234.method4770(class60.field599, var7, var31, var5, -1, var3, var4, 0, -1);
            }

         } else if (class173.field2323 == var0) {
            var2 = var1.method3807();
            var3 = var1.method3792();
            var4 = var1.method3807();
            var5 = var1.method3883();
            var6 = (var5 >> 4 & 7) + class187.field2433;
            var7 = (var5 & 7) + class72.field1100;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
               class207 var8 = client.field829[class60.field599][var6][var7];
               if (var8 != null) {
                  for(class81 var9 = (class81)var8.method4298(); var9 != null; var9 = (class81)var8.method4283()) {
                     if ((var2 & 32767) == var9.field1213 && var4 == var9.field1214) {
                        var9.field1214 = var3;
                        break;
                     }
                  }

                  class238.method4784(var6, var7);
               }
            }

         } else {
            int var32;
            if (class173.field2325 == var0) {
               var2 = var1.method3883();
               var3 = (var2 >> 4 & 7) + class187.field2433;
               var4 = (var2 & 7) + class72.field1100;
               var5 = var1.method3891();
               var6 = var5 >> 2;
               var7 = var5 & 3;
               var31 = client.field704[var6];
               var32 = var1.method3808();
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  class234.method4770(class60.field599, var3, var4, var31, var32, var6, var7, 0, -1);
               }

            } else {
               int var10;
               if (class173.field2321 == var0) {
                  var2 = var1.method3983();
                  var3 = (var2 >> 4 & 7) + class187.field2433;
                  var4 = (var2 & 7) + class72.field1100;
                  var5 = var1.method3891();
                  var6 = var1.method3883();
                  var7 = var6 >> 4 & 15;
                  var31 = var6 & 7;
                  var32 = var1.method3792();
                  if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                     var10 = var7 + 1;
                     if (class69.field1063.field994[0] >= var3 - var10 && class69.field1063.field994[0] <= var10 + var3 && class69.field1063.field952[0] >= var4 - var10 && class69.field1063.field952[0] <= var4 + var10 && client.field881 != 0 && var31 > 0 && client.field905 < 50) {
                        client.field884[client.field905] = var32;
                        client.field885[client.field905] = var31;
                        client.field793[client.field905] = var5;
                        client.field710[client.field905] = null;
                        client.field887[client.field905] = var7 + (var4 << 8) + (var3 << 16);
                        ++client.field905;
                     }
                  }
               }

               int var40;
               if (class173.field2320 == var0) {
                  var2 = var1.method3891();
                  var3 = var2 >> 2;
                  var4 = var2 & 3;
                  var5 = client.field704[var3];
                  var6 = var1.method3799();
                  var7 = (var6 >> 4 & 7) + class187.field2433;
                  var31 = (var6 & 7) + class72.field1100;
                  var32 = var1.method3771();
                  if (var7 >= 0 && var31 >= 0 && var7 < 103 && var31 < 103) {
                     if (var5 == 0) {
                        class130 var33 = class243.field3173.method3107(class60.field599, var7, var31);
                        if (var33 != null) {
                           var40 = class56.method1110(var33.field1848);
                           if (var3 == 2) {
                              var33.field1846 = new class87(var40, 2, var4 + 4, class60.field599, var7, var31, var32, false, var33.field1846);
                              var33.field1847 = new class87(var40, 2, var4 + 1 & 3, class60.field599, var7, var31, var32, false, var33.field1847);
                           } else {
                              var33.field1846 = new class87(var40, var3, var4, class60.field599, var7, var31, var32, false, var33.field1846);
                           }
                        }
                     }

                     if (var5 == 1) {
                        class135 var43 = class243.field3173.method3230(class60.field599, var7, var31);
                        if (var43 != null) {
                           var40 = class56.method1110(var43.field1880);
                           if (var3 != 4 && var3 != 5) {
                              if (var3 == 6) {
                                 var43.field1887 = new class87(var40, 4, var4 + 4, class60.field599, var7, var31, var32, false, var43.field1887);
                              } else if (var3 == 7) {
                                 var43.field1887 = new class87(var40, 4, (var4 + 2 & 3) + 4, class60.field599, var7, var31, var32, false, var43.field1887);
                              } else if (var3 == 8) {
                                 var43.field1887 = new class87(var40, 4, var4 + 4, class60.field599, var7, var31, var32, false, var43.field1887);
                                 var43.field1888 = new class87(var40, 4, (var4 + 2 & 3) + 4, class60.field599, var7, var31, var32, false, var43.field1888);
                              }
                           } else {
                              var43.field1887 = new class87(var40, 4, var4, class60.field599, var7, var31, var32, false, var43.field1887);
                           }
                        }
                     }

                     if (var5 == 2) {
                        class136 var44 = class243.field3173.method3081(class60.field599, var7, var31);
                        if (var3 == 11) {
                           var3 = 10;
                        }

                        if (var44 != null) {
                           var44.field1896 = new class87(class56.method1110(var44.field1904), var3, var4, class60.field599, var7, var31, var32, false, var44.field1896);
                        }
                     }

                     if (var5 == 3) {
                        class117 var45 = class243.field3173.method3117(class60.field599, var7, var31);
                        if (var45 != null) {
                           var45.field1586 = new class87(class56.method1110(var45.field1587), 22, var4, class60.field599, var7, var31, var32, false, var45.field1586);
                        }
                     }
                  }

               } else {
                  int var12;
                  byte var13;
                  int var14;
                  if (class173.field2316 == var0) {
                     var2 = var1.method3891() * 4;
                     var3 = var1.method3771();
                     var4 = var1.method3808();
                     var5 = var1.method3891() * 4;
                     var6 = var1.method3810();
                     var7 = var1.method3983();
                     var31 = var1.method3891();
                     var32 = var1.method3807();
                     var10 = var1.method3883();
                     var40 = (var10 >> 4 & 7) + class187.field2433;
                     var12 = (var10 & 7) + class72.field1100;
                     var13 = var1.method3968();
                     byte var41 = var1.method3802();
                     var14 = var41 + var40;
                     int var42 = var13 + var12;
                     if (var40 >= 0 && var12 >= 0 && var40 < 104 && var12 < 104 && var14 >= 0 && var42 >= 0 && var14 < 104 && var42 < 104 && var4 != 65535) {
                        var40 = var40 * 128 + 64;
                        var12 = var12 * 128 + 64;
                        var14 = var14 * 128 + 64;
                        var42 = var42 * 128 + 64;
                        class80 var15 = new class80(var4, class60.field599, var40, var12, class152.method3394(var40, var12, class60.field599) - var5, var32 + client.field655, var3 + client.field655, var7, var31, var6, var2);
                        var15.method2042(var14, var42, class152.method3394(var14, var42, class60.field599) - var2, var32 + client.field655);
                        client.field773.method4276(var15);
                     }

                  } else {
                     class81 var35;
                     if (class173.field2317 == var0) {
                        var2 = var1.method3883();
                        var3 = (var2 >> 4 & 7) + class187.field2433;
                        var4 = (var2 & 7) + class72.field1100;
                        var5 = var1.method3792();
                        if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                           class207 var34 = client.field829[class60.field599][var3][var4];
                           if (var34 != null) {
                              for(var35 = (class81)var34.method4298(); var35 != null; var35 = (class81)var34.method4283()) {
                                 if ((var5 & 32767) == var35.field1213) {
                                    var35.method4271();
                                    break;
                                 }
                              }

                              if (var34.method4298() == null) {
                                 client.field829[class60.field599][var3][var4] = null;
                              }

                              class238.method4784(var3, var4);
                           }
                        }

                     } else {
                        if (class173.field2318 == var0) {
                           byte var37 = var1.method3802();
                           var3 = var1.method3792();
                           byte var38 = var1.method3802();
                           var5 = var1.method3808();
                           var6 = var1.method3771();
                           var7 = var1.method3883();
                           var31 = var7 >> 2;
                           var32 = var7 & 3;
                           var10 = client.field704[var31];
                           byte var11 = var1.method3968();
                           var12 = var1.method3807();
                           var13 = var1.method3802();
                           var14 = var1.method3799();
                           int var36 = (var14 >> 4 & 7) + class187.field2433;
                           int var16 = (var14 & 7) + class72.field1100;
                           class61 var17;
                           if (var12 == client.field747) {
                              var17 = class69.field1063;
                           } else {
                              var17 = client.field698[var12];
                           }

                           if (var17 != null) {
                              class270 var18 = class253.method4993(var5);
                              int var19;
                              int var20;
                              if (var32 != 1 && var32 != 3) {
                                 var19 = var18.field3501;
                                 var20 = var18.field3475;
                              } else {
                                 var19 = var18.field3475;
                                 var20 = var18.field3501;
                              }

                              int var21 = var36 + (var19 >> 1);
                              int var22 = var36 + (var19 + 1 >> 1);
                              int var23 = var16 + (var20 >> 1);
                              int var24 = var16 + (var20 + 1 >> 1);
                              int[][] var25 = class50.field506[class60.field599];
                              int var26 = var25[var22][var24] + var25[var22][var23] + var25[var21][var23] + var25[var21][var24] >> 2;
                              int var27 = (var36 << 7) + (var19 << 6);
                              int var28 = (var16 << 7) + (var20 << 6);
                              class121 var29 = var18.method5276(var31, var32, var25, var27, var26, var28);
                              if (var29 != null) {
                                 class234.method4770(class60.field599, var36, var16, var10, -1, 0, 0, var6 + 1, var3 + 1);
                                 var17.field614 = var6 + client.field655;
                                 var17.field615 = var3 + client.field655;
                                 var17.field619 = var29;
                                 var17.field616 = var36 * 128 + var19 * 64;
                                 var17.field612 = var16 * 128 + var20 * 64;
                                 var17.field610 = var26;
                                 byte var30;
                                 if (var37 > var13) {
                                    var30 = var37;
                                    var37 = var13;
                                    var13 = var30;
                                 }

                                 if (var11 > var38) {
                                    var30 = var11;
                                    var11 = var38;
                                    var38 = var30;
                                 }

                                 var17.field608 = var36 + var37;
                                 var17.field621 = var36 + var13;
                                 var17.field606 = var11 + var16;
                                 var17.field623 = var38 + var16;
                              }
                           }
                        }

                        if (class173.field2329 == var0) {
                           var2 = var1.method3808();
                           var3 = var1.method3792();
                           var4 = var1.method3883();
                           var5 = (var4 >> 4 & 7) + class187.field2433;
                           var6 = (var4 & 7) + class72.field1100;
                           if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                              var35 = new class81();
                              var35.field1213 = var3;
                              var35.field1214 = var2;
                              if (client.field829[class60.field599][var5][var6] == null) {
                                 client.field829[class60.field599][var5][var6] = new class207();
                              }

                              client.field829[class60.field599][var5][var6].method4276(var35);
                              class238.method4784(var5, var6);
                           }

                        }
                     }
                  }
               }
            }
         }
      }
   }

   static final void method3504(int var0) {
      if (class189.method4028(var0)) {
         class232[] var1 = class145.field1951[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class232 var3 = var1[var2];
            if (var3 != null) {
               var3.field2795 = 0;
               var3.field2750 = 0;
            }
         }

      }
   }
}
