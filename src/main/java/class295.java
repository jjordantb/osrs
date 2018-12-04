public class class295 extends class287 {
   final class330 field3727;
   final class290 field3728;
   public String field3726 = null;
   public String field3730 = null;
   public byte field3731;
   public int field3732;
   int field3729 = 1;

   public class295(class330 var1, class290 var2) {
      super(100);
      this.field3727 = var1;
      this.field3728 = var2;
   }

   class284 vmethod5744() {
      return new class283();
   }

   class284[] vmethod5760(int var1) {
      return new class283[var1];
   }

   final void method5740(String var1) {
      this.field3726 = class284.method5558(var1);
   }

   final void method5764(String var1) {
      this.field3730 = class284.method5558(var1);
   }

   public final void method5742(class184 var1) {
      this.method5764(var1.method3778());
      long var2 = var1.method3775();
      this.method5740(class165.method3610(var2));
      this.field3731 = var1.method3931();
      int var4 = var1.method3983();
      if (var4 != 255) {
         this.method5585();

         for(int var5 = 0; var5 < var4; ++var5) {
            class283 var6 = (class283)this.method5663(new class293(var1.method3778(), this.field3727));
            int var7 = var1.method3771();
            var6.method5678(var7, ++this.field3729 - 1);
            var6.field3710 = var1.method3931();
            var1.method3778();
            this.method5746(var6);
         }

      }
   }

   public final void method5743(class184 var1) {
      class293 var2 = new class293(var1.method3778(), this.field3727);
      int var3 = var1.method3771();
      byte var4 = var1.method3931();
      boolean var5 = false;
      if (var4 == -128) {
         var5 = true;
      }

      class283 var6;
      if (var5) {
         if (this.method5586() == 0) {
            return;
         }

         var6 = (class283)this.method5590(var2);
         if (var6 != null && var6.method5677() == var3) {
            this.method5641(var6);
         }
      } else {
         var1.method3778();
         var6 = (class283)this.method5590(var2);
         if (var6 == null) {
            if (this.method5586() > super.field3704) {
               return;
            }

            var6 = (class283)this.method5663(var2);
         }

         var6.method5678(var3, ++this.field3729 - 1);
         var6.field3710 = var4;
         this.method5746(var6);
      }

   }

   public final void method5737() {
      for(int var1 = 0; var1 < this.method5586(); ++var1) {
         ((class283)this.method5595(var1)).method5521();
      }

   }

   public final void method5745() {
      for(int var1 = 0; var1 < this.method5586(); ++var1) {
         ((class283)this.method5595(var1)).method5524();
      }

   }

   final void method5746(class283 var1) {
      if (var1.method5542().equals(this.field3728.vmethod5687())) {
         this.field3732 = var1.field3710;
      }

   }

   static boolean method5758(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+') {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  return false;
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               return false;
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("");
      }
   }
}
