public class class72 extends class206 {
   static int field1100;
   class263 field1097;
   class205 field1099 = new class205();

   class72(class263 var1) {
      this.field1097 = var1;
   }

   void method1959(int var1, int var2, int var3, int var4) {
      class65 var5 = null;
      int var6 = 0;

      for(class65 var7 = (class65)this.field1099.method4250(); var7 != null; var7 = (class65)this.field1099.method4248()) {
         ++var6;
         if (var7.field1006 == var1) {
            var7.method1681(var1, var2, var3, var4);
            return;
         }

         if (var7.field1006 <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.field1099.method4246(new class65(var1, var2, var3, var4));
         }

      } else {
         class205.method4245(new class65(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.field1099.method4250().method4271();
         }

      }
   }

   class65 method1960(int var1) {
      class65 var2 = (class65)this.field1099.method4250();
      if (var2 != null && var2.field1006 <= var1) {
         for(class65 var3 = (class65)this.field1099.method4248(); var3 != null && var3.field1006 <= var1; var3 = (class65)this.field1099.method4248()) {
            var2.method4271();
            var2 = var3;
         }

         if (this.field1097.field3387 + var2.field1003 + var2.field1006 > var1) {
            return var2;
         } else {
            var2.method4271();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method1965() {
      return this.field1099.method4249();
   }

   public static void method1967(class249 var0, String var1, String var2, int var3, boolean var4) {
      int var5 = var0.method4825(var1);
      int var6 = var0.method4847(var5, var2);
      class161.method3528(var0, var5, var6, var3, var4);
   }

   static final int method1958(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
