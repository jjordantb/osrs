public class class54 extends class206 {
   static class204 field534 = new class204(32);
   int[] field533 = new int[]{-1};
   int[] field532 = new int[]{0};

   public static int method1088(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class131.method3242(var0.charAt(var3));
      }

      return var2;
   }

   static int method1105(int var0, class86 var1, boolean var2) {
      class232 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class18.method213(class70.field1070[--class60.field600]);
      } else {
         var3 = var2 ? class10.field75 : class70.field1080;
      }

      if (var0 == 1927) {
         if (class70.field1075 >= 10) {
            throw new RuntimeException();
         } else if (var3.field2782 == null) {
            return 0;
         } else {
            class57 var4 = new class57();
            var4.field570 = var3;
            var4.field575 = var3.field2782;
            var4.field572 = class70.field1075 + 1;
            client.field842.method4276(var4);
            return 1;
         }
      } else {
         return 2;
      }
   }
}
