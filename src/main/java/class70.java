import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;

public class class70 {
   static int[] field1077;
   static String[] field1067;
   static int[] field1068 = new int[5];
   static int[][] field1069 = new int[5][5000];
   static int[] field1070 = new int[1000];
   static String[] field1065 = new String[1000];
   static int field1072;
   static int field1083 = 0;
   static class51[] field1074 = new class51[50];
   static class232 field1080;
   static Calendar field1076 = Calendar.getInstance();
   static final String[] field1071 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   static boolean field1078 = false;
   static boolean field1079 = false;
   static int field1075 = 0;
   static final double field1081 = Math.log(2.0D);

   static void method1949() {
      if (class156.field2017.toLowerCase().indexOf("microsoft") != -1) {
         class39.field392[186] = 57;
         class39.field392[187] = 27;
         class39.field392[188] = 71;
         class39.field392[189] = 26;
         class39.field392[190] = 72;
         class39.field392[191] = 73;
         class39.field392[192] = 58;
         class39.field392[219] = 42;
         class39.field392[220] = 74;
         class39.field392[221] = 43;
         class39.field392[222] = 59;
         class39.field392[223] = 28;
      } else {
         class39.field392[44] = 71;
         class39.field392[45] = 26;
         class39.field392[46] = 72;
         class39.field392[47] = 73;
         class39.field392[59] = 57;
         class39.field392[61] = 27;
         class39.field392[91] = 42;
         class39.field392[92] = 74;
         class39.field392[93] = 43;
         class39.field392[192] = 28;
         class39.field392[222] = 58;
         class39.field392[520] = 59;
      }

   }

   public static final class323 method1946(byte[] var0) {
      BufferedImage var1 = null;

      try {
         var1 = ImageIO.read(new ByteArrayInputStream(var0));
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         int[] var4 = new int[var3 * var2];
         PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
         var5.grabPixels();
         return new class323(var4, var2, var3);
      } catch (IOException var7) {
         ;
      } catch (InterruptedException var8) {
         ;
      }

      return new class323(0, 0);
   }

   static void method1947(class251 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class248 var8 = (class248)class252.field3270.method4224(var6);
      if (var8 == null) {
         var8 = (class248)class252.field3261.method4224(var6);
         if (var8 == null) {
            var8 = (class248)class252.field3266.method4224(var6);
            if (var8 != null) {
               if (var5) {
                  var8.method4308();
                  class252.field3270.method4226(var8, var6);
                  --class252.field3267;
                  ++class252.field3262;
               }

            } else {
               if (!var5) {
                  var8 = (class248)class252.field3268.method4224(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new class248();
               var8.field3219 = var0;
               var8.field3220 = var3;
               var8.field3221 = var4;
               if (var5) {
                  class252.field3270.method4226(var8, var6);
                  ++class252.field3262;
               } else {
                  class252.field3265.method4146(var8);
                  class252.field3266.method4226(var8, var6);
                  ++class252.field3267;
               }

            }
         }
      }
   }

   static void method1948() {
      class174 var0 = class131.method3243(class171.field2242, client.field690.field1282);
      var0.field2332.method3805(class17.method211());
      var0.field2332.method3754(class68.field1038);
      var0.field2332.method3754(class141.field1937);
      client.field690.method2193(var0);
   }
}
