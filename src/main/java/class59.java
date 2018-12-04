public class class59 extends class208 {
   static class1 field590;
   public static int field598;
   int field595;
   int field589;
   int field597;
   String field591;
   class293 field592;
   class291 field593;
   class291 field594;
   String field596;
   String field588;

   class59(int var1, String var2, String var3, String var4) {
      this.field593 = class291.field3713;
      this.field594 = class291.field3713;
      int var5 = ++class85.field1246 - 1;
      this.field595 = var5;
      this.field589 = client.field655;
      this.field597 = var1;
      this.field591 = var2;
      this.method1141();
      this.field596 = var3;
      this.field588 = var4;
   }

   void method1134(int var1, String var2, String var3, String var4) {
      int var5 = ++class85.field1246 - 1;
      this.field595 = var5;
      this.field589 = client.field655;
      this.field597 = var1;
      this.field591 = var2;
      this.method1141();
      this.field596 = var3;
      this.field588 = var4;
   }

   void method1143() {
      this.field593 = class291.field3713;
   }

   final boolean method1136() {
      if (this.field593 == class291.field3713) {
         this.method1137();
      }

      return this.field593 == class291.field3712;
   }

   void method1137() {
      this.field593 = class170.field2150.field1040.method5608(this.field592) ? class291.field3712 : class291.field3711;
   }

   void method1138() {
      this.field594 = class291.field3713;
   }

   final boolean method1133() {
      if (this.field594 == class291.field3713) {
         this.method1140();
      }

      return this.field594 == class291.field3712;
   }

   void method1140() {
      this.field594 = class170.field2150.field1041.method5608(this.field592) ? class291.field3712 : class291.field3711;
   }

   final void method1141() {
      if (this.field591 != null) {
         this.field592 = new class293(class85.method2145(this.field591), client.field920);
      } else {
         this.field592 = null;
      }

   }

   static void method1163(int var0, String var1, String var2) {
      class9.method104(var0, var1, var2, (String)null);
   }

   static int method1144(int var0, class86 var1, boolean var2) {
      class232 var3 = var2 ? class10.field75 : class70.field1080;
      if (var0 == 1700) {
         class70.field1070[++class60.field600 - 1] = var3.field2793;
         return 1;
      } else if (var0 == 1701) {
         if (var3.field2793 != -1) {
            class70.field1070[++class60.field600 - 1] = var3.field2794;
         } else {
            class70.field1070[++class60.field600 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class70.field1070[++class60.field600 - 1] = var3.field2787;
         return 1;
      } else {
         return 2;
      }
   }

   static boolean method1164() {
      return client.field790;
   }
}
