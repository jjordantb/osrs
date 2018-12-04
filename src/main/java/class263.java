public class class263 extends class208 {
   public static class249 field3389;
   public static class249 field3380;
   public static class202 field3385 = new class202(64);
   public static class202 field3382 = new class202(64);
   public int field3383;
   public int field3391 = 255;
   public int field3386 = 255;
   public int field3394 = -1;
   public int field3381 = 1;
   public int field3387 = 70;
   int field3390 = -1;
   int field3379 = -1;
   public int field3392 = 30;
   public int field3393 = 0;

   void method5147(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5156(var1, var2);
      }
   }

   void method5156(class184 var1, int var2) {
      if (var2 == 1) {
         var1.method3771();
      } else if (var2 == 2) {
         this.field3391 = var1.method3983();
      } else if (var2 == 3) {
         this.field3386 = var1.method3983();
      } else if (var2 == 4) {
         this.field3394 = 0;
      } else if (var2 == 5) {
         this.field3387 = var1.method3771();
      } else if (var2 == 6) {
         var1.method3983();
      } else if (var2 == 7) {
         this.field3390 = var1.method3898();
      } else if (var2 == 8) {
         this.field3379 = var1.method3898();
      } else if (var2 == 11) {
         this.field3394 = var1.method3771();
      } else if (var2 == 14) {
         this.field3392 = var1.method3983();
      } else if (var2 == 15) {
         this.field3393 = var1.method3983();
      }

   }

   public class323 method5149() {
      if (this.field3390 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3382.method4198((long)this.field3390);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3380, this.field3390, 0);
            if (var1 != null) {
               field3382.method4204(var1, (long)this.field3390);
            }

            return var1;
         }
      }
   }

   public class323 method5150() {
      if (this.field3379 < 0) {
         return null;
      } else {
         class323 var1 = (class323)field3382.method4198((long)this.field3379);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class145.method3349(field3380, this.field3379, 0);
            if (var1 != null) {
               field3382.method4204(var1, (long)this.field3379);
            }

            return var1;
         }
      }
   }
}
