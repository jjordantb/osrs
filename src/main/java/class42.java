import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class class42 extends Canvas {
   static int field405;
   static class251 field401;
   Component field404;

   class42(Component var1) {
      this.field404 = var1;
   }

   public final void update(Graphics var1) {
      this.field404.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field404.paint(var1);
   }

   static final int method785(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static int method786(int var0, class86 var1, boolean var2) {
      class232 var3 = class18.method213(class70.field1070[--class60.field600]);
      if (var0 == 2800) {
         class70.field1070[++class60.field600 - 1] = class9.method98(class254.method5000(var3));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
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

   static final void method783() {
      class174 var0 = class131.method3243(class171.field2227, client.field690.field1282);
      client.field690.method2193(var0);

      for(class56 var1 = (class56)client.field804.method4235(); var1 != null; var1 = (class56)client.field804.method4229()) {
         if (var1.field560 == 0 || var1.field560 == 3) {
            class6.method67(var1, true);
         }
      }

      if (client.field880 != null) {
         class37.method721(client.field880);
         client.field880 = null;
      }

   }

   static boolean method784(class232 var0) {
      return var0.field2704;
   }
}
