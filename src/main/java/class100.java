public class class100 {
   class249 field1397;
   class249 field1394;
   class204 field1395 = new class204(256);
   class204 field1396 = new class204(256);

   public class100(class249 var1, class249 var2) {
      this.field1397 = var1;
      this.field1394 = var2;
   }

   class95 method2428(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4;
      class95 var7 = (class95)this.field1396.method4224(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class93 var8 = class93.method2275(this.field1397, var1, var2);
         if (var8 == null) {
            return null;
         } else {
            var7 = var8.method2281();
            this.field1396.method4226(var7, var5);
            if (var3 != null) {
               var3[0] -= var7.field1345.length;
            }

            return var7;
         }
      }
   }

   class95 method2429(int var1, int var2, int[] var3) {
      int var4 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var4 |= var1 << 16;
      long var5 = (long)var4 ^ 4294967296L;
      class95 var7 = (class95)this.field1396.method4224(var5);
      if (var7 != null) {
         return var7;
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class94 var8 = (class94)this.field1395.method4224(var5);
         if (var8 == null) {
            var8 = class94.method2292(this.field1394, var1, var2);
            if (var8 == null) {
               return null;
            }

            this.field1395.method4226(var8, var5);
         }

         var7 = var8.method2293(var3);
         if (var7 == null) {
            return null;
         } else {
            var8.method4271();
            this.field1396.method4226(var7, var5);
            return var7;
         }
      }
   }

   public class95 method2432(int var1, int[] var2) {
      if (this.field1397.method4841() == 1) {
         return this.method2428(0, var1, var2);
      } else if (this.field1397.method4889(var1) == 1) {
         return this.method2428(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class95 method2435(int var1, int[] var2) {
      if (this.field1394.method4841() == 1) {
         return this.method2429(0, var1, var2);
      } else if (this.field1394.method4889(var1) == 1) {
         return this.method2429(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }
}
