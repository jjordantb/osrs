import java.io.File;
import java.io.RandomAccessFile;

public abstract class class188 {
   static boolean field2437 = false;
   static int field2438;

   abstract byte[] vmethod4013();

   abstract void vmethod4022(byte[] var1);

   public static boolean method4026(int var0) {
      return var0 >= class235.field2838.field2839 && var0 <= class235.field2820.field2839;
   }

   static boolean method4014(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }
}
