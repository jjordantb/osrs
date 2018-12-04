import java.util.Iterator;

public class class205 implements Iterable {
   class206 field2493 = new class206();
   class206 field2494;

   public class205() {
      this.field2493.field2495 = this.field2493;
      this.field2493.field2497 = this.field2493;
   }

   public void method4267() {
      while(this.field2493.field2495 != this.field2493) {
         this.field2493.field2495.method4271();
      }

   }

   public void method4269(class206 var1) {
      if (var1.field2497 != null) {
         var1.method4271();
      }

      var1.field2497 = this.field2493.field2497;
      var1.field2495 = this.field2493;
      var1.field2497.field2495 = var1;
      var1.field2495.field2497 = var1;
   }

   public void method4246(class206 var1) {
      if (var1.field2497 != null) {
         var1.method4271();
      }

      var1.field2497 = this.field2493;
      var1.field2495 = this.field2493.field2495;
      var1.field2497.field2495 = var1;
      var1.field2495.field2497 = var1;
   }

   public class206 method4250() {
      return this.method4244((class206)null);
   }

   class206 method4244(class206 var1) {
      class206 var2;
      if (var1 == null) {
         var2 = this.field2493.field2495;
      } else {
         var2 = var1;
      }

      if (var2 == this.field2493) {
         this.field2494 = null;
         return null;
      } else {
         this.field2494 = var2.field2495;
         return var2;
      }
   }

   public class206 method4248() {
      class206 var1 = this.field2494;
      if (var1 == this.field2493) {
         this.field2494 = null;
         return null;
      } else {
         this.field2494 = var1.field2495;
         return var1;
      }
   }

   public boolean method4249() {
      return this.field2493.field2495 == this.field2493;
   }

   public Iterator iterator() {
      return new class201(this);
   }

   public static void method4245(class206 var0, class206 var1) {
      if (var0.field2497 != null) {
         var0.method4271();
      }

      var0.field2497 = var1;
      var0.field2495 = var1.field2495;
      var0.field2497.field2495 = var0;
      var0.field2495.field2497 = var0;
   }
}
