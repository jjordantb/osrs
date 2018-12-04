import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class112 {
   static String field1496;
   RandomAccessFile field1495;
   long field1494;
   long field1493;

   public class112(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() >= var3) {
         var1.delete();
      }

      this.field1495 = new RandomAccessFile(var1, var2);
      this.field1494 = var3;
      this.field1493 = 0L;
      int var5 = this.field1495.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field1495.seek(0L);
         this.field1495.write(var5);
      }

      this.field1495.seek(0L);
   }

   final void method2718(long var1) throws IOException {
      this.field1495.seek(var1);
      this.field1493 = var1;
   }

   public final void method2716(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field1493 > this.field1494) {
         this.field1495.seek(1L + this.field1494);
         this.field1495.write(1);
         throw new EOFException();
      } else {
         this.field1495.write(var1, var2, var3);
         this.field1493 += (long)var3;
      }
   }

   public final void method2717() throws IOException {
      this.method2740(false);
   }

   public final void method2740(boolean var1) throws IOException {
      if (this.field1495 != null) {
         if (var1) {
            try {
               this.field1495.getFD().sync();
            } catch (SyncFailedException var3) {
               ;
            }
         }

         this.field1495.close();
         this.field1495 = null;
      }

   }

   public final long method2719() throws IOException {
      return this.field1495.length();
   }

   public final int method2720(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field1495.read(var1, var2, var3);
      if (var4 > 0) {
         this.field1493 += (long)var4;
      }

      return var4;
   }

   protected void finalize() throws Throwable {
      if (this.field1495 != null) {
         System.out.println("");
         this.method2717();
      }

   }

   public static void method2723() {
      try {
         class157.field2028.method2682();

         for(int var0 = 0; var0 < class157.field2024; ++var0) {
            class157.field2030[var0].method2682();
         }

         class157.field2029.method2682();
         class157.field2038.method2682();
      } catch (Exception var2) {
         ;
      }

   }
}
