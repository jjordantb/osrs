public class class145 extends class285 {
   public static class232[][] field1951;
   static class251 field1952;
   final boolean field1950;

   public class145(boolean var1) {
      this.field1950 = var1;
   }

   int method3343(class289 var1, class289 var2) {
      if (var2.field3708 != var1.field3708) {
         return this.field1950 ? var1.field3708 - var2.field3708 : var2.field3708 - var1.field3708;
      } else {
         return this.method5566(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3343((class289)var1, (class289)var2);
   }

   public static class323 method3349(class249 var0, int var1, int var2) {
      return !class17.method212(var0, var1, var2) ? null : class248.method4824();
   }
}
