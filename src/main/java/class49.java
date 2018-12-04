public final class class49 {
   static int field490;
   static class323[] field489;

   static void method1024(boolean var0) {
      class79.field1165 = "";
      class79.field1166 = "Enter your username/email & password.";
      class79.field1167 = "";
      class79.field1163 = 2;
      if (var0) {
         class79.field1169 = "";
      }

      if (class79.field1180 == null || class79.field1180.length() <= 0) {
         if (class47.field435.field1034 != null) {
            class79.field1180 = class47.field435.field1034;
            client.field746 = true;
         } else {
            client.field746 = false;
         }
      }

      if (client.field746 && class79.field1180 != null && class79.field1180.length() > 0) {
         class79.field1150 = 1;
      } else {
         class79.field1150 = 0;
      }

   }

   public static void method1023(int var0, int var1, int var2, boolean var3) {
      class174 var4 = class131.method3243(class171.field2211, client.field690.field1282);
      var4.field2332.method3893(var3 ? client.field659 : 0);
      var4.field2332.method3869(var1);
      var4.field2332.method3796(var2);
      var4.field2332.method3754(var0);
      client.field690.method2193(var4);
   }
}
