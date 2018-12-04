public class class257 extends class208 {
   public static class249 field3309;
   public static class257[] field3310;
   public static int field3331;
   public static class202 field3314 = new class202(256);
   public final int field3313;
   public int field3315 = -1;
   int field3311 = -1;
   public String field3316;
   public int field3327;
   public int field3318 = 0;
   public String[] field3320 = new String[5];
   public String field3321;
   int[] field3322;
   int field3323 = Integer.MAX_VALUE;
   int field3326 = Integer.MAX_VALUE;
   int field3325 = Integer.MIN_VALUE;
   int field3332 = Integer.MIN_VALUE;
   public class272 field3324;
   public class254 field3328;
   int[] field3329;
   byte[] field3330;
   public int field3317;

   public class257(int var1) {
      this.field3324 = class272.field3559;
      this.field3328 = class254.field3291;
      this.field3317 = -1;
      this.field3313 = var1;
   }

   public void method5053(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5044(var1, var2);
      }
   }

   void method5044(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3315 = var1.method3898();
      } else if (var2 == 2) {
         this.field3311 = var1.method3898();
      } else if (var2 == 3) {
         this.field3316 = var1.method3778();
      } else if (var2 == 4) {
         this.field3327 = var1.method3773();
      } else if (var2 == 5) {
         var1.method3773();
      } else if (var2 == 6) {
         this.field3318 = var1.method3983();
      } else {
         int var3;
         if (var2 == 7) {
            var3 = var1.method3983();
            if ((var3 & 1) == 0) {
               ;
            }

            if ((var3 & 2) == 2) {
               ;
            }
         } else if (var2 == 8) {
            var1.method3983();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field3320[var2 - 10] = var1.method3778();
         } else if (var2 == 15) {
            var3 = var1.method3983();
            this.field3322 = new int[var3 * 2];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field3322[var4] = var1.method3814();
            }

            var1.method3892();
            var4 = var1.method3983();
            this.field3329 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field3329.length; ++var5) {
               this.field3329[var5] = var1.method3892();
            }

            this.field3330 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field3330[var5] = var1.method3931();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field3321 = var1.method3778();
            } else if (var2 == 18) {
               var1.method3898();
            } else if (var2 == 19) {
               this.field3317 = var1.method3771();
            } else if (var2 == 21) {
               var1.method3892();
            } else if (var2 == 22) {
               var1.method3892();
            } else if (var2 == 23) {
               var1.method3983();
               var1.method3983();
               var1.method3983();
            } else if (var2 == 24) {
               var1.method3814();
               var1.method3814();
            } else if (var2 == 25) {
               var1.method3898();
            } else if (var2 == 28) {
               var1.method3983();
            } else if (var2 == 29) {
               this.field3324 = (class272)class43.method791(class243.method4797(), var1.method3983());
            } else if (var2 == 30) {
               class254[] var6 = new class254[]{class254.field3296, class254.field3291, class254.field3290};
               this.field3328 = (class254)class43.method791(var6, var1.method3983());
            }
         }
      }

   }

   public void method5043() {
      if (this.field3322 != null) {
         for(int var1 = 0; var1 < this.field3322.length; var1 += 2) {
            if (this.field3322[var1] < this.field3323) {
               this.field3323 = this.field3322[var1];
            } else if (this.field3322[var1] > this.field3325) {
               this.field3325 = this.field3322[var1];
            }

            if (this.field3322[var1 + 1] < this.field3326) {
               this.field3326 = this.field3322[var1 + 1];
            } else if (this.field3322[var1 + 1] > this.field3332) {
               this.field3332 = this.field3322[var1 + 1];
            }
         }
      }

   }

   public class323 method5064(boolean var1) {
      int var2 = this.field3315;
      return this.method5045(var2);
   }

   class323 method5045(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class323 var2 = (class323)field3314.method4198((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class145.method3349(field3309, var1, 0);
            if (var2 != null) {
               field3314.method4204(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   public int method5046() {
      return this.field3313;
   }

   public static void method5066(class249 var0, class249 var1, boolean var2) {
      class270.field3450 = var0;
      class270.field3452 = var1;
      class270.field3454 = var2;
   }

   public static class322 method5047(class249 var0, String var1, String var2) {
      int var3 = var0.method4825(var1);
      int var4 = var0.method4847(var3, var2);
      return class156.method3443(var0, var3, var4);
   }

   static final void method5065(int var0, int var1, int var2, int var3, class323 var4, class226 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = client.field658 & 2047;
         int var8 = class124.field1747[var7];
         int var9 = class124.field1754[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field2626 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class12.field98.method6167(var15 + (var0 + var5.field2626 / 2 - var17 / 2), var5.field2621 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class56.method1111(var0, var1, var2, var3, var4, var5);
      }

   }
}
