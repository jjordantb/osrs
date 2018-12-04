public class class22 {
   static boolean field221;
   protected static String field222;
   static int field220;
   String field223;
   int field214;
   int field215;
   class12 field216;

   class22(String var1, int var2, int var3, class12 var4) {
      this.field223 = var1;
      this.field214 = var2;
      this.field215 = var3;
      this.field216 = var4;
   }

   public static String method332(class184 var0) {
      return class120.method2865(var0, 32767);
   }

   static int method333(class191 var0) {
      int var1 = var0.method4052(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = var0.method4052(5);
      } else if (var1 == 2) {
         var2 = var0.method4052(8);
      } else {
         var2 = var0.method4052(11);
      }

      return var2;
   }

   public static int method334(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }
}
