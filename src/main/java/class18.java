public class class18 implements class31 {
   static class232[] field165;
   static class300 field175;
   int field174;
   int field164;
   int field166;
   int field177;
   int field168;
   int field169;
   int field167;
   int field171;
   int field172;
   int field173;

   public void vmethod697(class20 var1) {
      if (var1.field198 > this.field167) {
         var1.field198 = this.field167;
      }

      if (var1.field199 < this.field172) {
         var1.field199 = this.field172;
      }

      if (var1.field194 > this.field171) {
         var1.field194 = this.field171;
      }

      if (var1.field203 < this.field173) {
         var1.field203 = this.field173;
      }

   }

   public boolean vmethod696(int var1, int var2, int var3) {
      if (var1 >= this.field174 && var1 < this.field164 + this.field174) {
         return var2 >> 6 >= this.field166 && var2 >> 6 <= this.field168 && var3 >> 6 >= this.field177 && var3 >> 6 <= this.field169;
      } else {
         return false;
      }
   }

   public boolean vmethod706(int var1, int var2) {
      return var1 >> 6 >= this.field167 && var1 >> 6 <= this.field172 && var2 >> 6 >= this.field171 && var2 >> 6 <= this.field173;
   }

   public int[] vmethod715(int var1, int var2, int var3) {
      if (!this.vmethod696(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field167 * 64 - this.field166 * 64 + var2, var3 + (this.field171 * 64 - this.field177 * 64)};
         return var4;
      }
   }

   public class228 vmethod695(int var1, int var2) {
      if (!this.vmethod706(var1, var2)) {
         return null;
      } else {
         int var3 = this.field166 * 64 - this.field167 * 64 + var1;
         int var4 = this.field177 * 64 - this.field171 * 64 + var2;
         return new class228(this.field174, var3, var4);
      }
   }

   public void vmethod709(class184 var1) {
      this.field174 = var1.method3983();
      this.field164 = var1.method3983();
      this.field166 = var1.method3771();
      this.field177 = var1.method3771();
      this.field168 = var1.method3771();
      this.field169 = var1.method3771();
      this.field167 = var1.method3771();
      this.field171 = var1.method3771();
      this.field172 = var1.method3771();
      this.field173 = var1.method3771();
      this.method234();
   }

   void method234() {
   }

   public static class232 method213(int var0) {
      int var1 = var0 >> 16;
      int var2 = var0 & '\uffff';
      if (class145.field1951[var1] == null || class145.field1951[var1][var2] == null) {
         boolean var3 = class189.method4028(var1);
         if (!var3) {
            return null;
         }
      }

      return class145.field1951[var1][var2];
   }

   static final void method237(String var0) {
      class34.method643(var0 + " is already on your friend list");
   }

   static int method238(int var0, class86 var1, boolean var2) {
      class232 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = method213(class70.field1070[--class60.field600]);
      } else {
         var3 = var2 ? class10.field75 : class70.field1080;
      }

      String var4 = class70.field1065[--class70.field1072];
      int[] var5 = null;
      if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class70.field1070[--class60.field600];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class70.field1070[--class60.field600]) {
               ;
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var8 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var8.length - 1; var7 >= 1; --var7) {
         if (var4.charAt(var7 - 1) == 's') {
            var8[var7] = class70.field1065[--class70.field1072];
         } else {
            var8[var7] = new Integer(class70.field1070[--class60.field600]);
         }
      }

      var7 = class70.field1070[--class60.field600];
      if (var7 != -1) {
         var8[0] = new Integer(var7);
      } else {
         var8 = null;
      }

      if (var0 == 1400) {
         var3.field2656 = var8;
      } else if (var0 == 1401) {
         var3.field2758 = var8;
      } else if (var0 == 1402) {
         var3.field2756 = var8;
      } else if (var0 == 1403) {
         var3.field2759 = var8;
      } else if (var0 == 1404) {
         var3.field2761 = var8;
      } else if (var0 == 1405) {
         var3.field2712 = var8;
      } else if (var0 == 1406) {
         var3.field2742 = var8;
      } else if (var0 == 1407) {
         var3.field2766 = var8;
         var3.field2767 = var5;
      } else if (var0 == 1408) {
         var3.field2658 = var8;
      } else if (var0 == 1409) {
         var3.field2773 = var8;
      } else if (var0 == 1410) {
         var3.field2763 = var8;
      } else if (var0 == 1411) {
         var3.field2803 = var8;
      } else if (var0 == 1412) {
         var3.field2760 = var8;
      } else if (var0 == 1414) {
         var3.field2660 = var8;
         var3.field2769 = var5;
      } else if (var0 == 1415) {
         var3.field2667 = var8;
         var3.field2771 = var5;
      } else if (var0 == 1416) {
         var3.field2764 = var8;
      } else if (var0 == 1417) {
         var3.field2774 = var8;
      } else if (var0 == 1418) {
         var3.field2775 = var8;
      } else if (var0 == 1419) {
         var3.field2666 = var8;
      } else if (var0 == 1420) {
         var3.field2777 = var8;
      } else if (var0 == 1421) {
         var3.field2747 = var8;
      } else if (var0 == 1422) {
         var3.field2779 = var8;
      } else if (var0 == 1423) {
         var3.field2789 = var8;
      } else if (var0 == 1424) {
         var3.field2781 = var8;
      } else if (var0 == 1425) {
         var3.field2783 = var8;
      } else if (var0 == 1426) {
         var3.field2796 = var8;
      } else {
         if (var0 != 1427) {
            return 2;
         }

         var3.field2782 = var8;
      }

      var3.field2753 = true;
      return 1;
   }

   static final boolean method239(class232 var0) {
      if (var0.field2786 == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.field2786.length; ++var1) {
            int var2 = class74.method1984(var0, var1);
            int var3 = var0.field2778[var1];
            if (var0.field2786[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.field2786[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.field2786[var1] == 4) {
               if (var3 == var2) {
                  return false;
               }
            } else if (var3 != var2) {
               return false;
            }
         }

         return true;
      }
   }
}
