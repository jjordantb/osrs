import java.io.IOException;
import java.net.Socket;

public final class class63 extends class206 {
   int field934;
   int field926;
   int field922;
   int field925;
   int field923;
   int field935;
   int field924;
   int field929;
   int field930;
   int field931;
   int field932 = 0;
   int field933 = -1;

   public static class170[] method1656() {
      return new class170[]{class170.field2178, class170.field2159, class170.field2119, class170.field2187, class170.field2121, class170.field2122, class170.field2123, class170.field2199, class170.field2125, class170.field2126, class170.field2127, class170.field2128, class170.field2129, class170.field2130, class170.field2118, class170.field2132, class170.field2133, class170.field2134, class170.field2169, class170.field2136, class170.field2124, class170.field2165, class170.field2139, class170.field2140, class170.field2141, class170.field2198, class170.field2143, class170.field2181, class170.field2145, class170.field2146, class170.field2147, class170.field2148, class170.field2149, class170.field2175, class170.field2144, class170.field2152, class170.field2153, class170.field2200, class170.field2155, class170.field2205, class170.field2157, class170.field2158, class170.field2203, class170.field2156, class170.field2161, class170.field2162, class170.field2163, class170.field2164, class170.field2195, class170.field2194, class170.field2167, class170.field2168, class170.field2190, class170.field2170, class170.field2171, class170.field2160, class170.field2173, class170.field2174, class170.field2193, class170.field2176, class170.field2177, class170.field2138, class170.field2179, class170.field2180, class170.field2172, class170.field2182, class170.field2183, class170.field2184, class170.field2185, class170.field2186, class170.field2196, class170.field2188, class170.field2189, class170.field2154, class170.field2191, class170.field2192, class170.field2120, class170.field2137, class170.field2131, class170.field2201, class170.field2197, class170.field2135, class170.field2142, class170.field2166, class170.field2204};
   }

   public static class159 method1657(Socket var0, int var1, int var2) throws IOException {
      return new class161(var0, var1, var2);
   }

   static int method1658(int var0, class86 var1, boolean var2) {
      class232 var3 = var2 ? class10.field75 : class70.field1080;
      if (var0 == 1800) {
         class70.field1070[++class60.field600 - 1] = class9.method98(class254.method5000(var3));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var3.field2697 == null) {
               class70.field1065[++class70.field1072 - 1] = "";
            } else {
               class70.field1065[++class70.field1072 - 1] = var3.field2697;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class70.field1070[--class60.field600];
         --var4;
         if (var3.field2731 != null && var4 < var3.field2731.length && var3.field2731[var4] != null) {
            class70.field1065[++class70.field1072 - 1] = var3.field2731[var4];
         } else {
            class70.field1065[++class70.field1072 - 1] = "";
         }

         return 1;
      }
   }
}
