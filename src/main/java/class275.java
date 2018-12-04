public class class275 extends class208 {
   static class249 field3631;
   static class249 field3616;
   static class249 field3617;
   static class202 field3618 = new class202(64);
   static class202 field3619 = new class202(100);
   public int[] field3623;
   int[] field3621;
   public int[] field3630;
   public int[] field3620;
   public int field3624 = -1;
   int[] field3625;
   public boolean field3626 = false;
   public int field3627 = 5;
   public int field3628 = -1;
   public int field3629 = -1;
   public int field3633 = 99;
   public int field3622 = -1;
   public int field3632 = -1;
   public int field3615 = 2;

   void method5464(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5455(var1, var2);
      }
   }

   void method5455(class184 var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.method3771();
         this.field3630 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3630[var4] = var1.method3771();
         }

         this.field3623 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3623[var4] = var1.method3771();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3623[var4] += var1.method3771() << 16;
         }
      } else if (var2 == 2) {
         this.field3624 = var1.method3771();
      } else if (var2 == 3) {
         var3 = var1.method3983();
         this.field3625 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3625[var4] = var1.method3983();
         }

         this.field3625[var3] = 9999999;
      } else if (var2 == 4) {
         this.field3626 = true;
      } else if (var2 == 5) {
         this.field3627 = var1.method3983();
      } else if (var2 == 6) {
         this.field3628 = var1.method3771();
      } else if (var2 == 7) {
         this.field3629 = var1.method3771();
      } else if (var2 == 8) {
         this.field3633 = var1.method3983();
      } else if (var2 == 9) {
         this.field3622 = var1.method3983();
      } else if (var2 == 10) {
         this.field3632 = var1.method3983();
      } else if (var2 == 11) {
         this.field3615 = var1.method3983();
      } else if (var2 == 12) {
         var3 = var1.method3983();
         this.field3621 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3621[var4] = var1.method3771();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3621[var4] += var1.method3771() << 16;
         }
      } else if (var2 == 13) {
         var3 = var1.method3983();
         this.field3620 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3620[var4] = var1.method3773();
         }
      }

   }

   void method5456() {
      if (this.field3622 == -1) {
         if (this.field3625 != null) {
            this.field3622 = 2;
         } else {
            this.field3622 = 0;
         }
      }

      if (this.field3632 == -1) {
         if (this.field3625 != null) {
            this.field3632 = 2;
         } else {
            this.field3632 = 0;
         }
      }

   }

   public class121 method5457(class121 var1, int var2) {
      var2 = this.field3623[var2];
      class132 var3 = class24.method475(var2 >> 16);
      var2 &= 65535;
      if (var3 == null) {
         return var1.method2869(true);
      } else {
         class121 var4 = var1.method2869(!var3.method3244(var2));
         var4.method2870(var3, var2);
         return var4;
      }
   }

   class121 method5458(class121 var1, int var2, int var3) {
      var2 = this.field3623[var2];
      class132 var4 = class24.method475(var2 >> 16);
      var2 &= 65535;
      if (var4 == null) {
         return var1.method2869(true);
      } else {
         class121 var5 = var1.method2869(!var4.method3244(var2));
         var3 &= 3;
         if (var3 == 1) {
            var5.method2896();
         } else if (var3 == 2) {
            var5.method2884();
         } else if (var3 == 3) {
            var5.method2880();
         }

         var5.method2870(var4, var2);
         if (var3 == 1) {
            var5.method2880();
         } else if (var3 == 2) {
            var5.method2884();
         } else if (var3 == 3) {
            var5.method2896();
         }

         return var5;
      }
   }

   class121 method5486(class121 var1, int var2) {
      var2 = this.field3623[var2];
      class132 var3 = class24.method475(var2 >> 16);
      var2 &= 65535;
      if (var3 == null) {
         return var1.method2881(true);
      } else {
         class121 var4 = var1.method2881(!var3.method3244(var2));
         var4.method2870(var3, var2);
         return var4;
      }
   }

   public class121 method5459(class121 var1, int var2, class275 var3, int var4) {
      var2 = this.field3623[var2];
      class132 var5 = class24.method475(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.method5457(var1, var4);
      } else {
         var4 = var3.field3623[var4];
         class132 var6 = class24.method475(var4 >> 16);
         var4 &= 65535;
         class121 var7;
         if (var6 == null) {
            var7 = var1.method2869(!var5.method3244(var2));
            var7.method2870(var5, var2);
            return var7;
         } else {
            var7 = var1.method2869(!var5.method3244(var2) & !var6.method3244(var4));
            var7.method2886(var5, var2, var6, var4, this.field3625);
            return var7;
         }
      }
   }

   public class121 method5453(class121 var1, int var2) {
      int var3 = this.field3623[var2];
      class132 var4 = class24.method475(var3 >> 16);
      var3 &= 65535;
      if (var4 == null) {
         return var1.method2869(true);
      } else {
         class132 var5 = null;
         int var6 = 0;
         if (this.field3621 != null && var2 < this.field3621.length) {
            var6 = this.field3621[var2];
            var5 = class24.method475(var6 >> 16);
            var6 &= 65535;
         }

         class121 var7;
         if (var5 != null && var6 != 65535) {
            var7 = var1.method2869(!var4.method3244(var3) & !var5.method3244(var6));
            var7.method2870(var4, var3);
            var7.method2870(var5, var6);
            return var7;
         } else {
            var7 = var1.method2869(!var4.method3244(var3));
            var7.method2870(var4, var3);
            return var7;
         }
      }
   }

   static int method5491(int var0, class86 var1, boolean var2) {
      if (var0 == 3200) {
         class60.field600 -= 3;
         class36.method693(class70.field1070[class60.field600], class70.field1070[class60.field600 + 1], class70.field1070[class60.field600 + 2]);
         return 1;
      } else if (var0 == 3201) {
         class69.method1841(class70.field1070[--class60.field600]);
         return 1;
      } else if (var0 == 3202) {
         class60.field600 -= 2;
         class254.method4994(class70.field1070[class60.field600], class70.field1070[class60.field600 + 1]);
         return 1;
      } else {
         return 2;
      }
   }

   static void method5474(int var0, int var1) {
      class174 var2 = class131.method3243(class171.field2207, client.field690.field1282);
      var2.field2332.method3939(var0);
      var2.field2332.method3887(var1);
      client.field690.method2193(var2);
   }
}
