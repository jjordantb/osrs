public class class315 {
   public int field3836;
   public int field3835;
   public int field3837;
   public int field3838;

   public class315(int var1, int var2, int var3, int var4) {
      this.method5990(var1, var2);
      this.method5991(var3, var4);
   }

   public class315(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public void method5990(int var1, int var2) {
      this.field3836 = var1;
      this.field3835 = var2;
   }

   public void method5991(int var1, int var2) {
      this.field3837 = var1;
      this.field3838 = var2;
   }

   public void method5993(class315 var1, class315 var2) {
      this.method6022(var1, var2);
      this.method5994(var1, var2);
   }

   void method6022(class315 var1, class315 var2) {
      var2.field3836 = this.field3836;
      var2.field3837 = this.field3837;
      if (this.field3836 < var1.field3836) {
         var2.field3837 -= var1.field3836 - this.field3836;
         var2.field3836 = var1.field3836;
      }

      if (var2.method5995() > var1.method5995()) {
         var2.field3837 -= var2.method5995() - var1.method5995();
      }

      if (var2.field3837 < 0) {
         var2.field3837 = 0;
      }

   }

   void method5994(class315 var1, class315 var2) {
      var2.field3835 = this.field3835;
      var2.field3838 = this.field3838;
      if (this.field3835 < var1.field3835) {
         var2.field3838 -= var1.field3835 - this.field3835;
         var2.field3835 = var1.field3835;
      }

      if (var2.method5996() > var1.method5996()) {
         var2.field3838 -= var2.method5996() - var1.method5996();
      }

      if (var2.field3838 < 0) {
         var2.field3838 = 0;
      }

   }

   int method5995() {
      return this.field3837 + this.field3836;
   }

   int method5996() {
      return this.field3838 + this.field3835;
   }

   public String toString() {
      return null;
   }
}
