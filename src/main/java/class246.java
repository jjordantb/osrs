public class class246 implements class190 {
   static final class246 field3208 = new class246("runescape", "RuneScape", 0);
   static final class246 field3203 = new class246("stellardawn", "Stellar Dawn", 1);
   static final class246 field3204 = new class246("game3", "Game 3", 2);
   static final class246 field3205 = new class246("game4", "Game 4", 3);
   static final class246 field3206 = new class246("game5", "Game 5", 4);
   public static final class246 field3207 = new class246("oldscape", "RuneScape 2007", 5);
   static int[] field3210;
   public final String field3202;
   final int field3209;

   class246(String var1, String var2, int var3) {
      this.field3202 = var1;
      this.field3209 = var3;
   }

   public int vmethod6130() {
      return this.field3209;
   }

   public static void method4819(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         class25.field253 = var0;
         class185.field2411 = new int[var0.length];
         class296.field3737 = new byte[var0.length][][];

         for(int var2 = 0; var2 < class25.field253.length; ++var2) {
            class296.field3737[var2] = new byte[var1[var2]][];
         }

      } else {
         class25.field253 = null;
         class185.field2411 = null;
         class296.field3737 = null;
      }
   }

   public static int method4810(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var6 + var1);
         if (var7 > 0 && var7 < '\u0080' || var7 >= ' ' && var7 <= 'ÿ') {
            var3[var6 + var4] = (byte)var7;
         } else if (var7 == '€') {
            var3[var6 + var4] = -128;
         } else if (var7 == '‚') {
            var3[var6 + var4] = -126;
         } else if (var7 == 'ƒ') {
            var3[var6 + var4] = -125;
         } else if (var7 == '„') {
            var3[var6 + var4] = -124;
         } else if (var7 == '…') {
            var3[var6 + var4] = -123;
         } else if (var7 == '†') {
            var3[var6 + var4] = -122;
         } else if (var7 == '‡') {
            var3[var6 + var4] = -121;
         } else if (var7 == 'ˆ') {
            var3[var6 + var4] = -120;
         } else if (var7 == '‰') {
            var3[var6 + var4] = -119;
         } else if (var7 == 'Š') {
            var3[var6 + var4] = -118;
         } else if (var7 == '‹') {
            var3[var6 + var4] = -117;
         } else if (var7 == 'Œ') {
            var3[var6 + var4] = -116;
         } else if (var7 == 'Ž') {
            var3[var6 + var4] = -114;
         } else if (var7 == '‘') {
            var3[var6 + var4] = -111;
         } else if (var7 == '’') {
            var3[var6 + var4] = -110;
         } else if (var7 == '“') {
            var3[var6 + var4] = -109;
         } else if (var7 == '”') {
            var3[var6 + var4] = -108;
         } else if (var7 == '•') {
            var3[var6 + var4] = -107;
         } else if (var7 == '–') {
            var3[var6 + var4] = -106;
         } else if (var7 == '—') {
            var3[var6 + var4] = -105;
         } else if (var7 == '˜') {
            var3[var6 + var4] = -104;
         } else if (var7 == '™') {
            var3[var6 + var4] = -103;
         } else if (var7 == 'š') {
            var3[var6 + var4] = -102;
         } else if (var7 == '›') {
            var3[var6 + var4] = -101;
         } else if (var7 == 'œ') {
            var3[var6 + var4] = -100;
         } else if (var7 == 'ž') {
            var3[var6 + var4] = -98;
         } else if (var7 == 'Ÿ') {
            var3[var6 + var4] = -97;
         } else {
            var3[var6 + var4] = 63;
         }
      }

      return var5;
   }

   public static boolean method4817(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
