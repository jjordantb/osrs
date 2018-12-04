import java.util.Comparator;

public class class313 implements Comparator {
   public static int field3831;
   final boolean field3832;

   public class313(boolean var1) {
      this.field3832 = var1;
   }

   int method5965(class284 var1, class284 var2) {
      return this.field3832 ? var1.vmethod5729(var2) : var2.vmethod5729(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method5965((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
