public class class193 {
   public static class220 field2461;
   static class248 field2460;

   static final boolean method4099(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      class184 var4 = new class184(var0);
      int var5 = -1;

      label68:
      while(true) {
         int var6 = var4.method3784();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.method3783();
               if (var9 == 0) {
                  continue label68;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.method3983() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  class270 var15 = class253.method4993(var5);
                  if (var12 != 22 || !client.field648 || var15.field3470 != 0 || var15.field3495 == 1 || var15.field3489) {
                     if (!var15.method5274()) {
                        ++client.field753;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.method3783();
            if (var9 == 0) {
               break;
            }

            var4.method3983();
         }
      }
   }
}
