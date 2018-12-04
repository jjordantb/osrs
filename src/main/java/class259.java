public class class259 extends class208 {
   static class249 field3340;
   static class202 field3339 = new class202(64);
   public boolean field3341 = false;

   void method5080(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5078(var1, var2);
      }
   }

   void method5078(class184 var1, int var2) {
      if (var2 == 2) {
         this.field3341 = true;
      }

   }

   static boolean method5087(int var0) {
      return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30;
   }
}
