public class class262 extends class208 {
   public static class249 field3378;
   public static class249 field3367;
   public static int field3368;
   static class202 field3369 = new class202(64);
   public int field3366 = -1;
   int[] field3371;
   short[] field3370;
   short[] field3373;
   short[] field3374;
   short[] field3372;
   int[] field3376 = new int[]{-1, -1, -1, -1, -1};
   public boolean field3377 = false;

   void method5128(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5133(var1, var2);
      }
   }

   void method5133(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3366 = var1.method3983();
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.method3983();
            this.field3371 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3371[var4] = var1.method3771();
            }
         } else if (var2 == 3) {
            this.field3377 = true;
         } else if (var2 == 40) {
            var3 = var1.method3983();
            this.field3370 = new short[var3];
            this.field3373 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3370[var4] = (short)var1.method3771();
               this.field3373[var4] = (short)var1.method3771();
            }
         } else if (var2 == 41) {
            var3 = var1.method3983();
            this.field3374 = new short[var3];
            this.field3372 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3374[var4] = (short)var1.method3771();
               this.field3372[var4] = (short)var1.method3771();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field3376[var2 - 60] = var1.method3771();
         }
      }

   }

   public boolean method5130() {
      if (this.field3371 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3371.length; ++var2) {
            if (!field3367.method4830(this.field3371[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public class115 method5127() {
      if (this.field3371 == null) {
         return null;
      } else {
         class115[] var1 = new class115[this.field3371.length];

         for(int var2 = 0; var2 < this.field3371.length; ++var2) {
            var1[var2] = class115.method2843(field3367, this.field3371[var2], 0);
         }

         class115 var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new class115(var1, var1.length);
         }

         int var3;
         if (this.field3370 != null) {
            for(var3 = 0; var3 < this.field3370.length; ++var3) {
               var4.method2775(this.field3370[var3], this.field3373[var3]);
            }
         }

         if (this.field3374 != null) {
            for(var3 = 0; var3 < this.field3374.length; ++var3) {
               var4.method2785(this.field3374[var3], this.field3372[var3]);
            }
         }

         return var4;
      }
   }

   public boolean method5131() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.field3376[var2] != -1 && !field3367.method4830(this.field3376[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   public class115 method5132() {
      class115[] var1 = new class115[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field3376[var3] != -1) {
            var1[var2++] = class115.method2843(field3367, this.field3376[var3], 0);
         }
      }

      class115 var5 = new class115(var1, var2);
      int var4;
      if (this.field3370 != null) {
         for(var4 = 0; var4 < this.field3370.length; ++var4) {
            var5.method2775(this.field3370[var4], this.field3373[var4]);
         }
      }

      if (this.field3374 != null) {
         for(var4 = 0; var4 < this.field3374.length; ++var4) {
            var5.method2785(this.field3374[var4], this.field3372[var4]);
         }
      }

      return var5;
   }

   static final void method5145(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class166[] var8) {
      int var10;
      for(int var9 = 0; var9 < 8; ++var9) {
         for(var10 = 0; var10 < 8; ++var10) {
            if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
               var8[var1].field2101[var9 + var2][var3 + var10] &= -16777217;
            }
         }
      }

      class184 var28 = new class184(var0);

      for(var10 = 0; var10 < 4; ++var10) {
         for(int var11 = 0; var11 < 64; ++var11) {
            for(int var12 = 0; var12 < 64; ++var12) {
               if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
                  int var17 = var11 & 7;
                  int var18 = var12 & 7;
                  int var19 = var7 & 3;
                  int var16;
                  if (var19 == 0) {
                     var16 = var17;
                  } else if (var19 == 1) {
                     var16 = var18;
                  } else if (var19 == 2) {
                     var16 = 7 - var17;
                  } else {
                     var16 = 7 - var18;
                  }

                  int var22 = var2 + var16;
                  int var25 = var11 & 7;
                  int var26 = var12 & 7;
                  int var27 = var7 & 3;
                  int var24;
                  if (var27 == 0) {
                     var24 = var26;
                  } else if (var27 == 1) {
                     var24 = 7 - var25;
                  } else if (var27 == 2) {
                     var24 = 7 - var26;
                  } else {
                     var24 = var25;
                  }

                  class126.method3053(var28, var1, var22, var3 + var24, 0, 0, var7);
               } else {
                  class126.method3053(var28, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }
}
