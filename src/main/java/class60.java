public class class60 extends class168 {
   static int field605;
   static int field600;
   static int field604;
   static int field599;

   public boolean vmethod3646(int var1, int var2, int var3, class166 var4) {
      return var2 == super.field2116 && var3 == super.field2112;
   }

   public static void method1169() {
      class256.field3304.method4199();
   }

   static int method1170(int var0, class86 var1, boolean var2) {
      int var3;
      if (var0 == 4200) {
         var3 = class70.field1070[--field600];
         class70.field1065[++class70.field1072 - 1] = class84.method2125(var3).field3515;
         return 1;
      } else {
         int var4;
         class271 var5;
         if (var0 == 4201) {
            field600 -= 2;
            var3 = class70.field1070[field600];
            var4 = class70.field1070[field600 + 1];
            var5 = class84.method2125(var3);
            if (var4 >= 1 && var4 <= 5 && var5.field3526[var4 - 1] != null) {
               class70.field1065[++class70.field1072 - 1] = var5.field3526[var4 - 1];
            } else {
               class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            field600 -= 2;
            var3 = class70.field1070[field600];
            var4 = class70.field1070[field600 + 1];
            var5 = class84.method2125(var3);
            if (var4 >= 1 && var4 <= 5 && var5.field3541[var4 - 1] != null) {
               class70.field1065[++class70.field1072 - 1] = var5.field3541[var4 - 1];
            } else {
               class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var3 = class70.field1070[--field600];
            class70.field1070[++field600 - 1] = class84.method2125(var3).field3544;
            return 1;
         } else if (var0 == 4204) {
            var3 = class70.field1070[--field600];
            class70.field1070[++field600 - 1] = class84.method2125(var3).field3523 == 1 ? 1 : 0;
            return 1;
         } else {
            class271 var6;
            if (var0 == 4205) {
               var3 = class70.field1070[--field600];
               var6 = class84.method2125(var3);
               if (var6.field3552 == -1 && var6.field3549 >= 0) {
                  class70.field1070[++field600 - 1] = var6.field3549;
               } else {
                  class70.field1070[++field600 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4206) {
               var3 = class70.field1070[--field600];
               var6 = class84.method2125(var3);
               if (var6.field3552 >= 0 && var6.field3549 >= 0) {
                  class70.field1070[++field600 - 1] = var6.field3549;
               } else {
                  class70.field1070[++field600 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4207) {
               var3 = class70.field1070[--field600];
               class70.field1070[++field600 - 1] = class84.method2125(var3).field3512 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var3 = class70.field1070[--field600];
               var6 = class84.method2125(var3);
               if (var6.field3510 == -1 && var6.field3555 >= 0) {
                  class70.field1070[++field600 - 1] = var6.field3555;
               } else {
                  class70.field1070[++field600 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4209) {
               var3 = class70.field1070[--field600];
               var6 = class84.method2125(var3);
               if (var6.field3510 >= 0 && var6.field3555 >= 0) {
                  class70.field1070[++field600 - 1] = var6.field3555;
               } else {
                  class70.field1070[++field600 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4210) {
               String var7 = class70.field1065[--class70.field1072];
               var4 = class70.field1070[--field600];
               class48.method1017(var7, var4 == 1);
               class70.field1070[++field600 - 1] = class152.field1983;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class9.field69 = 0;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class33.field325 != null && class9.field69 < class152.field1983) {
                  class70.field1070[++field600 - 1] = class33.field325[++class9.field69 - 1] & '\uffff';
               } else {
                  class70.field1070[++field600 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }
}
