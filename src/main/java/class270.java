public class class270 extends class208 {
   static boolean field3454 = false;
   static class249 field3450;
   static class249 field3452;
   public static class202 field3453 = new class202(4096);
   public static class202 field3457 = new class202(500);
   public static class202 field3455 = new class202(30);
   public static class202 field3473 = new class202(30);
   static class115[] field3494 = new class115[4];
   static class251 field3456;
   public int field3469;
   int[] field3459;
   int[] field3460;
   public String field3461 = "null";
   short[] field3462;
   short[] field3463;
   short[] field3451;
   short[] field3465;
   public int field3501 = 1;
   public int field3475 = 1;
   public int field3495 = 2;
   public boolean field3468 = true;
   public int field3470 = -1;
   int field3488 = -1;
   boolean field3472 = false;
   public boolean field3467 = false;
   public int field3474 = -1;
   public int field3458 = 16;
   int field3476 = 0;
   int field3477 = 0;
   public String[] field3478 = new String[5];
   public int field3479 = -1;
   public int field3466 = -1;
   boolean field3493 = false;
   public boolean field3482 = true;
   int field3483 = 128;
   int field3484 = 128;
   int field3485 = 128;
   int field3486 = 0;
   int field3487 = 0;
   int field3481 = 0;
   public boolean field3489 = false;
   boolean field3490 = false;
   public int field3464 = -1;
   public int[] field3480;
   int field3492 = -1;
   int field3471 = -1;
   public int field3491 = -1;
   public int field3496 = 0;
   public int field3497 = 0;
   public int field3498 = 0;
   public int[] field3499;
   class199 field3500;

   void method5300() {
      if (this.field3470 == -1) {
         this.field3470 = 0;
         if (this.field3459 != null && (this.field3460 == null || this.field3460[0] == 10)) {
            this.field3470 = 1;
         }

         for(int var1 = 0; var1 < 5; ++var1) {
            if (this.field3478[var1] != null) {
               this.field3470 = 1;
            }
         }
      }

      if (this.field3464 == -1) {
         this.field3464 = this.field3495 != 0 ? 1 : 0;
      }

   }

   void method5271(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5272(var1, var2);
      }
   }

   void method5272(class184 var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.method3983();
         if (var3 > 0) {
            if (this.field3459 != null && !field3454) {
               var1.field2405 += var3 * 3;
            } else {
               this.field3460 = new int[var3];
               this.field3459 = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.field3459[var4] = var1.method3771();
                  this.field3460[var4] = var1.method3983();
               }
            }
         }
      } else if (var2 == 2) {
         this.field3461 = var1.method3778();
      } else if (var2 == 5) {
         var3 = var1.method3983();
         if (var3 > 0) {
            if (this.field3459 != null && !field3454) {
               var1.field2405 += var3 * 2;
            } else {
               this.field3460 = null;
               this.field3459 = new int[var3];

               for(var4 = 0; var4 < var3; ++var4) {
                  this.field3459[var4] = var1.method3771();
               }
            }
         }
      } else if (var2 == 14) {
         this.field3501 = var1.method3983();
      } else if (var2 == 15) {
         this.field3475 = var1.method3983();
      } else if (var2 == 17) {
         this.field3495 = 0;
         this.field3468 = false;
      } else if (var2 == 18) {
         this.field3468 = false;
      } else if (var2 == 19) {
         this.field3470 = var1.method3983();
      } else if (var2 == 21) {
         this.field3488 = 0;
      } else if (var2 == 22) {
         this.field3472 = true;
      } else if (var2 == 23) {
         this.field3467 = true;
      } else if (var2 == 24) {
         this.field3474 = var1.method3771();
         if (this.field3474 == 65535) {
            this.field3474 = -1;
         }
      } else if (var2 == 27) {
         this.field3495 = 1;
      } else if (var2 == 28) {
         this.field3458 = var1.method3983();
      } else if (var2 == 29) {
         this.field3476 = var1.method3931();
      } else if (var2 == 39) {
         this.field3477 = var1.method3931() * 25;
      } else if (var2 >= 30 && var2 < 35) {
         this.field3478[var2 - 30] = var1.method3778();
         if (this.field3478[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3478[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         var3 = var1.method3983();
         this.field3462 = new short[var3];
         this.field3463 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3462[var4] = (short)var1.method3771();
            this.field3463[var4] = (short)var1.method3771();
         }
      } else if (var2 == 41) {
         var3 = var1.method3983();
         this.field3451 = new short[var3];
         this.field3465 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3451[var4] = (short)var1.method3771();
            this.field3465[var4] = (short)var1.method3771();
         }
      } else if (var2 == 62) {
         this.field3493 = true;
      } else if (var2 == 64) {
         this.field3482 = false;
      } else if (var2 == 65) {
         this.field3483 = var1.method3771();
      } else if (var2 == 66) {
         this.field3484 = var1.method3771();
      } else if (var2 == 67) {
         this.field3485 = var1.method3771();
      } else if (var2 == 68) {
         this.field3466 = var1.method3771();
      } else if (var2 == 69) {
         var1.method3983();
      } else if (var2 == 70) {
         this.field3486 = var1.method3814();
      } else if (var2 == 71) {
         this.field3487 = var1.method3814();
      } else if (var2 == 72) {
         this.field3481 = var1.method3814();
      } else if (var2 == 73) {
         this.field3489 = true;
      } else if (var2 == 74) {
         this.field3490 = true;
      } else if (var2 == 75) {
         this.field3464 = var1.method3983();
      } else if (var2 != 77 && var2 != 92) {
         if (var2 == 78) {
            this.field3491 = var1.method3771();
            this.field3496 = var1.method3983();
         } else if (var2 == 79) {
            this.field3497 = var1.method3771();
            this.field3498 = var1.method3771();
            this.field3496 = var1.method3983();
            var3 = var1.method3983();
            this.field3499 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3499[var4] = var1.method3771();
            }
         } else if (var2 == 81) {
            this.field3488 = var1.method3983() * 256;
         } else if (var2 == 82) {
            this.field3479 = var1.method3771();
         } else if (var2 == 249) {
            this.field3500 = class226.method4634(var1, this.field3500);
         }
      } else {
         this.field3492 = var1.method3771();
         if (this.field3492 == 65535) {
            this.field3492 = -1;
         }

         this.field3471 = var1.method3771();
         if (this.field3471 == 65535) {
            this.field3471 = -1;
         }

         var3 = -1;
         if (var2 == 92) {
            var3 = var1.method3771();
            if (var3 == 65535) {
               var3 = -1;
            }
         }

         var4 = var1.method3983();
         this.field3480 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field3480[var5] = var1.method3771();
            if (this.field3480[var5] == 65535) {
               this.field3480[var5] = -1;
            }
         }

         this.field3480[var4 + 1] = var3;
      }

   }

   public final boolean method5301(int var1) {
      if (this.field3460 != null) {
         for(int var4 = 0; var4 < this.field3460.length; ++var4) {
            if (this.field3460[var4] == var1) {
               return field3452.method4830(this.field3459[var4] & '\uffff', 0);
            }
         }

         return true;
      } else if (this.field3459 == null) {
         return true;
      } else if (var1 != 10) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3459.length; ++var3) {
            var2 &= field3452.method4830(this.field3459[var3] & '\uffff', 0);
         }

         return var2;
      }
   }

   public final boolean method5274() {
      if (this.field3459 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field3459.length; ++var2) {
            var1 &= field3452.method4830(this.field3459[var2] & '\uffff', 0);
         }

         return var1;
      }
   }

   public final class129 method5288(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field3460 == null) {
         var7 = (long)(var2 + (this.field3469 << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.field3469 << 10));
      }

      Object var9 = (class129)field3455.method4198(var7);
      if (var9 == null) {
         class115 var10 = this.method5278(var1, var2);
         if (var10 == null) {
            return null;
         }

         if (!this.field3472) {
            var9 = var10.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
         } else {
            var10.field1548 = (short)(this.field3476 + 64);
            var10.field1549 = (short)(this.field3477 + 768);
            var10.method2802();
            var9 = var10;
         }

         field3455.method4204((class208)var9, var7);
      }

      if (this.field3472) {
         var9 = ((class115)var9).method2782();
      }

      if (this.field3488 >= 0) {
         if (var9 instanceof class121) {
            var9 = ((class121)var9).method2868(var3, var4, var5, var6, true, this.field3488);
         } else if (var9 instanceof class115) {
            var9 = ((class115)var9).method2791(var3, var4, var5, var6, true, this.field3488);
         }
      }

      return (class129)var9;
   }

   public final class121 method5276(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field3460 == null) {
         var7 = (long)(var2 + (this.field3469 << 10));
      } else {
         var7 = (long)(var2 + (var1 << 3) + (this.field3469 << 10));
      }

      class121 var9 = (class121)field3473.method4198(var7);
      if (var9 == null) {
         class115 var10 = this.method5278(var1, var2);
         if (var10 == null) {
            return null;
         }

         var9 = var10.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
         field3473.method4204(var9, var7);
      }

      if (this.field3488 >= 0) {
         var9 = var9.method2868(var3, var4, var5, var6, true, this.field3488);
      }

      return var9;
   }

   public final class121 method5312(int var1, int var2, int[][] var3, int var4, int var5, int var6, class275 var7, int var8) {
      long var9;
      if (this.field3460 == null) {
         var9 = (long)(var2 + (this.field3469 << 10));
      } else {
         var9 = (long)(var2 + (var1 << 3) + (this.field3469 << 10));
      }

      class121 var11 = (class121)field3473.method4198(var9);
      if (var11 == null) {
         class115 var12 = this.method5278(var1, var2);
         if (var12 == null) {
            return null;
         }

         var11 = var12.method2772(this.field3476 + 64, this.field3477 + 768, -50, -10, -50);
         field3473.method4204(var11, var9);
      }

      if (var7 == null && this.field3488 == -1) {
         return var11;
      } else {
         if (var7 != null) {
            var11 = var7.method5458(var11, var8, var2);
         } else {
            var11 = var11.method2869(true);
         }

         if (this.field3488 >= 0) {
            var11 = var11.method2868(var3, var4, var5, var6, false, this.field3488);
         }

         return var11;
      }
   }

   final class115 method5278(int var1, int var2) {
      class115 var3 = null;
      boolean var4;
      int var5;
      int var7;
      if (this.field3460 == null) {
         if (var1 != 10) {
            return null;
         }

         if (this.field3459 == null) {
            return null;
         }

         var4 = this.field3493;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         var5 = this.field3459.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.field3459[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (class115)field3457.method4198((long)var7);
            if (var3 == null) {
               var3 = class115.method2843(field3452, var7 & '\uffff', 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method2806();
               }

               field3457.method4204(var3, (long)var7);
            }

            if (var5 > 1) {
               field3494[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new class115(field3494, var5);
         }
      } else {
         int var9 = -1;

         for(var5 = 0; var5 < this.field3460.length; ++var5) {
            if (this.field3460[var5] == var1) {
               var9 = var5;
               break;
            }
         }

         if (var9 == -1) {
            return null;
         }

         var5 = this.field3459[var9];
         boolean var10 = this.field3493 ^ var2 > 3;
         if (var10) {
            var5 += 65536;
         }

         var3 = (class115)field3457.method4198((long)var5);
         if (var3 == null) {
            var3 = class115.method2843(field3452, var5 & '\uffff', 0);
            if (var3 == null) {
               return null;
            }

            if (var10) {
               var3.method2806();
            }

            field3457.method4204(var3, (long)var5);
         }
      }

      if (this.field3483 == 128 && this.field3484 == 128 && this.field3485 == 128) {
         var4 = false;
      } else {
         var4 = true;
      }

      boolean var11;
      if (this.field3486 == 0 && this.field3487 == 0 && this.field3481 == 0) {
         var11 = false;
      } else {
         var11 = true;
      }

      class115 var8 = new class115(var3, var2 == 0 && !var4 && !var11, null == this.field3462, null == this.field3451, true);
      if (var1 == 4 && var2 > 3) {
         var8.method2781(256);
         var8.method2827(45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var8.method2804();
      } else if (var2 == 2) {
         var8.method2779();
      } else if (var2 == 3) {
         var8.method2780();
      }

      if (this.field3462 != null) {
         for(var7 = 0; var7 < this.field3462.length; ++var7) {
            var8.method2775(this.field3462[var7], this.field3463[var7]);
         }
      }

      if (this.field3451 != null) {
         for(var7 = 0; var7 < this.field3451.length; ++var7) {
            var8.method2785(this.field3451[var7], this.field3465[var7]);
         }
      }

      if (var4) {
         var8.method2783(this.field3483, this.field3484, this.field3485);
      }

      if (var11) {
         var8.method2827(this.field3486, this.field3487, this.field3481);
      }

      return var8;
   }

   public final class270 method5279() {
      int var1 = -1;
      if (this.field3492 != -1) {
         var1 = class97.method2405(this.field3492);
      } else if (this.field3471 != -1) {
         var1 = class227.field2629[this.field3471];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field3480.length - 1) {
         var2 = this.field3480[var1];
      } else {
         var2 = this.field3480[this.field3480.length - 1];
      }

      return var2 != -1 ? class253.method4993(var2) : null;
   }

   public int method5280(int var1, int var2) {
      return class148.method3363(this.field3500, var1, var2);
   }

   public String method5281(int var1, String var2) {
      return class148.method3369(this.field3500, var1, var2);
   }

   public boolean method5282() {
      if (this.field3480 == null) {
         return this.field3491 != -1 || this.field3499 != null;
      } else {
         for(int var1 = 0; var1 < this.field3480.length; ++var1) {
            if (this.field3480[var1] != -1) {
               class270 var2 = class253.method4993(this.field3480[var1]);
               if (var2.field3491 != -1 || var2.field3499 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
