public class class143 extends class285 {
   final boolean field1942;

   public class143(boolean var1) {
      this.field1942 = var1;
   }

   int method3331(class289 var1, class289 var2) {
      if (var1.field3708 != 0 && var2.field3708 != 0) {
         return this.field1942 ? var1.field3706 - var2.field3706 : var2.field3706 - var1.field3706;
      } else {
         return this.method5566(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3331((class289)var1, (class289)var2);
   }
}
