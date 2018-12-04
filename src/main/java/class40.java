public class class40 implements class91 {
   static int field396;

   public class97 vmethod2256() {
      return new class44();
   }

   public static void method766(int var0, int var1) {
      class265 var2 = class77.method2004(var0);
      int var3 = var2.field3397;
      int var4 = var2.field3399;
      int var5 = var2.field3398;
      int var6 = class227.field2627[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      class227.field2629[var3] = class227.field2629[var3] & ~var6 | var1 << var4 & var6;
   }

   public static final void method764() {
      class122.field1711 = false;
      class122.field1713 = 0;
   }

   static final void method761(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class47.field435.field1029 = !class47.field435.field1029;
         class61.method1202();
         if (class47.field435.field1029) {
            class59.method1163(99, "", "Roofs are now all hidden");
         } else {
            class59.method1163(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         client.field886 = !client.field886;
      }

      if (var0.equalsIgnoreCase("renderself")) {
         client.field762 = !client.field762;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         client.field791 = !client.field791;
      }

      if (client.field812 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class45.field418.field3994 = !class45.field418.field3994;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            client.field886 = true;
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            client.field886 = false;
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class19.method241();
         }
      }

      class174 var1 = class131.method3243(class171.field2267, client.field690.field1282);
      var1.field2332.method3805(var0.length() + 1);
      var1.field2332.method3889(var0);
      client.field690.method2193(var1);
   }

   static final void method760() {
      client.field837 = client.field828;
      class22.field221 = true;
   }
}
