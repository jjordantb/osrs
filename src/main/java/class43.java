import javax.imageio.ImageIO;

public class class43 {
   static class90 field413;
   static long field411;

   static {
      ImageIO.setUseCache(false);
   }

   public static class190 method791(class190[] var0, int var1) {
      class190[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class190 var4 = var2[var3];
         if (var1 == var4.vmethod6130()) {
            return var4;
         }
      }

      return null;
   }

   static class78[] method787() {
      return new class78[]{class78.field1136, class78.field1134, class78.field1139, class78.field1141};
   }

   static final int method792(int var0, int var1) {
      int var2 = class189.method4037(var0 + '넵', var1 + 91923, 4) - 128 + (class189.method4037(var0 + 10294, var1 + '鎽', 2) - 128 >> 1) + (class189.method4037(var0, var1, 1) - 128 >> 2);
      var2 = (int)((double)var2 * 0.3D) + 35;
      if (var2 < 10) {
         var2 = 10;
      } else if (var2 > 60) {
         var2 = 60;
      }

      return var2;
   }

   static final void method790(class63 var0) {
      long var1 = 0L;
      int var3 = -1;
      int var4 = 0;
      int var5 = 0;
      if (var0.field926 == 0) {
         var1 = class243.field3173.method3083(var0.field934, var0.field922, var0.field925);
      }

      if (var0.field926 == 1) {
         var1 = class243.field3173.method3084(var0.field934, var0.field922, var0.field925);
      }

      if (var0.field926 == 2) {
         var1 = class243.field3173.method3085(var0.field934, var0.field922, var0.field925);
      }

      if (var0.field926 == 3) {
         var1 = class243.field3173.method3182(var0.field934, var0.field922, var0.field925);
      }

      if (0L != var1) {
         int var6 = class243.field3173.method3087(var0.field934, var0.field922, var0.field925, var1);
         var3 = class56.method1110(var1);
         var4 = var6 & 31;
         var5 = var6 >> 6 & 3;
      }

      var0.field923 = var3;
      var0.field924 = var4;
      var0.field935 = var5;
   }
}
