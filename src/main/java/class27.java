public class class27 implements class31 {
   static int field266;
   static class251 field273;
   int field271;
   int field267;
   int field268;
   int field269;
   int field270;
   int field272;

   public void vmethod697(class20 var1) {
      if (var1.field198 > this.field270) {
         var1.field198 = this.field270;
      }

      if (var1.field199 < this.field270) {
         var1.field199 = this.field270;
      }

      if (var1.field194 > this.field272) {
         var1.field194 = this.field272;
      }

      if (var1.field203 < this.field272) {
         var1.field203 = this.field272;
      }

   }

   public boolean vmethod696(int var1, int var2, int var3) {
      if (var1 >= this.field271 && var1 < this.field271 + this.field267) {
         return var2 >> 6 == this.field268 && var3 >> 6 == this.field269;
      } else {
         return false;
      }
   }

   public boolean vmethod706(int var1, int var2) {
      return var1 >> 6 == this.field270 && var2 >> 6 == this.field272;
   }

   public int[] vmethod715(int var1, int var2, int var3) {
      if (!this.vmethod696(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field270 * 64 - this.field268 * 64 + var2, var3 + (this.field272 * 64 - this.field269 * 64)};
         return var4;
      }
   }

   public class228 vmethod695(int var1, int var2) {
      if (!this.vmethod706(var1, var2)) {
         return null;
      } else {
         int var3 = this.field268 * 64 - this.field270 * 64 + var1;
         int var4 = this.field269 * 64 - this.field272 * 64 + var2;
         return new class228(this.field271, var3, var4);
      }
   }

   public void vmethod709(class184 var1) {
      this.field271 = var1.method3983();
      this.field267 = var1.method3983();
      this.field268 = var1.method3771();
      this.field269 = var1.method3771();
      this.field270 = var1.method3771();
      this.field272 = var1.method3771();
      this.method498();
   }

   void method498() {
   }

   public static void method517(class249 var0, class249 var1, boolean var2, class300 var3) {
      class271.field3506 = var0;
      class4.field32 = var1;
      class229.field2648 = var2;
      class316.field3840 = class271.field3506.method4889(10);
      class140.field1931 = var3;
   }

   static synchronized void method515(byte[] var0) {
      if (var0.length == 100 && class185.field2415 < 1000) {
         class185.field2414[++class185.field2415 - 1] = var0;
      } else if (var0.length == 5000 && class185.field2412 < 250) {
         class185.field2418[++class185.field2412 - 1] = var0;
      } else if (var0.length == 30000 && class185.field2413 < 50) {
         class185.field2416[++class185.field2413 - 1] = var0;
      } else {
         if (class296.field3737 != null) {
            for(int var1 = 0; var1 < class25.field253.length; ++var1) {
               if (var0.length == class25.field253[var1] && class185.field2411[var1] < class296.field3737[var1].length) {
                  class296.field3737[var1][class185.field2411[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   static void method492(int var0, int var1, int var2, int var3) {
      class54 var4 = (class54)class54.field534.method4224((long)var0);
      if (var4 == null) {
         var4 = new class54();
         class54.field534.method4226(var4, (long)var0);
      }

      if (var4.field533.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field533.length; ++var7) {
            var5[var7] = var4.field533[var7];
            var6[var7] = var4.field532[var7];
         }

         for(var7 = var4.field533.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field533 = var5;
         var4.field532 = var6;
      }

      var4.field533[var1] = var2;
      var4.field532[var1] = var3;
   }

   public static void method516(int var0, class249 var1, String var2, String var3, int var4, boolean var5) {
      int var6 = var1.method4825(var2);
      int var7 = var1.method4847(var6, var3);
      class25.method478(var0, var1, var6, var7, var4, var5);
   }

   static void method513(int var0) {
      client.field870 = 0L;
      if (var0 >= 2) {
         client.field675 = true;
      } else {
         client.field675 = false;
      }

      if (class17.method211() == 1) {
         class157.field2037.method950(765, 503);
      } else {
         class157.field2037.method950(7680, 2160);
      }

      if (client.field720 >= 25) {
         class70.method1948();
      }

   }
}
