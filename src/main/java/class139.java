import java.util.Comparator;

public class class139 implements Comparator {
   static int field1928;
   final boolean field1929;

   public class139(boolean var1) {
      this.field1929 = var1;
   }

   int method3295(class289 var1, class289 var2) {
      return this.field1929 ? var1.field3706 - var2.field3706 : var2.field3706 - var1.field3706;
   }

   public int compare(Object var1, Object var2) {
      return this.method3295((class289)var1, (class289)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static class267 method3299(int var0) {
      class267 var1 = (class267)class267.field3413.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class267.field3411.method4831(34, var0);
         var1 = new class267();
         if (var2 != null) {
            var1.method5199(new class184(var2));
         }

         var1.method5196();
         class267.field3413.method4204(var1, (long)var0);
         return var1;
      }
   }
}
