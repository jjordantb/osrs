public class class260 extends class208 {
   static class249 field3347;
   static class249 field3343;
   static class202 field3344 = new class202(64);
   static class202 field3345 = new class202(30);
   int field3357;
   int field3342;
   public int field3348 = -1;
   short[] field3349;
   short[] field3346;
   short[] field3351;
   short[] field3352;
   int field3353 = 128;
   int field3354 = 128;
   int field3350 = 0;
   int field3356 = 0;
   int field3355 = 0;

   void method5089(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5090(var1, var2);
      }
   }

   void method5090(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3342 = var1.method3771();
      } else if (var2 == 2) {
         this.field3348 = var1.method3771();
      } else if (var2 == 4) {
         this.field3353 = var1.method3771();
      } else if (var2 == 5) {
         this.field3354 = var1.method3771();
      } else if (var2 == 6) {
         this.field3350 = var1.method3771();
      } else if (var2 == 7) {
         this.field3356 = var1.method3983();
      } else if (var2 == 8) {
         this.field3355 = var1.method3983();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.method3983();
            this.field3349 = new short[var3];
            this.field3346 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3349[var4] = (short)var1.method3771();
               this.field3346[var4] = (short)var1.method3771();
            }
         } else if (var2 == 41) {
            var3 = var1.method3983();
            this.field3351 = new short[var3];
            this.field3352 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3351[var4] = (short)var1.method3771();
               this.field3352[var4] = (short)var1.method3771();
            }
         }
      }

   }

   public final class121 method5088(int var1) {
      class121 var2 = (class121)field3345.method4198((long)this.field3357);
      if (var2 == null) {
         class115 var3 = class115.method2843(field3343, this.field3342, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (this.field3349 != null) {
            for(var4 = 0; var4 < this.field3349.length; ++var4) {
               var3.method2775(this.field3349[var4], this.field3346[var4]);
            }
         }

         if (this.field3351 != null) {
            for(var4 = 0; var4 < this.field3351.length; ++var4) {
               var3.method2785(this.field3351[var4], this.field3352[var4]);
            }
         }

         var2 = var3.method2772(this.field3356 + 64, this.field3355 + 850, -30, -50, -30);
         field3345.method4204(var2, (long)this.field3357);
      }

      class121 var5;
      if (this.field3348 != -1 && var1 != -1) {
         var5 = class29.method532(this.field3348).method5486(var2, var1);
      } else {
         var5 = var2.method2881(true);
      }

      if (this.field3353 != 128 || this.field3354 != 128) {
         var5.method2878(this.field3353, this.field3354, this.field3353);
      }

      if (this.field3350 != 0) {
         if (this.field3350 == 90) {
            var5.method2880();
         }

         if (this.field3350 == 180) {
            var5.method2880();
            var5.method2880();
         }

         if (this.field3350 == 270) {
            var5.method2880();
            var5.method2880();
            var5.method2880();
         }
      }

      return var5;
   }

   static final void method5109(class191 var0) {
      var0.method4056();
      int var1 = client.field747;
      class61 var2 = class69.field1063 = client.field698[var1] = new class61();
      var2.field628 = var1;
      int var3 = var0.method4052(30);
      byte var4 = (byte)(var3 >> 28);
      int var5 = var3 >> 14 & 16383;
      int var6 = var3 & 16383;
      var2.field994[0] = var5 - class49.field490;
      var2.field953 = (var2.field994[0] << 7) + (var2.method1178() << 6);
      var2.field952[0] = var6 - class11.field91;
      var2.field999 = (var2.field952[0] << 7) + (var2.method1178() << 6);
      class60.field599 = var2.field620 = var4;
      if (class83.field1233[var1] != null) {
         var2.method1172(class83.field1233[var1]);
      }

      class83.field1226 = 0;
      class83.field1222[++class83.field1226 - 1] = var1;
      class83.field1223[var1] = 0;
      class83.field1228 = 0;

      for(int var7 = 1; var7 < 2048; ++var7) {
         if (var7 != var1) {
            int var8 = var0.method4052(18);
            int var9 = var8 >> 16;
            int var10 = var8 >> 8 & 597;
            int var11 = var8 & 597;
            class83.field1230[var7] = (var10 << 14) + var11 + (var9 << 28);
            class83.field1231[var7] = 0;
            class83.field1232[var7] = -1;
            class83.field1225[++class83.field1228 - 1] = var7;
            class83.field1223[var7] = 0;
         }
      }

      var0.method4053();
   }

   static int method5103(int var0, class86 var1, boolean var2) {
      if (var0 == 6200) {
         class60.field600 -= 2;
         client.field649 = (short)class297.method5770(class70.field1070[class60.field600]);
         if (client.field649 <= 0) {
            client.field649 = 256;
         }

         client.field896 = (short)class297.method5770(class70.field1070[class60.field600 + 1]);
         if (client.field896 <= 0) {
            client.field896 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class60.field600 -= 2;
         client.field897 = (short)class70.field1070[class60.field600];
         if (client.field897 <= 0) {
            client.field897 = 256;
         }

         client.field898 = (short)class70.field1070[class60.field600 + 1];
         if (client.field898 <= 0) {
            client.field898 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class60.field600 -= 4;
         client.field899 = (short)class70.field1070[class60.field600];
         if (client.field899 <= 0) {
            client.field899 = 1;
         }

         client.field684 = (short)class70.field1070[class60.field600 + 1];
         if (client.field684 <= 0) {
            client.field684 = 32767;
         } else if (client.field684 < client.field899) {
            client.field684 = client.field899;
         }

         client.field901 = (short)class70.field1070[class60.field600 + 2];
         if (client.field901 <= 0) {
            client.field901 = 1;
         }

         client.field754 = (short)class70.field1070[class60.field600 + 3];
         if (client.field754 <= 0) {
            client.field754 = 32767;
         } else if (client.field754 < client.field901) {
            client.field754 = client.field901;
         }

         return 1;
      } else if (var0 == 6203) {
         if (client.field815 != null) {
            class3.method36(0, 0, client.field815.field2682, client.field815.field2683, false);
            class70.field1070[++class60.field600 - 1] = client.field644;
            class70.field1070[++class60.field600 - 1] = client.field764;
         } else {
            class70.field1070[++class60.field600 - 1] = -1;
            class70.field1070[++class60.field600 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class70.field1070[++class60.field600 - 1] = client.field897;
         class70.field1070[++class60.field600 - 1] = client.field898;
         return 1;
      } else if (var0 == 6205) {
         class70.field1070[++class60.field600 - 1] = class252.method4978(client.field649);
         class70.field1070[++class60.field600 - 1] = class252.method4978(client.field896);
         return 1;
      } else {
         return 2;
      }
   }
}
