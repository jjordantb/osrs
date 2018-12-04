public class class244 implements class190 {
   static final class244 field3191 = new class244(0, -1, true, false, true);
   static final class244 field3182 = new class244(1, 0, true, true, true);
   static final class244 field3181 = new class244(2, 1, true, true, false);
   static final class244 field3184 = new class244(3, 2, false, false, true);
   static final class244 field3183 = new class244(4, 3, false, false, true);
   static final class244 field3189 = new class244(5, 10, false, false, true);
   final int field3187;
   public final int field3185;
   public final boolean field3188;
   public final boolean field3190;

   class244(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.field3187 = var1;
      this.field3185 = var2;
      this.field3188 = var4;
      this.field3190 = var5;
   }

   public int vmethod6130() {
      return this.field3187;
   }

   static class232 method4799(class232 var0) {
      int var1 = class10.method110(class254.method5000(var0));
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            var0 = class18.method213(var0.field2700);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }
}
