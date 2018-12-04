public class class226 extends class208 {
   static String field2624;
   public final int field2626;
   public final int field2621;
   public final int[] field2622;
   public final int[] field2623;

   class226(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2626 = var1;
      this.field2621 = var2;
      this.field2622 = var3;
      this.field2623 = var4;
   }

   public boolean method4635(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field2623.length) {
         int var3 = this.field2623[var2];
         if (var1 >= var3 && var1 <= var3 + this.field2622[var2]) {
            return true;
         }
      }

      return false;
   }

   static final class199 method4634(class184 var0, class199 var1) {
      int var2 = var0.method3983();
      int var3;
      if (var1 == null) {
         var3 = class3.method28(var2);
         var1 = new class199(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.method3983() == 1;
         int var5 = var0.method3773();
         Object var6;
         if (var4) {
            var6 = new class197(var0.method3778());
         } else {
            var6 = new class213(var0.method3892());
         }

         var1.method4170((class206)var6, (long)var5);
      }

      return var1;
   }
}
