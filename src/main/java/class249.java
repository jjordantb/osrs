public abstract class class249 {
   static class177 field3231 = new class177();
   static int field3223 = 0;
   int field3224;
   int[] field3225;
   int[] field3238;
   class200 field3227;
   int[] field3228;
   int[] field3229;
   int[] field3230;
   int[][] field3240;
   int[][] field3232;
   class200[] field3233;
   Object[] field3234;
   Object[][] field3235;
   public int field3237;
   boolean field3236;
   boolean field3226;

   class249(boolean var1, boolean var2) {
      this.field3236 = var1;
      this.field3226 = var2;
   }

   void method4846(byte[] var1) {
      int var3 = var1.length;
      int var2 = class73.method1969(var1, 0, var3);
      this.field3237 = var2;
      class184 var4 = new class184(class234.method4769(var1));
      int var5 = var4.method3983();
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.method3892();
         }

         int var6 = var4.method3983();
         if (var5 >= 7) {
            this.field3224 = var4.method3785();
         } else {
            this.field3224 = var4.method3771();
         }

         int var7 = 0;
         int var8 = -1;
         this.field3225 = new int[this.field3224];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.field3224; ++var9) {
               this.field3225[var9] = var7 += var4.method3785();
               if (this.field3225[var9] > var8) {
                  var8 = this.field3225[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.field3224; ++var9) {
               this.field3225[var9] = var7 += var4.method3771();
               if (this.field3225[var9] > var8) {
                  var8 = this.field3225[var9];
               }
            }
         }

         this.field3228 = new int[var8 + 1];
         this.field3229 = new int[var8 + 1];
         this.field3230 = new int[var8 + 1];
         this.field3240 = new int[var8 + 1][];
         this.field3234 = new Object[var8 + 1];
         this.field3235 = new Object[var8 + 1][];
         if (var6 != 0) {
            this.field3238 = new int[var8 + 1];

            for(var9 = 0; var9 < this.field3224; ++var9) {
               this.field3238[this.field3225[var9]] = var4.method3892();
            }

            this.field3227 = new class200(this.field3238);
         }

         for(var9 = 0; var9 < this.field3224; ++var9) {
            this.field3228[this.field3225[var9]] = var4.method3892();
         }

         for(var9 = 0; var9 < this.field3224; ++var9) {
            this.field3229[this.field3225[var9]] = var4.method3892();
         }

         for(var9 = 0; var9 < this.field3224; ++var9) {
            this.field3230[this.field3225[var9]] = var4.method3771();
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.field3224; ++var9) {
               var10 = this.field3225[var9];
               var11 = this.field3230[var10];
               var7 = 0;
               var12 = -1;
               this.field3240[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3240[var10][var13] = var7 += var4.method3785();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3235[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < this.field3224; ++var9) {
               var10 = this.field3225[var9];
               var11 = this.field3230[var10];
               var7 = 0;
               var12 = -1;
               this.field3240[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.field3240[var10][var13] = var7 += var4.method3771();
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.field3235[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.field3232 = new int[var8 + 1][];
            this.field3233 = new class200[var8 + 1];

            for(var9 = 0; var9 < this.field3224; ++var9) {
               var10 = this.field3225[var9];
               var11 = this.field3230[var10];
               this.field3232[var10] = new int[this.field3235[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.field3232[var10][this.field3240[var10][var12]] = var4.method3892();
               }

               this.field3233[var10] = new class200(this.field3232[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void vmethod4936(int var1) {
   }

   public byte[] method4831(int var1, int var2) {
      return this.method4869(var1, var2, (int[])null);
   }

   public byte[] method4869(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0 && var2 < this.field3235[var1].length) {
         if (this.field3235[var1][var2] == null) {
            boolean var4 = this.method4863(var1, var3);
            if (!var4) {
               this.vmethod4955(var1);
               var4 = this.method4863(var1, var3);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class162.method3547(this.field3235[var1][var2], false);
         if (this.field3226) {
            this.field3235[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean method4830(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0 && var2 < this.field3235[var1].length) {
         if (this.field3235[var1][var2] != null) {
            return true;
         } else if (this.field3234[var1] != null) {
            return true;
         } else {
            this.vmethod4955(var1);
            return this.field3234[var1] != null;
         }
      } else {
         return false;
      }
   }

   public boolean method4829(int var1) {
      if (this.field3235.length == 1) {
         return this.method4830(0, var1);
      } else if (this.field3235[var1].length == 1) {
         return this.method4830(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method4832(int var1) {
      if (this.field3234[var1] != null) {
         return true;
      } else {
         this.vmethod4955(var1);
         return this.field3234[var1] != null;
      }
   }

   public boolean method4904() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field3225.length; ++var2) {
         int var3 = this.field3225[var2];
         if (this.field3234[var3] == null) {
            this.vmethod4955(var3);
            if (this.field3234[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   int vmethod4932(int var1) {
      return this.field3234[var1] != null ? 100 : 0;
   }

   public byte[] method4835(int var1) {
      if (this.field3235.length == 1) {
         return this.method4831(0, var1);
      } else if (this.field3235[var1].length == 1) {
         return this.method4831(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method4836(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3235.length && this.field3235[var1] != null && var2 >= 0 && var2 < this.field3235[var1].length) {
         if (this.field3235[var1][var2] == null) {
            boolean var3 = this.method4863(var1, (int[])null);
            if (!var3) {
               this.vmethod4955(var1);
               var3 = this.method4863(var1, (int[])null);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class162.method3547(this.field3235[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   public byte[] method4837(int var1) {
      if (this.field3235.length == 1) {
         return this.method4836(0, var1);
      } else if (this.field3235[var1].length == 1) {
         return this.method4836(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void vmethod4955(int var1) {
   }

   public int[] method4839(int var1) {
      return this.field3240[var1];
   }

   public int method4889(int var1) {
      return this.field3235[var1].length;
   }

   public int method4841() {
      return this.field3235.length;
   }

   public void method4842() {
      for(int var1 = 0; var1 < this.field3234.length; ++var1) {
         this.field3234[var1] = null;
      }

   }

   public void method4843(int var1) {
      for(int var2 = 0; var2 < this.field3235[var1].length; ++var2) {
         this.field3235[var1][var2] = null;
      }

   }

   public void method4844() {
      for(int var1 = 0; var1 < this.field3235.length; ++var1) {
         if (this.field3235[var1] != null) {
            for(int var2 = 0; var2 < this.field3235[var1].length; ++var2) {
               this.field3235[var1][var2] = null;
            }
         }
      }

   }

   boolean method4863(int var1, int[] var2) {
      if (this.field3234[var1] == null) {
         return false;
      } else {
         int var3 = this.field3230[var1];
         int[] var4 = this.field3240[var1];
         Object[] var5 = this.field3235[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var18;
            if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
               var18 = class162.method3547(this.field3234[var1], false);
            } else {
               var18 = class162.method3547(this.field3234[var1], true);
               class184 var8 = new class184(var18);
               var8.method3791(var2, 5, var8.field2404.length);
            }

            byte[] var20 = class234.method4769(var18);
            if (this.field3236) {
               this.field3234[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               class184 var11 = new class184(var20);
               int[] var12 = new int[var3];
               var11.field2405 = var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.method3892();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.field2405 = var9;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.method3892();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.field3226) {
                     var5[var4[var15]] = class21.method330(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.field3226) {
               var5[var4[0]] = class21.method330(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public int method4825(String var1) {
      var1 = var1.toLowerCase();
      return this.field3227.method4186(class54.method1088(var1));
   }

   public int method4847(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3233[var1].method4186(class54.method1088(var2));
   }

   public boolean method4848(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3227.method4186(class54.method1088(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.field3233[var3].method4186(class54.method1088(var2));
         return var4 >= 0;
      }
   }

   public byte[] method4849(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3227.method4186(class54.method1088(var1));
      int var4 = this.field3233[var3].method4186(class54.method1088(var2));
      return this.method4831(var3, var4);
   }

   public boolean method4853(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field3227.method4186(class54.method1088(var1));
      int var4 = this.field3233[var3].method4186(class54.method1088(var2));
      return this.method4830(var3, var4);
   }

   public boolean method4851(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3227.method4186(class54.method1088(var1));
      return this.method4832(var2);
   }

   public void method4828(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3227.method4186(class54.method1088(var1));
      if (var2 >= 0) {
         this.vmethod4936(var2);
      }
   }

   public int method4845(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field3227.method4186(class54.method1088(var1));
      return this.vmethod4932(var2);
   }
}
