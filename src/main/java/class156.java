import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class class156 implements Runnable {
   public static String field2017;
   public static String field2013;
   class155 field2014 = null;
   class155 field2012 = null;
   Thread field2016;
   boolean field2015 = false;

   public class156() {
      field2017 = "Unknown";
      field2013 = "1.6";

      try {
         field2017 = System.getProperty("java.vendor");
         field2013 = System.getProperty("java.version");
      } catch (Exception var2) {
         ;
      }

      this.field2015 = false;
      this.field2016 = new Thread(this);
      this.field2016.setPriority(10);
      this.field2016.setDaemon(true);
      this.field2016.start();
   }

   public final void method3429() {
      synchronized(this) {
         this.field2015 = true;
         this.notifyAll();
      }

      try {
         this.field2016.join();
      } catch (InterruptedException var3) {
         ;
      }

   }

   final class155 method3428(int var1, int var2, int var3, Object var4) {
      class155 var5 = new class155();
      var5.field2008 = var1;
      var5.field2009 = var2;
      var5.field2003 = var4;
      synchronized(this) {
         if (this.field2012 != null) {
            this.field2012.field2004 = var5;
            this.field2012 = var5;
         } else {
            this.field2012 = this.field2014 = var5;
         }

         this.notify();
         return var5;
      }
   }

   public final class155 method3426(String var1, int var2) {
      return this.method3428(1, var2, 0, var1);
   }

   public final class155 method3439(Runnable var1, int var2) {
      return this.method3428(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         class155 var1;
         synchronized(this) {
            while(true) {
               if (this.field2015) {
                  return;
               }

               if (this.field2014 != null) {
                  var1 = this.field2014;
                  this.field2014 = this.field2014.field2004;
                  if (this.field2014 == null) {
                     this.field2012 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
                  ;
               }
            }
         }

         try {
            int var5 = var1.field2008;
            if (var5 == 1) {
               var1.field2011 = new Socket(InetAddress.getByName((String)var1.field2003), var1.field2009);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field2003);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field2009);
               var1.field2011 = var3;
            } else if (var5 == 4) {
               var1.field2011 = new DataInputStream(((URL)var1.field2003).openStream());
            }

            var1.field2007 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field2007 = 2;
         }
      }
   }

   static class322 method3443(class249 var0, int var1, int var2) {
      byte[] var4 = var0.method4831(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class125.method3051(var4);
         var3 = true;
      }

      return !var3 ? null : class274.method5439();
   }

   static final void method3442(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class123.field1727 || class164.field2075 != var1) {
         class123.field1727 = var0;
         class164.field2075 = var1;
         class16.method202(25);
         class58.method1132("Loading - please wait.", true);
         int var3 = class49.field490;
         int var4 = class11.field91;
         class49.field490 = (var0 - 6) * 8;
         class11.field91 = (var1 - 6) * 8;
         int var5 = class49.field490 - var3;
         int var6 = class11.field91 - var4;
         var3 = class49.field490;
         var4 = class11.field91;

         int var7;
         int var9;
         for(var7 = 0; var7 < 32768; ++var7) {
            class73 var8 = client.field806[var7];
            if (var8 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var8.field994[var9] -= var5;
                  var8.field952[var9] -= var6;
               }

               var8.field953 -= var5 * 128;
               var8.field999 -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            class61 var21 = client.field698[var7];
            if (var21 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var21.field994[var9] -= var5;
                  var21.field952[var9] -= var6;
               }

               var21.field953 -= var5 * 128;
               var21.field999 -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var18 = 104;
         byte var22 = 1;
         if (var5 < 0) {
            var20 = 103;
            var18 = -1;
            var22 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var13 != var18; var13 += var22) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     client.field829[var17][var13][var14] = client.field829[var17][var15][var16];
                  } else {
                     client.field829[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(class63 var19 = (class63)client.field688.method4298(); var19 != null; var19 = (class63)client.field688.method4283()) {
            var19.field922 -= var5;
            var19.field925 -= var6;
            if (var19.field922 < 0 || var19.field925 < 0 || var19.field922 >= 104 || var19.field925 >= 104) {
               var19.method4271();
            }
         }

         if (client.field722 != 0) {
            client.field722 -= var5;
            client.field875 -= var6;
         }

         client.field905 = 0;
         client.field889 = false;
         class157.field2036 -= var5 << 7;
         class50.field508 -= var6 << 7;
         class9.field68 -= var5 << 7;
         class9.field70 -= var6 << 7;
         client.field661 = -1;
         client.field711.method4275();
         client.field773.method4275();

         for(var14 = 0; var14 < 4; ++var14) {
            client.field701[var14].method3612();
         }

      }
   }
}
