import java.awt.Component;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public final class class30 {
   static int field314;
   public static class320 field313;
   boolean field301 = false;
   boolean field300 = false;
   class33 field302;
   class323 field308;
   HashMap field303;
   class23[][] field304;
   HashMap field305 = new HashMap();
   class322[] field306;
   final HashMap field307;
   int field310;
   int field309;
   int field299;
   int field311;
   public int field312 = 0;

   public class30(class322[] var1, HashMap var2) {
      this.field306 = var1;
      this.field307 = var2;
   }

   public void method535(class249 var1, String var2, boolean var3) {
      if (!this.field300) {
         this.field301 = false;
         this.field300 = true;
         System.nanoTime();
         int var4 = var1.method4825(class29.field291.field298);
         int var5 = var1.method4847(var4, var2);
         class184 var6 = new class184(var1.method4849(class29.field291.field298, var2));
         class184 var7 = new class184(var1.method4849(class29.field288.field298, var2));
         class184 var8 = new class184(var1.method4849(var2, class29.field290.field298));
         System.nanoTime();
         System.nanoTime();
         this.field302 = new class33();

         try {
            this.field302.method608(var6, var8, var7, var5, var3);
         } catch (IllegalStateException var20) {
            return;
         }

         this.field302.method303();
         this.field302.method256();
         this.field302.method265();
         this.field310 = this.field302.method280() * 64;
         this.field309 = this.field302.method251() * 64;
         this.field299 = (this.field302.method260() - this.field302.method280() + 1) * 64;
         this.field311 = (this.field302.method271() - this.field302.method251() + 1) * 64;
         int var17 = this.field302.method260() - this.field302.method280() + 1;
         int var10 = this.field302.method271() - this.field302.method251() + 1;
         System.nanoTime();
         System.nanoTime();
         class68.method1826();
         this.field304 = new class23[var17][var10];
         Iterator var11 = this.field302.field327.iterator();

         while(var11.hasNext()) {
            class10 var12 = (class10)var11.next();
            int var13 = var12.field146;
            int var14 = var12.field151;
            int var15 = var13 - this.field302.method280();
            int var16 = var14 - this.field302.method251();
            this.field304[var15][var16] = new class23(var13, var14, this.field302.method257(), this.field307);
            this.field304[var15][var16].method337(var12, this.field302.field326);
         }

         for(int var18 = 0; var18 < var17; ++var18) {
            for(int var19 = 0; var19 < var10; ++var19) {
               if (this.field304[var18][var19] == null) {
                  this.field304[var18][var19] = new class23(this.field302.method280() + var18, this.field302.method251() + var19, this.field302.method257(), this.field307);
                  this.field304[var18][var19].method446(this.field302.field324, this.field302.field326);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method4848(class29.field289.field298, var2)) {
            byte[] var21 = var1.method4849(class29.field289.field298, var2);
            this.field308 = class70.method1946(var21);
         }

         System.nanoTime();
         var1.method4842();
         var1.method4844();
         this.field301 = true;
      }
   }

   public final void method547() {
      this.field303 = null;
   }

   public final void method537(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class319.field3856;
      int var10 = class319.field3854;
      int var11 = class319.field3855;
      int[] var12 = new int[4];
      class319.method6110(var12);
      class17 var13 = this.method542(var1, var2, var3, var4);
      float var14 = this.method562(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.field312 = var15;
      if (!this.field305.containsKey(var15)) {
         class35 var16 = new class35(var15);
         var16.method652();
         this.field305.put(var15, var16);
      }

      class23[] var22 = new class23[8];

      int var17;
      int var18;
      for(var17 = var13.field159; var17 < var13.field159 + var13.field163; ++var17) {
         for(var18 = var13.field160; var18 < var13.field157 + var13.field160; ++var18) {
            this.method534(var17, var18, var22);
            this.field304[var17][var18].method341(var15, (class35)this.field305.get(var15), var22, this.field306);
         }
      }

      class319.method6038(var9, var10, var11);
      class319.method6050(var12);
      var17 = (int)(var14 * 64.0F);
      var18 = this.field310 + var1;
      int var19 = var2 + this.field309;

      for(int var20 = var13.field159; var20 < var13.field159 + var13.field163; ++var20) {
         for(int var21 = var13.field160; var21 < var13.field160 + var13.field157; ++var21) {
            this.field304[var20][var21].method336(var5 + var17 * (this.field304[var20][var21].field233 * 64 - var18) / 64, var8 - var17 * (this.field304[var20][var21].field234 * 64 - var19 + 64) / 64, var17);
         }
      }

   }

   public final void method549(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class17 var14 = this.method542(var1, var2, var3, var4);
      float var15 = this.method562(var7 - var5, var3 - var1);
      int var16 = (int)(64.0F * var15);
      int var17 = this.field310 + var1;
      int var18 = var2 + this.field309;

      int var19;
      int var20;
      for(var19 = var14.field159; var19 < var14.field159 + var14.field163; ++var19) {
         for(var20 = var14.field160; var20 < var14.field160 + var14.field157; ++var20) {
            if (var13) {
               this.field304[var19][var20].method436();
            }

            this.field304[var19][var20].method416(var5 + var16 * (this.field304[var19][var20].field233 * 64 - var17) / 64, var8 - var16 * (this.field304[var19][var20].field234 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.field159; var19 < var14.field159 + var14.field163; ++var19) {
            for(var20 = var14.field160; var20 < var14.field160 + var14.field157; ++var20) {
               this.field304[var19][var20].method343(var10, var11, var12);
            }
         }
      }

   }

   void method534(int var1, int var2, class23[] var3) {
      boolean var4 = var1 <= 0;
      boolean var5 = var1 >= this.field304.length - 1;
      boolean var6 = var2 <= 0;
      boolean var7 = var2 >= this.field304[0].length - 1;
      if (var7) {
         var3[class242.field3172.vmethod6130()] = null;
      } else {
         var3[class242.field3172.vmethod6130()] = this.field304[var1][var2 + 1];
      }

      var3[class242.field3163.vmethod6130()] = !var7 && !var5 ? this.field304[var1 + 1][var2 + 1] : null;
      var3[class242.field3167.vmethod6130()] = !var7 && !var4 ? this.field304[var1 - 1][var2 + 1] : null;
      var3[class242.field3164.vmethod6130()] = var5 ? null : this.field304[var1 + 1][var2];
      var3[class242.field3168.vmethod6130()] = var4 ? null : this.field304[var1 - 1][var2];
      var3[class242.field3166.vmethod6130()] = var6 ? null : this.field304[var1][var2 - 1];
      var3[class242.field3162.vmethod6130()] = !var6 && !var5 ? this.field304[var1 + 1][var2 - 1] : null;
      var3[class242.field3169.vmethod6130()] = !var6 && !var4 ? this.field304[var1 - 1][var2 - 1] : null;
   }

   public void method540(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field308 != null) {
         this.field308.method6166(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field303 == null) {
               this.method569();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = ((Integer)var8.next()).intValue();
                  var10 = (List)this.field303.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  class28 var12 = (class28)var11.next();
                  int var13 = var3 * (var12.field277.field2632 - this.field310) / this.field299;
                  int var14 = var4 - (var12.field277.field2633 - this.field309) * var4 / this.field311;
                  class319.method6095(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public List method541(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field301) {
         return var11;
      } else {
         class17 var12 = this.method542(var1, var2, var3, var4);
         float var13 = this.method562(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field310 + var1;
         int var16 = var2 + this.field309;

         for(int var17 = var12.field159; var17 < var12.field159 + var12.field163; ++var17) {
            for(int var18 = var12.field160; var18 < var12.field157 + var12.field160; ++var18) {
               List var19 = this.field304[var17][var18].method371(var5 + var14 * (this.field304[var17][var18].field233 * 64 - var15) / 64, var8 + var6 - var14 * (this.field304[var17][var18].field234 * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   class17 method542(int var1, int var2, int var3, int var4) {
      class17 var5 = new class17(this);
      int var6 = this.field310 + var1;
      int var7 = var2 + this.field309;
      int var8 = var3 + this.field310;
      int var9 = var4 + this.field309;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field163 = var12 - var10 + 1;
      var5.field157 = var13 - var11 + 1;
      var5.field159 = var10 - this.field302.method280();
      var5.field160 = var11 - this.field302.method251();
      if (var5.field159 < 0) {
         var5.field163 += var5.field159;
         var5.field159 = 0;
      }

      if (var5.field159 > this.field304.length - var5.field163) {
         var5.field163 = this.field304.length - var5.field159;
      }

      if (var5.field160 < 0) {
         var5.field157 += var5.field160;
         var5.field160 = 0;
      }

      if (var5.field160 > this.field304[0].length - var5.field157) {
         var5.field157 = this.field304[0].length - var5.field160;
      }

      var5.field163 = Math.min(var5.field163, this.field304.length);
      var5.field157 = Math.min(var5.field157, this.field304[0].length);
      return var5;
   }

   public boolean method543() {
      return this.field301;
   }

   public HashMap method544() {
      this.method569();
      return this.field303;
   }

   void method569() {
      if (this.field303 == null) {
         this.field303 = new HashMap();
      }

      this.field303.clear();

      for(int var1 = 0; var1 < this.field304.length; ++var1) {
         for(int var2 = 0; var2 < this.field304[var1].length; ++var2) {
            List var3 = this.field304[var1][var2].method406();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class28 var5 = (class28)var4.next();
               if (!this.field303.containsKey(var5.field285)) {
                  LinkedList var6 = new LinkedList();
                  var6.add(var5);
                  this.field303.put(var5.field285, var6);
               } else {
                  List var7 = (List)this.field303.get(var5.field285);
                  var7.add(var5);
               }
            }
         }
      }

   }

   float method562(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   static void method579(Component var0) {
      var0.addMouseListener(class48.field470);
      var0.addMouseMotionListener(class48.field470);
      var0.addFocusListener(class48.field470);
   }

   static void method574(Component var0) {
      var0.setFocusTraversalKeysEnabled(false);
      var0.addKeyListener(class39.field386);
      var0.addFocusListener(class39.field386);
   }

   static class86 method578(int var0, int var1, int var2) {
      int var3 = class219.method4393(var1, var0);
      class86 var4 = class86.method2153(var3, var0);
      if (var4 != null) {
         return var4;
      } else {
         int var5 = var0 + (var2 + '鱀' << 8);
         var4 = class86.method2153(var5, var0);
         return var4 != null ? var4 : null;
      }
   }

   static void method575(int var0) {
      class54 var1 = (class54)class54.field534.method4224((long)var0);
      if (var1 != null) {
         var1.method4271();
      }
   }

   static final void method577(boolean var0) {
      if (var0) {
         client.field681 = class79.field1172 ? class148.field1965 : class148.field1966;
      } else {
         LinkedHashMap var1 = class47.field435.field1028;
         String var3 = class79.field1180;
         int var4 = var3.length();
         int var5 = 0;

         for(int var6 = 0; var6 < var4; ++var6) {
            var5 = (var5 << 5) - var5 + var3.charAt(var6);
         }

         client.field681 = var1.containsKey(var5) ? class148.field1967 : class148.field1964;
      }

   }

   static final void method536(int var0, int var1, int var2, boolean var3) {
      if (class189.method4028(var0)) {
         class162.method3545(class145.field1951[var0], -1, var1, var2, var3);
      }
   }
}
