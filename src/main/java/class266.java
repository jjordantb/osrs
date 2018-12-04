public class class266 extends class208 {
   static class202 field3406 = new class202(64);
   char field3403;
   public int field3402;
   public String field3405;
   boolean field3404 = true;

   void method5186() {
   }

   void method5176(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5179(var1, var2);
      }
   }

   void method5179(class184 var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.method3931();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("");
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class303.field3785[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field3403 = var3;
      } else if (var2 == 2) {
         this.field3402 = var1.method3892();
      } else if (var2 == 4) {
         this.field3404 = false;
      } else if (var2 == 5) {
         this.field3405 = var1.method3778();
      }

   }

   public boolean method5180() {
      return this.field3403 == 's';
   }
}
