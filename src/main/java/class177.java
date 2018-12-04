import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.Inflater;

public class class177 {
   Inflater field2346;

   public class177() {
      this(-1, 1000000, 1000000);
   }

   class177(int var1, int var2, int var3) {
   }

   public void method3697(class184 var1, byte[] var2) {
      if (var1.field2404[var1.field2405] == 31 && var1.field2404[var1.field2405 + 1] == -117) {
         if (this.field2346 == null) {
            this.field2346 = new Inflater(true);
         }

         try {
            this.field2346.setInput(var1.field2404, var1.field2405 + 10, var1.field2404.length - (var1.field2405 + 8 + 10));
            this.field2346.inflate(var2);
         } catch (Exception var4) {
            this.field2346.reset();
            throw new RuntimeException("");
         }

         this.field2346.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public static void method3696(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method3696(var0, var1, var2, var5 - 1);
         method3696(var0, var1, var5 + 1, var3);
      }

   }

   static final int method3702(int var0, int var1) {
      int var2 = class72.method1958(var0 - 1, var1 - 1) + class72.method1958(1 + var0, var1 - 1) + class72.method1958(var0 - 1, var1 + 1) + class72.method1958(1 + var0, 1 + var1);
      int var3 = class72.method1958(var0 - 1, var1) + class72.method1958(var0 + 1, var1) + class72.method1958(var0, var1 - 1) + class72.method1958(var0, 1 + var1);
      int var4 = class72.method1958(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   static int method3699(int var0, class86 var1, boolean var2) {
      class232 var3 = class18.method213(class70.field1070[--class60.field600]);
      if (var0 == 2500) {
         class70.field1070[++class60.field600 - 1] = var3.field2680;
         return 1;
      } else if (var0 == 2501) {
         class70.field1070[++class60.field600 - 1] = var3.field2772;
         return 1;
      } else if (var0 == 2502) {
         class70.field1070[++class60.field600 - 1] = var3.field2682;
         return 1;
      } else if (var0 == 2503) {
         class70.field1070[++class60.field600 - 1] = var3.field2683;
         return 1;
      } else if (var0 == 2504) {
         class70.field1070[++class60.field600 - 1] = var3.field2704 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         class70.field1070[++class60.field600 - 1] = var3.field2700;
         return 1;
      } else {
         return 2;
      }
   }

   protected static int method3695() {
      int var0 = 0;
      if (class3.field24 == null || !class3.field24.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  class3.field24 = var2;
                  class47.field459 = -1L;
                  class47.field460 = -1L;
               }
            }
         } catch (Throwable var11) {
            ;
         }
      }

      if (class3.field24 != null) {
         long var9 = class120.method2866();
         long var3 = class3.field24.getCollectionTime();
         if (class47.field460 != -1L) {
            long var5 = var3 - class47.field460;
            long var7 = var9 - class47.field459;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         class47.field460 = var3;
         class47.field459 = var9;
      }

      return var0;
   }
}
