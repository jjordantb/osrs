public class class229 {
   public static boolean field2648;
   public static short[] field2642;
   public static short[][] field2638;
   static final int[] field2644 = new int[]{8, 11, 4, 6, 9, 7, 10};
   static class202 field2636 = new class202(260);
   static String[] field2646;
   int[] field2641;
   int[] field2643;
   public boolean field2637;
   public int field2639;
   long field2640;
   long field2645;

   public void method4664(int[] var1, int[] var2, boolean var3, int var4) {
      if (var1 == null) {
         var1 = new int[12];

         for(int var5 = 0; var5 < 7; ++var5) {
            for(int var6 = 0; var6 < class262.field3368; ++var6) {
               class262 var7 = class171.method3656(var6);
               if (var7 != null && !var7.field3377 && var7.field3366 == var5 + (var3 ? 7 : 0)) {
                  var1[field2644[var5]] = var6 + 256;
                  break;
               }
            }
         }
      }

      this.field2641 = var1;
      this.field2643 = var2;
      this.field2637 = var3;
      this.field2639 = var4;
      this.method4669();
   }

   public void method4665(int var1, boolean var2) {
      if (var1 != 1 || !this.field2637) {
         int var3 = this.field2641[field2644[var1]];
         if (var3 != 0) {
            var3 -= 256;

            class262 var4;
            do {
               if (!var2) {
                  --var3;
                  if (var3 < 0) {
                     var3 = class262.field3368 - 1;
                  }
               } else {
                  ++var3;
                  if (var3 >= class262.field3368) {
                     var3 = 0;
                  }
               }

               var4 = class171.method3656(var3);
            } while(var4 == null || var4.field3377 || var4.field3366 != (this.field2637 ? 7 : 0) + var1);

            this.field2641[field2644[var1]] = var3 + 256;
            this.method4669();
         }
      }
   }

   public void method4666(int var1, boolean var2) {
      int var3 = this.field2643[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = class256.field3306[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= class256.field3306[var1].length) {
               var3 = 0;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.field2643[var1] = var3;
      this.method4669();
   }

   public void method4667(boolean var1) {
      if (this.field2637 != var1) {
         this.method4664((int[])null, this.field2643, var1, -1);
      }
   }

   public void method4668(class184 var1) {
      var1.method3805(this.field2637 ? 1 : 0);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int var3 = this.field2641[field2644[var2]];
         if (var3 == 0) {
            var1.method3805(-1);
         } else {
            var1.method3805(var3 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.method3805(this.field2643[var2]);
      }

   }

   void method4669() {
      long var1 = this.field2640;
      int var3 = this.field2641[5];
      int var4 = this.field2641[9];
      this.field2641[5] = var4;
      this.field2641[9] = var3;
      this.field2640 = 0L;

      int var5;
      for(var5 = 0; var5 < 12; ++var5) {
         this.field2640 <<= 4;
         if (this.field2641[var5] >= 256) {
            this.field2640 += (long)(this.field2641[var5] - 256);
         }
      }

      if (this.field2641[0] >= 256) {
         this.field2640 += (long)(this.field2641[0] - 256 >> 4);
      }

      if (this.field2641[1] >= 256) {
         this.field2640 += (long)(this.field2641[1] - 256 >> 8);
      }

      for(var5 = 0; var5 < 5; ++var5) {
         this.field2640 <<= 3;
         this.field2640 += (long)this.field2643[var5];
      }

      this.field2640 <<= 1;
      this.field2640 += (long)(this.field2637 ? 1 : 0);
      this.field2641[5] = var3;
      this.field2641[9] = var4;
      if (var1 != 0L && var1 != this.field2640) {
         field2636.method4197(var1);
      }

   }

   public class121 method4670(class275 var1, int var2, class275 var3, int var4) {
      if (this.field2639 != -1) {
         return class248.method4823(this.field2639).method5414(var1, var2, var3, var4);
      } else {
         long var5 = this.field2640;
         int[] var7 = this.field2641;
         if (var1 != null && (var1.field3628 >= 0 || var1.field3629 >= 0)) {
            var7 = new int[12];

            for(int var18 = 0; var18 < 12; ++var18) {
               var7[var18] = this.field2641[var18];
            }

            if (var1.field3628 >= 0) {
               var5 += (long)(var1.field3628 - this.field2641[5] << 40);
               var7[5] = var1.field3628;
            }

            if (var1.field3629 >= 0) {
               var5 += (long)(var1.field3629 - this.field2641[3] << 48);
               var7[3] = var1.field3629;
            }
         }

         class121 var8 = (class121)field2636.method4198(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (var11 >= 256 && var11 < 512 && !class171.method3656(var11 - 256).method5130()) {
                  var9 = true;
               }

               if (var11 >= 512 && !class84.method2125(var11 - 512).method5331(this.field2637)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (this.field2645 != -1L) {
                  var8 = (class121)field2636.method4198(this.field2645);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (var8 == null) {
               class115[] var15 = new class115[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  class115 var14;
                  if (var13 >= 256 && var13 < 512) {
                     var14 = class171.method3656(var13 - 256).method5127();
                     if (var14 != null) {
                        var15[var11++] = var14;
                     }
                  }

                  if (var13 >= 512) {
                     var14 = class84.method2125(var13 - 512).method5332(this.field2637);
                     if (var14 != null) {
                        var15[var11++] = var14;
                     }
                  }
               }

               class115 var17 = new class115(var15, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.field2643[var13] < class256.field3306[var13].length) {
                     var17.method2775(class39.field385[var13], class256.field3306[var13][this.field2643[var13]]);
                  }

                  if (this.field2643[var13] < field2638[var13].length) {
                     var17.method2775(field2642[var13], field2638[var13][this.field2643[var13]]);
                  }
               }

               var8 = var17.method2772(64, 850, -30, -50, -30);
               field2636.method4204(var8, var5);
               this.field2645 = var5;
            }
         }

         if (var1 == null && var3 == null) {
            return var8;
         } else {
            class121 var16;
            if (var1 != null && var3 != null) {
               var16 = var1.method5459(var8, var2, var3, var4);
            } else if (var1 != null) {
               var16 = var1.method5457(var8, var2);
            } else {
               var16 = var3.method5457(var8, var4);
            }

            return var16;
         }
      }
   }

   class115 method4671() {
      if (this.field2639 != -1) {
         return class248.method4823(this.field2639).method5430();
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field2641[var2];
            if (var3 >= 256 && var3 < 512 && !class171.method3656(var3 - 256).method5131()) {
               var1 = true;
            }

            if (var3 >= 512 && !class84.method2125(var3 - 512).method5333(this.field2637)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            class115[] var7 = new class115[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field2641[var4];
               class115 var6;
               if (var5 >= 256 && var5 < 512) {
                  var6 = class171.method3656(var5 - 256).method5132();
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }

               if (var5 >= 512) {
                  var6 = class84.method2125(var5 - 512).method5365(this.field2637);
                  if (var6 != null) {
                     var7[var3++] = var6;
                  }
               }
            }

            class115 var8 = new class115(var7, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.field2643[var5] < class256.field3306[var5].length) {
                  var8.method2775(class39.field385[var5], class256.field3306[var5][this.field2643[var5]]);
               }

               if (this.field2643[var5] < field2638[var5].length) {
                  var8.method2775(field2642[var5], field2638[var5][this.field2643[var5]]);
               }
            }

            return var8;
         }
      }
   }

   public int method4672() {
      return this.field2639 == -1 ? (this.field2641[0] << 15) + this.field2641[1] + (this.field2641[11] << 5) + (this.field2641[8] << 10) + (this.field2643[0] << 25) + (this.field2643[4] << 20) : 305419896 + class248.method4823(this.field2639).field3568;
   }
}
