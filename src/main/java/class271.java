public class class271 extends class208 {
   static class249 field3506;
   static class202 field3507 = new class202(64);
   static class202 field3508 = new class202(50);
   public static class202 field3546 = new class202(200);
   static int field3543;
   public int field3557;
   int field3558;
   public String field3515 = "null";
   short[] field3513;
   short[] field3514;
   short[] field3538;
   short[] field3516;
   public int field3517 = 2000;
   public int field3524 = 0;
   public int field3519 = 0;
   public int field3520 = 0;
   public int field3521 = 0;
   public int field3522 = 0;
   public int field3523 = 0;
   public int field3544 = 1;
   public boolean field3512 = false;
   public String[] field3526 = new String[]{null, null, "Take", null, null};
   public String[] field3541 = new String[]{null, null, null, null, "Drop"};
   int field3528 = -2;
   int field3529 = -1;
   int field3530 = -1;
   int field3502 = 0;
   int field3532 = -1;
   int field3533 = -1;
   int field3534 = 0;
   int field3535 = -1;
   int field3536 = -1;
   int field3556 = -1;
   int field3554 = -1;
   int field3539 = -1;
   int field3545 = -1;
   int[] field3553;
   int[] field3542;
   public int field3549 = -1;
   public int field3552 = -1;
   int field3525 = 128;
   int field3537 = 128;
   int field3547 = 128;
   public int field3548 = 0;
   public int field3531 = 0;
   public int field3540 = 0;
   class199 field3551;
   public boolean field3509 = false;
   int field3511 = -1;
   int field3518 = -1;
   public int field3555 = -1;
   public int field3510 = -1;

   void method5322() {
   }

   void method5375(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5324(var1, var2);
      }
   }

   void method5324(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3558 = var1.method3771();
      } else if (var2 == 2) {
         this.field3515 = var1.method3778();
      } else if (var2 == 4) {
         this.field3517 = var1.method3771();
      } else if (var2 == 5) {
         this.field3524 = var1.method3771();
      } else if (var2 == 6) {
         this.field3519 = var1.method3771();
      } else if (var2 == 7) {
         this.field3521 = var1.method3771();
         if (this.field3521 > 32767) {
            this.field3521 -= 65536;
         }
      } else if (var2 == 8) {
         this.field3522 = var1.method3771();
         if (this.field3522 > 32767) {
            this.field3522 -= 65536;
         }
      } else if (var2 == 11) {
         this.field3523 = 1;
      } else if (var2 == 12) {
         this.field3544 = var1.method3892();
      } else if (var2 == 16) {
         this.field3512 = true;
      } else if (var2 == 23) {
         this.field3529 = var1.method3771();
         this.field3502 = var1.method3983();
      } else if (var2 == 24) {
         this.field3530 = var1.method3771();
      } else if (var2 == 25) {
         this.field3532 = var1.method3771();
         this.field3534 = var1.method3983();
      } else if (var2 == 26) {
         this.field3533 = var1.method3771();
      } else if (var2 >= 30 && var2 < 35) {
         this.field3526[var2 - 30] = var1.method3778();
         if (this.field3526[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.field3526[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field3541[var2 - 35] = var1.method3778();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.method3983();
            this.field3513 = new short[var3];
            this.field3514 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3513[var4] = (short)var1.method3771();
               this.field3514[var4] = (short)var1.method3771();
            }
         } else if (var2 == 41) {
            var3 = var1.method3983();
            this.field3538 = new short[var3];
            this.field3516 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field3538[var4] = (short)var1.method3771();
               this.field3516[var4] = (short)var1.method3771();
            }
         } else if (var2 == 42) {
            this.field3528 = var1.method3931();
         } else if (var2 == 65) {
            this.field3509 = true;
         } else if (var2 == 78) {
            this.field3535 = var1.method3771();
         } else if (var2 == 79) {
            this.field3536 = var1.method3771();
         } else if (var2 == 90) {
            this.field3556 = var1.method3771();
         } else if (var2 == 91) {
            this.field3539 = var1.method3771();
         } else if (var2 == 92) {
            this.field3554 = var1.method3771();
         } else if (var2 == 93) {
            this.field3545 = var1.method3771();
         } else if (var2 == 95) {
            this.field3520 = var1.method3771();
         } else if (var2 == 97) {
            this.field3549 = var1.method3771();
         } else if (var2 == 98) {
            this.field3552 = var1.method3771();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field3553 == null) {
               this.field3553 = new int[10];
               this.field3542 = new int[10];
            }

            this.field3553[var2 - 100] = var1.method3771();
            this.field3542[var2 - 100] = var1.method3771();
         } else if (var2 == 110) {
            this.field3525 = var1.method3771();
         } else if (var2 == 111) {
            this.field3537 = var1.method3771();
         } else if (var2 == 112) {
            this.field3547 = var1.method3771();
         } else if (var2 == 113) {
            this.field3548 = var1.method3931();
         } else if (var2 == 114) {
            this.field3531 = var1.method3931() * 5;
         } else if (var2 == 115) {
            this.field3540 = var1.method3983();
         } else if (var2 == 139) {
            this.field3511 = var1.method3771();
         } else if (var2 == 140) {
            this.field3518 = var1.method3771();
         } else if (var2 == 148) {
            this.field3555 = var1.method3771();
         } else if (var2 == 149) {
            this.field3510 = var1.method3771();
         } else if (var2 == 249) {
            this.field3551 = class226.method4634(var1, this.field3551);
         }
      }

   }

   void method5325(class271 var1, class271 var2) {
      this.field3558 = var1.field3558;
      this.field3517 = var1.field3517;
      this.field3524 = var1.field3524;
      this.field3519 = var1.field3519;
      this.field3520 = var1.field3520;
      this.field3521 = var1.field3521;
      this.field3522 = var1.field3522;
      this.field3513 = var1.field3513;
      this.field3514 = var1.field3514;
      this.field3538 = var1.field3538;
      this.field3516 = var1.field3516;
      this.field3515 = var2.field3515;
      this.field3512 = var2.field3512;
      this.field3544 = var2.field3544;
      this.field3523 = 1;
   }

   void method5338(class271 var1, class271 var2) {
      this.field3558 = var1.field3558;
      this.field3517 = var1.field3517;
      this.field3524 = var1.field3524;
      this.field3519 = var1.field3519;
      this.field3520 = var1.field3520;
      this.field3521 = var1.field3521;
      this.field3522 = var1.field3522;
      this.field3513 = var2.field3513;
      this.field3514 = var2.field3514;
      this.field3538 = var2.field3538;
      this.field3516 = var2.field3516;
      this.field3515 = var2.field3515;
      this.field3512 = var2.field3512;
      this.field3523 = var2.field3523;
      this.field3529 = var2.field3529;
      this.field3530 = var2.field3530;
      this.field3535 = var2.field3535;
      this.field3532 = var2.field3532;
      this.field3533 = var2.field3533;
      this.field3536 = var2.field3536;
      this.field3556 = var2.field3556;
      this.field3554 = var2.field3554;
      this.field3539 = var2.field3539;
      this.field3545 = var2.field3545;
      this.field3540 = var2.field3540;
      this.field3526 = var2.field3526;
      this.field3541 = new String[5];
      if (var2.field3541 != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.field3541[var3] = var2.field3541[var3];
         }
      }

      this.field3541[4] = "Discard";
      this.field3544 = 0;
   }

   void method5327(class271 var1, class271 var2) {
      this.field3558 = var1.field3558;
      this.field3517 = var1.field3517;
      this.field3524 = var1.field3524;
      this.field3519 = var1.field3519;
      this.field3520 = var1.field3520;
      this.field3521 = var1.field3521;
      this.field3522 = var1.field3522;
      this.field3513 = var1.field3513;
      this.field3514 = var1.field3514;
      this.field3538 = var1.field3538;
      this.field3516 = var1.field3516;
      this.field3523 = var1.field3523;
      this.field3515 = var2.field3515;
      this.field3544 = 0;
      this.field3512 = false;
      this.field3509 = false;
   }

   public final class115 method5381(int var1) {
      int var3;
      if (this.field3553 != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.field3542[var3] && this.field3542[var3] != 0) {
               var2 = this.field3553[var3];
            }
         }

         if (var2 != -1) {
            return class84.method2125(var2).method5381(1);
         }
      }

      class115 var4 = class115.method2843(class4.field32, this.field3558, 0);
      if (var4 == null) {
         return null;
      } else {
         if (this.field3525 != 128 || this.field3537 != 128 || this.field3547 != 128) {
            var4.method2783(this.field3525, this.field3537, this.field3547);
         }

         if (this.field3513 != null) {
            for(var3 = 0; var3 < this.field3513.length; ++var3) {
               var4.method2775(this.field3513[var3], this.field3514[var3]);
            }
         }

         if (this.field3538 != null) {
            for(var3 = 0; var3 < this.field3538.length; ++var3) {
               var4.method2785(this.field3538[var3], this.field3516[var3]);
            }
         }

         return var4;
      }
   }

   public final class121 method5350(int var1) {
      if (this.field3553 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.field3542[var3] && this.field3542[var3] != 0) {
               var2 = this.field3553[var3];
            }
         }

         if (var2 != -1) {
            return class84.method2125(var2).method5350(1);
         }
      }

      class121 var5 = (class121)field3508.method4198((long)this.field3557);
      if (var5 != null) {
         return var5;
      } else {
         class115 var6 = class115.method2843(class4.field32, this.field3558, 0);
         if (var6 == null) {
            return null;
         } else {
            if (this.field3525 != 128 || this.field3537 != 128 || this.field3547 != 128) {
               var6.method2783(this.field3525, this.field3537, this.field3547);
            }

            int var4;
            if (this.field3513 != null) {
               for(var4 = 0; var4 < this.field3513.length; ++var4) {
                  var6.method2775(this.field3513[var4], this.field3514[var4]);
               }
            }

            if (this.field3538 != null) {
               for(var4 = 0; var4 < this.field3538.length; ++var4) {
                  var6.method2785(this.field3538[var4], this.field3516[var4]);
               }
            }

            var5 = var6.method2772(this.field3548 + 64, this.field3531 + 768, -50, -10, -50);
            var5.field1664 = true;
            field3508.method4204(var5, (long)this.field3557);
            return var5;
         }
      }
   }

   public class271 method5373(int var1) {
      if (this.field3553 != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if (var1 >= this.field3542[var3] && this.field3542[var3] != 0) {
               var2 = this.field3553[var3];
            }
         }

         if (var2 != -1) {
            return class84.method2125(var2);
         }
      }

      return this;
   }

   public final boolean method5331(boolean var1) {
      int var2 = this.field3529;
      int var3 = this.field3530;
      int var4 = this.field3535;
      if (var1) {
         var2 = this.field3532;
         var3 = this.field3533;
         var4 = this.field3536;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!class4.field32.method4830(var2, 0)) {
            var5 = false;
         }

         if (var3 != -1 && !class4.field32.method4830(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class4.field32.method4830(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class115 method5332(boolean var1) {
      int var2 = this.field3529;
      int var3 = this.field3530;
      int var4 = this.field3535;
      if (var1) {
         var2 = this.field3532;
         var3 = this.field3533;
         var4 = this.field3536;
      }

      if (var2 == -1) {
         return null;
      } else {
         class115 var5 = class115.method2843(class4.field32, var2, 0);
         if (var3 != -1) {
            class115 var6 = class115.method2843(class4.field32, var3, 0);
            if (var4 != -1) {
               class115 var7 = class115.method2843(class4.field32, var4, 0);
               class115[] var8 = new class115[]{var5, var6, var7};
               var5 = new class115(var8, 3);
            } else {
               class115[] var10 = new class115[]{var5, var6};
               var5 = new class115(var10, 2);
            }
         }

         if (!var1 && this.field3502 != 0) {
            var5.method2827(0, this.field3502, 0);
         }

         if (var1 && this.field3534 != 0) {
            var5.method2827(0, this.field3534, 0);
         }

         int var9;
         if (this.field3513 != null) {
            for(var9 = 0; var9 < this.field3513.length; ++var9) {
               var5.method2775(this.field3513[var9], this.field3514[var9]);
            }
         }

         if (this.field3538 != null) {
            for(var9 = 0; var9 < this.field3538.length; ++var9) {
               var5.method2785(this.field3538[var9], this.field3516[var9]);
            }
         }

         return var5;
      }
   }

   public final boolean method5333(boolean var1) {
      int var2 = this.field3556;
      int var3 = this.field3554;
      if (var1) {
         var2 = this.field3539;
         var3 = this.field3545;
      }

      if (var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if (!class4.field32.method4830(var2, 0)) {
            var4 = false;
         }

         if (var3 != -1 && !class4.field32.method4830(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   public final class115 method5365(boolean var1) {
      int var2 = this.field3556;
      int var3 = this.field3554;
      if (var1) {
         var2 = this.field3539;
         var3 = this.field3545;
      }

      if (var2 == -1) {
         return null;
      } else {
         class115 var4 = class115.method2843(class4.field32, var2, 0);
         if (var3 != -1) {
            class115 var5 = class115.method2843(class4.field32, var3, 0);
            class115[] var6 = new class115[]{var4, var5};
            var4 = new class115(var6, 2);
         }

         int var7;
         if (this.field3513 != null) {
            for(var7 = 0; var7 < this.field3513.length; ++var7) {
               var4.method2775(this.field3513[var7], this.field3514[var7]);
            }
         }

         if (this.field3538 != null) {
            for(var7 = 0; var7 < this.field3538.length; ++var7) {
               var4.method2785(this.field3538[var7], this.field3516[var7]);
            }
         }

         return var4;
      }
   }

   public int method5360(int var1, int var2) {
      return class148.method3363(this.field3551, var1, var2);
   }

   public String method5335(int var1, String var2) {
      return class148.method3369(this.field3551, var1, var2);
   }

   public int method5336() {
      if (this.field3528 != -1 && this.field3541 != null) {
         if (this.field3528 >= 0) {
            return this.field3541[this.field3528] != null ? this.field3528 : -1;
         } else {
            return "Drop".equalsIgnoreCase(this.field3541[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }
}
