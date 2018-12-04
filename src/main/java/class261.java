public class class261 extends class208 {
   public static class249 field3365;
   public static class202 field3359 = new class202(64);
   int field3358 = 0;
   public int field3361;
   public int field3364;
   public int field3363;
   public int field3360;

   void method5111() {
      this.method5114(this.field3358);
   }

   void method5126(class184 var1, int var2) {
      while(true) {
         int var3 = var1.method3983();
         if (var3 == 0) {
            return;
         }

         this.method5113(var1, var3, var2);
      }
   }

   void method5113(class184 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3358 = var1.method3773();
      }

   }

   void method5114(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0D;
         }
      }

      var12 /= 6.0D;
      this.field3364 = (int)(256.0D * var14);
      this.field3363 = (int)(var16 * 256.0D);
      if (this.field3364 < 0) {
         this.field3364 = 0;
      } else if (this.field3364 > 255) {
         this.field3364 = 255;
      }

      if (this.field3363 < 0) {
         this.field3363 = 0;
      } else if (this.field3363 > 255) {
         this.field3363 = 255;
      }

      if (var16 > 0.5D) {
         this.field3360 = (int)((1.0D - var16) * var14 * 512.0D);
      } else {
         this.field3360 = (int)(512.0D * var14 * var16);
      }

      if (this.field3360 < 1) {
         this.field3360 = 1;
      }

      this.field3361 = (int)((double)this.field3360 * var12);
   }

   static final void method5118(class64 var0) {
      var0.field972 = var0.field944;
      if (var0.field939 == 0) {
         var0.field955 = 0;
      } else {
         if (var0.field971 != -1 && var0.field998 == 0) {
            class275 var1 = class29.method532(var0.field971);
            if (var0.field959 > 0 && var1.field3622 == 0) {
               ++var0.field955;
               return;
            }

            if (var0.field959 <= 0 && var1.field3632 == 0) {
               ++var0.field955;
               return;
            }
         }

         int var10 = var0.field953;
         int var2 = var0.field999;
         int var3 = var0.field994[var0.field939 - 1] * 128 + var0.field964 * 64;
         int var4 = var0.field952[var0.field939 - 1] * 128 + var0.field964 * 64;
         if (var10 < var3) {
            if (var2 < var4) {
               var0.field990 = 1280;
            } else if (var2 > var4) {
               var0.field990 = 1792;
            } else {
               var0.field990 = 1536;
            }
         } else if (var10 > var3) {
            if (var2 < var4) {
               var0.field990 = 768;
            } else if (var2 > var4) {
               var0.field990 = 256;
            } else {
               var0.field990 = 512;
            }
         } else if (var2 < var4) {
            var0.field990 = 1024;
         } else if (var2 > var4) {
            var0.field990 = 0;
         }

         byte var5 = var0.field996[var0.field939 - 1];
         if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
            int var6 = var0.field990 - var0.field940 & 2047;
            if (var6 > 1024) {
               var6 -= 2048;
            }

            int var7 = var0.field948;
            if (var6 >= -256 && var6 <= 256) {
               var7 = var0.field942;
            } else if (var6 >= 256 && var6 < 768) {
               var7 = var0.field950;
            } else if (var6 >= -768 && var6 <= -256) {
               var7 = var0.field949;
            }

            if (var7 == -1) {
               var7 = var0.field942;
            }

            var0.field972 = var7;
            int var8 = 4;
            boolean var9 = true;
            if (var0 instanceof class73) {
               var9 = ((class73)var0).field1102.field3598;
            }

            if (var9) {
               if (var0.field940 != var0.field990 && var0.field965 == -1 && var0.field947 != 0) {
                  var8 = 2;
               }

               if (var0.field939 > 2) {
                  var8 = 6;
               }

               if (var0.field939 > 3) {
                  var8 = 8;
               }

               if (var0.field955 > 0 && var0.field939 > 1) {
                  var8 = 8;
                  --var0.field955;
               }
            } else {
               if (var0.field939 > 1) {
                  var8 = 6;
               }

               if (var0.field939 > 2) {
                  var8 = 8;
               }

               if (var0.field955 > 0 && var0.field939 > 1) {
                  var8 = 8;
                  --var0.field955;
               }
            }

            if (var5 == 2) {
               var8 <<= 1;
            }

            if (var8 >= 8 && var0.field972 == var0.field942 && var0.field951 != -1) {
               var0.field972 = var0.field951;
            }

            if (var10 != var3 || var4 != var2) {
               if (var10 < var3) {
                  var0.field953 += var8;
                  if (var0.field953 > var3) {
                     var0.field953 = var3;
                  }
               } else if (var10 > var3) {
                  var0.field953 -= var8;
                  if (var0.field953 < var3) {
                     var0.field953 = var3;
                  }
               }

               if (var2 < var4) {
                  var0.field999 += var8;
                  if (var0.field999 > var4) {
                     var0.field999 = var4;
                  }
               } else if (var2 > var4) {
                  var0.field999 -= var8;
                  if (var0.field999 < var4) {
                     var0.field999 = var4;
                  }
               }
            }

            if (var3 == var0.field953 && var4 == var0.field999) {
               --var0.field939;
               if (var0.field959 > 0) {
                  --var0.field959;
               }
            }

         } else {
            var0.field953 = var3;
            var0.field999 = var4;
            --var0.field939;
            if (var0.field959 > 0) {
               --var0.field959;
            }

         }
      }
   }
}
