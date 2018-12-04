import java.io.IOException;

public class class227 {
   static int[] field2627 = new int[32];
   public static int[] field2630;
   public static int[] field2629;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2627[var1] = var0 - 1;
         var0 += var0;
      }

      field2630 = new int[4000];
      field2629 = new int[4000];
   }

   public static void method4642(boolean var0) {
      if (class252.field3263 != null) {
         try {
            class184 var1 = new class184(4);
            var1.method3805(var0 ? 2 : 3);
            var1.method3755(0);
            class252.field3263.vmethod3578(var1.field2404, 0, 4);
         } catch (IOException var4) {
            try {
               class252.field3263.vmethod3558();
            } catch (Exception var3) {
               ;
            }

            ++class252.field3278;
            class252.field3263 = null;
         }

      }
   }

   static final void method4641(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.field853; ++var4) {
         if (client.field819[var4] + client.field763[var4] > var0 && client.field763[var4] < var0 + var2 && client.field854[var4] + client.field852[var4] > var1 && client.field852[var4] < var3 + var1) {
            client.field849[var4] = true;
         }
      }

   }
}
