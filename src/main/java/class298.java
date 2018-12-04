import java.util.HashMap;

public class class298 {
   class249 field3751;
   class249 field3750;
   HashMap field3752;

   public class298(class249 var1, class249 var2) {
      this.field3751 = var1;
      this.field3750 = var2;
      this.field3752 = new HashMap();
   }

   public HashMap method5771(class297[] var1) {
      HashMap var2 = new HashMap();
      class297[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class297 var5 = var3[var4];
         if (this.field3752.containsKey(var5)) {
            var2.put(var5, this.field3752.get(var5));
         } else {
            class249 var7 = this.field3751;
            class249 var8 = this.field3750;
            String var9 = var5.field3748;
            int var10 = var7.method4825(var9);
            int var11 = var7.method4847(var10, "");
            class300 var12;
            if (!class17.method212(var7, var10, var11)) {
               var12 = null;
            } else {
               byte[] var14 = var8.method4831(var10, var11);
               class300 var13;
               if (var14 == null) {
                  var13 = null;
               } else {
                  class300 var15 = new class300(var14, class324.field3890, class324.field3892, class324.field3895, class258.field3334, class324.field3894, class324.field3897);
                  class324.field3890 = null;
                  class324.field3892 = null;
                  class324.field3895 = null;
                  class258.field3334 = null;
                  class324.field3894 = null;
                  class324.field3897 = null;
                  var13 = var15;
               }

               var12 = var13;
            }

            if (var12 != null) {
               this.field3752.put(var5, var12);
               var2.put(var5, var12);
            }
         }
      }

      return var2;
   }
}
