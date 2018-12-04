import java.util.Iterator;

public class class212 implements Iterator {
   class199 field2508;
   class206 field2509;
   int field2510;
   class206 field2511 = null;

   class212(class199 var1) {
      this.field2508 = var1;
      this.method4326();
   }

   void method4326() {
      this.field2509 = this.field2508.field2472[0].field2495;
      this.field2510 = 1;
      this.field2511 = null;
   }

   public boolean hasNext() {
      if (this.field2508.field2472[this.field2510 - 1] != this.field2509) {
         return true;
      } else {
         while(this.field2510 < this.field2508.field2470) {
            if (this.field2508.field2472[this.field2510++].field2495 != this.field2508.field2472[this.field2510 - 1]) {
               this.field2509 = this.field2508.field2472[this.field2510 - 1].field2495;
               return true;
            }

            this.field2509 = this.field2508.field2472[this.field2510 - 1];
         }

         return false;
      }
   }

   public Object next() {
      class206 var1;
      if (this.field2508.field2472[this.field2510 - 1] != this.field2509) {
         var1 = this.field2509;
         this.field2509 = var1.field2495;
         this.field2511 = var1;
         return var1;
      } else {
         do {
            if (this.field2510 >= this.field2508.field2470) {
               return null;
            }

            var1 = this.field2508.field2472[this.field2510++].field2495;
         } while(var1 == this.field2508.field2472[this.field2510 - 1]);

         this.field2509 = var1.field2495;
         this.field2511 = var1;
         return var1;
      }
   }

   public void remove() {
      this.field2511.method4271();
      this.field2511 = null;
   }
}
