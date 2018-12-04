public class class4 {
   static class249 field32;
   public static class225 field39;
   byte field40;
   public int field30;
   public int field31;
   public int field33;
   public int field38;
   public int field35;

   public class4() {
   }

   public class4(class184 var1, boolean var2) {
      this.field40 = var1.method3931();
      this.field30 = var1.method3771();
      this.field31 = var1.method3892();
      this.field33 = var1.method3892();
      this.field38 = var1.method3892();
      this.field35 = var1.method3892();
   }

   public int method40() {
      return this.field40 & 7;
   }

   public int method41() {
      return (this.field40 & 8) == 8 ? 1 : 0;
   }

   void method56(int var1) {
      this.field40 &= -8;
      this.field40 = (byte)(this.field40 | var1 & 7);
   }

   void method38(int var1) {
      this.field40 &= -9;
      if (var1 == 1) {
         this.field40 = (byte)(this.field40 | 8);
      }

   }

   static int method55(int var0, int var1) {
      class54 var2 = (class54)class54.field534.method4224((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.field533.length ? var2.field533[var1] : -1;
      }
   }

   static final void method43(String var0) {
      if (class3.field26 != null) {
         class174 var1 = class131.method3243(class171.field2220, client.field690.field1282);
         var1.field2332.method3805(class97.method2404(var0));
         var1.field2332.method3889(var0);
         client.field690.method2193(var1);
      }
   }
}
