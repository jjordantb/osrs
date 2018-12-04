import java.io.IOException;

public abstract class class159 {
   static class251 field2039;

   public abstract boolean vmethod3554(int var1) throws IOException;

   public abstract int vmethod3553() throws IOException;

   public abstract int vmethod3562() throws IOException;

   public abstract int vmethod3555(byte[] var1, int var2, int var3) throws IOException;

   public abstract void vmethod3578(byte[] var1, int var2, int var3) throws IOException;

   public abstract void vmethod3558();

   static int method3496(int var0, class86 var1, boolean var2) {
      if (var0 == 6500) {
         class70.field1070[++class60.field600 - 1] = class11.method121() ? 1 : 0;
         return 1;
      } else {
         class66 var3;
         if (var0 == 6501) {
            var3 = class0.method2();
            if (var3 != null) {
               class70.field1070[++class60.field600 - 1] = var3.field1015;
               class70.field1070[++class60.field600 - 1] = var3.field1008;
               class70.field1065[++class70.field1072 - 1] = var3.field1022;
               class70.field1070[++class60.field600 - 1] = var3.field1021;
               class70.field1070[++class60.field600 - 1] = var3.field1020;
               class70.field1065[++class70.field1072 - 1] = var3.field1019;
            } else {
               class70.field1070[++class60.field600 - 1] = -1;
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1065[++class70.field1072 - 1] = "";
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var3 = class17.method208();
            if (var3 != null) {
               class70.field1070[++class60.field600 - 1] = var3.field1015;
               class70.field1070[++class60.field600 - 1] = var3.field1008;
               class70.field1065[++class70.field1072 - 1] = var3.field1022;
               class70.field1070[++class60.field600 - 1] = var3.field1021;
               class70.field1070[++class60.field600 - 1] = var3.field1020;
               class70.field1065[++class70.field1072 - 1] = var3.field1019;
            } else {
               class70.field1070[++class60.field600 - 1] = -1;
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1065[++class70.field1072 - 1] = "";
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1070[++class60.field600 - 1] = 0;
               class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
         } else {
            class66 var4;
            int var5;
            int var7;
            if (var0 == 6506) {
               var7 = class70.field1070[--class60.field600];
               var4 = null;

               for(var5 = 0; var5 < class66.field1013; ++var5) {
                  if (var7 == class66.field1017[var5].field1015) {
                     var4 = class66.field1017[var5];
                     break;
                  }
               }

               if (var4 != null) {
                  class70.field1070[++class60.field600 - 1] = var4.field1015;
                  class70.field1070[++class60.field600 - 1] = var4.field1008;
                  class70.field1065[++class70.field1072 - 1] = var4.field1022;
                  class70.field1070[++class60.field600 - 1] = var4.field1021;
                  class70.field1070[++class60.field600 - 1] = var4.field1020;
                  class70.field1065[++class70.field1072 - 1] = var4.field1019;
               } else {
                  class70.field1070[++class60.field600 - 1] = -1;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               class60.field600 -= 4;
               var7 = class70.field1070[class60.field600];
               boolean var10 = class70.field1070[class60.field600 + 1] == 1;
               var5 = class70.field1070[class60.field600 + 2];
               boolean var6 = class70.field1070[class60.field600 + 3] == 1;
               class57.method1117(var7, var10, var5, var6);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  client.field788 = class70.field1070[--class60.field600] == 1;
                  return 1;
               } else {
                  int var8;
                  class266 var9;
                  if (var0 == 6513) {
                     class60.field600 -= 2;
                     var7 = class70.field1070[class60.field600];
                     var8 = class70.field1070[class60.field600 + 1];
                     var9 = class25.method479(var8);
                     if (var9.method5180()) {
                        class70.field1065[++class70.field1072 - 1] = class248.method4823(var7).method5400(var8, var9.field3405);
                     } else {
                        class70.field1070[++class60.field600 - 1] = class248.method4823(var7).method5399(var8, var9.field3402);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     class60.field600 -= 2;
                     var7 = class70.field1070[class60.field600];
                     var8 = class70.field1070[class60.field600 + 1];
                     var9 = class25.method479(var8);
                     if (var9.method5180()) {
                        class70.field1065[++class70.field1072 - 1] = class253.method4993(var7).method5281(var8, var9.field3405);
                     } else {
                        class70.field1070[++class60.field600 - 1] = class253.method4993(var7).method5280(var8, var9.field3402);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     class60.field600 -= 2;
                     var7 = class70.field1070[class60.field600];
                     var8 = class70.field1070[class60.field600 + 1];
                     var9 = class25.method479(var8);
                     if (var9.method5180()) {
                        class70.field1065[++class70.field1072 - 1] = class84.method2125(var7).method5335(var8, var9.field3405);
                     } else {
                        class70.field1070[++class60.field600 - 1] = class84.method2125(var7).method5360(var8, var9.field3402);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     class60.field600 -= 2;
                     var7 = class70.field1070[class60.field600];
                     var8 = class70.field1070[class60.field600 + 1];
                     var9 = class25.method479(var8);
                     if (var9.method5180()) {
                        class70.field1065[++class70.field1072 - 1] = class139.method3299(var7).method5200(var8, var9.field3405);
                     } else {
                        class70.field1070[++class60.field600 - 1] = class139.method3299(var7).method5195(var8, var9.field3402);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     class70.field1070[++class60.field600 - 1] = client.field770 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     class70.field1070[++class60.field600 - 1] = client.field651 & 3;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --class70.field1072;
                     --class60.field600;
                     return 1;
                  } else if (var0 == 6523) {
                     --class70.field1072;
                     --class60.field600;
                     return 1;
                  } else if (var0 == 6524) {
                     class70.field1070[++class60.field600 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     class70.field1070[++class60.field600 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     class70.field1070[++class60.field600 - 1] = 1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = class70.field1070[--class60.field600];
               if (var7 >= 0 && var7 < class66.field1013) {
                  var4 = class66.field1017[var7];
                  class70.field1070[++class60.field600 - 1] = var4.field1015;
                  class70.field1070[++class60.field600 - 1] = var4.field1008;
                  class70.field1065[++class70.field1072 - 1] = var4.field1022;
                  class70.field1070[++class60.field600 - 1] = var4.field1021;
                  class70.field1070[++class60.field600 - 1] = var4.field1020;
                  class70.field1065[++class70.field1072 - 1] = var4.field1019;
               } else {
                  class70.field1070[++class60.field600 - 1] = -1;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1070[++class60.field600 - 1] = 0;
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            }
         }
      }
   }
}
