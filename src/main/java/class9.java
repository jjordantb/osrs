public class class9 {
   static int field69;
   static class251 field72;
   static int field68;
   static int field70;

   public static int method98(int var0) {
      return var0 >> 11 & 63;
   }

   static class86 method99(int var0) {
      class86 var1 = (class86)class86.field1261.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class137.field1914.method4831(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = class80.method2052(var2);
            class86.field1261.method4204(var1, (long)var0);
            return var1;
         }
      }
   }

   static void method104(int var0, String var1, String var2, String var3) {
      class88 var4 = (class88)class85.field1248.get(var0);
      if (var4 == null) {
         var4 = new class88();
         class85.field1248.put(var0, var4);
      }

      class59 var5 = var4.method2174(var0, var1, var2, var3);
      class85.field1249.method4170(var5, (long)var5.field595);
      class85.field1247.method4356(var5);
      client.field835 = client.field828;
   }

   public static class232 method102(int var0, int var1) {
      class232 var2 = class18.method213(var0);
      if (var1 == -1) {
         return var2;
      } else {
         return var2 != null && var2.field2791 != null && var1 < var2.field2791.length ? var2.field2791[var1] : null;
      }
   }

   static char method100(char var0) {
      if (var0 == 'Æ') {
         return 'E';
      } else if (var0 == 'æ') {
         return 'e';
      } else if (var0 == 'ß') {
         return 's';
      } else if (var0 == 'Œ') {
         return 'E';
      } else {
         return (char)(var0 == 'œ' ? 'e' : '\u0000');
      }
   }
}
