public class class35 {
   int field342;
   byte[][][] field340;

   class35(int var1) {
      this.field342 = var1;
   }

   void method690(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field342 != 0 && this.field340 != null) {
         var8 = this.method651(var8, var7);
         var7 = this.method675(var7);
         class319.method6049(var1, var2, var5, var6, var3, var4, this.field340[var7 - 1][var8], this.field342);
      }
   }

   int method651(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   int method675(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method652() {
      if (this.field340 == null) {
         this.field340 = new byte[8][4][];
         this.method665();
         this.method649();
         this.method674();
         this.method656();
         this.method657();
         this.method662();
         this.method689();
         this.method660();
      }
   }

   void method665() {
      byte[] var1 = new byte[this.field342 * this.field342];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[0][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[0][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[0][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[0][3] = var1;
   }

   void method649() {
      byte[] var1 = new byte[this.field342 * this.field342];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[1][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field340[1][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[1][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[1][3] = var1;
   }

   void method674() {
      byte[] var1 = new byte[this.field342 * this.field342];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[2][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[2][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[2][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[2][3] = var1;
   }

   void method656() {
      byte[] var1 = new byte[this.field342 * this.field342];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[3][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[3][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[3][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[3][3] = var1;
   }

   void method657() {
      byte[] var1 = new byte[this.field342 * this.field342];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[4][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[4][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[4][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var2 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field340[4][3] = var1;
   }

   void method662() {
      byte[] var1 = new byte[this.field342 * this.field342];
      boolean var2 = false;
      var1 = new byte[this.field342 * this.field342];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[5][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var3 <= this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[5][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[5][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var3 >= this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[5][3] = var1;
   }

   void method689() {
      byte[] var1 = new byte[this.field342 * this.field342];
      boolean var2 = false;
      var1 = new byte[this.field342 * this.field342];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[6][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 <= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[6][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[6][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[6][3] = var1;
   }

   void method660() {
      byte[] var1 = new byte[this.field342 * this.field342];
      boolean var2 = false;
      var1 = new byte[this.field342 * this.field342];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[7][0] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field342; ++var4) {
            if (var4 >= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[7][1] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = this.field342 - 1; var3 >= 0; --var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[7][2] = var1;
      var1 = new byte[this.field342 * this.field342];
      var5 = 0;

      for(var3 = 0; var3 < this.field342; ++var3) {
         for(var4 = this.field342 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field342 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field340[7][3] = var1;
   }

   public static int method654(int var0) {
      long var2 = class122.field1714[var0];
      int var1 = (int)(var2 >>> 14 & 3L);
      return var1;
   }

   static void method688(int var0, int var1, int var2, int var3, String var4) {
      class232 var5 = class9.method102(var1, var2);
      if (var5 != null) {
         if (var5.field2773 != null) {
            class57 var6 = new class57();
            var6.field570 = var5;
            var6.field567 = var0;
            var6.field571 = var4;
            var6.field575 = var5.field2773;
            class53.method1076(var6);
         }

         boolean var11 = true;
         if (var5.field2741 > 0) {
            var11 = class14.method145(var5);
         }

         if (var11) {
            int var8 = class254.method5000(var5);
            int var9 = var0 - 1;
            boolean var7 = (var8 >> var9 + 1 & 1) != 0;
            if (var7) {
               class174 var10;
               if (var0 == 1) {
                  var10 = class131.method3243(class171.field2275, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 2) {
                  var10 = class131.method3243(class171.field2228, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 3) {
                  var10 = class131.method3243(class171.field2255, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 4) {
                  var10 = class131.method3243(class171.field2226, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 5) {
                  var10 = class131.method3243(class171.field2247, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 6) {
                  var10 = class131.method3243(class171.field2273, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 7) {
                  var10 = class131.method3243(class171.field2292, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 8) {
                  var10 = class131.method3243(class171.field2221, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 9) {
                  var10 = class131.method3243(class171.field2295, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

               if (var0 == 10) {
                  var10 = class131.method3243(class171.field2246, client.field690.field1282);
                  var10.field2332.method3921(var1);
                  var10.field2332.method3754(var2);
                  var10.field2332.method3754(var3);
                  client.field690.method2193(var10);
               }

            }
         }
      }
   }
}
