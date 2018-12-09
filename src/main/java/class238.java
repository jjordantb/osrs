public class class238 {
   public static void method4785() {
      if (class39.field386 != null) {
         class39 var0 = class39.field386;
         synchronized(class39.field386) {
            class39.field386 = null;
         }
      }

   }

   static final void method4784(int var0, int var1) {
      NodeDeque var2 = client.field829[class60.field599][var0][var1];
      if (var2 == null) {
         class243.field3173.method3078(class60.field599, var0, var1);
      } else {
         long var3 = -99999999L;
         class81 var5 = null;

         class81 var6;
         for(var6 = (class81)var2.method4298(); var6 != null; var6 = (class81)var2.method4283()) {
            class271 var7 = class84.method2125(var6.field1213);
            long var8 = (long)var7.field3544;
            if (var7.field3523 == 1) {
               var8 *= (long)(var6.field1214 + 1);
            }

            if (var8 > var3) {
               var3 = var8;
               var5 = var6;
            }
         }

         if (var5 == null) {
            class243.field3173.method3078(class60.field599, var0, var1);
         } else {
            var2.method4277(var5);
            class81 var12 = null;
            class81 var11 = null;

            for(var6 = (class81)var2.method4298(); var6 != null; var6 = (class81)var2.method4283()) {
               if (var5.field1213 != var6.field1213) {
                  if (var12 == null) {
                     var12 = var6;
                  }

                  if (var6.field1213 != var12.field1213 && var11 == null) {
                     var11 = var6;
                  }
               }
            }

            long var9 = class0.method12(var0, var1, 3, false, 0);
            class243.field3173.method3064(class60.field599, var0, var1, class152.method3394(var0 * 128 + 64, var1 * 128 + 64, class60.field599), var5, var9, var12, var11);
         }
      }
   }
}
