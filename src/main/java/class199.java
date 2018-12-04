import java.util.Iterator;

public final class class199 implements Iterable {
   int field2470;
   class206[] field2472;
   class206 field2471;
   class206 field2473;
   int field2474 = 0;

   public class199(int var1) {
      this.field2470 = var1;
      this.field2472 = new class206[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class206 var3 = this.field2472[var2] = new class206();
         var3.field2495 = var3;
         var3.field2497 = var3;
      }

   }

   public class206 method4185(long var1) {
      class206 var3 = this.field2472[(int)(var1 & (long)(this.field2470 - 1))];

      for(this.field2471 = var3.field2495; var3 != this.field2471; this.field2471 = this.field2471.field2495) {
         if (this.field2471.field2496 == var1) {
            class206 var4 = this.field2471;
            this.field2471 = this.field2471.field2495;
            return var4;
         }
      }

      this.field2471 = null;
      return null;
   }

   public void method4170(class206 var1, long var2) {
      if (var1.field2497 != null) {
         var1.method4271();
      }

      class206 var4 = this.field2472[(int)(var2 & (long)(this.field2470 - 1))];
      var1.field2497 = var4.field2497;
      var1.field2495 = var4;
      var1.field2497.field2495 = var1;
      var1.field2495.field2497 = var1;
      var1.field2496 = var2;
   }

   public void method4178() {
      for(int var1 = 0; var1 < this.field2470; ++var1) {
         class206 var2 = this.field2472[var1];

         while(true) {
            class206 var3 = var2.field2495;
            if (var3 == var2) {
               break;
            }

            var3.method4271();
         }
      }

      this.field2471 = null;
      this.field2473 = null;
   }

   public class206 method4172() {
      this.field2474 = 0;
      return this.method4173();
   }

   public class206 method4173() {
      class206 var1;
      if (this.field2474 > 0 && this.field2472[this.field2474 - 1] != this.field2473) {
         var1 = this.field2473;
         this.field2473 = var1.field2495;
         return var1;
      } else {
         do {
            if (this.field2474 >= this.field2470) {
               return null;
            }

            var1 = this.field2472[this.field2474++].field2495;
         } while(var1 == this.field2472[this.field2474 - 1]);

         this.field2473 = var1.field2495;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class212(this);
   }
}
