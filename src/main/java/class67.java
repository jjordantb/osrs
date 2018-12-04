import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class67 {
   static int field1027;
   static int field1030 = 6;
   public static class91 field1036;
   boolean field1029;
   boolean field1035;
   int field1031 = 1;
   String field1034 = null;
   boolean field1033 = false;
   LinkedHashMap field1028 = new LinkedHashMap();

   class67() {
      this.method1739(true);
   }

   class67(class184 var1) {
      if (var1 != null && var1.field2404 != null) {
         int var2 = var1.method3983();
         if (var2 >= 0 && var2 <= field1030) {
            if (var1.method3983() == 1) {
               this.field1029 = true;
            }

            if (var2 > 1) {
               this.field1035 = var1.method3983() == 1;
            }

            if (var2 > 3) {
               this.field1031 = var1.method3983();
            }

            if (var2 > 2) {
               int var3 = var1.method3983();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method3892();
                  int var6 = var1.method3892();
                  this.field1028.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field1034 = var1.method3777();
            }

            if (var2 > 5) {
               this.field1033 = var1.method3776();
            }
         } else {
            this.method1739(true);
         }
      } else {
         this.method1739(true);
      }

   }

   void method1739(boolean var1) {
   }

   class184 method1740() {
      class184 var1 = new class184(100);
      var1.method3805(field1030);
      var1.method3805(this.field1029 ? 1 : 0);
      var1.method3805(this.field1035 ? 1 : 0);
      var1.method3805(this.field1031);
      var1.method3805(this.field1028.size());
      Iterator var2 = this.field1028.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.method3921(((Integer)var3.getKey()).intValue());
         var1.method3921(((Integer)var3.getValue()).intValue());
      }

      var1.method3889(this.field1034 != null ? this.field1034 : "");
      var1.method3818(this.field1033);
      return var1;
   }

   public static boolean method1749() {
      class317 var0 = (class317)class318.field3852.method4250();
      return var0 != null;
   }

   static final void method1748(class191 var0, int var1) {
      int var2 = var0.field2405;
      class83.field1227 = 0;
      class10.method115(var0);
      class153.method3412(var0);
      if (var0.field2405 - var2 != var1) {
         throw new RuntimeException(var0.field2405 - var2 + " " + var1);
      }
   }

   static void method1745(class47 var0) {
      int var4;
      if (class79.field1176) {
         if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4) {
            int var1 = class79.field1143 + 280;
            if (class48.field478 >= var1 && class48.field478 <= var1 + 14 && class48.field467 >= 4 && class48.field467 <= 18) {
               class45.method818(0, 0);
            } else if (class48.field478 >= var1 + 15 && class48.field478 <= var1 + 80 && class48.field467 >= 4 && class48.field467 <= 18) {
               class45.method818(0, 1);
            } else {
               int var2 = class79.field1143 + 390;
               if (class48.field478 >= var2 && class48.field478 <= var2 + 14 && class48.field467 >= 4 && class48.field467 <= 18) {
                  class45.method818(1, 0);
               } else if (class48.field478 >= var2 + 15 && class48.field478 <= var2 + 80 && class48.field467 >= 4 && class48.field467 <= 18) {
                  class45.method818(1, 1);
               } else {
                  int var17 = class79.field1143 + 500;
                  if (class48.field478 >= var17 && class48.field478 <= var17 + 14 && class48.field467 >= 4 && class48.field467 <= 18) {
                     class45.method818(2, 0);
                  } else if (class48.field478 >= var17 + 15 && class48.field478 <= var17 + 80 && class48.field467 >= 4 && class48.field467 <= 18) {
                     class45.method818(2, 1);
                  } else {
                     var4 = class79.field1143 + 610;
                     if (class48.field478 >= var4 && class48.field478 <= var4 + 14 && class48.field467 >= 4 && class48.field467 <= 18) {
                        class45.method818(3, 0);
                     } else if (class48.field478 >= var4 + 15 && class48.field478 <= var4 + 80 && class48.field467 >= 4 && class48.field467 <= 18) {
                        class45.method818(3, 1);
                     } else if (class48.field478 >= class79.field1143 + 708 && class48.field467 >= 4 && class48.field478 <= class79.field1143 + 708 + 50 && class48.field467 <= 20) {
                        class79.field1176 = false;
                        class79.field1145.method6184(class79.field1143, 0);
                        class79.field1146.method6184(class79.field1143 + 382, 0);
                        class265.field3401.method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
                     } else if (class79.field1164 != -1) {
                        class66 var5 = class66.field1017[class79.field1164];
                        class138.method3292(var5);
                        class79.field1176 = false;
                        class79.field1145.method6184(class79.field1143, 0);
                        class79.field1146.method6184(class79.field1143 + 382, 0);
                        class265.field3401.method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
                     }
                  }
               }
            }
         }

      } else {
         if ((class48.field477 == 1 || !class14.field132 && class48.field477 == 4) && class48.field478 >= class79.field1143 + 765 - 50 && class48.field467 >= 453) {
            class47.field435.field1035 = !class47.field435.field1035;
            class61.method1202();
            if (!class47.field435.field1035) {
               class72.method1967(class170.field2117, "scape main", "", 255, false);
            } else {
               class23.method342();
            }
         }

         if (client.field720 != 5) {
            if (-1L == class79.field1178) {
               class79.field1178 = class120.method2866() + 1000L;
            }

            long var12 = class120.method2866();
            boolean var3;
            if (client.field915 != null && client.field765 < client.field915.size()) {
               while(true) {
                  if (client.field765 >= client.field915.size()) {
                     var3 = true;
                     break;
                  }

                  class53 var15 = (class53)client.field915.get(client.field765);
                  if (!var15.method1075()) {
                     var3 = false;
                     break;
                  }

                  ++client.field765;
               }
            } else {
               var3 = true;
            }

            if (var3 && class79.field1179 == -1L) {
               class79.field1179 = var12;
               if (class79.field1179 > class79.field1178) {
                  class79.field1178 = class79.field1179;
               }
            }

            ++class79.field1156;
            if (client.field720 == 10 || client.field720 == 11) {
               if (client.field785 == 0) {
                  if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4) {
                     var4 = class79.field1143 + 5;
                     short var14 = 463;
                     byte var6 = 100;
                     byte var7 = 35;
                     if (class48.field478 >= var4 && class48.field478 <= var6 + var4 && class48.field467 >= var14 && class48.field467 <= var14 + var7) {
                        class7.method89();
                        return;
                     }
                  }

                  if (class66.field1010 != null) {
                     class7.method89();
                  }
               }

               var4 = class48.field477;
               int var25 = class48.field478;
               int var18 = class48.field467;
               if (var4 == 0) {
                  var25 = class48.field473;
                  var18 = class48.field464 * -976212263;
               }

               if (!class14.field132 && var4 == 4) {
                  var4 = 1;
               }

               int var8;
               short var9;
               if (class79.field1163 == 0) {
                  boolean var19 = false;

                  while(class283.method5540()) {
                     if (class59.field598 == 84) {
                        var19 = true;
                     }
                  }

                  var8 = class13.field103 - 80;
                  var9 = 291;
                  if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20) {
                     class138.method3291(class56.method1109("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var8 = class13.field103 + 80;
                  if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20 || var19) {
                     if ((client.field660 & 33554432) != 0) {
                        class79.field1168 = "";
                        class79.field1165 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                        class79.field1166 = "Your normal account will not be affected.";
                        class79.field1167 = "";
                        class79.field1163 = 1;
                        if (client.field746 && class79.field1180 != null && class79.field1180.length() > 0) {
                           class79.field1150 = 1;
                        } else {
                           class79.field1150 = 0;
                        }
                     } else if ((client.field660 & 4) != 0) {
                        if ((client.field660 & 1024) != 0) {
                           class79.field1165 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                           class79.field1166 = "Players can attack each other almost everywhere";
                           class79.field1167 = "and the Protect Item prayer won't work.";
                        } else {
                           class79.field1165 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                           class79.field1166 = "Players can attack each other";
                           class79.field1167 = "almost everywhere.";
                        }

                        class79.field1168 = "Warning!";
                        class79.field1163 = 1;
                        if (client.field746 && class79.field1180 != null && class79.field1180.length() > 0) {
                           class79.field1150 = 1;
                        } else {
                           class79.field1150 = 0;
                        }
                     } else if ((client.field660 & 1024) != 0) {
                        class79.field1165 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                        class79.field1166 = "The Protect Item prayer will";
                        class79.field1167 = "not work on this world.";
                        class79.field1168 = "Warning!";
                        class79.field1163 = 1;
                        if (client.field746 && class79.field1180 != null && class79.field1180.length() > 0) {
                           class79.field1150 = 1;
                        } else {
                           class79.field1150 = 0;
                        }
                     } else {
                        class49.method1024(false);
                     }
                  }
               } else {
                  int var20;
                  short var22;
                  if (class79.field1163 != 1) {
                     short var21;
                     if (class79.field1163 == 2) {
                        var21 = 201;
                        var20 = var21 + 52;
                        if (var4 == 1 && var18 >= var20 - 12 && var18 < var20 + 2) {
                           class79.field1150 = 0;
                        }

                        var20 += 15;
                        if (var4 == 1 && var18 >= var20 - 12 && var18 < var20 + 2) {
                           class79.field1150 = 1;
                        }

                        var20 += 15;
                        var21 = 361;
                        if (class79.field1177 != null) {
                           var8 = class79.field1177.field3837 / 2;
                           if (var4 == 1 && var25 >= class79.field1177.field3836 - var8 && var25 <= var8 + class79.field1177.field3836 && var18 >= var21 - 15 && var18 < var21) {
                              switch(class79.field1161) {
                              case 1:
                                 class185.method4006("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                 class79.field1163 = 5;
                                 return;
                              case 2:
                                 class138.method3291("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var8 = class13.field103 - 80;
                        var9 = 321;
                        if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20) {
                           class79.field1180 = class79.field1180.trim();
                           if (class79.field1180.length() == 0) {
                              class185.method4006("", "Please enter your username/email address.", "");
                              return;
                           }

                           if (class79.field1169.length() == 0) {
                              class185.method4006("", "Please enter your password.", "");
                              return;
                           }

                           class185.method4006("", "Connecting to server...", "");
                           class30.method577(false);
                           class16.method202(20);
                           return;
                        }

                        var8 = class79.field1144 + 180 + 80;
                        if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20) {
                           class79.field1163 = 0;
                           class79.field1180 = "";
                           class79.field1169 = "";
                           class60.field604 = 0;
                           class10.field82 = "";
                           class79.field1172 = true;
                        }

                        var8 = class13.field103 + -117;
                        var9 = 277;
                        class79.field1170 = var25 >= var8 && var25 < var8 + class69.field1050 && var18 >= var9 && var18 < var9 + class42.field405;
                        if (var4 == 1 && class79.field1170) {
                           client.field746 = !client.field746;
                           if (!client.field746 && class47.field435.field1034 != null) {
                              class47.field435.field1034 = null;
                              class61.method1202();
                           }
                        }

                        var8 = class13.field103 + 24;
                        var9 = 277;
                        class79.field1171 = var25 >= var8 && var25 < var8 + class69.field1050 && var18 >= var9 && var18 < var9 + class42.field405;
                        if (var4 == 1 && class79.field1171) {
                           class47.field435.field1033 = !class47.field435.field1033;
                           if (!class47.field435.field1033) {
                              class79.field1180 = "";
                              class47.field435.field1034 = null;
                              if (client.field746 && class79.field1180 != null && class79.field1180.length() > 0) {
                                 class79.field1150 = 1;
                              } else {
                                 class79.field1150 = 0;
                              }
                           }

                           class61.method1202();
                        }

                        while(true) {
                           while(class283.method5540()) {
                              boolean var10 = false;

                              for(int var11 = 0; var11 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var11) {
                                 if (class131.field1856 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var11)) {
                                    var10 = true;
                                    break;
                                 }
                              }

                              if (class59.field598 == 13) {
                                 class79.field1163 = 0;
                                 class79.field1180 = "";
                                 class79.field1169 = "";
                                 class60.field604 = 0;
                                 class10.field82 = "";
                                 class79.field1172 = true;
                              } else if (class79.field1150 == 0) {
                                 if (class59.field598 == 85 && class79.field1180.length() > 0) {
                                    class79.field1180 = class79.field1180.substring(0, class79.field1180.length() - 1);
                                 }

                                 if (class59.field598 == 84 || class59.field598 == 80) {
                                    class79.field1150 = 1;
                                 }

                                 if (var10 && class79.field1180.length() < 320) {
                                    class79.field1180 = class79.field1180 + class131.field1856;
                                 }
                              } else if (class79.field1150 == 1) {
                                 if (class59.field598 == 85 && class79.field1169.length() > 0) {
                                    class79.field1169 = class79.field1169.substring(0, class79.field1169.length() - 1);
                                 }

                                 if (class59.field598 == 84 || class59.field598 == 80) {
                                    class79.field1150 = 0;
                                 }

                                 if (class59.field598 == 84) {
                                    class79.field1180 = class79.field1180.trim();
                                    if (class79.field1180.length() == 0) {
                                       class185.method4006("", "Please enter your username/email address.", "");
                                       return;
                                    }

                                    if (class79.field1169.length() == 0) {
                                       class185.method4006("", "Please enter your password.", "");
                                       return;
                                    }

                                    class185.method4006("", "Connecting to server...", "");
                                    class30.method577(false);
                                    class16.method202(20);
                                    return;
                                 }

                                 if (var10 && class79.field1169.length() < 20) {
                                    class79.field1169 = class79.field1169 + class131.field1856;
                                 }
                              }
                           }

                           return;
                        }
                     } else if (class79.field1163 == 3) {
                        var20 = class79.field1144 + 180;
                        var22 = 276;
                        if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                           class49.method1024(false);
                        }

                        var20 = class79.field1144 + 180;
                        var22 = 326;
                        if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                           class185.method4006("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                           class79.field1163 = 5;
                           return;
                        }
                     } else {
                        boolean var23;
                        int var24;
                        if (class79.field1163 == 4) {
                           var20 = class79.field1144 + 180 - 80;
                           var22 = 321;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class10.field82.trim();
                              if (class10.field82.length() != 6) {
                                 class185.method4006("", "Please enter a 6-digit PIN.", "");
                                 return;
                              }

                              class60.field604 = Integer.parseInt(class10.field82);
                              class10.field82 = "";
                              class30.method577(true);
                              class185.method4006("", "Connecting to server...", "");
                              class16.method202(20);
                              return;
                           }

                           if (var4 == 1 && var25 >= class79.field1144 + 180 - 9 && var25 <= class79.field1144 + 180 + 130 && var18 >= 263 && var18 <= 296) {
                              class79.field1172 = !class79.field1172;
                           }

                           if (var4 == 1 && var25 >= class79.field1144 + 180 - 34 && var25 <= class79.field1144 + 34 + 180 && var18 >= 351 && var18 <= 363) {
                              class138.method3291(class56.method1109("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var20 = class79.field1144 + 180 + 80;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class79.field1163 = 0;
                              class79.field1180 = "";
                              class79.field1169 = "";
                              class60.field604 = 0;
                              class10.field82 = "";
                           }

                           while(class283.method5540()) {
                              var23 = false;

                              for(var24 = 0; var24 < "1234567890".length(); ++var24) {
                                 if (class131.field1856 == "1234567890".charAt(var24)) {
                                    var23 = true;
                                    break;
                                 }
                              }

                              if (class59.field598 == 13) {
                                 class79.field1163 = 0;
                                 class79.field1180 = "";
                                 class79.field1169 = "";
                                 class60.field604 = 0;
                                 class10.field82 = "";
                              } else {
                                 if (class59.field598 == 85 && class10.field82.length() > 0) {
                                    class10.field82 = class10.field82.substring(0, class10.field82.length() - 1);
                                 }

                                 if (class59.field598 == 84) {
                                    class10.field82.trim();
                                    if (class10.field82.length() != 6) {
                                       class185.method4006("", "Please enter a 6-digit PIN.", "");
                                       return;
                                    }

                                    class60.field604 = Integer.parseInt(class10.field82);
                                    class10.field82 = "";
                                    class30.method577(true);
                                    class185.method4006("", "Connecting to server...", "");
                                    class16.method202(20);
                                    return;
                                 }

                                 if (var23 && class10.field82.length() < 6) {
                                    class10.field82 = class10.field82 + class131.field1856;
                                 }
                              }
                           }
                        } else if (class79.field1163 == 5) {
                           var20 = class79.field1144 + 180 - 80;
                           var22 = 321;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class162.method3548();
                              return;
                           }

                           var20 = class79.field1144 + 180 + 80;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class49.method1024(true);
                           }

                           while(class283.method5540()) {
                              var23 = false;

                              for(var24 = 0; var24 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var24) {
                                 if (class131.field1856 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var24)) {
                                    var23 = true;
                                    break;
                                 }
                              }

                              if (class59.field598 == 13) {
                                 class49.method1024(true);
                              } else {
                                 if (class59.field598 == 85 && class79.field1180.length() > 0) {
                                    class79.field1180 = class79.field1180.substring(0, class79.field1180.length() - 1);
                                 }

                                 if (class59.field598 == 84) {
                                    class162.method3548();
                                    return;
                                 }

                                 if (var23 && class79.field1180.length() < 320) {
                                    class79.field1180 = class79.field1180 + class131.field1856;
                                 }
                              }
                           }
                        } else if (class79.field1163 == 6) {
                           while(true) {
                              do {
                                 if (!class283.method5540()) {
                                    var21 = 321;
                                    if (var4 == 1 && var18 >= var21 - 20 && var18 <= var21 + 20) {
                                       class49.method1024(true);
                                    }

                                    return;
                                 }
                              } while(class59.field598 != 84 && class59.field598 != 13);

                              class49.method1024(true);
                           }
                        } else if (class79.field1163 == 7) {
                           var20 = class79.field1144 + 180 - 80;
                           var22 = 321;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class138.method3291(class56.method1109("secure", true) + "m=dob/set_dob.ws", true, false);
                              class185.method4006("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class79.field1163 = 6;
                              return;
                           }

                           var20 = class79.field1144 + 180 + 80;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class49.method1024(true);
                           }
                        } else if (class79.field1163 == 8) {
                           var20 = class79.field1144 + 180 - 80;
                           var22 = 321;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class138.method3291("https://www.jagex.com/terms/privacy/#eight", true, false);
                              class185.method4006("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class79.field1163 = 6;
                              return;
                           }

                           var20 = class79.field1144 + 180 + 80;
                           if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                              class49.method1024(true);
                           }
                        } else if (class79.field1163 == 12) {
                           String var16 = "";
                           switch(class79.field1142) {
                           case 0:
                              var16 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var16 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class49.method1024(false);
                           }

                           var8 = class79.field1144 + 180;
                           var9 = 276;
                           if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20) {
                              class138.method3291(var16, true, false);
                              class185.method4006("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                              class79.field1163 = 6;
                              return;
                           }

                           var8 = class79.field1144 + 180;
                           var9 = 326;
                           if (var4 == 1 && var25 >= var8 - 75 && var25 <= var8 + 75 && var18 >= var9 - 20 && var18 <= var9 + 20) {
                              class49.method1024(false);
                           }
                        }
                     }
                  } else {
                     while(class283.method5540()) {
                        if (class59.field598 == 84) {
                           class49.method1024(false);
                        } else if (class59.field598 == 13) {
                           class79.field1163 = 0;
                        }
                     }

                     var20 = class13.field103 - 80;
                     var22 = 321;
                     if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                        class49.method1024(false);
                     }

                     var20 = class13.field103 + 80;
                     if (var4 == 1 && var25 >= var20 - 75 && var25 <= var20 + 75 && var18 >= var22 - 20 && var18 <= var22 + 20) {
                        class79.field1163 = 0;
                     }
                  }
               }

            }
         }
      }
   }

   static final void method1741(class273 var0, int var1, int var2, int var3) {
      if (client.field780 < 400) {
         if (var0.field3595 != null) {
            var0 = var0.method5397();
         }

         if (var0 != null) {
            if (var0.field3589) {
               if (!var0.field3586 || client.field813 == var1) {
                  String var4 = var0.field3569;
                  int var7;
                  int var8;
                  if (var0.field3576 != 0) {
                     var7 = var0.field3576;
                     var8 = class69.field1063.field611;
                     int var9 = var8 - var7;
                     String var6;
                     if (var9 < -9) {
                        var6 = class128.method3233(16711680);
                     } else if (var9 < -6) {
                        var6 = class128.method3233(16723968);
                     } else if (var9 < -3) {
                        var6 = class128.method3233(16740352);
                     } else if (var9 < 0) {
                        var6 = class128.method3233(16756736);
                     } else if (var9 > 9) {
                        var6 = class128.method3233(65280);
                     } else if (var9 > 6) {
                        var6 = class128.method3233(4259584);
                     } else if (var9 > 3) {
                        var6 = class128.method3233(8453888);
                     } else if (var9 > 0) {
                        var6 = class128.method3233(12648192);
                     } else {
                        var6 = class128.method3233(16776960);
                     }

                     var4 = var4 + var6 + " " + " (" + "level-" + var0.field3576 + ")";
                  }

                  if (var0.field3586 && client.field788) {
                     class79.method2039("Examine", class128.method3233(16776960) + var4, 1003, var1, var2, var3);
                  }

                  if (client.field796 == 1) {
                     class79.method2039("Use", client.field766 + " " + "->" + " " + class128.method3233(16776960) + var4, 7, var1, var2, var3);
                  } else if (client.field798) {
                     if ((class297.field3740 & 2) == 2) {
                        class79.method2039(client.field801, client.field716 + " " + "->" + " " + class128.method3233(16776960) + var4, 8, var1, var2, var3);
                     }
                  } else {
                     int var10 = var0.field3586 && client.field788 ? 2000 : 0;
                     String[] var11 = var0.field3565;
                     if (var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var11[var7] != null && !var11[var7].equalsIgnoreCase("Attack")) {
                              var8 = 0;
                              if (var7 == 0) {
                                 var8 = var10 + 9;
                              }

                              if (var7 == 1) {
                                 var8 = var10 + 10;
                              }

                              if (var7 == 2) {
                                 var8 = var10 + 11;
                              }

                              if (var7 == 3) {
                                 var8 = var10 + 12;
                              }

                              if (var7 == 4) {
                                 var8 = var10 + 13;
                              }

                              class79.method2039(var11[var7], class128.method3233(16776960) + var4, var8, var1, var2, var3);
                           }
                        }
                     }

                     if (var11 != null) {
                        for(var7 = 4; var7 >= 0; --var7) {
                           if (var11[var7] != null && var11[var7].equalsIgnoreCase("Attack")) {
                              short var12 = 0;
                              if (client.field672 != class78.field1134) {
                                 if (client.field672 == class78.field1139 || client.field672 == class78.field1141 && var0.field3576 > class69.field1063.field611) {
                                    var12 = 2000;
                                 }

                                 var8 = 0;
                                 if (var7 == 0) {
                                    var8 = var12 + 9;
                                 }

                                 if (var7 == 1) {
                                    var8 = var12 + 10;
                                 }

                                 if (var7 == 2) {
                                    var8 = var12 + 11;
                                 }

                                 if (var7 == 3) {
                                    var8 = var12 + 12;
                                 }

                                 if (var7 == 4) {
                                    var8 = var12 + 13;
                                 }

                                 class79.method2039(var11[var7], class128.method3233(16776960) + var4, var8, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var0.field3586 || !client.field788) {
                        class79.method2039("Examine", class128.method3233(16776960) + var4, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }
}
