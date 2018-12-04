public class class8 {
   static byte[][][] field64;
   static String[] field66;

   static final int method97(class330 var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.field4001) {
         case 3:
            return 20;
         default:
            return 12;
         }
      }
   }

   static final String method96(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + class128.method3233(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + class128.method3233(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class128.method3233(16776960) + var1 + "</col>";
      }
   }
}
