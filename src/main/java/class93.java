public class class93 {
   class109[] field1306 = new class109[10];
   int field1308;
   int field1307;

   class93(class184 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method3983();
         if (var3 != 0) {
            --var1.field2405;
            this.field1306[var2] = new class109();
            this.field1306[var2].method2676(var1);
         }
      }

      this.field1308 = var1.method3771();
      this.field1307 = var1.method3771();
   }

   public class95 method2281() {
      byte[] var1 = this.method2279();
      return new class95(22050, var1, this.field1308 * 22050 / 1000, this.field1307 * 22050 / 1000);
   }

   public final int method2274() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1306[var2] != null && this.field1306[var2].field1468 / 20 < var1) {
            var1 = this.field1306[var2].field1468 / 20;
         }
      }

      if (this.field1308 < this.field1307 && this.field1308 / 20 < var1) {
         var1 = this.field1308 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field1306[var2] != null) {
               this.field1306[var2].field1468 -= var1 * 20;
            }
         }

         if (this.field1308 < this.field1307) {
            this.field1308 -= var1 * 20;
            this.field1307 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method2279() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1306[var2] != null && this.field1306[var2].field1465 + this.field1306[var2].field1468 > var1) {
            var1 = this.field1306[var2].field1465 + this.field1306[var2].field1468;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field1306[var4] != null) {
               int var5 = this.field1306[var4].field1465 * 22050 / 1000;
               int var6 = this.field1306[var4].field1468 * 22050 / 1000;
               int[] var7 = this.field1306[var4].method2678(var5, this.field1306[var4].field1465);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = (var7[var8] >> 8) + var3[var8 + var6];
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static class93 method2275(class249 var0, int var1, int var2) {
      byte[] var3 = var0.method4831(var1, var2);
      return var3 == null ? null : new class93(new class184(var3));
   }
}
