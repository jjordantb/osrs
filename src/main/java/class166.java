public class class166 {
   public int field2097 = 0;
   public int field2086 = 0;
   int field2089;
   int field2096;
   public int[][] field2101;

   public class166(int var1, int var2) {
      this.field2089 = var1;
      this.field2096 = var2;
      this.field2101 = new int[this.field2089][this.field2096];
      this.method3612();
   }

   public void method3612() {
      for(int var1 = 0; var1 < this.field2089; ++var1) {
         for(int var2 = 0; var2 < this.field2096; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.field2089 - 5 && var2 < this.field2096 - 5) {
               this.field2101[var1][var2] = 16777216;
            } else {
               this.field2101[var1][var2] = 16777215;
            }
         }
      }

   }

   public void method3613(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2097;
      var2 -= this.field2086;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3635(var1, var2, 128);
            this.method3635(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3635(var1, var2, 2);
            this.method3635(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3635(var1, var2, 8);
            this.method3635(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3635(var1, var2, 32);
            this.method3635(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3635(var1, var2, 1);
            this.method3635(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3635(var1, var2, 4);
            this.method3635(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3635(var1, var2, 16);
            this.method3635(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3635(var1, var2, 64);
            this.method3635(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3635(var1, var2, 130);
            this.method3635(var1 - 1, var2, 8);
            this.method3635(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3635(var1, var2, 10);
            this.method3635(var1, var2 + 1, 32);
            this.method3635(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3635(var1, var2, 40);
            this.method3635(var1 + 1, var2, 128);
            this.method3635(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3635(var1, var2, 160);
            this.method3635(var1, var2 - 1, 2);
            this.method3635(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3635(var1, var2, 65536);
               this.method3635(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3635(var1, var2, 1024);
               this.method3635(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3635(var1, var2, 4096);
               this.method3635(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3635(var1, var2, 16384);
               this.method3635(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3635(var1, var2, 512);
               this.method3635(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3635(var1, var2, 2048);
               this.method3635(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3635(var1, var2, 8192);
               this.method3635(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3635(var1, var2, 32768);
               this.method3635(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3635(var1, var2, 66560);
               this.method3635(var1 - 1, var2, 4096);
               this.method3635(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3635(var1, var2, 5120);
               this.method3635(var1, var2 + 1, 16384);
               this.method3635(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3635(var1, var2, 20480);
               this.method3635(var1 + 1, var2, 65536);
               this.method3635(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3635(var1, var2, 81920);
               this.method3635(var1, var2 - 1, 1024);
               this.method3635(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method3639(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.field2097;
      var2 -= this.field2086;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.field2089) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.field2096) {
                  this.method3635(var7, var8, var6);
               }
            }
         }
      }

   }

   public void method3615(int var1, int var2) {
      var1 -= this.field2097;
      var2 -= this.field2086;
      this.field2101[var1][var2] |= 2097152;
   }

   public void method3614(int var1, int var2) {
      var1 -= this.field2097;
      var2 -= this.field2086;
      this.field2101[var1][var2] |= 262144;
   }

   void method3635(int var1, int var2, int var3) {
      this.field2101[var1][var2] |= var3;
   }

   public void method3617(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.field2097;
      var2 -= this.field2086;
      if (var3 == 0) {
         if (var4 == 0) {
            this.method3619(var1, var2, 128);
            this.method3619(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.method3619(var1, var2, 2);
            this.method3619(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.method3619(var1, var2, 8);
            this.method3619(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.method3619(var1, var2, 32);
            this.method3619(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.method3619(var1, var2, 1);
            this.method3619(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.method3619(var1, var2, 4);
            this.method3619(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.method3619(var1, var2, 16);
            this.method3619(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.method3619(var1, var2, 64);
            this.method3619(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.method3619(var1, var2, 130);
            this.method3619(var1 - 1, var2, 8);
            this.method3619(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.method3619(var1, var2, 10);
            this.method3619(var1, var2 + 1, 32);
            this.method3619(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.method3619(var1, var2, 40);
            this.method3619(var1 + 1, var2, 128);
            this.method3619(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.method3619(var1, var2, 160);
            this.method3619(var1, var2 - 1, 2);
            this.method3619(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.method3619(var1, var2, 65536);
               this.method3619(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.method3619(var1, var2, 1024);
               this.method3619(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.method3619(var1, var2, 4096);
               this.method3619(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.method3619(var1, var2, 16384);
               this.method3619(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.method3619(var1, var2, 512);
               this.method3619(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.method3619(var1, var2, 2048);
               this.method3619(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.method3619(var1, var2, 8192);
               this.method3619(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.method3619(var1, var2, 32768);
               this.method3619(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.method3619(var1, var2, 66560);
               this.method3619(var1 - 1, var2, 4096);
               this.method3619(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.method3619(var1, var2, 5120);
               this.method3619(var1, var2 + 1, 16384);
               this.method3619(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.method3619(var1, var2, 20480);
               this.method3619(var1 + 1, var2, 65536);
               this.method3619(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.method3619(var1, var2, 81920);
               this.method3619(var1, var2 - 1, 1024);
               this.method3619(var1 - 1, var2, 4096);
            }
         }
      }

   }

   public void method3618(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.field2097;
      var2 -= this.field2086;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.field2089) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.field2096) {
                  this.method3619(var8, var9, var7);
               }
            }
         }
      }

   }

   void method3619(int var1, int var2, int var3) {
      this.field2101[var1][var2] &= ~var3;
   }

   public void method3620(int var1, int var2) {
      var1 -= this.field2097;
      var2 -= this.field2086;
      this.field2101[var1][var2] &= -262145;
   }

   static int method3641(int var0, class86 var1, boolean var2) {
      int var3 = -1;
      class232 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class70.field1070[--class60.field600];
         var4 = class18.method213(var3);
      } else {
         var4 = var2 ? class10.field75 : class70.field1080;
      }

      if (var0 == 1000) {
         class60.field600 -= 4;
         var4.field2676 = class70.field1070[class60.field600];
         var4.field2751 = class70.field1070[class60.field600 + 1];
         var4.field2672 = class70.field1070[class60.field600 + 2];
         var4.field2673 = class70.field1070[class60.field600 + 3];
         class37.method721(var4);
         class157.field2037.method1577(var4);
         if (var3 != -1 && var4.field2808 == 0) {
            class223.method4594(class145.field1951[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class60.field600 -= 4;
         var4.field2678 = class70.field1070[class60.field600];
         var4.field2679 = class70.field1070[class60.field600 + 1];
         var4.field2736 = class70.field1070[class60.field600 + 2];
         var4.field2675 = class70.field1070[class60.field600 + 3];
         class37.method721(var4);
         class157.field2037.method1577(var4);
         if (var3 != -1 && var4.field2808 == 0) {
            class223.method4594(class145.field1951[var3 >> 16], var4, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = class70.field1070[--class60.field600] == 1;
         if (var5 != var4.field2704) {
            var4.field2704 = var5;
            class37.method721(var4);
         }

         return 1;
      } else if (var0 == 1005) {
         var4.field2807 = class70.field1070[--class60.field600] == 1;
         return 1;
      } else if (var0 == 1006) {
         var4.field2746 = class70.field1070[--class60.field600] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
