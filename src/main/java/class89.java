import java.io.IOException;

public class class89 {
   class159 field1291;
   class205 field1279 = new class205();
   int field1290 = 0;
   class184 field1281 = new class184(5000);
   public class192 field1282;
   class191 field1283 = new class191(40000);
   class170 field1280 = null;
   int field1285 = 0;
   boolean field1286 = true;
   int field1287 = 0;
   int field1288 = 0;
   class170 field1295;
   class170 field1284;
   class170 field1278;

   final void method2194() {
      this.field1279.method4267();
      this.field1290 = 0;
   }

   final void method2187() throws IOException {
      if (this.field1291 != null && this.field1290 > 0) {
         this.field1281.field2405 = 0;

         while(true) {
            class174 var1 = (class174)this.field1279.method4250();
            if (var1 == null || var1.field2333 > this.field1281.field2404.length - this.field1281.field2405) {
               this.field1291.vmethod3578(this.field1281.field2404, 0, this.field1281.field2405);
               this.field1288 = 0;
               break;
            }

            this.field1281.method3763(var1.field2332.field2404, 0, var1.field2333);
            this.field1290 -= var1.field2333;
            var1.method4271();
            var1.field2332.method3752();
            var1.method3668();
         }
      }

   }

   public final void method2193(class174 var1) {
      this.field1279.method4269(var1);
      var1.field2333 = var1.field2332.field2405;
      var1.field2332.field2405 = 0;
      this.field1290 += var1.field2333;
   }

   void method2189(class159 var1) {
      this.field1291 = var1;
   }

   void method2190() {
      if (this.field1291 != null) {
         this.field1291.vmethod3558();
         this.field1291 = null;
      }

   }

   void method2191() {
      this.field1291 = null;
   }

   class159 method2192() {
      return this.field1291;
   }

   public static void method2200() {
      class271.field3507.method4199();
      class271.field3508.method4199();
      class271.field3546.method4199();
   }

   static int method2210(int var0, class86 var1, boolean var2) {
      class232 var3;
      if (var0 == 2700) {
         var3 = class18.method213(class70.field1070[--class60.field600]);
         class70.field1070[++class60.field600 - 1] = var3.field2793;
         return 1;
      } else if (var0 == 2701) {
         var3 = class18.method213(class70.field1070[--class60.field600]);
         if (var3.field2793 != -1) {
            class70.field1070[++class60.field600 - 1] = var3.field2794;
         } else {
            class70.field1070[++class60.field600 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var5 = class70.field1070[--class60.field600];
         class56 var4 = (class56)client.field804.method4224((long)var5);
         if (var4 != null) {
            class70.field1070[++class60.field600 - 1] = 1;
         } else {
            class70.field1070[++class60.field600 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         class70.field1070[++class60.field600 - 1] = client.field803;
         return 1;
      } else {
         return 2;
      }
   }
}
