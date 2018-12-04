import java.util.Comparator;

public class class62 implements Comparator {
   static int[] field640;
   boolean field636;

   int method1223(class2 var1, class2 var2) {
      if (var2.field17 == var1.field17) {
         return 0;
      } else {
         if (this.field636) {
            if (client.field691 == var1.field17) {
               return -1;
            }

            if (var2.field17 == client.field691) {
               return 1;
            }
         }

         return var1.field17 < var2.field17 ? -1 : 1;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1223((class2)var1, (class2)var2);
   }

   static void method1233() {
      class83.field1226 = 0;

      for(int var0 = 0; var0 < 2048; ++var0) {
         class83.field1233[var0] = null;
         class83.field1224[var0] = 1;
      }

   }

   static void method1232(int var0, int var1, int var2, int var3) {
      class232 var4 = class9.method102(var0, var1);
      if (var4 != null && var4.field2764 != null) {
         class57 var5 = new class57();
         var5.field570 = var4;
         var5.field575 = var4.field2764;
         class53.method1076(var5);
      }

      client.field734 = var3;
      client.field798 = true;
      class306.field3796 = var0;
      client.field799 = var1;
      class297.field3740 = var2;
      class37.method721(var4);
   }
}
