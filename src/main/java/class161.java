import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class class161 extends class159 {
   static int field2051;
   static int[] field2048;
   Socket field2047;
   class153 field2049;
   class165 field2046;

   public class161(Socket var1, int var2, int var3) throws IOException {
      this.field2047 = var1;
      this.field2047.setSoTimeout(30000);
      this.field2047.setTcpNoDelay(true);
      this.field2047.setReceiveBufferSize(65536);
      this.field2047.setSendBufferSize(65536);
      this.field2049 = new class153(this.field2047.getInputStream(), var2);
      this.field2046 = new class165(this.field2047.getOutputStream(), var3);
   }

   public boolean vmethod3554(int var1) throws IOException {
      return this.field2049.method3399(var1);
   }

   public int vmethod3553() throws IOException {
      return this.field2049.method3397();
   }

   public int vmethod3562() throws IOException {
      return this.field2049.method3398();
   }

   public int vmethod3555(byte[] var1, int var2, int var3) throws IOException {
      return this.field2049.method3407(var1, var2, var3);
   }

   public void vmethod3578(byte[] var1, int var2, int var3) throws IOException {
      this.field2046.method3600(var1, var2, var3);
   }

   public void vmethod3558() {
      this.field2046.method3601();

      try {
         this.field2047.close();
      } catch (IOException var2) {
         ;
      }

      this.field2049.method3405();
   }

   protected void finalize() {
      this.vmethod3558();
   }

   public static void method3528(class249 var0, int var1, int var2, int var3, boolean var4) {
      class219.field2529 = 1;
      class137.field1911 = var0;
      class219.field2533 = var1;
      class164.field2073 = var2;
      class318.field3851 = var3;
      class219.field2534 = var4;
      class0.field0 = 10000;
   }

   public static int method3532(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+') {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   static int method3531(int var0, class86 var1, boolean var2) {
      String var3;
      int var4;
      if (var0 == 4100) {
         var3 = class70.field1065[--class70.field1072];
         var4 = class70.field1070[--class60.field600];
         class70.field1065[++class70.field1072 - 1] = var3 + var4;
         return 1;
      } else {
         String var9;
         if (var0 == 4101) {
            class70.field1072 -= 2;
            var3 = class70.field1065[class70.field1072];
            var9 = class70.field1065[class70.field1072 + 1];
            class70.field1065[++class70.field1072 - 1] = var3 + var9;
            return 1;
         } else if (var0 == 4102) {
            var3 = class70.field1065[--class70.field1072];
            var4 = class70.field1070[--class60.field600];
            class70.field1065[++class70.field1072 - 1] = var3 + class33.method616(var4, true);
            return 1;
         } else if (var0 == 4103) {
            var3 = class70.field1065[--class70.field1072];
            class70.field1065[++class70.field1072 - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var10;
            if (var0 == 4104) {
               var10 = class70.field1070[--class60.field600];
               long var11 = (11745L + (long)var10) * 86400000L;
               class70.field1076.setTime(new Date(var11));
               var6 = class70.field1076.get(5);
               int var16 = class70.field1076.get(2);
               int var8 = class70.field1076.get(1);
               class70.field1065[++class70.field1072 - 1] = var6 + "-" + class70.field1071[var16] + "-" + var8;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var10 = class70.field1070[--class60.field600];
                  class70.field1065[++class70.field1072 - 1] = Integer.toString(var10);
                  return 1;
               } else if (var0 == 4107) {
                  class70.field1072 -= 2;
                  class70.field1070[++class60.field600 - 1] = class134.method3263(class10.method116(class70.field1065[class70.field1072], class70.field1065[class70.field1072 + 1], client.field785));
                  return 1;
               } else {
                  int var5;
                  byte[] var13;
                  class300 var14;
                  if (var0 == 4108) {
                     var3 = class70.field1065[--class70.field1072];
                     class60.field600 -= 2;
                     var4 = class70.field1070[class60.field600];
                     var5 = class70.field1070[class60.field600 + 1];
                     var13 = class71.field1091.method4831(var5, 0);
                     var14 = new class300(var13);
                     class70.field1070[++class60.field600 - 1] = var14.method5796(var3, var4);
                     return 1;
                  } else if (var0 == 4109) {
                     var3 = class70.field1065[--class70.field1072];
                     class60.field600 -= 2;
                     var4 = class70.field1070[class60.field600];
                     var5 = class70.field1070[class60.field600 + 1];
                     var13 = class71.field1091.method4831(var5, 0);
                     var14 = new class300(var13);
                     class70.field1070[++class60.field600 - 1] = var14.method5795(var3, var4);
                     return 1;
                  } else if (var0 == 4110) {
                     class70.field1072 -= 2;
                     var3 = class70.field1065[class70.field1072];
                     var9 = class70.field1065[class70.field1072 + 1];
                     if (class70.field1070[--class60.field600] == 1) {
                        class70.field1065[++class70.field1072 - 1] = var3;
                     } else {
                        class70.field1065[++class70.field1072 - 1] = var9;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var3 = class70.field1065[--class70.field1072];
                     class70.field1065[++class70.field1072 - 1] = class301.method5797(var3);
                     return 1;
                  } else if (var0 == 4112) {
                     var3 = class70.field1065[--class70.field1072];
                     var4 = class70.field1070[--class60.field600];
                     class70.field1065[++class70.field1072 - 1] = var3 + (char)var4;
                     return 1;
                  } else if (var0 == 4113) {
                     var10 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = class24.method473((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var10 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = class254.method5002((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var10 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = class246.method4817((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var10 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = class239.method4788((char)var10) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var3 = class70.field1065[--class70.field1072];
                     if (var3 != null) {
                        class70.field1070[++class60.field600 - 1] = var3.length();
                     } else {
                        class70.field1070[++class60.field600 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var3 = class70.field1065[--class70.field1072];
                     class60.field600 -= 2;
                     var4 = class70.field1070[class60.field600];
                     var5 = class70.field1070[class60.field600 + 1];
                     class70.field1065[++class70.field1072 - 1] = var3.substring(var4, var5);
                     return 1;
                  } else if (var0 == 4119) {
                     var3 = class70.field1065[--class70.field1072];
                     StringBuilder var17 = new StringBuilder(var3.length());
                     boolean var15 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if (var7 == '<') {
                           var15 = true;
                        } else if (var7 == '>') {
                           var15 = false;
                        } else if (!var15) {
                           var17.append(var7);
                        }
                     }

                     class70.field1065[++class70.field1072 - 1] = var17.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var3 = class70.field1065[--class70.field1072];
                     var4 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = var3.indexOf(var4);
                     return 1;
                  } else if (var0 == 4121) {
                     class70.field1072 -= 2;
                     var3 = class70.field1065[class70.field1072];
                     var9 = class70.field1065[class70.field1072 + 1];
                     var5 = class70.field1070[--class60.field600];
                     class70.field1070[++class60.field600 - 1] = var3.indexOf(var9, var5);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class70.field1072 -= 2;
               var3 = class70.field1065[class70.field1072];
               var9 = class70.field1065[class70.field1072 + 1];
               if (class69.field1063.field630 != null && class69.field1063.field630.field2637) {
                  class70.field1065[++class70.field1072 - 1] = var9;
               } else {
                  class70.field1065[++class70.field1072 - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
