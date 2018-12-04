import java.math.BigInteger;

public class class184 extends class206 {
   static int[] field2406 = new int[256];
   static long[] field2407;
   static int[] field2408;
   static int field2409;
   public byte[] field2404;
   public int field2405;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field2406[var1] = var0;
      }

      field2407 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field2407[var2] = var4;
      }

   }

   public class184(int var1) {
      this.field2404 = class88.method2184(var1);
      this.field2405 = 0;
   }

   public class184(byte[] var1) {
      this.field2404 = var1;
      this.field2405 = 0;
   }

   public void method3752() {
      if (this.field2404 != null) {
         class27.method515(this.field2404);
      }

      this.field2404 = null;
   }

   public void method3805(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)var1;
   }

   public void method3754(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)var1;
   }

   public void method3755(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 16);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)var1;
   }

   public void method3921(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 24);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 16);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)var1;
   }

   public void method3757(long var1) {
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 40));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 32));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 24));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 16));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 8));
      this.field2404[++this.field2405 - 1] = (byte)((int)var1);
   }

   public void method3758(long var1) {
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 56));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 48));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 40));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 32));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 24));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 16));
      this.field2404[++this.field2405 - 1] = (byte)((int)(var1 >> 8));
      this.field2404[++this.field2405 - 1] = (byte)((int)var1);
   }

   public void method3818(boolean var1) {
      this.method3805(var1 ? 1 : 0);
   }

   public void method3889(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2405 += class246.method4810(var1, 0, var1.length(), this.field2404, this.field2405);
         this.field2404[++this.field2405 - 1] = 0;
      }
   }

   public void method3956(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2404[++this.field2405 - 1] = 0;
         this.field2405 += class246.method4810(var1, 0, var1.length(), this.field2404, this.field2405);
         this.field2404[++this.field2405 - 1] = 0;
      }
   }

   public void method3989(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 <= '\u007f') {
            ++var4;
         } else if (var6 <= '\u07ff') {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.field2404[++this.field2405 - 1] = 0;
      this.method3768(var4);
      this.field2405 += class26.method491(this.field2404, this.field2405, var1);
   }

   public void method3763(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.field2404[++this.field2405 - 1] = var1[var4];
      }

   }

   public void method3764(int var1) {
      this.field2404[this.field2405 - var1 - 4] = (byte)(var1 >> 24);
      this.field2404[this.field2405 - var1 - 3] = (byte)(var1 >> 16);
      this.field2404[this.field2405 - var1 - 2] = (byte)(var1 >> 8);
      this.field2404[this.field2405 - var1 - 1] = (byte)var1;
   }

   public void method3765(int var1) {
      this.field2404[this.field2405 - var1 - 2] = (byte)(var1 >> 8);
      this.field2404[this.field2405 - var1 - 1] = (byte)var1;
   }

   public void method3766(int var1) {
      this.field2404[this.field2405 - var1 - 1] = (byte)var1;
   }

   public void method3759(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method3805(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method3754(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method3768(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.method3805(var1 >>> 28 | 128);
               }

               this.method3805(var1 >>> 21 | 128);
            }

            this.method3805(var1 >>> 14 | 128);
         }

         this.method3805(var1 >>> 7 | 128);
      }

      this.method3805(var1 & 127);
   }

   public int method3983() {
      return this.field2404[++this.field2405 - 1] & 255;
   }

   public byte method3931() {
      return this.field2404[++this.field2405 - 1];
   }

   public int method3771() {
      this.field2405 += 2;
      return (this.field2404[this.field2405 - 1] & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8);
   }

   public int method3814() {
      this.field2405 += 2;
      int var1 = (this.field2404[this.field2405 - 1] & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int method3773() {
      this.field2405 += 3;
      return ((this.field2404[this.field2405 - 3] & 255) << 16) + (this.field2404[this.field2405 - 1] & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8);
   }

   public int method3892() {
      this.field2405 += 4;
      return ((this.field2404[this.field2405 - 3] & 255) << 16) + (this.field2404[this.field2405 - 1] & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8) + ((this.field2404[this.field2405 - 4] & 255) << 24);
   }

   public long method3775() {
      long var1 = (long)this.method3892() & 4294967295L;
      long var3 = (long)this.method3892() & 4294967295L;
      return (var1 << 32) + var3;
   }

   public boolean method3776() {
      return (this.method3983() & 1) == 1;
   }

   public String method3777() {
      if (this.field2404[this.field2405] == 0) {
         ++this.field2405;
         return null;
      } else {
         return this.method3778();
      }
   }

   public String method3778() {
      int var1 = this.field2405;

      while(this.field2404[++this.field2405 - 1] != 0) {
         ;
      }

      int var2 = this.field2405 - var1 - 1;
      return var2 == 0 ? "" : class192.method4091(this.field2404, var1, var2);
   }

   public String method3779() {
      byte var1 = this.field2404[++this.field2405 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.field2405;

         while(this.field2404[++this.field2405 - 1] != 0) {
            ;
         }

         int var3 = this.field2405 - var2 - 1;
         return var3 == 0 ? "" : class192.method4091(this.field2404, var2, var3);
      }
   }

   public String method3780() {
      byte var1 = this.field2404[++this.field2405 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method3787();
         if (var2 + this.field2405 > this.field2404.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.field2404;
            int var5 = this.field2405;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var5 + var2; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if (var10 < 128) {
                  if (var10 == 0) {
                     var11 = 65533;
                  } else {
                     var11 = var10;
                  }
               } else if (var10 < 192) {
                  var11 = 65533;
               } else if (var10 < 224) {
                  if (var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if (var11 < 128) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 240) {
                  if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 < 2048) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 248) {
                  if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 >= 65536 && var11 <= 1114111) {
                        var11 = 65533;
                     } else {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else {
                  var11 = 65533;
               }
            }

            String var3 = new String(var6, 0, var7);
            this.field2405 += var2;
            return var3;
         }
      }
   }

   public void method3781(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.field2404[++this.field2405 - 1];
      }

   }

   public int method3782() {
      int var1 = this.field2404[this.field2405] & 255;
      return var1 < 128 ? this.method3983() - 64 : this.method3771() - '쀀';
   }

   public int method3783() {
      int var1 = this.field2404[this.field2405] & 255;
      return var1 < 128 ? this.method3983() : this.method3771() - '耀';
   }

   public int method3784() {
      int var1 = 0;

      int var2;
      for(var2 = this.method3783(); var2 == 32767; var2 = this.method3783()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   public int method3785() {
      return this.field2404[this.field2405] < 0 ? this.method3892() & Integer.MAX_VALUE : this.method3771();
   }

   public int method3898() {
      if (this.field2404[this.field2405] < 0) {
         return this.method3892() & Integer.MAX_VALUE;
      } else {
         int var1 = this.method3771();
         return var1 == 32767 ? -1 : var1;
      }
   }

   public int method3787() {
      byte var1 = this.field2404[++this.field2405 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.field2404[++this.field2405 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public void method3788(int[] var1) {
      int var2 = this.field2405 / 8;
      this.field2405 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3892();
         int var5 = this.method3892();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.field2405 -= 8;
         this.method3921(var4);
         this.method3921(var5);
      }

   }

   public void method3918(int[] var1) {
      int var2 = this.field2405 / 8;
      this.field2405 = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method3892();
         int var5 = this.method3892();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.field2405 -= 8;
         this.method3921(var4);
         this.method3921(var5);
      }

   }

   public void method3790(int[] var1, int var2, int var3) {
      int var4 = this.field2405;
      this.field2405 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3892();
         int var8 = this.method3892();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.field2405 -= 8;
         this.method3921(var7);
         this.method3921(var8);
      }

      this.field2405 = var4;
   }

   public void method3791(int[] var1, int var2, int var3) {
      int var4 = this.field2405;
      this.field2405 = var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method3892();
         int var8 = this.method3892();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.field2405 -= 8;
         this.method3921(var7);
         this.method3921(var8);
      }

      this.field2405 = var4;
   }

   public void method3861(BigInteger var1, BigInteger var2) {
      int var3 = this.field2405;
      this.field2405 = 0;
      byte[] var4 = new byte[var3];
      this.method3781(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field2405 = 0;
      this.method3754(var7.length);
      this.method3763(var7, 0, var7.length);
   }

   public int method3750(int var1) {
      int var2 = class73.method1969(this.field2404, var1, this.field2405);
      this.method3921(var2);
      return var2;
   }

   public boolean method3786() {
      this.field2405 -= 4;
      int var1 = class73.method1969(this.field2404, 0, this.field2405);
      int var2 = this.method3892();
      return var2 == var1;
   }

   public void method3795(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 + 128);
   }

   public void method3796(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(0 - var1);
   }

   public void method3797(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(128 - var1);
   }

   public int method3883() {
      return this.field2404[++this.field2405 - 1] - 128 & 255;
   }

   public int method3799() {
      return 0 - this.field2404[++this.field2405 - 1] & 255;
   }

   public int method3891() {
      return 128 - this.field2404[++this.field2405 - 1] & 255;
   }

   public byte method3968() {
      return (byte)(this.field2404[++this.field2405 - 1] - 128);
   }

   public byte method3802() {
      return (byte)(0 - this.field2404[++this.field2405 - 1]);
   }

   public byte method3803() {
      return (byte)(128 - this.field2404[++this.field2405 - 1]);
   }

   public void method3869(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)var1;
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
   }

   public void method3887(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)(var1 + 128);
   }

   public void method3806(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 + 128);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
   }

   public int method3807() {
      this.field2405 += 2;
      return ((this.field2404[this.field2405 - 1] & 255) << 8) + (this.field2404[this.field2405 - 2] & 255);
   }

   public int method3808() {
      this.field2405 += 2;
      return (this.field2404[this.field2405 - 1] - 128 & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8);
   }

   public int method3792() {
      this.field2405 += 2;
      return ((this.field2404[this.field2405 - 1] & 255) << 8) + (this.field2404[this.field2405 - 2] - 128 & 255);
   }

   public int method3810() {
      this.field2405 += 2;
      int var1 = ((this.field2404[this.field2405 - 1] & 255) << 8) + (this.field2404[this.field2405 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int method3811() {
      this.field2405 += 2;
      int var1 = ((this.field2404[this.field2405 - 1] & 255) << 8) + (this.field2404[this.field2405 - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int method3812() {
      this.field2405 += 3;
      return (this.field2404[this.field2405 - 3] & 255) + ((this.field2404[this.field2405 - 2] & 255) << 8) + ((this.field2404[this.field2405 - 1] & 255) << 16);
   }

   public void method3813(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)var1;
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 16);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 24);
   }

   public void method3893(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
      this.field2404[++this.field2405 - 1] = (byte)var1;
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 24);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 16);
   }

   public void method3939(int var1) {
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 16);
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 24);
      this.field2404[++this.field2405 - 1] = (byte)var1;
      this.field2404[++this.field2405 - 1] = (byte)(var1 >> 8);
   }

   public int method3816() {
      this.field2405 += 4;
      return (this.field2404[this.field2405 - 4] & 255) + ((this.field2404[this.field2405 - 3] & 255) << 8) + ((this.field2404[this.field2405 - 2] & 255) << 16) + ((this.field2404[this.field2405 - 1] & 255) << 24);
   }

   public int method3964() {
      this.field2405 += 4;
      return ((this.field2404[this.field2405 - 2] & 255) << 24) + ((this.field2404[this.field2405 - 4] & 255) << 8) + (this.field2404[this.field2405 - 3] & 255) + ((this.field2404[this.field2405 - 1] & 255) << 16);
   }

   public int method3772() {
      this.field2405 += 4;
      return ((this.field2404[this.field2405 - 1] & 255) << 8) + ((this.field2404[this.field2405 - 4] & 255) << 16) + (this.field2404[this.field2405 - 2] & 255) + ((this.field2404[this.field2405 - 3] & 255) << 24);
   }

   public void method3919(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.field2404[++this.field2405 - 1] - 128);
      }

   }

   static final String method3994(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }
}
