import java.text.DecimalFormat;
import java.util.concurrent.ScheduledExecutorService;

public class class79 {
   static boolean field1174;
   static int field1143 = 0;
   static class322 field1149;
   static class323 field1145;
   static class323 field1146;
   static ScheduledExecutorService field1155;
   static class322[] field1147;
   static class322 field1148;
   static int field1144;
   static class184 field1181;
   static int[] field1162;
   static int[] field1151;
   static int field1152;
   static int field1153;
   static int field1160;
   static int field1173;
   static int field1156;
   static int field1157;
   static int field1158;
   static String field1159;
   static int field1142;
   static int field1161;
   static class315 field1177;
   static int field1163;
   static String field1168;
   static String field1165;
   static String field1166;
   static String field1167;
   static String field1180;
   static String field1169;
   static boolean field1170;
   static boolean field1171;
   static boolean field1172;
   static int field1150;
   static boolean field1176;
   static int field1164;
   static long field1178;
   static long field1179;

   static {
      field1144 = field1143 + 202;
      field1162 = new int[256];
      field1152 = 0;
      field1153 = 0;
      field1160 = 0;
      field1173 = 0;
      field1156 = 0;
      field1157 = 0;
      field1158 = 10;
      field1159 = "";
      field1142 = -1;
      field1161 = 1;
      field1163 = 0;
      field1168 = "";
      field1165 = "";
      field1166 = "";
      field1167 = "";
      field1180 = "";
      field1169 = "";
      field1170 = false;
      field1171 = false;
      field1172 = true;
      field1150 = 0;
      field1176 = false;
      field1164 = -1;
      new DecimalFormat("##0.00");
      new class150();
      field1178 = -1L;
      field1179 = -1L;
   }

   public static void method2036(int var0) {
      if (var0 != -1) {
         if (class148.field1970[var0]) {
            class232.field2757.method4843(var0);
            if (class145.field1951[var0] != null) {
               boolean var1 = true;

               for(int var2 = 0; var2 < class145.field1951[var0].length; ++var2) {
                  if (class145.field1951[var0][var2] != null) {
                     if (class145.field1951[var0][var2].field2808 != 2) {
                        class145.field1951[var0][var2] = null;
                     } else {
                        var1 = false;
                     }
                  }
               }

               if (var1) {
                  class145.field1951[var0] = null;
               }

               class148.field1970[var0] = false;
            }
         }
      }
   }

   static final int method2040(int var0, int var1, int var2) {
      int var3 = 256 - var2;
      return ((var1 & '\uff00') * var2 + (var0 & '\uff00') * var3 & 16711680) + ((var1 & 16711935) * var2 + var3 * (var0 & 16711935) & -16711936) >> 8;
   }

   public static final void method2039(String var0, String var1, int var2, int var3, int var4, int var5) {
      class183.method3749(var0, var1, var2, var3, var4, var5, false);
   }
}
