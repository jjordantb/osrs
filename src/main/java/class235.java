public class class235 implements class190 {
   public static final class235 field2833 = new class235(0, 0);
   static final class235 field2835 = new class235(1, 0);
   public static final class235 field2830 = new class235(2, 0);
   public static final class235 field2841 = new class235(3, 0);
   public static final class235 field2818 = new class235(9, 2);
   static final class235 field2823 = new class235(4, 1);
   static final class235 field2824 = new class235(5, 1);
   static final class235 field2825 = new class235(6, 1);
   static final class235 field2826 = new class235(7, 1);
   static final class235 field2827 = new class235(8, 1);
   static final class235 field2828 = new class235(12, 2);
   static final class235 field2821 = new class235(13, 2);
   static final class235 field2836 = new class235(14, 2);
   static final class235 field2831 = new class235(15, 2);
   static final class235 field2832 = new class235(16, 2);
   static final class235 field2822 = new class235(17, 2);
   static final class235 field2834 = new class235(18, 2);
   static final class235 field2829 = new class235(19, 2);
   static final class235 field2837 = new class235(20, 2);
   static final class235 field2819 = new class235(21, 2);
   static final class235 field2838 = new class235(10, 2);
   static final class235 field2820 = new class235(11, 2);
   static final class235 field2840 = new class235(22, 3);
   public final int field2839;

   class235(int var1, int var2) {
      this.field2839 = var1;
   }

   public int vmethod6130() {
      return this.field2839;
   }

   public static String method4782(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 'µ' && var5 != '\u0083') {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
