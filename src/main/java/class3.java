import java.lang.management.GarbageCollectorMXBean;
import java.util.Comparator;

final class class3 implements Comparator {
   static class295 field26;
   static class323 field29;
   static GarbageCollectorMXBean field24;
   static class300 field25;

   int method30(class2 var1, class2 var2) {
      return var1.field19.field33 < var2.field19.field33 ? -1 : (var2.field19.field33 == var1.field19.field33 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method30((class2)var1, (class2)var2);
   }

   public static int method28(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   static final void method36(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = client.field649;
      } else if (var5 >= 100) {
         var6 = client.field896;
      } else {
         var6 = (client.field896 - client.field649) * var5 / 100 + client.field649;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var10;
      if (var7 < client.field901) {
         var10 = client.field901;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 > client.field684) {
            var6 = client.field684;
            var8 = var3 * var6 * 512 / (var10 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               class319.method6037();
               class319.method6047(var0, var1, var9, var3, -16777216);
               class319.method6047(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > client.field754) {
         var10 = client.field754;
         var6 = var10 * var2 * 334 / (var3 * 512);
         if (var6 < client.field899) {
            var6 = client.field899;
            var8 = var10 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               class319.method6037();
               class319.method6047(var0, var1, var2, var9, -16777216);
               class319.method6047(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      client.field907 = var3 * var6 / 334;
      if (var2 != client.field644 || var3 != client.field764) {
         class57.method1122(var2, var3);
      }

      client.field657 = var0;
      client.field693 = var1;
      client.field644 = var2;
      client.field764 = var3;
   }
}
