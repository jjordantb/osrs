public class class126 extends class206 {
   int field1763;
   int field1767;
   int[] field1764;
   int[][] field1765;

   class126(int var1, byte[] var2) {
      this.field1763 = var1;
      class184 var3 = new class184(var2);
      this.field1767 = var3.method3983();
      this.field1764 = new int[this.field1767];
      this.field1765 = new int[this.field1767][];

      int var4;
      for(var4 = 0; var4 < this.field1767; ++var4) {
         this.field1764[var4] = var3.method3983();
      }

      for(var4 = 0; var4 < this.field1767; ++var4) {
         this.field1765[var4] = new int[var3.method3983()];
      }

      for(var4 = 0; var4 < this.field1767; ++var4) {
         for(int var5 = 0; var5 < this.field1765[var4].length; ++var5) {
            this.field1765[var4][var5] = var3.method3983();
         }
      }

   }

   public static class281[] method3054() {
      return new class281[]{class281.field3669, class281.field3660, class281.field3676, class281.field3664, class281.field3667, class281.field3668, class281.field3666, class281.field3662, class281.field3670, class281.field3665, class281.field3659, class281.field3675, class281.field3674, class281.field3663, class281.field3673, class281.field3671, class281.field3672, class281.field3661};
   }

   public static byte[] method3055(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < '\u0080' || var4 >= ' ' && var4 <= 'ÿ') {
            var2[var3] = (byte)var4;
         } else if (var4 == '€') {
            var2[var3] = -128;
         } else if (var4 == '‚') {
            var2[var3] = -126;
         } else if (var4 == 'ƒ') {
            var2[var3] = -125;
         } else if (var4 == '„') {
            var2[var3] = -124;
         } else if (var4 == '…') {
            var2[var3] = -123;
         } else if (var4 == '†') {
            var2[var3] = -122;
         } else if (var4 == '‡') {
            var2[var3] = -121;
         } else if (var4 == 'ˆ') {
            var2[var3] = -120;
         } else if (var4 == '‰') {
            var2[var3] = -119;
         } else if (var4 == 'Š') {
            var2[var3] = -118;
         } else if (var4 == '‹') {
            var2[var3] = -117;
         } else if (var4 == 'Œ') {
            var2[var3] = -116;
         } else if (var4 == 'Ž') {
            var2[var3] = -114;
         } else if (var4 == '‘') {
            var2[var3] = -111;
         } else if (var4 == '’') {
            var2[var3] = -110;
         } else if (var4 == '“') {
            var2[var3] = -109;
         } else if (var4 == '”') {
            var2[var3] = -108;
         } else if (var4 == '•') {
            var2[var3] = -107;
         } else if (var4 == '–') {
            var2[var3] = -106;
         } else if (var4 == '—') {
            var2[var3] = -105;
         } else if (var4 == '˜') {
            var2[var3] = -104;
         } else if (var4 == '™') {
            var2[var3] = -103;
         } else if (var4 == 'š') {
            var2[var3] = -102;
         } else if (var4 == '›') {
            var2[var3] = -101;
         } else if (var4 == 'œ') {
            var2[var3] = -100;
         } else if (var4 == 'ž') {
            var2[var3] = -98;
         } else if (var4 == 'Ÿ') {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }

   static final void method3053(class184 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         class50.field492[var1][var2][var3] = 0;

         while(true) {
            var7 = var0.method3983();
            if (var7 == 0) {
               if (var1 == 0) {
                  class50.field506[0][var2][var3] = -class43.method792(var4 + 932731 + var2, var5 + 556238 + var3) * 8;
               } else {
                  class50.field506[var1][var2][var3] = class50.field506[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var7 == 1) {
               int var8 = var0.method3983();
               if (var8 == 1) {
                  var8 = 0;
               }

               if (var1 == 0) {
                  class50.field506[0][var2][var3] = -var8 * 8;
               } else {
                  class50.field506[var1][var2][var3] = class50.field506[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if (var7 <= 49) {
               class140.field1932[var1][var2][var3] = var0.method3931();
               class50.field494[var1][var2][var3] = (byte)((var7 - 2) / 4);
               class8.field64[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               class50.field492[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               class19.field188[var1][var2][var3] = (byte)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = var0.method3983();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.method3983();
               break;
            }

            if (var7 <= 49) {
               var0.method3983();
            }
         }
      }

   }
}
