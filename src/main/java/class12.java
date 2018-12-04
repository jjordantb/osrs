import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

public class class12 {
   public static final class12 field92 = new class12(2, 0, 4);
   public static final class12 field93 = new class12(1, 1, 2);
   public static final class12 field94 = new class12(0, 2, 0);
   static class251 field99;
   static SecureRandom field100;
   static class323 field98;
   final int field95;
   final int field97;
   final int field96;

   class12(int var1, int var2, int var3) {
      this.field95 = var1;
      this.field97 = var2;
      this.field96 = var3;
   }

   boolean method129(float var1) {
      return var1 >= (float)this.field96;
   }

   static class12[] method122() {
      return new class12[]{field92, field94, field93};
   }

   static class12 method124(int var0) {
      class12[] var1 = method122();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class12 var3 = var1[var2];
         if (var0 == var3.field97) {
            return var3;
         }
      }

      return null;
   }

   public static void method141(class184 var0, int var1) {
      class317 var2 = new class317();
      var2.field3844 = var0.method3983();
      var2.field3845 = var0.method3892();
      var2.field3849 = new int[var2.field3844];
      var2.field3846 = new int[var2.field3844];
      var2.field3847 = new Field[var2.field3844];
      var2.field3848 = new int[var2.field3844];
      var2.field3843 = new Method[var2.field3844];
      var2.field3850 = new byte[var2.field3844][][];

      for(int var3 = 0; var3 < var2.field3844; ++var3) {
         try {
            int var4 = var0.method3983();
            String var5;
            String var6;
            int var7;
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.method3778();
                  var6 = var0.method3778();
                  var7 = var0.method3983();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method3778();
                  }

                  String var20 = var0.method3778();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method3892();
                        var10[var11] = new byte[var12];
                        var0.method3781(var10[var11], 0, var12);
                     }
                  }

                  var2.field3849[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class75.method2000(var8[var12]);
                  }

                  Class var22 = class75.method2000(var20);
                  if (class75.method2000(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class75.method2000(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var21.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if (var21[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var22 == var16.getReturnType()) {
                              var2.field3843[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.field3850[var3] = var10;
               }
            } else {
               var5 = var0.method3778();
               var6 = var0.method3778();
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.method3892();
               }

               var2.field3849[var3] = var4;
               var2.field3848[var3] = var7;
               if (class75.method2000(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.field3847[var3] = class75.method2000(var5).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.field3846[var3] = -1;
         } catch (SecurityException var25) {
            var2.field3846[var3] = -2;
         } catch (NullPointerException var26) {
            var2.field3846[var3] = -3;
         } catch (Exception var27) {
            var2.field3846[var3] = -4;
         } catch (Throwable var28) {
            var2.field3846[var3] = -5;
         }
      }

      class318.field3852.method4269(var2);
   }

   static void method125() {
      class54.field534 = new class204(32);
   }

   static final void method140(class232 var0, int var1) {
      if (var0.field2710 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field2806 == null) {
            var0.field2806 = new int[var0.field2710.length];
         }

         var0.field2806[var1] = Integer.MAX_VALUE;
      }
   }

   static final void method136() {
      int var0 = class27.field266 * 128 + 64;
      int var1 = class180.field2361 * 128 + 64;
      int var2 = class152.method3394(var0, var1, class60.field599) - class138.field1926;
      if (class157.field2036 < var0) {
         class157.field2036 = (var0 - class157.field2036) * class30.field314 / 1000 + class157.field2036 + class170.field2206;
         if (class157.field2036 > var0) {
            class157.field2036 = var0;
         }
      }

      if (class157.field2036 > var0) {
         class157.field2036 -= class30.field314 * (class157.field2036 - var0) / 1000 + class170.field2206;
         if (class157.field2036 < var0) {
            class157.field2036 = var0;
         }
      }

      if (class184.field2409 < var2) {
         class184.field2409 = (var2 - class184.field2409) * class30.field314 / 1000 + class184.field2409 + class170.field2206;
         if (class184.field2409 > var2) {
            class184.field2409 = var2;
         }
      }

      if (class184.field2409 > var2) {
         class184.field2409 -= class30.field314 * (class184.field2409 - var2) / 1000 + class170.field2206;
         if (class184.field2409 < var2) {
            class184.field2409 = var2;
         }
      }

      if (class50.field508 < var1) {
         class50.field508 = (var1 - class50.field508) * class30.field314 / 1000 + class50.field508 + class170.field2206;
         if (class50.field508 > var1) {
            class50.field508 = var1;
         }
      }

      if (class50.field508 > var1) {
         class50.field508 -= class30.field314 * (class50.field508 - var1) / 1000 + class170.field2206;
         if (class50.field508 < var1) {
            class50.field508 = var1;
         }
      }

      var0 = class67.field1027 * 128 + 64;
      var1 = class141.field1939 * 128 + 64;
      var2 = class152.method3394(var0, var1, class60.field599) - class21.field208;
      int var3 = var0 - class157.field2036;
      int var4 = var2 - class184.field2409;
      int var5 = var1 - class50.field508;
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3));
      int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
      int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
      if (var7 < 128) {
         var7 = 128;
      }

      if (var7 > 383) {
         var7 = 383;
      }

      if (class57.field576 < var7) {
         class57.field576 = (var7 - class57.field576) * class253.field3289 / 1000 + class57.field576 + class66.field1026;
         if (class57.field576 > var7) {
            class57.field576 = var7;
         }
      }

      if (class57.field576 > var7) {
         class57.field576 -= class253.field3289 * (class57.field576 - var7) / 1000 + class66.field1026;
         if (class57.field576 < var7) {
            class57.field576 = var7;
         }
      }

      int var9 = var8 - class15.field143;
      if (var9 > 1024) {
         var9 -= 2048;
      }

      if (var9 < -1024) {
         var9 += 2048;
      }

      if (var9 > 0) {
         class15.field143 = var9 * class253.field3289 / 1000 + class15.field143 + class66.field1026;
         class15.field143 &= 2047;
      }

      if (var9 < 0) {
         class15.field143 -= -var9 * class253.field3289 / 1000 + class66.field1026;
         class15.field143 &= 2047;
      }

      int var10 = var8 - class15.field143;
      if (var10 > 1024) {
         var10 -= 2048;
      }

      if (var10 < -1024) {
         var10 += 2048;
      }

      if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
         class15.field143 = var8;
      }

   }

   static boolean method137() {
      return (client.field676 & 1) != 0;
   }

   static void method139() {
      if (client.field718 == 1) {
         client.field726 = true;
      }

   }
}
