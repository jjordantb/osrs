public final class class134 {
   int field1868;
   int field1869;
   int field1862;
   int field1865;
   int field1864;
   int field1867;
   int field1866;
   int field1878;
   int field1870;
   int field1871;
   int field1872;
   int field1873;
   int field1863;
   int field1875;
   int field1876;
   int field1877;
   int field1874;
   int field1879;

   public static int method3263(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   static class251 method3261(int var0, boolean var1, boolean var2, boolean var3) {
      class164 var4 = null;
      if (class157.field2028 != null) {
         var4 = new class164(var0, class157.field2028, class157.field2030[var0], 1000000);
      }

      return new class251(var4, class55.field540, var0, var1, var2, var3);
   }

   static void method3264() {
      if (client.field798) {
         class232 var0 = class9.method102(class306.field3796, client.field799);
         if (var0 != null && var0.field2742 != null) {
            class57 var1 = new class57();
            var1.field570 = var0;
            var1.field575 = var0.field2742;
            class53.method1076(var1);
         }

         client.field798 = false;
         class37.method721(var0);
      }
   }

   static final void method3262(class232 var0, int var1, int var2) {
      if (client.field816 == null && !client.field833) {
         if (var0 != null) {
            class232 var4 = class244.method4799(var0);
            if (var4 == null) {
               var4 = var0.field2748;
            }

            if (var4 != null) {
               client.field816 = var0;
               var4 = class244.method4799(var0);
               if (var4 == null) {
                  var4 = var0.field2748;
               }

               client.field817 = var4;
               client.field906 = var1;
               client.field838 = var2;
               class234.field2817 = 0;
               client.field827 = false;
               int var6 = client.field780 - 1;
               if (var6 != -1) {
                  class0.method10(var6);
               }

               return;
            }
         }

      }
   }
}
