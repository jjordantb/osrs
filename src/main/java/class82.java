import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class82 {
   public static class100 field1218;
   ExecutorService field1219 = Executors.newSingleThreadExecutor();
   Future field1216;

   class82() {
      this.field1216 = this.field1219.submit(new class52());
   }

   void method2057() {
      this.field1219.shutdown();
      this.field1219 = null;
   }

   boolean method2058() {
      return this.field1216.isDone();
   }

   SecureRandom method2059() {
      try {
         return (SecureRandom)this.field1216.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   static void method2068() {
      int var0;
      if (client.field902 == 0) {
         class243.field3173 = new class127(4, 104, 104, class50.field506);

         for(var0 = 0; var0 < 4; ++var0) {
            client.field701[var0] = new class166(104, 104);
         }

         class3.field29 = new class323(512, 512);
         class79.field1159 = "Starting game engine...";
         class79.field1158 = 5;
         client.field902 = 20;
      } else if (client.field902 == 20) {
         class79.field1159 = "Prepared visibility map";
         class79.field1158 = 10;
         client.field902 = 30;
      } else if (client.field902 == 30) {
         class19.field185 = class134.method3261(0, false, true, true);
         class42.field401 = class134.method3261(1, false, true, true);
         class50.field505 = class134.method3261(2, true, false, true);
         class157.field2020 = class134.method3261(3, false, true, true);
         class9.field72 = class134.method3261(4, false, true, true);
         class332.field4017 = class134.method3261(5, true, true, true);
         class170.field2117 = class134.method3261(6, true, true, true);
         class10.field80 = class134.method3261(7, false, true, true);
         class154.field2002 = class134.method3261(8, false, true, true);
         class17.field162 = class134.method3261(9, false, true, true);
         class12.field99 = class134.method3261(10, false, true, true);
         class192.field2456 = class134.method3261(11, false, true, true);
         class137.field1914 = class134.method3261(12, false, true, true);
         class71.field1091 = class134.method3261(13, true, false, true);
         class27.field273 = class134.method3261(14, false, true, true);
         class270.field3456 = class134.method3261(15, false, true, true);
         class159.field2039 = class134.method3261(16, true, true, true);
         class145.field1952 = class134.method3261(17, true, true, true);
         class79.field1159 = "Connecting to update server";
         class79.field1158 = 20;
         client.field902 = 40;
      } else if (client.field902 == 40) {
         byte var28 = 0;
         var0 = var28 + class19.field185.method4923() * 4 / 100;
         var0 += class42.field401.method4923() * 4 / 100;
         var0 += class50.field505.method4923() * 2 / 100;
         var0 += class157.field2020.method4923() * 2 / 100;
         var0 += class9.field72.method4923() * 6 / 100;
         var0 += class332.field4017.method4923() * 4 / 100;
         var0 += class170.field2117.method4923() * 2 / 100;
         var0 += class10.field80.method4923() * 57 / 100;
         var0 += class154.field2002.method4923() * 2 / 100;
         var0 += class17.field162.method4923() * 2 / 100;
         var0 += class12.field99.method4923() * 2 / 100;
         var0 += class192.field2456.method4923() * 2 / 100;
         var0 += class137.field1914.method4923() * 2 / 100;
         var0 += class71.field1091.method4923() * 2 / 100;
         var0 += class27.field273.method4923() * 2 / 100;
         var0 += class270.field3456.method4923() * 2 / 100;
         var0 += class159.field2039.method4923() * 2 / 100;
         var0 += class145.field1952.method4922() && class145.field1952.method4904() ? 1 : 0;
         if (var0 != 100) {
            if (var0 != 0) {
               class79.field1159 = "Checking for updates - " + var0 + "%";
            }

            class79.field1158 = 30;
         } else {
            class233.method4754(class19.field185, "Animations");
            class233.method4754(class42.field401, "Skeletons");
            class233.method4754(class9.field72, "Sound FX");
            class233.method4754(class332.field4017, "Maps");
            class233.method4754(class170.field2117, "Music Tracks");
            class233.method4754(class10.field80, "Models");
            class233.method4754(class154.field2002, "Sprites");
            class233.method4754(class192.field2456, "Music Jingles");
            class233.method4754(class27.field273, "Music Samples");
            class233.method4754(class270.field3456, "Music Patches");
            class233.method4754(class159.field2039, "World Map");
            class1.field8 = new class311();
            class1.field8.method5954(class145.field1952);
            class79.field1159 = "Loaded update list";
            class79.field1158 = 30;
            client.field902 = 45;
         }
      } else if (client.field902 == 45) {
         class65.method1682(22050, !client.field648, 2);
         class220 var34 = new class220();
         var34.method4404(9, 128);
         client.field882 = class69.method1840(class47.field426, 0, 22050);
         client.field882.method2396(var34);
         class137.method3280(class270.field3456, class27.field273, class9.field72, var34);
         class6.field46 = class69.method1840(class47.field426, 1, 2048);
         class43.field413 = new class90();
         class6.field46.method2396(class43.field413);
         class286.field3697 = new class104(22050, class97.field1377);
         class79.field1159 = "Prepared sound engine";
         class79.field1158 = 35;
         client.field902 = 50;
         class297.field3747 = new class298(class154.field2002, class71.field1091);
      } else {
         int var1;
         if (client.field902 == 50) {
            class297[] var33 = new class297[]{class297.field3738, class297.field3746, class297.field3741, class297.field3743, class297.field3742, class297.field3744};
            var1 = var33.length;
            class298 var25 = class297.field3747;
            class297[] var24 = new class297[]{class297.field3738, class297.field3746, class297.field3741, class297.field3743, class297.field3742, class297.field3744};
            client.field695 = var25.method5771(var24);
            if (client.field695.size() < var1) {
               class79.field1159 = "Loading fonts - " + client.field695.size() * 100 / var1 + "%";
               class79.field1158 = 40;
            } else {
               class18.field175 = (class300)client.field695.get(class297.field3744);
               class3.field25 = (class300)client.field695.get(class297.field3738);
               class163.field2066 = (class300)client.field695.get(class297.field3746);
               class61.field634 = client.field911.vmethod6292();
               class79.field1159 = "Loaded fonts";
               class79.field1158 = 40;
               client.field902 = 60;
            }
         } else {
            class251 var2;
            int var18;
            int var31;
            class251 var36;
            if (client.field902 == 60) {
               var36 = class12.field99;
               var2 = class154.field2002;
               var18 = 0;
               if (var36.method4853("title.jpg", "")) {
                  ++var18;
               }

               if (var2.method4853("logo", "")) {
                  ++var18;
               }

               if (var2.method4853("logo_deadman_mode", "")) {
                  ++var18;
               }

               if (var2.method4853("titlebox", "")) {
                  ++var18;
               }

               if (var2.method4853("titlebutton", "")) {
                  ++var18;
               }

               if (var2.method4853("runes", "")) {
                  ++var18;
               }

               if (var2.method4853("title_mute", "")) {
                  ++var18;
               }

               if (var2.method4853("options_radio_buttons,0", "")) {
                  ++var18;
               }

               if (var2.method4853("options_radio_buttons,2", "")) {
                  ++var18;
               }

               if (var2.method4853("options_radio_buttons,4", "")) {
                  ++var18;
               }

               if (var2.method4853("options_radio_buttons,6", "")) {
                  ++var18;
               }

               var2.method4853("sl_back", "");
               var2.method4853("sl_flags", "");
               var2.method4853("sl_arrows", "");
               var2.method4853("sl_stars", "");
               var2.method4853("sl_button", "");
               var31 = class77.method2005();
               if (var18 < var31) {
                  class79.field1159 = "Loading title screen - " + var18 * 100 / var31 + "%";
                  class79.field1158 = 50;
               } else {
                  class79.field1159 = "Loaded title screen";
                  class79.field1158 = 50;
                  class16.method202(5);
                  client.field902 = 70;
               }
            } else if (client.field902 == 70) {
               if (!class50.field505.method4904()) {
                  class79.field1159 = "Loading config - " + class50.field505.method4933() + "%";
                  class79.field1158 = 60;
               } else {
                  class251 var32 = class50.field505;
                  class274.field3611 = var32;
                  var36 = class50.field505;
                  class261.field3365 = var36;
                  var2 = class50.field505;
                  class251 var3 = class10.field80;
                  class262.field3378 = var2;
                  class262.field3367 = var3;
                  class262.field3368 = class262.field3378.method4889(3);
                  class257.method5066(class50.field505, class10.field80, client.field648);
                  class175.method3679(class50.field505, class10.field80);
                  class136.method3268(class50.field505);
                  class27.method517(class50.field505, class10.field80, client.field647, class18.field175);
                  class58.method1131(class50.field505, class19.field185, class42.field401);
                  class85.method2146(class50.field505, class10.field80);
                  class168.method3650(class50.field505);
                  class157.method3462(class50.field505);
                  class219.method4372(class157.field2020, class10.field80, class154.field2002, class71.field1091);
                  class251 var19 = class50.field505;
                  class255.field3301 = var19;
                  class84.method2124(class50.field505);
                  class251 var26 = class50.field505;
                  class258.field3336 = var26;
                  class245.method4809(class50.field505);
                  class251 var27 = class50.field505;
                  class6.field49 = var27;
                  class36.field348 = new class84();
                  class251 var7 = class50.field505;
                  class251 var29 = class154.field2002;
                  class251 var9 = class71.field1091;
                  class179.field2355 = var7;
                  class269.field3447 = var29;
                  class269.field3439 = var9;
                  class251 var30 = class50.field505;
                  class251 var11 = class154.field2002;
                  class263.field3389 = var30;
                  class263.field3380 = var11;
                  class251 var12 = class50.field505;
                  class251 var13 = class154.field2002;
                  class257.field3309 = var13;
                  if (var12.method4904()) {
                     class257.field3331 = var12.method4889(35);
                     class257.field3310 = new class257[class257.field3331];

                     for(int var14 = 0; var14 < class257.field3331; ++var14) {
                        byte[] var15 = var12.method4831(35, var14);
                        class257.field3310[var14] = new class257(var14);
                        if (var15 != null) {
                           class257.field3310[var14].method5053(new class184(var15));
                           class257.field3310[var14].method5043();
                        }
                     }
                  }

                  class79.field1159 = "Loaded config";
                  class79.field1158 = 60;
                  client.field902 = 80;
               }
            } else if (client.field902 == 80) {
               var0 = 0;
               if (class55.field551 == null) {
                  class55.field551 = class145.method3349(class154.field2002, class1.field8.field3816, 0);
               } else {
                  ++var0;
               }

               if (class12.field98 == null) {
                  class12.field98 = class145.method3349(class154.field2002, class1.field8.field3817, 0);
               } else {
                  ++var0;
               }

               class322[] var17;
               if (class278.field3642 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3815;
                  if (!class17.method212(var2, var18, 0)) {
                     var17 = null;
                  } else {
                     var17 = class311.method5957();
                  }

                  class278.field3642 = var17;
               } else {
                  ++var0;
               }

               boolean var4;
               byte[] var5;
               class323[] var6;
               class323 var8;
               byte[] var10;
               int var20;
               int var21;
               int var22;
               class323[] var35;
               if (class61.field635 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3818;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3887 * var8.field3879;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class61.field635 = var35;
               } else {
                  ++var0;
               }

               if (class137.field1913 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3813;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3887 * var8.field3879;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class137.field1913 = var35;
               } else {
                  ++var0;
               }

               if (class49.field489 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3814;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3887 * var8.field3879;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class49.field489 = var35;
               } else {
                  ++var0;
               }

               if (class186.field2421 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3819;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3887 * var8.field3879;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class186.field2421 = var35;
               } else {
                  ++var0;
               }

               if (class144.field1945 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3820;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3879 * var8.field3887;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class144.field1945 = var35;
               } else {
                  ++var0;
               }

               if (class47.field461 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3821;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var35 = null;
                  } else {
                     var6 = new class323[class324.field3893];
                     var20 = 0;

                     while(true) {
                        if (var20 >= class324.field3893) {
                           class324.field3890 = null;
                           class324.field3892 = null;
                           class324.field3895 = null;
                           class258.field3334 = null;
                           class324.field3894 = null;
                           class324.field3897 = null;
                           var35 = var6;
                           break;
                        }

                        var8 = var6[var20] = new class323();
                        var8.field3883 = class324.field3891;
                        var8.field3884 = class324.field3896;
                        var8.field3881 = class324.field3890[var20];
                        var8.field3882 = class324.field3892[var20];
                        var8.field3879 = class324.field3895[var20];
                        var8.field3887 = class258.field3334[var20];
                        var21 = var8.field3887 * var8.field3879;
                        var10 = class324.field3897[var20];
                        var8.field3889 = new int[var21];

                        for(var22 = 0; var22 < var21; ++var22) {
                           var8.field3889[var22] = class324.field3894[var10[var22] & 255];
                        }

                        ++var20;
                     }
                  }

                  class47.field461 = var35;
               } else {
                  ++var0;
               }

               if (class194.field2465 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3822;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var17 = null;
                  } else {
                     var17 = class311.method5957();
                  }

                  class194.field2465 = var17;
               } else {
                  ++var0;
               }

               if (class36.field350 == null) {
                  var2 = class154.field2002;
                  var18 = class1.field8.field3823;
                  var5 = var2.method4831(var18, 0);
                  if (var5 == null) {
                     var4 = false;
                  } else {
                     class125.method3051(var5);
                     var4 = true;
                  }

                  if (!var4) {
                     var17 = null;
                  } else {
                     var17 = class311.method5957();
                  }

                  class36.field350 = var17;
               } else {
                  ++var0;
               }

               if (var0 < 11) {
                  class79.field1159 = "Loading sprites - " + var0 * 100 / 12 + "%";
                  class79.field1158 = 70;
               } else {
                  class301.field3760 = class36.field350;
                  class12.field98.method6222();
                  var1 = (int)(Math.random() * 21.0D) - 10;
                  int var23 = (int)(Math.random() * 21.0D) - 10;
                  var18 = (int)(Math.random() * 21.0D) - 10;
                  var31 = (int)(Math.random() * 41.0D) - 20;
                  class278.field3642[0].method6147(var31 + var1, var23 + var31, var18 + var31);
                  class79.field1159 = "Loaded sprites";
                  class79.field1158 = 70;
                  client.field902 = 90;
               }
            } else if (client.field902 == 90) {
               if (!class17.field162.method4904()) {
                  class79.field1159 = "Loading textures - " + "0%";
                  class79.field1158 = 90;
               } else {
                  class282.field3688 = new class113(class17.field162, class154.field2002, 20, 0.8D, client.field648 ? 64 : 128);
                  class124.method2980(class282.field3688);
                  class124.method2981(0.8D);
                  client.field902 = 100;
               }
            } else if (client.field902 == 100) {
               var0 = class282.field3688.method2742();
               if (var0 < 100) {
                  class79.field1159 = "Loading textures - " + var0 + "%";
                  class79.field1158 = 90;
               } else {
                  class79.field1159 = "Loaded textures";
                  class79.field1158 = 90;
                  client.field902 = 110;
               }
            } else if (client.field902 == 110) {
               class36.field347 = new class58();
               class47.field426.method3439(class36.field347, 10);
               class79.field1159 = "Loaded input handler";
               class79.field1158 = 92;
               client.field902 = 120;
            } else if (client.field902 == 120) {
               if (!class12.field99.method4853("huffman", "")) {
                  class79.field1159 = "Loading wordpack - " + 0 + "%";
                  class79.field1158 = 94;
               } else {
                  class176 var16 = new class176(class12.field99.method4849("huffman", ""));
                  class256.method5039(var16);
                  class79.field1159 = "Loaded wordpack";
                  class79.field1158 = 94;
                  client.field902 = 130;
               }
            } else if (client.field902 == 130) {
               if (!class157.field2020.method4904()) {
                  class79.field1159 = "Loading interfaces - " + class157.field2020.method4933() * 4 / 5 + "%";
                  class79.field1158 = 96;
               } else if (!class137.field1914.method4904()) {
                  class79.field1159 = "Loading interfaces - " + (80 + class137.field1914.method4933() / 6) + "%";
                  class79.field1158 = 96;
               } else if (!class71.field1091.method4904()) {
                  class79.field1159 = "Loading interfaces - " + (96 + class71.field1091.method4933() / 50) + "%";
                  class79.field1158 = 96;
               } else {
                  class79.field1159 = "Loaded interfaces";
                  class79.field1158 = 98;
                  client.field902 = 140;
               }
            } else if (client.field902 == 140) {
               class79.field1158 = 100;
               if (!class159.field2039.method4851(class29.field291.field298)) {
                  class79.field1159 = "Loading world map - " + class159.field2039.method4845(class29.field291.field298) / 10 + "%";
               } else {
                  if (class45.field418 == null) {
                     class45.field418 = new class329();
                     class45.field418.method6317(class159.field2039, class163.field2066, client.field695, class278.field3642);
                  }

                  var0 = class45.field418.method6321();
                  if (var0 < 100) {
                     class79.field1159 = "Loading world map - " + (var0 * 9 / 10 + 10) + "%";
                  } else {
                     class79.field1159 = "Loaded world map";
                     client.field902 = 150;
                  }
               }
            } else if (client.field902 == 150) {
               class16.method202(10);
            }
         }
      }
   }
}
