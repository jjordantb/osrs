public class class293 implements Comparable {
   String field3721;
   String field3720;

   public class293(String var1, class330 var2) {
      this.field3721 = var1;
      this.field3720 = class232.method4743(var1, var2);
   }

   public String method5706() {
      return this.field3721;
   }

   public boolean method5707() {
      return this.field3720 != null;
   }

   public int method5710(class293 var1) {
      if (this.field3720 == null) {
         return var1.field3720 == null ? 0 : 1;
      } else {
         return var1.field3720 == null ? -1 : this.field3720.compareTo(var1.field3720);
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class293) {
         class293 var2 = (class293)var1;
         if (this.field3720 == null) {
            return var2.field3720 == null;
         } else if (var2.field3720 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field3720.equals(var2.field3720);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field3720 == null ? 0 : this.field3720.hashCode();
   }

   public String toString() {
      return this.method5706();
   }

   public int compareTo(Object var1) {
      return this.method5710((class293)var1);
   }
}
