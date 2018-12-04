public class class274 extends class208 {
   static class309 field3613;
   public static class249 field3611;
   public static class202 field3601 = new class202(64);
   public int field3603 = 0;
   public int field3604 = -1;
   public boolean field3602 = true;
   public int field3606 = -1;
   public int field3607;
   public int field3608;
   public int field3610;
   public int field3605;
   public int field3609;
   public int field3612;

   public void method5432() {
      if (this.field3606 != -1) {
         this.method5438(this.field3606);
         this.field3605 = this.field3607;
         this.field3609 = this.field3608;
         this.field3612 = this.field3610;
      }

      this.method5438(this.field3603);
   }

   public void method5452(class184 var1, int var2) {
      while(true) {
         int var3 = var1.method3983();
         if (var3 == 0) {
            return;
         }

         this.method5434(var1, var3, var2);
      }
   }

   void method5434(class184 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3603 = var1.method3773();
      } else if (var2 == 2) {
         this.field3604 = var1.method3983();
      } else if (var2 == 5) {
         this.field3602 = false;
      } else if (var2 == 7) {
         this.field3606 = var1.method3773();
      } else if (var2 == 8) {
         ;
      }

   }

   void method5438(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var10 != var8) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field3607 = (int)(var12 * 256.0D);
      this.field3608 = (int)(var14 * 256.0D);
      this.field3610 = (int)(var16 * 256.0D);
      if (this.field3608 < 0) {
         this.field3608 = 0;
      } else if (this.field3608 > 255) {
         this.field3608 = 255;
      }

      if (this.field3610 < 0) {
         this.field3610 = 0;
      } else if (this.field3610 > 255) {
         this.field3610 = 255;
      }

   }

   static class322 method5439() {
      class322 var0 = new class322();
      var0.field3875 = class324.field3891;
      var0.field3876 = class324.field3896;
      var0.field3874 = class324.field3890[0];
      var0.field3877 = class324.field3892[0];
      var0.field3872 = class324.field3895[0];
      var0.field3873 = class258.field3334[0];
      var0.field3871 = class324.field3894;
      var0.field3870 = class324.field3897[0];
      class324.field3890 = null;
      class324.field3892 = null;
      class324.field3895 = null;
      class258.field3334 = null;
      class324.field3894 = null;
      class324.field3897 = null;
      return var0;
   }
}
