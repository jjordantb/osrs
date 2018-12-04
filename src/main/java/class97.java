public class class97 {
   public static int field1377;
   protected int[] field1362;
   class107 field1363;
   int field1364 = 32;
   long field1361 = class120.method2866();
   int field1365;
   int field1367;
   int field1368;
   long field1369 = 0L;
   int field1370 = 0;
   int field1371 = 0;
   int field1372 = 0;
   long field1375 = 0L;
   boolean field1374 = true;
   int field1379 = 0;
   class107[] field1366 = new class107[8];
   class107[] field1376 = new class107[8];

   protected void vmethod2353() throws Exception {
   }

   protected void vmethod2354(int var1) throws Exception {
   }

   protected int vmethod2355() throws Exception {
      return this.field1365;
   }

   protected void vmethod2356() throws Exception {
   }

   protected void vmethod2357() {
   }

   protected void vmethod2358() throws Exception {
   }

   public final synchronized void method2396(class107 var1) {
      this.field1363 = var1;
   }

   public final synchronized void method2346() {
      if (this.field1362 != null) {
         long var1 = class120.method2866();

         try {
            if (0L != this.field1369) {
               if (var1 < this.field1369) {
                  return;
               }

               this.vmethod2354(this.field1365);
               this.field1369 = 0L;
               this.field1374 = true;
            }

            int var3 = this.vmethod2355();
            if (this.field1372 - var3 > this.field1370) {
               this.field1370 = this.field1372 - var3;
            }

            int var4 = this.field1367 + this.field1368;
            if (var4 + 256 > 16384) {
               var4 = 16128;
            }

            if (var4 + 256 > this.field1365) {
               this.field1365 += 1024;
               if (this.field1365 > 16384) {
                  this.field1365 = 16384;
               }

               this.vmethod2357();
               this.vmethod2354(this.field1365);
               var3 = 0;
               this.field1374 = true;
               if (var4 + 256 > this.field1365) {
                  var4 = this.field1365 - 256;
                  this.field1368 = var4 - this.field1367;
               }
            }

            while(var3 < var4) {
               this.method2351(this.field1362, 256);
               this.vmethod2356();
               var3 += 256;
            }

            if (var1 > this.field1375) {
               if (!this.field1374) {
                  if (this.field1370 == 0 && this.field1371 == 0) {
                     this.vmethod2357();
                     this.field1369 = var1 + 2000L;
                     return;
                  }

                  this.field1368 = Math.min(this.field1371, this.field1370);
                  this.field1371 = this.field1370;
               } else {
                  this.field1374 = false;
               }

               this.field1370 = 0;
               this.field1375 = 2000L + var1;
            }

            this.field1372 = var3;
         } catch (Exception var7) {
            this.vmethod2357();
            this.field1369 = var1 + 2000L;
         }

         try {
            if (var1 > 500000L + this.field1361) {
               var1 = this.field1361;
            }

            while(var1 > this.field1361 + 5000L) {
               this.method2350(256);
               this.field1361 += (long)(256000 / field1377);
            }
         } catch (Exception var6) {
            this.field1361 = var1;
         }

      }
   }

   public final void method2347() {
      this.field1374 = true;
   }

   public final synchronized void method2348() {
      this.field1374 = true;

      try {
         this.vmethod2358();
      } catch (Exception var2) {
         this.vmethod2357();
         this.field1369 = class120.method2866() + 2000L;
      }

   }

   public final synchronized void method2403() {
      if (class236.field2846 != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == class236.field2846.field1391[var2]) {
               class236.field2846.field1391[var2] = null;
            }

            if (class236.field2846.field1391[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            class79.field1155.shutdownNow();
            class79.field1155 = null;
            class236.field2846 = null;
         }
      }

      this.vmethod2357();
      this.field1362 = null;
   }

   final void method2350(int var1) {
      this.field1379 -= var1;
      if (this.field1379 < 0) {
         this.field1379 = 0;
      }

      if (this.field1363 != null) {
         this.field1363.vmethod4601(var1);
      }

   }

   final void method2351(int[] var1, int var2) {
      int var3 = var2;
      if (class26.field264) {
         var3 = var2 << 1;
      }

      class195.method4110(var1, 0, var3);
      this.field1379 -= var2;
      if (this.field1363 != null && this.field1379 <= 0) {
         this.field1379 += field1377 >> 4;
         class58.method1130(this.field1363);
         this.method2352(this.field1363, this.field1363.vmethod2661());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class107 var10;
         label104:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class107 var11 = this.field1366[var7];

                  label98:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label98;
                        }

                        class110 var12 = var11.field1442;
                        if (var12 != null && var12.field1476 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1444;
                        } else {
                           var11.field1445 = true;
                           int var13 = var11.vmethod4609();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field1476 += var13;
                           }

                           if (var4 >= this.field1364) {
                              break label104;
                           }

                           class107 var14 = var11.vmethod4596();
                           if (var14 != null) {
                              for(int var15 = var11.field1443; var14 != null; var14 = var11.vmethod4598()) {
                                 this.method2352(var14, var15 * var14.vmethod2661() >> 8);
                              }
                           }

                           class107 var18 = var11.field1444;
                           var11.field1444 = null;
                           if (var10 == null) {
                              this.field1366[var7] = var18;
                           } else {
                              var10.field1444 = var18;
                           }

                           if (var18 == null) {
                              this.field1376[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class107 var16 = this.field1366[var6];
            class107[] var17 = this.field1366;
            this.field1376[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.field1444;
               var16.field1444 = null;
            }
         }
      }

      if (this.field1379 < 0) {
         this.field1379 = 0;
      }

      if (this.field1363 != null) {
         this.field1363.vmethod4620(var1, 0, var2);
      }

      this.field1361 = class120.method2866();
   }

   final void method2352(class107 var1, int var2) {
      int var3 = var2 >> 5;
      class107 var4 = this.field1376[var3];
      if (var4 == null) {
         this.field1366[var3] = var1;
      } else {
         var4.field1444 = var1;
      }

      this.field1376[var3] = var1;
      var1.field1443 = var2;
   }

   public static int method2405(int var0) {
      class265 var1 = class77.method2004(var0);
      int var2 = var1.field3397;
      int var3 = var1.field3399;
      int var4 = var1.field3398;
      int var5 = class227.field2627[var4 - var3];
      return class227.field2629[var2] >> var3 & var5;
   }

   public static int method2404(String var0) {
      return var0.length() + 1;
   }

   static final void method2367(class232[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class319.method6067(var2, var3, var4, var5);
      class124.method3000();

      for(int var9 = 0; var9 < var0.length; ++var9) {
         class232 var10 = var0[var9];
         if (var10 != null && (var10.field2700 == var1 || var1 == -1412584499 && var10 == client.field816)) {
            int var11;
            if (var8 == -1) {
               client.field763[client.field853] = var10.field2680 + var6;
               client.field852[client.field853] = var7 + var10.field2772;
               client.field819[client.field853] = var10.field2682;
               client.field854[client.field853] = var10.field2683;
               var11 = ++client.field853 - 1;
            } else {
               var11 = var8;
            }

            var10.field2804 = var11;
            var10.field2805 = client.field655;
            if (!var10.field2685 || !class42.method784(var10)) {
               if (var10.field2741 > 0) {
                  class37.method719(var10);
               }

               int var12 = var10.field2680 + var6;
               int var13 = var7 + var10.field2772;
               int var14 = var10.field2698;
               int var15;
               int var16;
               if (var10 == client.field816) {
                  if (var1 != -1412584499 && !var10.field2784) {
                     class18.field165 = var0;
                     class1.field12 = var6;
                     class161.field2051 = var7;
                     continue;
                  }

                  if (client.field827 && client.field821) {
                     var15 = class48.field473;
                     var16 = class48.field464 * -976212263;
                     var15 -= client.field906;
                     var16 -= client.field838;
                     if (var15 < client.field713) {
                        var15 = client.field713;
                     }

                     if (var15 + var10.field2682 > client.field713 + client.field817.field2682) {
                        var15 = client.field713 + client.field817.field2682 - var10.field2682;
                     }

                     if (var16 < client.field823) {
                        var16 = client.field823;
                     }

                     if (var16 + var10.field2683 > client.field823 + client.field817.field2683) {
                        var16 = client.field823 + client.field817.field2683 - var10.field2683;
                     }

                     var12 = var15;
                     var13 = var16;
                  }

                  if (!var10.field2784) {
                     var14 = 128;
                  }
               }

               int var17;
               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               if (var10.field2808 == 2) {
                  var15 = var2;
                  var16 = var3;
                  var17 = var4;
                  var18 = var5;
               } else if (var10.field2808 == 9) {
                  var19 = var12;
                  var20 = var13;
                  var21 = var12 + var10.field2682;
                  var22 = var13 + var10.field2683;
                  if (var21 < var12) {
                     var19 = var21;
                     var21 = var12;
                  }

                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  ++var21;
                  ++var22;
                  var15 = var19 > var2 ? var19 : var2;
                  var16 = var20 > var3 ? var20 : var3;
                  var17 = var21 < var4 ? var21 : var4;
                  var18 = var22 < var5 ? var22 : var5;
               } else {
                  var19 = var12 + var10.field2682;
                  var20 = var13 + var10.field2683;
                  var15 = var12 > var2 ? var12 : var2;
                  var16 = var13 > var3 ? var13 : var3;
                  var17 = var19 < var4 ? var19 : var4;
                  var18 = var20 < var5 ? var20 : var5;
               }

               if (!var10.field2685 || var15 < var17 && var16 < var18) {
                  if (var10.field2741 != 0) {
                     if (var10.field2741 == 1336) {
                        if (client.field886) {
                           var13 += 15;
                           class3.field25.method5799("Fps:" + class47.field434, var12 + var10.field2682, var13, 16776960, -1);
                           var13 += 15;
                           Runtime var42 = Runtime.getRuntime();
                           var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L);
                           var21 = 16776960;
                           if (var20 > 327680 && !client.field648) {
                              var21 = 16711680;
                           }

                           class3.field25.method5799("Mem:" + var20 + "k", var12 + var10.field2682, var13, var21, -1);
                           var13 += 15;
                        }
                        continue;
                     }

                     if (var10.field2741 == 1337) {
                        client.field792 = var12;
                        client.field860 = var13;
                        class34.method624(var12, var13, var10.field2682, var10.field2683);
                        client.field848[var10.field2804] = true;
                        class319.method6067(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2741 == 1338) {
                        class88.method2185(var10, var12, var13, var11);
                        class319.method6067(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2741 == 1339) {
                        class87.method2172(var10, var12, var13, var11);
                        class319.method6067(var2, var3, var4, var5);
                        continue;
                     }

                     if (var10.field2741 == 1400) {
                        class45.field418.method6337(var12, var13, var10.field2682, var10.field2683, client.field655);
                     }

                     if (var10.field2741 == 1401) {
                        class45.field418.method6490(var12, var13, var10.field2682, var10.field2683);
                     }
                  }

                  if (var10.field2808 == 0) {
                     if (!var10.field2685 && class42.method784(var10) && var10 != class153.field1993) {
                        continue;
                     }

                     if (!var10.field2685) {
                        if (var10.field2689 > var10.field2691 - var10.field2683) {
                           var10.field2689 = var10.field2691 - var10.field2683;
                        }

                        if (var10.field2689 < 0) {
                           var10.field2689 = 0;
                        }
                     }

                     method2367(var0, var10.field2770, var15, var16, var17, var18, var12 - var10.field2711, var13 - var10.field2689, var11);
                     if (var10.field2791 != null) {
                        method2367(var10.field2791, var10.field2770, var15, var16, var17, var18, var12 - var10.field2711, var13 - var10.field2689, var11);
                     }

                     class56 var30 = (class56)client.field804.method4224((long)var10.field2770);
                     if (var30 != null) {
                        class45.method828(var30.field556, var15, var16, var17, var18, var12, var13, var11);
                     }

                     class319.method6067(var2, var3, var4, var5);
                     class124.method3000();
                  }

                  if (client.field675 || client.field706[var11] || client.field855 > 1) {
                     if (var10.field2808 == 0 && !var10.field2685 && var10.field2691 > var10.field2683) {
                        class16.method203(var12 + var10.field2682, var13, var10.field2689, var10.field2683, var10.field2691);
                     }

                     if (var10.field2808 != 1) {
                        int var23;
                        int var24;
                        int var25;
                        int var26;
                        if (var10.field2808 == 2) {
                           var19 = 0;

                           for(var20 = 0; var20 < var10.field2679; ++var20) {
                              for(var21 = 0; var21 < var10.field2678; ++var21) {
                                 var22 = var21 * (var10.field2734 + 32) + var12;
                                 var23 = var13 + var20 * (var10.field2708 + 32);
                                 if (var19 < 20) {
                                    var22 += var10.field2726[var19];
                                    var23 += var10.field2737[var19];
                                 }

                                 if (var10.field2762[var19] <= 0) {
                                    if (var10.field2738 != null && var19 < 20) {
                                       class323 var46 = var10.method4709(var19);
                                       if (var46 != null) {
                                          var46.method6164(var22, var23);
                                       } else if (class232.field2665) {
                                          class37.method721(var10);
                                       }
                                    }
                                 } else {
                                    boolean var37 = false;
                                    boolean var38 = false;
                                    var26 = var10.field2762[var19] - 1;
                                    if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == class66.field1025 && var19 == client.field751) {
                                       class323 var27;
                                       if (client.field796 == 1 && var19 == class22.field220 && var10.field2770 == class88.field1276) {
                                          var27 = class29.method531(var26, var10.field2792[var19], 2, 0, 2, false);
                                       } else {
                                          var27 = class29.method531(var26, var10.field2792[var19], 1, 3153952, 2, false);
                                       }

                                       if (var27 != null) {
                                          if (var10 == class66.field1025 && var19 == client.field751) {
                                             var24 = class48.field473 - client.field752;
                                             var25 = class48.field464 * -976212263 - client.field845;
                                             if (var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                             }

                                             if (var25 < 5 && var25 > -5) {
                                                var25 = 0;
                                             }

                                             if (client.field756 < 5) {
                                                var24 = 0;
                                                var25 = 0;
                                             }

                                             var27.method6170(var22 + var24, var25 + var23, 128);
                                             if (var1 != -1) {
                                                class232 var28 = var0[var1 & '\uffff'];
                                                int var29;
                                                if (var25 + var23 < class319.field3858 && var28.field2689 > 0) {
                                                   var29 = (class319.field3858 - var23 - var25) * client.field705 / 3;
                                                   if (var29 > client.field705 * 10) {
                                                      var29 = client.field705 * 10;
                                                   }

                                                   if (var29 > var28.field2689) {
                                                      var29 = var28.field2689;
                                                   }

                                                   var28.field2689 -= var29;
                                                   client.field845 += var29;
                                                   class37.method721(var28);
                                                }

                                                if (var25 + var23 + 32 > class319.field3857 && var28.field2689 < var28.field2691 - var28.field2683) {
                                                   var29 = (var23 + var25 + 32 - class319.field3857) * client.field705 / 3;
                                                   if (var29 > client.field705 * 10) {
                                                      var29 = client.field705 * 10;
                                                   }

                                                   if (var29 > var28.field2691 - var28.field2683 - var28.field2689) {
                                                      var29 = var28.field2691 - var28.field2683 - var28.field2689;
                                                   }

                                                   var28.field2689 += var29;
                                                   client.field845 -= var29;
                                                   class37.method721(var28);
                                                }
                                             }
                                          } else if (var10 == class179.field2357 && var19 == client.field750) {
                                             var27.method6170(var22, var23, 128);
                                          } else {
                                             var27.method6164(var22, var23);
                                          }
                                       } else {
                                          class37.method721(var10);
                                       }
                                    }
                                 }

                                 ++var19;
                              }
                           }
                        } else if (var10.field2808 == 3) {
                           if (class18.method239(var10)) {
                              var19 = var10.field2693;
                              if (var10 == class153.field1993 && var10.field2695 != 0) {
                                 var19 = var10.field2695;
                              }
                           } else {
                              var19 = var10.field2686;
                              if (var10 == class153.field1993 && var10.field2694 != 0) {
                                 var19 = var10.field2694;
                              }
                           }

                           if (var10.field2696) {
                              switch(var10.field2744.field3868) {
                              case 1:
                                 class319.method6052(var12, var13, var10.field2682, var10.field2683, var10.field2686, var10.field2693);
                                 break;
                              case 2:
                                 class319.method6039(var12, var13, var10.field2682, var10.field2683, var10.field2686, var10.field2693, 255 - (var10.field2698 & 255), 255 - (var10.field2699 & 255));
                                 break;
                              default:
                                 if (var14 == 0) {
                                    class319.method6047(var12, var13, var10.field2682, var10.field2683, var19);
                                 } else {
                                    class319.method6046(var12, var13, var10.field2682, var10.field2683, var19, 256 - (var14 & 255));
                                 }
                              }
                           } else if (var14 == 0) {
                              class319.method6116(var12, var13, var10.field2682, var10.field2683, var19);
                           } else {
                              class319.method6051(var12, var13, var10.field2682, var10.field2683, var19, 256 - (var14 & 255));
                           }
                        } else {
                           class300 var39;
                           if (var10.field2808 == 4) {
                              var39 = var10.method4708();
                              if (var39 == null) {
                                 if (class232.field2665) {
                                    class37.method721(var10);
                                 }
                              } else {
                                 String var44 = var10.field2728;
                                 if (class18.method239(var10)) {
                                    var20 = var10.field2693;
                                    if (var10 == class153.field1993 && var10.field2695 != 0) {
                                       var20 = var10.field2695;
                                    }

                                    if (var10.field2729.length() > 0) {
                                       var44 = var10.field2729;
                                    }
                                 } else {
                                    var20 = var10.field2686;
                                    if (var10 == class153.field1993 && var10.field2694 != 0) {
                                       var20 = var10.field2694;
                                    }
                                 }

                                 if (var10.field2685 && var10.field2793 != -1) {
                                    class271 var47 = class84.method2125(var10.field2793);
                                    var44 = var47.field3515;
                                    if (var44 == null) {
                                       var44 = "null";
                                    }

                                    if ((var47.field3523 == 1 || var10.field2794 != 1) && var10.field2794 != -1) {
                                       var44 = class128.method3233(16748608) + var44 + "</col>" + " " + 'x' + class8.method96(var10.field2794);
                                    }
                                 }

                                 if (var10 == client.field880) {
                                    var44 = "Please wait...";
                                    var20 = var10.field2686;
                                 }

                                 if (!var10.field2685) {
                                    var44 = class36.method692(var44, var10);
                                 }

                                 var39.method5792(var44, var12, var13, var10.field2682, var10.field2683, var20, var10.field2716 ? 0 : -1, var10.field2681, var10.field2776, var10.field2730);
                              }
                           } else if (var10.field2808 == 5) {
                              class323 var40;
                              if (!var10.field2685) {
                                 var40 = var10.method4741(class18.method239(var10));
                                 if (var40 != null) {
                                    var40.method6164(var12, var13);
                                 } else if (class232.field2665) {
                                    class37.method721(var10);
                                 }
                              } else {
                                 if (var10.field2793 != -1) {
                                    var40 = class29.method531(var10.field2793, var10.field2794, var10.field2706, var10.field2707, var10.field2797, false);
                                 } else {
                                    var40 = var10.method4741(false);
                                 }

                                 if (var40 == null) {
                                    if (class232.field2665) {
                                       class37.method721(var10);
                                    }
                                 } else {
                                    var20 = var40.field3883;
                                    var21 = var40.field3884;
                                    if (!var10.field2705) {
                                       var22 = var10.field2682 * 4096 / var20;
                                       if (var10.field2780 != 0) {
                                          var40.method6182(var10.field2682 / 2 + var12, var10.field2683 / 2 + var13, var10.field2780, var22);
                                       } else if (var14 != 0) {
                                          var40.method6172(var12, var13, var10.field2682, var10.field2683, 256 - (var14 & 255));
                                       } else if (var20 == var10.field2682 && var21 == var10.field2683) {
                                          var40.method6164(var12, var13);
                                       } else {
                                          var40.method6166(var12, var13, var10.field2682, var10.field2683);
                                       }
                                    } else {
                                       class319.method6041(var12, var13, var12 + var10.field2682, var13 + var10.field2683);
                                       var22 = (var20 - 1 + var10.field2682) / var20;
                                       var23 = (var21 - 1 + var10.field2683) / var21;

                                       for(var24 = 0; var24 < var22; ++var24) {
                                          for(var25 = 0; var25 < var23; ++var25) {
                                             if (var10.field2780 != 0) {
                                                var40.method6182(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.field2780, 4096);
                                             } else if (var14 != 0) {
                                                var40.method6170(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
                                             } else {
                                                var40.method6164(var12 + var20 * var24, var13 + var21 * var25);
                                             }
                                          }
                                       }

                                       class319.method6067(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class271 var32;
                              if (var10.field2808 == 6) {
                                 boolean var36 = class18.method239(var10);
                                 if (var36) {
                                    var20 = var10.field2715;
                                 } else {
                                    var20 = var10.field2714;
                                 }

                                 class121 var41 = null;
                                 var22 = 0;
                                 if (var10.field2793 != -1) {
                                    var32 = class84.method2125(var10.field2793);
                                    if (var32 != null) {
                                       var32 = var32.method5373(var10.field2794);
                                       var41 = var32.method5350(1);
                                       if (var41 != null) {
                                          var41.method2873();
                                          var22 = var41.field1840 / 2;
                                       } else {
                                          class37.method721(var10);
                                       }
                                    }
                                 } else if (var10.field2740 == 5) {
                                    if (var10.field2755 == 0) {
                                       var41 = client.field908.method4670((class275)null, -1, (class275)null, -1);
                                    } else {
                                       var41 = class69.field1063.vmethod3236();
                                    }
                                 } else if (var20 == -1) {
                                    var41 = var10.method4710((class275)null, -1, var36, class69.field1063.field630);
                                    if (var41 == null && class232.field2665) {
                                       class37.method721(var10);
                                    }
                                 } else {
                                    class275 var45 = class29.method532(var20);
                                    var41 = var10.method4710(var45, var10.field2795, var36, class69.field1063.field630);
                                    if (var41 == null && class232.field2665) {
                                       class37.method721(var10);
                                    }
                                 }

                                 class124.method2986(var10.field2682 / 2 + var12, var10.field2683 / 2 + var13);
                                 var23 = class124.field1747[var10.field2732] * var10.field2721 >> 16;
                                 var24 = class124.field1754[var10.field2732] * var10.field2721 >> 16;
                                 if (var41 != null) {
                                    if (!var10.field2685) {
                                       var41.method2925(0, var10.field2719, 0, var10.field2732, 0, var23, var24);
                                    } else {
                                       var41.method2873();
                                       if (var10.field2688) {
                                          var41.method2887(0, var10.field2719, var10.field2720, var10.field2732, var10.field2718, var22 + var23 + var10.field2717, var24 + var10.field2717, var10.field2721);
                                       } else {
                                          var41.method2925(0, var10.field2719, var10.field2720, var10.field2732, var10.field2718, var23 + var22 + var10.field2717, var24 + var10.field2717);
                                       }
                                    }
                                 }

                                 class124.method3014();
                              } else {
                                 if (var10.field2808 == 7) {
                                    var39 = var10.method4708();
                                    if (var39 == null) {
                                       if (class232.field2665) {
                                          class37.method721(var10);
                                       }
                                       continue;
                                    }

                                    var20 = 0;

                                    for(var21 = 0; var21 < var10.field2679; ++var21) {
                                       for(var22 = 0; var22 < var10.field2678; ++var22) {
                                          if (var10.field2762[var20] > 0) {
                                             var32 = class84.method2125(var10.field2762[var20] - 1);
                                             String var34;
                                             if (var32.field3523 != 1 && var10.field2792[var20] == 1) {
                                                var34 = class128.method3233(16748608) + var32.field3515 + "</col>";
                                             } else {
                                                var34 = class128.method3233(16748608) + var32.field3515 + "</col>" + " " + 'x' + class8.method96(var10.field2792[var20]);
                                             }

                                             var25 = var12 + var22 * (var10.field2734 + 115);
                                             var26 = var21 * (var10.field2708 + 12) + var13;
                                             if (var10.field2681 == 0) {
                                                var39.method5846(var34, var25, var26, var10.field2686, var10.field2716 ? 0 : -1);
                                             } else if (var10.field2681 == 1) {
                                                var39.method5880(var34, var10.field2682 / 2 + var25, var26, var10.field2686, var10.field2716 ? 0 : -1);
                                             } else {
                                                var39.method5799(var34, var25 + var10.field2682 - 1, var26, var10.field2686, var10.field2716 ? 0 : -1);
                                             }
                                          }

                                          ++var20;
                                       }
                                    }
                                 }

                                 if (var10.field2808 == 8 && var10 == class50.field495 && client.field795 == client.field794) {
                                    var19 = 0;
                                    var20 = 0;
                                    class300 var31 = class3.field25;
                                    String var33 = var10.field2728;

                                    String var43;
                                    for(var33 = class36.method692(var33, var10); var33.length() > 0; var20 = var20 + var31.field3765 + 1) {
                                       var24 = var33.indexOf("<br>");
                                       if (var24 != -1) {
                                          var43 = var33.substring(0, var24);
                                          var33 = var33.substring(var24 + 4);
                                       } else {
                                          var43 = var33;
                                          var33 = "";
                                       }

                                       var25 = var31.method5793(var43);
                                       if (var25 > var19) {
                                          var19 = var25;
                                       }
                                    }

                                    var19 += 6;
                                    var20 += 7;
                                    var24 = var12 + var10.field2682 - 5 - var19;
                                    var25 = var13 + var10.field2683 + 5;
                                    if (var24 < var12 + 5) {
                                       var24 = var12 + 5;
                                    }

                                    if (var19 + var24 > var4) {
                                       var24 = var4 - var19;
                                    }

                                    if (var25 + var20 > var5) {
                                       var25 = var5 - var20;
                                    }

                                    class319.method6047(var24, var25, var19, var20, 16777120);
                                    class319.method6116(var24, var25, var19, var20, 0);
                                    var33 = var10.field2728;
                                    var26 = var25 + var31.field3765 + 2;

                                    for(var33 = class36.method692(var33, var10); var33.length() > 0; var26 = var26 + var31.field3765 + 1) {
                                       int var35 = var33.indexOf("<br>");
                                       if (var35 != -1) {
                                          var43 = var33.substring(0, var35);
                                          var33 = var33.substring(var35 + 4);
                                       } else {
                                          var43 = var33;
                                          var33 = "";
                                       }

                                       var31.method5846(var43, var24 + 3, var26, 0, -1);
                                    }
                                 }

                                 if (var10.field2808 == 9) {
                                    if (var10.field2701) {
                                       var19 = var12;
                                       var20 = var13 + var10.field2683;
                                       var21 = var12 + var10.field2682;
                                       var22 = var13;
                                    } else {
                                       var19 = var12;
                                       var20 = var13;
                                       var21 = var12 + var10.field2682;
                                       var22 = var13 + var10.field2683;
                                    }

                                    if (var10.field2768 == 1) {
                                       class319.method6055(var19, var20, var21, var22, var10.field2686);
                                    } else {
                                       class171.method3657(var19, var20, var21, var22, var10.field2686, var10.field2768);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
