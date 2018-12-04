public class class66 {
   static int field1026;
   static class66[] field1017;
   static int field1013 = 0;
   static int field1014 = 0;
   static int[] field1018 = new int[]{1, 1, 1, 1};
   static int[] field1016 = new int[]{0, 1, 2, 3};
   static class138 field1010;
   static class232 field1025;
   int field1015;
   int field1008;
   int field1020;
   String field1019;
   String field1022;
   int field1021;
   int field1024;

   boolean method1684() {
      return (1 & this.field1008) != 0;
   }

   boolean method1734() {
      return (2 & this.field1008) != 0;
   }

   boolean method1687() {
      return (4 & this.field1008) != 0;
   }

   boolean method1731() {
      return (8 & this.field1008) != 0;
   }

   boolean method1689() {
      return (536870912 & this.field1008) != 0;
   }

   boolean method1686() {
      return (33554432 & this.field1008) != 0;
   }

   public static class173[] method1733() {
      return new class173[]{class173.field2323, class173.field2316, class173.field2318, class173.field2319, class173.field2320, class173.field2321, class173.field2322, class173.field2317, class173.field2329, class173.field2325};
   }

   static final void method1696() {
      int var0 = class83.field1226;
      int[] var1 = class83.field1222;

      for(int var2 = 0; var2 < var0; ++var2) {
         class61 var3 = client.field698[var1[var2]];
         if (var3 != null) {
            class148.method3370(var3, 1);
         }
      }

   }

   static void method1735() {
      if (client.field762) {
         class61.method1207(class69.field1063, false);
      }

   }

   static boolean method1727() {
      return (client.field676 & 4) != 0;
   }

   static final void method1707(int var0, int var1, int var2, int var3) {
      if (client.field796 == 0 && !client.field798) {
         class79.method2039("Walk here", "", 23, 0, var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      long var6 = -1L;
      int var8 = 0;

      while(true) {
         int var10 = class122.field1713;
         if (var8 >= var10) {
            if (-1L != var4) {
               var8 = class22.method334(var4);
               int var9 = class85.method2126(var4);
               class61 var26 = client.field698[client.field769];
               class141.method3314(var26, client.field769, var8, var9);
            }

            return;
         }

         long var11 = class122.field1714[var8];
         if (var6 != var11) {
            label333: {
               var6 = var11;
               int var15 = class294.method5727(var8);
               int var16 = class85.method2126(class122.field1714[var8]);
               int var17 = var16;
               int var18 = class35.method654(var8);
               int var19 = class15.method179(var8);
               if (var18 == 2 && class243.field3173.method3087(class60.field599, var15, var16, var11) >= 0) {
                  class270 var20 = class253.method4993(var19);
                  if (var20.field3480 != null) {
                     var20 = var20.method5279();
                  }

                  if (var20 == null) {
                     break label333;
                  }

                  if (client.field796 == 1) {
                     class79.method2039("Use", client.field766 + " " + "->" + " " + class128.method3233(65535) + var20.field3461, 1, var19, var15, var16);
                  } else if (client.field798) {
                     if ((class297.field3740 & 4) == 4) {
                        class79.method2039(client.field801, client.field716 + " " + "->" + " " + class128.method3233(65535) + var20.field3461, 2, var19, var15, var16);
                     }
                  } else {
                     String[] var27 = var20.field3478;
                     if (var27 != null) {
                        for(int var28 = 4; var28 >= 0; --var28) {
                           if (var27[var28] != null) {
                              short var23 = 0;
                              if (var28 == 0) {
                                 var23 = 3;
                              }

                              if (var28 == 1) {
                                 var23 = 4;
                              }

                              if (var28 == 2) {
                                 var23 = 5;
                              }

                              if (var28 == 3) {
                                 var23 = 6;
                              }

                              if (var28 == 4) {
                                 var23 = 1001;
                              }

                              class79.method2039(var27[var28], class128.method3233(65535) + var20.field3461, var23, var19, var15, var17);
                           }
                        }
                     }

                     class79.method2039("Examine", class128.method3233(65535) + var20.field3461, 1002, var20.field3469, var15, var17);
                  }
               }

               int var21;
               class73 var22;
               class61 var24;
               int[] var34;
               int var36;
               if (var18 == 1) {
                  class73 var31 = client.field806[var19];
                  if (var31 == null) {
                     break label333;
                  }

                  if (var31.field1102.field3600 == 1 && (var31.field953 & 127) == 64 && (var31.field999 & 127) == 64) {
                     for(var21 = 0; var21 < client.field686; ++var21) {
                        var22 = client.field806[client.field687[var21]];
                        if (var22 != null && var22 != var31 && var22.field1102.field3600 == 1 && var22.field953 == var31.field953 && var22.field999 == var31.field999) {
                           class67.method1741(var22.field1102, client.field687[var21], var15, var17);
                        }
                     }

                     var21 = class83.field1226;
                     var34 = class83.field1222;

                     for(var36 = 0; var36 < var21; ++var36) {
                        var24 = client.field698[var34[var36]];
                        if (var24 != null && var24.field953 == var31.field953 && var31.field999 == var24.field999) {
                           class141.method3314(var24, var34[var36], var15, var17);
                        }
                     }
                  }

                  class67.method1741(var31.field1102, var19, var15, var17);
               }

               if (var18 == 0) {
                  class61 var32 = client.field698[var19];
                  if (var32 == null) {
                     break label333;
                  }

                  if ((var32.field953 & 127) == 64 && (var32.field999 & 127) == 64) {
                     for(var21 = 0; var21 < client.field686; ++var21) {
                        var22 = client.field806[client.field687[var21]];
                        if (var22 != null && var22.field1102.field3600 == 1 && var32.field953 == var22.field953 && var32.field999 == var22.field999) {
                           class67.method1741(var22.field1102, client.field687[var21], var15, var17);
                        }
                     }

                     var21 = class83.field1226;
                     var34 = class83.field1222;

                     for(var36 = 0; var36 < var21; ++var36) {
                        var24 = client.field698[var34[var36]];
                        if (var24 != null && var32 != var24 && var24.field953 == var32.field953 && var24.field999 == var32.field999) {
                           class141.method3314(var24, var34[var36], var15, var17);
                        }
                     }
                  }

                  if (var19 != client.field769) {
                     class141.method3314(var32, var19, var15, var17);
                  } else {
                     var4 = var11;
                  }
               }

               if (var18 == 3) {
                  class207 var33 = client.field829[class60.field599][var15][var17];
                  if (var33 != null) {
                     for(class81 var37 = (class81)var33.method4274(); var37 != null; var37 = (class81)var33.method4295()) {
                        class271 var35 = class84.method2125(var37.field1213);
                        if (client.field796 == 1) {
                           class79.method2039("Use", client.field766 + " " + "->" + " " + class128.method3233(16748608) + var35.field3515, 16, var37.field1213, var15, var17);
                        } else if (client.field798) {
                           if ((class297.field3740 & 1) == 1) {
                              class79.method2039(client.field801, client.field716 + " " + "->" + " " + class128.method3233(16748608) + var35.field3515, 17, var37.field1213, var15, var17);
                           }
                        } else {
                           String[] var29 = var35.field3526;

                           for(int var30 = 4; var30 >= 0; --var30) {
                              if (var29 != null && var29[var30] != null) {
                                 byte var25 = 0;
                                 if (var30 == 0) {
                                    var25 = 18;
                                 }

                                 if (var30 == 1) {
                                    var25 = 19;
                                 }

                                 if (var30 == 2) {
                                    var25 = 20;
                                 }

                                 if (var30 == 3) {
                                    var25 = 21;
                                 }

                                 if (var30 == 4) {
                                    var25 = 22;
                                 }

                                 class79.method2039(var29[var30], class128.method3233(16748608) + var35.field3515, var25, var37.field1213, var15, var17);
                              } else if (var30 == 2) {
                                 class79.method2039("Take", class128.method3233(16748608) + var35.field3515, 20, var37.field1213, var15, var17);
                              }
                           }

                           class79.method2039("Examine", class128.method3233(16748608) + var35.field3515, 1004, var37.field1213, var15, var17);
                        }
                     }
                  }
               }
            }
         }

         ++var8;
      }
   }
}
