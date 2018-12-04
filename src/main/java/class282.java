public class class282 {
   static class113 field3688;
   long field3686 = -1L;
   long field3678 = -1L;
   public boolean field3680 = false;
   long field3681 = 0L;
   long field3682 = 0L;
   long field3679 = 0L;
   int field3684 = 0;
   int field3685 = 0;
   int field3683 = 0;
   int field3687 = 0;

   public void method5517() {
      this.field3686 = class120.method2866();
   }

   public void method5502() {
      if (-1L != this.field3686) {
         this.field3682 = class120.method2866() - this.field3686;
         this.field3686 = -1L;
      }

   }

   public void method5503(int var1) {
      this.field3678 = class120.method2866();
      this.field3684 = var1;
   }

   public void method5504() {
      if (this.field3678 != -1L) {
         this.field3681 = class120.method2866() - this.field3678;
         this.field3678 = -1L;
      }

      ++this.field3683;
      this.field3680 = true;
   }

   public void method5505() {
      this.field3680 = false;
      this.field3685 = 0;
   }

   public void method5501() {
      this.method5504();
   }

   public void method5507(class184 var1) {
      long var2 = this.field3682;
      var2 /= 10L;
      if (var2 < 0L) {
         var2 = 0L;
      } else if (var2 > 65535L) {
         var2 = 65535L;
      }

      var1.method3754((int)var2);
      long var4 = this.field3681;
      var4 /= 10L;
      if (var4 < 0L) {
         var4 = 0L;
      } else if (var4 > 65535L) {
         var4 = 65535L;
      }

      var1.method3754((int)var4);
      long var6 = this.field3679;
      var6 /= 10L;
      if (var6 < 0L) {
         var6 = 0L;
      } else if (var6 > 65535L) {
         var6 = 65535L;
      }

      var1.method3754((int)var6);
      var1.method3754(this.field3684);
      var1.method3754(this.field3685);
      var1.method3754(this.field3683);
      var1.method3754(this.field3687);
   }
}
