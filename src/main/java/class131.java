public class class131 {
   public static char field1856;
   int field1852;
   int field1853;
   int field1854;

   public static byte method3242(char var0) {
      byte var1;
      if (var0 > 0 && var0 < '\u0080' || var0 >= ' ' && var0 <= 'ÿ') {
         var1 = (byte)var0;
      } else if (var0 == '€') {
         var1 = -128;
      } else if (var0 == '‚') {
         var1 = -126;
      } else if (var0 == 'ƒ') {
         var1 = -125;
      } else if (var0 == '„') {
         var1 = -124;
      } else if (var0 == '…') {
         var1 = -123;
      } else if (var0 == '†') {
         var1 = -122;
      } else if (var0 == '‡') {
         var1 = -121;
      } else if (var0 == 'ˆ') {
         var1 = -120;
      } else if (var0 == '‰') {
         var1 = -119;
      } else if (var0 == 'Š') {
         var1 = -118;
      } else if (var0 == '‹') {
         var1 = -117;
      } else if (var0 == 'Œ') {
         var1 = -116;
      } else if (var0 == 'Ž') {
         var1 = -114;
      } else if (var0 == '‘') {
         var1 = -111;
      } else if (var0 == '’') {
         var1 = -110;
      } else if (var0 == '“') {
         var1 = -109;
      } else if (var0 == '”') {
         var1 = -108;
      } else if (var0 == '•') {
         var1 = -107;
      } else if (var0 == '–') {
         var1 = -106;
      } else if (var0 == '—') {
         var1 = -105;
      } else if (var0 == '˜') {
         var1 = -104;
      } else if (var0 == '™') {
         var1 = -103;
      } else if (var0 == 'š') {
         var1 = -102;
      } else if (var0 == '›') {
         var1 = -101;
      } else if (var0 == 'œ') {
         var1 = -100;
      } else if (var0 == 'ž') {
         var1 = -98;
      } else if (var0 == 'Ÿ') {
         var1 = -97;
      } else {
         var1 = 63;
      }

      return var1;
   }

   public static class174 method3243(class171 var0, class192 var1) {
      class174 var2 = class171.method3655();
      var2.field2331 = var0;
      var2.field2330 = var0.field2280;
      if (var2.field2330 == -1) {
         var2.field2332 = new class191(260);
      } else if (var2.field2330 == -2) {
         var2.field2332 = new class191(10000);
      } else if (var2.field2330 <= 18) {
         var2.field2332 = new class191(20);
      } else if (var2.field2330 <= 98) {
         var2.field2332 = new class191(100);
      } else {
         var2.field2332 = new class191(260);
      }

      var2.field2332.method4046(var1);
      var2.field2332.method4047(var2.field2331.field2307);
      var2.field2333 = 0;
      return var2;
   }
}
