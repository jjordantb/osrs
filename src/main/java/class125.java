public final class class125 {
   int field1761;
   int field1756;
   int field1755;
   int field1757;
   int field1759;
   boolean field1760 = true;
   int field1758;

   class125(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field1761 = var1;
      this.field1756 = var2;
      this.field1755 = var3;
      this.field1757 = var4;
      this.field1759 = var5;
      this.field1758 = var6;
      this.field1760 = var7;
   }

   public static void method3051(byte[] var0) {
      class184 var1 = new class184(var0);
      var1.field2405 = var0.length - 2;
      class324.field3893 = var1.method3771();
      class324.field3890 = new int[class324.field3893];
      class324.field3892 = new int[class324.field3893];
      class324.field3895 = new int[class324.field3893];
      class258.field3334 = new int[class324.field3893];
      class324.field3897 = new byte[class324.field3893][];
      var1.field2405 = var0.length - 7 - class324.field3893 * 8;
      class324.field3891 = var1.method3771();
      class324.field3896 = var1.method3771();
      int var2 = (var1.method3983() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class324.field3893; ++var3) {
         class324.field3890[var3] = var1.method3771();
      }

      for(var3 = 0; var3 < class324.field3893; ++var3) {
         class324.field3892[var3] = var1.method3771();
      }

      for(var3 = 0; var3 < class324.field3893; ++var3) {
         class324.field3895[var3] = var1.method3771();
      }

      for(var3 = 0; var3 < class324.field3893; ++var3) {
         class258.field3334[var3] = var1.method3771();
      }

      var1.field2405 = var0.length - 7 - class324.field3893 * 8 - (var2 - 1) * 3;
      class324.field3894 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class324.field3894[var3] = var1.method3773();
         if (class324.field3894[var3] == 0) {
            class324.field3894[var3] = 1;
         }
      }

      var1.field2405 = 0;

      for(var3 = 0; var3 < class324.field3893; ++var3) {
         int var4 = class324.field3895[var3];
         int var5 = class258.field3334[var3];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class324.field3897[var3] = var7;
         int var8 = var1.method3983();
         int var9;
         if (var8 == 0) {
            for(var9 = 0; var9 < var6; ++var9) {
               var7[var9] = var1.method3931();
            }
         } else if (var8 == 1) {
            for(var9 = 0; var9 < var4; ++var9) {
               for(int var10 = 0; var10 < var5; ++var10) {
                  var7[var9 + var4 * var10] = var1.method3931();
               }
            }
         }
      }

   }

   static final void method3052() {
      class48.method1021();
      class261.field3359.method4199();
      class17.method210();
      class270.field3453.method4199();
      class270.field3457.method4199();
      class270.field3455.method4199();
      class270.field3473.method4199();
      class273.field3566.method4199();
      class273.field3567.method4199();
      class89.method2200();
      class51.method1062();
      class186.method4008();
      class265.field3396.method4199();
      class60.method1169();
      class269.field3429.method4199();
      class269.field3430.method4199();
      class269.field3434.method4199();
      class263.field3385.method4199();
      class263.field3382.method4199();
      class52.method1073();
      class241.method4789();
      class257.field3314.method4199();
      class56.method1112();
      class232.field2661.method4199();
      class232.field2662.method4199();
      class232.field2663.method4199();
      class232.field2664.method4199();
      ((class113)class124.field1752).method2763();
      class86.field1261.method4199();
      class19.field185.method4844();
      class42.field401.method4844();
      class157.field2020.method4844();
      class9.field72.method4844();
      class332.field4017.method4844();
      class170.field2117.method4844();
      class10.field80.method4844();
      class154.field2002.method4844();
      class17.field162.method4844();
      class12.field99.method4844();
      class192.field2456.method4844();
      class137.field1914.method4844();
   }
}
