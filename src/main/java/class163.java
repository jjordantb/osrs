import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class class163 extends class159 implements Runnable {
   static class300 field2066;
   static int field2067;
   InputStream field2055;
   OutputStream field2054;
   Socket field2056;
   boolean field2057 = false;
   class156 field2059;
   class155 field2061;
   byte[] field2062;
   int field2058 = 0;
   int field2060 = 0;
   boolean field2063 = false;
   final int field2064;
   final int field2065;

   public class163(Socket var1, class156 var2, int var3) throws IOException {
      this.field2059 = var2;
      this.field2056 = var1;
      this.field2064 = var3;
      this.field2065 = var3 - 100;
      this.field2056.setSoTimeout(30000);
      this.field2056.setTcpNoDelay(true);
      this.field2056.setReceiveBufferSize(65536);
      this.field2056.setSendBufferSize(65536);
      this.field2055 = this.field2056.getInputStream();
      this.field2054 = this.field2056.getOutputStream();
   }

   public boolean vmethod3554(int var1) throws IOException {
      if (this.field2057) {
         return false;
      } else {
         return this.field2055.available() >= var1;
      }
   }

   public int vmethod3553() throws IOException {
      return this.field2057 ? 0 : this.field2055.available();
   }

   public int vmethod3562() throws IOException {
      return this.field2057 ? 0 : this.field2055.read();
   }

   public int vmethod3555(byte[] var1, int var2, int var3) throws IOException {
      if (this.field2057) {
         return 0;
      } else {
         int var4;
         int var5;
         for(var4 = var3; var3 > 0; var3 -= var5) {
            var5 = this.field2055.read(var1, var2, var3);
            if (var5 <= 0) {
               throw new EOFException();
            }

            var2 += var5;
         }

         return var4;
      }
   }

   public void vmethod3578(byte[] var1, int var2, int var3) throws IOException {
      this.method3556(var1, var2, var3);
   }

   public void vmethod3558() {
      if (!this.field2057) {
         synchronized(this) {
            this.field2057 = true;
            this.notifyAll();
         }

         if (this.field2061 != null) {
            while(this.field2061.field2007 == 0) {
               class272.method5390(1L);
            }

            if (this.field2061.field2007 == 1) {
               try {
                  ((Thread)this.field2061.field2011).join();
               } catch (InterruptedException var3) {
                  ;
               }
            }
         }

         this.field2061 = null;
      }
   }

   void method3556(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field2057) {
         if (this.field2063) {
            this.field2063 = false;
            throw new IOException();
         } else {
            if (this.field2062 == null) {
               this.field2062 = new byte[this.field2064];
            }

            synchronized(this) {
               for(int var5 = 0; var5 < var3; ++var5) {
                  this.field2062[this.field2060] = var1[var5 + var2];
                  this.field2060 = (this.field2060 + 1) % this.field2064;
                  if ((this.field2058 + this.field2065) % this.field2064 == this.field2060) {
                     throw new IOException();
                  }
               }

               if (this.field2061 == null) {
                  this.field2061 = this.field2059.method3439(this, 3);
               }

               this.notifyAll();
            }
         }
      }
   }

   protected void finalize() {
      this.vmethod3558();
   }

   public void run() {
      try {
         while(true) {
            label84: {
               int var1;
               int var2;
               synchronized(this) {
                  if (this.field2060 == this.field2058) {
                     if (this.field2057) {
                        break label84;
                     }

                     try {
                        this.wait();
                     } catch (InterruptedException var10) {
                        ;
                     }
                  }

                  var2 = this.field2058;
                  if (this.field2060 >= this.field2058) {
                     var1 = this.field2060 - this.field2058;
                  } else {
                     var1 = this.field2064 - this.field2058;
                  }
               }

               if (var1 <= 0) {
                  continue;
               }

               try {
                  this.field2054.write(this.field2062, var2, var1);
               } catch (IOException var9) {
                  this.field2063 = true;
               }

               this.field2058 = (var1 + this.field2058) % this.field2064;

               try {
                  if (this.field2058 == this.field2060) {
                     this.field2054.flush();
                  }
               } catch (IOException var8) {
                  this.field2063 = true;
               }
               continue;
            }

            try {
               if (this.field2055 != null) {
                  this.field2055.close();
               }

               if (this.field2054 != null) {
                  this.field2054.close();
               }

               if (this.field2056 != null) {
                  this.field2056.close();
               }
            } catch (IOException var7) {
               ;
            }

            this.field2062 = null;
            break;
         }
      } catch (Exception var12) {
         class80.method2041((String)null, var12);
      }

   }
}
