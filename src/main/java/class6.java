import java.util.Comparator;

final class class6 implements Comparator {
   static class97 field46;
   public static class249 field49;
   static class322[] field44;
   static String field48;
   static int field51;

   int method68(class2 var1, class2 var2) {
      return var1.method18().compareTo(var2.method18());
   }

   public int compare(Object var1, Object var2) {
      return this.method68((class2)var1, (class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static class244[] method80() {
      return new class244[]{class244.field3181, class244.field3189, class244.field3184, class244.field3191, class244.field3182, class244.field3183};
   }

   public static final int method79(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0D) {
         double var12;
         if (var4 < 0.5D) {
            var12 = var4 * (1.0D + var2);
         } else {
            var12 = var2 + var4 - var4 * var2;
         }

         double var14 = var4 * 2.0D - var12;
         double var16 = var0 + 0.3333333333333333D;
         if (var16 > 1.0D) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333D;
         if (var20 < 0.0D) {
            ++var20;
         }

         if (var16 * 6.0D < 1.0D) {
            var6 = var14 + 6.0D * (var12 - var14) * var16;
         } else if (2.0D * var16 < 1.0D) {
            var6 = var12;
         } else if (var16 * 3.0D < 2.0D) {
            var6 = var14 + (0.6666666666666666D - var16) * (var12 - var14) * 6.0D;
         } else {
            var6 = var14;
         }

         if (6.0D * var0 < 1.0D) {
            var8 = var14 + var0 * (var12 - var14) * 6.0D;
         } else if (2.0D * var0 < 1.0D) {
            var8 = var12;
         } else if (var0 * 3.0D < 2.0D) {
            var8 = var14 + 6.0D * (0.6666666666666666D - var0) * (var12 - var14);
         } else {
            var8 = var14;
         }

         if (6.0D * var20 < 1.0D) {
            var10 = var14 + var20 * 6.0D * (var12 - var14);
         } else if (2.0D * var20 < 1.0D) {
            var10 = var12;
         } else if (var20 * 3.0D < 2.0D) {
            var10 = var14 + 6.0D * (var12 - var14) * (0.6666666666666666D - var20);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0D);
      int var13 = (int)(256.0D * var8);
      int var23 = (int)(var10 * 256.0D);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   static class172[] method70() {
      return new class172[]{class172.field2310, class172.field2315, class172.field2313, class172.field2311, class172.field2312};
   }

   static final void method82(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class189.method4028(var0)) {
         class45.method827(class145.field1951[var0], -1, var1, var2, var3, var4, var5, var6);
      }
   }

   static final void method67(class56 var0, boolean var1) {
      int var2 = var0.field556;
      int var3 = (int)var0.field2496;
      var0.method4271();
      if (var1) {
         class79.method2036(var2);
      }

      class230.method4700(var2);
      class232 var4 = class18.method213(var3);
      if (var4 != null) {
         class37.method721(var4);
      }

      for(int var5 = 0; var5 < client.field780; ++var5) {
         if (class259.method5087(client.field783[var5])) {
            if (var5 < client.field780 - 1) {
               for(int var6 = var5; var6 < client.field780 - 1; ++var6) {
                  client.field916[var6] = client.field916[var6 + 1];
                  client.field786[var6] = client.field786[var6 + 1];
                  client.field783[var6] = client.field783[var6 + 1];
                  client.field784[var6] = client.field784[var6 + 1];
                  client.field781[var6] = client.field781[var6 + 1];
                  client.field782[var6] = client.field782[var6 + 1];
                  client.field772[var6] = client.field772[var6 + 1];
               }
            }

            --var5;
            --client.field780;
         }
      }

      class75.method2002();
      if (client.field803 != -1) {
         class33.method607(client.field803, 1);
      }

   }
}
