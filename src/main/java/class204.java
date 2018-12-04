public final class class204 {
   int field2491;
   class206[] field2489;
   class206 field2490;
   class206 field2488;
   int field2492 = 0;

   public class204(int var1) {
      this.field2491 = var1;
      this.field2489 = new class206[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class206 var3 = this.field2489[var2] = new class206();
         var3.field2495 = var3;
         var3.field2497 = var3;
      }

   }

   public class206 method4224(long var1) {
      class206 var3 = this.field2489[(int)(var1 & (long)(this.field2491 - 1))];

      for(this.field2490 = var3.field2495; var3 != this.field2490; this.field2490 = this.field2490.field2495) {
         if (this.field2490.field2496 == var1) {
            class206 var4 = this.field2490;
            this.field2490 = this.field2490.field2495;
            return var4;
         }
      }

      this.field2490 = null;
      return null;
   }

   public void method4226(class206 var1, long var2) {
      if (var1.field2497 != null) {
         var1.method4271();
      }

      class206 var4 = this.field2489[(int)(var2 & (long)(this.field2491 - 1))];
      var1.field2497 = var4.field2497;
      var1.field2495 = var4;
      var1.field2497.field2495 = var1;
      var1.field2495.field2497 = var1;
      var1.field2496 = var2;
   }

   void method4227() {
      for(int var1 = 0; var1 < this.field2491; ++var1) {
         class206 var2 = this.field2489[var1];

         while(true) {
            class206 var3 = var2.field2495;
            if (var3 == var2) {
               break;
            }

            var3.method4271();
         }
      }

      this.field2490 = null;
      this.field2488 = null;
   }

   public class206 method4235() {
      this.field2492 = 0;
      return this.method4229();
   }

   public class206 method4229() {
      class206 var1;
      if (this.field2492 > 0 && this.field2489[this.field2492 - 1] != this.field2488) {
         var1 = this.field2488;
         this.field2488 = var1.field2495;
         return var1;
      } else {
         do {
            if (this.field2492 >= this.field2491) {
               return null;
            }

            var1 = this.field2489[this.field2492++].field2495;
         } while(var1 == this.field2489[this.field2492 - 1]);

         this.field2488 = var1.field2495;
         return var1;
      }
   }
}
