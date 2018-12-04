public abstract class class64 extends class129 {
   boolean field941 = false;
   int field953;
   int field999;
   int field940;
   int field964 = 1;
   int field943;
   int field944 = -1;
   int field945 = -1;
   int field957 = -1;
   int field942 = -1;
   int field948 = -1;
   int field949 = -1;
   int field950 = -1;
   int field951 = -1;
   String field968 = null;
   boolean field958;
   boolean field954 = false;
   int field981 = 100;
   int field956 = 0;
   int field974 = 0;
   byte field938 = 0;
   int[] field992 = new int[4];
   int[] field960 = new int[4];
   int[] field961 = new int[4];
   int[] field962 = new int[4];
   int[] field963 = new int[4];
   class205 field987 = new class205();
   int field965 = -1;
   boolean field966 = false;
   int field967 = -1;
   int field972 = -1;
   int field969 = 0;
   int field970 = 0;
   int field971 = -1;
   int field986 = 0;
   int field989 = 0;
   int field998 = 0;
   int field975 = 0;
   int field976 = -1;
   int field993 = 0;
   int field978 = 0;
   int field979;
   int field980;
   int field983;
   int field982;
   int field995;
   int field984;
   int field985;
   int field977;
   int field997;
   int field988 = 0;
   int field946 = 200;
   int field990;
   int field991 = 0;
   int field947 = 32;
   int field939 = 0;
   int[] field994 = new int[10];
   int[] field952 = new int[10];
   byte[] field996 = new byte[10];
   int field955 = 0;
   int field959 = 0;

   boolean vmethod1973() {
      return false;
   }

   final void method1660() {
      this.field939 = 0;
      this.field959 = 0;
   }

   final void method1675(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if (this.field961[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if (var1 >= 0) {
         class269 var12 = class221.method4528(var1);
         var10 = var12.field3445;
         var11 = var12.field3428;
      }

      int var14;
      if (var8) {
         if (var10 == -1) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if (var10 == 0) {
            var14 = this.field961[0];
         } else if (var10 == 1) {
            var14 = this.field960[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if (var10 == 0) {
               if (this.field961[var13] < var14) {
                  var9 = var13;
                  var14 = this.field961[var13];
               }
            } else if (var10 == 1 && this.field960[var13] < var14) {
               var9 = var13;
               var14 = this.field960[var13];
            }
         }

         if (var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if (var7) {
            this.field938 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field938;
            this.field938 = (byte)((this.field938 + 1) % 4);
            if (this.field961[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if (var9 >= 0) {
         this.field992[var9] = var1;
         this.field960[var9] = var2;
         this.field962[var9] = var3;
         this.field963[var9] = var4;
         this.field961[var9] = var5 + var11 + var6;
      }
   }

   final void method1677(int var1, int var2, int var3, int var4, int var5, int var6) {
      class263 var7 = class37.method698(var1);
      class72 var8 = null;
      class72 var9 = null;
      int var10 = var7.field3386;
      int var11 = 0;

      class72 var12;
      for(var12 = (class72)this.field987.method4250(); var12 != null; var12 = (class72)this.field987.method4248()) {
         ++var11;
         if (var12.field1097.field3383 == var7.field3383) {
            var12.method1959(var2 + var4, var5, var6, var3);
            return;
         }

         if (var12.field1097.field3391 <= var7.field3391) {
            var8 = var12;
         }

         if (var12.field1097.field3386 > var10) {
            var9 = var12;
            var10 = var12.field1097.field3386;
         }
      }

      if (var9 != null || var11 < 4) {
         var12 = new class72(var7);
         if (var8 == null) {
            this.field987.method4246(var12);
         } else {
            class205.method4245(var12, var8);
         }

         var12.method1959(var2 + var4, var5, var6, var3);
         if (var11 >= 4) {
            var9.method4271();
         }

      }
   }

   final void method1663(int var1) {
      class263 var2 = class37.method698(var1);

      for(class72 var3 = (class72)this.field987.method4250(); var3 != null; var3 = (class72)this.field987.method4248()) {
         if (var2 == var3.field1097) {
            var3.method4271();
            return;
         }
      }

   }

   static final int method1678() {
      return class122.field1715;
   }
}
