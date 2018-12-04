public class class220 extends class107 {
   class204 field2557 = new class204(128);
   int field2537 = 256;
   int field2538 = 1000000;
   int[] field2551 = new int[16];
   int[] field2536 = new int[16];
   int[] field2541 = new int[16];
   int[] field2542 = new int[16];
   int[] field2539 = new int[16];
   int[] field2544 = new int[16];
   int[] field2543 = new int[16];
   int[] field2552 = new int[16];
   int[] field2558 = new int[16];
   int[] field2548 = new int[16];
   int[] field2545 = new int[16];
   int[] field2550 = new int[16];
   int[] field2540 = new int[16];
   int[] field2553 = new int[16];
   int[] field2546 = new int[16];
   class221[][] field2554 = new class221[16][128];
   class221[][] field2555 = new class221[16][128];
   class222 field2556 = new class222();
   boolean field2547;
   int field2549;
   int field2559;
   long field2560;
   long field2561;
   class224 field2562 = new class224(this);

   public class220() {
      this.method4416();
   }

   public synchronized void method4426(int var1) {
      this.field2537 = var1;
   }

   public int method4403() {
      return this.field2537;
   }

   synchronized boolean method4398(class225 var1, class249 var2, class100 var3, int var4) {
      var1.method4628();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(class215 var7 = (class215)var1.field2619.method4235(); var7 != null; var7 = (class215)var1.field2619.method4229()) {
         int var8 = (int)var7.field2496;
         class223 var9 = (class223)this.field2557.method4224((long)var8);
         if (var9 == null) {
            var9 = class26.method490(var2, var8);
            if (var9 == null) {
               var5 = false;
               continue;
            }

            this.field2557.method4226(var9, (long)var8);
         }

         if (!var9.method4584(var3, var7.field2514, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.method4633();
      }

      return var5;
   }

   synchronized void method4399() {
      for(class223 var1 = (class223)this.field2557.method4235(); var1 != null; var1 = (class223)this.field2557.method4229()) {
         var1.method4585();
      }

   }

   public synchronized void method4476() {
      for(class223 var1 = (class223)this.field2557.method4235(); var1 != null; var1 = (class223)this.field2557.method4229()) {
         var1.method4271();
      }

   }

   protected synchronized class107 vmethod4596() {
      return this.field2562;
   }

   protected synchronized class107 vmethod4598() {
      return null;
   }

   protected synchronized int vmethod4609() {
      return 0;
   }

   protected synchronized void vmethod4620(int[] var1, int var2, int var3) {
      if (this.field2556.method4529()) {
         int var4 = this.field2556.field2588 * this.field2538 / class97.field1377;

         do {
            long var5 = this.field2560 + (long)var4 * (long)var3;
            if (this.field2561 - var5 >= 0L) {
               this.field2560 = var5;
               break;
            }

            int var7 = (int)((this.field2561 - this.field2560 + (long)var4 - 1L) / (long)var4);
            this.field2560 += (long)var7 * (long)var4;
            this.field2562.vmethod4620(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method4435();
         } while(this.field2556.method4529());
      }

      this.field2562.vmethod4620(var1, var2, var3);
   }

   synchronized void method4401(class225 var1, boolean var2) {
      this.method4521();
      this.field2556.method4531(var1.field2620);
      this.field2547 = var2;
      this.field2560 = 0L;
      int var3 = this.field2556.method4572();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2556.method4568(var4);
         this.field2556.method4537(var4);
         this.field2556.method4535(var4);
      }

      this.field2549 = this.field2556.method4573();
      this.field2559 = this.field2556.field2591[this.field2549];
      this.field2561 = this.field2556.method4541(this.field2559);
   }

   protected synchronized void vmethod4601(int var1) {
      if (this.field2556.method4529()) {
         int var2 = this.field2556.field2588 * this.field2538 / class97.field1377;

         do {
            long var3 = this.field2560 + (long)var1 * (long)var2;
            if (this.field2561 - var3 >= 0L) {
               this.field2560 = var3;
               break;
            }

            int var5 = (int)((this.field2561 - this.field2560 + (long)var2 - 1L) / (long)var2);
            this.field2560 += (long)var2 * (long)var5;
            this.field2562.vmethod4601(var5);
            var1 -= var5;
            this.method4435();
         } while(this.field2556.method4529());
      }

      this.field2562.vmethod4601(var1);
   }

   public synchronized void method4521() {
      this.field2556.method4582();
      this.method4416();
   }

   public synchronized boolean method4492() {
      return this.field2556.method4529();
   }

   public synchronized void method4404(int var1, int var2) {
      this.method4483(var1, var2);
   }

   void method4483(int var1, int var2) {
      this.field2542[var1] = var2;
      this.field2544[var1] = var2 & -128;
      this.method4406(var1, var2);
   }

   void method4406(int var1, int var2) {
      if (var2 != this.field2539[var1]) {
         this.field2539[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field2555[var1][var3] = null;
         }
      }

   }

   void method4407(int var1, int var2, int var3) {
      this.method4478(var1, var2, 64);
      if ((this.field2548[var1] & 2) != 0) {
         for(class221 var4 = (class221)this.field2562.field2615.method4274(); var4 != null; var4 = (class221)this.field2562.field2615.method4295()) {
            if (var4.field2585 == var1 && var4.field2577 < 0) {
               this.field2554[var1][var4.field2568] = null;
               this.field2554[var1][var2] = var4;
               int var5 = (var4.field2572 * var4.field2573 >> 12) + var4.field2586;
               var4.field2586 += var2 - var4.field2568 << 8;
               var4.field2572 = var5 - var4.field2586;
               var4.field2573 = 4096;
               var4.field2568 = var2;
               return;
            }
         }
      }

      class223 var9 = (class223)this.field2557.method4224((long)this.field2539[var1]);
      if (var9 != null) {
         class95 var8 = var9.field2602[var2];
         if (var8 != null) {
            class221 var6 = new class221();
            var6.field2585 = var1;
            var6.field2571 = var9;
            var6.field2565 = var8;
            var6.field2566 = var9.field2606[var2];
            var6.field2583 = var9.field2607[var2];
            var6.field2568 = var2;
            var6.field2570 = var3 * var3 * var9.field2604[var2] * var9.field2603 + 1024 >> 11;
            var6.field2569 = var9.field2612[var2] & 255;
            var6.field2586 = (var2 << 8) - (var9.field2601[var2] & 32767);
            var6.field2574 = 0;
            var6.field2575 = 0;
            var6.field2564 = 0;
            var6.field2577 = -1;
            var6.field2578 = 0;
            if (this.field2540[var1] == 0) {
               var6.field2581 = class105.method2469(var8, this.method4421(var6), this.method4422(var6), this.method4423(var6));
            } else {
               var6.field2581 = class105.method2469(var8, this.method4421(var6), 0, this.method4423(var6));
               this.method4408(var6, var9.field2601[var2] < 0);
            }

            if (var9.field2601[var2] < 0) {
               var6.field2581.method2471(-1);
            }

            if (var6.field2583 >= 0) {
               class221 var7 = this.field2555[var1][var6.field2583];
               if (var7 != null && var7.field2577 < 0) {
                  this.field2554[var1][var7.field2568] = null;
                  var7.field2577 = 0;
               }

               this.field2555[var1][var6.field2583] = var6;
            }

            this.field2562.field2615.method4276(var6);
            this.field2554[var1][var2] = var6;
         }
      }
   }

   void method4408(class221 var1, boolean var2) {
      int var3 = var1.field2565.field1345.length;
      int var4;
      if (var2 && var1.field2565.field1344) {
         int var5 = var3 + var3 - var1.field2565.field1346;
         var4 = (int)((long)var5 * (long)this.field2540[var1.field2585] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.field2581.method2478();
         }
      } else {
         var4 = (int)((long)var3 * (long)this.field2540[var1.field2585] >> 6);
      }

      var1.field2581.method2477(var4);
   }

   void method4478(int var1, int var2, int var3) {
      class221 var4 = this.field2554[var1][var2];
      if (var4 != null) {
         this.field2554[var1][var2] = null;
         if ((this.field2548[var1] & 2) != 0) {
            for(class221 var5 = (class221)this.field2562.field2615.method4298(); var5 != null; var5 = (class221)this.field2562.field2615.method4283()) {
               if (var4.field2585 == var5.field2585 && var5.field2577 < 0 && var4 != var5) {
                  var4.field2577 = 0;
                  break;
               }
            }
         } else {
            var4.field2577 = 0;
         }

      }
   }

   void method4410(int var1, int var2, int var3) {
   }

   void method4396(int var1, int var2) {
   }

   void method4412(int var1, int var2) {
      this.field2543[var1] = var2;
   }

   void method4413(int var1) {
      for(class221 var2 = (class221)this.field2562.field2615.method4298(); var2 != null; var2 = (class221)this.field2562.field2615.method4283()) {
         if (var1 < 0 || var2.field2585 == var1) {
            if (var2.field2581 != null) {
               var2.field2581.method2482(class97.field1377 / 100);
               if (var2.field2581.method2486()) {
                  this.field2562.field2617.method2215(var2.field2581);
               }

               var2.method4525();
            }

            if (var2.field2577 < 0) {
               this.field2554[var2.field2585][var2.field2568] = null;
            }

            var2.method4271();
         }
      }

   }

   void method4414(int var1) {
      if (var1 >= 0) {
         this.field2551[var1] = 12800;
         this.field2536[var1] = 8192;
         this.field2541[var1] = 16383;
         this.field2543[var1] = 8192;
         this.field2552[var1] = 0;
         this.field2558[var1] = 8192;
         this.method4417(var1);
         this.method4418(var1);
         this.field2548[var1] = 0;
         this.field2545[var1] = 32767;
         this.field2550[var1] = 256;
         this.field2540[var1] = 0;
         this.method4420(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method4414(var1);
         }

      }
   }

   void method4496(int var1) {
      for(class221 var2 = (class221)this.field2562.field2615.method4298(); var2 != null; var2 = (class221)this.field2562.field2615.method4283()) {
         if ((var1 < 0 || var2.field2585 == var1) && var2.field2577 < 0) {
            this.field2554[var2.field2585][var2.field2568] = null;
            var2.field2577 = 0;
         }
      }

   }

   void method4416() {
      this.method4413(-1);
      this.method4414(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field2539[var1] = this.field2542[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field2544[var1] = this.field2542[var1] & -128;
      }

   }

   void method4417(int var1) {
      if ((this.field2548[var1] & 2) != 0) {
         for(class221 var2 = (class221)this.field2562.field2615.method4298(); var2 != null; var2 = (class221)this.field2562.field2615.method4283()) {
            if (var2.field2585 == var1 && this.field2554[var1][var2.field2568] == null && var2.field2577 < 0) {
               var2.field2577 = 0;
            }
         }
      }

   }

   void method4418(int var1) {
      if ((this.field2548[var1] & 4) != 0) {
         for(class221 var2 = (class221)this.field2562.field2615.method4298(); var2 != null; var2 = (class221)this.field2562.field2615.method4283()) {
            if (var2.field2585 == var1) {
               var2.field2567 = 0;
            }
         }
      }

   }

   void method4471(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method4478(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method4407(var3, var4, var5);
         } else {
            this.method4478(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method4410(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field2544[var3] = (var5 << 14) + (this.field2544[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field2544[var3] = (var5 << 7) + (this.field2544[var3] & -16257);
         }

         if (var4 == 1) {
            this.field2552[var3] = (var5 << 7) + (this.field2552[var3] & -16257);
         }

         if (var4 == 33) {
            this.field2552[var3] = var5 + (this.field2552[var3] & -128);
         }

         if (var4 == 5) {
            this.field2558[var3] = (var5 << 7) + (this.field2558[var3] & -16257);
         }

         if (var4 == 37) {
            this.field2558[var3] = var5 + (this.field2558[var3] & -128);
         }

         if (var4 == 7) {
            this.field2551[var3] = (var5 << 7) + (this.field2551[var3] & -16257);
         }

         if (var4 == 39) {
            this.field2551[var3] = var5 + (this.field2551[var3] & -128);
         }

         if (var4 == 10) {
            this.field2536[var3] = (var5 << 7) + (this.field2536[var3] & -16257);
         }

         if (var4 == 42) {
            this.field2536[var3] = var5 + (this.field2536[var3] & -128);
         }

         if (var4 == 11) {
            this.field2541[var3] = (var5 << 7) + (this.field2541[var3] & -16257);
         }

         if (var4 == 43) {
            this.field2541[var3] = var5 + (this.field2541[var3] & -128);
         }

         if (var4 == 64) {
            if (var5 >= 64) {
               this.field2548[var3] |= 1;
            } else {
               this.field2548[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               this.field2548[var3] |= 2;
            } else {
               this.method4417(var3);
               this.field2548[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field2545[var3] = (var5 << 7) + (this.field2545[var3] & 127);
         }

         if (var4 == 98) {
            this.field2545[var3] = (this.field2545[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field2545[var3] = (var5 << 7) + (this.field2545[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field2545[var3] = (this.field2545[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method4413(var3);
         }

         if (var4 == 121) {
            this.method4414(var3);
         }

         if (var4 == 123) {
            this.method4496(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field2545[var3];
            if (var6 == 16384) {
               this.field2550[var3] = (var5 << 7) + (this.field2550[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field2545[var3];
            if (var6 == 16384) {
               this.field2550[var3] = var5 + (this.field2550[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field2540[var3] = (var5 << 7) + (this.field2540[var3] & -16257);
         }

         if (var4 == 48) {
            this.field2540[var3] = var5 + (this.field2540[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               this.field2548[var3] |= 4;
            } else {
               this.method4418(var3);
               this.field2548[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method4420(var3, (var5 << 7) + (this.field2553[var3] & -16257));
         }

         if (var4 == 49) {
            this.method4420(var3, var5 + (this.field2553[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method4406(var3, var4 + this.field2544[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method4396(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method4412(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method4416();
         }
      }
   }

   void method4420(int var1, int var2) {
      this.field2553[var1] = var2;
      this.field2546[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   int method4421(class221 var1) {
      int var2 = (var1.field2573 * var1.field2572 >> 12) + var1.field2586;
      var2 += (this.field2543[var1.field2585] - 8192) * this.field2550[var1.field2585] >> 12;
      class218 var3 = var1.field2566;
      int var4;
      if (var3.field2523 > 0 && (var3.field2526 > 0 || this.field2552[var1.field2585] > 0)) {
         var4 = var3.field2526 << 2;
         int var5 = var3.field2520 << 1;
         if (var1.field2579 < var5) {
            var4 = var4 * var1.field2579 / var5;
         }

         var4 += this.field2552[var1.field2585] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(var1.field2580 & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(var1.field2565.field1347 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)class97.field1377 + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int method4422(class221 var1) {
      class218 var2 = var1.field2566;
      int var3 = this.field2551[var1.field2585] * this.field2541[var1.field2585] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field2570 + 16384 >> 15;
      var3 = var3 * this.field2537 + 128 >> 8;
      if (var2.field2522 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2522 * 1.953125E-5D * (double)var1.field2574) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field2521 != null) {
         var4 = var1.field2575;
         var5 = var2.field2521[var1.field2564 + 1];
         if (var1.field2564 < var2.field2521.length - 2) {
            var6 = (var2.field2521[var1.field2564] & 255) << 8;
            var7 = (var2.field2521[var1.field2564 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field2521[var1.field2564 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field2577 > 0 && var2.field2524 != null) {
         var4 = var1.field2577;
         var5 = var2.field2524[var1.field2578 + 1];
         if (var1.field2578 < var2.field2524.length - 2) {
            var6 = (var2.field2524[var1.field2578] & 255) << 8;
            var7 = (var2.field2524[var1.field2578 + 2] & 255) << 8;
            var5 += (var2.field2524[var1.field2578 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   int method4423(class221 var1) {
      int var2 = this.field2536[var1.field2585];
      return var2 < 8192 ? var2 * var1.field2569 + 32 >> 6 : 16384 - ((128 - var1.field2569) * (16384 - var2) + 32 >> 6);
   }

   void method4435() {
      int var1 = this.field2549;
      int var2 = this.field2559;

      long var3;
      for(var3 = this.field2561; var2 == this.field2559; var3 = this.field2556.method4541(var2)) {
         while(var2 == this.field2556.field2591[var1]) {
            this.field2556.method4568(var1);
            int var5 = this.field2556.method4538(var1);
            if (var5 == 1) {
               this.field2556.method4536();
               this.field2556.method4535(var1);
               if (this.field2556.method4543()) {
                  if (!this.field2547 || var2 == 0) {
                     this.method4416();
                     this.field2556.method4582();
                     return;
                  }

                  this.field2556.method4534(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method4471(var5);
            }

            this.field2556.method4537(var1);
            this.field2556.method4535(var1);
         }

         var1 = this.field2556.method4573();
         var2 = this.field2556.field2591[var1];
      }

      this.field2549 = var1;
      this.field2559 = var2;
      this.field2561 = var3;
   }

   boolean method4429(class221 var1) {
      if (var1.field2581 == null) {
         if (var1.field2577 >= 0) {
            var1.method4271();
            if (var1.field2583 > 0 && var1 == this.field2555[var1.field2585][var1.field2583]) {
               this.field2555[var1.field2585][var1.field2583] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method4508(class221 var1, int[] var2, int var3, int var4) {
      var1.field2576 = class97.field1377 / 100;
      if (var1.field2577 < 0 || var1.field2581 != null && !var1.field2581.method2485()) {
         int var5 = var1.field2573;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field2558[var1.field2585]) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field2573 = var5;
         }

         var1.field2581.method2480(this.method4421(var1));
         class218 var6 = var1.field2566;
         boolean var7 = false;
         ++var1.field2579;
         var1.field2580 += var6.field2523;
         double var8 = 5.086263020833333E-6D * (double)((var1.field2568 - 60 << 8) + (var1.field2572 * var1.field2573 >> 12));
         if (var6.field2522 > 0) {
            if (var6.field2525 > 0) {
               var1.field2574 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2525 * var8) + 0.5D);
            } else {
               var1.field2574 += 128;
            }
         }

         if (var6.field2521 != null) {
            if (var6.field2528 > 0) {
               var1.field2575 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2528 * var8) + 0.5D);
            } else {
               var1.field2575 += 128;
            }

            while(var1.field2564 < var6.field2521.length - 2 && var1.field2575 > (var6.field2521[var1.field2564 + 2] & 255) << 8) {
               var1.field2564 += 2;
            }

            if (var6.field2521.length - 2 == var1.field2564 && var6.field2521[var1.field2564 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field2577 >= 0 && var6.field2524 != null && (this.field2548[var1.field2585] & 1) == 0 && (var1.field2583 < 0 || var1 != this.field2555[var1.field2585][var1.field2583])) {
            if (var6.field2527 > 0) {
               var1.field2577 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field2527) + 0.5D);
            } else {
               var1.field2577 += 128;
            }

            while(var1.field2578 < var6.field2524.length - 2 && var1.field2577 > (var6.field2524[var1.field2578 + 2] & 255) << 8) {
               var1.field2578 += 2;
            }

            if (var6.field2524.length - 2 == var1.field2578) {
               var7 = true;
            }
         }

         if (var7) {
            var1.field2581.method2482(var1.field2576);
            if (var2 != null) {
               var1.field2581.vmethod4620(var2, var3, var4);
            } else {
               var1.field2581.vmethod4601(var4);
            }

            if (var1.field2581.method2486()) {
               this.field2562.field2617.method2215(var1.field2581);
            }

            var1.method4525();
            if (var1.field2577 >= 0) {
               var1.method4271();
               if (var1.field2583 > 0 && var1 == this.field2555[var1.field2585][var1.field2583]) {
                  this.field2555[var1.field2585][var1.field2583] = null;
               }
            }

            return true;
         } else {
            var1.field2581.method2481(var1.field2576, this.method4422(var1), this.method4423(var1));
            return false;
         }
      } else {
         var1.method4525();
         var1.method4271();
         if (var1.field2583 > 0 && var1 == this.field2555[var1.field2585][var1.field2583]) {
            this.field2555[var1.field2585][var1.field2583] = null;
         }

         return true;
      }
   }

   static void method4522() {
      for(class69 var0 = (class69)class69.field1051.method4298(); var0 != null; var0 = (class69)class69.field1051.method4283()) {
         if (var0.field1061 != null) {
            var0.method1832();
         }
      }

   }

   public static class162 method4523() {
      try {
         return new class151();
      } catch (Throwable var1) {
         return new class152();
      }
   }
}
