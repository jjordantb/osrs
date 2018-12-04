public class class152 extends class162 {
   static int field1983;
   static class36 field1985;
   long[] field1976 = new long[10];
   int field1977 = 256;
   int field1984 = 1;
   long field1979 = class120.method2866();
   int field1981 = 0;
   int field1978;

   class152() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1976[var1] = this.field1979;
      }

   }

   public void vmethod3534() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1976[var1] = 0L;
      }

   }

   public int vmethod3535(int var1, int var2) {
      int var3 = this.field1977;
      int var4 = this.field1984;
      this.field1977 = 300;
      this.field1984 = 1;
      this.field1979 = class120.method2866();
      if (this.field1976[this.field1978] == 0L) {
         this.field1977 = var3;
         this.field1984 = var4;
      } else if (this.field1979 > this.field1976[this.field1978]) {
         this.field1977 = (int)((long)(var1 * 2560) / (this.field1979 - this.field1976[this.field1978]));
      }

      if (this.field1977 < 25) {
         this.field1977 = 25;
      }

      if (this.field1977 > 256) {
         this.field1977 = 256;
         this.field1984 = (int)((long)var1 - (this.field1979 - this.field1976[this.field1978]) / 10L);
      }

      if (this.field1984 > var1) {
         this.field1984 = var1;
      }

      this.field1976[this.field1978] = this.field1979;
      this.field1978 = (this.field1978 + 1) % 10;
      int var5;
      if (this.field1984 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.field1976[var5]) {
               this.field1976[var5] += (long)this.field1984;
            }
         }
      }

      if (this.field1984 < var2) {
         this.field1984 = var2;
      }

      class272.method5390((long)this.field1984);

      for(var5 = 0; this.field1981 < 256; this.field1981 += this.field1977) {
         ++var5;
      }

      this.field1981 &= 255;
      return var5;
   }

   static final int method3394(int var0, int var1, int var2) {
      int var3 = var0 >> 7;
      int var4 = var1 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
         int var5 = var2;
         if (var2 < 3 && (class50.field492[1][var3][var4] & 2) == 2) {
            var5 = var2 + 1;
         }

         int var6 = var0 & 127;
         int var7 = var1 & 127;
         int var8 = (128 - var6) * class50.field506[var5][var3][var4] + class50.field506[var5][var3 + 1][var4] * var6 >> 7;
         int var9 = var6 * class50.field506[var5][var3 + 1][var4 + 1] + class50.field506[var5][var3][var4 + 1] * (128 - var6) >> 7;
         return var9 * var7 + var8 * (128 - var7) >> 7;
      } else {
         return 0;
      }
   }
}
