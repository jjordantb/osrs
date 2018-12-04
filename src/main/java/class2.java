public class class2 {
   static int field23;
   public final int field17;
   public final long field16;
   public final class4 field19;
   String field18;
   String field20;

   class2(class184 var1, byte var2, int var3) {
      this.field18 = var1.method3778();
      this.field20 = var1.method3778();
      this.field17 = var1.method3771();
      this.field16 = var1.method3775();
      int var4 = var1.method3892();
      int var5 = var1.method3892();
      this.field19 = new class4();
      this.field19.method56(2);
      this.field19.method38(var2);
      this.field19.field31 = var4;
      this.field19.field33 = var5;
      this.field19.field38 = 0;
      this.field19.field35 = 0;
      this.field19.field30 = var3;
   }

   public String method18() {
      return this.field18;
   }

   public String method19() {
      return this.field20;
   }

   static void method24() {
      client.field690.method2194();
      client.field690.field1283.field2405 = 0;
      client.field690.field1280 = null;
      client.field690.field1295 = null;
      client.field690.field1284 = null;
      client.field690.field1278 = null;
      client.field690.field1285 = 0;
      client.field690.field1287 = 0;
      client.field662 = 0;
      client.field780 = 0;
      client.field833 = false;
      client.field876 = 0;
      client.field722 = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         client.field698[var0] = null;
      }

      class69.field1063 = null;

      for(var0 = 0; var0 < client.field806.length; ++var0) {
         class73 var1 = client.field806[var0];
         if (var1 != null) {
            var1.field965 = -1;
            var1.field966 = false;
         }
      }

      class12.method125();
      class16.method202(30);

      for(var0 = 0; var0 < 100; ++var0) {
         client.field848[var0] = true;
      }

      class70.method1948();
   }

   static final void method20() {
      class157.method3460();
      if (class3.field26 != null) {
         class3.field26.method5745();
      }

   }
}
