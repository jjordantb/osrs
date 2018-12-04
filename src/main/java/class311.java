public class class311 {
   public int field3816 = -1;
   public int field3817 = -1;
   public int field3815 = -1;
   public int field3818 = -1;
   public int field3813 = -1;
   public int field3814 = -1;
   public int field3819 = -1;
   public int field3820 = -1;
   public int field3821 = -1;
   public int field3822 = -1;
   public int field3823 = -1;

   public void method5954(class249 var1) {
      byte[] var2 = var1.method4835(class310.field3812.field3811);
      class184 var3 = new class184(var2);

      while(true) {
         int var4 = var3.method3983();
         if (var4 == 0) {
            return;
         }

         switch(var4) {
         case 1:
            var3.method3773();
            break;
         case 2:
            this.field3816 = var3.method3898();
            this.field3817 = var3.method3898();
            this.field3815 = var3.method3898();
            this.field3818 = var3.method3898();
            this.field3813 = var3.method3898();
            this.field3814 = var3.method3898();
            this.field3819 = var3.method3898();
            this.field3820 = var3.method3898();
            this.field3821 = var3.method3898();
            this.field3822 = var3.method3898();
            this.field3823 = var3.method3898();
         }
      }
   }

   public static class322[] method5957() {
      class322[] var0 = new class322[class324.field3893];

      for(int var1 = 0; var1 < class324.field3893; ++var1) {
         class322 var2 = var0[var1] = new class322();
         var2.field3875 = class324.field3891;
         var2.field3876 = class324.field3896;
         var2.field3874 = class324.field3890[var1];
         var2.field3877 = class324.field3892[var1];
         var2.field3872 = class324.field3895[var1];
         var2.field3873 = class258.field3334[var1];
         var2.field3871 = class324.field3894;
         var2.field3870 = class324.field3897[var1];
      }

      class324.field3890 = null;
      class324.field3892 = null;
      class324.field3895 = null;
      class258.field3334 = null;
      class324.field3894 = null;
      class324.field3897 = null;
      return var0;
   }
}
