import java.io.EOFException;
import java.io.IOException;

public final class class164 {
   static class158 field2076;
   static byte[] field2074 = new byte[520];
   static int field2073;
   static int field2075;
   class111 field2069 = null;
   class111 field2070 = null;
   int field2068;
   int field2072 = 65000;

   public class164(int var1, class111 var2, class111 var3, int var4) {
      this.field2068 = var1;
      this.field2069 = var2;
      this.field2070 = var3;
      this.field2072 = var4;
   }

   public byte[] method3592(int var1) {
      class111 var2 = this.field2069;
      synchronized(this.field2069) {
         try {
            Object var10000;
            if (this.field2070.method2695() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field2070.method2683((long)(var1 * 6));
               this.field2070.method2686(field2074, 0, 6);
               int var3 = ((field2074[0] & 255) << 16) + (field2074[2] & 255) + ((field2074[1] & 255) << 8);
               int var4 = (field2074[5] & 255) + ((field2074[3] & 255) << 16) + ((field2074[4] & 255) << 8);
               if (var3 < 0 || var3 > this.field2072) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var4 <= 0 || (long)var4 > this.field2069.method2695() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var5 = new byte[var3];
                  int var6 = 0;
                  int var7 = 0;

                  while(var6 < var3) {
                     if (var4 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field2069.method2683((long)(var4 * 520));
                     int var8 = var3 - var6;
                     if (var8 > 512) {
                        var8 = 512;
                     }

                     this.field2069.method2686(field2074, 0, var8 + 8);
                     int var9 = (field2074[1] & 255) + ((field2074[0] & 255) << 8);
                     int var10 = (field2074[3] & 255) + ((field2074[2] & 255) << 8);
                     int var11 = ((field2074[5] & 255) << 8) + ((field2074[4] & 255) << 16) + (field2074[6] & 255);
                     int var12 = field2074[7] & 255;
                     if (var9 == var1 && var10 == var7 && var12 == this.field2068) {
                        if (var11 >= 0 && (long)var11 <= this.field2069.method2695() / 520L) {
                           for(int var13 = 0; var13 < var8; ++var13) {
                              var5[var6++] = field2074[var13 + 8];
                           }

                           var4 = var11;
                           ++var7;
                           continue;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  byte[] var18 = var5;
                  return var18;
               }
            }
         } catch (IOException var16) {
            return null;
         }
      }
   }

   public boolean method3587(int var1, byte[] var2, int var3) {
      class111 var4 = this.field2069;
      synchronized(this.field2069) {
         if (var3 >= 0 && var3 <= this.field2072) {
            boolean var5 = this.method3588(var1, var2, var3, true);
            if (!var5) {
               var5 = this.method3588(var1, var2, var3, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   boolean method3588(int var1, byte[] var2, int var3, boolean var4) {
      class111 var5 = this.field2069;
      synchronized(this.field2069) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.field2070.method2695() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field2070.method2683((long)(var1 * 6));
               this.field2070.method2686(field2074, 0, 6);
               var6 = (field2074[5] & 255) + ((field2074[3] & 255) << 16) + ((field2074[4] & 255) << 8);
               if (var6 <= 0 || (long)var6 > this.field2069.method2695() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field2069.method2695() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            field2074[0] = (byte)(var3 >> 16);
            field2074[1] = (byte)(var3 >> 8);
            field2074[2] = (byte)var3;
            field2074[3] = (byte)(var6 >> 16);
            field2074[4] = (byte)(var6 >> 8);
            field2074[5] = (byte)var6;
            this.field2070.method2683((long)(var1 * 6));
            this.field2070.method2692(field2074, 0, 6);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if (var7 < var3) {
                  label143: {
                     int var9 = 0;
                     int var14;
                     if (var4) {
                        this.field2069.method2683((long)(var6 * 520));

                        try {
                           this.field2069.method2686(field2074, 0, 8);
                        } catch (EOFException var16) {
                           break label143;
                        }

                        var14 = (field2074[1] & 255) + ((field2074[0] & 255) << 8);
                        int var11 = (field2074[3] & 255) + ((field2074[2] & 255) << 8);
                        var9 = ((field2074[5] & 255) << 8) + ((field2074[4] & 255) << 16) + (field2074[6] & 255);
                        int var12 = field2074[7] & 255;
                        if (var14 != var1 || var8 != var11 || var12 != this.field2068) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var9 < 0 || (long)var9 > this.field2069.method2695() / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if (var9 == 0) {
                        var4 = false;
                        var9 = (int)((this.field2069.method2695() + 519L) / 520L);
                        if (var9 == 0) {
                           ++var9;
                        }

                        if (var6 == var9) {
                           ++var9;
                        }
                     }

                     if (var3 - var7 <= 512) {
                        var9 = 0;
                     }

                     field2074[0] = (byte)(var1 >> 8);
                     field2074[1] = (byte)var1;
                     field2074[2] = (byte)(var8 >> 8);
                     field2074[3] = (byte)var8;
                     field2074[4] = (byte)(var9 >> 16);
                     field2074[5] = (byte)(var9 >> 8);
                     field2074[6] = (byte)var9;
                     field2074[7] = (byte)this.field2068;
                     this.field2069.method2683((long)(var6 * 520));
                     this.field2069.method2692(field2074, 0, 8);
                     var14 = var3 - var7;
                     if (var14 > 512) {
                        var14 = 512;
                     }

                     this.field2069.method2692(var2, var7, var14);
                     var7 += var14;
                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }
}
