public class class172 implements class169 {
   public static final class172 field2313 = new class172(14, 0);
   static final class172 field2310 = new class172(15, 4);
   public static final class172 field2311 = new class172(16, -2);
   public static final class172 field2312 = new class172(18, -2);
   static final class172 field2315 = new class172(27, 0);
   static final class172[] field2309 = new class172[32];
   public final int field2314;

   static {
      class172[] var0 = class6.method70();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field2309[var0[var1].field2314] = var0[var1];
      }

   }

   class172(int var1, int var2) {
      this.field2314 = var1;
   }

   static class245[] method3658() {
      return new class245[]{class245.field3194, class245.field3199, class245.field3195, class245.field3201};
   }

   public static int method3663(CharSequence var0) {
      return class161.method3532(var0, 10, true);
   }

   public static boolean method3662(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   static final void method3664(String var0) {
      class34.method643(var0 + " is already on your ignore list");
   }
}
