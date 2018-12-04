public class class328 {
   String field3939;
   class249 field3936;
   int field3937 = 0;
   boolean field3938 = false;

   class328(class249 var1) {
      this.field3936 = var1;
   }

   void method6304(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1 != this.field3939) {
            this.field3939 = var1;
            this.field3937 = 0;
            this.field3938 = false;
            this.method6305();
         }
      }
   }

   int method6305() {
      if (this.field3937 < 25) {
         if (!this.field3936.method4853(class29.field288.field298, this.field3939)) {
            return this.field3937;
         }

         this.field3937 = 25;
      }

      if (this.field3937 == 25) {
         if (!this.field3936.method4853(this.field3939, class29.field290.field298)) {
            return 25 + this.field3936.method4845(this.field3939) * 25 / 100;
         }

         this.field3937 = 50;
      }

      if (this.field3937 == 50) {
         if (this.field3936.method4848(class29.field289.field298, this.field3939) && !this.field3936.method4853(class29.field289.field298, this.field3939)) {
            return 50;
         }

         this.field3937 = 75;
      }

      if (this.field3937 == 75) {
         if (!this.field3936.method4853(this.field3939, class29.field292.field298)) {
            return 75;
         }

         this.field3937 = 100;
         this.field3938 = true;
      }

      return this.field3937;
   }

   boolean method6306() {
      return this.field3938;
   }

   int method6315() {
      return this.field3937;
   }

   static int method6311(int var0, class86 var1, boolean var2) {
      int var3;
      int var4;
      int var6;
      if (var0 == 3400) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class268 var5 = class86.method2166(var3);
         if (var5.field3417 != 's') {
            ;
         }

         for(var6 = 0; var6 < var5.field3420; ++var6) {
            if (var4 == var5.field3416[var6]) {
               class70.field1065[++class70.field1072 - 1] = var5.field3423[var6];
               var5 = null;
               break;
            }
         }

         if (var5 != null) {
            class70.field1065[++class70.field1072 - 1] = var5.field3421;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var3 = class70.field1070[--class60.field600];
            class268 var10 = class86.method2166(var3);
            class70.field1070[++class60.field600 - 1] = var10.method5225();
            return 1;
         } else {
            return 2;
         }
      } else {
         class60.field600 -= 4;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         int var9 = class70.field1070[class60.field600 + 2];
         var6 = class70.field1070[class60.field600 + 3];
         class268 var7 = class86.method2166(var9);
         if (var3 == var7.field3425 && var4 == var7.field3417) {
            for(int var8 = 0; var8 < var7.field3420; ++var8) {
               if (var6 == var7.field3416[var8]) {
                  if (var4 == 115) {
                     class70.field1065[++class70.field1072 - 1] = var7.field3423[var8];
                  } else {
                     class70.field1070[++class60.field600 - 1] = var7.field3422[var8];
                  }

                  var7 = null;
                  break;
               }
            }

            if (var7 != null) {
               if (var4 == 115) {
                  class70.field1065[++class70.field1072 - 1] = var7.field3421;
               } else {
                  class70.field1070[++class60.field600 - 1] = var7.field3415;
               }
            }

            return 1;
         } else {
            if (var4 == 115) {
               class70.field1065[++class70.field1072 - 1] = "null";
            } else {
               class70.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
         }
      }
   }
}
