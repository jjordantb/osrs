import java.util.Comparator;

final class class0 implements Comparator {

   static int field0;

   private int method1(class2 var1, class2 var2) {
      return Integer.compare(var1.field17, var2.field17);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1((class2)var1, (class2)var2);
   }

   public static class259 method0(int var0) {
      class259 var1 = (class259)class259.field3339.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class259.field3340.method4831(15, var0);
         var1 = new class259();
         if (var2 != null) {
            var1.method5080(new class184(var2));
         }

         class259.field3339.method4204(var1, (long)var0);
         return var1;
      }
   }

   static class66 method2() {
      class66.field1014 = 0;
      return class17.method208();
   }

   static long method12(int var0, int var1, int var2, boolean var3, int var4) {
      long var5 = (long)((var0 & 127) | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var5 |= 65536L;
      }

      return var5;
   }

   static void method10(int var0) {
      class51.field520 = new class76();
      class51.field520.field1125 = client.field781[var0];
      class51.field520.field1124 = client.field782[var0];
      class51.field520.field1123 = client.field783[var0];
      class51.field520.field1126 = client.field784[var0];
      class51.field520.field1127 = client.field916[var0];
   }

   static void method11() {
      for(class56 var0 = (class56)client.field804.method4235(); var0 != null; var0 = (class56)client.field804.method4229()) {
         int var1 = var0.field556;
         if (class189.method4028(var1)) {
            boolean var2 = true;
            class232[] var3 = class145.field1951[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].field2685;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.field2496;
               class232 var5 = class18.method213(var4);
               if (var5 != null) {
                  class37.method721(var5);
               }
            }
         }
      }

   }
}
