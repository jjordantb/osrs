import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

public class class85 {
   static final Map field1248 = new HashMap();
   static final class199 field1249 = new class199(1024);
   static final class217 field1247 = new class217();
   static int field1246 = 0;
   static int[] field1251;

   public static void method2146(class249 var0, class249 var1) {
      class260.field3347 = var0;
      class260.field3343 = var1;
   }

   static void method2144(Component var0) {
      var0.removeKeyListener(class39.field386);
      var0.removeFocusListener(class39.field386);
      class39.field383 = -1;
   }

   public static int method2126(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   static int method2148(int var0) {
      class88 var1 = (class88)field1248.get(var0);
      return var1 == null ? 0 : var1.method2180();
   }

   static String method2145(String var0) {
      class244[] var1 = class6.method80();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class244 var3 = var1[var2];
         if (var3.field3185 != -1 && var0.startsWith(class19.method243(var3.field3185))) {
            var0 = var0.substring(6 + Integer.toString(var3.field3185).length());
            break;
         }
      }

      return var0;
   }
}
