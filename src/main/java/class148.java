public class class148 implements class190 {
   public static final class148 field1967 = new class148(2, 0);
   public static final class148 field1965 = new class148(0, 1);
   public static final class148 field1964 = new class148(1, 2);
   public static final class148 field1966 = new class148(3, 3);
   public static boolean[] field1970;
   public final int field1968;
   final int field1969;

   class148(int var1, int var2) {
      this.field1968 = var1;
      this.field1969 = var2;
   }

   public int vmethod6130() {
      return this.field1969;
   }

   static void method3368() {
      for(class69 var0 = (class69)class69.field1051.method4298(); var0 != null; var0 = (class69)class69.field1051.method4283()) {
         if (var0.field1064 != null) {
            class43.field413.method2214(var0.field1064);
            var0.field1064 = null;
         }

         if (var0.field1060 != null) {
            class43.field413.method2214(var0.field1060);
            var0.field1060 = null;
         }
      }

      class69.field1051.method4275();
   }

   static int method3363(class199 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         class213 var3 = (class213)var0.method4185((long)var1);
         return var3 == null ? var2 : var3.field2512;
      }
   }

   static String method3369(class199 var0, int var1, String var2) {
      if (var0 == null) {
         return var2;
      } else {
         class197 var3 = (class197)var0.method4185((long)var1);
         return var3 == null ? var2 : (String)var3.field2468;
      }
   }

   static final void method3370(class64 var0, int var1) {
      int var2;
      int var3;
      int var4;
      if (var0.field985 > client.field655) {
         var2 = var0.field985 - client.field655;
         var3 = var0.field983 * 128 + var0.field964 * 64;
         var4 = var0.field995 * 128 + var0.field964 * 64;
         var0.field953 += (var3 - var0.field953) / var2;
         var0.field999 += (var4 - var0.field999) / var2;
         var0.field955 = 0;
         var0.field990 = var0.field997;
      } else if (var0.field977 >= client.field655) {
         if (var0.field977 == client.field655 || var0.field971 == -1 || var0.field998 != 0 || var0.field989 + 1 > class29.method532(var0.field971).field3630[var0.field986]) {
            var2 = var0.field977 - var0.field985;
            var3 = client.field655 - var0.field985;
            var4 = var0.field983 * 128 + var0.field964 * 64;
            int var5 = var0.field995 * 128 + var0.field964 * 64;
            int var6 = var0.field982 * 128 + var0.field964 * 64;
            int var7 = var0.field984 * 128 + var0.field964 * 64;
            var0.field953 = (var6 * var3 + var4 * (var2 - var3)) / var2;
            var0.field999 = (var7 * var3 + var5 * (var2 - var3)) / var2;
         }

         var0.field955 = 0;
         var0.field990 = var0.field997;
         var0.field940 = var0.field990;
      } else {
         class261.method5118(var0);
      }

      if (var0.field953 < 128 || var0.field999 < 128 || var0.field953 >= 13184 || var0.field999 >= 13184) {
         var0.field971 = -1;
         var0.field976 = -1;
         var0.field985 = 0;
         var0.field977 = 0;
         var0.field953 = var0.field994[0] * 128 + var0.field964 * 64;
         var0.field999 = var0.field952[0] * 128 + var0.field964 * 64;
         var0.method1660();
      }

      if (class69.field1063 == var0 && (var0.field953 < 1536 || var0.field999 < 1536 || var0.field953 >= 11776 || var0.field999 >= 11776)) {
         var0.field971 = -1;
         var0.field976 = -1;
         var0.field985 = 0;
         var0.field977 = 0;
         var0.field953 = var0.field994[0] * 128 + var0.field964 * 64;
         var0.field999 = var0.field952[0] * 128 + var0.field964 * 64;
         var0.method1660();
      }

      class39.method759(var0);
      var0.field941 = false;
      class275 var8;
      if (var0.field972 != -1) {
         var8 = class29.method532(var0.field972);
         if (var8 != null && var8.field3623 != null) {
            ++var0.field970;
            if (var0.field969 < var8.field3623.length && var0.field970 > var8.field3630[var0.field969]) {
               var0.field970 = 1;
               ++var0.field969;
               class176.method3692(var8, var0.field969, var0.field953, var0.field999);
            }

            if (var0.field969 >= var8.field3623.length) {
               var0.field970 = 0;
               var0.field969 = 0;
               class176.method3692(var8, var0.field969, var0.field953, var0.field999);
            }
         } else {
            var0.field972 = -1;
         }
      }

      if (var0.field976 != -1 && client.field655 >= var0.field979) {
         if (var0.field993 < 0) {
            var0.field993 = 0;
         }

         var2 = class250.method4918(var0.field976).field3348;
         if (var2 != -1) {
            class275 var9 = class29.method532(var2);
            if (var9 != null && var9.field3623 != null) {
               ++var0.field978;
               if (var0.field993 < var9.field3623.length && var0.field978 > var9.field3630[var0.field993]) {
                  var0.field978 = 1;
                  ++var0.field993;
                  class176.method3692(var9, var0.field993, var0.field953, var0.field999);
               }

               if (var0.field993 >= var9.field3623.length && (var0.field993 < 0 || var0.field993 >= var9.field3623.length)) {
                  var0.field976 = -1;
               }
            } else {
               var0.field976 = -1;
            }
         } else {
            var0.field976 = -1;
         }
      }

      if (var0.field971 != -1 && var0.field998 <= 1) {
         var8 = class29.method532(var0.field971);
         if (var8.field3622 == 1 && var0.field959 > 0 && var0.field985 <= client.field655 && var0.field977 < client.field655) {
            var0.field998 = 1;
            return;
         }
      }

      if (var0.field971 != -1 && var0.field998 == 0) {
         var8 = class29.method532(var0.field971);
         if (var8 != null && var8.field3623 != null) {
            ++var0.field989;
            if (var0.field986 < var8.field3623.length && var0.field989 > var8.field3630[var0.field986]) {
               var0.field989 = 1;
               ++var0.field986;
               class176.method3692(var8, var0.field986, var0.field953, var0.field999);
            }

            if (var0.field986 >= var8.field3623.length) {
               var0.field986 -= var8.field3624;
               ++var0.field975;
               if (var0.field975 >= var8.field3633) {
                  var0.field971 = -1;
               } else if (var0.field986 >= 0 && var0.field986 < var8.field3623.length) {
                  class176.method3692(var8, var0.field986, var0.field953, var0.field999);
               } else {
                  var0.field971 = -1;
               }
            }

            var0.field941 = var8.field3626;
         } else {
            var0.field971 = -1;
         }
      }

      if (var0.field998 > 0) {
         --var0.field998;
      }

   }
}
