public class class228 {
   public int field2634;
   public int field2632;
   public int field2633;

   public class228(class228 var1) {
      this.field2634 = var1.field2634;
      this.field2632 = var1.field2632;
      this.field2633 = var1.field2633;
   }

   public class228(int var1, int var2, int var3) {
      this.field2634 = var1;
      this.field2632 = var2;
      this.field2633 = var3;
   }

   public class228() {
      this.field2634 = -1;
   }

   public class228(int var1) {
      if (var1 == -1) {
         this.field2634 = -1;
      } else {
         this.field2634 = var1 >> 28 & 3;
         this.field2632 = var1 >> 14 & 16383;
         this.field2633 = var1 & 16383;
      }

   }

   public void method4644(int var1, int var2, int var3) {
      this.field2634 = var1;
      this.field2632 = var2;
      this.field2633 = var3;
   }

   public int method4646() {
      return this.field2634 << 28 | this.field2632 << 14 | this.field2633;
   }

   boolean method4659(class228 var1) {
      if (this.field2634 != var1.field2634) {
         return false;
      } else if (this.field2632 != var1.field2632) {
         return false;
      } else {
         return this.field2633 == var1.field2633;
      }
   }

   String method4656(String var1) {
      return this.field2634 + var1 + (this.field2632 >> 6) + var1 + (this.field2633 >> 6) + var1 + (this.field2632 & 63) + var1 + (this.field2633 & 63);
   }

   public int hashCode() {
      return this.method4646();
   }

   public String toString() {
      return this.method4656(",");
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class228) ? false : this.method4659((class228)var1);
      }
   }

   static long method4645(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(0L == var1 % 37L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }
}
