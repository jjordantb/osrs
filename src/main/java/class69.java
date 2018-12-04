import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class class69 extends class206 {
   static class207 field1051 = new class207();
   static int[] field1047;
   static int field1050;
   static class61 field1063;
   class270 field1061;
   int field1048;
   int field1049;
   int field1059;
   int field1062;
   int field1052;
   int field1053;
   int field1054;
   class105 field1064;
   int field1056;
   int field1057;
   int[] field1058;
   int field1055;
   class105 field1060;

   void method1832() {
      int var1 = this.field1054;
      class270 var2 = this.field1061.method5279();
      if (var2 != null) {
         this.field1054 = var2.field3491;
         this.field1053 = var2.field3496 * 128;
         this.field1056 = var2.field3497;
         this.field1057 = var2.field3498;
         this.field1058 = var2.field3499;
      } else {
         this.field1054 = -1;
         this.field1053 = 0;
         this.field1056 = 0;
         this.field1057 = 0;
         this.field1058 = null;
      }

      if (var1 != this.field1054 && this.field1064 != null) {
         class43.field413.method2214(this.field1064);
         this.field1064 = null;
      }

   }

   public static final class97 method1840(class156 var0, int var1, int var2) {
      if (class97.field1377 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class97 var3 = class67.field1036.vmethod2256();
            var3.field1362 = new int[(class26.field264 ? 2 : 1) * 256];
            var3.field1367 = var2;
            var3.vmethod2353();
            var3.field1365 = (var2 & -1024) + 1024;
            if (var3.field1365 > 16384) {
               var3.field1365 = 16384;
            }

            var3.vmethod2354(var3.field1365);
            if (class19.field189 > 0 && class236.field2846 == null) {
               class236.field2846 = new class99();
               class79.field1155 = Executors.newScheduledThreadPool(1);
               class79.field1155.scheduleAtFixedRate(class236.field2846, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class236.field2846 != null) {
               if (class236.field2846.field1391[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class236.field2846.field1391[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new class97();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method1841(int var0) {
      if (var0 == -1 && !client.field879) {
         class23.method342();
      } else if (var0 != -1 && var0 != client.field878 && client.field877 != 0 && !client.field879) {
         class25.method478(2, class170.field2117, var0, 0, client.field877, false);
      }

      client.field878 = var0;
   }

   static final void method1831(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (client.field648 && var0 != class60.field599) {
            return;
         }

         long var7 = 0L;
         boolean var9 = true;
         boolean var10 = false;
         boolean var11 = false;
         if (var1 == 0) {
            var7 = class243.field3173.method3083(var0, var2, var3);
         }

         if (var1 == 1) {
            var7 = class243.field3173.method3084(var0, var2, var3);
         }

         if (var1 == 2) {
            var7 = class243.field3173.method3085(var0, var2, var3);
         }

         if (var1 == 3) {
            var7 = class243.field3173.method3182(var0, var2, var3);
         }

         int var12;
         if (0L != var7) {
            var12 = class243.field3173.method3087(var0, var2, var3, var7);
            int var14 = class56.method1110(var7);
            int var15 = var12 & 31;
            int var16 = var12 >> 6 & 3;
            class270 var13;
            if (var1 == 0) {
               class243.field3173.method3074(var0, var2, var3);
               var13 = class253.method4993(var14);
               if (var13.field3495 != 0) {
                  client.field701[var0].method3617(var2, var3, var15, var16, var13.field3468);
               }
            }

            if (var1 == 1) {
               class243.field3173.method3075(var0, var2, var3);
            }

            if (var1 == 2) {
               class243.field3173.method3076(var0, var2, var3);
               var13 = class253.method4993(var14);
               if (var2 + var13.field3501 > 103 || var3 + var13.field3501 > 103 || var2 + var13.field3475 > 103 || var3 + var13.field3475 > 103) {
                  return;
               }

               if (var13.field3495 != 0) {
                  client.field701[var0].method3618(var2, var3, var13.field3501, var13.field3475, var16, var13.field3468);
               }
            }

            if (var1 == 3) {
               class243.field3173.method3077(var0, var2, var3);
               var13 = class253.method4993(var14);
               if (var13.field3495 == 1) {
                  client.field701[var0].method3620(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var12 = var0;
            if (var0 < 3 && (class50.field492[1][var2][var3] & 2) == 2) {
               var12 = var0 + 1;
            }

            class1.method17(var0, var12, var2, var3, var4, var5, var6, class243.field3173, client.field701[var0]);
         }
      }

   }
}
