public class class26 {
   protected static boolean field264;

   static class223 method490(class249 var0, int var1) {
      byte[] var2 = var0.method4835(var1);
      return var2 == null ? null : new class223(var2);
   }

   public static int method491(byte[] var0, int var1, CharSequence var2) {
      int var3 = var2.length();
      int var4 = var1;

      for(int var5 = 0; var5 < var3; ++var5) {
         char var6 = var2.charAt(var5);
         if (var6 <= '\u007f') {
            var0[var4++] = (byte)var6;
         } else if (var6 <= '\u07ff') {
            var0[var4++] = (byte)(192 | var6 >> 6);
            var0[var4++] = (byte)(128 | var6 & 63);
         } else {
            var0[var4++] = (byte)(224 | var6 >> 12);
            var0[var4++] = (byte)(128 | var6 >> 6 & 63);
            var0[var4++] = (byte)(128 | var6 & 63);
         }
      }

      return var4 - var1;
   }

   static int method489(int var0, class86 var1, boolean var2) {
      int var4 = -1;
      class232 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class70.field1070[--class60.field600];
         var3 = class18.method213(var4);
      } else {
         var3 = var2 ? class10.field75 : class70.field1080;
      }

      if (var0 == 1100) {
         class60.field600 -= 2;
         var3.field2711 = class70.field1070[class60.field600];
         if (var3.field2711 > var3.field2690 - var3.field2682) {
            var3.field2711 = var3.field2690 - var3.field2682;
         }

         if (var3.field2711 < 0) {
            var3.field2711 = 0;
         }

         var3.field2689 = class70.field1070[class60.field600 + 1];
         if (var3.field2689 > var3.field2691 - var3.field2683) {
            var3.field2689 = var3.field2691 - var3.field2683;
         }

         if (var3.field2689 < 0) {
            var3.field2689 = 0;
         }

         class37.method721(var3);
         return 1;
      } else if (var0 == 1101) {
         var3.field2686 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1102) {
         var3.field2696 = class70.field1070[--class60.field600] == 1;
         class37.method721(var3);
         return 1;
      } else if (var0 == 1103) {
         var3.field2698 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1104) {
         var3.field2768 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1105) {
         var3.field2702 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1106) {
         var3.field2780 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1107) {
         var3.field2705 = class70.field1070[--class60.field600] == 1;
         class37.method721(var3);
         return 1;
      } else if (var0 == 1108) {
         var3.field2740 = 1;
         var3.field2755 = class70.field1070[--class60.field600];
         class37.method721(var3);
         return 1;
      } else if (var0 == 1109) {
         class60.field600 -= 6;
         var3.field2718 = class70.field1070[class60.field600];
         var3.field2717 = class70.field1070[class60.field600 + 1];
         var3.field2732 = class70.field1070[class60.field600 + 2];
         var3.field2719 = class70.field1070[class60.field600 + 3];
         var3.field2720 = class70.field1070[class60.field600 + 4];
         var3.field2721 = class70.field1070[class60.field600 + 5];
         class37.method721(var3);
         return 1;
      } else {
         int var8;
         if (var0 == 1110) {
            var8 = class70.field1070[--class60.field600];
            if (var8 != var3.field2714) {
               var3.field2714 = var8;
               var3.field2795 = 0;
               var3.field2750 = 0;
               class37.method721(var3);
            }

            return 1;
         } else if (var0 == 1111) {
            var3.field2688 = class70.field1070[--class60.field600] == 1;
            class37.method721(var3);
            return 1;
         } else if (var0 == 1112) {
            String var7 = class70.field1065[--class70.field1072];
            if (!var7.equals(var3.field2728)) {
               var3.field2728 = var7;
               class37.method721(var3);
            }

            return 1;
         } else if (var0 == 1113) {
            var3.field2727 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1114) {
            class60.field600 -= 3;
            var3.field2681 = class70.field1070[class60.field600];
            var3.field2776 = class70.field1070[class60.field600 + 1];
            var3.field2730 = class70.field1070[class60.field600 + 2];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1115) {
            var3.field2716 = class70.field1070[--class60.field600] == 1;
            class37.method721(var3);
            return 1;
         } else if (var0 == 1116) {
            var3.field2706 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1117) {
            var3.field2707 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1118) {
            var3.field2671 = class70.field1070[--class60.field600] == 1;
            class37.method721(var3);
            return 1;
         } else if (var0 == 1119) {
            var3.field2709 = class70.field1070[--class60.field600] == 1;
            class37.method721(var3);
            return 1;
         } else if (var0 == 1120) {
            class60.field600 -= 2;
            var3.field2690 = class70.field1070[class60.field600];
            var3.field2691 = class70.field1070[class60.field600 + 1];
            class37.method721(var3);
            if (var4 != -1 && var3.field2808 == 0) {
               class223.method4594(class145.field1951[var4 >> 16], var3, false);
            }

            return 1;
         } else if (var0 == 1121) {
            class275.method5474(var3.field2770, var3.field2787);
            client.field880 = var3;
            class37.method721(var3);
            return 1;
         } else if (var0 == 1122) {
            var3.field2703 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1123) {
            var3.field2693 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1124) {
            var3.field2699 = class70.field1070[--class60.field600];
            class37.method721(var3);
            return 1;
         } else if (var0 == 1125) {
            var8 = class70.field1070[--class60.field600];
            class321 var6 = (class321)class43.method791(class136.method3271(), var8);
            if (var6 != null) {
               var3.field2744 = var6;
               class37.method721(var3);
            }

            return 1;
         } else {
            boolean var5;
            if (var0 == 1126) {
               var5 = class70.field1070[--class60.field600] == 1;
               var3.field2701 = var5;
               return 1;
            } else if (var0 == 1127) {
               var5 = class70.field1070[--class60.field600] == 1;
               var3.field2725 = var5;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
