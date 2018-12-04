public class class14 implements class31 {
   static boolean field132;
   int field125;
   int field117;
   int field118;
   int field119;
   int field120;
   int field130;
   int field122;
   int field123;
   int field129;
   int field124;
   int field126;
   int field121;
   int field131;
   int field133;

   public void vmethod697(class20 var1) {
      if (var1.field198 > this.field120) {
         var1.field198 = this.field120;
      }

      if (var1.field199 < this.field120) {
         var1.field199 = this.field120;
      }

      if (var1.field194 > this.field130) {
         var1.field194 = this.field130;
      }

      if (var1.field203 < this.field130) {
         var1.field203 = this.field130;
      }

   }

   public boolean vmethod696(int var1, int var2, int var3) {
      if (var1 >= this.field125 && var1 < this.field117 + this.field125) {
         return var2 >= (this.field118 << 6) + (this.field122 << 3) && var2 <= (this.field118 << 6) + (this.field129 << 3) + 7 && var3 >= (this.field119 << 6) + (this.field123 << 3) && var3 <= (this.field119 << 6) + (this.field124 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean vmethod706(int var1, int var2) {
      return var1 >= (this.field120 << 6) + (this.field126 << 3) && var1 <= (this.field120 << 6) + (this.field131 << 3) + 7 && var2 >= (this.field130 << 6) + (this.field121 << 3) && var2 <= (this.field130 << 6) + (this.field133 << 3) + 7;
   }

   public int[] vmethod715(int var1, int var2, int var3) {
      if (!this.vmethod696(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field120 * 64 - this.field118 * 64 + var2 + (this.field126 * 8 - this.field122 * 8), var3 + (this.field130 * 64 - this.field119 * 64) + (this.field121 * 8 - this.field123 * 8)};
         return var4;
      }
   }

   public class228 vmethod695(int var1, int var2) {
      if (!this.vmethod706(var1, var2)) {
         return null;
      } else {
         int var3 = this.field118 * 64 - this.field120 * 64 + (this.field122 * 8 - this.field126 * 8) + var1;
         int var4 = this.field119 * 64 - this.field130 * 64 + var2 + (this.field123 * 8 - this.field121 * 8);
         return new class228(this.field125, var3, var4);
      }
   }

   public void vmethod709(class184 var1) {
      this.field125 = var1.method3983();
      this.field117 = var1.method3983();
      this.field118 = var1.method3771();
      this.field122 = var1.method3983();
      this.field129 = var1.method3983();
      this.field119 = var1.method3771();
      this.field123 = var1.method3983();
      this.field124 = var1.method3983();
      this.field120 = var1.method3771();
      this.field126 = var1.method3983();
      this.field131 = var1.method3983();
      this.field130 = var1.method3771();
      this.field121 = var1.method3983();
      this.field133 = var1.method3983();
      this.method168();
   }

   void method168() {
   }

   static void method163() {
      client.field780 = 0;
      client.field833 = false;
      client.field916[0] = "Cancel";
      client.field786[0] = "";
      client.field783[0] = 1006;
      client.field772[0] = false;
      client.field780 = 1;
   }

   static final boolean method145(class232 var0) {
      int var1 = var0.field2741;
      if (var1 == 205) {
         client.field725 = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field908.method4665(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field908.method4666(var2, var3 == 1);
         }

         if (var1 == 324) {
            client.field908.method4667(false);
         }

         if (var1 == 325) {
            client.field908.method4667(true);
         }

         if (var1 == 326) {
            class174 var4 = class131.method3243(class171.field2219, client.field690.field1282);
            client.field908.method4668(var4.field2332);
            client.field690.method2193(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
