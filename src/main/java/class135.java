public final class class135 {
   int field1891;
   int field1881;
   int field1886;
   int field1883;
   int field1884;
   int field1885;
   int field1890;
   public class129 field1887;
   public class129 field1888;
   public long field1880 = 0L;
   int field1889 = 0;

   public static void method3266(int var0) {
      if (class219.field2529 != 0) {
         class318.field3851 = var0;
      } else {
         class193.field2461.method4426(var0);
      }

   }

   static int method3265(class66 var0, class66 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field1020;
         int var5 = var1.field1020;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.field1021 - var1.field1021;
      } else if (var2 == 3) {
         if (var0.field1022.equals("-")) {
            if (var1.field1022.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field1022.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field1022.compareTo(var1.field1022);
         }
      } else if (var2 == 4) {
         return var0.method1731() ? (var1.method1731() ? 0 : 1) : (var1.method1731() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1734() ? (var1.method1734() ? 0 : 1) : (var1.method1734() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1687() ? (var1.method1687() ? 0 : 1) : (var1.method1687() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1684() ? (var1.method1684() ? 0 : 1) : (var1.method1684() ? -1 : 0);
      } else {
         return var0.field1015 - var1.field1015;
      }
   }
}
