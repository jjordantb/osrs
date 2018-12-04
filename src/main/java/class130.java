import java.io.IOException;

public final class class130 {
   int field1843;
   int field1842;
   int field1849;
   int field1844;
   int field1845;
   public class129 field1846;
   public class129 field1847;
   public long field1848 = 0L;
   int field1841 = 0;

   public static boolean method3241() {
      long var0 = class120.method2866();
      int var2 = (int)(var0 - class252.field3260);
      class252.field3260 = var0;
      if (var2 > 200) {
         var2 = 200;
      }

      class252.field3272 += var2;
      if (class252.field3269 == 0 && class252.field3264 == 0 && class252.field3267 == 0 && class252.field3262 == 0) {
         return true;
      } else if (class252.field3263 == null) {
         return false;
      } else {
         try {
            if (class252.field3272 > 30000) {
               throw new IOException();
            } else {
               class248 var3;
               class184 var4;
               while(class252.field3264 < 200 && class252.field3262 > 0) {
                  var3 = (class248)class252.field3270.method4235();
                  var4 = new class184(4);
                  var4.method3805(1);
                  var4.method3755((int)var3.field2496);
                  class252.field3263.vmethod3578(var4.field2404, 0, 4);
                  class252.field3261.method4226(var3, var3.field2496);
                  --class252.field3262;
                  ++class252.field3264;
               }

               while(class252.field3269 < 200 && class252.field3267 > 0) {
                  var3 = (class248)class252.field3265.method4156();
                  var4 = new class184(4);
                  var4.method3805(0);
                  var4.method3755((int)var3.field2496);
                  class252.field3263.vmethod3578(var4.field2404, 0, 4);
                  var3.method4308();
                  class252.field3268.method4226(var3, var3.field2496);
                  --class252.field3267;
                  ++class252.field3269;
               }

               for(int var15 = 0; var15 < 100; ++var15) {
                  int var16 = class252.field3263.vmethod3553();
                  if (var16 < 0) {
                     throw new IOException();
                  }

                  if (var16 == 0) {
                     break;
                  }

                  class252.field3272 = 0;
                  byte var5 = 0;
                  if (class193.field2460 == null) {
                     var5 = 8;
                  } else if (class252.field3276 == 0) {
                     var5 = 1;
                  }

                  int var6;
                  int var7;
                  int var8;
                  int var10;
                  if (var5 > 0) {
                     var6 = var5 - class252.field3258.field2405;
                     if (var6 > var16) {
                        var6 = var16;
                     }

                     class252.field3263.vmethod3555(class252.field3258.field2404, class252.field3258.field2405, var6);
                     if (class252.field3279 != 0) {
                        for(var7 = 0; var7 < var6; ++var7) {
                           class252.field3258.field2404[var7 + class252.field3258.field2405] ^= class252.field3279;
                        }
                     }

                     class252.field3258.field2405 += var6;
                     if (class252.field3258.field2405 < var5) {
                        break;
                     }

                     if (class193.field2460 == null) {
                        class252.field3258.field2405 = 0;
                        var7 = class252.field3258.method3983();
                        var8 = class252.field3258.method3771();
                        int var9 = class252.field3258.method3983();
                        var10 = class252.field3258.method3892();
                        long var11 = (long)(var8 + (var7 << 16));
                        class248 var13 = (class248)class252.field3261.method4224(var11);
                        class250.field3246 = true;
                        if (var13 == null) {
                           var13 = (class248)class252.field3268.method4224(var11);
                           class250.field3246 = false;
                        }

                        if (var13 == null) {
                           throw new IOException();
                        }

                        int var14 = var9 == 0 ? 5 : 9;
                        class193.field2460 = var13;
                        class252.field3271 = new class184(var10 + var14 + class193.field2460.field3221);
                        class252.field3271.method3805(var9);
                        class252.field3271.method3921(var10);
                        class252.field3276 = 8;
                        class252.field3258.field2405 = 0;
                     } else if (class252.field3276 == 0) {
                        if (class252.field3258.field2404[0] == -1) {
                           class252.field3276 = 1;
                           class252.field3258.field2405 = 0;
                        } else {
                           class193.field2460 = null;
                        }
                     }
                  } else {
                     var6 = class252.field3271.field2404.length - class193.field2460.field3221;
                     var7 = 512 - class252.field3276;
                     if (var7 > var6 - class252.field3271.field2405) {
                        var7 = var6 - class252.field3271.field2405;
                     }

                     if (var7 > var16) {
                        var7 = var16;
                     }

                     class252.field3263.vmethod3555(class252.field3271.field2404, class252.field3271.field2405, var7);
                     if (class252.field3279 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           class252.field3271.field2404[class252.field3271.field2405 + var8] ^= class252.field3279;
                        }
                     }

                     class252.field3271.field2405 += var7;
                     class252.field3276 += var7;
                     if (var6 == class252.field3271.field2405) {
                        if (class193.field2460.field2496 == 16711935L) {
                           class79.field1181 = class252.field3271;

                           for(var8 = 0; var8 < 256; ++var8) {
                              class251 var17 = class252.field3275[var8];
                              if (var17 != null) {
                                 class79.field1181.field2405 = var8 * 8 + 5;
                                 var10 = class79.field1181.method3892();
                                 int var18 = class79.field1181.method3892();
                                 var17.method4942(var10, var18);
                              }
                           }
                        } else {
                           class252.field3274.reset();
                           class252.field3274.update(class252.field3271.field2404, 0, var6);
                           var8 = (int)class252.field3274.getValue();
                           if (var8 != class193.field2460.field3220) {
                              try {
                                 class252.field3263.vmethod3558();
                              } catch (Exception var20) {
                                 ;
                              }

                              ++class252.field3277;
                              class252.field3263 = null;
                              class252.field3279 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class252.field3277 = 0;
                           class252.field3278 = 0;
                           class193.field2460.field3219.method4927((int)(class193.field2460.field2496 & 65535L), class252.field3271.field2404, 16711680L == (class193.field2460.field2496 & 16711680L), class250.field3246);
                        }

                        class193.field2460.method4271();
                        if (class250.field3246) {
                           --class252.field3264;
                        } else {
                           --class252.field3269;
                        }

                        class252.field3276 = 0;
                        class193.field2460 = null;
                        class252.field3271 = null;
                     } else {
                        if (class252.field3276 != 512) {
                           break;
                        }

                        class252.field3276 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var21) {
            try {
               class252.field3263.vmethod3558();
            } catch (Exception var19) {
               ;
            }

            ++class252.field3278;
            class252.field3263 = null;
            return false;
         }
      }
   }
}
