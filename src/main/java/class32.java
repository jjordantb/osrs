public class class32 {
   static int[] field322;
   int field317;
   int field320;
   int[][] field315;
   int[][] field318;
   int[][] field316;
   int[][] field319;

   class32(int var1, int var2) {
      this.field317 = var1;
      this.field320 = var2;
      this.field315 = new int[var1][var2];
      this.field318 = new int[var1][var2];
      this.field316 = new int[var1][var2];
      this.field319 = new int[var1][var2];
   }

   void method602(int var1, int var2, int var3, class261 var4) {
      if (var4 != null) {
         if (var3 + var1 >= 0 && var3 + var2 >= 0) {
            if (var1 - var3 <= this.field317 && var2 - var3 <= this.field320) {
               int var5 = Math.max(0, var1 - var3);
               int var6 = Math.min(this.field317, var3 + var1);
               int var7 = Math.max(0, var2 - var3);
               int var8 = Math.min(this.field320, var3 + var2);

               for(int var9 = var5; var9 < var6; ++var9) {
                  for(int var10 = var7; var10 < var8; ++var10) {
                     this.field315[var9][var10] += var4.field3361 * 256 / var4.field3360;
                     this.field318[var9][var10] += var4.field3364;
                     this.field316[var9][var10] += var4.field3363;
                     ++this.field319[var9][var10];
                  }
               }

            }
         }
      }
   }

   int method600(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.field317 && var2 < this.field320) {
         if (this.field316[var1][var2] == 0) {
            return 0;
         } else {
            int var3 = this.field315[var1][var2] / this.field319[var1][var2];
            int var4 = this.field318[var1][var2] / this.field319[var1][var2];
            int var5 = this.field316[var1][var2] / this.field319[var1][var2];
            return class6.method79((double)var3 / 256.0D, (double)var4 / 256.0D, (double)var5 / 256.0D);
         }
      } else {
         return 0;
      }
   }

   static int method606(int var0) {
      class59 var1 = (class59)class85.field1249.method4185((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field2500 == class85.field1247.field2518 ? -1 : ((class59)var1.field2500).field595;
      }
   }
}
