public class class269 extends class208 {
   public static class249 field3447;
   public static class249 field3439;
   public static class202 field3429 = new class202(64);
   public static class202 field3430 = new class202(64);
   public static class202 field3434 = new class202(20);
   int field3440 = -1;
   public int field3435 = 16777215;
   public int field3428 = 70;
   int field3437 = -1;
   int field3438 = -1;
   int field3427 = -1;
   int field3436 = -1;
   public int field3441 = 0;
   public int field3431 = 0;
   public int field3442 = -1;
   String field3444 = "";
   public int field3445 = -1;
   public int field3446 = 0;
   public int[] field3443;
   int field3448 = -1;
   int field3449 = -1;

   void method5234(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5235(var1, var2);
      }
   }

   void method5235(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3440 = var1.method3898();
      } else if (var2 == 2) {
         this.field3435 = var1.method3773();
      } else if (var2 == 3) {
         this.field3437 = var1.method3898();
      } else if (var2 == 4) {
         this.field3427 = var1.method3898();
      } else if (var2 == 5) {
         this.field3438 = var1.method3898();
      } else if (var2 == 6) {
         this.field3436 = var1.method3898();
      } else if (var2 == 7) {
         this.field3441 = var1.method3814();
      } else if (var2 == 8) {
         this.field3444 = var1.method3779();
      } else if (var2 == 9) {
         this.field3428 = var1.method3771();
      } else if (var2 == 10) {
         this.field3431 = var1.method3814();
      } else if (var2 == 11) {
         this.field3442 = 0;
      } else if (var2 == 12) {
         this.field3445 = var1.method3983();
      } else if (var2 == 13) {
         this.field3446 = var1.method3814();
      } else if (var2 == 14) {
         this.field3442 = var1.method3771();
      } else if (var2 == 17 || var2 == 18) {
         this.field3448 = var1.method3771();
         if (this.field3448 == 65535) {
            this.field3448 = -1;
         }

         this.field3449 = var1.method3771();
         if (this.field3449 == 65535) {
            this.field3449 = -1;
         }

         int var3 = -1;
         if (var2 == 18) {
            var3 = var1.method3771();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         int var4 = var1.method3983();
         this.field3443 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3443[var5] = var1.method3771();
            if (this.field3443[var5] == 65535) {
               this.field3443[var5] = -1;
            }
         }

         this.field3443[var4 + 1] = var3;
      }

   }

   public final class269 method5268() {
      int var1 = -1;
      if (this.field3448 != -1) {
         var1 = class97.method2405(this.field3448);
      } else if (this.field3449 != -1) {
         var1 = class227.field2629[this.field3449];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field3443.length - 1) {
         var2 = this.field3443[var1];
      } else {
         var2 = this.field3443[this.field3443.length - 1];
      }

      return var2 != -1 ? class221.method4528(var2) : null;
   }

   public String method5252(int var1) {
      String var2 = this.field3444;

      while(true) {
         int var3 = var2.indexOf("%1");
         if (var3 < 0) {
            return var2;
         }

         var2 = var2.substring(0, var3) + class33.method616(var1, false) + var2.substring(var3 + 2);
      }
   }

   public class323 method5266() {
      if (this.field3437 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3430.method4198((long)this.field3437);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3447, this.field3437, 0);
            if (var1 != null) {
               field3430.method4204(var1, (long)this.field3437);
            }

            return var1;
         }
      }
   }

   public class323 method5236() {
      if (this.field3438 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3430.method4198((long)this.field3438);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3447, this.field3438, 0);
            if (var1 != null) {
               field3430.method4204(var1, (long)this.field3438);
            }

            return var1;
         }
      }
   }

   public class323 method5243() {
      if (this.field3427 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3430.method4198((long)this.field3427);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3447, this.field3427, 0);
            if (var1 != null) {
               field3430.method4204(var1, (long)this.field3427);
            }

            return var1;
         }
      }
   }

   public class323 method5241() {
      if (this.field3436 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3430.method4198((long)this.field3436);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3447, this.field3436, 0);
            if (var1 != null) {
               field3430.method4204(var1, (long)this.field3436);
            }

            return var1;
         }
      }
   }

   public class300 method5257() {
      if (this.field3440 == -1) {
         return null;
      } else {
         class300 var1 = (class300)field3434.method4198((long)this.field3440);
         if (var1 != null) {
            return var1;
         } else {
            class249 var3 = field3447;
            class249 var4 = field3439;
            int var5 = this.field3440;
            class300 var2;
            if (!class17.method212(var3, var5, 0)) {
               var2 = null;
            } else {
               byte[] var7 = var4.method4831(var5, 0);
               class300 var6;
               if (var7 == null) {
                  var6 = null;
               } else {
                  class300 var8 = new class300(var7, class324.field3890, class324.field3892, class324.field3895, class258.field3334, class324.field3894, class324.field3897);
                  class324.field3890 = null;
                  class324.field3892 = null;
                  class324.field3895 = null;
                  class258.field3334 = null;
                  class324.field3894 = null;
                  class324.field3897 = null;
                  var6 = var8;
               }

               var2 = var6;
            }

            if (var2 != null) {
               field3434.method4204(var2, (long)this.field3440);
            }

            return var2;
         }
      }
   }

   static double method5267(double var0) {
      return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   static final int method5238(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }

   static final void method5255(String var0) {
      if (!var0.equals("")) {
         class174 var1 = class131.method3243(class171.field2291, client.field690.field1282);
         var1.field2332.method3805(class97.method2404(var0));
         var1.field2332.method3889(var0);
         client.field690.method2193(var1);
      }
   }
}
