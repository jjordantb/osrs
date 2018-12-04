import java.io.IOException;

public final class class73 extends class64 {
   class273 field1102;

   final void method1970(int var1, byte var2) {
      int var3 = super.field994[0];
      int var4 = super.field952[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.field971 != -1 && class29.method532(super.field971).field3632 == 1) {
         super.field971 = -1;
      }

      if (super.field939 < 9) {
         ++super.field939;
      }

      for(int var5 = super.field939; var5 > 0; --var5) {
         super.field994[var5] = super.field994[var5 - 1];
         super.field952[var5] = super.field952[var5 - 1];
         super.field996[var5] = super.field996[var5 - 1];
      }

      super.field994[0] = var3;
      super.field952[0] = var4;
      super.field996[0] = var2;
   }

   final void method1982(int var1, int var2, boolean var3) {
      if (super.field971 != -1 && class29.method532(super.field971).field3632 == 1) {
         super.field971 = -1;
      }

      if (!var3) {
         int var4 = var1 - super.field994[0];
         int var5 = var2 - super.field952[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (super.field939 < 9) {
               ++super.field939;
            }

            for(int var6 = super.field939; var6 > 0; --var6) {
               super.field994[var6] = super.field994[var6 - 1];
               super.field952[var6] = super.field952[var6 - 1];
               super.field996[var6] = super.field996[var6 - 1];
            }

            super.field994[0] = var1;
            super.field952[0] = var2;
            super.field996[0] = 1;
            return;
         }
      }

      super.field939 = 0;
      super.field959 = 0;
      super.field955 = 0;
      super.field994[0] = var1;
      super.field952[0] = var2;
      super.field953 = super.field964 * 64 + super.field994[0] * 128;
      super.field999 = super.field964 * 64 + super.field952[0] * 128;
   }

   protected final class121 vmethod3236() {
      if (this.field1102 == null) {
         return null;
      } else {
         class275 var1 = super.field971 != -1 && super.field998 == 0 ? class29.method532(super.field971) : null;
         class275 var2 = super.field972 != -1 && (super.field944 != super.field972 || var1 == null) ? class29.method532(super.field972) : null;
         class121 var3 = this.field1102.method5414(var1, super.field986, var2, super.field969);
         if (var3 == null) {
            return null;
         } else {
            var3.method2873();
            super.field946 = var3.field1840;
            if (super.field976 != -1 && super.field993 != -1) {
               class121 var4 = class250.method4918(super.field976).method5088(super.field993);
               if (var4 != null) {
                  var4.method2885(0, -super.field980, 0);
                  class121[] var5 = new class121[]{var3, var4};
                  var3 = new class121(var5, 2);
               }
            }

            if (this.field1102.field3600 == 1) {
               var3.field1664 = true;
            }

            return var3;
         }
      }
   }

   final boolean vmethod1973() {
      return this.field1102 != null;
   }

   public static int method1969(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ class184.field2406[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   static final void method1983(boolean var0) {
      class160.method3502();
      ++client.field690.field1288;
      if (client.field690.field1288 >= 50 || var0) {
         client.field690.field1288 = 0;
         if (!client.field692 && client.field690.method2192() != null) {
            class174 var1 = class131.method3243(class171.field2224, client.field690.field1282);
            client.field690.method2193(var1);

            try {
               client.field690.method2187();
            } catch (IOException var3) {
               client.field692 = true;
            }
         }

      }
   }
}
