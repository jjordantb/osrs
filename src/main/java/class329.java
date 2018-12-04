import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class329 {
   static final class297 field3945;
   static final class297 field3946;
   static final class297 field3947;
   class249 field3944;
   class300 field3984;
   HashMap field3949;
   class322[] field3950;
   HashMap field3982;
   class20 field3951;
   class20 field3953;
   class20 field3954;
   class30 field3955;
   class328 field3985;
   int field3968;
   int field3980;
   int field3976 = -1;
   int field3960 = -1;
   float field3942;
   float field3962;
   int field3952 = -1;
   int field3964 = -1;
   int field3998 = -1;
   int field3966 = -1;
   int field3967 = 3;
   int field3983 = 50;
   boolean field3969 = false;
   HashSet field3940 = null;
   int field3971 = -1;
   int field3972 = -1;
   int field3986 = -1;
   int field3974 = -1;
   int field3975 = -1;
   int field3959 = -1;
   long field3977;
   int field3970;
   int field3979;
   boolean field3988 = true;
   HashSet field3973 = new HashSet();
   HashSet field3996 = new HashSet();
   HashSet field3958 = new HashSet();
   HashSet field3965 = new HashSet();
   boolean field3987 = false;
   int field3995 = 0;
   final int[] field3989 = new int[]{1008, 1009, 1010, 1011, 1012};
   List field3990;
   Iterator field3991;
   HashSet field3992 = new HashSet();
   class228 field3993 = null;
   public boolean field3994 = false;
   class323 field3957;
   int field3961;
   int field3997 = -1;
   int field3956 = -1;
   int field3999 = -1;

   static {
      field3945 = class297.field3741;
      field3946 = class297.field3742;
      field3947 = class297.field3743;
   }

   public void method6317(class249 var1, class300 var2, HashMap var3, class322[] var4) {
      this.field3950 = var4;
      this.field3944 = var1;
      this.field3984 = var2;
      this.field3949 = new HashMap();
      this.field3949.put(class12.field92, var3.get(field3945));
      this.field3949.put(class12.field93, var3.get(field3946));
      this.field3949.put(class12.field94, var3.get(field3947));
      this.field3985 = new class328(var1);
      int var5 = this.field3944.method4825(class29.field291.field298);
      int[] var6 = this.field3944.method4839(var5);
      this.field3982 = new HashMap(var6.length);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         class184 var8 = new class184(this.field3944.method4831(var5, var6[var7]));
         class20 var9 = new class20();
         var9.method262(var8, var6[var7]);
         this.field3982.put(var9.method264(), var9);
         if (var9.method254()) {
            this.field3951 = var9;
         }
      }

      this.method6333(this.field3951);
      this.field3954 = null;
   }

   public int method6321() {
      return this.field3944.method4853(this.field3951.method264(), class29.field290.field298) ? 100 : this.field3944.method4845(this.field3951.method264());
   }

   public void method6352() {
      class180.method3734();
   }

   public void method6319(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field3985.method6306()) {
         this.method6415();
         this.method6403();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.field3942));
            int var9 = (int)Math.ceil((double)((float)var7 / this.field3942));
            List var10 = this.field3955.method541(this.field3968 - var8 / 2 - 1, this.field3980 - var9 / 2 - 1, var8 / 2 + this.field3968 + 1, var9 / 2 + this.field3980 + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            class28 var13;
            class57 var14;
            class36 var15;
            for(var12 = var10.iterator(); var12.hasNext(); class53.method1076(var14)) {
               var13 = (class28)var12.next();
               var11.add(var13);
               var14 = new class57();
               var15 = new class36(var13.field285, var13.field279, var13.field277);
               var14.method1114(new Object[]{var15, var1, var2});
               if (this.field3992.contains(var13)) {
                  var14.method1116(17);
               } else {
                  var14.method1116(15);
               }
            }

            var12 = this.field3992.iterator();

            while(var12.hasNext()) {
               var13 = (class28)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new class57();
                  var15 = new class36(var13.field285, var13.field279, var13.field277);
                  var14.method1114(new Object[]{var15, var1, var2});
                  var14.method1116(16);
                  class53.method1076(var14);
               }
            }

            this.field3992 = var11;
         }
      }
   }

   public void method6479(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class120.method2866();
      this.method6322(var1, var2, var4, var5);
      if (!this.method6477() && (var4 || var3)) {
         if (var4) {
            this.field3975 = var1;
            this.field3959 = var2;
            this.field3986 = this.field3968;
            this.field3974 = this.field3980;
         }

         if (this.field3986 != -1) {
            int var7 = var1 - this.field3975;
            int var8 = var2 - this.field3959;
            this.method6325(this.field3986 - (int)((float)var7 / this.field3962), (int)((float)var8 / this.field3962) + this.field3974, false);
         }
      } else {
         this.method6331();
      }

      if (var4) {
         this.field3977 = var5;
         this.field3970 = var1;
         this.field3979 = var2;
      }

   }

   void method6322(int var1, int var2, boolean var3, long var4) {
      if (this.field3953 != null) {
         int var6 = (int)((float)this.field3968 + ((float)(var1 - this.field3998) - (float)this.method6355() * this.field3942 / 2.0F) / this.field3942);
         int var7 = (int)((float)this.field3980 - ((float)(var2 - this.field3966) - (float)this.method6356() * this.field3942 / 2.0F) / this.field3942);
         this.field3993 = this.field3953.method279(var6 + this.field3953.method280() * 64, var7 + this.field3953.method251() * 64);
         if (this.field3993 != null && var3) {
            if (class52.method1072() && class39.field380[82] && class39.field380[81]) {
               class49.method1023(this.field3993.field2632, this.field3993.field2633, this.field3993.field2634, false);
            } else {
               boolean var8 = true;
               if (this.field3988) {
                  int var9 = var1 - this.field3970;
                  int var10 = var2 - this.field3979;
                  if (var4 - this.field3977 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                     var8 = false;
                  }
               }

               if (var8) {
                  class174 var11 = class131.method3243(class171.field2229, client.field690.field1282);
                  var11.field2332.method3893(this.field3993.method4646());
                  client.field690.method2193(var11);
                  this.field3977 = 0L;
               }
            }
         }
      } else {
         this.field3993 = null;
      }

   }

   void method6415() {
      if (class140.field1933 != null) {
         this.field3942 = this.field3962;
      } else {
         if (this.field3942 < this.field3962) {
            this.field3942 = Math.min(this.field3962, this.field3942 / 30.0F + this.field3942);
         }

         if (this.field3942 > this.field3962) {
            this.field3942 = Math.max(this.field3962, this.field3942 - this.field3942 / 30.0F);
         }

      }
   }

   void method6403() {
      if (this.method6477()) {
         int var1 = this.field3976 - this.field3968;
         int var2 = this.field3960 - this.field3980;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.method6325(var1 + this.field3968, var2 + this.field3980, true);
         if (this.field3976 == this.field3968 && this.field3960 == this.field3980) {
            this.field3976 = -1;
            this.field3960 = -1;
         }

      }
   }

   final void method6325(int var1, int var2, boolean var3) {
      this.field3968 = var1;
      this.field3980 = var2;
      class120.method2866();
      if (var3) {
         this.method6331();
      }

   }

   final void method6331() {
      this.field3959 = -1;
      this.field3975 = -1;
      this.field3974 = -1;
      this.field3986 = -1;
   }

   boolean method6477() {
      return this.field3976 != -1 && this.field3960 != -1;
   }

   public class20 method6328(int var1, int var2, int var3) {
      Iterator var4 = this.field3982.values().iterator();

      class20 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class20)var4.next();
      } while(!var5.method248(var1, var2, var3));

      return var5;
   }

   public void method6329(int var1, int var2, int var3, boolean var4) {
      class20 var5 = this.method6328(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.field3951;
      }

      boolean var6 = false;
      if (var5 != this.field3954 || var4) {
         this.field3954 = var5;
         this.method6333(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.method6334(var1, var2, var3);
      }

   }

   public void method6330(int var1) {
      class20 var2 = this.method6347(var1);
      if (var2 != null) {
         this.method6333(var2);
      }

   }

   public int method6336() {
      return this.field3953 == null ? -1 : this.field3953.method253();
   }

   public class20 method6332() {
      return this.field3953;
   }

   void method6333(class20 var1) {
      if (this.field3953 == null || var1 != this.field3953) {
         this.method6385(var1);
         this.method6334(-1, -1, -1);
      }
   }

   void method6385(class20 var1) {
      this.field3953 = var1;
      this.field3955 = new class30(this.field3950, this.field3949);
      this.field3985.method6304(this.field3953.method264());
   }

   public void method6335(class20 var1, class228 var2, class228 var3, boolean var4) {
      if (var1 != null) {
         if (this.field3953 == null || var1 != this.field3953) {
            this.method6385(var1);
         }

         if (!var4 && this.field3953.method248(var2.field2634, var2.field2632, var2.field2633)) {
            this.method6334(var2.field2634, var2.field2632, var2.field2633);
         } else {
            this.method6334(var3.field2634, var3.field2632, var3.field2633);
         }

      }
   }

   void method6334(int var1, int var2, int var3) {
      if (this.field3953 != null) {
         int[] var4 = this.field3953.method250(var1, var2, var3);
         if (var4 == null) {
            var4 = this.field3953.method250(this.field3953.method256(), this.field3953.method303(), this.field3953.method265());
         }

         this.method6325(var4[0] - this.field3953.method280() * 64, var4[1] - this.field3953.method251() * 64, true);
         this.field3976 = -1;
         this.field3960 = -1;
         this.field3942 = this.method6343(this.field3953.method258());
         this.field3962 = this.field3942;
         this.field3990 = null;
         this.field3991 = null;
         this.field3955.method547();
      }
   }

   public void method6337(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = new int[4];
      class319.method6110(var6);
      class319.method6067(var1, var2, var3 + var1, var2 + var4);
      class319.method6047(var1, var2, var3, var4, -16777216);
      int var7 = this.field3985.method6315();
      if (var7 < 100) {
         this.method6342(var1, var2, var3, var4, var7);
      } else {
         if (!this.field3955.method543()) {
            this.field3955.method535(this.field3944, this.field3953.method264(), client.field647);
            if (!this.field3955.method543()) {
               return;
            }
         }

         if (this.field3940 != null) {
            ++this.field3972;
            if (this.field3972 % this.field3983 == 0) {
               this.field3972 = 0;
               ++this.field3971;
            }

            if (this.field3971 >= this.field3967 && !this.field3969) {
               this.field3940 = null;
            }
         }

         int var8 = (int)Math.ceil((double)((float)var3 / this.field3942));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field3942));
         this.field3955.method537(this.field3968 - var8 / 2, this.field3980 - var9 / 2, var8 / 2 + this.field3968, var9 / 2 + this.field3980, var1, var2, var3 + var1, var2 + var4);
         if (!this.field3987) {
            boolean var10 = false;
            if (var5 - this.field3995 > 100) {
               this.field3995 = var5;
               var10 = true;
            }

            this.field3955.method549(this.field3968 - var8 / 2, this.field3980 - var9 / 2, var8 / 2 + this.field3968, var9 / 2 + this.field3980, var1, var2, var3 + var1, var2 + var4, this.field3965, this.field3940, this.field3972, this.field3983, var10);
         }

         this.method6369(var1, var2, var3, var4, var8, var9);
         if (class52.method1072() && this.field3994 && this.field3993 != null) {
            this.field3984.method5846("Coord: " + this.field3993, class319.field3853 + 10, class319.field3858 + 20, 16776960, -1);
         }

         this.field3952 = var8;
         this.field3964 = var9;
         this.field3998 = var1;
         this.field3966 = var2;
         class319.method6050(var6);
      }
   }

   boolean method6338(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field3957 == null) {
         return true;
      } else if (this.field3957.field3879 == var1 && this.field3957.field3887 == var2) {
         if (this.field3955.field312 != this.field3961) {
            return true;
         } else if (this.field3999 != client.field914) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var3 + var1 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method6369(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class140.field1933 != null) {
         int var7 = 512 / (this.field3955.field312 * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.method6367() - var5 / 2 - var7;
         int var12 = this.method6353() - var6 / 2 - var7;
         int var13 = var1 - (var11 + var7 - this.field3997) * this.field3955.field312;
         int var14 = var2 - this.field3955.field312 * (var7 - (var12 - this.field3956));
         if (this.method6338(var8, var9, var13, var14, var3, var4)) {
            if (this.field3957 != null && this.field3957.field3879 == var8 && this.field3957.field3887 == var9) {
               Arrays.fill(this.field3957.field3889, 0);
            } else {
               this.field3957 = new class323(var8, var9);
            }

            this.field3997 = this.method6367() - var5 / 2 - var7;
            this.field3956 = this.method6353() - var6 / 2 - var7;
            this.field3961 = this.field3955.field312;
            class140.field1933.method4984(this.field3997, this.field3956, this.field3957, (float)this.field3961 / var10);
            this.field3999 = client.field914;
            var13 = var1 - (var11 + var7 - this.field3997) * this.field3955.field312;
            var14 = var2 - this.field3955.field312 * (var7 - (var12 - this.field3956));
         }

         class319.method6046(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.field3957.method6186(var13, var14, 192);
         } else {
            this.field3957.method6245(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192);
         }
      }

   }

   public void method6490(int var1, int var2, int var3, int var4) {
      if (this.field3985.method6306()) {
         if (!this.field3955.method543()) {
            this.field3955.method535(this.field3944, this.field3953.method264(), client.field647);
            if (!this.field3955.method543()) {
               return;
            }
         }

         this.field3955.method540(var1, var2, var3, var4, this.field3940, this.field3972, this.field3983);
      }
   }

   public void method6324(int var1) {
      this.field3962 = this.method6343(var1);
   }

   void method6342(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      class319.method6047(var1, var2, var3, var4, -16777216);
      class319.method6116(var7 - 152, var8, 304, 34, -65536);
      class319.method6047(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.field3984.method5880("Loading...", var7, var8 + var6, -1, -1);
   }

   float method6343(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public int method6389() {
      if (1.0D == (double)this.field3962) {
         return 25;
      } else if ((double)this.field3962 == 1.5D) {
         return 37;
      } else if (2.0D == (double)this.field3962) {
         return 50;
      } else if (3.0D == (double)this.field3962) {
         return 75;
      } else {
         return 4.0D == (double)this.field3962 ? 100 : 200;
      }
   }

   public void method6345() {
      this.field3985.method6305();
   }

   public boolean method6326() {
      return this.field3985.method6306();
   }

   public class20 method6347(int var1) {
      Iterator var2 = this.field3982.values().iterator();

      class20 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class20)var2.next();
      } while(var3.method253() != var1);

      return var3;
   }

   public void method6486(int var1, int var2) {
      if (this.field3953 != null && this.field3953.method249(var1, var2)) {
         this.field3976 = var1 - this.field3953.method280() * 64;
         this.field3960 = var2 - this.field3953.method251() * 64;
      }
   }

   public void method6437(int var1, int var2) {
      if (this.field3953 != null) {
         this.method6325(var1 - this.field3953.method280() * 64, var2 - this.field3953.method251() * 64, true);
         this.field3976 = -1;
         this.field3960 = -1;
      }
   }

   public void method6350(int var1, int var2, int var3) {
      if (this.field3953 != null) {
         int[] var4 = this.field3953.method250(var1, var2, var3);
         if (var4 != null) {
            this.method6486(var4[0], var4[1]);
         }

      }
   }

   public void method6351(int var1, int var2, int var3) {
      if (this.field3953 != null) {
         int[] var4 = this.field3953.method250(var1, var2, var3);
         if (var4 != null) {
            this.method6437(var4[0], var4[1]);
         }

      }
   }

   public int method6367() {
      return this.field3953 == null ? -1 : this.field3968 + this.field3953.method280() * 64;
   }

   public int method6353() {
      return this.field3953 == null ? -1 : this.field3980 + this.field3953.method251() * 64;
   }

   public class228 method6354() {
      return this.field3953 == null ? null : this.field3953.method279(this.method6367(), this.method6353());
   }

   public int method6355() {
      return this.field3952;
   }

   public int method6356() {
      return this.field3964;
   }

   public void method6357(int var1) {
      if (var1 >= 1) {
         this.field3967 = var1;
      }

   }

   public void method6358() {
      this.field3967 = 3;
   }

   public void method6359(int var1) {
      if (var1 >= 1) {
         this.field3983 = var1;
      }

   }

   public void method6360() {
      this.field3983 = 50;
   }

   public void method6414(boolean var1) {
      this.field3969 = var1;
   }

   public void method6375(int var1) {
      this.field3940 = new HashSet();
      this.field3940.add(var1);
      this.field3971 = 0;
      this.field3972 = 0;
   }

   public void method6363(int var1) {
      this.field3940 = new HashSet();
      this.field3971 = 0;
      this.field3972 = 0;

      for(int var2 = 0; var2 < class257.field3331; ++var2) {
         if (class162.method3533(var2) != null && class162.method3533(var2).field3317 == var1) {
            this.field3940.add(class162.method3533(var2).field3313);
         }
      }

   }

   public void method6364() {
      this.field3940 = null;
   }

   public void method6492(boolean var1) {
      this.field3987 = !var1;
   }

   public void method6323(int var1, boolean var2) {
      if (!var2) {
         this.field3973.add(var1);
      } else {
         this.field3973.remove(var1);
      }

      this.method6371();
   }

   public void method6320(int var1, boolean var2) {
      if (!var2) {
         this.field3996.add(var1);
      } else {
         this.field3996.remove(var1);
      }

      for(int var3 = 0; var3 < class257.field3331; ++var3) {
         if (class162.method3533(var3) != null && class162.method3533(var3).field3317 == var1) {
            int var4 = class162.method3533(var3).field3313;
            if (!var2) {
               this.field3958.add(var4);
            } else {
               this.field3958.remove(var4);
            }
         }
      }

      this.method6371();
   }

   public boolean method6368() {
      return !this.field3987;
   }

   public boolean method6370(int var1) {
      return !this.field3973.contains(var1);
   }

   public boolean method6372(int var1) {
      return !this.field3996.contains(var1);
   }

   void method6371() {
      this.field3965.clear();
      this.field3965.addAll(this.field3973);
      this.field3965.addAll(this.field3958);
   }

   public void method6418(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field3985.method6306()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.field3942));
         int var8 = (int)Math.ceil((double)((float)var4 / this.field3942));
         List var9 = this.field3955.method541(this.field3968 - var7 / 2 - 1, this.field3980 - var8 / 2 - 1, var7 / 2 + this.field3968 + 1, var8 / 2 + this.field3980 + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               class28 var11 = (class28)var10.next();
               class257 var12 = class162.method3533(var11.field285);
               var13 = false;

               for(int var14 = this.field3989.length - 1; var14 >= 0; --var14) {
                  if (var12.field3320[var14] != null) {
                     class79.method2039(var12.field3320[var14], var12.field3321, this.field3989[var14], var11.field285, var11.field279.method4646(), var11.field277.method4646());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public class228 method6373(int var1, class228 var2) {
      if (!this.field3985.method6306()) {
         return null;
      } else if (!this.field3955.method543()) {
         return null;
      } else if (!this.field3953.method249(var2.field2632, var2.field2633)) {
         return null;
      } else {
         HashMap var3 = this.field3955.method544();
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            class28 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               class28 var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.field277;
                  }

                  var8 = (class28)var7.next();
                  int var9 = var8.field277.field2632 - var2.field2632;
                  int var10 = var8.field277.field2633 - var2.field2633;
                  var11 = var10 * var10 + var9 * var9;
                  if (var11 == 0) {
                     return var8.field277;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void method6374(int var1, int var2, class228 var3, class228 var4) {
      class57 var5 = new class57();
      class36 var6 = new class36(var2, var3, var4);
      var5.method1114(new Object[]{var6});
      switch(var1) {
      case 1008:
         var5.method1116(10);
         break;
      case 1009:
         var5.method1116(11);
         break;
      case 1010:
         var5.method1116(12);
         break;
      case 1011:
         var5.method1116(13);
         break;
      case 1012:
         var5.method1116(14);
      }

      class53.method1076(var5);
   }

   public class28 method6506() {
      if (!this.field3985.method6306()) {
         return null;
      } else if (!this.field3955.method543()) {
         return null;
      } else {
         HashMap var1 = this.field3955.method544();
         this.field3990 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field3990.addAll(var3);
         }

         this.field3991 = this.field3990.iterator();
         return this.method6376();
      }
   }

   public class28 method6376() {
      if (this.field3991 == null) {
         return null;
      } else {
         return !this.field3991.hasNext() ? null : (class28)this.field3991.next();
      }
   }
}
