public class class292 extends class287 {
   static int field3719;
   final class330 field3716;
   int field3718 = 1;
   public class210 field3717 = new class210();

   public class292(class330 var1) {
      super(400);
      this.field3716 = var1;
   }

   class284 vmethod5744() {
      return new class294();
   }

   class284[] vmethod5760(int var1) {
      return new class294[var1];
   }

   public boolean method5692(class293 var1, boolean var2) {
      class294 var3 = (class294)this.method5589(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.field3708 != 0;
      }
   }

   public void method5693(class184 var1, int var2) {
      while(true) {
         if (var1.field2405 < var2) {
            boolean var3 = var1.method3983() == 1;
            class293 var4 = new class293(var1.method3778(), this.field3716);
            class293 var5 = new class293(var1.method3778(), this.field3716);
            int var6 = var1.method3771();
            int var7 = var1.method3983();
            int var8 = var1.method3983();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.method3778();
               var1.method3983();
               var1.method3892();
            }

            var1.method3778();
            if (var4 != null && var4.method5707()) {
               class294 var11 = (class294)this.method5590(var4);
               if (var3) {
                  class294 var12 = (class294)this.method5590(var5);
                  if (var12 != null && var12 != var11) {
                     if (var11 != null) {
                        this.method5641(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.method5591(var11, var4, var5);
                  if (var6 != var11.field3708) {
                     boolean var14 = true;

                     for(class296 var13 = (class296)this.field3717.method4317(); var13 != null; var13 = (class296)this.field3717.method4318()) {
                        if (var13.field3734.equals(var4)) {
                           if (var6 != 0 && var13.field3735 == 0) {
                              var13.method4323();
                              var14 = false;
                           } else if (var6 == 0 && var13.field3735 != 0) {
                              var13.method4323();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.field3717.method4316(new class296(var4, var6));
                     }
                  }
               } else {
                  if (this.method5586() >= 400) {
                     continue;
                  }

                  var11 = (class294)this.method5594(var4, var5);
               }

               if (var6 != var11.field3708) {
                  var11.field3706 = ++this.field3718 - 1;
                  if (var11.field3708 == -1 && var6 == 0) {
                     var11.field3706 = -(var11.field3706 * -602300361) * 845682055;
                  }

                  var11.field3708 = var6;
               }

               var11.field3710 = var7;
               var11.field3723 = var9;
               var11.field3724 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method5601();
         return;
      }
   }

   static int method5695(int var0, class86 var1, boolean var2) {
      boolean var3 = true;
      class232 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class18.method213(class70.field1070[--class60.field600]);
         var3 = false;
      } else {
         var4 = var2 ? class10.field75 : class70.field1080;
      }

      int var11;
      if (var0 == 1300) {
         var11 = class70.field1070[--class60.field600] - 1;
         if (var11 >= 0 && var11 <= 9) {
            var4.method4711(var11, class70.field1065[--class70.field1072]);
            return 1;
         } else {
            --class70.field1072;
            return 1;
         }
      } else {
         int var6;
         if (var0 == 1301) {
            class60.field600 -= 2;
            var11 = class70.field1070[class60.field600];
            var6 = class70.field1070[class60.field600 + 1];
            var4.field2748 = class9.method102(var11, var6);
            return 1;
         } else if (var0 == 1302) {
            var4.field2784 = class70.field1070[--class60.field600] == 1;
            return 1;
         } else if (var0 == 1303) {
            var4.field2749 = class70.field1070[--class60.field600];
            return 1;
         } else if (var0 == 1304) {
            var4.field2799 = class70.field1070[--class60.field600];
            return 1;
         } else if (var0 == 1305) {
            var4.field2697 = class70.field1065[--class70.field1072];
            return 1;
         } else if (var0 == 1306) {
            var4.field2752 = class70.field1065[--class70.field1072];
            return 1;
         } else if (var0 == 1307) {
            var4.field2731 = null;
            return 1;
         } else {
            int var7;
            byte[] var9;
            if (var0 != 1350) {
               byte var5;
               if (var0 == 1351) {
                  class60.field600 -= 2;
                  var5 = 10;
                  var9 = new byte[]{(byte)class70.field1070[class60.field600]};
                  byte[] var10 = new byte[]{(byte)class70.field1070[class60.field600 + 1]};
                  class52.method1071(var4, var5, var9, var10);
                  return 1;
               } else if (var0 == 1352) {
                  class60.field600 -= 3;
                  var11 = class70.field1070[class60.field600] - 1;
                  var6 = class70.field1070[class60.field600 + 1];
                  var7 = class70.field1070[class60.field600 + 2];
                  if (var11 >= 0 && var11 <= 9) {
                     class68.method1798(var4, var11, var6, var7);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var5 = 10;
                  var6 = class70.field1070[--class60.field600];
                  var7 = class70.field1070[--class60.field600];
                  class68.method1798(var4, var5, var6, var7);
                  return 1;
               } else if (var0 == 1354) {
                  --class60.field600;
                  var11 = class70.field1070[class60.field600] - 1;
                  if (var11 >= 0 && var11 <= 9) {
                     class12.method140(var4, var11);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var5 = 10;
                  class12.method140(var4, var5);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var8 = null;
               var9 = null;
               if (var3) {
                  class60.field600 -= 10;

                  for(var7 = 0; var7 < 10 && class70.field1070[var7 + class60.field600] >= 0; var7 += 2) {
                     ;
                  }

                  if (var7 > 0) {
                     var8 = new byte[var7 / 2];
                     var9 = new byte[var7 / 2];

                     for(var7 -= 2; var7 >= 0; var7 -= 2) {
                        var8[var7 / 2] = (byte)class70.field1070[var7 + class60.field600];
                        var9[var7 / 2] = (byte)class70.field1070[var7 + class60.field600 + 1];
                     }
                  }
               } else {
                  class60.field600 -= 2;
                  var8 = new byte[]{(byte)class70.field1070[class60.field600]};
                  var9 = new byte[]{(byte)class70.field1070[class60.field600 + 1]};
               }

               var7 = class70.field1070[--class60.field600] - 1;
               if (var7 >= 0 && var7 <= 9) {
                  class52.method1071(var4, var7, var8, var9);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }
}
