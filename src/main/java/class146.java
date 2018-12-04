public class class146 extends class285 {
   static String field1954;
   final boolean field1956;

   public class146(boolean var1) {
      this.field1956 = var1;
   }

   int method3350(class289 var1, class289 var2) {
      if (var2.field3710 != var1.field3710) {
         return this.field1956 ? var1.field3710 - var2.field3710 : var2.field3710 - var1.field3710;
      } else {
         return this.method5566(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3350((class289)var1, (class289)var2);
   }

   static final void method3356(String var0, int var1) {
      class174 var2 = class131.method3243(class171.field2284, client.field690.field1282);
      var2.field2332.method3805(class97.method2404(var0) + 1);
      var2.field2332.method3889(var0);
      var2.field2332.method3805(var1);
      client.field690.method2193(var2);
   }
}
