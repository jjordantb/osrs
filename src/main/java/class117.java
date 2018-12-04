public final class class117 {
   int field1583;
   int field1584;
   int field1585;
   public class129 field1586;
   public long field1587;
   int field1588;

   static final void method2851(boolean var0) {
      for(int var1 = 0; var1 < client.field686; ++var1) {
         class73 var2 = client.field806[client.field687[var1]];
         if (var2 != null && var2.vmethod1973() && var2.field1102.field3572 == var0 && var2.field1102.method5398()) {
            int var3 = var2.field953 >> 7;
            int var4 = var2.field999 >> 7;
            if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
               if (var2.field964 == 1 && (var2.field953 & 127) == 64 && (var2.field999 & 127) == 64) {
                  if (client.field740[var3][var4] == client.field741) {
                     continue;
                  }

                  client.field740[var3][var4] = client.field741;
               }

               long var5 = class0.method12(0, 0, 1, !var2.field1102.field3589, client.field687[var1]);
               var2.field943 = client.field655;
               class243.field3173.method3092(class60.field599, var2.field953, var2.field999, class152.method3394(var2.field964 * 64 - 64 + var2.field953, var2.field964 * 64 - 64 + var2.field999, class60.field599), var2.field964 * 64 - 64 + 60, var2, var2.field940, var5, var2.field941);
            }
         }
      }

   }

   static void method2852(class232 var0, int var1, int var2) {
      if (var0.field2672 == 0) {
         var0.field2680 = var0.field2676;
      } else if (var0.field2672 == 1) {
         var0.field2680 = var0.field2676 + (var1 - var0.field2682) / 2;
      } else if (var0.field2672 == 2) {
         var0.field2680 = var1 - var0.field2682 - var0.field2676;
      } else if (var0.field2672 == 3) {
         var0.field2680 = var0.field2676 * var1 >> 14;
      } else if (var0.field2672 == 4) {
         var0.field2680 = (var0.field2676 * var1 >> 14) + (var1 - var0.field2682) / 2;
      } else {
         var0.field2680 = var1 - var0.field2682 - (var0.field2676 * var1 >> 14);
      }

      if (var0.field2673 == 0) {
         var0.field2772 = var0.field2751;
      } else if (var0.field2673 == 1) {
         var0.field2772 = (var2 - var0.field2683) / 2 + var0.field2751;
      } else if (var0.field2673 == 2) {
         var0.field2772 = var2 - var0.field2683 - var0.field2751;
      } else if (var0.field2673 == 3) {
         var0.field2772 = var2 * var0.field2751 >> 14;
      } else if (var0.field2673 == 4) {
         var0.field2772 = (var2 - var0.field2683) / 2 + (var2 * var0.field2751 >> 14);
      } else {
         var0.field2772 = var2 - var0.field2683 - (var2 * var0.field2751 >> 14);
      }

   }
}
