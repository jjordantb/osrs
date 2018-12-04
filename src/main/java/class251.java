import java.util.zip.CRC32;

public class class251 extends class249 {
   static CRC32 field3248 = new CRC32();
   class164 field3255;
   class164 field3249;
   int field3250;
   volatile boolean field3251 = false;
   boolean field3252 = false;
   volatile boolean[] field3253;
   int field3254;
   int field3256;
   int field3257 = -1;

   public class251(class164 var1, class164 var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.field3255 = var1;
      this.field3249 = var2;
      this.field3250 = var3;
      this.field3252 = var6;
      int var8 = this.field3250;
      if (class79.field1181 != null) {
         class79.field1181.field2405 = var8 * 8 + 5;
         int var9 = class79.field1181.method3892();
         int var10 = class79.field1181.method3892();
         this.method4942(var9, var10);
      } else {
         class70.method1947((class251)null, 255, 255, 0, (byte)0, true);
         class252.field3275[var8] = this;
      }

   }

   void vmethod4936(int var1) {
      int var2 = this.field3250;
      long var3 = (long)((var2 << 16) + var1);
      class248 var5 = (class248)class252.field3266.method4224(var3);
      if (var5 != null) {
         class252.field3265.method4147(var5);
      }

   }

   int vmethod4932(int var1) {
      if (super.field3234[var1] != null) {
         return 100;
      } else {
         return this.field3253[var1] ? 100 : class154.method3415(this.field3250, var1);
      }
   }

   void vmethod4955(int var1) {
      if (this.field3255 != null && this.field3253 != null && this.field3253[var1]) {
         class164 var2 = this.field3255;
         byte[] var4 = null;
         class207 var5 = class250.field3242;
         synchronized(class250.field3242) {
            for(class247 var6 = (class247)class250.field3242.method4298(); var6 != null; var6 = (class247)class250.field3242.method4283()) {
               if ((long)var1 == var6.field2496 && var2 == var6.field3215 && var6.field3213 == 0) {
                  var4 = var6.field3212;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.method4928(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.method3592(var1);
            this.method4928(var2, var1, var9, true);
         }
      } else {
         class70.method1947(this, this.field3250, var1, super.field3228[var1], (byte)2, true);
      }

   }

   public boolean method4922() {
      return this.field3251;
   }

   public int method4923() {
      if (this.field3251) {
         return 100;
      } else if (super.field3234 != null) {
         return 99;
      } else {
         int var1 = class154.method3415(255, this.field3250);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   void method4942(int var1, int var2) {
      this.field3254 = var1;
      this.field3256 = var2;
      if (this.field3249 != null) {
         int var3 = this.field3250;
         class164 var4 = this.field3249;
         byte[] var6 = null;
         class207 var7 = class250.field3242;
         synchronized(class250.field3242) {
            for(class247 var8 = (class247)class250.field3242.method4298(); var8 != null; var8 = (class247)class250.field3242.method4283()) {
               if ((long)var3 == var8.field2496 && var4 == var8.field3215 && var8.field3213 == 0) {
                  var6 = var8.field3212;
                  break;
               }
            }
         }

         if (var6 != null) {
            this.method4928(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.method3592(var3);
            this.method4928(var4, var3, var11, true);
         }
      } else {
         class70.method1947(this, 255, this.field3250, this.field3254, (byte)0, true);
      }

   }

   void method4927(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field3251) {
            throw new RuntimeException();
         }

         if (this.field3249 != null) {
            class68.method1827(this.field3250, var2, this.field3249);
         }

         this.method4846(var2);
         this.method4926();
      } else {
         var2[var2.length - 2] = (byte)(super.field3229[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field3229[var1];
         if (this.field3255 != null) {
            class68.method1827(var1, var2, this.field3255);
            this.field3253[var1] = true;
         }

         if (var4) {
            super.field3234[var1] = class21.method330(var2, false);
         }
      }

   }

   void method4928(class164 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.field3249) {
         if (this.field3251) {
            throw new RuntimeException();
         } else if (var3 == null) {
            class70.method1947(this, 255, this.field3250, this.field3254, (byte)0, true);
         } else {
            field3248.reset();
            field3248.update(var3, 0, var3.length);
            var5 = (int)field3248.getValue();
            if (var5 != this.field3254) {
               class70.method1947(this, 255, this.field3250, this.field3254, (byte)0, true);
            } else {
               class184 var9 = new class184(class234.method4769(var3));
               int var7 = var9.method3983();
               if (var7 != 5 && var7 != 6) {
                  throw new RuntimeException(var7 + "," + this.field3250 + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = var9.method3892();
                  }

                  if (var8 != this.field3256) {
                     class70.method1947(this, 255, this.field3250, this.field3254, (byte)0, true);
                  } else {
                     this.method4846(var3);
                     this.method4926();
                  }
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field3257) {
            this.field3251 = true;
         }

         if (var3 != null && var3.length > 2) {
            field3248.reset();
            field3248.update(var3, 0, var3.length - 2);
            var5 = (int)field3248.getValue();
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            if (var5 == super.field3228[var2] && var6 == super.field3229[var2]) {
               this.field3253[var2] = true;
               if (var4) {
                  super.field3234[var2] = class21.method330(var3, false);
               }

            } else {
               this.field3253[var2] = false;
               if (this.field3252 || var4) {
                  class70.method1947(this, this.field3250, var2, super.field3228[var2], (byte)2, var4);
               }

            }
         } else {
            this.field3253[var2] = false;
            if (this.field3252 || var4) {
               class70.method1947(this, this.field3250, var2, super.field3228[var2], (byte)2, var4);
            }

         }
      }
   }

   void method4926() {
      this.field3253 = new boolean[super.field3234.length];

      int var1;
      for(var1 = 0; var1 < this.field3253.length; ++var1) {
         this.field3253[var1] = false;
      }

      if (this.field3255 == null) {
         this.field3251 = true;
      } else {
         this.field3257 = -1;

         for(var1 = 0; var1 < this.field3253.length; ++var1) {
            if (super.field3230[var1] > 0) {
               class164 var2 = this.field3255;
               class247 var4 = new class247();
               var4.field3213 = 1;
               var4.field2496 = (long)var1;
               var4.field3215 = var2;
               var4.field3214 = this;
               class207 var5 = class250.field3242;
               synchronized(class250.field3242) {
                  class250.field3242.method4276(var4);
               }

               Object var10 = class250.field3241;
               synchronized(class250.field3241) {
                  if (class250.field3243 == 0) {
                     class250.field3245 = new Thread(new class250());
                     class250.field3245.setDaemon(true);
                     class250.field3245.start();
                     class250.field3245.setPriority(5);
                  }

                  class250.field3243 = 600;
               }

               this.field3257 = var1;
            }
         }

         if (this.field3257 == -1) {
            this.field3251 = true;
         }

      }
   }

   public boolean method4931(int var1) {
      return this.field3253[var1];
   }

   public boolean method4961(int var1) {
      return this.method4839(var1) != null;
   }

   public int method4933() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field3234.length; ++var3) {
         if (super.field3230[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod4932(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   public static class258 method4963(int var0) {
      class258 var1 = (class258)class258.field3335.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class258.field3336.method4831(19, var0);
         var1 = new class258();
         if (var2 != null) {
            var1.method5068(new class184(var2));
         }

         class258.field3335.method4204(var1, (long)var0);
         return var1;
      }
   }
}
