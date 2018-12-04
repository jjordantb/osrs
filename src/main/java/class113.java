import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class class113 implements class133 {
   static long field1511;
   class118[] field1508;
   class207 field1502 = new class207();
   int field1510;
   int field1503 = 0;
   double field1505 = 1.0D;
   int field1506 = 128;
   class249 field1507;

   public class113(class249 var1, class249 var2, int var3, double var4, int var6) {
      this.field1507 = var2;
      this.field1510 = var3;
      this.field1503 = this.field1510;
      this.field1505 = var4;
      this.field1506 = var6;
      int[] var7 = var1.method4839(0);
      int var8 = var7.length;
      this.field1508 = new class118[var1.method4889(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class184 var10 = new class184(var1.method4831(0, var7[var9]));
         this.field1508[var7[var9]] = new class118(var10);
      }

   }

   public int method2742() {
      int var1 = 0;
      int var2 = 0;
      class118[] var3 = this.field1508;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class118 var5 = var3[var4];
         if (var5 != null && var5.field1595 != null) {
            var1 += var5.field1595.length;
            int[] var6 = var5.field1595;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if (this.field1507.method4829(var8)) {
                  ++var2;
               }
            }
         }
      }

      if (var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   public void method2743(double var1) {
      this.field1505 = var1;
      this.method2763();
   }

   public int[] vmethod3259(int var1) {
      class118 var2 = this.field1508[var1];
      if (var2 != null) {
         if (var2.field1592 != null) {
            this.field1502.method4277(var2);
            var2.field1589 = true;
            return var2.field1592;
         }

         boolean var3 = var2.method2854(this.field1505, this.field1506, this.field1507);
         if (var3) {
            if (this.field1503 == 0) {
               class118 var4 = (class118)this.field1502.method4280();
               var4.method2855();
            } else {
               --this.field1503;
            }

            this.field1502.method4277(var2);
            var2.field1589 = true;
            return var2.field1592;
         }
      }

      return null;
   }

   public int vmethod3247(int var1) {
      return this.field1508[var1] != null ? this.field1508[var1].field1593 : 0;
   }

   public boolean vmethod3250(int var1) {
      return this.field1508[var1].field1602;
   }

   public boolean vmethod3248(int var1) {
      return this.field1506 == 64;
   }

   public void method2763() {
      for(int var1 = 0; var1 < this.field1508.length; ++var1) {
         if (this.field1508[var1] != null) {
            this.field1508[var1].method2855();
         }
      }

      this.field1502 = new class207();
      this.field1503 = this.field1510;
   }

   public void method2748(int var1) {
      for(int var2 = 0; var2 < this.field1508.length; ++var2) {
         class118 var3 = this.field1508[var2];
         if (var3 != null && var3.field1599 != 0 && var3.field1589) {
            var3.method2856(var1);
            var3.field1589 = false;
         }
      }

   }

   static String method2767(Throwable var0) throws IOException {
      String var1;
      if (var0 instanceof class154) {
         class154 var2 = (class154)var0;
         var1 = var2.field2001 + " | ";
         var0 = var2.field1998;
      } else {
         var1 = "";
      }

      StringWriter var12 = new StringWriter();
      PrintWriter var3 = new PrintWriter(var12);
      var0.printStackTrace(var3);
      var3.close();
      String var4 = var12.toString();
      BufferedReader var5 = new BufferedReader(new StringReader(var4));
      String var6 = var5.readLine();

      while(true) {
         while(true) {
            String var7 = var5.readLine();
            if (var7 == null) {
               var1 = var1 + "| " + var6;
               return var1;
            }

            int var8 = var7.indexOf(40);
            int var9 = var7.indexOf(41, var8 + 1);
            if (var8 >= 0 && var9 >= 0) {
               String var10 = var7.substring(var8 + 1, var9);
               int var11 = var10.indexOf(".java:");
               if (var11 >= 0) {
                  var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
                  var1 = var1 + var10 + ' ';
                  continue;
               }

               var7 = var7.substring(0, var8);
            }

            var7 = var7.trim();
            var7 = var7.substring(var7.lastIndexOf(32) + 1);
            var7 = var7.substring(var7.lastIndexOf(9) + 1);
            var1 = var1 + var7 + ' ';
         }
      }
   }
}
