public class class68 {
   public static int field1038;
   final class330 field1043;
   public final class292 field1040;
   public final class286 field1041;
   int field1042 = 0;

   class68(class330 var1) {
      this.field1043 = var1;
      this.field1040 = new class292(var1);
      this.field1041 = new class286(var1);
   }

   boolean method1751() {
      return this.field1042 == 2;
   }

   final void method1804() {
      this.field1042 = 1;
   }

   final void method1753(class184 var1, int var2) {
      this.field1040.method5693(var1, var2);
      this.field1042 = 2;
      class250.method4920();
   }

   final void method1823() {
      for(class296 var1 = (class296)this.field1040.field3717.method4317(); var1 != null; var1 = (class296)this.field1040.field3717.method4318()) {
         if ((long)var1.field3736 < class120.method2866() / 1000L - 5L) {
            if (var1.field3735 > 0) {
               class59.method1163(5, "", var1.field3734 + " has logged in.");
            }

            if (var1.field3735 == 0) {
               class59.method1163(5, "", var1.field3734 + " has logged out.");
            }

            var1.method4323();
         }
      }

   }

   final void method1755() {
      this.field1042 = 0;
      this.field1040.method5585();
      this.field1041.method5585();
   }

   final boolean method1776(class293 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class69.field1063.field625)) {
         return true;
      } else {
         return this.field1040.method5692(var1, var2);
      }
   }

   final boolean method1803(class293 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field1041.method5608(var1);
      }
   }

   final void method1758(String var1) {
      if (var1 != null) {
         class293 var2 = new class293(var1, this.field1043);
         if (var2.method5707()) {
            if (this.method1759()) {
               class221.method4527();
            } else if (class69.field1063.field625.equals(var2)) {
               class223.method4593();
            } else if (this.method1776(var2, false)) {
               class18.method237(var1);
            } else if (this.method1803(var2)) {
               class34.method643("Please remove " + var1 + " from your ignore list first");
            } else {
               class255.method5016(var1);
            }
         }
      }
   }

   final boolean method1759() {
      return this.field1040.method5587() || this.field1040.method5586() >= 200 && client.field761 != 1;
   }

   final void method1760(String var1) {
      if (var1 != null) {
         class293 var2 = new class293(var1, this.field1043);
         if (var2.method5707()) {
            if (this.method1761()) {
               class34.method643("Your ignore list is full. Max of 100 for free users, and 400 for members");
            } else if (class69.field1063.field625.equals(var2)) {
               class34.method643("You can't add yourself to your own ignore list");
            } else if (this.method1803(var2)) {
               class172.method3664(var1);
            } else if (this.method1776(var2, false)) {
               class20.method318(var1);
            } else {
               class174 var3 = class131.method3243(class171.field2297, client.field690.field1282);
               var3.field2332.method3805(class97.method2404(var1));
               var3.field2332.method3889(var1);
               client.field690.method2193(var3);
            }
         }
      }
   }

   final boolean method1761() {
      return this.field1041.method5587() || this.field1041.method5586() >= 100 && client.field761 != 1;
   }

   final void method1762(String var1) {
      if (var1 != null) {
         class293 var2 = new class293(var1, this.field1043);
         if (var2.method5707()) {
            if (this.field1040.method5592(var2)) {
               client.field836 = client.field828;
               class174 var3 = class131.method3243(class171.field2231, client.field690.field1282);
               var3.field2332.method3805(class97.method2404(var1));
               var3.field2332.method3889(var1);
               client.field690.method2193(var3);
            }

            class250.method4920();
         }
      }
   }

   final void method1780(String var1) {
      if (var1 != null) {
         class293 var2 = new class293(var1, this.field1043);
         if (var2.method5707()) {
            if (this.field1041.method5592(var2)) {
               client.field836 = client.field828;
               class174 var3 = class131.method3243(class171.field2235, client.field690.field1282);
               var3.field2332.method3805(class97.method2404(var1));
               var3.field2332.method3889(var1);
               client.field690.method2193(var3);
            }

            class2.method20();
         }
      }
   }

   final boolean method1764(class293 var1) {
      class294 var2 = (class294)this.field1040.method5589(var1);
      return var2 != null && var2.method5681();
   }

   static void method1827(int var0, byte[] var1, class164 var2) {
      class247 var3 = new class247();
      var3.field3213 = 0;
      var3.field2496 = (long)var0;
      var3.field3212 = var1;
      var3.field3215 = var2;
      class207 var4 = class250.field3242;
      synchronized(class250.field3242) {
         class250.field3242.method4276(var3);
      }

      Object var9 = class250.field3241;
      synchronized(class250.field3241) {
         if (class250.field3243 == 0) {
            class250.field3245 = new Thread(new class250());
            class250.field3245.setDaemon(true);
            class250.field3245.start();
            class250.field3245.setPriority(5);
         }

         class250.field3243 = 600;
      }
   }

   static void method1826() {
      class23.field235.method4219();
      class23.field232.method4219();
   }

   public static class322 method1763(class249 var0, int var1) {
      byte[] var3 = var0.method4835(var1);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         class125.method3051(var3);
         var2 = true;
      }

      return !var2 ? null : class274.method5439();
   }

   static final void method1798(class232 var0, int var1, int var2, int var3) {
      if (var0.field2765 == null) {
         throw new RuntimeException();
      } else {
         var0.field2765[var1] = var2;
         var0.field2745[var1] = var3;
      }
   }

   static final void method1828(class64 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.vmethod1973()) {
         if (var0 instanceof class73) {
            class273 var6 = ((class73)var0).field1102;
            if (var6.field3595 != null) {
               var6 = var6.method5397();
            }

            if (var6 == null) {
               return;
            }
         }

         int var75 = class83.field1226;
         int[] var7 = class83.field1222;
         byte var8 = 0;
         if (var1 < var75 && var0.field943 == client.field655 && class157.method3456((class61)var0)) {
            class61 var9 = (class61)var0;
            if (var1 < var75) {
               class33.method612(var0, var0.field946 + 15);
               class301 var10 = (class301)client.field695.get(class297.field3738);
               byte var11 = 9;
               var10.method5880(var9.field625.method5706(), var2 + client.field652, var3 + client.field903 - var11, 16777215, 0);
               var8 = 18;
            }
         }

         int var76 = -2;
         int var15;
         int var22;
         int var23;
         if (!var0.field987.method4249()) {
            class33.method612(var0, var0.field946 + 15);

            for(class72 var87 = (class72)var0.field987.method4250(); var87 != null; var87 = (class72)var0.field987.method4248()) {
               class65 var77 = var87.method1960(client.field655);
               if (var77 == null) {
                  if (var87.method1965()) {
                     var87.method4271();
                  }
               } else {
                  class263 var12 = var87.field1097;
                  class323 var13 = var12.method5150();
                  class323 var14 = var12.method5149();
                  int var16 = 0;
                  if (var13 != null && var14 != null) {
                     if (var12.field3393 * 2 < var14.field3879) {
                        var16 = var12.field3393;
                     }

                     var15 = var14.field3879 - var16 * 2;
                  } else {
                     var15 = var12.field3392;
                  }

                  int var17 = 255;
                  boolean var18 = true;
                  int var19 = client.field655 - var77.field1006;
                  int var20 = var15 * var77.field1002 / var12.field3392;
                  int var21;
                  int var92;
                  if (var77.field1003 > var19) {
                     var21 = var12.field3381 == 0 ? 0 : var12.field3381 * (var19 / var12.field3381);
                     var22 = var15 * var77.field1004 / var12.field3392;
                     var92 = var21 * (var20 - var22) / var77.field1003 + var22;
                  } else {
                     var92 = var20;
                     var21 = var77.field1003 + var12.field3387 - var19;
                     if (var12.field3394 >= 0) {
                        var17 = (var21 << 8) / (var12.field3387 - var12.field3394);
                     }
                  }

                  if (var77.field1002 > 0 && var92 < 1) {
                     var92 = 1;
                  }

                  if (var13 != null && var14 != null) {
                     if (var92 == var15) {
                        var92 += var16 * 2;
                     } else {
                        var92 += var16;
                     }

                     var21 = var13.field3887;
                     var76 += var21;
                     var22 = var2 + client.field652 - (var15 >> 1);
                     var23 = var3 + client.field903 - var76;
                     var22 -= var16;
                     if (var17 >= 0 && var17 < 255) {
                        var13.method6170(var22, var23, var17);
                        class319.method6041(var22, var23, var22 + var92, var21 + var23);
                        var14.method6170(var22, var23, var17);
                     } else {
                        var13.method6164(var22, var23);
                        class319.method6041(var22, var23, var22 + var92, var21 + var23);
                        var14.method6164(var22, var23);
                     }

                     class319.method6067(var2, var3, var2 + var4, var3 + var5);
                     var76 += 2;
                  } else {
                     var76 += 5;
                     if (client.field652 > -1) {
                        var21 = var2 + client.field652 - (var15 >> 1);
                        var22 = var3 + client.field903 - var76;
                        class319.method6047(var21, var22, var92, 5, 65280);
                        class319.method6047(var92 + var21, var22, var15 - var92, 5, 16711680);
                     }

                     var76 += 2;
                  }
               }
            }
         }

         if (var76 == -2) {
            var76 += 7;
         }

         var76 += var8;
         if (var1 < var75) {
            class61 var88 = (class61)var0;
            if (var88.field626) {
               return;
            }

            if (var88.field629 != -1 || var88.field609 != -1) {
               class33.method612(var0, var0.field946 + 15);
               if (client.field652 > -1) {
                  if (var88.field629 != -1) {
                     var76 += 25;
                     class61.field635[var88.field629].method6164(var2 + client.field652 - 12, var3 + client.field903 - var76);
                  }

                  if (var88.field609 != -1) {
                     var76 += 25;
                     class137.field1913[var88.field609].method6164(var2 + client.field652 - 12, var3 + client.field903 - var76);
                  }
               }
            }

            if (var1 >= 0 && client.field663 == 10 && var7[var1] == client.field665) {
               class33.method612(var0, var0.field946 + 15);
               if (client.field652 > -1) {
                  var76 += class49.field489[1].field3887;
                  class49.field489[1].method6164(var2 + client.field652 - 12, var3 + client.field903 - var76);
               }
            }
         } else {
            class273 var89 = ((class73)var0).field1102;
            if (var89.field3595 != null) {
               var89 = var89.method5397();
            }

            if (var89.field3592 >= 0 && var89.field3592 < class137.field1913.length) {
               class33.method612(var0, var0.field946 + 15);
               if (client.field652 > -1) {
                  class137.field1913[var89.field3592].method6164(var2 + client.field652 - 12, var3 + client.field903 - 30);
               }
            }

            if (client.field663 == 1 && client.field687[var1 - var75] == client.field664 && client.field655 % 20 < 10) {
               class33.method612(var0, var0.field946 + 15);
               if (client.field652 > -1) {
                  class49.field489[0].method6164(var2 + client.field652 - 12, var3 + client.field903 - 28);
               }
            }
         }

         if (var0.field968 != null && (var1 >= var75 || !var0.field954 && (client.field730 == 4 || !var0.field958 && (client.field730 == 0 || client.field730 == 3 || client.field730 == 1 && ((class61)var0).method1173())))) {
            class33.method612(var0, var0.field946);
            if (client.field652 > -1 && client.field912 < client.field731) {
               client.field757[client.field912] = class163.field2066.method5793(var0.field968) / 2;
               client.field738[client.field912] = class163.field2066.field3765;
               client.field732[client.field912] = client.field652;
               client.field733[client.field912] = client.field903;
               client.field736[client.field912] = var0.field956;
               client.field737[client.field912] = var0.field974;
               client.field818[client.field912] = var0.field981;
               client.field739[client.field912] = var0.field968;
               ++client.field912;
            }
         }

         for(int var78 = 0; var78 < 4; ++var78) {
            int var90 = var0.field961[var78];
            int var79 = var0.field992[var78];
            class269 var91 = null;
            int var80 = 0;
            if (var79 >= 0) {
               if (var90 <= client.field655) {
                  continue;
               }

               var91 = class221.method4528(var0.field992[var78]);
               var80 = var91.field3428;
               if (var91 != null && var91.field3443 != null) {
                  var91 = var91.method5268();
                  if (var91 == null) {
                     var0.field961[var78] = -1;
                     continue;
                  }
               }
            } else if (var90 < 0) {
               continue;
            }

            var15 = var0.field962[var78];
            class269 var81 = null;
            if (var15 >= 0) {
               var81 = class221.method4528(var15);
               if (var81 != null && var81.field3443 != null) {
                  var81 = var81.method5268();
               }
            }

            if (var90 - var80 <= client.field655) {
               if (var91 == null) {
                  var0.field961[var78] = -1;
               } else {
                  class33.method612(var0, var0.field946 / 2);
                  if (client.field652 > -1) {
                     if (var78 == 1) {
                        client.field903 -= 20;
                     }

                     if (var78 == 2) {
                        client.field652 -= 15;
                        client.field903 -= 10;
                     }

                     if (var78 == 3) {
                        client.field652 += 15;
                        client.field903 -= 10;
                     }

                     class323 var82 = null;
                     class323 var83 = null;
                     class323 var84 = null;
                     class323 var85 = null;
                     var22 = 0;
                     var23 = 0;
                     int var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     class323 var30 = null;
                     class323 var31 = null;
                     class323 var32 = null;
                     class323 var33 = null;
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     var82 = var91.method5266();
                     int var43;
                     if (var82 != null) {
                        var22 = var82.field3879;
                        var43 = var82.field3887;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var26 = var82.field3881;
                     }

                     var83 = var91.method5236();
                     if (var83 != null) {
                        var23 = var83.field3879;
                        var43 = var83.field3887;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var27 = var83.field3881;
                     }

                     var84 = var91.method5243();
                     if (var84 != null) {
                        var24 = var84.field3879;
                        var43 = var84.field3887;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var28 = var84.field3881;
                     }

                     var85 = var91.method5241();
                     if (var85 != null) {
                        var25 = var85.field3879;
                        var43 = var85.field3887;
                        if (var43 > var42) {
                           var42 = var43;
                        }

                        var29 = var85.field3881;
                     }

                     if (var81 != null) {
                        var30 = var81.method5266();
                        if (var30 != null) {
                           var34 = var30.field3879;
                           var43 = var30.field3887;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var38 = var30.field3881;
                        }

                        var31 = var81.method5236();
                        if (var31 != null) {
                           var35 = var31.field3879;
                           var43 = var31.field3887;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var39 = var31.field3881;
                        }

                        var32 = var81.method5243();
                        if (var32 != null) {
                           var36 = var32.field3879;
                           var43 = var32.field3887;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var40 = var32.field3881;
                        }

                        var33 = var81.method5241();
                        if (var33 != null) {
                           var37 = var33.field3879;
                           var43 = var33.field3887;
                           if (var43 > var42) {
                              var42 = var43;
                           }

                           var41 = var33.field3881;
                        }
                     }

                     class300 var86 = var91.method5257();
                     if (var86 == null) {
                        var86 = class18.field175;
                     }

                     class300 var44;
                     if (var81 != null) {
                        var44 = var81.method5257();
                        if (var44 == null) {
                           var44 = class18.field175;
                        }
                     } else {
                        var44 = class18.field175;
                     }

                     String var45 = null;
                     String var46 = null;
                     boolean var47 = false;
                     int var48 = 0;
                     var45 = var91.method5252(var0.field960[var78]);
                     int var93 = var86.method5793(var45);
                     if (var81 != null) {
                        var46 = var81.method5252(var0.field963[var78]);
                        var48 = var44.method5793(var46);
                     }

                     int var49 = 0;
                     int var50 = 0;
                     if (var23 > 0) {
                        if (var84 == null && var85 == null) {
                           var49 = 1;
                        } else {
                           var49 = var93 / var23 + 1;
                        }
                     }

                     if (var81 != null && var35 > 0) {
                        if (var32 == null && var33 == null) {
                           var50 = 1;
                        } else {
                           var50 = var48 / var35 + 1;
                        }
                     }

                     int var51 = 0;
                     int var52 = var51;
                     if (var22 > 0) {
                        var51 += var22;
                     }

                     var51 += 2;
                     int var53 = var51;
                     if (var24 > 0) {
                        var51 += var24;
                     }

                     int var54 = var51;
                     int var55 = var51;
                     int var56;
                     if (var23 > 0) {
                        var56 = var49 * var23;
                        var51 += var56;
                        var55 += (var56 - var93) / 2;
                     } else {
                        var51 += var93;
                     }

                     var56 = var51;
                     if (var25 > 0) {
                        var51 += var25;
                     }

                     int var57 = 0;
                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62;
                     if (var81 != null) {
                        var51 += 2;
                        var57 = var51;
                        if (var34 > 0) {
                           var51 += var34;
                        }

                        var51 += 2;
                        var58 = var51;
                        if (var36 > 0) {
                           var51 += var36;
                        }

                        var59 = var51;
                        var61 = var51;
                        if (var35 > 0) {
                           var62 = var50 * var35;
                           var51 += var62;
                           var61 += (var62 - var48) / 2;
                        } else {
                           var51 += var48;
                        }

                        var60 = var51;
                        if (var37 > 0) {
                           var51 += var37;
                        }
                     }

                     var62 = var0.field961[var78] - client.field655;
                     int var63 = var91.field3441 - var62 * var91.field3441 / var91.field3428;
                     int var64 = var62 * var91.field3431 / var91.field3428 + -var91.field3431;
                     int var65 = var63 + (var2 + client.field652 - (var51 >> 1));
                     int var66 = var64 + (var3 + client.field903 - 12);
                     int var67 = var66;
                     int var68 = var66 + var42;
                     int var69 = var66 + var91.field3446 + 15;
                     int var70 = var69 - var86.field3766;
                     int var71 = var69 + var86.field3767;
                     if (var70 < var66) {
                        var67 = var70;
                     }

                     if (var71 > var68) {
                        var68 = var71;
                     }

                     int var72 = 0;
                     int var73;
                     int var74;
                     if (var81 != null) {
                        var72 = var66 + var81.field3446 + 15;
                        var73 = var72 - var44.field3766;
                        var74 = var72 + var44.field3767;
                        if (var73 < var67) {
                           ;
                        }

                        if (var74 > var68) {
                           ;
                        }
                     }

                     var73 = 255;
                     if (var91.field3442 >= 0) {
                        var73 = (var62 << 8) / (var91.field3428 - var91.field3442);
                     }

                     if (var73 >= 0 && var73 < 255) {
                        if (var82 != null) {
                           var82.method6170(var52 + var65 - var26, var66, var73);
                        }

                        if (var84 != null) {
                           var84.method6170(var53 + var65 - var28, var66, var73);
                        }

                        if (var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.method6170(var74 * var23 + (var65 + var54 - var27), var66, var73);
                           }
                        }

                        if (var85 != null) {
                           var85.method6170(var65 + var56 - var29, var66, var73);
                        }

                        var86.method5864(var45, var65 + var55, var69, var91.field3435, 0, var73);
                        if (var81 != null) {
                           if (var30 != null) {
                              var30.method6170(var57 + var65 - var38, var66, var73);
                           }

                           if (var32 != null) {
                              var32.method6170(var58 + var65 - var40, var66, var73);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.method6170(var74 * var35 + (var59 + var65 - var39), var66, var73);
                              }
                           }

                           if (var33 != null) {
                              var33.method6170(var60 + var65 - var41, var66, var73);
                           }

                           var44.method5864(var46, var61 + var65, var72, var81.field3435, 0, var73);
                        }
                     } else {
                        if (var82 != null) {
                           var82.method6164(var52 + var65 - var26, var66);
                        }

                        if (var84 != null) {
                           var84.method6164(var53 + var65 - var28, var66);
                        }

                        if (var83 != null) {
                           for(var74 = 0; var74 < var49; ++var74) {
                              var83.method6164(var74 * var23 + (var54 + var65 - var27), var66);
                           }
                        }

                        if (var85 != null) {
                           var85.method6164(var56 + var65 - var29, var66);
                        }

                        var86.method5846(var45, var55 + var65, var69, var91.field3435 | -16777216, 0);
                        if (var81 != null) {
                           if (var30 != null) {
                              var30.method6164(var57 + var65 - var38, var66);
                           }

                           if (var32 != null) {
                              var32.method6164(var58 + var65 - var40, var66);
                           }

                           if (var31 != null) {
                              for(var74 = 0; var74 < var50; ++var74) {
                                 var31.method6164(var74 * var35 + (var65 + var59 - var39), var66);
                              }
                           }

                           if (var33 != null) {
                              var33.method6164(var65 + var60 - var41, var66);
                           }

                           var44.method5846(var46, var65 + var61, var72, var81.field3435 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
