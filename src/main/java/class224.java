public class class224 extends class107 {
   class220 field2616;
   NodeDeque field2615 = new NodeDeque();
   class90 field2617 = new class90();

   class224(class220 var1) {
      this.field2616 = var1;
   }

   void method4600(class221 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field2616.field2548[var1.field2585] & 4) != 0 && var1.field2577 < 0) {
         int var6 = this.field2616.field2546[var1.field2585] / class97.field1377;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field2567) / var6;
            if (var7 > var4) {
               var1.field2567 += var6 * var4;
               break;
            }

            var1.field2581.vmethod4620(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field2567 += var7 * var6 - 1048576;
            int var8 = class97.field1377 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            class105 var10 = var1.field2581;
            if (this.field2616.field2540[var1.field2585] == 0) {
               var1.field2581 = class105.method2469(var1.field2565, var10.method2466(), var10.method2475(), var10.method2476());
            } else {
               var1.field2581 = class105.method2469(var1.field2565, var10.method2466(), 0, var10.method2476());
               this.field2616.method4408(var1, var1.field2571.field2601[var1.field2568] < 0);
               var1.field2581.method2572(var8, var10.method2475());
            }

            if (var1.field2571.field2601[var1.field2568] < 0) {
               var1.field2581.method2471(-1);
            }

            var10.method2482(var8);
            var10.vmethod4620(var2, var3, var5 - var3);
            if (var10.method2486()) {
               this.field2617.method2215(var10);
            }
         }
      }

      var1.field2581.vmethod4620(var2, var3, var4);
   }

   void method4603(class221 var1, int var2) {
      if ((this.field2616.field2548[var1.field2585] & 4) != 0 && var1.field2577 < 0) {
         int var3 = this.field2616.field2546[var1.field2585] / class97.field1377;
         int var4 = (var3 + 1048575 - var1.field2567) / var3;
         var1.field2567 = var3 * var2 + var1.field2567 & 1048575;
         if (var4 <= var2) {
            if (this.field2616.field2540[var1.field2585] == 0) {
               var1.field2581 = class105.method2469(var1.field2565, var1.field2581.method2466(), var1.field2581.method2475(), var1.field2581.method2476());
            } else {
               var1.field2581 = class105.method2469(var1.field2565, var1.field2581.method2466(), 0, var1.field2581.method2476());
               this.field2616.method4408(var1, var1.field2571.field2601[var1.field2568] < 0);
            }

            if (var1.field2571.field2601[var1.field2568] < 0) {
               var1.field2581.method2471(-1);
            }

            var2 = var1.field2567 / var3;
         }
      }

      var1.field2581.vmethod4601(var2);
   }

   protected class107 vmethod4596() {
      class221 var1 = (class221)this.field2615.method4298();
      if (var1 == null) {
         return null;
      } else {
         return (class107)(var1.field2581 != null ? var1.field2581 : this.vmethod4598());
      }
   }

   protected class107 vmethod4598() {
      class221 var1;
      do {
         var1 = (class221)this.field2615.method4283();
         if (var1 == null) {
            return null;
         }
      } while(var1.field2581 == null);

      return var1.field2581;
   }

   protected int vmethod4609() {
      return 0;
   }

   protected void vmethod4620(int[] var1, int var2, int var3) {
      this.field2617.vmethod4620(var1, var2, var3);

      for(class221 var6 = (class221)this.field2615.method4298(); var6 != null; var6 = (class221)this.field2615.method4283()) {
         if (!this.field2616.method4429(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field2576) {
                  this.method4600(var6, var1, var4, var5, var4 + var5);
                  var6.field2576 -= var5;
                  break;
               }

               this.method4600(var6, var1, var4, var6.field2576, var4 + var5);
               var4 += var6.field2576;
               var5 -= var6.field2576;
            } while(!this.field2616.method4508(var6, var1, var4, var5));
         }
      }

   }

   protected void vmethod4601(int var1) {
      this.field2617.vmethod4601(var1);

      for(class221 var3 = (class221)this.field2615.method4298(); var3 != null; var3 = (class221)this.field2615.method4283()) {
         if (!this.field2616.method4429(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field2576) {
                  this.method4603(var3, var2);
                  var3.field2576 -= var2;
                  break;
               }

               this.method4603(var3, var3.field2576);
               var2 -= var3.field2576;
            } while(!this.field2616.method4508(var3, (int[])null, 0, var2));
         }
      }

   }

   static int method4625(int var0, class86 var1, boolean var2) {
      String var3;
      if (var0 == 3100) {
         var3 = class70.field1065[--class70.field1072];
         class59.method1163(0, "", var3);
         return 1;
      } else if (var0 == 3101) {
         class60.field600 -= 2;
         class34.method617(class69.field1063, class70.field1070[class60.field600], class70.field1070[class60.field600 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!class70.field1079) {
            class70.field1078 = true;
         }

         return 1;
      } else {
         int var10;
         if (var0 == 3104) {
            var3 = class70.field1065[--class70.field1072];
            var10 = 0;
            if (class219.method4375(var3)) {
               var10 = class172.method3663(var3);
            }

            class174 var12 = class131.method3243(class171.field2260, client.field690.field1282);
            var12.field2332.method3921(var10);
            client.field690.method2193(var12);
            return 1;
         } else {
            class174 var14;
            if (var0 == 3105) {
               var3 = class70.field1065[--class70.field1072];
               var14 = class131.method3243(class171.field2302, client.field690.field1282);
               var14.field2332.method3805(var3.length() + 1);
               var14.field2332.method3889(var3);
               client.field690.method2193(var14);
               return 1;
            } else if (var0 == 3106) {
               var3 = class70.field1065[--class70.field1072];
               var14 = class131.method3243(class171.field2215, client.field690.field1282);
               var14.field2332.method3805(var3.length() + 1);
               var14.field2332.method3889(var3);
               client.field690.method2193(var14);
               return 1;
            } else {
               String var7;
               int var15;
               if (var0 == 3107) {
                  var15 = class70.field1070[--class60.field600];
                  var7 = class70.field1065[--class70.field1072];
                  class36.method691(var15, var7);
                  return 1;
               } else if (var0 == 3108) {
                  class60.field600 -= 3;
                  var15 = class70.field1070[class60.field600];
                  var10 = class70.field1070[class60.field600 + 1];
                  int var9 = class70.field1070[class60.field600 + 2];
                  class232 var13 = class18.method213(var9);
                  class134.method3262(var13, var15, var10);
                  return 1;
               } else if (var0 == 3109) {
                  class60.field600 -= 2;
                  var15 = class70.field1070[class60.field600];
                  var10 = class70.field1070[class60.field600 + 1];
                  class232 var11 = var2 ? class10.field75 : class70.field1080;
                  class134.method3262(var11, var15, var10);
                  return 1;
               } else if (var0 == 3110) {
                  class14.field132 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class70.field1070[++class60.field600 - 1] = class47.field435.field1029 ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class47.field435.field1029 = class70.field1070[--class60.field600] == 1;
                  class61.method1202();
                  return 1;
               } else if (var0 == 3113) {
                  var3 = class70.field1065[--class70.field1072];
                  boolean var4 = class70.field1070[--class60.field600] == 1;
                  class138.method3291(var3, var4, false);
                  return 1;
               } else if (var0 == 3115) {
                  var15 = class70.field1070[--class60.field600];
                  var14 = class131.method3243(class171.field2249, client.field690.field1282);
                  var14.field2332.method3754(var15);
                  client.field690.method2193(var14);
                  return 1;
               } else if (var0 == 3116) {
                  var15 = class70.field1070[--class60.field600];
                  class70.field1072 -= 2;
                  var7 = class70.field1065[class70.field1072];
                  String var5 = class70.field1065[class70.field1072 + 1];
                  if (var7.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     class174 var6 = class131.method3243(class171.field2223, client.field690.field1282);
                     var6.field2332.method3754(1 + class97.method2404(var7) + class97.method2404(var5));
                     var6.field2332.method3889(var7);
                     var6.field2332.method3805(var15);
                     var6.field2332.method3889(var5);
                     client.field690.method2193(var6);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  client.field789 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3118) {
                  client.field791 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field762 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (class70.field1070[--class60.field600] == 1) {
                     client.field676 |= 1;
                  } else {
                     client.field676 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (class70.field1070[--class60.field600] == 1) {
                     client.field676 |= 2;
                  } else {
                     client.field676 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (class70.field1070[--class60.field600] == 1) {
                     client.field676 |= 4;
                  } else {
                     client.field676 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class70.field1070[--class60.field600] == 1) {
                     client.field676 |= 8;
                  } else {
                     client.field676 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field676 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  client.field748 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field758 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  class74.method1993(class70.field1070[--class60.field600] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  class70.field1070[++class60.field600 - 1] = class59.method1164() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class60.field600 -= 2;
                  client.field723 = class70.field1070[class60.field600];
                  client.field724 = class70.field1070[class60.field600 + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class60.field600 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class60.field600;
                  return 1;
               } else if (var0 == 3132) {
                  class70.field1070[++class60.field600 - 1] = class68.field1038;
                  class70.field1070[++class60.field600 - 1] = class141.field1937;
                  return 1;
               } else if (var0 == 3133) {
                  --class60.field600;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class60.field600 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field805 = 3;
                  client.field642 = class70.field1070[--class60.field600];
                  return 1;
               } else if (var0 == 3137) {
                  client.field805 = 2;
                  client.field642 = class70.field1070[--class60.field600];
                  return 1;
               } else if (var0 == 3138) {
                  client.field805 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field805 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field805 = 3;
                  client.field642 = var2 ? class10.field75.field2770 : class70.field1080.field2770;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = class70.field1070[--class60.field600] == 1;
                     class47.field435.field1033 = var8;
                     class61.method1202();
                     return 1;
                  } else if (var0 == 3142) {
                     class70.field1070[++class60.field600 - 1] = class47.field435.field1033 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = class70.field1070[--class60.field600] == 1;
                     client.field746 = var8;
                     if (!var8) {
                        class47.field435.field1034 = "";
                        class61.method1202();
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     class70.field1070[++class60.field600 - 1] = client.field746 ? 1 : 0;
                     return 1;
                  } else {
                     return var0 == 3145 ? 1 : 2;
                  }
               }
            }
         }
      }
   }
}
