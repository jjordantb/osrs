import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class class1 {
   static int field12;
   public static Comparator field4 = new class7();
   public static Comparator field3;
   public static Comparator field10;
   public static Comparator field7;
   static class311 field8;
   static int field5;
   static long field6;
   public final List field14;

   static {
      new class0();
      field3 = new class5();
      field10 = new class6();
      field7 = new class3();
   }

   public class1(class184 var1, boolean var2) {
      int var3 = var1.method3771();
      boolean var4 = var1.method3983() == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = var1.method3771();
      this.field14 = new ArrayList(var6);

      for(int var7 = 0; var7 < var6; ++var7) {
         this.field14.add(new class2(var1, var5, var3));
      }

   }

   public void method15(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field14, var1);
      } else {
         Collections.sort(this.field14, Collections.reverseOrder(var1));
      }

   }

   static final void method17(int var0, int var1, int var2, int var3, int var4, int var5, int var6, class127 var7, class166 var8) {
      class270 var9 = class253.method4993(var4);
      int var10;
      int var11;
      if (var5 != 1 && var5 != 3) {
         var10 = var9.field3501;
         var11 = var9.field3475;
      } else {
         var10 = var9.field3475;
         var11 = var9.field3501;
      }

      int var12;
      int var13;
      if (var10 + var2 <= 104) {
         var12 = (var10 >> 1) + var2;
         var13 = var2 + (var10 + 1 >> 1);
      } else {
         var12 = var2;
         var13 = var2 + 1;
      }

      int var14;
      int var15;
      if (var3 + var11 <= 104) {
         var14 = var3 + (var11 >> 1);
         var15 = var3 + (var11 + 1 >> 1);
      } else {
         var14 = var3;
         var15 = var3 + 1;
      }

      int[][] var16 = class50.field506[var1];
      int var17 = var16[var13][var15] + var16[var12][var15] + var16[var12][var14] + var16[var13][var14] >> 2;
      int var18 = (var2 << 7) + (var10 << 6);
      int var19 = (var3 << 7) + (var11 << 6);
      long var20 = class0.method12(var2, var3, 2, var9.field3470 == 0, var4);
      int var22 = (var5 << 6) + var6;
      if (var9.field3464 == 1) {
         var22 += 256;
      }

      Object var23;
      if (var6 == 22) {
         if (var9.field3474 == -1 && var9.field3480 == null) {
            var23 = var9.method5276(22, var5, var16, var18, var17, var19);
         } else {
            var23 = new class87(var4, 22, var5, var1, var2, var3, var9.field3474, true, (class129)null);
         }

         var7.method3063(var0, var2, var3, var17, (class129)var23, var20, var22);
         if (var9.field3495 == 1) {
            var8.method3614(var2, var3);
         }

      } else if (var6 != 10 && var6 != 11) {
         if (var6 >= 12) {
            if (var9.field3474 == -1 && var9.field3480 == null) {
               var23 = var9.method5276(var6, var5, var16, var18, var17, var19);
            } else {
               var23 = new class87(var4, var6, var5, var1, var2, var3, var9.field3474, true, (class129)null);
            }

            var7.method3067(var0, var2, var3, var17, 1, 1, (class129)var23, 0, var20, var22);
            if (var9.field3495 != 0) {
               var8.method3639(var2, var3, var10, var11, var9.field3468);
            }

         } else if (var6 == 0) {
            if (var9.field3474 == -1 && var9.field3480 == null) {
               var23 = var9.method5276(0, var5, var16, var18, var17, var19);
            } else {
               var23 = new class87(var4, 0, var5, var1, var2, var3, var9.field3474, true, (class129)null);
            }

            var7.method3065(var0, var2, var3, var17, (class129)var23, (class129)null, class50.field491[var5], 0, var20, var22);
            if (var9.field3495 != 0) {
               var8.method3613(var2, var3, var6, var5, var9.field3468);
            }

         } else if (var6 == 1) {
            if (var9.field3474 == -1 && var9.field3480 == null) {
               var23 = var9.method5276(1, var5, var16, var18, var17, var19);
            } else {
               var23 = new class87(var4, 1, var5, var1, var2, var3, var9.field3474, true, (class129)null);
            }

            var7.method3065(var0, var2, var3, var17, (class129)var23, (class129)null, class50.field499[var5], 0, var20, var22);
            if (var9.field3495 != 0) {
               var8.method3613(var2, var3, var6, var5, var9.field3468);
            }

         } else {
            int var29;
            if (var6 == 2) {
               var29 = var5 + 1 & 3;
               Object var24;
               Object var25;
               if (var9.field3474 == -1 && var9.field3480 == null) {
                  var24 = var9.method5276(2, var5 + 4, var16, var18, var17, var19);
                  var25 = var9.method5276(2, var29, var16, var18, var17, var19);
               } else {
                  var24 = new class87(var4, 2, var5 + 4, var1, var2, var3, var9.field3474, true, (class129)null);
                  var25 = new class87(var4, 2, var29, var1, var2, var3, var9.field3474, true, (class129)null);
               }

               var7.method3065(var0, var2, var3, var17, (class129)var24, (class129)var25, class50.field491[var5], class50.field491[var29], var20, var22);
               if (var9.field3495 != 0) {
                  var8.method3613(var2, var3, var6, var5, var9.field3468);
               }

            } else if (var6 == 3) {
               if (var9.field3474 == -1 && var9.field3480 == null) {
                  var23 = var9.method5276(3, var5, var16, var18, var17, var19);
               } else {
                  var23 = new class87(var4, 3, var5, var1, var2, var3, var9.field3474, true, (class129)null);
               }

               var7.method3065(var0, var2, var3, var17, (class129)var23, (class129)null, class50.field499[var5], 0, var20, var22);
               if (var9.field3495 != 0) {
                  var8.method3613(var2, var3, var6, var5, var9.field3468);
               }

            } else if (var6 == 9) {
               if (var9.field3474 == -1 && var9.field3480 == null) {
                  var23 = var9.method5276(var6, var5, var16, var18, var17, var19);
               } else {
                  var23 = new class87(var4, var6, var5, var1, var2, var3, var9.field3474, true, (class129)null);
               }

               var7.method3067(var0, var2, var3, var17, 1, 1, (class129)var23, 0, var20, var22);
               if (var9.field3495 != 0) {
                  var8.method3639(var2, var3, var10, var11, var9.field3468);
               }

            } else if (var6 == 4) {
               if (var9.field3474 == -1 && var9.field3480 == null) {
                  var23 = var9.method5276(4, var5, var16, var18, var17, var19);
               } else {
                  var23 = new class87(var4, 4, var5, var1, var2, var3, var9.field3474, true, (class129)null);
               }

               var7.method3066(var0, var2, var3, var17, (class129)var23, (class129)null, class50.field491[var5], 0, 0, 0, var20, var22);
            } else {
               Object var26;
               long var30;
               if (var6 == 5) {
                  var29 = 16;
                  var30 = var7.method3083(var0, var2, var3);
                  if (0L != var30) {
                     var29 = class253.method4993(class56.method1110(var30)).field3458;
                  }

                  if (var9.field3474 == -1 && var9.field3480 == null) {
                     var26 = var9.method5276(4, var5, var16, var18, var17, var19);
                  } else {
                     var26 = new class87(var4, 4, var5, var1, var2, var3, var9.field3474, true, (class129)null);
                  }

                  var7.method3066(var0, var2, var3, var17, (class129)var26, (class129)null, class50.field491[var5], 0, var29 * class50.field497[var5], var29 * class50.field501[var5], var20, var22);
               } else if (var6 == 6) {
                  var29 = 8;
                  var30 = var7.method3083(var0, var2, var3);
                  if (var30 != 0L) {
                     var29 = class253.method4993(class56.method1110(var30)).field3458 / 2;
                  }

                  if (var9.field3474 == -1 && var9.field3480 == null) {
                     var26 = var9.method5276(4, var5 + 4, var16, var18, var17, var19);
                  } else {
                     var26 = new class87(var4, 4, var5 + 4, var1, var2, var3, var9.field3474, true, (class129)null);
                  }

                  var7.method3066(var0, var2, var3, var17, (class129)var26, (class129)null, 256, var5, var29 * class50.field502[var5], var29 * class50.field507[var5], var20, var22);
               } else if (var6 == 7) {
                  int var32 = var5 + 2 & 3;
                  if (var9.field3474 == -1 && var9.field3480 == null) {
                     var23 = var9.method5276(4, var32 + 4, var16, var18, var17, var19);
                  } else {
                     var23 = new class87(var4, 4, var32 + 4, var1, var2, var3, var9.field3474, true, (class129)null);
                  }

                  var7.method3066(var0, var2, var3, var17, (class129)var23, (class129)null, 256, var32, 0, 0, var20, var22);
               } else if (var6 == 8) {
                  var29 = 8;
                  var30 = var7.method3083(var0, var2, var3);
                  if (0L != var30) {
                     var29 = class253.method4993(class56.method1110(var30)).field3458 / 2;
                  }

                  int var28 = var5 + 2 & 3;
                  Object var27;
                  if (var9.field3474 == -1 && var9.field3480 == null) {
                     var26 = var9.method5276(4, var5 + 4, var16, var18, var17, var19);
                     var27 = var9.method5276(4, var28 + 4, var16, var18, var17, var19);
                  } else {
                     var26 = new class87(var4, 4, var5 + 4, var1, var2, var3, var9.field3474, true, (class129)null);
                     var27 = new class87(var4, 4, var28 + 4, var1, var2, var3, var9.field3474, true, (class129)null);
                  }

                  var7.method3066(var0, var2, var3, var17, (class129)var26, (class129)var27, 256, var5, var29 * class50.field502[var5], var29 * class50.field507[var5], var20, var22);
               }
            }
         }
      } else {
         if (var9.field3474 == -1 && var9.field3480 == null) {
            var23 = var9.method5276(10, var5, var16, var18, var17, var19);
         } else {
            var23 = new class87(var4, 10, var5, var1, var2, var3, var9.field3474, true, (class129)null);
         }

         if (var23 != null) {
            var7.method3067(var0, var2, var3, var17, var10, var11, (class129)var23, var6 == 11 ? 256 : 0, var20, var22);
         }

         if (var9.field3495 != 0) {
            var8.method3639(var2, var3, var10, var11, var9.field3468);
         }

      }
   }
}
