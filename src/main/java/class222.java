public class class222 {
   static final byte[] field2594 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   class184 field2597 = new class184((byte[])null);
   int field2588;
   int[] field2589;
   int[] field2590;
   int[] field2591;
   int[] field2592;
   int field2593;
   long field2595;

   class222(byte[] var1) {
      this.method4531(var1);
   }

   class222() {
   }

   void method4531(byte[] var1) {
      this.field2597.field2404 = var1;
      this.field2597.field2405 = 10;
      int var2 = this.field2597.method3771();
      this.field2588 = this.field2597.method3771();
      this.field2593 = 500000;
      this.field2589 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field2597.field2405 += var5) {
         int var4 = this.field2597.method3892();
         var5 = this.field2597.method3892();
         if (var4 == 1297379947) {
            this.field2589[var3] = this.field2597.field2405;
            ++var3;
         }
      }

      this.field2595 = 0L;
      this.field2590 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field2590[var3] = this.field2589[var3];
      }

      this.field2591 = new int[var2];
      this.field2592 = new int[var2];
   }

   void method4582() {
      this.field2597.field2404 = null;
      this.field2589 = null;
      this.field2590 = null;
      this.field2591 = null;
      this.field2592 = null;
   }

   boolean method4529() {
      return this.field2597.field2404 != null;
   }

   int method4572() {
      return this.field2590.length;
   }

   void method4568(int var1) {
      this.field2597.field2405 = this.field2590[var1];
   }

   void method4535(int var1) {
      this.field2590[var1] = this.field2597.field2405;
   }

   void method4536() {
      this.field2597.field2405 = -1;
   }

   void method4537(int var1) {
      int var2 = this.field2597.method3787();
      this.field2591[var1] += var2;
   }

   int method4538(int var1) {
      int var2 = this.method4539(var1);
      return var2;
   }

   int method4539(int var1) {
      byte var2 = this.field2597.field2404[this.field2597.field2405];
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.field2592[var1] = var5;
         ++this.field2597.field2405;
      } else {
         var5 = this.field2592[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.method4540(var1, var5);
      } else {
         int var3 = this.field2597.method3787();
         if (var5 == 247 && var3 > 0) {
            int var4 = this.field2597.field2404[this.field2597.field2405] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               ++this.field2597.field2405;
               this.field2592[var1] = var4;
               return this.method4540(var1, var4);
            }
         }

         this.field2597.field2405 += var3;
         return 0;
      }
   }

   int method4540(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.field2597.method3983();
         var4 = this.field2597.method3787();
         if (var7 == 47) {
            this.field2597.field2405 += var4;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field2597.method3773();
            var4 -= 3;
            int var6 = this.field2591[var1];
            this.field2595 += (long)var6 * (long)(this.field2593 - var5);
            this.field2593 = var5;
            this.field2597.field2405 += var4;
            return 2;
         } else {
            this.field2597.field2405 += var4;
            return 3;
         }
      } else {
         byte var3 = field2594[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field2597.method3983() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field2597.method3983() << 16;
         }

         return var4;
      }
   }

   long method4541(int var1) {
      return this.field2595 + (long)var1 * (long)this.field2593;
   }

   int method4573() {
      int var1 = this.field2590.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field2590[var4] >= 0 && this.field2591[var4] < var3) {
            var2 = var4;
            var3 = this.field2591[var4];
         }
      }

      return var2;
   }

   boolean method4543() {
      int var1 = this.field2590.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field2590[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method4534(long var1) {
      this.field2595 = var1;
      int var3 = this.field2590.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2591[var4] = 0;
         this.field2592[var4] = 0;
         this.field2597.field2405 = this.field2589[var4];
         this.method4537(var4);
         this.field2590[var4] = this.field2597.field2405;
      }

   }
}
