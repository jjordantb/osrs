public class class150 implements class149 {
   public static int method3372(class184 var0, String var1) {
      int var2 = var0.field2405;
      byte[] var3 = class126.method3055(var1);
      var0.method3759(var3.length);
      var0.field2405 += class302.field3784.method3693(var3, 0, var3.length, var0.field2404, var0.field2405);
      return var0.field2405 - var2;
   }

   public static boolean method3373(int var0) {
      return var0 == class235.field2840.field2839;
   }

   public static class174 method3375() {
      class174 var0 = class171.method3655();
      var0.field2331 = null;
      var0.field2330 = 0;
      var0.field2332 = new class191(5000);
      return var0;
   }

   static int method3374(int var0, class86 var1, boolean var2) {
      int var3;
      if (var0 == 3903) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].method41();
         return 1;
      } else if (var0 == 3904) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].field30;
         return 1;
      } else if (var0 == 3905) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].field31;
         return 1;
      } else if (var0 == 3906) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].field33;
         return 1;
      } else if (var0 == 3907) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].field38;
         return 1;
      } else if (var0 == 3908) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = client.field895[var3].field35;
         return 1;
      } else {
         int var12;
         if (var0 == 3910) {
            var3 = class70.field1070[--class60.field600];
            var12 = client.field895[var3].method40();
            class70.field1070[++class60.field600 - 1] = var12 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var3 = class70.field1070[--class60.field600];
            var12 = client.field895[var3].method40();
            class70.field1070[++class60.field600 - 1] = var12 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var3 = class70.field1070[--class60.field600];
            var12 = client.field895[var3].method40();
            class70.field1070[++class60.field600 - 1] = var12 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var3 = class70.field1070[--class60.field600];
            var12 = client.field895[var3].method40();
            class70.field1070[++class60.field600 - 1] = var12 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var13;
            if (var0 == 3914) {
               var13 = class70.field1070[--class60.field600] == 1;
               if (class59.field590 != null) {
                  class59.field590.method15(class1.field10, var13);
               }

               return 1;
            } else if (var0 == 3915) {
               var13 = class70.field1070[--class60.field600] == 1;
               if (class59.field590 != null) {
                  class59.field590.method15(class1.field3, var13);
               }

               return 1;
            } else if (var0 == 3916) {
               class60.field600 -= 2;
               var13 = class70.field1070[class60.field600] == 1;
               boolean var4 = class70.field1070[class60.field600 + 1] == 1;
               if (class59.field590 != null) {
                  client.field913.field636 = var4;
                  class59.field590.method15(client.field913, var13);
               }

               return 1;
            } else if (var0 == 3917) {
               var13 = class70.field1070[--class60.field600] == 1;
               if (class59.field590 != null) {
                  class59.field590.method15(class1.field4, var13);
               }

               return 1;
            } else if (var0 == 3918) {
               var13 = class70.field1070[--class60.field600] == 1;
               if (class59.field590 != null) {
                  class59.field590.method15(class1.field7, var13);
               }

               return 1;
            } else if (var0 == 3919) {
               class70.field1070[++class60.field600 - 1] = class59.field590 == null ? 0 : class59.field590.field14.size();
               return 1;
            } else {
               class2 var11;
               if (var0 == 3920) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1070[++class60.field600 - 1] = var11.field17;
                  return 1;
               } else if (var0 == 3921) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1065[++class70.field1072 - 1] = var11.method18();
                  return 1;
               } else if (var0 == 3922) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1065[++class70.field1072 - 1] = var11.method19();
                  return 1;
               } else if (var0 == 3923) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  long var5 = class120.method2866() - class113.field1511 - var11.field16;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  class70.field1065[++class70.field1072 - 1] = var10;
                  return 1;
               } else if (var0 == 3924) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1070[++class60.field600 - 1] = var11.field19.field33;
                  return 1;
               } else if (var0 == 3925) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1070[++class60.field600 - 1] = var11.field19.field31;
                  return 1;
               } else if (var0 == 3926) {
                  var3 = class70.field1070[--class60.field600];
                  var11 = (class2)class59.field590.field14.get(var3);
                  class70.field1070[++class60.field600 - 1] = var11.field19.field30;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
