public class class286 extends class287 {
   static class104 field3697;
   final class330 field3696;

   public class286(class330 var1) {
      super(400);
      this.field3696 = var1;
   }

   class284 vmethod5744() {
      return new class288();
   }

   class284[] vmethod5760(int var1) {
      return new class288[var1];
   }

   public void method5574(class184 var1, int var2) {
      while(true) {
         if (var1.field2405 < var2) {
            int var3 = var1.method3983();
            boolean var4 = (var3 & 1) == 1;
            class293 var5 = new class293(var1.method3778(), this.field3696);
            class293 var6 = new class293(var1.method3778(), this.field3696);
            var1.method3778();
            if (var5 != null && var5.method5707()) {
               class288 var7 = (class288)this.method5590(var5);
               if (var4) {
                  class288 var8 = (class288)this.method5590(var6);
                  if (var8 != null && var7 != var8) {
                     if (var7 != null) {
                        this.method5641(var8);
                     } else {
                        var7 = var8;
                     }
                  }
               }

               if (var7 != null) {
                  this.method5591(var7, var5, var6);
                  continue;
               }

               if (this.method5586() < 400) {
                  int var9 = this.method5586();
                  var7 = (class288)this.method5594(var5, var6);
                  var7.field3705 = var9;
               }
               continue;
            }

            throw new IllegalStateException();
         }

         return;
      }
   }
}
