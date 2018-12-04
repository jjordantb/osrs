import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class class138 {
   static int field1926;
   static class322 field1925;
   static class155 field1924;
   final URL field1920;
   volatile boolean field1922;
   volatile byte[] field1921;

   class138(URL var1) {
      this.field1920 = var1;
   }

   public boolean method3286() {
      return this.field1922;
   }

   public byte[] method3281() {
      return this.field1921;
   }

   public static void method3291(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var4) {
               ;
            }
         }

         if (class45.field420.startsWith("win")) {
            class242.method4796(var0, 0, "openjs");
         } else if (class45.field420.startsWith("mac")) {
            class242.method4796(var0, 1, "openjs");
         } else {
            class242.method4796(var0, 2, "openjs");
         }
      } else {
         class242.method4796(var0, 3, "openjs");
      }

   }

   static int method3282(int var0, int var1) {
      class54 var2 = (class54)class54.field534.method4224((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.field532.length ? var2.field532[var1] : 0;
      }
   }

   static void method3292(class66 var0) {
      if (var0.method1684() != client.field647) {
         client.field647 = var0.method1684();
         boolean var1 = var0.method1684();
         if (var1 != class229.field2648) {
            class89.method2200();
            class229.field2648 = var1;
         }
      }

      class10.field79 = var0.field1019;
      client.field691 = var0.field1015;
      client.field660 = var0.field1008;
      class139.field1928 = client.field645 == 0 ? 'ꩊ' : var0.field1015 + '鱀';
      class2.field23 = client.field645 == 0 ? 443 : var0.field1015 + '썐';
      class144.field1947 = class139.field1928;
   }
}
