public class class254 implements class190 {
   static final class254 field3290 = new class254(2, 0);
   static final class254 field3291 = new class254(1, 1);
   static final class254 field3296 = new class254(0, 2);
   public final int field3292;
   final int field3294;

   class254(int var1, int var2) {
      this.field3292 = var1;
      this.field3294 = var2;
   }

   public int vmethod6130() {
      return this.field3294;
   }

   public static boolean method5002(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   static void method4994(int var0, int var1) {
      if (client.field877 != 0 && var0 != -1) {
         class161.method3528(class192.field2456, var0, 0, client.field877, false);
         client.field879 = true;
      }

   }

   static int method5000(class232 var0) {
      class213 var1 = (class213)client.field800.method4224(((long)var0.field2770 << 32) + (long)var0.field2787);
      return var1 != null ? var1.field2512 : var0.field2713;
   }
}
