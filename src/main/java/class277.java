import java.util.Date;
import netscape.javascript.JSObject;

public class class277 {
   static void method5493(String var0) {
      class6.field48 = var0;

      try {
         String var1 = class157.field2037.getParameter(class281.field3671.field3677);
         String var2 = class157.field2037.getParameter(class281.field3674.field3677);
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         String var5;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var4 = var3 + "; Expires=";
            long var6 = class120.method2866() + 94608000000L;
            class194.field2463.setTime(new Date(var6));
            int var8 = class194.field2463.get(7);
            int var9 = class194.field2463.get(5);
            int var10 = class194.field2463.get(2);
            int var11 = class194.field2463.get(1);
            int var12 = class194.field2463.get(11);
            int var13 = class194.field2463.get(12);
            int var14 = class194.field2463.get(13);
            var5 = class194.field2466[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class194.field2464[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
            var3 = var4 + var5 + "; Max-Age=" + 94608000L;
         }

         client var16 = class157.field2037;
         var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var16).eval(var5);
      } catch (Throwable var15) {
         ;
      }

   }
}
