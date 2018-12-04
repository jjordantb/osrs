public class class258 extends class208 {
   public static class249 field3336;
   static class202 field3335 = new class202(64);
   public static int[] field3334;
   public boolean field3337 = false;

   void method5068(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5069(var1, var2);
      }
   }

   void method5069(class184 var1, int var2) {
      if (var2 == 2) {
         this.field3337 = true;
      }

   }

   static int method5073(int var0, class86 var1, boolean var2) {
      if (var0 == 5000) {
         class70.field1070[++class60.field600 - 1] = client.field730;
         return 1;
      } else if (var0 == 5001) {
         class60.field600 -= 3;
         client.field730 = class70.field1070[class60.field600];
         class274.field3613 = class51.method1060(class70.field1070[class60.field600 + 1]);
         if (class274.field3613 == null) {
            class274.field3613 = class309.field3805;
         }

         client.field861 = class70.field1070[class60.field600 + 2];
         class174 var18 = class131.method3243(class171.field2253, client.field690.field1282);
         var18.field2332.method3805(client.field730);
         var18.field2332.method3805(class274.field3613.field3807);
         var18.field2332.method3805(client.field861);
         client.field690.method2193(var18);
         return 1;
      } else {
         String var3;
         int var4;
         if (var0 == 5002) {
            var3 = class70.field1065[--class70.field1072];
            class60.field600 -= 2;
            var4 = class70.field1070[class60.field600];
            int var5 = class70.field1070[class60.field600 + 1];
            class174 var6 = class131.method3243(class171.field2245, client.field690.field1282);
            var6.field2332.method3805(class97.method2404(var3) + 2);
            var6.field2332.method3889(var3);
            var6.field2332.method3805(var4 - 1);
            var6.field2332.method3805(var5);
            client.field690.method2193(var6);
            return 1;
         } else {
            int var10;
            if (var0 == 5003) {
               class60.field600 -= 2;
               var10 = class70.field1070[class60.field600];
               var4 = class70.field1070[class60.field600 + 1];
               class59 var15 = class48.method989(var10, var4);
               if (var15 != null) {
                  class70.field1070[++class60.field600 - 1] = var15.field595;
                  class70.field1070[++class60.field600 - 1] = var15.field589;
                  class70.field1065[++class70.field1072 - 1] = var15.field591 != null ? var15.field591 : "";
                  class70.field1065[++class70.field1072 - 1] = var15.field596 != null ? var15.field596 : "";
                  class70.field1065[++class70.field1072 - 1] = var15.field588 != null ? var15.field588 : "";
                  class70.field1070[++class60.field600 - 1] = var15.method1136() ? 1 : (var15.method1133() ? 2 : 0);
               } else {
                  class70.field1070[++class60.field600 - 1] = -1;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5004) {
               var10 = class70.field1070[--class60.field600];
               class59 var16 = class11.method119(var10);
               if (var16 != null) {
                  class70.field1070[++class60.field600 - 1] = var16.field597;
                  class70.field1070[++class60.field600 - 1] = var16.field589;
                  class70.field1065[++class70.field1072 - 1] = var16.field591 != null ? var16.field591 : "";
                  class70.field1065[++class70.field1072 - 1] = var16.field596 != null ? var16.field596 : "";
                  class70.field1065[++class70.field1072 - 1] = var16.field588 != null ? var16.field588 : "";
                  class70.field1070[++class60.field600 - 1] = var16.method1136() ? 1 : (var16.method1133() ? 2 : 0);
               } else {
                  class70.field1070[++class60.field600 - 1] = -1;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 5005) {
               if (class274.field3613 == null) {
                  class70.field1070[++class60.field600 - 1] = -1;
               } else {
                  class70.field1070[++class60.field600 - 1] = class274.field3613.field3807;
               }

               return 1;
            } else if (var0 == 5008) {
               var3 = class70.field1065[--class70.field1072];
               var4 = class70.field1070[--class60.field600];
               String var14 = var3.toLowerCase();
               byte var17 = 0;
               if (var14.startsWith("yellow:")) {
                  var17 = 0;
                  var3 = var3.substring("yellow:".length());
               } else if (var14.startsWith("red:")) {
                  var17 = 1;
                  var3 = var3.substring("red:".length());
               } else if (var14.startsWith("green:")) {
                  var17 = 2;
                  var3 = var3.substring("green:".length());
               } else if (var14.startsWith("cyan:")) {
                  var17 = 3;
                  var3 = var3.substring("cyan:".length());
               } else if (var14.startsWith("purple:")) {
                  var17 = 4;
                  var3 = var3.substring("purple:".length());
               } else if (var14.startsWith("white:")) {
                  var17 = 5;
                  var3 = var3.substring("white:".length());
               } else if (var14.startsWith("flash1:")) {
                  var17 = 6;
                  var3 = var3.substring("flash1:".length());
               } else if (var14.startsWith("flash2:")) {
                  var17 = 7;
                  var3 = var3.substring("flash2:".length());
               } else if (var14.startsWith("flash3:")) {
                  var17 = 8;
                  var3 = var3.substring("flash3:".length());
               } else if (var14.startsWith("glow1:")) {
                  var17 = 9;
                  var3 = var3.substring("glow1:".length());
               } else if (var14.startsWith("glow2:")) {
                  var17 = 10;
                  var3 = var3.substring("glow2:".length());
               } else if (var14.startsWith("glow3:")) {
                  var17 = 11;
                  var3 = var3.substring("glow3:".length());
               } else if (client.field785 != 0) {
                  if (var14.startsWith("yellow:")) {
                     var17 = 0;
                     var3 = var3.substring("yellow:".length());
                  } else if (var14.startsWith("red:")) {
                     var17 = 1;
                     var3 = var3.substring("red:".length());
                  } else if (var14.startsWith("green:")) {
                     var17 = 2;
                     var3 = var3.substring("green:".length());
                  } else if (var14.startsWith("cyan:")) {
                     var17 = 3;
                     var3 = var3.substring("cyan:".length());
                  } else if (var14.startsWith("purple:")) {
                     var17 = 4;
                     var3 = var3.substring("purple:".length());
                  } else if (var14.startsWith("white:")) {
                     var17 = 5;
                     var3 = var3.substring("white:".length());
                  } else if (var14.startsWith("flash1:")) {
                     var17 = 6;
                     var3 = var3.substring("flash1:".length());
                  } else if (var14.startsWith("flash2:")) {
                     var17 = 7;
                     var3 = var3.substring("flash2:".length());
                  } else if (var14.startsWith("flash3:")) {
                     var17 = 8;
                     var3 = var3.substring("flash3:".length());
                  } else if (var14.startsWith("glow1:")) {
                     var17 = 9;
                     var3 = var3.substring("glow1:".length());
                  } else if (var14.startsWith("glow2:")) {
                     var17 = 10;
                     var3 = var3.substring("glow2:".length());
                  } else if (var14.startsWith("glow3:")) {
                     var17 = 11;
                     var3 = var3.substring("glow3:".length());
                  }
               }

               var14 = var3.toLowerCase();
               byte var7 = 0;
               if (var14.startsWith("wave:")) {
                  var7 = 1;
                  var3 = var3.substring("wave:".length());
               } else if (var14.startsWith("wave2:")) {
                  var7 = 2;
                  var3 = var3.substring("wave2:".length());
               } else if (var14.startsWith("shake:")) {
                  var7 = 3;
                  var3 = var3.substring("shake:".length());
               } else if (var14.startsWith("scroll:")) {
                  var7 = 4;
                  var3 = var3.substring("scroll:".length());
               } else if (var14.startsWith("slide:")) {
                  var7 = 5;
                  var3 = var3.substring("slide:".length());
               } else if (client.field785 != 0) {
                  if (var14.startsWith("wave:")) {
                     var7 = 1;
                     var3 = var3.substring("wave:".length());
                  } else if (var14.startsWith("wave2:")) {
                     var7 = 2;
                     var3 = var3.substring("wave2:".length());
                  } else if (var14.startsWith("shake:")) {
                     var7 = 3;
                     var3 = var3.substring("shake:".length());
                  } else if (var14.startsWith("scroll:")) {
                     var7 = 4;
                     var3 = var3.substring("scroll:".length());
                  } else if (var14.startsWith("slide:")) {
                     var7 = 5;
                     var3 = var3.substring("slide:".length());
                  }
               }

               class174 var8 = class131.method3243(class171.field2230, client.field690.field1282);
               var8.field2332.method3805(0);
               int var9 = var8.field2332.field2405;
               var8.field2332.method3805(var4);
               var8.field2332.method3805(var17);
               var8.field2332.method3805(var7);
               class150.method3372(var8.field2332, var3);
               var8.field2332.method3766(var8.field2332.field2405 - var9);
               client.field690.method2193(var8);
               return 1;
            } else if (var0 == 5009) {
               class70.field1072 -= 2;
               var3 = class70.field1065[class70.field1072];
               String var12 = class70.field1065[class70.field1072 + 1];
               class174 var11 = class131.method3243(class171.field2232, client.field690.field1282);
               var11.field2332.method3754(0);
               int var13 = var11.field2332.field2405;
               var11.field2332.method3889(var3);
               class150.method3372(var11.field2332, var12);
               var11.field2332.method3765(var11.field2332.field2405 - var13);
               client.field690.method2193(var11);
               return 1;
            } else if (var0 != 5015) {
               if (var0 == 5016) {
                  class70.field1070[++class60.field600 - 1] = client.field861;
                  return 1;
               } else if (var0 == 5017) {
                  var10 = class70.field1070[--class60.field600];
                  class70.field1070[++class60.field600 - 1] = class85.method2148(var10);
                  return 1;
               } else if (var0 == 5018) {
                  var10 = class70.field1070[--class60.field600];
                  class70.field1070[++class60.field600 - 1] = class32.method606(var10);
                  return 1;
               } else if (var0 == 5019) {
                  var10 = class70.field1070[--class60.field600];
                  class70.field1070[++class60.field600 - 1] = class57.method1125(var10);
                  return 1;
               } else if (var0 == 5020) {
                  var3 = class70.field1065[--class70.field1072];
                  class40.method761(var3);
                  return 1;
               } else if (var0 == 5021) {
                  client.field862 = class70.field1065[--class70.field1072].toLowerCase().trim();
                  return 1;
               } else if (var0 == 5022) {
                  class70.field1065[++class70.field1072 - 1] = client.field862;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class69.field1063 != null && class69.field1063.field625 != null) {
                  var3 = class69.field1063.field625.method5706();
               } else {
                  var3 = "";
               }

               class70.field1065[++class70.field1072 - 1] = var3;
               return 1;
            }
         }
      }
   }
}
