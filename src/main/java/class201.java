import java.util.Iterator;

public class class201 implements Iterator {
   class205 field2478;
   class206 field2477;
   class206 field2476 = null;

   class201(class205 var1) {
      this.field2478 = var1;
      this.field2477 = this.field2478.field2493.field2495;
      this.field2476 = null;
   }

   public void remove() {
      this.field2476.method4271();
      this.field2476 = null;
   }

   public boolean hasNext() {
      return this.field2478.field2493 != this.field2477;
   }

   public Object next() {
      class206 var1 = this.field2477;
      if (var1 == this.field2478.field2493) {
         var1 = null;
         this.field2477 = null;
      } else {
         this.field2477 = var1.field2495;
      }

      this.field2476 = var1;
      return var1;
   }
}
