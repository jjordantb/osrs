import java.io.IOException;
import java.util.LinkedList;

public abstract class class16 {
   int field146;
   int field151;
   int field147;
   int field149;
   int field150;
   int field148;
   short[][][] field152;
   short[][][] field153;
   byte[][][] field154;
   byte[][][] field155;
   class19[][][][] field156;

   class16() {
      new LinkedList();
   }

   void method181(int var1, int var2, class184 var3) {
      int var4 = var3.method3983();
      if (var4 != 0) {
         if ((var4 & 1) != 0) {
            this.method201(var1, var2, var3, var4);
         } else {
            this.method183(var1, var2, var3, var4);
         }

      }
   }

   void method201(int var1, int var2, class184 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if (var5) {
         this.field153[0][var1][var2] = (short)var3.method3983();
      }

      this.field152[0][var1][var2] = (short)var3.method3983();
   }

   void method183(int var1, int var2, class184 var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.field152[0][var1][var2] = (short)var3.method3983();
      int var8;
      int var9;
      int var11;
      if (var6) {
         var8 = var3.method3983();

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.method3983();
            if (var10 != 0) {
               this.field153[var9][var1][var2] = (short)var10;
               var11 = var3.method3983();
               this.field154[var9][var1][var2] = (byte)(var11 >> 2);
               this.field155[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.method3983();
            if (var9 != 0) {
               class19[] var14 = this.field156[var8][var1][var2] = new class19[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method3898();
                  int var13 = var3.method3983();
                  var14[var11] = new class19(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }

   }

   int method184(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0) {
         return var1 < 64 && var2 < 64 ? this.field152[0][var1][var2] - 1 : -1;
      } else {
         return -1;
      }
   }

   int method204() {
      return this.field147;
   }

   int method180() {
      return this.field149;
   }

   public static int method206(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   public static void method207(class159 var0, boolean var1) {
      if (class252.field3263 != null) {
         try {
            class252.field3263.vmethod3558();
         } catch (Exception var6) {
            ;
         }

         class252.field3263 = null;
      }

      class252.field3263 = var0;
      class227.method4642(var1);
      class252.field3258.field2405 = 0;
      class193.field2460 = null;
      class252.field3271 = null;
      class252.field3276 = 0;

      while(true) {
         class248 var2 = (class248)class252.field3261.method4235();
         if (var2 == null) {
            while(true) {
               var2 = (class248)class252.field3268.method4235();
               if (var2 == null) {
                  if (class252.field3279 != 0) {
                     try {
                        class184 var7 = new class184(4);
                        var7.method3805(4);
                        var7.method3805(class252.field3279);
                        var7.method3754(0);
                        class252.field3263.vmethod3578(var7.field2404, 0, 4);
                     } catch (IOException var5) {
                        try {
                           class252.field3263.vmethod3558();
                        } catch (Exception var4) {
                           ;
                        }

                        ++class252.field3278;
                        class252.field3263 = null;
                     }
                  }

                  class252.field3272 = 0;
                  class252.field3260 = class120.method2866();
                  return;
               }

               class252.field3265.method4147(var2);
               class252.field3266.method4226(var2, var2.field2496);
               ++class252.field3267;
               --class252.field3269;
            }
         }

         class252.field3270.method4226(var2, var2.field2496);
         ++class252.field3262;
         --class252.field3264;
      }
   }

   static int method205(int var0, class86 var1, boolean var2) {
      class232 var3 = class18.method213(class70.field1070[--class60.field600]);
      if (var0 == 2600) {
         class70.field1070[++class60.field600 - 1] = var3.field2711;
         return 1;
      } else if (var0 == 2601) {
         class70.field1070[++class60.field600 - 1] = var3.field2689;
         return 1;
      } else if (var0 == 2602) {
         class70.field1065[++class70.field1072 - 1] = var3.field2728;
         return 1;
      } else if (var0 == 2603) {
         class70.field1070[++class60.field600 - 1] = var3.field2690;
         return 1;
      } else if (var0 == 2604) {
         class70.field1070[++class60.field600 - 1] = var3.field2691;
         return 1;
      } else if (var0 == 2605) {
         class70.field1070[++class60.field600 - 1] = var3.field2721;
         return 1;
      } else if (var0 == 2606) {
         class70.field1070[++class60.field600 - 1] = var3.field2732;
         return 1;
      } else if (var0 == 2607) {
         class70.field1070[++class60.field600 - 1] = var3.field2720;
         return 1;
      } else if (var0 == 2608) {
         class70.field1070[++class60.field600 - 1] = var3.field2719;
         return 1;
      } else if (var0 == 2609) {
         class70.field1070[++class60.field600 - 1] = var3.field2698;
         return 1;
      } else if (var0 == 2610) {
         class70.field1070[++class60.field600 - 1] = var3.field2699;
         return 1;
      } else if (var0 == 2611) {
         class70.field1070[++class60.field600 - 1] = var3.field2686;
         return 1;
      } else if (var0 == 2612) {
         class70.field1070[++class60.field600 - 1] = var3.field2693;
         return 1;
      } else if (var0 == 2613) {
         class70.field1070[++class60.field600 - 1] = var3.field2744.vmethod6130();
         return 1;
      } else if (var0 == 2614) {
         class70.field1070[++class60.field600 - 1] = var3.field2725 ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static void method202(int var0) {
      if (var0 != client.field720) {
         if (client.field720 == 0) {
            class157.field2037.method873();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45) {
            client.field677 = 0;
            client.field678 = 0;
            client.field679 = 0;
            client.field904.method5503(var0);
            if (var0 != 20) {
               class30.method577(false);
            }
         }

         if (var0 != 20 && var0 != 40 && class52.field524 != null) {
            class52.field524.vmethod3558();
            class52.field524 = null;
         }

         if (client.field720 == 25) {
            client.field700 = 0;
            client.field696 = 0;
            client.field697 = 1;
            client.field753 = 0;
            client.field909 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               class20.method317(class12.field99, class154.field2002, true, client.field720 == 11 ? 4 : 0);
            } else if (var0 == 11) {
               class20.method317(class12.field99, class154.field2002, false, 4);
            } else if (class79.field1174) {
               class79.field1149 = null;
               class307.field3801 = null;
               class6.field44 = null;
               class79.field1145 = null;
               class79.field1146 = null;
               class265.field3401 = null;
               class79.field1147 = null;
               class185.field2417 = null;
               class132.field1861 = null;
               class78.field1137 = null;
               class111.field1490 = null;
               class10.field81 = null;
               class50.field513 = null;
               class10.field77 = null;
               class79.field1151 = null;
               class58.field583 = null;
               class161.field2048 = null;
               class69.field1047 = null;
               class62.field640 = null;
               class32.field322 = null;
               class19.field182 = null;
               class19.field183 = null;
               class180.method3732(2);
               class227.method4642(true);
               class79.field1174 = false;
            }
         } else {
            class20.method317(class12.field99, class154.field2002, true, 0);
         }

         client.field720 = var0;
      }
   }

   static final void method203(int var0, int var1, int var2, int var3, int var4) {
      class194.field2465[0].method6143(var0, var1);
      class194.field2465[1].method6143(var0, var3 + var1 - 16);
      class319.method6047(var0, var1 + 16, 16, var3 - 32, client.field917);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      class319.method6047(var0, var6 + var1 + 16, 16, var5, client.field778);
      class319.method6054(var0, var6 + var1 + 16, var5, client.field709);
      class319.method6054(var0 + 1, var6 + var1 + 16, var5, client.field709);
      class319.method6098(var0, var6 + var1 + 16, 16, client.field709);
      class319.method6098(var0, var6 + var1 + 17, 16, client.field709);
      class319.method6054(var0 + 15, var6 + var1 + 16, var5, client.field883);
      class319.method6054(var0 + 14, var6 + var1 + 17, var5 - 1, client.field883);
      class319.method6098(var0, var6 + var5 + var1 + 15, 16, client.field883);
      class319.method6098(var0 + 1, var6 + var5 + var1 + 14, 15, client.field883);
   }

   static void method182() {
      if (class140.field1933 != null) {
         client.field914 = client.field655;
         class140.field1933.method4983();

         for(int var0 = 0; var0 < client.field698.length; ++var0) {
            if (client.field698[var0] != null) {
               class140.field1933.method4982((client.field698[var0].field953 >> 7) + class49.field490, (client.field698[var0].field999 >> 7) + class11.field91);
            }
         }
      }

   }
}
