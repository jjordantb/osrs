import java.util.Comparator;

final class class5 implements Comparator {
   int method58(class2 var1, class2 var2) {
      return var1.field19.field31 < var2.field19.field31 ? -1 : (var2.field19.field31 == var1.field19.field31 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method58((class2)var1, (class2)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final boolean method66(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = class122.field1715 + var6;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = class122.field1715 - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = class122.field1712 + var6;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = class122.field1712 - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }
}
