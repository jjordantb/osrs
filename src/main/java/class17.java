public final class class17 {
   static class251 field162;
   int field163;
   int field157;
   int field159;
   int field160;

   class30 this$0;

   class17(class30 var1) {
      this.this$0 = var1;
   }

   public static void method210() {
      class262.field3369.method4199();
   }

   static class66 method208() {
      return class66.field1014 < class66.field1013 ? class66.field1017[++class66.field1014 - 1] : null;
   }

   public static boolean method212(class249 var0, int var1, int var2) {
      byte[] var3 = var0.method4831(var1, var2);
      if (var3 == null) {
         return false;
      } else {
         class125.method3051(var3);
         return true;
      }
   }

   static int method211() {
      return client.field675 ? 2 : 1;
   }

   static final class56 method209(int var0, int var1, int var2) {
      class56 var3 = new class56();
      var3.field556 = var1;
      var3.field560 = var2;
      client.field804.method4226(var3, (long)var0);
      class160.method3504(var1);
      class232 var4 = class18.method213(var0);
      class37.method721(var4);
      if (client.field880 != null) {
         class37.method721(client.field880);
         client.field880 = null;
      }

      for(int var5 = 0; var5 < client.field780; ++var5) {
         if (class259.method5087(client.field783[var5])) {
            if (var5 < client.field780 - 1) {
               for(int var6 = var5; var6 < client.field780 - 1; ++var6) {
                  client.field916[var6] = client.field916[var6 + 1];
                  client.field786[var6] = client.field786[var6 + 1];
                  client.field783[var6] = client.field783[var6 + 1];
                  client.field784[var6] = client.field784[var6 + 1];
                  client.field781[var6] = client.field781[var6 + 1];
                  client.field782[var6] = client.field782[var6 + 1];
                  client.field772[var6] = client.field772[var6 + 1];
               }
            }

            --var5;
            --client.field780;
         }
      }

      class75.method2002();
      class223.method4594(class145.field1951[var0 >> 16], var4, false);
      class25.method480(var1);
      if (client.field803 != -1) {
         class33.method607(client.field803, 1);
      }

      return var3;
   }
}
