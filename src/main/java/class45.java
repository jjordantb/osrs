import java.applet.Applet;

public class class45 {
   static class329 field418;
   public static Applet field419 = null;
   public static String field420 = "";

   static void method818(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (class66.field1016[var5] != var0) {
            var2[var4] = class66.field1016[var5];
            var3[var4] = class66.field1018[var5];
            ++var4;
         }
      }

      class66.field1016 = var2;
      class66.field1018 = var3;
      class305.method5919(class66.field1017, 0, class66.field1017.length - 1, class66.field1016, class66.field1018);
   }

   static final void method828(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class189.method4028(var0)) {
         class18.field165 = null;
         class97.method2367(class145.field1951[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (class18.field165 != null) {
            class97.method2367(class18.field165, -1412584499, var1, var2, var3, var4, class1.field12, class161.field2051, var7);
            class18.field165 = null;
         }

      } else {
         if (var7 != -1) {
            client.field848[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               client.field848[var8] = true;
            }
         }

      }
   }

   static final void method827(class232[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < var0.length; ++var8) {
         class232 var9 = var0[var8];
         if (var9 != null && var9.field2700 == var1 && (!var9.field2685 || var9.field2808 == 0 || var9.field2753 || class254.method5000(var9) != 0 || var9 == client.field817 || var9.field2741 == 1338)) {
            if (var9.field2685) {
               if (class42.method784(var9)) {
                  continue;
               }
            } else if (var9.field2808 == 0 && var9 != class153.field1993 && class42.method784(var9)) {
               continue;
            }

            int var10 = var9.field2680 + var6;
            int var11 = var7 + var9.field2772;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var18;
            if (var9.field2808 == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16;
               if (var9.field2808 == 9) {
                  var16 = var10;
                  var17 = var11;
                  var18 = var10 + var9.field2682;
                  int var19 = var11 + var9.field2683;
                  if (var18 < var10) {
                     var16 = var18;
                     var18 = var10;
                  }

                  if (var19 < var11) {
                     var17 = var19;
                     var19 = var11;
                  }

                  ++var18;
                  ++var19;
                  var12 = var16 > var2 ? var16 : var2;
                  var13 = var17 > var3 ? var17 : var3;
                  var14 = var18 < var4 ? var18 : var4;
                  var15 = var19 < var5 ? var19 : var5;
               } else {
                  var16 = var10 + var9.field2682;
                  var17 = var11 + var9.field2683;
                  var12 = var10 > var2 ? var10 : var2;
                  var13 = var11 > var3 ? var11 : var3;
                  var14 = var16 < var4 ? var16 : var4;
                  var15 = var17 < var5 ? var17 : var5;
               }
            }

            if (var9 == client.field816) {
               client.field824 = true;
               client.field825 = var10;
               client.field826 = var11;
            }

            boolean var32 = false;
            if (var9.field2724) {
               switch(client.field805) {
               case 0:
                  var32 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (client.field642 == var9.field2770 >>> 16) {
                     var32 = true;
                  }
                  break;
               case 3:
                  if (var9.field2770 == client.field642) {
                     var32 = true;
                  }
               }
            }

            if (var32 || !var9.field2685 || var12 < var14 && var13 < var15) {
               if (var9.field2685) {
                  class57 var26;
                  if (var9.field2807) {
                     if (class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15) {
                        for(var26 = (class57)client.field842.method4298(); var26 != null; var26 = (class57)client.field842.method4283()) {
                           if (var26.field563) {
                              var26.method4271();
                              var26.field570.field2798 = false;
                           }
                        }

                        if (class234.field2817 == 0) {
                           client.field816 = null;
                           client.field817 = null;
                        }

                        if (!client.field833) {
                           class14.method163();
                        }
                     }
                  } else if (var9.field2746 && class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15) {
                     for(var26 = (class57)client.field842.method4298(); var26 != null; var26 = (class57)client.field842.method4283()) {
                        if (var26.field563 && var26.field570.field2774 == var26.field575) {
                           var26.method4271();
                        }
                     }
                  }
               }

               var17 = class48.field473;
               var18 = class48.field464 * -976212263;
               if (class48.field477 != 0) {
                  var17 = class48.field478;
                  var18 = class48.field467;
               }

               boolean var33 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
               if (var9.field2741 == 1337) {
                  if (!client.field654 && !client.field833 && var33) {
                     class66.method1707(var17, var18, var12, var13);
                  }
               } else if (var9.field2741 == 1338) {
                  class218.method4368(var9, var10, var11);
               } else {
                  if (var9.field2741 == 1400) {
                     field418.method6319(class48.field473, class48.field464 * -976212263, var33, var10, var11, var9.field2682, var9.field2683);
                  }

                  if (!client.field833 && var33) {
                     if (var9.field2741 == 1400) {
                        field418.method6418(var10, var11, var9.field2682, var9.field2683, var17, var18);
                     } else {
                        class71.method1950(var9, var17 - var10, var18 - var11);
                     }
                  }

                  boolean var21;
                  int var23;
                  if (var32) {
                     for(int var20 = 0; var20 < var9.field2710.length; ++var20) {
                        var21 = false;
                        boolean var22 = false;
                        if (!var21 && var9.field2710[var20] != null) {
                           for(var23 = 0; var23 < var9.field2710[var20].length; ++var23) {
                              boolean var24 = false;
                              if (var9.field2806 != null) {
                                 var24 = class39.field380[var9.field2710[var20][var23]];
                              }

                              if (class19.method242(var9.field2710[var20][var23]) || var24) {
                                 var21 = true;
                                 if (var9.field2806 != null && var9.field2806[var20] > client.field655) {
                                    break;
                                 }

                                 byte var25 = var9.field2743[var20][var23];
                                 if (var25 == 0 || ((var25 & 8) == 0 || !class39.field380[86] && !class39.field380[82] && !class39.field380[81]) && ((var25 & 2) == 0 || class39.field380[86]) && ((var25 & 1) == 0 || class39.field380[82]) && ((var25 & 4) == 0 || class39.field380[81])) {
                                    var22 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var22) {
                           if (var20 < 10) {
                              class35.method688(var20 + 1, var9.field2770, var9.field2787, var9.field2793, "");
                           } else if (var20 == 10) {
                              class134.method3264();
                              class62.method1232(var9.field2770, var9.field2787, class9.method98(class254.method5000(var9)), var9.field2793);
                              client.field801 = class86.method2167(var9);
                              if (client.field801 == null) {
                                 client.field801 = "null";
                              }

                              client.field716 = var9.field2697 + class128.method3233(16777215);
                           }

                           var23 = var9.field2765[var20];
                           if (var9.field2806 == null) {
                              var9.field2806 = new int[var9.field2710.length];
                           }

                           if (var9.field2745 == null) {
                              var9.field2745 = new int[var9.field2710.length];
                           }

                           if (var23 != 0) {
                              if (var9.field2806[var20] == 0) {
                                 var9.field2806[var20] = var23 + client.field655 + var9.field2745[var20];
                              } else {
                                 var9.field2806[var20] = var23 + client.field655;
                              }
                           } else {
                              var9.field2806[var20] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var21 && var9.field2806 != null) {
                           var9.field2806[var20] = 0;
                        }
                     }
                  }

                  if (var9.field2685) {
                     if (class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     boolean var34 = false;
                     if ((class48.field469 == 1 || !class14.field132 && class48.field469 == 4) && var33) {
                        var34 = true;
                     }

                     var21 = false;
                     if ((class48.field477 == 1 || !class14.field132 && class48.field477 == 4) && class48.field478 >= var12 && class48.field467 >= var13 && class48.field478 < var14 && class48.field467 < var15) {
                        var21 = true;
                     }

                     if (var21) {
                        class134.method3262(var9, class48.field478 - var10, class48.field467 - var11);
                     }

                     if (var9.field2741 == 1400) {
                        field418.method6479(var17, var18, var33 & var34, var33 & var21);
                     }

                     if (client.field816 != null && var9 != client.field816 && var33 && class186.method4010(class254.method5000(var9))) {
                        client.field811 = var9;
                     }

                     if (var9 == client.field817) {
                        client.field821 = true;
                        client.field713 = var10;
                        client.field823 = var11;
                     }

                     if (var9.field2753) {
                        class57 var27;
                        if (var33 && client.field841 != 0 && var9.field2774 != null) {
                           var27 = new class57();
                           var27.field563 = true;
                           var27.field570 = var9;
                           var27.field566 = client.field841;
                           var27.field575 = var9.field2774;
                           client.field842.method4276(var27);
                        }

                        if (client.field816 != null || class66.field1025 != null || client.field833) {
                           var21 = false;
                           var34 = false;
                           var33 = false;
                        }

                        if (!var9.field2669 && var21) {
                           var9.field2669 = true;
                           if (var9.field2656 != null) {
                              var27 = new class57();
                              var27.field563 = true;
                              var27.field570 = var9;
                              var27.field565 = class48.field478 - var10;
                              var27.field566 = class48.field467 - var11;
                              var27.field575 = var9.field2656;
                              client.field842.method4276(var27);
                           }
                        }

                        if (var9.field2669 && var34 && var9.field2803 != null) {
                           var27 = new class57();
                           var27.field563 = true;
                           var27.field570 = var9;
                           var27.field565 = class48.field473 - var10;
                           var27.field566 = class48.field464 * -976212263 - var11;
                           var27.field575 = var9.field2803;
                           client.field842.method4276(var27);
                        }

                        if (var9.field2669 && !var34) {
                           var9.field2669 = false;
                           if (var9.field2756 != null) {
                              var27 = new class57();
                              var27.field563 = true;
                              var27.field570 = var9;
                              var27.field565 = class48.field473 - var10;
                              var27.field566 = class48.field464 * -976212263 - var11;
                              var27.field575 = var9.field2756;
                              client.field844.method4276(var27);
                           }
                        }

                        if (var34 && var9.field2758 != null) {
                           var27 = new class57();
                           var27.field563 = true;
                           var27.field570 = var9;
                           var27.field565 = class48.field473 - var10;
                           var27.field566 = class48.field464 * -976212263 - var11;
                           var27.field575 = var9.field2758;
                           client.field842.method4276(var27);
                        }

                        if (!var9.field2798 && var33) {
                           var9.field2798 = true;
                           if (var9.field2759 != null) {
                              var27 = new class57();
                              var27.field563 = true;
                              var27.field570 = var9;
                              var27.field565 = class48.field473 - var10;
                              var27.field566 = class48.field464 * -976212263 - var11;
                              var27.field575 = var9.field2759;
                              client.field842.method4276(var27);
                           }
                        }

                        if (var9.field2798 && var33 && var9.field2760 != null) {
                           var27 = new class57();
                           var27.field563 = true;
                           var27.field570 = var9;
                           var27.field565 = class48.field473 - var10;
                           var27.field566 = class48.field464 * -976212263 - var11;
                           var27.field575 = var9.field2760;
                           client.field842.method4276(var27);
                        }

                        if (var9.field2798 && !var33) {
                           var9.field2798 = false;
                           if (var9.field2761 != null) {
                              var27 = new class57();
                              var27.field563 = true;
                              var27.field570 = var9;
                              var27.field565 = class48.field473 - var10;
                              var27.field566 = class48.field464 * -976212263 - var11;
                              var27.field575 = var9.field2761;
                              client.field844.method4276(var27);
                           }
                        }

                        if (var9.field2658 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2658;
                           client.field843.method4276(var27);
                        }

                        class57 var28;
                        int var35;
                        int var36;
                        if (var9.field2766 != null && client.field830 > var9.field2801) {
                           if (var9.field2767 != null && client.field830 - var9.field2801 <= 32) {
                              label873:
                              for(var35 = var9.field2801; var35 < client.field830; ++var35) {
                                 var23 = client.field653[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2767.length; ++var36) {
                                    if (var23 == var9.field2767[var36]) {
                                       var28 = new class57();
                                       var28.field570 = var9;
                                       var28.field575 = var9.field2766;
                                       client.field842.method4276(var28);
                                       break label873;
                                    }
                                 }
                              }
                           } else {
                              var27 = new class57();
                              var27.field570 = var9;
                              var27.field575 = var9.field2766;
                              client.field842.method4276(var27);
                           }

                           var9.field2801 = client.field830;
                        }

                        if (var9.field2660 != null && client.field832 > var9.field2802) {
                           if (var9.field2769 != null && client.field832 - var9.field2802 <= 32) {
                              label849:
                              for(var35 = var9.field2802; var35 < client.field832; ++var35) {
                                 var23 = client.field831[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2769.length; ++var36) {
                                    if (var23 == var9.field2769[var36]) {
                                       var28 = new class57();
                                       var28.field570 = var9;
                                       var28.field575 = var9.field2660;
                                       client.field842.method4276(var28);
                                       break label849;
                                    }
                                 }
                              }
                           } else {
                              var27 = new class57();
                              var27.field570 = var9;
                              var27.field575 = var9.field2660;
                              client.field842.method4276(var27);
                           }

                           var9.field2802 = client.field832;
                        }

                        if (var9.field2667 != null && client.field834 > var9.field2735) {
                           if (var9.field2771 != null && client.field834 - var9.field2735 <= 32) {
                              label825:
                              for(var35 = var9.field2735; var35 < client.field834; ++var35) {
                                 var23 = client.field774[var35 & 31];

                                 for(var36 = 0; var36 < var9.field2771.length; ++var36) {
                                    if (var23 == var9.field2771[var36]) {
                                       var28 = new class57();
                                       var28.field570 = var9;
                                       var28.field575 = var9.field2667;
                                       client.field842.method4276(var28);
                                       break label825;
                                    }
                                 }
                              }
                           } else {
                              var27 = new class57();
                              var27.field570 = var9;
                              var27.field575 = var9.field2667;
                              client.field842.method4276(var27);
                           }

                           var9.field2735 = client.field834;
                        }

                        if (client.field835 > var9.field2800 && var9.field2775 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2775;
                           client.field842.method4276(var27);
                        }

                        if (client.field836 > var9.field2800 && var9.field2777 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2777;
                           client.field842.method4276(var27);
                        }

                        if (client.field837 > var9.field2800 && var9.field2747 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2747;
                           client.field842.method4276(var27);
                        }

                        if (client.field858 > var9.field2800 && var9.field2783 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2783;
                           client.field842.method4276(var27);
                        }

                        if (client.field839 > var9.field2800 && var9.field2796 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2796;
                           client.field842.method4276(var27);
                        }

                        if (client.field685 > var9.field2800 && var9.field2779 != null) {
                           var27 = new class57();
                           var27.field570 = var9;
                           var27.field575 = var9.field2779;
                           client.field842.method4276(var27);
                        }

                        var9.field2800 = client.field828;
                        if (var9.field2666 != null) {
                           for(var35 = 0; var35 < client.field865; ++var35) {
                              class57 var31 = new class57();
                              var31.field570 = var9;
                              var31.field569 = client.field867[var35];
                              var31.field562 = client.field846[var35];
                              var31.field575 = var9.field2666;
                              client.field842.method4276(var31);
                           }
                        }
                     }
                  }

                  if (!var9.field2685) {
                     if (client.field816 != null || class66.field1025 != null || client.field833) {
                        continue;
                     }

                     if ((var9.field2788 >= 0 || var9.field2694 != 0) && class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15) {
                        if (var9.field2788 >= 0) {
                           class153.field1993 = var0[var9.field2788];
                        } else {
                           class153.field1993 = var9;
                        }
                     }

                     if (var9.field2808 == 8 && class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15) {
                        class50.field495 = var9;
                     }

                     if (var9.field2691 > var9.field2683) {
                        class53.method1080(var9, var10 + var9.field2682, var11, var9.field2683, var9.field2691, class48.field473, class48.field464 * -976212263);
                     }
                  }

                  if (var9.field2808 == 0) {
                     method827(var0, var9.field2770, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2689);
                     if (var9.field2791 != null) {
                        method827(var9.field2791, var9.field2770, var12, var13, var14, var15, var10 - var9.field2711, var11 - var9.field2689);
                     }

                     class56 var29 = (class56)client.field804.method4224((long)var9.field2770);
                     if (var29 != null) {
                        if (var29.field560 == 0 && class48.field473 >= var12 && class48.field464 * -976212263 >= var13 && class48.field473 < var14 && class48.field464 * -976212263 < var15 && !client.field833) {
                           for(class57 var30 = (class57)client.field842.method4298(); var30 != null; var30 = (class57)client.field842.method4283()) {
                              if (var30.field563) {
                                 var30.method4271();
                                 var30.field570.field2798 = false;
                              }
                           }

                           if (class234.field2817 == 0) {
                              client.field816 = null;
                              client.field817 = null;
                           }

                           if (!client.field833) {
                              class14.method163();
                           }
                        }

                        class6.method82(var29.field556, var12, var13, var14, var15, var10, var11);
                     }
                  }
               }
            }
         }
      }

   }

   static void method826(int var0, int var1) {
      class76 var2 = class51.field520;
      class15.method178(var2.field1125, var2.field1124, var2.field1123, var2.field1126, var2.field1127, var2.field1127, var0, var1);
      class51.field520 = null;
   }
}
