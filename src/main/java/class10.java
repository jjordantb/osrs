public class class10 extends class16 {
   static class232 field75;
   static String field82;
   static class322[] field81;
   static class322 field77;
   static class251 field80;
   static String field79;

   void method106(class184 var1, class184 var2) {
      int var3 = var2.method3983();
      if (var3 != class25.field258.field254) {
         throw new IllegalStateException("");
      } else {
         super.field150 = var2.method3983();
         super.field148 = var2.method3983();
         super.field146 = var2.method3771();
         super.field151 = var2.method3771();
         super.field147 = var2.method3771();
         super.field149 = var2.method3771();
         super.field148 = Math.min(super.field148, 4);
         super.field152 = new short[1][64][64];
         super.field153 = new short[super.field148][64][64];
         super.field154 = new byte[super.field148][64][64];
         super.field155 = new byte[super.field148][64][64];
         super.field156 = new class19[super.field148][64][64][];
         var3 = var1.method3983();
         if (var3 != class24.field251.field247) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.method3983();
            int var5 = var1.method3983();
            if (var4 == super.field147 && var5 == super.field149) {
               for(int var6 = 0; var6 < 64; ++var6) {
                  for(int var7 = 0; var7 < 64; ++var7) {
                     this.method181(var6, var7, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class10)) {
         return false;
      } else {
         class10 var2 = (class10)var1;
         return var2.field147 == super.field147 && var2.field149 == super.field149;
      }
   }

   public int hashCode() {
      return super.field147 | super.field149 << 8;
   }

   static void method114(class323 var0, int var1, int var2, int var3) {
      class203 var4 = class23.field235;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var4.method4213(var0, var6, var0.field3889.length * 4);
   }

   public static int method116(CharSequence var0, CharSequence var1, int var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class9.method100(var9);
         var8 = class9.method100(var10);
         var9 = class99.method2421(var9, var2);
         var10 = class99.method2421(var10, var2);
         if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var10 != var9) {
               return class84.method2117(var9, var2) - class84.method2117(var10, var2);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         char var11 = var0.charAt(var17);
         var12 = var1.charAt(var17);
         if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if (var11 != var12) {
               return class84.method2117(var11, var2) - class84.method2117(var12, var2);
            }
         }
      }

      var17 = var3 - var4;
      if (var17 != 0) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if (var13 != var12) {
               return class84.method2117(var12, var2) - class84.method2117(var13, var2);
            }
         }

         return 0;
      }
   }

   public static int method110(int var0) {
      return var0 >> 17 & 7;
   }

   static final void method115(class191 var0) {
      int var1 = 0;
      var0.method4056();

      int var2;
      int var3;
      int var4;
      for(var2 = 0; var2 < class83.field1226; ++var2) {
         var3 = class83.field1222[var2];
         if ((class83.field1223[var3] & 1) == 0) {
            if (var1 > 0) {
               --var1;
               class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
            } else {
               var4 = var0.method4052(1);
               if (var4 == 0) {
                  var1 = class22.method333(var0);
                  class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
               } else {
                  class174.method3670(var0, var3);
               }
            }
         }
      }

      var0.method4053();
      if (var1 != 0) {
         throw new RuntimeException();
      } else {
         var0.method4056();

         for(var2 = 0; var2 < class83.field1226; ++var2) {
            var3 = class83.field1222[var2];
            if ((class83.field1223[var3] & 1) != 0) {
               if (var1 > 0) {
                  --var1;
                  class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
               } else {
                  var4 = var0.method4052(1);
                  if (var4 == 0) {
                     var1 = class22.method333(var0);
                     class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                  } else {
                     class174.method3670(var0, var3);
                  }
               }
            }
         }

         var0.method4053();
         if (var1 != 0) {
            throw new RuntimeException();
         } else {
            var0.method4056();

            for(var2 = 0; var2 < class83.field1228; ++var2) {
               var3 = class83.field1225[var2];
               if ((class83.field1223[var3] & 1) != 0) {
                  if (var1 > 0) {
                     --var1;
                     class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                  } else {
                     var4 = var0.method4052(1);
                     if (var4 == 0) {
                        var1 = class22.method333(var0);
                        class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                     } else if (class86.method2162(var0, var3)) {
                        class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                     }
                  }
               }
            }

            var0.method4053();
            if (var1 != 0) {
               throw new RuntimeException();
            } else {
               var0.method4056();

               for(var2 = 0; var2 < class83.field1228; ++var2) {
                  var3 = class83.field1225[var2];
                  if ((class83.field1223[var3] & 1) == 0) {
                     if (var1 > 0) {
                        --var1;
                        class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                     } else {
                        var4 = var0.method4052(1);
                        if (var4 == 0) {
                           var1 = class22.method333(var0);
                           class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                        } else if (class86.method2162(var0, var3)) {
                           class83.field1223[var3] = (byte)(class83.field1223[var3] | 2);
                        }
                     }
                  }
               }

               var0.method4053();
               if (var1 != 0) {
                  throw new RuntimeException();
               } else {
                  class83.field1226 = 0;
                  class83.field1228 = 0;

                  for(var2 = 1; var2 < 2048; ++var2) {
                     class83.field1223[var2] = (byte)(class83.field1223[var2] >> 1);
                     class61 var5 = client.field698[var2];
                     if (var5 != null) {
                        class83.field1222[++class83.field1226 - 1] = var2;
                     } else {
                        class83.field1225[++class83.field1228 - 1] = var2;
                     }
                  }

               }
            }
         }
      }
   }

   public static boolean method117() {
      return class219.field2529 != 0 ? true : class193.field2461.method4492();
   }
}
