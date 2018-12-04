public class class206 {
   public long field2496;
   public class206 field2495;
   class206 field2497;

   public void method4271() {
      if (this.field2497 != null) {
         this.field2497.field2495 = this.field2495;
         this.field2495.field2497 = this.field2497;
         this.field2495 = null;
         this.field2497 = null;
      }
   }

   public boolean method4272() {
      return this.field2497 != null;
   }
}
