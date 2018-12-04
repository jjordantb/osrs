public class class283 extends class289 {
   class291 field3689;
   class291 field3690;

   class283() {
      this.field3689 = class291.field3713;
      this.field3690 = class291.field3713;
   }

   void method5521() {
      this.field3689 = class291.field3713;
   }

   public final boolean method5522() {
      if (this.field3689 == class291.field3713) {
         this.method5537();
      }

      return this.field3689 == class291.field3712;
   }

   void method5537() {
      this.field3689 = class170.field2150.field1040.method5608(super.field3692) ? class291.field3712 : class291.field3711;
   }

   void method5524() {
      this.field3690 = class291.field3713;
   }

   public final boolean method5525() {
      if (this.field3690 == class291.field3713) {
         this.method5535();
      }

      return this.field3690 == class291.field3712;
   }

   void method5535() {
      this.field3690 = class170.field2150.field1041.method5608(super.field3692) ? class291.field3712 : class291.field3711;
   }

   public static final boolean method5540() {
      class39 var0 = class39.field386;
      synchronized(class39.field386) {
         if (class39.field388 == class39.field390) {
            return false;
         } else {
            class59.field598 = class39.field369[class39.field388];
            class131.field1856 = class39.field384[class39.field388];
            class39.field388 = class39.field388 + 1 & 127;
            return true;
         }
      }
   }
}
