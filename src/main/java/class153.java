import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class153 implements Runnable {
   static class232 field1993;
   Thread field1988;
   InputStream field1986;
   int field1990;
   byte[] field1989;
   int field1987 = 0;
   int field1991 = 0;
   IOException field1992;

   class153(InputStream var1, int var2) {
      this.field1986 = var1;
      this.field1990 = var2 + 1;
      this.field1989 = new byte[this.field1990];
      this.field1988 = new Thread(this);
      this.field1988.setDaemon(true);
      this.field1988.start();
   }

   boolean method3399(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field1990) {
         synchronized(this) {
            int var3;
            if (this.field1987 <= this.field1991) {
               var3 = this.field1991 - this.field1987;
            } else {
               var3 = this.field1990 - this.field1987 + this.field1991;
            }

            if (var3 < var1) {
               if (this.field1992 != null) {
                  throw new IOException(this.field1992.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   int method3397() throws IOException {
      synchronized(this) {
         int var2;
         if (this.field1987 <= this.field1991) {
            var2 = this.field1991 - this.field1987;
         } else {
            var2 = this.field1990 - this.field1987 + this.field1991;
         }

         if (var2 <= 0 && this.field1992 != null) {
            throw new IOException(this.field1992.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   int method3398() throws IOException {
      synchronized(this) {
         if (this.field1991 == this.field1987) {
            if (this.field1992 != null) {
               throw new IOException(this.field1992.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field1989[this.field1987] & 255;
            this.field1987 = (this.field1987 + 1) % this.field1990;
            this.notifyAll();
            return var2;
         }
      }
   }

   int method3407(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.field1987 <= this.field1991) {
               var5 = this.field1991 - this.field1987;
            } else {
               var5 = this.field1990 - this.field1987 + this.field1991;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && this.field1992 != null) {
               throw new IOException(this.field1992.toString());
            } else {
               if (var3 + this.field1987 <= this.field1990) {
                  System.arraycopy(this.field1989, this.field1987, var1, var2, var3);
               } else {
                  int var6 = this.field1990 - this.field1987;
                  System.arraycopy(this.field1989, this.field1987, var1, var2, var6);
                  System.arraycopy(this.field1989, 0, var1, var6 + var2, var3 - var6);
               }

               this.field1987 = (var3 + this.field1987) % this.field1990;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method3405() {
      synchronized(this) {
         if (this.field1992 == null) {
            this.field1992 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field1988.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field1992 != null) {
                  return;
               }

               if (this.field1987 == 0) {
                  var1 = this.field1990 - this.field1991 - 1;
               } else if (this.field1987 <= this.field1991) {
                  var1 = this.field1990 - this.field1991;
               } else {
                  var1 = this.field1987 - this.field1991 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
                  ;
               }
            }
         }

         int var7;
         try {
            var7 = this.field1986.read(this.field1989, this.field1991, var1);
            if (var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field1992 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field1991 = (var7 + this.field1991) % this.field1990;
         }
      }
   }

   static final void method3412(class191 var0) {
      for(int var1 = 0; var1 < class83.field1227; ++var1) {
         int var2 = class83.field1234[var1];
         class61 var3 = client.field698[var2];
         int var4 = var0.method3983();
         if ((var4 & 8) != 0) {
            var4 += var0.method3983() << 8;
         }

         byte var5 = -1;
         int var6;
         int var7;
         int var9;
         int var10;
         int var13;
         if ((var4 & 64) != 0) {
            var6 = var0.method3883();
            int var8;
            int var11;
            int var12;
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method3783();
                  if (var8 == 32767) {
                     var8 = var0.method3783();
                     var10 = var0.method3783();
                     var9 = var0.method3783();
                     var11 = var0.method3783();
                  } else if (var8 != 32766) {
                     var10 = var0.method3783();
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method3783();
                  var3.method1675(var8, var10, var9, var11, client.field655, var12);
               }
            }

            var7 = var0.method3799();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var0.method3783();
                  var10 = var0.method3783();
                  if (var10 != 32767) {
                     var11 = var0.method3783();
                     var12 = var0.method3883();
                     var13 = var10 > 0 ? var0.method3983() : var12;
                     var3.method1677(var9, client.field655, var10, var11, var12, var13);
                  } else {
                     var3.method1663(var9);
                  }
               }
            }
         }

         if ((var4 & 512) != 0) {
            var3.field976 = var0.method3792();
            var6 = var0.method3964();
            var3.field980 = var6 >> 16;
            var3.field979 = (var6 & '\uffff') + client.field655;
            var3.field993 = 0;
            var3.field978 = 0;
            if (var3.field979 > client.field655) {
               var3.field993 = -1;
            }

            if (var3.field976 == 65535) {
               var3.field976 = -1;
            }
         }

         if ((var4 & 4096) != 0) {
            var5 = var0.method3968();
         }

         if ((var4 & 1024) != 0) {
            var3.field983 = var0.method3803();
            var3.field995 = var0.method3968();
            var3.field982 = var0.method3968();
            var3.field984 = var0.method3803();
            var3.field985 = var0.method3808() + client.field655;
            var3.field977 = var0.method3807() + client.field655;
            var3.field997 = var0.method3771();
            if (var3.field631) {
               var3.field983 += var3.field632;
               var3.field995 += var3.field633;
               var3.field982 += var3.field632;
               var3.field984 += var3.field633;
               var3.field939 = 0;
            } else {
               var3.field983 += var3.field994[0];
               var3.field995 += var3.field952[0];
               var3.field982 += var3.field994[0];
               var3.field984 += var3.field952[0];
               var3.field939 = 1;
            }

            var3.field959 = 0;
         }

         if ((var4 & 32) != 0) {
            var3.field968 = var0.method3778();
            if (var3.field968.charAt(0) == '~') {
               var3.field968 = var3.field968.substring(1);
               class59.method1163(2, var3.field625.method5706(), var3.field968);
            } else if (var3 == class69.field1063) {
               class59.method1163(2, var3.field625.method5706(), var3.field968);
            }

            var3.field958 = false;
            var3.field956 = 0;
            var3.field974 = 0;
            var3.field981 = 150;
         }

         if ((var4 & 4) != 0) {
            var3.field967 = var0.method3807();
            if (var3.field939 == 0) {
               var3.field990 = var3.field967;
               var3.field967 = -1;
            }
         }

         if ((var4 & 1) != 0) {
            var6 = var0.method3891();
            byte[] var14 = new byte[var6];
            class184 var15 = new class184(var14);
            var0.method3919(var14, 0, var6);
            class83.field1233[var2] = var15;
            var3.method1172(var15);
         }

         if ((var4 & 2) != 0) {
            var3.field965 = var0.method3808();
            if (var3.field965 == 65535) {
               var3.field965 = -1;
            }
         }

         if ((var4 & 2048) != 0) {
            class83.field1224[var2] = var0.method3968();
         }

         if ((var4 & 16) != 0) {
            var6 = var0.method3808();
            class244 var20 = (class244)class43.method791(class6.method80(), var0.method3983());
            boolean var18 = var0.method3799() == 1;
            var9 = var0.method3983();
            var10 = var0.field2405;
            if (var3.field625 != null && var3.field630 != null) {
               boolean var19 = false;
               if (var20.field3190 && class170.field2150.method1803(var3.field625)) {
                  var19 = true;
               }

               if (!var19 && client.field680 == 0 && !var3.field626) {
                  class83.field1235.field2405 = 0;
                  var0.method3781(class83.field1235.field2404, 0, var9);
                  class83.field1235.field2405 = 0;
                  String var16 = class301.method5797(class235.method4782(class22.method332(class83.field1235)));
                  var3.field968 = var16.trim();
                  var3.field956 = var6 >> 8;
                  var3.field974 = var6 & 255;
                  var3.field981 = 150;
                  var3.field958 = var18;
                  var3.field954 = var3 != class69.field1063 && var20.field3190 && "" != client.field862 && var16.toLowerCase().indexOf(client.field862) == -1;
                  if (var20.field3188) {
                     var13 = var18 ? 91 : 1;
                  } else {
                     var13 = var18 ? 90 : 2;
                  }

                  if (var20.field3185 != -1) {
                     class59.method1163(var13, class19.method243(var20.field3185) + var3.field625.method5706(), var16);
                  } else {
                     class59.method1163(var13, var3.field625.method5706(), var16);
                  }
               }
            }

            var0.field2405 = var10 + var9;
         }

         if ((var4 & 256) != 0) {
            for(var6 = 0; var6 < 3; ++var6) {
               var3.field627[var6] = var0.method3778();
            }
         }

         if ((var4 & 128) != 0) {
            var6 = var0.method3771();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var0.method3983();
            class34.method617(var3, var6, var7);
         }

         if (var3.field631) {
            if (var5 == 127) {
               var3.method1210(var3.field632, var3.field633);
            } else {
               byte var17;
               if (var5 != -1) {
                  var17 = var5;
               } else {
                  var17 = class83.field1224[var2];
               }

               var3.method1180(var3.field632, var3.field633, var17);
            }
         }
      }

   }

   static int method3396(int var0, class86 var1, boolean var2) {
      int var3;
      if (var0 == 5504) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         int var4 = class70.field1070[class60.field600 + 1];
         if (!client.field889) {
            client.field712 = var3;
            client.field658 = var4;
         }

         return 1;
      } else if (var0 == 5505) {
         class70.field1070[++class60.field600 - 1] = client.field712;
         return 1;
      } else if (var0 == 5506) {
         class70.field1070[++class60.field600 - 1] = client.field658;
         return 1;
      } else if (var0 == 5530) {
         var3 = class70.field1070[--class60.field600];
         if (var3 < 0) {
            var3 = 0;
         }

         client.field719 = var3;
         return 1;
      } else if (var0 == 5531) {
         class70.field1070[++class60.field600 - 1] = client.field719;
         return 1;
      } else {
         return 2;
      }
   }
}
