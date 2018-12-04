public class class56 extends class206 {
   int field556;
   int field560;
   boolean field555 = false;

   public static int method1110(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static void method1112() {
      class229.field2636.method4199();
   }

   static void method1108(int var0, int var1) {
      int var2 = class163.field2066.method5793("Choose Option");

      int var3;
      int var4;
      for(var3 = 0; var3 < client.field780; ++var3) {
         var4 = class163.field2066.method5793(class34.method644(var3));
         if (var4 > var2) {
            var2 = var4;
         }
      }

      var2 += 8;
      var3 = client.field780 * 15 + 22;
      var4 = var0 - var2 / 2;
      if (var4 + var2 > class68.field1038) {
         var4 = class68.field1038 - var2;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1;
      if (var1 + var3 > class141.field1937) {
         var5 = class141.field1937 - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      class163.field2067 = var4;
      class86.field1260 = var5;
      class74.field1113 = var2;
      class128.field1838 = client.field780 * 15 + 22;
   }

   static final void method1111(int var0, int var1, int var2, int var3, class323 var4, class226 var5) {
      if (var4 != null) {
         int var6 = client.field658 & 2047;
         int var7 = var3 * var3 + var2 * var2;
         if (var7 <= 6400) {
            int var8 = class124.field1747[var6];
            int var9 = class124.field1754[var6];
            int var10 = var9 * var2 + var3 * var8 >> 16;
            int var11 = var3 * var9 - var8 * var2 >> 16;
            if (var7 > 2500) {
               var4.method6179(var10 + var5.field2626 / 2 - var4.field3883 / 2, var5.field2621 / 2 - var11 - var4.field3884 / 2, var0, var1, var5.field2626, var5.field2621, var5.field2623, var5.field2622);
            } else {
               var4.method6164(var0 + var10 + var5.field2626 / 2 - var4.field3883 / 2, var5.field2621 / 2 + var1 - var11 - var4.field3884 / 2);
            }

         }
      }
   }

   static String method1109(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (client.field645 == 1) {
         var0 = var0 + "-wtrc";
      } else if (client.field645 == 2) {
         var0 = var0 + "-wtqa";
      } else if (client.field645 == 3) {
         var0 = var0 + "-wtwip";
      } else if (client.field645 == 5) {
         var0 = var0 + "-wti";
      } else if (client.field645 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (class6.field48 != null) {
         var3 = "/p=" + class6.field48;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + client.field785 + "/a=" + client.field650 + var3 + "/";
   }
}
