import java.util.Comparator;

public class class314 implements Comparator {
   final boolean field3834;

   public class314(boolean var1) {
      this.field3834 = var1;
   }

   int method5988(class284 var1, class284 var2) {
      return this.field3834 ? var1.method5542().method5710(var2.method5542()) : var2.method5542().method5710(var1.method5542());
   }

   public int compare(Object var1, Object var2) {
      return this.method5988((class284)var1, (class284)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public static double[] method5987(double var0, double var2, int var4) {
      int var5 = var4 * 2 + 1;
      double[] var6 = new double[var5];
      int var7 = -var4;

      for(int var8 = 0; var7 <= var4; ++var8) {
         double var11 = class269.method5267(((double)var7 - var0) / var2) / var2;
         var6[var8] = var11;
         ++var7;
      }

      return var6;
   }
}
