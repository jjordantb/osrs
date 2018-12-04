public class class255 extends class208 {
   public static class249 field3301;
   static class202 field3298 = new class202(64);
   public int field3299 = 0;

   void method5004(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5006(var1, var2);
      }
   }

   void method5006(class184 var1, int var2) {
      if (var2 == 2) {
         this.field3299 = var1.method3771();
      }

   }

   static final void method5017(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class127 var8, class166[] var9) {
      class184 var10 = new class184(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method3784();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method3783();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method3983();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               class270 var21 = class253.method4993(var11);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.field3501;
               int var28 = var21.field3475;
               int var29;
               if ((var20 & 1) == 1) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (var26 == 2) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var32 = var16 & 7;
               int var33 = var15 & 7;
               int var35 = var21.field3501;
               int var36 = var21.field3475;
               int var37;
               if ((var20 & 1) == 1) {
                  var37 = var35;
                  var35 = var36;
                  var36 = var37;
               }

               int var34 = var7 & 3;
               int var31;
               if (var34 == 0) {
                  var31 = var33;
               } else if (var34 == 1) {
                  var31 = 7 - var32 - (var35 - 1);
               } else if (var34 == 2) {
                  var31 = 7 - var33 - (var36 - 1);
               } else {
                  var31 = var32;
               }

               var37 = var3 + var31;
               if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
                  int var38 = var1;
                  if ((class50.field492[1][var29][var37] & 2) == 2) {
                     var38 = var1 - 1;
                  }

                  class166 var39 = null;
                  if (var38 >= 0) {
                     var39 = var9[var38];
                  }

                  class23.method381(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
               }
            }
         }
      }
   }

   static final void method5016(String var0) {
      class174 var1 = class131.method3243(class171.field2278, client.field690.field1282);
      var1.field2332.method3805(class97.method2404(var0));
      var1.field2332.method3889(var0);
      client.field690.method2193(var1);
   }
}
