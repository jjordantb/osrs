public class class234 {
   static int field2817;

   static final byte[] method4769(byte[] var0) {
      class184 var1 = new class184(var0);
      int var2 = var1.method3983();
      int var3 = var1.method3892();
      if (var3 < 0 || class249.field3223 != 0 && var3 > class249.field3223) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var4 = new byte[var3];
         var1.method3781(var4, 0, var3);
         return var4;
      } else {
         int var6 = var1.method3892();
         if (var6 < 0 || class249.field3223 != 0 && var6 > class249.field3223) {
            throw new RuntimeException();
         } else {
            byte[] var5 = new byte[var6];
            if (var2 == 1) {
               class178.method3704(var5, var6, var0, var3, 9);
            } else {
               class249.field3231.method3697(var1, var5);
            }

            return var5;
         }
      }
   }

   static boolean method4768() {
      return (client.field676 & 8) != 0;
   }

   static final void method4770(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class63 var9 = null;

      for(class63 var10 = (class63)client.field688.method4298(); var10 != null; var10 = (class63)client.field688.method4283()) {
         if (var0 == var10.field934 && var10.field922 == var1 && var2 == var10.field925 && var3 == var10.field926) {
            var9 = var10;
            break;
         }
      }

      if (var9 == null) {
         var9 = new class63();
         var9.field934 = var0;
         var9.field926 = var3;
         var9.field922 = var1;
         var9.field925 = var2;
         class43.method790(var9);
         client.field688.method4276(var9);
      }

      var9.field929 = var4;
      var9.field931 = var5;
      var9.field930 = var6;
      var9.field932 = var7;
      var9.field933 = var8;
   }
}
