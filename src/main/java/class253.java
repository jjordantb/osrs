import java.util.HashMap;

public class class253 {
   static int field3289;
   final HashMap field3284 = new HashMap();
   class315 field3282 = new class315(0, 0);
   int[] field3281 = new int[2048];
   int[] field3286 = new int[2048];
   int field3285 = 0;

   public class253() {
      class21.field209 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var4;
      for(byte var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class6.method79((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + 0.425F * (float)var1 / 16.0F));
         class21.field209[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(int var6 = var2 / 6; var1 < class21.field209.length; var2 -= var6) {
         var4 = var1 * 2;

         for(int var5 = class6.method79((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class21.field209.length; ++var1) {
            class21.field209[var1] = var5;
         }
      }

   }

   void method4980(int var1) {
      int var2 = var1 * 2 + 1;
      double[] var3 = class314.method5987(0.0D, (double)((float)var1 / 3.0F), var1);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var9 + var2 * var8] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      class323 var11 = new class323(var6, var2, var2);
      this.field3284.put(var1, var11);
   }

   class323 method4981(int var1) {
      if (!this.field3284.containsKey(var1)) {
         this.method4980(var1);
      }

      return (class323)this.field3284.get(var1);
   }

   public final void method4982(int var1, int var2) {
      if (this.field3285 < this.field3281.length) {
         this.field3281[this.field3285] = var1;
         this.field3286[this.field3285] = var2;
         ++this.field3285;
      }
   }

   public final void method4983() {
      this.field3285 = 0;
   }

   public final void method4984(int var1, int var2, class323 var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      class323 var6 = this.method4981(var5);
      int var7 = var5 * 2 + 1;
      class315 var8 = new class315(0, 0, var3.field3879, var3.field3887);
      class315 var9 = new class315(0, 0);
      this.field3282.method5991(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field3285; ++var10) {
         var11 = this.field3281[var10];
         var12 = this.field3286[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.field3887 - (float)(var12 - var2) * var4) - var5;
         this.field3282.method5990(var13, var14);
         this.field3282.method5993(var8, var9);
         this.method4988(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field3889.length; ++var10) {
         if (var3.field3889[var10] == 0) {
            var3.field3889[var10] = -16777216;
         } else {
            var11 = (var3.field3889[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.field3889[var10] = -16777216;
            } else {
               if (var11 > class21.field209.length) {
                  var11 = class21.field209.length;
               }

               var12 = class21.field209[var11 - 1];
               var3.field3889[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   void method4988(class323 var1, class323 var2, class315 var3) {
      if (var3.field3837 != 0 && var3.field3838 != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.field3836 == 0) {
            var4 = var1.field3879 - var3.field3837;
         }

         if (var3.field3835 == 0) {
            var5 = var1.field3887 - var3.field3838;
         }

         int var6 = var4 + var5 * var1.field3879;
         int var7 = var2.field3879 * var3.field3835 + var3.field3836;

         for(int var8 = 0; var8 < var3.field3838; ++var8) {
            for(int var9 = 0; var9 < var3.field3837; ++var9) {
               int var10001 = var7++;
               var2.field3889[var10001] += var1.field3889[var6++];
            }

            var6 += var1.field3879 - var3.field3837;
            var7 += var2.field3879 - var3.field3837;
         }

      }
   }

   public static class270 method4993(int var0) {
      class270 var1 = (class270)class270.field3453.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class270.field3450.method4831(6, var0);
         var1 = new class270();
         var1.field3469 = var0;
         if (var2 != null) {
            var1.method5271(new class184(var2));
         }

         var1.method5300();
         if (var1.field3490) {
            var1.field3495 = 0;
            var1.field3468 = false;
         }

         class270.field3453.method4204(var1, (long)var0);
         return var1;
      }
   }
}
