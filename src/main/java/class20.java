import java.util.Iterator;
import java.util.LinkedList;

public class class20 {
   int field200 = -1;
   String field201;
   String field192;
   int field195 = -1;
   int field196 = -1;
   class228 field197 = null;
   int field198 = Integer.MAX_VALUE;
   int field199 = 0;
   int field194 = Integer.MAX_VALUE;
   int field203 = 0;
   boolean field202 = false;
   LinkedList field193;

   public void method262(class184 var1, int var2) {
      this.field200 = var2;
      this.field201 = var1.method3778();
      this.field192 = var1.method3778();
      this.field197 = new class228(var1.method3892());
      this.field195 = var1.method3892();
      var1.method3983();
      this.field202 = var1.method3983() == 1;
      this.field196 = var1.method3983();
      int var3 = var1.method3983();
      this.field193 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field193.add(this.method247(var1));
      }

      this.method289();
   }

   class31 method247(class184 var1) {
      int var2 = var1.method3983();
      class15 var3 = (class15)class43.method791(class15.method170(), var2);
      Object var4 = null;
      switch(var3.field137) {
      case 0:
         var4 = new class14();
         break;
      case 1:
         var4 = new class27();
         break;
      case 2:
         var4 = new class37();
         break;
      case 3:
         var4 = new class18();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class31)var4).vmethod709(var1);
      return (class31)var4;
   }

   public boolean method248(int var1, int var2, int var3) {
      Iterator var4 = this.field193.iterator();

      class31 var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (class31)var4.next();
      } while(!var5.vmethod696(var1, var2, var3));

      return true;
   }

   public boolean method249(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.field198 && var3 <= this.field199) {
         if (var4 >= this.field194 && var4 <= this.field203) {
            Iterator var5 = this.field193.iterator();

            class31 var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (class31)var5.next();
            } while(!var6.vmethod706(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int[] method250(int var1, int var2, int var3) {
      Iterator var4 = this.field193.iterator();

      class31 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class31)var4.next();
      } while(!var5.vmethod696(var1, var2, var3));

      return var5.vmethod715(var1, var2, var3);
   }

   public class228 method279(int var1, int var2) {
      Iterator var3 = this.field193.iterator();

      class31 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class31)var3.next();
      } while(!var4.vmethod706(var1, var2));

      return var4.vmethod695(var1, var2);
   }

   void method289() {
      Iterator var1 = this.field193.iterator();

      while(var1.hasNext()) {
         class31 var2 = (class31)var1.next();
         var2.vmethod697(this);
      }

   }

   public int method253() {
      return this.field200;
   }

   public boolean method254() {
      return this.field202;
   }

   public String method264() {
      return this.field201;
   }

   public String method267() {
      return this.field192;
   }

   int method257() {
      return this.field195;
   }

   public int method258() {
      return this.field196;
   }

   public int method280() {
      return this.field198;
   }

   public int method260() {
      return this.field199;
   }

   public int method251() {
      return this.field194;
   }

   public int method271() {
      return this.field203;
   }

   public int method303() {
      return this.field197.field2632;
   }

   public int method256() {
      return this.field197.field2634;
   }

   public int method265() {
      return this.field197.field2633;
   }

   public class228 method266() {
      return new class228(this.field197);
   }

   static void method317(class249 var0, class249 var1, boolean var2, int var3) {
      if (class79.field1174) {
         if (var3 == 4) {
            class79.field1163 = 4;
         }

      } else {
         class79.field1163 = var3;
         class319.method6043();
         byte[] var4 = var0.method4849("title.jpg", "");
         class79.field1145 = class70.method1946(var4);
         class79.field1146 = class79.field1145.method6153();
         if ((client.field660 & 536870912) != 0) {
            class265.field3401 = class257.method5047(var1, "logo_deadman_mode", "");
         } else {
            class265.field3401 = class257.method5047(var1, "logo", "");
         }

         class79.field1149 = class257.method5047(var1, "titlebox", "");
         class307.field3801 = class257.method5047(var1, "titlebutton", "");
         int var6 = var1.method4825("runes");
         int var7 = var1.method4847(var6, "");
         class322[] var8;
         if (!class17.method212(var1, var6, var7)) {
            var8 = null;
         } else {
            var8 = class311.method5957();
         }

         class6.field44 = var8;
         var7 = var1.method4825("title_mute");
         int var10 = var1.method4847(var7, "");
         class322[] var9;
         if (!class17.method212(var1, var7, var10)) {
            var9 = null;
         } else {
            var9 = class311.method5957();
         }

         class79.field1147 = var9;
         class185.field2417 = class257.method5047(var1, "options_radio_buttons,0", "");
         class79.field1148 = class257.method5047(var1, "options_radio_buttons,4", "");
         class132.field1861 = class257.method5047(var1, "options_radio_buttons,2", "");
         class138.field1925 = class257.method5047(var1, "options_radio_buttons,6", "");
         class69.field1050 = class185.field2417.field3872;
         class42.field405 = class185.field2417.field3873;
         class79.field1151 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class79.field1151[var7] = var7 * 262144;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class79.field1151[var7 + 64] = var7 * 1024 + 16711680;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class79.field1151[var7 + 128] = var7 * 4 + 16776960;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class79.field1151[var7 + 192] = 16777215;
         }

         class58.field583 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class58.field583[var7] = var7 * 1024;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class58.field583[var7 + 64] = var7 * 4 + '\uff00';
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class58.field583[var7 + 128] = var7 * 262144 + '\uffff';
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class58.field583[var7 + 192] = 16777215;
         }

         class161.field2048 = new int[256];

         for(var7 = 0; var7 < 64; ++var7) {
            class161.field2048[var7] = var7 * 4;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class161.field2048[var7 + 64] = var7 * 262144 + 255;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class161.field2048[var7 + 128] = var7 * 1024 + 16711935;
         }

         for(var7 = 0; var7 < 64; ++var7) {
            class161.field2048[var7 + 192] = 16777215;
         }

         class69.field1047 = new int[256];
         class62.field640 = new int['耀'];
         class32.field322 = new int['耀'];
         class278.method5494((class322)null);
         class19.field182 = new int['耀'];
         class19.field183 = new int['耀'];
         if (var2) {
            class79.field1180 = "";
            class79.field1169 = "";
         }

         class60.field604 = 0;
         class10.field82 = "";
         class79.field1172 = true;
         class79.field1176 = false;
         if (!class47.field435.field1035) {
            class27.method516(2, class170.field2117, "scape main", "", 255, false);
         } else {
            class180.method3732(2);
         }

         class227.method4642(false);
         class79.field1174 = true;
         class79.field1143 = (class68.field1038 - 765) / 2;
         class79.field1144 = class79.field1143 + 202;
         class13.field103 = class79.field1144 + 180;
         class79.field1145.method6184(class79.field1143, 0);
         class79.field1146.method6184(class79.field1143 + 382, 0);
         class265.field3401.method6143(class79.field1143 + 382 - class265.field3401.field3872 / 2, 18);
      }
   }

   static final void method318(String var0) {
      class34.method643("Please remove " + var0 + " from your friend list first");
   }
}
