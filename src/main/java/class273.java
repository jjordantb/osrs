import java.security.SecureRandom;

public class class273 extends class208 {
   static class249 field3597;
   static class249 field3570;
   public static class202 field3566 = new class202(64);
   public static class202 field3567 = new class202(50);
   public int field3568;
   public String field3569 = "null";
   public int field3600 = 1;
   int[] field3571;
   int[] field3574;
   public int field3573 = -1;
   public int field3580 = -1;
   public int field3575 = -1;
   public int field3593 = -1;
   public int field3577 = -1;
   public int field3578 = -1;
   public int field3579 = -1;
   short[] field3564;
   short[] field3581;
   short[] field3582;
   short[] field3583;
   public String[] field3565 = new String[5];
   public boolean field3585 = true;
   public int field3576 = -1;
   int field3587 = 128;
   int field3588 = 128;
   public boolean field3572 = false;
   int field3590 = 0;
   int field3591 = 0;
   public int field3592 = -1;
   public int field3599 = 32;
   public int[] field3595;
   int field3594 = -1;
   int field3596 = -1;
   public boolean field3589 = true;
   public boolean field3598 = true;
   public boolean field3586 = false;
   class199 field3584;

   void method5392() {
   }

   void method5417(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5394(var1, var2);
      }
   }

   void method5394(class184 var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.method3983();
         this.field3571 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3571[var4] = var1.method3771();
         }
      } else if (var2 == 2) {
         this.field3569 = var1.method3778();
      } else if (var2 == 12) {
         this.field3600 = var1.method3983();
      } else if (var2 == 13) {
         this.field3573 = var1.method3771();
      } else if (var2 == 14) {
         this.field3593 = var1.method3771();
      } else if (var2 == 15) {
         this.field3580 = var1.method3771();
      } else if (var2 == 16) {
         this.field3575 = var1.method3771();
      } else if (var2 == 17) {
         this.field3593 = var1.method3771();
         this.field3577 = var1.method3771();
         this.field3578 = var1.method3771();
         this.field3579 = var1.method3771();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3565[var2 - 30] = var1.method3778();
         if (this.field3565[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3565[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.method3983();
         this.field3564 = new short[var3];
         this.field3581 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3564[var4] = (short)var1.method3771();
            this.field3581[var4] = (short)var1.method3771();
         }
      } else if (var2 == 41) {
         var3 = var1.method3983();
         this.field3582 = new short[var3];
         this.field3583 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3582[var4] = (short)var1.method3771();
            this.field3583[var4] = (short)var1.method3771();
         }
      } else if (var2 == 60) {
         var3 = var1.method3983();
         this.field3574 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3574[var4] = var1.method3771();
         }
      } else if (var2 == 93) {
         this.field3585 = false;
      } else if (var2 == 95) {
         this.field3576 = var1.method3771();
      } else if (var2 == 97) {
         this.field3587 = var1.method3771();
      } else if (var2 == 98) {
         this.field3588 = var1.method3771();
      } else if (var2 == 99) {
         this.field3572 = true;
      } else if (var2 == 100) {
         this.field3590 = var1.method3931();
      } else if (var2 == 101) {
         this.field3591 = var1.method3931() * 5;
      } else if (var2 == 102) {
         this.field3592 = var1.method3771();
      } else if (var2 == 103) {
         this.field3599 = var1.method3771();
      } else if (var2 != 106 && var2 != 118) {
         if (var2 == 107) {
            this.field3589 = false;
         } else if (var2 == 109) {
            this.field3598 = false;
         } else if (var2 == 111) {
            this.field3586 = true;
         } else if (var2 == 249) {
            this.field3584 = class226.method4634(var1, this.field3584);
         }
      } else {
         this.field3594 = var1.method3771();
         if (this.field3594 == 65535) {
            this.field3594 = -1;
         }

         this.field3596 = var1.method3771();
         if (this.field3596 == 65535) {
            this.field3596 = -1;
         }

         var3 = -1;
         if (var2 == 118) {
            var3 = var1.method3771();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.method3983();
         this.field3595 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3595[var5] = var1.method3771();
            if (this.field3595[var5] == 65535) {
               this.field3595[var5] = -1;
            }
         }

         this.field3595[var4 + 1] = var3;
      }

   }

   public final class121 method5414(class275 var1, int var2, class275 var3, int var4) {
      if (this.field3595 != null) {
         class273 var12 = this.method5397();
         return var12 == null ? null : var12.method5414(var1, var2, var3, var4);
      } else {
         class121 var5 = (class121)field3567.method4198((long)this.field3568);
         if (var5 == null) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field3571.length; ++var7) {
               if (!field3570.method4830(this.field3571[var7], 0)) {
                  var6 = true;
               }
            }

            if (var6) {
               return null;
            }

            class115[] var8 = new class115[this.field3571.length];

            int var9;
            for(var9 = 0; var9 < this.field3571.length; ++var9) {
               var8[var9] = class115.method2843(field3570, this.field3571[var9], 0);
            }

            class115 var11;
            if (var8.length == 1) {
               var11 = var8[0];
            } else {
               var11 = new class115(var8, var8.length);
            }

            if (this.field3564 != null) {
               for(var9 = 0; var9 < this.field3564.length; ++var9) {
                  var11.method2775(this.field3564[var9], this.field3581[var9]);
               }
            }

            if (this.field3582 != null) {
               for(var9 = 0; var9 < this.field3582.length; ++var9) {
                  var11.method2785(this.field3582[var9], this.field3583[var9]);
               }
            }

            var5 = var11.method2772(this.field3590 + 64, this.field3591 + 850, -30, -50, -30);
            field3567.method4204(var5, (long)this.field3568);
         }

         class121 var10;
         if (var1 != null && var3 != null) {
            var10 = var1.method5459(var5, var2, var3, var4);
         } else if (var1 != null) {
            var10 = var1.method5457(var5, var2);
         } else if (var3 != null) {
            var10 = var3.method5457(var5, var4);
         } else {
            var10 = var5.method2869(true);
         }

         if (this.field3587 != 128 || this.field3588 != 128) {
            var10.method2878(this.field3587, this.field3588, this.field3587);
         }

         return var10;
      }
   }

   public final class115 method5430() {
      if (this.field3595 != null) {
         class273 var1 = this.method5397();
         return var1 == null ? null : var1.method5430();
      } else if (this.field3574 == null) {
         return null;
      } else {
         boolean var5 = false;

         for(int var2 = 0; var2 < this.field3574.length; ++var2) {
            if (!field3570.method4830(this.field3574[var2], 0)) {
               var5 = true;
            }
         }

         if (var5) {
            return null;
         } else {
            class115[] var6 = new class115[this.field3574.length];

            for(int var3 = 0; var3 < this.field3574.length; ++var3) {
               var6[var3] = class115.method2843(field3570, this.field3574[var3], 0);
            }

            class115 var7;
            if (var6.length == 1) {
               var7 = var6[0];
            } else {
               var7 = new class115(var6, var6.length);
            }

            int var4;
            if (this.field3564 != null) {
               for(var4 = 0; var4 < this.field3564.length; ++var4) {
                  var7.method2775(this.field3564[var4], this.field3581[var4]);
               }
            }

            if (this.field3582 != null) {
               for(var4 = 0; var4 < this.field3582.length; ++var4) {
                  var7.method2785(this.field3582[var4], this.field3583[var4]);
               }
            }

            return var7;
         }
      }
   }

   public final class273 method5397() {
      int var1 = -1;
      if (this.field3594 != -1) {
         var1 = class97.method2405(this.field3594);
      } else if (this.field3596 != -1) {
         var1 = class227.field2629[this.field3596];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field3595.length - 1) {
         var2 = this.field3595[var1];
      } else {
         var2 = this.field3595[this.field3595.length - 1];
      }

      return var2 != -1 ? class248.method4823(var2) : null;
   }

   public boolean method5398() {
      if (this.field3595 == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.field3594 != -1) {
            var1 = class97.method2405(this.field3594);
         } else if (this.field3596 != -1) {
            var1 = class227.field2629[this.field3596];
         }

         if (var1 >= 0 && var1 < this.field3595.length) {
            return this.field3595[var1] != -1;
         } else {
            return this.field3595[this.field3595.length - 1] != -1;
         }
      }
   }

   public int method5399(int var1, int var2) {
      return class148.method3363(this.field3584, var1, var2);
   }

   public String method5400(int var1, String var2) {
      return class148.method3369(this.field3584, var1, var2);
   }

   static SecureRandom method5403() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }
}
