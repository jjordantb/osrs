public final class class192 {
   static class251 field2456;
   static byte[][] field2458;
   int field2451;
   int[] field2457 = new int[256];
   int[] field2453 = new int[256];
   int field2454;
   int field2455;
   int field2449;

   public class192(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field2457[var2] = var1[var2];
      }

      this.method4088();
   }

   final int method4085() {
      if (0 == --this.field2451 + 1) {
         this.method4087();
         this.field2451 = 255;
      }

      return this.field2457[this.field2451];
   }

   final int method4084() {
      if (this.field2451 == 0) {
         this.method4087();
         this.field2451 = 256;
      }

      return this.field2457[this.field2451 - 1];
   }

   final void method4087() {
      this.field2455 += ++this.field2449;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field2453[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field2454 ^= this.field2454 << 13;
            } else {
               this.field2454 ^= this.field2454 >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.field2454 ^= this.field2454 << 2;
         } else {
            this.field2454 ^= this.field2454 >>> 16;
         }

         this.field2454 += this.field2453[var1 + 128 & 255];
         int var3;
         this.field2453[var1] = var3 = this.field2453[(var2 & 1020) >> 2] + this.field2454 + this.field2455;
         this.field2457[var1] = this.field2455 = this.field2453[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   final void method4088() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2457[var1];
         var3 += this.field2457[var1 + 1];
         var4 += this.field2457[var1 + 2];
         var5 += this.field2457[var1 + 3];
         var6 += this.field2457[var1 + 4];
         var7 += this.field2457[var1 + 5];
         var8 += this.field2457[var1 + 6];
         var9 += this.field2457[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2453[var1] = var2;
         this.field2453[var1 + 1] = var3;
         this.field2453[var1 + 2] = var4;
         this.field2453[var1 + 3] = var5;
         this.field2453[var1 + 4] = var6;
         this.field2453[var1 + 5] = var7;
         this.field2453[var1 + 6] = var8;
         this.field2453[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field2453[var1];
         var3 += this.field2453[var1 + 1];
         var4 += this.field2453[var1 + 2];
         var5 += this.field2453[var1 + 3];
         var6 += this.field2453[var1 + 4];
         var7 += this.field2453[var1 + 5];
         var8 += this.field2453[var1 + 6];
         var9 += this.field2453[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field2453[var1] = var2;
         this.field2453[var1 + 1] = var3;
         this.field2453[var1 + 2] = var4;
         this.field2453[var1 + 3] = var5;
         this.field2453[var1 + 4] = var6;
         this.field2453[var1 + 5] = var7;
         this.field2453[var1 + 6] = var8;
         this.field2453[var1 + 7] = var9;
      }

      this.method4087();
      this.field2451 = 256;
   }

   public static String method4091(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class303.field3785[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
