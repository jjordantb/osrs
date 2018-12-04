import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class33 extends class20 {
   static short[] field325;
   HashSet field327;
   HashSet field324;
   List field326;

   void method608(class184 var1, class184 var2, class184 var3, int var4, boolean var5) {
      this.method262(var1, var4);
      int var6 = var3.method3771();
      this.field327 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class10 var8 = new class10();

         try {
            var8.method106(var2, var3);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field327.add(var8);
      }

      var7 = var3.method3771();
      this.field324 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class34 var9 = new class34();

         try {
            var9.method631(var2, var3);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field324.add(var9);
      }

      this.method609(var2, var5);
   }

   void method609(class184 var1, boolean var2) {
      this.field326 = new LinkedList();
      int var3 = var1.method3771();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method3898();
         class228 var6 = new class228(var1.method3892());
         boolean var7 = var1.method3983() == 1;
         if (var2 || !var7) {
            this.field326.add(new class13(var5, var6));
         }
      }

   }

   public static String method616(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   static final void method612(class64 var0, int var1) {
      class157.method3463(var0.field953, var0.field999, var1);
   }

   static final void method607(int var0, int var1) {
      if (class189.method4028(var0)) {
         class23.method335(class145.field1951[var0], var1);
      }
   }
}
