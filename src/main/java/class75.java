public class class75 {
   public static class245 method2001(int var0) {
      class245[] var1 = class172.method3658();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class245 var3 = var1[var2];
         if (var0 == var3.field3197) {
            return var3;
         }
      }

      return null;
   }

   static Class method2000(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   static void method2002() {
      class56.method1108(class74.field1113 / 2 + class163.field2067, class86.field1260);
   }
}
