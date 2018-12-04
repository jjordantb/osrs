import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class23 {
   static class203 field235 = new class203(37748736, 256);
   static class203 field232 = new class203(256, 256);
   static final class228 field240 = new class228();
   int field233;
   int field234;
   class10 field236;
   LinkedList field230;
   int field237;
   int field238;
   List field239;
   HashMap field241;
   final HashMap field231;

   class23(int var1, int var2, int var3, HashMap var4) {
      this.field233 = var1;
      this.field234 = var2;
      this.field230 = new LinkedList();
      this.field239 = new LinkedList();
      this.field241 = new HashMap();
      this.field237 = var3 | -16777216;
      this.field231 = var4;
   }

   void method336(int var1, int var2, int var3) {
      int var5 = this.field233;
      int var6 = this.field234;
      int var7 = this.field238;
      class203 var8 = field235;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      class323 var4 = (class323)var8.method4214(var9);
      if (var4 != null) {
         if (var3 == this.field238 * 64) {
            var4.method6184(var1, var2);
         } else {
            var4.method6174(var1, var2, var3, var3);
         }

      }
   }

   void method337(class10 var1, List var2) {
      this.field241.clear();
      this.field236 = var1;
      this.method339(0, 0, 64, 64, this.field236);
      this.method340(var2);
   }

   void method446(HashSet var1, List var2) {
      this.field241.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class34 var4 = (class34)var3.next();
         if (var4.method204() == this.field233 && var4.method180() == this.field234) {
            this.field230.add(var4);
            this.method339(var4.method621() * 8, var4.method622() * 8, 8, 8, var4);
         }
      }

      this.method340(var2);
   }

   void method339(int var1, int var2, int var3, int var4, class16 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label56:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            class228 var8 = new class228(0, var6, var7);

            for(int var9 = 0; var9 < var5.field148; ++var9) {
               class19[] var10 = var5.field156[var9][var6][var7];
               if (var10 != null && var10.length != 0) {
                  class19[] var11 = var10;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     class19 var13 = var11[var12];
                     class257 var14 = this.method434(var13.field184);
                     if (var14 != null) {
                        class228 var15 = new class228(var9, this.field233 * 64 + var6, this.field234 * 64 + var7);
                        class228 var16 = null;
                        if (this.field236 != null) {
                           var16 = new class228(this.field236.field150 + var9, var6 + this.field236.field146 * 64, var7 + this.field236.field151 * 64);
                        } else {
                           class34 var17 = (class34)var5;
                           var16 = new class228(var9 + var17.field150, var17.field146 * 64 + var6 + var17.method627() * 8, var7 + var17.field151 * 64 + var17.method620() * 8);
                        }

                        class28 var18 = new class28(var14.field3313, var16, var15, this.method384(var14));
                        this.field241.put(var8, var18);
                        continue label56;
                     }
                  }
               }
            }
         }
      }

   }

   void method340(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class13 var3 = (class13)var2.next();
         if (var3.field109.field2632 >> 6 == this.field233 && var3.field109.field2633 >> 6 == this.field234) {
            class28 var4 = new class28(var3.field108, var3.field109, var3.field109, this.method369(var3.field108));
            this.field239.add(var4);
         }
      }

   }

   void method341(int var1, class35 var2, class23[] var3, class322[] var4) {
      this.field238 = var1;
      if (this.field236 != null || !this.field230.isEmpty()) {
         int var6 = this.field233;
         int var7 = this.field234;
         class203 var8 = field235;
         long var9 = (long)(var1 << 16 | var6 << 8 | var7);
         class323 var5 = (class323)var8.method4214(var9);
         if (var5 == null) {
            class21 var12 = this.method349(this.field233, this.field234, var3);
            class323 var11 = new class323(this.field238 * 64, this.field238 * 64);
            var11.method6155();
            if (this.field236 != null) {
               this.method395(var2, var3, var4, var12);
            } else {
               this.method360(var2, var4, var12);
            }

            class10.method114(var11, this.field233, this.field234, this.field238);
         }
      }
   }

   void method416(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method357(var1, var2, var4, var3);
      this.method363(var1, var2, var4, var3);
   }

   void method343(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field241.values().iterator();

      while(var4.hasNext()) {
         class28 var5 = (class28)var4.next();
         if (var1.contains(var5.field285)) {
            class257 var6 = class162.method3533(var5.field285);
            this.method359(var6, var5.field276, var5.field283, var2, var3);
         }
      }

      this.method358(var1, var2, var3);
   }

   void method395(class35 var1, class23[] var2, class322[] var3, class21 var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method467(var5, var6, this.field236, var1, var4);
            this.method344(var5, var6, this.field236, var1);
         }
      }

      for(var5 = 0; var5 < 64; ++var5) {
         for(var6 = 0; var6 < 64; ++var6) {
            this.method346(var5, var6, this.field236, var1, var3);
         }
      }

   }

   void method360(class35 var1, class322[] var2, class21 var3) {
      Iterator var4 = this.field230.iterator();

      class34 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class34)var4.next();

         for(var6 = var5.method621() * 8; var6 < var5.method621() * 8 + 8; ++var6) {
            for(var7 = var5.method622() * 8; var7 < var5.method622() * 8 + 8; ++var7) {
               this.method467(var6, var7, var5, var1, var3);
               this.method344(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field230.iterator();

      while(var4.hasNext()) {
         var5 = (class34)var4.next();

         for(var6 = var5.method621() * 8; var6 < var5.method621() * 8 + 8; ++var6) {
            for(var7 = var5.method622() * 8; var7 < var5.method622() * 8 + 8; ++var7) {
               this.method346(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   void method346(int var1, int var2, class16 var3, class35 var4, class322[] var5) {
      this.method356(var1, var2, var3);
      this.method355(var1, var2, var3, var5);
   }

   void method467(int var1, int var2, class16 var3, class35 var4, class21 var5) {
      int var6 = var3.field152[0][var1][var2] - 1;
      int var7 = var3.field153[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238, this.field238, this.field237);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = this.field237;
         class274 var11 = class218.method4369(var7);
         if (var11 == null) {
            var9 = var10;
         } else if (var11.field3606 >= 0) {
            var9 = var11.field3606 | -16777216;
         } else if (var11.field3604 >= 0) {
            int var12 = class123.method2974(class124.field1752.vmethod3247(var11.field3604), 96);
            var9 = class124.field1749[var12] | -16777216;
         } else if (var11.field3603 == 16711935) {
            var9 = var10;
         } else {
            int var13 = var11.field3607;
            int var14 = var11.field3608;
            int var15 = var11.field3610;
            if (var15 > 179) {
               var14 /= 2;
            }

            if (var15 > 192) {
               var14 /= 2;
            }

            if (var15 > 217) {
               var14 /= 2;
            }

            if (var15 > 243) {
               var14 /= 2;
            }

            int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
            int var17 = class123.method2974(var16, 96);
            var9 = class124.field1749[var17] | -16777216;
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field154[0][var1][var2] == 0) {
         class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238, this.field238, var8);
      } else {
         var9 = this.method354(var1, var2, var3, var5);
         if (var7 == -1) {
            class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238, this.field238, var9);
         } else {
            var4.method690(this.field238 * var1, this.field238 * (63 - var2), var9, var8, this.field238, this.field238, var3.field154[0][var1][var2], var3.field155[0][var1][var2]);
         }
      }
   }

   void method344(int var1, int var2, class16 var3, class35 var4) {
      for(int var5 = 1; var5 < var3.field148; ++var5) {
         int var6 = var3.field153[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = class65.method1683(var6, this.field237);
            if (var3.field154[var5][var1][var2] == 0) {
               class319.method6047(this.field238 * var1, this.field238 * (63 - var2), this.field238, this.field238, var7);
            } else {
               var4.method690(this.field238 * var1, this.field238 * (63 - var2), 0, var7, this.field238, this.field238, var3.field154[var5][var1][var2], var3.field155[var5][var1][var2]);
            }
         }
      }

   }

   class21 method349(int var1, int var2, class23[] var3) {
      class203 var5 = field232;
      long var6 = (long)(0 | var1 << 8 | var2);
      class21 var4 = (class21)var5.method4214(var6);
      class21 var11 = var4;
      if (var4 == null) {
         var11 = this.method469(var3);
         class203 var10 = field232;
         long var8 = (long)(0 | var1 << 8 | var2);
         var10.method4212(var11, var8);
      }

      return var11;
   }

   class21 method469(class23[] var1) {
      class32 var2 = new class32(64, 64);
      if (this.field236 != null) {
         this.method352(0, 0, 64, 64, this.field236, var2);
      } else {
         Iterator var3 = this.field230.iterator();

         while(var3.hasNext()) {
            class34 var4 = (class34)var3.next();
            this.method352(var4.method621() * 8, var4.method622() * 8, 8, 8, var4, var2);
         }
      }

      this.method351(var1, var2);
      class21 var5 = new class21();
      var5.method320(var2);
      return var5;
   }

   void method351(class23[] var1, class32 var2) {
      class242[] var3 = new class242[]{class242.field3166, class242.field3172, class242.field3162, class242.field3168, class242.field3169, class242.field3164, class242.field3163, class242.field3167};
      class242[] var5 = var3;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         class242 var7 = var5[var6];
         if (var1[var7.vmethod6130()] != null) {
            byte var8 = 0;
            byte var9 = 0;
            byte var10 = 64;
            byte var11 = 64;
            byte var12 = 0;
            byte var13 = 0;
            switch(var7.field3170) {
            case 0:
               var13 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 1:
               var8 = 59;
               var10 = 5;
               break;
            case 2:
               var12 = 59;
               var10 = 5;
               break;
            case 3:
               var12 = 59;
               var13 = 59;
               var10 = 5;
               var11 = 5;
               break;
            case 4:
               var13 = 59;
               var11 = 5;
               break;
            case 5:
               var9 = 59;
               var11 = 5;
               break;
            case 6:
               var9 = 59;
               var11 = 5;
               var8 = 59;
               var10 = 5;
               break;
            case 7:
               var9 = 59;
               var11 = 5;
               var12 = 59;
               var10 = 5;
            }

            this.method353(var12, var13, var8, var9, var10, var11, var1[var7.vmethod6130()], var2);
         }
      }

   }

   void method352(int var1, int var2, int var3, int var4, class16 var5, class32 var6) {
      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         for(int var8 = var2; var8 < var2 + var4; ++var8) {
            int var9 = var5.field152[0][var7][var8] - 1;
            if (var9 != -1) {
               class261 var10 = class24.method474(var9);
               var6.method602(var7, var8, 5, var10);
            }
         }
      }

   }

   void method353(int var1, int var2, int var3, int var4, int var5, int var6, class23 var7, class32 var8) {
      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var6; ++var10) {
            int var11 = var7.method374(var9 + var1, var10 + var2);
            if (var11 != -1) {
               class261 var12 = class24.method474(var11);
               var8.method602(var3 + var9, var10 + var4, 5, var12);
            }
         }
      }

   }

   int method354(int var1, int var2, class16 var3, class21 var4) {
      return var3.field152[0][var1][var2] == 0 ? this.field237 : var4.method321(var1, var2);
   }

   void method355(int var1, int var2, class16 var3, class322[] var4) {
      for(int var5 = 0; var5 < var3.field148; ++var5) {
         class19[] var6 = var3.field156[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class19[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class19 var9 = var7[var8];
               if (class188.method4026(var9.field179) || class150.method3373(var9.field179)) {
                  class270 var10 = class253.method4993(var9.field184);
                  if (var10.field3466 != -1) {
                     if (var10.field3466 != 46 && var10.field3466 != 52) {
                        var4[var10.field3466].method6138(this.field238 * var1, this.field238 * (63 - var2), this.field238 * 2, this.field238 * 2);
                     } else {
                        var4[var10.field3466].method6138(this.field238 * var1, this.field238 * (63 - var2), this.field238 * 2 + 1, this.field238 * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   void method356(int var1, int var2, class16 var3) {
      for(int var4 = 0; var4 < var3.field148; ++var4) {
         class19[] var5 = var3.field156[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            class19[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class19 var8 = var6[var7];
               int var10 = var8.field179;
               boolean var9 = var10 >= class235.field2833.field2839 && var10 <= class235.field2841.field2839 || var10 == class235.field2818.field2839;
               if (var9) {
                  class270 var11 = class253.method4993(var8.field184);
                  int var12 = var11.field3470 != 0 ? -3407872 : -3355444;
                  if (var8.field179 == class235.field2833.field2839) {
                     this.method429(var1, var2, var8.field180, var12);
                  }

                  if (var8.field179 == class235.field2830.field2839) {
                     this.method429(var1, var2, var8.field180, -3355444);
                     this.method429(var1, var2, var8.field180 + 1, var12);
                  }

                  if (var8.field179 == class235.field2841.field2839) {
                     if (var8.field180 == 0) {
                        class319.method6098(this.field238 * var1, this.field238 * (63 - var2), 1, var12);
                     }

                     if (var8.field180 == 1) {
                        class319.method6098(this.field238 * var1 + this.field238 - 1, this.field238 * (63 - var2), 1, var12);
                     }

                     if (var8.field180 == 2) {
                        class319.method6098(this.field238 + this.field238 * var1 - 1, this.field238 * (63 - var2) + this.field238 - 1, 1, var12);
                     }

                     if (var8.field180 == 3) {
                        class319.method6098(this.field238 * var1, this.field238 * (63 - var2) + this.field238 - 1, 1, var12);
                     }
                  }

                  if (var8.field179 == class235.field2818.field2839) {
                     int var13 = var8.field180 % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.field238; ++var14) {
                           class319.method6098(var14 + this.field238 * var1, (64 - var2) * this.field238 - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < this.field238; ++var14) {
                           class319.method6098(var14 + this.field238 * var1, var14 + this.field238 * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void method357(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field241.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class228 var9 = (class228)var8.getKey();
         int var10 = (int)((float)var9.field2632 * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.field2633 - var6);
         class28 var12 = (class28)var8.getValue();
         if (var12 != null) {
            var12.field276 = var10;
            var12.field283 = var11;
            class257 var13 = class162.method3533(var12.field285);
            if (!var3.contains(var13.method5046())) {
               this.method471(var12, var10, var11, var5);
            }
         }
      }

   }

   void method358(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field239.iterator();

      while(var4.hasNext()) {
         class28 var5 = (class28)var4.next();
         class257 var6 = class162.method3533(var5.field285);
         if (var6 != null && var1.contains(var6.method5046())) {
            this.method359(var6, var5.field276, var5.field283, var2, var3);
         }
      }

   }

   void method359(class257 var1, int var2, int var3, int var4, int var5) {
      class323 var6 = var1.method5064(false);
      if (var6 != null) {
         var6.method6164(var2 - var6.field3879 / 2, var3 - var6.field3887 / 2);
         if (var4 % var5 < var5 / 2) {
            class319.method6095(var2, var3, 15, 16776960, 128);
            class319.method6095(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void method471(class28 var1, int var2, int var3, float var4) {
      class257 var5 = class162.method3533(var1.field285);
      this.method382(var5, var2, var3);
      this.method370(var1, var5, var2, var3, var4);
   }

   void method382(class257 var1, int var2, int var3) {
      class323 var4 = var1.method5064(false);
      if (var4 != null) {
         int var5 = this.method366(var4, var1.field3324);
         int var6 = this.method367(var4, var1.field3328);
         var4.method6164(var5 + var2, var3 + var6);
      }

   }

   void method370(class28 var1, class257 var2, int var3, int var4, float var5) {
      if (var1.field278 != null) {
         if (var1.field278.field216.method129(var5)) {
            class300 var6 = (class300)this.field231.get(var1.field278.field216);
            var6.method5792(var1.field278.field223, var3 - var1.field278.field214 / 2, var4, var1.field278.field214, var1.field278.field215, -16777216 | var2.field3327, 0, 1, 0, var6.field3765 / 2);
         }
      }
   }

   void method363(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field239.iterator();

      while(var6.hasNext()) {
         class28 var7 = (class28)var6.next();
         int var8 = var7.field277.field2632 % 64;
         int var9 = var7.field277.field2633 % 64;
         var7.field276 = (int)(var5 * (float)var8 + (float)var1);
         var7.field283 = (int)(var5 * (float)(63 - var9) + (float)var2);
         if (!var3.contains(var7.field285)) {
            this.method471(var7, var7.field276, var7.field283, var5);
         }
      }

   }

   void method436() {
      if (this.field236 != null) {
         for(int var1 = 0; var1 < 64; ++var1) {
            for(int var2 = 0; var2 < 64; ++var2) {
               this.method347(var1, var2, this.field236);
            }
         }
      } else {
         Iterator var5 = this.field230.iterator();

         while(var5.hasNext()) {
            class34 var6 = (class34)var5.next();

            for(int var3 = var6.method621() * 8; var3 < var6.method621() * 8 + 8; ++var3) {
               for(int var4 = var6.method622() * 8; var4 < var6.method622() * 8 + 8; ++var4) {
                  this.method347(var3, var4, var6);
               }
            }
         }
      }

   }

   void method347(int var1, int var2, class16 var3) {
      field240.method4644(0, var1, var2);

      for(int var4 = 0; var4 < var3.field148; ++var4) {
         class19[] var5 = var3.field156[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            class19[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class19 var8 = var6[var7];
               class257 var9 = this.method434(var8.field184);
               if (var9 != null) {
                  class28 var10 = (class28)this.field241.get(field240);
                  if (var10 != null) {
                     if (var10.field285 != var9.field3313) {
                        class28 var16 = new class28(var9.field3313, var10.field279, var10.field277, this.method384(var9));
                        this.field241.put(new class228(field240), var16);
                        var10 = var16;
                     }

                     int var15 = var10.field279.field2634 - var10.field277.field2634;
                     var10.field277.field2634 = var4;
                     var10.field279.field2634 = var15 + var4;
                     return;
                  }

                  class228 var11 = new class228(var4, this.field233 * 64 + var1, this.field234 * 64 + var2);
                  class228 var12 = null;
                  if (this.field236 != null) {
                     var12 = new class228(this.field236.field150 + var4, this.field236.field146 * 64 + var1, var2 + this.field236.field151 * 64);
                  } else {
                     Iterator var13 = this.field230.iterator();

                     while(var13.hasNext()) {
                        class34 var14 = (class34)var13.next();
                        if (var14.method618(var1, var2)) {
                           var12 = new class228(var4 + var14.field150, var14.field146 * 64 + var1 + var14.method627() * 8, var14.field151 * 64 + var2 + var14.method620() * 8);
                           break;
                        }
                     }
                  }

                  if (var12 != null) {
                     var10 = new class28(var9.field3313, var12, var11, this.method384(var9));
                     this.field241.put(new class228(field240), var10);
                     return;
                  }
               }
            }
         }
      }

      this.field241.remove(field240);
   }

   int method366(class323 var1, class272 var2) {
      switch(var2.field3562) {
      case 0:
         return 0;
      case 1:
         return -var1.field3879 / 2;
      default:
         return -var1.field3879;
      }
   }

   int method367(class323 var1, class254 var2) {
      switch(var2.field3292) {
      case 1:
         return -var1.field3887 / 2;
      case 2:
         return 0;
      default:
         return -var1.field3887;
      }
   }

   class257 method434(int var1) {
      class270 var2 = class253.method4993(var1);
      if (var2.field3480 != null) {
         var2 = var2.method5279();
         if (var2 == null) {
            return null;
         }
      }

      return var2.field3479 != -1 ? class162.method3533(var2.field3479) : null;
   }

   class22 method369(int var1) {
      class257 var2 = class162.method3533(var1);
      return this.method384(var2);
   }

   class22 method384(class257 var1) {
      if (var1.field3316 != null && this.field231 != null && this.field231.get(class12.field92) != null) {
         class12 var2 = class12.method124(var1.field3318);
         if (var2 == null) {
            return null;
         } else {
            class300 var3 = (class300)this.field231.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.method5796(var1.field3316, 1000000);
               String[] var5 = new String[var4];
               var3.method5794(var1.field3316, (int[])null, var5);
               int var6 = var5.length * var3.field3765 / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method5793(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new class22(var1.field3316, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   List method371(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field241.values().iterator();

            class28 var8;
            while(var7.hasNext()) {
               var8 = (class28)var7.next();
               if (var8.method523(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field239.iterator();

            while(var7.hasNext()) {
               var8 = (class28)var7.next();
               if (var8.method523(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   List method406() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field239);
      var1.addAll(this.field241.values());
      return var1;
   }

   void method429(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class319.method6054(this.field238 * var1, this.field238 * (63 - var2), this.field238, var4);
      }

      if (var3 == 1) {
         class319.method6098(this.field238 * var1, this.field238 * (63 - var2), this.field238, var4);
      }

      if (var3 == 2) {
         class319.method6054(this.field238 + this.field238 * var1 - 1, this.field238 * (63 - var2), this.field238, var4);
      }

      if (var3 == 3) {
         class319.method6098(this.field238 * var1, this.field238 * (63 - var2) + this.field238 - 1, this.field238, var4);
      }

   }

   int method374(int var1, int var2) {
      if (this.field236 != null) {
         return this.field236.method184(var1, var2);
      } else {
         if (!this.field230.isEmpty()) {
            Iterator var3 = this.field230.iterator();

            while(var3.hasNext()) {
               class34 var4 = (class34)var3.next();
               if (var4.method618(var1, var2)) {
                  return var4.method184(var1, var2);
               }
            }
         }

         return -1;
      }
   }

   public static void method342() {
      class193.field2461.method4521();
      class219.field2529 = 1;
      class137.field1911 = null;
   }

   static final void method381(int var0, int var1, int var2, int var3, int var4, int var5, class127 var6, class166 var7) {
      if (!client.field648 || (class50.field492[0][var1][var2] & 2) != 0 || (class50.field492[var0][var1][var2] & 16) == 0) {
         if (var0 < class50.field493) {
            class50.field493 = var0;
         }

         class270 var8 = class253.method4993(var3);
         int var9;
         int var10;
         if (var4 != 1 && var4 != 3) {
            var9 = var8.field3501;
            var10 = var8.field3475;
         } else {
            var9 = var8.field3475;
            var10 = var8.field3501;
         }

         int var11;
         int var12;
         if (var9 + var1 <= 104) {
            var11 = (var9 >> 1) + var1;
            var12 = (var9 + 1 >> 1) + var1;
         } else {
            var11 = var1;
            var12 = var1 + 1;
         }

         int var13;
         int var14;
         if (var10 + var2 <= 104) {
            var13 = (var10 >> 1) + var2;
            var14 = var2 + (var10 + 1 >> 1);
         } else {
            var13 = var2;
            var14 = var2 + 1;
         }

         int[][] var15 = class50.field506[var0];
         int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var1 << 7) + (var9 << 6);
         int var18 = (var2 << 7) + (var10 << 6);
         long var19 = class0.method12(var1, var2, 2, var8.field3470 == 0, var3);
         int var21 = var5 + (var4 << 6);
         if (var8.field3464 == 1) {
            var21 += 256;
         }

         int var23;
         int var24;
         if (var8.method5282()) {
            class69 var22 = new class69();
            var22.field1048 = var0;
            var22.field1049 = var1 * 128;
            var22.field1059 = var2 * 128;
            var23 = var8.field3501;
            var24 = var8.field3475;
            if (var4 == 1 || var4 == 3) {
               var23 = var8.field3475;
               var24 = var8.field3501;
            }

            var22.field1062 = (var23 + var1) * 128;
            var22.field1052 = (var24 + var2) * 128;
            var22.field1054 = var8.field3491;
            var22.field1053 = var8.field3496 * 128;
            var22.field1056 = var8.field3497;
            var22.field1057 = var8.field3498;
            var22.field1058 = var8.field3499;
            if (var8.field3480 != null) {
               var22.field1061 = var8;
               var22.method1832();
            }

            class69.field1051.method4276(var22);
            if (var22.field1058 != null) {
               var22.field1055 = var22.field1056 + (int)(Math.random() * (double)(var22.field1057 - var22.field1056));
            }
         }

         Object var34;
         if (var5 == 22) {
            if (!client.field648 || var8.field3470 != 0 || var8.field3495 == 1 || var8.field3489) {
               if (var8.field3474 == -1 && var8.field3480 == null) {
                  var34 = var8.method5288(22, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class87(var3, 22, var4, var0, var1, var2, var8.field3474, true, (class129)null);
               }

               var6.method3063(var0, var1, var2, var16, (class129)var34, var19, var21);
               if (var8.field3495 == 1 && var7 != null) {
                  var7.method3614(var1, var2);
               }

            }
         } else if (var5 != 10 && var5 != 11) {
            if (var5 >= 12) {
               if (var8.field3474 == -1 && var8.field3480 == null) {
                  var34 = var8.method5288(var5, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class87(var3, var5, var4, var0, var1, var2, var8.field3474, true, (class129)null);
               }

               var6.method3067(var0, var1, var2, var16, 1, 1, (class129)var34, 0, var19, var21);
               if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                  class55.field553[var0][var1][var2] |= 2340;
               }

               if (var8.field3495 != 0 && var7 != null) {
                  var7.method3639(var1, var2, var9, var10, var8.field3468);
               }

            } else if (var5 == 0) {
               if (var8.field3474 == -1 && var8.field3480 == null) {
                  var34 = var8.method5288(0, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class87(var3, 0, var4, var0, var1, var2, var8.field3474, true, (class129)null);
               }

               var6.method3065(var0, var1, var2, var16, (class129)var34, (class129)null, class50.field491[var4], 0, var19, var21);
               if (var4 == 0) {
                  if (var8.field3482) {
                     class50.field503[var0][var1][var2] = 50;
                     class50.field503[var0][var1][var2 + 1] = 50;
                  }

                  if (var8.field3467) {
                     class55.field553[var0][var1][var2] |= 585;
                  }
               } else if (var4 == 1) {
                  if (var8.field3482) {
                     class50.field503[var0][var1][var2 + 1] = 50;
                     class50.field503[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.field3467) {
                     class55.field553[var0][var1][var2 + 1] |= 1170;
                  }
               } else if (var4 == 2) {
                  if (var8.field3482) {
                     class50.field503[var0][var1 + 1][var2] = 50;
                     class50.field503[var0][var1 + 1][var2 + 1] = 50;
                  }

                  if (var8.field3467) {
                     class55.field553[var0][var1 + 1][var2] |= 585;
                  }
               } else if (var4 == 3) {
                  if (var8.field3482) {
                     class50.field503[var0][var1][var2] = 50;
                     class50.field503[var0][var1 + 1][var2] = 50;
                  }

                  if (var8.field3467) {
                     class55.field553[var0][var1][var2] |= 1170;
                  }
               }

               if (var8.field3495 != 0 && var7 != null) {
                  var7.method3613(var1, var2, var5, var4, var8.field3468);
               }

               if (var8.field3458 != 16) {
                  var6.method3073(var0, var1, var2, var8.field3458);
               }

            } else if (var5 == 1) {
               if (var8.field3474 == -1 && var8.field3480 == null) {
                  var34 = var8.method5288(1, var4, var15, var17, var16, var18);
               } else {
                  var34 = new class87(var3, 1, var4, var0, var1, var2, var8.field3474, true, (class129)null);
               }

               var6.method3065(var0, var1, var2, var16, (class129)var34, (class129)null, class50.field499[var4], 0, var19, var21);
               if (var8.field3482) {
                  if (var4 == 0) {
                     class50.field503[var0][var1][var2 + 1] = 50;
                  } else if (var4 == 1) {
                     class50.field503[var0][var1 + 1][var2 + 1] = 50;
                  } else if (var4 == 2) {
                     class50.field503[var0][var1 + 1][var2] = 50;
                  } else if (var4 == 3) {
                     class50.field503[var0][var1][var2] = 50;
                  }
               }

               if (var8.field3495 != 0 && var7 != null) {
                  var7.method3613(var1, var2, var5, var4, var8.field3468);
               }

            } else {
               int var28;
               if (var5 == 2) {
                  var28 = var4 + 1 & 3;
                  Object var29;
                  Object var30;
                  if (var8.field3474 == -1 && var8.field3480 == null) {
                     var29 = var8.method5288(2, var4 + 4, var15, var17, var16, var18);
                     var30 = var8.method5288(2, var28, var15, var17, var16, var18);
                  } else {
                     var29 = new class87(var3, 2, var4 + 4, var0, var1, var2, var8.field3474, true, (class129)null);
                     var30 = new class87(var3, 2, var28, var0, var1, var2, var8.field3474, true, (class129)null);
                  }

                  var6.method3065(var0, var1, var2, var16, (class129)var29, (class129)var30, class50.field491[var4], class50.field491[var28], var19, var21);
                  if (var8.field3467) {
                     if (var4 == 0) {
                        class55.field553[var0][var1][var2] |= 585;
                        class55.field553[var0][var1][1 + var2] |= 1170;
                     } else if (var4 == 1) {
                        class55.field553[var0][var1][var2 + 1] |= 1170;
                        class55.field553[var0][var1 + 1][var2] |= 585;
                     } else if (var4 == 2) {
                        class55.field553[var0][var1 + 1][var2] |= 585;
                        class55.field553[var0][var1][var2] |= 1170;
                     } else if (var4 == 3) {
                        class55.field553[var0][var1][var2] |= 1170;
                        class55.field553[var0][var1][var2] |= 585;
                     }
                  }

                  if (var8.field3495 != 0 && var7 != null) {
                     var7.method3613(var1, var2, var5, var4, var8.field3468);
                  }

                  if (var8.field3458 != 16) {
                     var6.method3073(var0, var1, var2, var8.field3458);
                  }

               } else if (var5 == 3) {
                  if (var8.field3474 == -1 && var8.field3480 == null) {
                     var34 = var8.method5288(3, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class87(var3, 3, var4, var0, var1, var2, var8.field3474, true, (class129)null);
                  }

                  var6.method3065(var0, var1, var2, var16, (class129)var34, (class129)null, class50.field499[var4], 0, var19, var21);
                  if (var8.field3482) {
                     if (var4 == 0) {
                        class50.field503[var0][var1][var2 + 1] = 50;
                     } else if (var4 == 1) {
                        class50.field503[var0][var1 + 1][var2 + 1] = 50;
                     } else if (var4 == 2) {
                        class50.field503[var0][var1 + 1][var2] = 50;
                     } else if (var4 == 3) {
                        class50.field503[var0][var1][var2] = 50;
                     }
                  }

                  if (var8.field3495 != 0 && var7 != null) {
                     var7.method3613(var1, var2, var5, var4, var8.field3468);
                  }

               } else if (var5 == 9) {
                  if (var8.field3474 == -1 && var8.field3480 == null) {
                     var34 = var8.method5288(var5, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class87(var3, var5, var4, var0, var1, var2, var8.field3474, true, (class129)null);
                  }

                  var6.method3067(var0, var1, var2, var16, 1, 1, (class129)var34, 0, var19, var21);
                  if (var8.field3495 != 0 && var7 != null) {
                     var7.method3639(var1, var2, var9, var10, var8.field3468);
                  }

                  if (var8.field3458 != 16) {
                     var6.method3073(var0, var1, var2, var8.field3458);
                  }

               } else if (var5 == 4) {
                  if (var8.field3474 == -1 && var8.field3480 == null) {
                     var34 = var8.method5288(4, var4, var15, var17, var16, var18);
                  } else {
                     var34 = new class87(var3, 4, var4, var0, var1, var2, var8.field3474, true, (class129)null);
                  }

                  var6.method3066(var0, var1, var2, var16, (class129)var34, (class129)null, class50.field491[var4], 0, 0, 0, var19, var21);
               } else {
                  long var31;
                  Object var33;
                  if (var5 == 5) {
                     var28 = 16;
                     var31 = var6.method3083(var0, var1, var2);
                     if (var31 != 0L) {
                        var28 = class253.method4993(class56.method1110(var31)).field3458;
                     }

                     if (var8.field3474 == -1 && var8.field3480 == null) {
                        var33 = var8.method5288(4, var4, var15, var17, var16, var18);
                     } else {
                        var33 = new class87(var3, 4, var4, var0, var1, var2, var8.field3474, true, (class129)null);
                     }

                     var6.method3066(var0, var1, var2, var16, (class129)var33, (class129)null, class50.field491[var4], 0, var28 * class50.field497[var4], var28 * class50.field501[var4], var19, var21);
                  } else if (var5 == 6) {
                     var28 = 8;
                     var31 = var6.method3083(var0, var1, var2);
                     if (var31 != 0L) {
                        var28 = class253.method4993(class56.method1110(var31)).field3458 / 2;
                     }

                     if (var8.field3474 == -1 && var8.field3480 == null) {
                        var33 = var8.method5288(4, var4 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class87(var3, 4, var4 + 4, var0, var1, var2, var8.field3474, true, (class129)null);
                     }

                     var6.method3066(var0, var1, var2, var16, (class129)var33, (class129)null, 256, var4, var28 * class50.field502[var4], var28 * class50.field507[var4], var19, var21);
                  } else if (var5 == 7) {
                     var23 = var4 + 2 & 3;
                     if (var8.field3474 == -1 && var8.field3480 == null) {
                        var34 = var8.method5288(4, var23 + 4, var15, var17, var16, var18);
                     } else {
                        var34 = new class87(var3, 4, var23 + 4, var0, var1, var2, var8.field3474, true, (class129)null);
                     }

                     var6.method3066(var0, var1, var2, var16, (class129)var34, (class129)null, 256, var23, 0, 0, var19, var21);
                  } else if (var5 == 8) {
                     var28 = 8;
                     var31 = var6.method3083(var0, var1, var2);
                     if (0L != var31) {
                        var28 = class253.method4993(class56.method1110(var31)).field3458 / 2;
                     }

                     int var27 = var4 + 2 & 3;
                     Object var26;
                     if (var8.field3474 == -1 && var8.field3480 == null) {
                        var33 = var8.method5288(4, var4 + 4, var15, var17, var16, var18);
                        var26 = var8.method5288(4, var27 + 4, var15, var17, var16, var18);
                     } else {
                        var33 = new class87(var3, 4, var4 + 4, var0, var1, var2, var8.field3474, true, (class129)null);
                        var26 = new class87(var3, 4, var27 + 4, var0, var1, var2, var8.field3474, true, (class129)null);
                     }

                     var6.method3066(var0, var1, var2, var16, (class129)var33, (class129)var26, 256, var4, var28 * class50.field502[var4], var28 * class50.field507[var4], var19, var21);
                  }
               }
            }
         } else {
            if (var8.field3474 == -1 && var8.field3480 == null) {
               var34 = var8.method5288(10, var4, var15, var17, var16, var18);
            } else {
               var34 = new class87(var3, 10, var4, var0, var1, var2, var8.field3474, true, (class129)null);
            }

            if (var34 != null && var6.method3067(var0, var1, var2, var16, var9, var10, (class129)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.field3482) {
               var23 = 15;
               if (var34 instanceof class121) {
                  var23 = ((class121)var34).method2875() / 4;
                  if (var23 > 30) {
                     var23 = 30;
                  }
               }

               for(var24 = 0; var24 <= var9; ++var24) {
                  for(int var25 = 0; var25 <= var10; ++var25) {
                     if (var23 > class50.field503[var0][var24 + var1][var25 + var2]) {
                        class50.field503[var0][var24 + var1][var25 + var2] = (byte)var23;
                     }
                  }
               }
            }

            if (var8.field3495 != 0 && var7 != null) {
               var7.method3639(var1, var2, var9, var10, var8.field3468);
            }

         }
      }
   }

   static final void method335(class232[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class232 var3 = var0[var2];
         if (var3 != null) {
            if (var3.field2808 == 0) {
               if (var3.field2791 != null) {
                  method335(var3.field2791, var1);
               }

               class56 var4 = (class56)client.field804.method4224((long)var3.field2770);
               if (var4 != null) {
                  class33.method607(var4.field556, var1);
               }
            }

            class57 var5;
            if (var1 == 0 && var3.field2789 != null) {
               var5 = new class57();
               var5.field570 = var3;
               var5.field575 = var3.field2789;
               class53.method1076(var5);
            }

            if (var1 == 1 && var3.field2781 != null) {
               if (var3.field2787 >= 0) {
                  class232 var6 = class18.method213(var3.field2770);
                  if (var6 == null || var6.field2791 == null || var3.field2787 >= var6.field2791.length || var3 != var6.field2791[var3.field2787]) {
                     continue;
                  }
               }

               var5 = new class57();
               var5.field570 = var3;
               var5.field575 = var3.field2781;
               class53.method1076(var5);
            }
         }
      }

   }
}
