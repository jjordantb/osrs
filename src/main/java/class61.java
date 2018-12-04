import java.net.MalformedURLException;
import java.net.URL;

public final class class61 extends class64 {
   static class327 field634;
   static class323[] field635;
   class293 field625;
   class229 field630;
   int field629 = -1;
   int field609 = -1;
   String[] field627 = new String[3];
   int field611;
   int field617;
   int field613;
   int field614;
   int field615;
   int field616;
   int field610;
   int field612;
   class121 field619;
   int field608;
   int field606;
   int field621;
   int field623;
   boolean field624;
   int field622;
   boolean field626;
   int field620;
   int field628;
   class291 field607;
   class291 field618;
   boolean field631;
   int field632;
   int field633;

   class61() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field627[var1] = "";
      }

      this.field611 = 0;
      this.field617 = 0;
      this.field614 = 0;
      this.field615 = 0;
      this.field624 = false;
      this.field622 = 0;
      this.field626 = false;
      this.field607 = class291.field3713;
      this.field618 = class291.field3713;
      this.field631 = false;
   }

   final void method1172(class184 var1) {
      var1.field2405 = 0;
      int var2 = var1.method3983();
      this.field629 = var1.method3931();
      this.field609 = var1.method3931();
      int var3 = -1;
      this.field622 = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.method3983();
         if (var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.method3983();
            var4[var5] = var7 + (var6 << 8);
            if (var5 == 0 && var4[0] == 65535) {
               var3 = var1.method3771();
               break;
            }

            if (var4[var5] >= 512) {
               int var8 = class84.method2125(var4[var5] - 512).field3540;
               if (var8 != 0) {
                  this.field622 = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.method3983();
         if (var7 < 0 || var7 >= class256.field3306[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.field944 = var1.method3771();
      if (super.field944 == 65535) {
         super.field944 = -1;
      }

      super.field945 = var1.method3771();
      if (super.field945 == 65535) {
         super.field945 = -1;
      }

      super.field957 = super.field945;
      super.field942 = var1.method3771();
      if (super.field942 == 65535) {
         super.field942 = -1;
      }

      super.field948 = var1.method3771();
      if (super.field948 == 65535) {
         super.field948 = -1;
      }

      super.field949 = var1.method3771();
      if (super.field949 == 65535) {
         super.field949 = -1;
      }

      super.field950 = var1.method3771();
      if (super.field950 == 65535) {
         super.field950 = -1;
      }

      super.field951 = var1.method3771();
      if (super.field951 == 65535) {
         super.field951 = -1;
      }

      this.field625 = new class293(var1.method3778(), client.field920);
      this.method1174();
      this.method1186();
      if (this == class69.field1063) {
         class154.field1995 = this.field625.method5706();
      }

      this.field611 = var1.method3983();
      this.field617 = var1.method3771();
      this.field626 = var1.method3983() == 1;
      if (client.field645 == 0 && client.field812 >= 2) {
         this.field626 = false;
      }

      if (this.field630 == null) {
         this.field630 = new class229();
      }

      this.field630.method4664(var4, var9, var2 == 1, var3);
   }

   boolean method1173() {
      if (this.field607 == class291.field3713) {
         this.method1175();
      }

      return this.field607 == class291.field3712;
   }

   void method1174() {
      this.field607 = class291.field3713;
   }

   void method1175() {
      this.field607 = class170.field2150.method1764(this.field625) ? class291.field3712 : class291.field3711;
   }

   boolean method1176() {
      if (this.field618 == class291.field3713) {
         this.method1177();
      }

      return this.field618 == class291.field3712;
   }

   void method1186() {
      this.field618 = class291.field3713;
   }

   void method1177() {
      this.field618 = class3.field26 != null && class3.field26.method5608(this.field625) ? class291.field3712 : class291.field3711;
   }

   int method1178() {
      return this.field630 != null && this.field630.field2639 != -1 ? class248.method4823(this.field630.field2639).field3600 : 1;
   }

   protected final class121 vmethod3236() {
      if (this.field630 == null) {
         return null;
      } else {
         class275 var1 = super.field971 != -1 && super.field998 == 0 ? class29.method532(super.field971) : null;
         class275 var2 = super.field972 != -1 && !this.field624 && (super.field944 != super.field972 || var1 == null) ? class29.method532(super.field972) : null;
         class121 var3 = this.field630.method4670(var1, super.field986, var2, super.field969);
         if (var3 == null) {
            return null;
         } else {
            var3.method2873();
            super.field946 = var3.field1840;
            class121 var4;
            class121[] var5;
            if (!this.field624 && super.field976 != -1 && super.field993 != -1) {
               var4 = class250.method4918(super.field976).method5088(super.field993);
               if (var4 != null) {
                  var4.method2885(0, -super.field980, 0);
                  var5 = new class121[]{var3, var4};
                  var3 = new class121(var5, 2);
               }
            }

            if (!this.field624 && this.field619 != null) {
               if (client.field655 >= this.field615) {
                  this.field619 = null;
               }

               if (client.field655 >= this.field614 && client.field655 < this.field615) {
                  var4 = this.field619;
                  var4.method2885(this.field616 - super.field953, this.field610 - this.field613, this.field612 - super.field999);
                  if (super.field990 == 512) {
                     var4.method2880();
                     var4.method2880();
                     var4.method2880();
                  } else if (super.field990 == 1024) {
                     var4.method2880();
                     var4.method2880();
                  } else if (super.field990 == 1536) {
                     var4.method2880();
                  }

                  var5 = new class121[]{var3, var4};
                  var3 = new class121(var5, 2);
                  if (super.field990 == 512) {
                     var4.method2880();
                  } else if (super.field990 == 1024) {
                     var4.method2880();
                     var4.method2880();
                  } else if (super.field990 == 1536) {
                     var4.method2880();
                     var4.method2880();
                     var4.method2880();
                  }

                  var4.method2885(super.field953 - this.field616, this.field613 - this.field610, super.field999 - this.field612);
               }
            }

            var3.field1664 = true;
            return var3;
         }
      }
   }

   final void method1180(int var1, int var2, byte var3) {
      if (super.field971 != -1 && class29.method532(super.field971).field3632 == 1) {
         super.field971 = -1;
      }

      super.field967 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field994[0] >= 0 && super.field994[0] < 104 && super.field952[0] >= 0 && super.field952[0] < 104) {
            if (var3 == 2) {
               class267.method5221(this, var1, var2, (byte)2);
            }

            this.method1195(var1, var2, var3);
         } else {
            this.method1210(var1, var2);
         }
      } else {
         this.method1210(var1, var2);
      }

   }

   void method1210(int var1, int var2) {
      super.field939 = 0;
      super.field959 = 0;
      super.field955 = 0;
      super.field994[0] = var1;
      super.field952[0] = var2;
      int var3 = this.method1178();
      super.field953 = super.field994[0] * 128 + var3 * 64;
      super.field999 = var3 * 64 + super.field952[0] * 128;
   }

   final void method1195(int var1, int var2, byte var3) {
      if (super.field939 < 9) {
         ++super.field939;
      }

      for(int var4 = super.field939; var4 > 0; --var4) {
         super.field994[var4] = super.field994[var4 - 1];
         super.field952[var4] = super.field952[var4 - 1];
         super.field996[var4] = super.field996[var4 - 1];
      }

      super.field994[0] = var1;
      super.field952[0] = var2;
      super.field996[0] = var3;
   }

   final boolean vmethod1973() {
      return this.field630 != null;
   }

   static void method1202() {
      class112 var0 = null;

      try {
         var0 = class7.method85("", client.field646.field3202, true);
         class184 var1 = class47.field435.method1740();
         var0.method2716(var1.field2404, 0, var1.field2405);
      } catch (Exception var3) {
         ;
      }

      try {
         if (var0 != null) {
            var0.method2740(true);
         }
      } catch (Exception var2) {
         ;
      }

   }

   static int method1219(int var0, int var1) {
      class54 var2 = (class54)class54.field534.method4224((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.field532.length; ++var4) {
            if (var2.field533[var4] == var1) {
               var3 += var2.field532[var4];
            }
         }

         return var3;
      }
   }

   static boolean method1218(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static void method1207(class61 var0, boolean var1) {
      if (var0 != null && var0.vmethod1973() && !var0.field626) {
         var0.field624 = false;
         if ((client.field648 && class83.field1226 > 50 || class83.field1226 > 200) && var1 && var0.field972 == var0.field944) {
            var0.field624 = true;
         }

         int var2 = var0.field953 >> 7;
         int var3 = var0.field999 >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class0.method12(0, 0, 0, false, var0.field628);
            if (var0.field619 != null && client.field655 >= var0.field614 && client.field655 < var0.field615) {
               var0.field624 = false;
               var0.field613 = class152.method3394(var0.field953, var0.field999, class60.field599);
               var0.field943 = client.field655;
               class243.field3173.method3069(class60.field599, var0.field953, var0.field999, var0.field613, 60, var0, var0.field940, var4, var0.field608, var0.field606, var0.field621, var0.field623);
            } else {
               if ((var0.field953 & 127) == 64 && (var0.field999 & 127) == 64) {
                  if (client.field740[var2][var3] == client.field741) {
                     return;
                  }

                  client.field740[var2][var3] = client.field741;
               }

               var0.field613 = class152.method3394(var0.field953, var0.field999, class60.field599);
               var0.field943 = client.field655;
               class243.field3173.method3092(class60.field599, var0.field953, var0.field999, var0.field613, 60, var0, var0.field940, var4, var0.field941);
            }
         }
      }

   }
}
