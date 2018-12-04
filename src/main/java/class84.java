import java.io.EOFException;

public class class84 {
   static int field1243;
   boolean[] field1237;
   boolean[] field1238;
   int[] field1239;
   String[] field1236;
   boolean field1241 = false;
   long field1245;

   class84() {
      this.field1239 = new int[class50.field505.method4889(19)];
      this.field1236 = new String[class50.field505.method4889(15)];
      this.field1237 = new boolean[this.field1239.length];

      int var1;
      for(var1 = 0; var1 < this.field1239.length; ++var1) {
         class258 var2 = class251.method4963(var1);
         this.field1237[var1] = var2.field3337;
      }

      this.field1238 = new boolean[this.field1236.length];

      for(var1 = 0; var1 < this.field1236.length; ++var1) {
         class259 var3 = class0.method0(var1);
         this.field1238[var1] = var3.field3341;
      }

      for(var1 = 0; var1 < this.field1239.length; ++var1) {
         this.field1239[var1] = -1;
      }

      this.method2093();
   }

   void method2114(int var1, int var2) {
      this.field1239[var1] = var2;
      if (this.field1237[var1]) {
         this.field1241 = true;
      }

   }

   int method2091(int var1) {
      return this.field1239[var1];
   }

   void method2106(int var1, String var2) {
      this.field1236[var1] = var2;
      if (this.field1238[var1]) {
         this.field1241 = true;
      }

   }

   String method2089(int var1) {
      return this.field1236[var1];
   }

   void method2108() {
      int var1;
      for(var1 = 0; var1 < this.field1239.length; ++var1) {
         if (!this.field1237[var1]) {
            this.field1239[var1] = -1;
         }
      }

      for(var1 = 0; var1 < this.field1236.length; ++var1) {
         if (!this.field1238[var1]) {
            this.field1236[var1] = null;
         }
      }

   }

   class112 method2095(boolean var1) {
      return class7.method85("2", client.field646.field3202, var1);
   }

   void method2096() {
      class112 var1 = this.method2095(true);

      try {
         int var2 = 3;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.field1239.length; ++var4) {
            if (this.field1237[var4] && this.field1239[var4] != -1) {
               var2 += 6;
               ++var3;
            }
         }

         var2 += 2;
         var4 = 0;

         for(int var5 = 0; var5 < this.field1236.length; ++var5) {
            if (this.field1238[var5] && this.field1236[var5] != null) {
               var2 += 2 + class97.method2404(this.field1236[var5]);
               ++var4;
            }
         }

         class184 var9 = new class184(var2);
         var9.method3805(1);
         var9.method3754(var3);

         int var6;
         for(var6 = 0; var6 < this.field1239.length; ++var6) {
            if (this.field1237[var6] && this.field1239[var6] != -1) {
               var9.method3754(var6);
               var9.method3921(this.field1239[var6]);
            }
         }

         var9.method3754(var4);

         for(var6 = 0; var6 < this.field1236.length; ++var6) {
            if (this.field1238[var6] && this.field1236[var6] != null) {
               var9.method3754(var6);
               var9.method3889(this.field1236[var6]);
            }
         }

         var1.method2716(var9.field2404, 0, var9.field2405);
      } catch (Exception var17) {
         ;
      } finally {
         try {
            var1.method2717();
         } catch (Exception var16) {
            ;
         }

      }

      this.field1241 = false;
      this.field1245 = class120.method2866();
   }

   void method2093() {
      class112 var1 = this.method2095(false);

      label191: {
         try {
            byte[] var2 = new byte[(int)var1.method2719()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.method2720(var2, var3, var2.length - var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            }

            class184 var13 = new class184(var2);
            if (var13.field2404.length - var13.field2405 < 1) {
               return;
            }

            int var14 = var13.method3983();
            if (var14 >= 0 && var14 <= 1) {
               int var15 = var13.method3771();

               int var7;
               int var8;
               int var9;
               for(var7 = 0; var7 < var15; ++var7) {
                  var8 = var13.method3771();
                  var9 = var13.method3892();
                  if (this.field1237[var8]) {
                     this.field1239[var8] = var9;
                  }
               }

               var7 = var13.method3771();
               var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     break label191;
                  }

                  var9 = var13.method3771();
                  String var10 = var13.method3778();
                  if (this.field1238[var9]) {
                     this.field1236[var9] = var10;
                  }

                  ++var8;
               }
            }
         } catch (Exception var24) {
            break label191;
         } finally {
            try {
               var1.method2717();
            } catch (Exception var23) {
               ;
            }

         }

         return;
      }

      this.field1241 = false;
   }

   void method2090() {
      if (this.field1241 && this.field1245 < class120.method2866() - 60000L) {
         this.method2096();
      }

   }

   boolean method2099() {
      return this.field1241;
   }

   public static void method2124(class249 var0) {
      class268.field3419 = var0;
   }

   public static class271 method2125(int var0) {
      class271 var1 = (class271)class271.field3507.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class271.field3506.method4831(10, var0);
         var1 = new class271();
         var1.field3557 = var0;
         if (var2 != null) {
            var1.method5375(new class184(var2));
         }

         var1.method5322();
         if (var1.field3552 != -1) {
            var1.method5325(method2125(var1.field3552), method2125(var1.field3549));
         }

         if (var1.field3518 != -1) {
            var1.method5338(method2125(var1.field3518), method2125(var1.field3511));
         }

         if (var1.field3510 != -1) {
            var1.method5327(method2125(var1.field3510), method2125(var1.field3555));
         }

         if (!class229.field2648 && var1.field3512) {
            var1.field3515 = "Members object";
            var1.field3509 = false;
            var1.field3526 = null;
            var1.field3541 = null;
            var1.field3528 = -1;
            var1.field3540 = 0;
            if (var1.field3551 != null) {
               boolean var3 = false;

               for(class206 var4 = var1.field3551.method4172(); var4 != null; var4 = var1.field3551.method4173()) {
                  class266 var5 = class25.method479((int)var4.field2496);
                  if (var5.field3404) {
                     var4.method4271();
                  } else {
                     var3 = true;
                  }
               }

               if (!var3) {
                  var1.field3551 = null;
               }
            }
         }

         class271.field3507.method4204(var1, (long)var0);
         return var1;
      }
   }

   static int method2117(char var0, int var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      return var2;
   }
}
