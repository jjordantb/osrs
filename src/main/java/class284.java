public class class284 implements Comparable {
   class293 field3692;
   class293 field3693;

   public class293 method5542() {
      return this.field3692;
   }

   public String method5548() {
      return this.field3692 == null ? "" : this.field3692.method5706();
   }

   public String method5544() {
      return this.field3693 == null ? "" : this.field3693.method5706();
   }

   void method5545(class293 var1, class293 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field3692 = var1;
         this.field3693 = var2;
      }
   }

   public int vmethod5729(class284 var1) {
      return this.field3692.method5710(var1.field3692);
   }

   public int compareTo(Object var1) {
      return this.vmethod5729((class284)var1);
   }

   public static String method5558(CharSequence var0) {
      String var1 = class256.method5038(class228.method4645(var0));
      if (var1 == null) {
         var1 = "";
      }

      return var1;
   }
}
