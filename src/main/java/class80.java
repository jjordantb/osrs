import java.io.DataInputStream;
import java.net.URL;

public final class class80 extends class129 {
   int field1196;
   int field1183;
   int field1206;
   int field1202;
   int field1186;
   int field1187;
   int field1188;
   int field1189;
   int field1190;
   int field1195;
   int field1192;
   boolean field1193 = false;
   double field1185;
   double field1191;
   double field1184;
   double field1197;
   double field1182;
   double field1199;
   double field1200;
   double field1201;
   int field1194;
   int field1203;
   class275 field1204;
   int field1205 = 0;
   int field1198 = 0;

   class80(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field1196 = var1;
      this.field1183 = var2;
      this.field1206 = var3;
      this.field1202 = var4;
      this.field1186 = var5;
      this.field1188 = var6;
      this.field1189 = var7;
      this.field1190 = var8;
      this.field1195 = var9;
      this.field1192 = var10;
      this.field1187 = var11;
      this.field1193 = false;
      int var12 = class250.method4918(this.field1196).field3348;
      if (var12 != -1) {
         this.field1204 = class29.method532(var12);
      } else {
         this.field1204 = null;
      }

   }

   final void method2042(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.field1193) {
         var5 = (double)(var1 - this.field1206);
         double var7 = (double)(var2 - this.field1202);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.field1185 = (double)this.field1206 + var5 * (double)this.field1195 / var9;
         this.field1191 = (double)this.field1202 + var7 * (double)this.field1195 / var9;
         this.field1184 = (double)this.field1186;
      }

      var5 = (double)(this.field1189 + 1 - var4);
      this.field1197 = ((double)var1 - this.field1185) / var5;
      this.field1182 = ((double)var2 - this.field1191) / var5;
      this.field1199 = Math.sqrt(this.field1197 * this.field1197 + this.field1182 * this.field1182);
      if (!this.field1193) {
         this.field1200 = -this.field1199 * Math.tan((double)this.field1190 * 0.02454369D);
      }

      this.field1201 = 2.0D * ((double)var3 - this.field1184 - var5 * this.field1200) / (var5 * var5);
   }

   final void method2048(int var1) {
      this.field1193 = true;
      this.field1185 += (double)var1 * this.field1197;
      this.field1191 += this.field1182 * (double)var1;
      this.field1184 += this.field1200 * (double)var1 + (double)var1 * 0.5D * this.field1201 * (double)var1;
      this.field1200 += this.field1201 * (double)var1;
      this.field1194 = (int)(Math.atan2(this.field1197, this.field1182) * 325.949D) + 1024 & 2047;
      this.field1203 = (int)(Math.atan2(this.field1200, this.field1199) * 325.949D) & 2047;
      if (this.field1204 != null) {
         this.field1198 += var1;

         while(true) {
            do {
               do {
                  if (this.field1198 <= this.field1204.field3630[this.field1205]) {
                     return;
                  }

                  this.field1198 -= this.field1204.field3630[this.field1205];
                  ++this.field1205;
               } while(this.field1205 < this.field1204.field3623.length);

               this.field1205 -= this.field1204.field3624;
            } while(this.field1205 >= 0 && this.field1205 < this.field1204.field3623.length);

            this.field1205 = 0;
         }
      }
   }

   protected final class121 vmethod3236() {
      class260 var1 = class250.method4918(this.field1196);
      class121 var2 = var1.method5088(this.field1205);
      if (var2 == null) {
         return null;
      } else {
         var2.method2938(this.field1203);
         return var2;
      }
   }

   public static void method2041(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               var2 = class113.method2767(var1);
            }

            if (var0 != null) {
               if (var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if (class154.field1999 == null) {
               return;
            }

            URL var3 = new URL(class154.field1999.getCodeBase(), "clienterror.ws?c=" + class313.field3831 + "&u=" + class154.field1995 + "&v1=" + class156.field2017 + "&v2=" + class156.field2013 + "&ct=" + class25.field256 + "&e=" + var2);
            DataInputStream var4 = new DataInputStream(var3.openStream());
            var4.read();
            var4.close();
         } catch (Exception var5) {
            ;
         }

      }
   }

   static class86 method2052(byte[] var0) {
      class86 var1 = new class86();
      class184 var2 = new class184(var0);
      var2.field2405 = var2.field2404.length - 2;
      int var3 = var2.method3771();
      int var4 = var2.field2404.length - 2 - var3 - 12;
      var2.field2405 = var4;
      int var5 = var2.method3892();
      var1.field1256 = var2.method3771();
      var1.field1254 = var2.method3771();
      var1.field1258 = var2.method3771();
      var1.field1259 = var2.method3771();
      int var6 = var2.method3983();
      int var7;
      int var8;
      if (var6 > 0) {
         var1.field1253 = var1.method2151(var6);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.method3771();
            class199 var9 = new class199(var8 > 0 ? class3.method28(var8) : 1);
            var1.field1253[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.method3892();
               int var11 = var2.method3892();
               var9.method4170(new class213(var11), (long)var10);
            }
         }
      }

      var2.field2405 = 0;
      var2.method3777();
      var1.field1257 = new int[var5];
      var1.field1252 = new int[var5];
      var1.field1255 = new String[var5];

      for(var7 = 0; var2.field2405 < var4; var1.field1257[var7++] = var8) {
         var8 = var2.method3771();
         if (var8 == 3) {
            var1.field1255[var7] = var2.method3778();
         } else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
            var1.field1252[var7] = var2.method3892();
         } else {
            var1.field1252[var7] = var2.method3983();
         }
      }

      return var1;
   }

   static final void method2053() {
      for(int var0 = 0; var0 < client.field686; ++var0) {
         int var1 = client.field687[var0];
         class73 var2 = client.field806[var1];
         if (var2 != null) {
            class148.method3370(var2, var2.field1102.field3600);
         }
      }

   }
}
