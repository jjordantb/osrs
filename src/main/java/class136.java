import java.awt.Image;

public final class class136 {
   static Image field1892;
   int field1899;
   int field1895;
   int field1894;
   int field1907;
   public class129 field1896;
   int field1897;
   int field1898;
   int field1903;
   int field1900;
   int field1901;
   int field1902;
   int field1905;
   public long field1904 = 0L;
   int field1906 = 0;

   public static void method3268(class249 var0) {
      class267.field3411 = var0;
   }

   public static class321[] method3271() {
      return new class321[]{class321.field3865, class321.field3866, class321.field3867};
   }

   static void method3267(class300 var0, class300 var1, class300 var2, boolean var3) {
      if (var3) {
         class79.field1143 = (class68.field1038 - 765) / 2;
         class79.field1144 = class79.field1143 + 202;
         class13.field103 = class79.field1144 + 180;
      }

      int var7;
      int var12;
      int var13;
      boolean var15;
      int var16;
      byte var22;
      int var23;
      int var26;
      int var32;
      int var34;
      int var35;
      int var36;
      int var38;
      int var40;
      if (class79.field1176) {
         if (class78.field1137 == null) {
            class78.field1137 = class279.method5496(class154.field2002, "sl_back", "");
         }

         class322[] var8;
         class251 var31;
         if (class111.field1490 == null) {
            var31 = class154.field2002;
            var32 = var31.method4825("sl_flags");
            var7 = var31.method4847(var32, "");
            if (!class17.method212(var31, var32, var7)) {
               var8 = null;
            } else {
               var8 = class311.method5957();
            }

            class111.field1490 = var8;
         }

         if (class10.field81 == null) {
            var31 = class154.field2002;
            var32 = var31.method4825("sl_arrows");
            var7 = var31.method4847(var32, "");
            if (!class17.method212(var31, var32, var7)) {
               var8 = null;
            } else {
               var8 = class311.method5957();
            }

            class10.field81 = var8;
         }

         if (class50.field513 == null) {
            var31 = class154.field2002;
            var32 = var31.method4825("sl_stars");
            var7 = var31.method4847(var32, "");
            if (!class17.method212(var31, var32, var7)) {
               var8 = null;
            } else {
               var8 = class311.method5957();
            }

            class50.field513 = var8;
         }

         class319.method6047(class79.field1143, 23, 765, 480, 0);
         class319.method6052(class79.field1143, 0, 125, 23, 12425273, 9135624);
         class319.method6052(class79.field1143 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method5880("Select a world", class79.field1143 + 62, 15, 0, -1);
         if (class50.field513 != null) {
            class50.field513[1].method6143(class79.field1143 + 140, 1);
            var1.method5846("Members only world", class79.field1143 + 152, 10, 16777215, -1);
            class50.field513[0].method6143(class79.field1143 + 140, 12);
            var1.method5846("Free world", class79.field1143 + 152, 21, 16777215, -1);
         }

         if (class10.field81 != null) {
            var40 = class79.field1143 + 280;
            if (class66.field1016[0] == 0 && class66.field1018[0] == 0) {
               class10.field81[2].method6143(var40, 4);
            } else {
               class10.field81[0].method6143(var40, 4);
            }

            if (class66.field1016[0] == 0 && class66.field1018[0] == 1) {
               class10.field81[3].method6143(var40 + 15, 4);
            } else {
               class10.field81[1].method6143(var40 + 15, 4);
            }

            var0.method5846("World", var40 + 32, 17, 16777215, -1);
            var23 = class79.field1143 + 390;
            if (class66.field1016[0] == 1 && class66.field1018[0] == 0) {
               class10.field81[2].method6143(var23, 4);
            } else {
               class10.field81[0].method6143(var23, 4);
            }

            if (class66.field1016[0] == 1 && class66.field1018[0] == 1) {
               class10.field81[3].method6143(var23 + 15, 4);
            } else {
               class10.field81[1].method6143(var23 + 15, 4);
            }

            var0.method5846("Players", var23 + 32, 17, 16777215, -1);
            var32 = class79.field1143 + 500;
            if (class66.field1016[0] == 2 && class66.field1018[0] == 0) {
               class10.field81[2].method6143(var32, 4);
            } else {
               class10.field81[0].method6143(var32, 4);
            }

            if (class66.field1016[0] == 2 && class66.field1018[0] == 1) {
               class10.field81[3].method6143(var32 + 15, 4);
            } else {
               class10.field81[1].method6143(var32 + 15, 4);
            }

            var0.method5846("Location", var32 + 32, 17, 16777215, -1);
            var7 = class79.field1143 + 610;
            if (class66.field1016[0] == 3 && class66.field1018[0] == 0) {
               class10.field81[2].method6143(var7, 4);
            } else {
               class10.field81[0].method6143(var7, 4);
            }

            if (class66.field1016[0] == 3 && class66.field1018[0] == 1) {
               class10.field81[3].method6143(var7 + 15, 4);
            } else {
               class10.field81[1].method6143(var7 + 15, 4);
            }

            var0.method5846("Type", var7 + 32, 17, 16777215, -1);
         }

         class319.method6047(class79.field1143 + 708, 4, 50, 16, 0);
         var1.method5880("Cancel", class79.field1143 + 708 + 25, 16, 16777215, -1);
         class79.field1164 = -1;
         if (class78.field1137 != null) {
            var22 = 88;
            byte var44 = 19;
            var32 = 765 / (var22 + 1);
            var7 = 480 / (var44 + 1);

            do {
               var26 = var7;
               var34 = var32;
               if (var7 * (var32 - 1) >= class66.field1013) {
                  --var32;
               }

               if (var32 * (var7 - 1) >= class66.field1013) {
                  --var7;
               }

               if (var32 * (var7 - 1) >= class66.field1013) {
                  --var7;
               }
            } while(var26 != var7 || var34 != var32);

            var26 = (765 - var32 * var22) / (var32 + 1);
            if (var26 > 5) {
               var26 = 5;
            }

            var34 = (480 - var44 * var7) / (var7 + 1);
            if (var34 > 5) {
               var34 = 5;
            }

            var35 = (765 - var22 * var32 - var26 * (var32 - 1)) / 2;
            var36 = (480 - var44 * var7 - var34 * (var7 - 1)) / 2;
            var12 = var36 + 23;
            var13 = var35 + class79.field1143;
            var38 = 0;
            var15 = false;

            for(var16 = 0; var16 < class66.field1013; ++var16) {
               class66 var17 = class66.field1017[var16];
               boolean var18 = true;
               String var19 = Integer.toString(var17.field1020);
               if (var17.field1020 == -1) {
                  var19 = "OFF";
                  var18 = false;
               } else if (var17.field1020 > 1980) {
                  var19 = "FULL";
                  var18 = false;
               }

               int var21 = 0;
               byte var20;
               if (var17.method1686()) {
                  if (var17.method1684()) {
                     var20 = 7;
                  } else {
                     var20 = 6;
                  }
               } else if (var17.method1689()) {
                  var21 = 16711680;
                  if (var17.method1684()) {
                     var20 = 5;
                  } else {
                     var20 = 4;
                  }
               } else if (var17.method1687()) {
                  if (var17.method1684()) {
                     var20 = 3;
                  } else {
                     var20 = 2;
                  }
               } else if (var17.method1684()) {
                  var20 = 1;
               } else {
                  var20 = 0;
               }

               if (class48.field473 >= var13 && class48.field464 * -976212263 >= var12 && class48.field473 < var22 + var13 && class48.field464 * -976212263 < var44 + var12 && var18) {
                  class79.field1164 = var16;
                  class78.field1137[var20].method6199(var13, var12, 128, 16777215);
                  var15 = true;
               } else {
                  class78.field1137[var20].method6184(var13, var12);
               }

               if (class111.field1490 != null) {
                  class111.field1490[(var17.method1684() ? 8 : 0) + var17.field1021].method6143(var13 + 29, var12);
               }

               var0.method5880(Integer.toString(var17.field1015), var13 + 15, var44 / 2 + var12 + 5, var21, -1);
               var1.method5880(var19, var13 + 60, var44 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var34 + var44;
               ++var38;
               if (var38 >= var7) {
                  var12 = var36 + 23;
                  var13 = var13 + var22 + var26;
                  var38 = 0;
               }
            }

            if (var15) {
               var16 = var1.method5793(class66.field1017[class79.field1164].field1022) + 6;
               int var43 = var1.field3765 + 8;
               class319.method6047(class48.field473 - var16 / 2, class48.field464 * -976212263 + 20 + 5, var16, var43, 16777120);
               class319.method6116(class48.field473 - var16 / 2, class48.field464 * -976212263 + 20 + 5, var16, var43, 0);
               var1.method5880(class66.field1017[class79.field1164].field1022, class48.field473, class48.field464 * -976212263 + var1.field3765 + 20 + 5 + 4, 0, -1);
            }
         }

         class30.field313.vmethod6120(0, 0);
      } else {
         if (var3) {
            class79.field1145.method6184(class79.field1143, 0);
            class79.field1146.method6184(class79.field1143 + 382, 0);
            class265.field3401.method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
         }

         if (client.field720 == 0 || client.field720 == 5) {
            var22 = 20;
            var0.method5880("RuneScape is loading - please wait...", class79.field1144 + 180, 245 - var22, 16777215, -1);
            var23 = 253 - var22;
            class319.method6116(class79.field1144 + 180 - 152, var23, 304, 34, 9179409);
            class319.method6116(class79.field1144 + 180 - 151, var23 + 1, 302, 32, 0);
            class319.method6047(class79.field1144 + 180 - 150, var23 + 2, class79.field1158 * 3, 30, 9179409);
            class319.method6047(class79.field1158 * 3 + (class79.field1144 + 180 - 150), var23 + 2, 300 - class79.field1158 * 3, 30, 0);
            var0.method5880(class79.field1159, class79.field1144 + 180, 276 - var22, 16777215, -1);
         }

         String var24;
         String var25;
         short var39;
         short var41;
         if (client.field720 == 20) {
            class79.field1149.method6143(class79.field1144 + 180 - class79.field1149.field3872 / 2, 271 - class79.field1149.field3873 / 2);
            var39 = 201;
            var0.method5880(class79.field1165, class79.field1144 + 180, var39, 16776960, 0);
            var40 = var39 + 15;
            var0.method5880(class79.field1166, class79.field1144 + 180, var40, 16776960, 0);
            var40 += 15;
            var0.method5880(class79.field1167, class79.field1144 + 180, var40, 16776960, 0);
            var40 += 15;
            var40 += 7;
            if (class79.field1163 != 4) {
               var0.method5846("Login: ", class79.field1144 + 180 - 110, var40, 16777215, 0);
               var41 = 200;
               var24 = class47.field435.field1033 ? class247.method4822(class79.field1180) : class79.field1180;

               for(var25 = var24; var0.method5793(var25) > var41; var25 = var25.substring(0, var25.length() - 1)) {
                  ;
               }

               var0.method5846(class301.method5797(var25), class79.field1144 + 180 - 70, var40, 16777215, 0);
               var40 += 15;
               var0.method5846("Password: " + class247.method4822(class79.field1169), class79.field1144 + 180 - 108, var40, 16777215, 0);
               var40 += 15;
            }
         }

         if (client.field720 == 10 || client.field720 == 11) {
            class79.field1149.method6143(class79.field1144, 171);
            short var6;
            if (class79.field1163 == 0) {
               var39 = 251;
               var0.method5880("Welcome to RuneScape", class79.field1144 + 180, var39, 16776960, 0);
               var40 = var39 + 30;
               var23 = class79.field1144 + 180 - 80;
               var6 = 291;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var0.method5792("New User", var23 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var23 = class79.field1144 + 180 + 80;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var0.method5792("Existing User", var23 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class79.field1163 == 1) {
               var0.method5880(class79.field1168, class79.field1144 + 180, 201, 16776960, 0);
               var39 = 236;
               var0.method5880(class79.field1165, class79.field1144 + 180, var39, 16777215, 0);
               var40 = var39 + 15;
               var0.method5880(class79.field1166, class79.field1144 + 180, var40, 16777215, 0);
               var40 += 15;
               var0.method5880(class79.field1167, class79.field1144 + 180, var40, 16777215, 0);
               var40 += 15;
               var23 = class79.field1144 + 180 - 80;
               var6 = 321;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var0.method5880("Continue", var23, var6 + 5, 16777215, 0);
               var23 = class79.field1144 + 180 + 80;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var0.method5880("Cancel", var23, var6 + 5, 16777215, 0);
            } else if (class79.field1163 == 2) {
               var39 = 201;
               var0.method5880(class79.field1165, class13.field103, var39, 16776960, 0);
               var40 = var39 + 15;
               var0.method5880(class79.field1166, class13.field103, var40, 16776960, 0);
               var40 += 15;
               var0.method5880(class79.field1167, class13.field103, var40, 16776960, 0);
               var40 += 15;
               var40 += 7;
               var0.method5846("Login: ", class13.field103 - 110, var40, 16777215, 0);
               var41 = 200;
               var24 = class47.field435.field1033 ? class247.method4822(class79.field1180) : class79.field1180;

               for(var25 = var24; var0.method5793(var25) > var41; var25 = var25.substring(1)) {
                  ;
               }

               var0.method5846(class301.method5797(var25) + (class79.field1150 == 0 & client.field655 % 40 < 20 ? class128.method3233(16776960) + "|" : ""), class13.field103 - 70, var40, 16777215, 0);
               var40 += 15;
               var0.method5846("Password: " + class247.method4822(class79.field1169) + (class79.field1150 == 1 & client.field655 % 40 < 20 ? class128.method3233(16776960) + "|" : ""), class13.field103 - 108, var40, 16777215, 0);
               var40 += 15;
               var39 = 277;
               var26 = class13.field103 + -117;
               boolean var10 = client.field746;
               boolean var11 = class79.field1170;
               class322 var28 = var10 ? (var11 ? class138.field1925 : class132.field1861) : (var11 ? class79.field1148 : class185.field2417);
               var28.method6143(var26, var39);
               var26 = var26 + var28.field3872 + 5;
               var1.method5846("Remember username", var26, var39 + 13, 16776960, 0);
               var26 = class13.field103 + 24;
               boolean var14 = class47.field435.field1033;
               var15 = class79.field1171;
               class322 var30 = var14 ? (var15 ? class138.field1925 : class132.field1861) : (var15 ? class79.field1148 : class185.field2417);
               var30.method6143(var26, var39);
               var26 = var26 + var30.field3872 + 5;
               var1.method5846("Hide username", var26, var39 + 13, 16776960, 0);
               var40 = var39 + 15;
               var16 = class13.field103 - 80;
               short var27 = 321;
               class307.field3801.method6143(var16 - 73, var27 - 20);
               var0.method5880("Login", var16, var27 + 5, 16777215, 0);
               var16 = class13.field103 + 80;
               class307.field3801.method6143(var16 - 73, var27 - 20);
               var0.method5880("Cancel", var16, var27 + 5, 16777215, 0);
               var39 = 357;
               switch(class79.field1161) {
               case 2:
                  class226.field2624 = "Having trouble logging in?";
                  break;
               default:
                  class226.field2624 = "Forgotten your password? <col=ffffff>Click here.";
               }

               class79.field1177 = new class315(class13.field103, var39, var1.method5793(class226.field2624), 11);
               var1.method5880(class226.field2624, class13.field103, var39, 16777215, 0);
            } else if (class79.field1163 == 3) {
               var39 = 201;
               var0.method5880("Invalid username or password.", class79.field1144 + 180, var39, 16776960, 0);
               var40 = var39 + 20;
               var1.method5880("For accounts created after 24th November 2010, please use your", class79.field1144 + 180, var40, 16776960, 0);
               var40 += 15;
               var1.method5880("email address to login. Otherwise please login with your username.", class79.field1144 + 180, var40, 16776960, 0);
               var40 += 15;
               var23 = class79.field1144 + 180;
               var6 = 276;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var2.method5880("Try again", var23, var6 + 5, 16777215, 0);
               var23 = class79.field1144 + 180;
               var6 = 326;
               class307.field3801.method6143(var23 - 73, var6 - 20);
               var2.method5880("Forgotten password?", var23, var6 + 5, 16777215, 0);
            } else {
               short var9;
               if (class79.field1163 == 4) {
                  var0.method5880("Authenticator", class79.field1144 + 180, 201, 16776960, 0);
                  var39 = 236;
                  var0.method5880(class79.field1165, class79.field1144 + 180, var39, 16777215, 0);
                  var40 = var39 + 15;
                  var0.method5880(class79.field1166, class79.field1144 + 180, var40, 16777215, 0);
                  var40 += 15;
                  var0.method5880(class79.field1167, class79.field1144 + 180, var40, 16777215, 0);
                  var40 += 15;
                  var0.method5846("PIN: " + class247.method4822(class10.field82) + (client.field655 % 40 < 20 ? class128.method3233(16776960) + "|" : ""), class79.field1144 + 180 - 108, var40, 16777215, 0);
                  var40 -= 8;
                  var0.method5846("Trust this computer", class79.field1144 + 180 - 9, var40, 16776960, 0);
                  var40 += 15;
                  var0.method5846("for 30 days: ", class79.field1144 + 180 - 9, var40, 16776960, 0);
                  var23 = class79.field1144 + 180 - 9 + var0.method5793("for 30 days: ") + 15;
                  var32 = var40 - var0.field3765;
                  class322 var42;
                  if (class79.field1172) {
                     var42 = class132.field1861;
                  } else {
                     var42 = class185.field2417;
                  }

                  var42.method6143(var23, var32);
                  var40 += 15;
                  var26 = class79.field1144 + 180 - 80;
                  var9 = 321;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Continue", var26, var9 + 5, 16777215, 0);
                  var26 = class79.field1144 + 180 + 80;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Cancel", var26, var9 + 5, 16777215, 0);
                  var1.method5880("<u=ff>Can't Log In?</u>", class79.field1144 + 180, var9 + 36, 255, 0);
               } else if (class79.field1163 == 5) {
                  var0.method5880("Forgotten your password?", class79.field1144 + 180, 201, 16776960, 0);
                  var39 = 221;
                  var2.method5880(class79.field1165, class79.field1144 + 180, var39, 16776960, 0);
                  var40 = var39 + 15;
                  var2.method5880(class79.field1166, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var2.method5880(class79.field1167, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var40 += 14;
                  var0.method5846("Username/email: ", class79.field1144 + 180 - 145, var40, 16777215, 0);
                  var41 = 174;
                  var24 = class47.field435.field1033 ? class247.method4822(class79.field1180) : class79.field1180;

                  for(var25 = var24; var0.method5793(var25) > var41; var25 = var25.substring(1)) {
                     ;
                  }

                  var0.method5846(class301.method5797(var25) + (client.field655 % 40 < 20 ? class128.method3233(16776960) + "|" : ""), class79.field1144 + 180 - 34, var40, 16777215, 0);
                  var40 += 15;
                  var26 = class79.field1144 + 180 - 80;
                  var9 = 321;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Recover", var26, var9 + 5, 16777215, 0);
                  var26 = class79.field1144 + 180 + 80;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Back", var26, var9 + 5, 16777215, 0);
               } else if (class79.field1163 == 6) {
                  var39 = 201;
                  var0.method5880(class79.field1165, class79.field1144 + 180, var39, 16776960, 0);
                  var40 = var39 + 15;
                  var0.method5880(class79.field1166, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var0.method5880(class79.field1167, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var23 = class79.field1144 + 180;
                  var6 = 321;
                  class307.field3801.method6143(var23 - 73, var6 - 20);
                  var0.method5880("Back", var23, var6 + 5, 16777215, 0);
               } else if (class79.field1163 == 7) {
                  var39 = 216;
                  var0.method5880("Your date of birth isn't set.", class79.field1144 + 180, var39, 16776960, 0);
                  var40 = var39 + 15;
                  var2.method5880("Please verify your account status by", class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var2.method5880("setting your date of birth.", class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var23 = class79.field1144 + 180 - 80;
                  var6 = 321;
                  class307.field3801.method6143(var23 - 73, var6 - 20);
                  var0.method5880("Set Date of Birth", var23, var6 + 5, 16777215, 0);
                  var23 = class79.field1144 + 180 + 80;
                  class307.field3801.method6143(var23 - 73, var6 - 20);
                  var0.method5880("Back", var23, var6 + 5, 16777215, 0);
               } else if (class79.field1163 == 8) {
                  var39 = 216;
                  var0.method5880("Sorry, but your account is not eligible to play.", class79.field1144 + 180, var39, 16776960, 0);
                  var40 = var39 + 15;
                  var2.method5880("For more information, please take a look at", class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var2.method5880("our privacy policy.", class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var23 = class79.field1144 + 180 - 80;
                  var6 = 321;
                  class307.field3801.method6143(var23 - 73, var6 - 20);
                  var0.method5880("Privacy Policy", var23, var6 + 5, 16777215, 0);
                  var23 = class79.field1144 + 180 + 80;
                  class307.field3801.method6143(var23 - 73, var6 - 20);
                  var0.method5880("Back", var23, var6 + 5, 16777215, 0);
               } else if (class79.field1163 == 12) {
                  var39 = 201;
                  String var5 = "";
                  var24 = "";
                  var25 = "";
                  switch(class79.field1142) {
                  case 0:
                     var5 = "Your account has been disabled.";
                     var24 = class239.field2909;
                     var25 = "";
                     break;
                  case 1:
                     var5 = "Account locked as we suspect it has been stolen.";
                     var24 = class239.field2948;
                     var25 = "";
                     break;
                  default:
                     class49.method1024(false);
                  }

                  var0.method5880(var5, class79.field1144 + 180, var39, 16776960, 0);
                  var40 = var39 + 15;
                  var2.method5880(var24, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var2.method5880(var25, class79.field1144 + 180, var40, 16776960, 0);
                  var40 += 15;
                  var26 = class79.field1144 + 180;
                  var9 = 276;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Support Page", var26, var9 + 5, 16777215, 0);
                  var26 = class79.field1144 + 180;
                  var9 = 326;
                  class307.field3801.method6143(var26 - 73, var9 - 20);
                  var0.method5880("Back", var26, var9 + 5, 16777215, 0);
               }
            }
         }

         if (class79.field1156 > 0) {
            var40 = class79.field1156;
            var41 = 256;
            class79.field1160 += var40 * 128;
            if (class79.field1160 > class62.field640.length) {
               class79.field1160 -= class62.field640.length;
               var32 = (int)(Math.random() * 12.0D);
               class278.method5494(class6.field44[var32]);
            }

            var32 = 0;
            var7 = var40 * 128;
            var26 = (var41 - var40) * 128;

            for(var34 = 0; var34 < var26; ++var34) {
               var35 = class19.field182[var7 + var32] - class62.field640[var32 + class79.field1160 & class62.field640.length - 1] * var40 / 6;
               if (var35 < 0) {
                  var35 = 0;
               }

               class19.field182[var32++] = var35;
            }

            for(var34 = var41 - var40; var34 < var41; ++var34) {
               var35 = var34 * 128;

               for(var36 = 0; var36 < 128; ++var36) {
                  var12 = (int)(Math.random() * 100.0D);
                  if (var12 < 50 && var36 > 10 && var36 < 118) {
                     class19.field182[var36 + var35] = 255;
                  } else {
                     class19.field182[var35 + var36] = 0;
                  }
               }
            }

            if (class79.field1152 > 0) {
               class79.field1152 -= var40 * 4;
            }

            if (class79.field1153 > 0) {
               class79.field1153 -= var40 * 4;
            }

            if (class79.field1152 == 0 && class79.field1153 == 0) {
               var34 = (int)(Math.random() * (double)(2000 / var40));
               if (var34 == 0) {
                  class79.field1152 = 1024;
               }

               if (var34 == 1) {
                  class79.field1153 = 1024;
               }
            }

            for(var34 = 0; var34 < var41 - var40; ++var34) {
               class79.field1162[var34] = class79.field1162[var34 + var40];
            }

            for(var34 = var41 - var40; var34 < var41; ++var34) {
               class79.field1162[var34] = (int)(Math.sin((double)class79.field1157 / 14.0D) * 16.0D + Math.sin((double)class79.field1157 / 15.0D) * 14.0D + Math.sin((double)class79.field1157 / 16.0D) * 12.0D);
               ++class79.field1157;
            }

            class79.field1173 += var40;
            var34 = (var40 + (client.field655 & 1)) / 2;
            if (var34 > 0) {
               for(var35 = 0; var35 < class79.field1173 * 100; ++var35) {
                  var36 = (int)(Math.random() * 124.0D) + 2;
                  var12 = (int)(Math.random() * 128.0D) + 128;
                  class19.field182[var36 + (var12 << 7)] = 192;
               }

               class79.field1173 = 0;
               var35 = 0;

               label744:
               while(true) {
                  if (var35 >= var41) {
                     var35 = 0;

                     while(true) {
                        if (var35 >= 128) {
                           break label744;
                        }

                        var36 = 0;

                        for(var12 = -var34; var12 < var41; ++var12) {
                           var13 = var12 * 128;
                           if (var34 + var12 < var41) {
                              var36 += class19.field183[var35 + var13 + var34 * 128];
                           }

                           if (var12 - (var34 + 1) >= 0) {
                              var36 -= class19.field183[var13 + var35 - (var34 + 1) * 128];
                           }

                           if (var12 >= 0) {
                              class19.field182[var35 + var13] = var36 / (var34 * 2 + 1);
                           }
                        }

                        ++var35;
                     }
                  }

                  var36 = 0;
                  var12 = var35 * 128;

                  for(var13 = -var34; var13 < 128; ++var13) {
                     if (var34 + var13 < 128) {
                        var36 += class19.field182[var13 + var12 + var34];
                     }

                     if (var13 - (var34 + 1) >= 0) {
                        var36 -= class19.field182[var12 + var13 - (var34 + 1)];
                     }

                     if (var13 >= 0) {
                        class19.field183[var13 + var12] = var36 / (var34 * 2 + 1);
                     }
                  }

                  ++var35;
               }
            }

            class79.field1156 = 0;
         }

         var39 = 256;
         if (class79.field1152 > 0) {
            for(var23 = 0; var23 < 256; ++var23) {
               if (class79.field1152 > 768) {
                  class69.field1047[var23] = class79.method2040(class79.field1151[var23], class58.field583[var23], 1024 - class79.field1152);
               } else if (class79.field1152 > 256) {
                  class69.field1047[var23] = class58.field583[var23];
               } else {
                  class69.field1047[var23] = class79.method2040(class58.field583[var23], class79.field1151[var23], 256 - class79.field1152);
               }
            }
         } else if (class79.field1153 > 0) {
            for(var23 = 0; var23 < 256; ++var23) {
               if (class79.field1153 > 768) {
                  class69.field1047[var23] = class79.method2040(class79.field1151[var23], class161.field2048[var23], 1024 - class79.field1153);
               } else if (class79.field1153 > 256) {
                  class69.field1047[var23] = class161.field2048[var23];
               } else {
                  class69.field1047[var23] = class79.method2040(class161.field2048[var23], class79.field1151[var23], 256 - class79.field1153);
               }
            }
         } else {
            for(var23 = 0; var23 < 256; ++var23) {
               class69.field1047[var23] = class79.field1151[var23];
            }
         }

         class319.method6067(class79.field1143, 9, class79.field1143 + 128, var39 + 7);
         class79.field1145.method6184(class79.field1143, 0);
         class319.method6037();
         var23 = 0;
         var32 = class30.field313.field3864 * 9 + class79.field1143;

         for(var7 = 1; var7 < var39 - 1; ++var7) {
            var26 = class79.field1162[var7] * (var39 - var7) / var39;
            var34 = var26 + 22;
            if (var34 < 0) {
               var34 = 0;
            }

            var23 += var34;

            for(var35 = var34; var35 < 128; ++var35) {
               var36 = class19.field182[var23++];
               if (var36 != 0) {
                  var12 = var36;
                  var13 = 256 - var36;
                  var36 = class69.field1047[var36];
                  var38 = class30.field313.field3862[var32];
                  class30.field313.field3862[var32++] = ((var36 & 16711935) * var12 + (var38 & 16711935) * var13 & -16711936) + (var13 * (var38 & '\uff00') + var12 * (var36 & '\uff00') & 16711680) >> 8;
               } else {
                  ++var32;
               }
            }

            var32 += var34 + class30.field313.field3864 - 128;
         }

         class319.method6067(class79.field1143 + 765 - 128, 9, class79.field1143 + 765, var39 + 7);
         class79.field1146.method6184(class79.field1143 + 382, 0);
         class319.method6037();
         var23 = 0;
         var32 = class30.field313.field3864 * 9 + class79.field1143 + 637 + 24;

         for(var7 = 1; var7 < var39 - 1; ++var7) {
            var26 = class79.field1162[var7] * (var39 - var7) / var39;
            var34 = 103 - var26;
            var32 += var26;

            for(var35 = 0; var35 < var34; ++var35) {
               var36 = class19.field182[var23++];
               if (var36 != 0) {
                  var12 = var36;
                  var13 = 256 - var36;
                  var36 = class69.field1047[var36];
                  var38 = class30.field313.field3862[var32];
                  class30.field313.field3862[var32++] = (var13 * (var38 & '\uff00') + var12 * (var36 & '\uff00') & 16711680) + ((var38 & 16711935) * var13 + (var36 & 16711935) * var12 & -16711936) >> 8;
               } else {
                  ++var32;
               }
            }

            var23 += 128 - var34;
            var32 += class30.field313.field3864 - var34 - var26;
         }

         class79.field1147[class47.field435.field1035 ? 1 : 0].method6143(class79.field1143 + 765 - 40, 463);
         if (client.field720 > 5 && client.field785 == 0) {
            if (class10.field77 != null) {
               var40 = class79.field1143 + 5;
               var41 = 463;
               byte var37 = 100;
               byte var33 = 35;
               class10.field77.method6143(var40, var41);
               var0.method5880("World" + " " + client.field691, var37 / 2 + var40, var33 / 2 + var41 - 2, 16777215, 0);
               if (class66.field1010 != null) {
                  var1.method5880("Loading...", var37 / 2 + var40, var33 / 2 + var41 + 12, 16777215, 0);
               } else {
                  var1.method5880("Click to switch", var37 / 2 + var40, var33 / 2 + var41 + 12, 16777215, 0);
               }
            } else {
               class10.field77 = class257.method5047(class154.field2002, "sl_button", "");
            }
         }

      }
   }

   static final void method3269(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class243.field3173.method3083(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      if (0L != var5) {
         var7 = class243.field3173.method3087(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (class19.method244(var5)) {
            var10 = var4;
         }

         int[] var11 = class3.field29.field3889;
         var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var13 = class56.method1110(var5);
         class270 var14 = class253.method4993(var13);
         if (var14.field3466 != -1) {
            class322 var15 = class278.field3642[var14.field3466];
            if (var15 != null) {
               int var16 = (var14.field3501 * 4 - var15.field3872) / 2;
               int var17 = (var14.field3475 * 4 - var15.field3873) / 2;
               var15.method6143(var16 + var1 * 4 + 48, (104 - var2 - var14.field3475) * 4 + var17 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 1) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var11[var12] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = class243.field3173.method3085(var0, var1, var2);
      if (var5 != 0L) {
         var7 = class243.field3173.method3087(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class56.method1110(var5);
         class270 var24 = class253.method4993(var10);
         int var19;
         if (var24.field3466 != -1) {
            class322 var18 = class278.field3642[var24.field3466];
            if (var18 != null) {
               var13 = (var24.field3501 * 4 - var18.field3872) / 2;
               var19 = (var24.field3475 * 4 - var18.field3873) / 2;
               var18.method6143(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.field3475) * 4 + 48);
            }
         } else if (var9 == 9) {
            var12 = 15658734;
            if (class19.method244(var5)) {
               var12 = 15597568;
            }

            int[] var23 = class3.field29.field3889;
            var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var23[var19] = var12;
               var23[var19 + 1 + 512] = var12;
               var23[var19 + 1024 + 2] = var12;
               var23[var19 + 1536 + 3] = var12;
            } else {
               var23[var19 + 1536] = var12;
               var23[var19 + 1 + 1024] = var12;
               var23[var19 + 512 + 2] = var12;
               var23[var19 + 3] = var12;
            }
         }
      }

      var5 = class243.field3173.method3182(var0, var1, var2);
      if (var5 != 0L) {
         var7 = class56.method1110(var5);
         class270 var20 = class253.method4993(var7);
         if (var20.field3466 != -1) {
            class322 var21 = class278.field3642[var20.field3466];
            if (var21 != null) {
               var10 = (var20.field3501 * 4 - var21.field3872) / 2;
               int var22 = (var20.field3475 * 4 - var21.field3873) / 2;
               var21.method6143(var1 * 4 + var10 + 48, var22 + (104 - var2 - var20.field3475) * 4 + 48);
            }
         }
      }

   }

   static void method3270(class232 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field2682;
      int var5 = var0.field2683;
      if (var0.field2736 == 0) {
         var0.field2682 = var0.field2678;
      } else if (var0.field2736 == 1) {
         var0.field2682 = var1 - var0.field2678;
      } else if (var0.field2736 == 2) {
         var0.field2682 = var0.field2678 * var1 >> 14;
      }

      if (var0.field2675 == 0) {
         var0.field2683 = var0.field2679;
      } else if (var0.field2675 == 1) {
         var0.field2683 = var2 - var0.field2679;
      } else if (var0.field2675 == 2) {
         var0.field2683 = var2 * var0.field2679 >> 14;
      }

      if (var0.field2736 == 4) {
         var0.field2682 = var0.field2683 * var0.field2684 / var0.field2668;
      }

      if (var0.field2675 == 4) {
         var0.field2683 = var0.field2682 * var0.field2668 / var0.field2684;
      }

      if (var0.field2741 == 1337) {
         client.field815 = var0;
      }

      if (var3 && var0.field2782 != null && (var4 != var0.field2682 || var5 != var0.field2683)) {
         class57 var6 = new class57();
         var6.field570 = var0;
         var6.field575 = var0.field2782;
         client.field842.method4276(var6);
      }

   }
}
