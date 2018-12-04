import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class55 {
   static class164 field540;
   static int field552;
   static int[][][] field553;
   static class323 field551;

   public static void method1106(String var0, String var1, int var2, int var3) throws IOException {
      class157.field2024 = var3;
      class157.field2033 = var2;

      try {
         class146.field1954 = System.getProperty("os.name");
      } catch (Exception var29) {
         class146.field1954 = "Unknown";
      }

      class28.field284 = class146.field1954.toLowerCase();

      try {
         class21.field206 = System.getProperty("user.home");
         if (class21.field206 != null) {
            class21.field206 = class21.field206 + "/";
         }
      } catch (Exception var28) {
         ;
      }

      try {
         if (class28.field284.startsWith("win")) {
            if (class21.field206 == null) {
               class21.field206 = System.getenv("USERPROFILE");
            }
         } else if (class21.field206 == null) {
            class21.field206 = System.getenv("HOME");
         }

         if (class21.field206 != null) {
            class21.field206 = class21.field206 + "/";
         }
      } catch (Exception var27) {
         ;
      }

      if (class21.field206 == null) {
         class21.field206 = "~/";
      }

      class229.field2646 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class21.field206, "/tmp/", ""};
      class8.field66 = new String[]{".jagex_cache_" + class157.field2033, ".file_store_" + class157.field2033};
      int var18 = 0;

      label278:
      while(var18 < 4) {
         String var6 = var18 == 0 ? "" : "" + var18;
         class157.field2023 = new File(class21.field206, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
         String var7 = null;
         String var8 = null;
         boolean var9 = false;
         File var36;
         if (class157.field2023.exists()) {
            try {
               class112 var10 = new class112(class157.field2023, "rw", 10000L);

               class184 var11;
               int var12;
               for(var11 = new class184((int)var10.method2719()); var11.field2405 < var11.field2404.length; var11.field2405 += var12) {
                  var12 = var10.method2720(var11.field2404, var11.field2405, var11.field2404.length - var11.field2405);
                  if (var12 == -1) {
                     throw new IOException();
                  }
               }

               var11.field2405 = 0;
               var12 = var11.method3983();
               if (var12 < 1 || var12 > 3) {
                  throw new IOException("" + var12);
               }

               int var13 = 0;
               if (var12 > 1) {
                  var13 = var11.method3983();
               }

               if (var12 <= 2) {
                  var7 = var11.method3779();
                  if (var13 == 1) {
                     var8 = var11.method3779();
                  }
               } else {
                  var7 = var11.method3780();
                  if (var13 == 1) {
                     var8 = var11.method3780();
                  }
               }

               var10.method2717();
            } catch (IOException var32) {
               var32.printStackTrace();
            }

            if (var7 != null) {
               var36 = new File(var7);
               if (!var36.exists()) {
                  var7 = null;
               }
            }

            if (var7 != null) {
               var36 = new File(var7, "test.dat");
               if (!class188.method4014(var36, true)) {
                  var7 = null;
               }
            }
         }

         if (var7 == null && var18 == 0) {
            label253:
            for(int var19 = 0; var19 < class8.field66.length; ++var19) {
               for(int var20 = 0; var20 < class229.field2646.length; ++var20) {
                  File var21 = new File(class229.field2646[var20] + class8.field66[var19] + File.separatorChar + var0 + File.separatorChar);
                  if (var21.exists() && class188.method4014(new File(var21, "test.dat"), true)) {
                     var7 = var21.toString();
                     var9 = true;
                     break label253;
                  }
               }
            }
         }

         if (var7 == null) {
            var7 = class21.field206 + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
            var9 = true;
         }

         if (var8 != null) {
            File var35 = new File(var8);
            var36 = new File(var7);

            try {
               File[] var39 = var35.listFiles();
               File[] var22 = var39;

               for(int var14 = 0; var14 < var22.length; ++var14) {
                  File var15 = var22[var14];
                  File var16 = new File(var36, var15.getName());
                  boolean var17 = var15.renameTo(var16);
                  if (!var17) {
                     throw new IOException();
                  }
               }
            } catch (Exception var31) {
               var31.printStackTrace();
            }

            var9 = true;
         }

         if (var9) {
            class162.method3538(new File(var7), (File)null);
         }

         File var5 = new File(var7);
         class51.field519 = var5;
         if (!class51.field519.exists()) {
            class51.field519.mkdirs();
         }

         File[] var34 = class51.field519.listFiles();
         if (var34 != null) {
            File[] var37 = var34;

            for(int var23 = 0; var23 < var37.length; ++var23) {
               File var24 = var37[var23];
               if (!class188.method4014(var24, false)) {
                  ++var18;
                  continue label278;
               }
            }
         }
         break;
      }

      class142.method3329(class51.field519);

      try {
         File var4 = new File(class21.field206, "random.dat");
         int var26;
         if (var4.exists()) {
            class157.field2038 = new class111(new class112(var4, "rw", 25L), 24, 0);
         } else {
            label206:
            for(int var25 = 0; var25 < class8.field66.length; ++var25) {
               for(var26 = 0; var26 < class229.field2646.length; ++var26) {
                  File var38 = new File(class229.field2646[var26] + class8.field66[var25] + File.separatorChar + "random.dat");
                  if (var38.exists()) {
                     class157.field2038 = new class111(new class112(var38, "rw", 25L), 24, 0);
                     break label206;
                  }
               }
            }
         }

         if (class157.field2038 == null) {
            RandomAccessFile var33 = new RandomAccessFile(var4, "rw");
            var26 = var33.read();
            var33.seek(0L);
            var33.write(var26);
            var33.seek(0L);
            var33.close();
            class157.field2038 = new class111(new class112(var4, "rw", 25L), 24, 0);
         }
      } catch (IOException var30) {
         ;
      }

      class157.field2028 = new class111(new class112(class34.method645("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
      class157.field2029 = new class111(new class112(class34.method645("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
      class157.field2030 = new class111[class157.field2024];

      for(var18 = 0; var18 < class157.field2024; ++var18) {
         class157.field2030[var18] = new class111(new class112(class34.method645("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
      }

   }

   static void method1107(int var0, class228 var1, boolean var2) {
      class20 var3 = class7.method88().method6347(var0);
      int var4 = class69.field1063.field620;
      int var5 = (class69.field1063.field953 >> 7) + class49.field490;
      int var6 = (class69.field1063.field999 >> 7) + class11.field91;
      class228 var7 = new class228(var4, var5, var6);
      class7.method88().method6335(var3, var7, var1, var2);
   }
}
