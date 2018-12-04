public class class297 {
   static int field3740;
   public static final class297 field3744 = new class297("p11_full");
   public static final class297 field3738 = new class297("p12_full");
   public static final class297 field3746 = new class297("b12_full");
   public static final class297 field3741 = new class297("verdana_11pt_regular");
   public static final class297 field3742 = new class297("verdana_13pt_regular");
   public static final class297 field3743 = new class297("verdana_15pt_regular");
   static int[] field3739;
   static class298 field3747;
   String field3748;

   class297(String var1) {
      this.field3748 = var1;
   }

   static int method5769(int var0, class86 var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == 4000) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var4 + var3;
         return 1;
      } else if (var0 == 4001) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 - var4;
         return 1;
      } else if (var0 == 4002) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 * var4;
         return 1;
      } else if (var0 == 4003) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 / var4;
         return 1;
      } else if (var0 == 4004) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if (var0 == 4005) {
         var3 = class70.field1070[--class60.field600];
         class70.field1070[++class60.field600 - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else if (var0 == 4006) {
         class60.field600 -= 5;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         int var5 = class70.field1070[class60.field600 + 2];
         int var6 = class70.field1070[class60.field600 + 3];
         int var7 = class70.field1070[class60.field600 + 4];
         class70.field1070[++class60.field600 - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
         return 1;
      } else if (var0 == 4007) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 + var4 * var3 / 100;
         return 1;
      } else if (var0 == 4008) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 | 1 << var4;
         return 1;
      } else if (var0 == 4009) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 & -1 - (1 << var4);
         return 1;
      } else if (var0 == 4010) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
         return 1;
      } else if (var0 == 4011) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 % var4;
         return 1;
      } else if (var0 == 4012) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         if (var3 == 0) {
            class70.field1070[++class60.field600 - 1] = 0;
         } else {
            class70.field1070[++class60.field600 - 1] = (int)Math.pow((double)var3, (double)var4);
         }

         return 1;
      } else if (var0 == 4013) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         if (var3 == 0) {
            class70.field1070[++class60.field600 - 1] = 0;
            return 1;
         } else {
            switch(var4) {
            case 0:
               class70.field1070[++class60.field600 - 1] = Integer.MAX_VALUE;
               break;
            case 1:
               class70.field1070[++class60.field600 - 1] = var3;
               break;
            case 2:
               class70.field1070[++class60.field600 - 1] = (int)Math.sqrt((double)var3);
               break;
            case 3:
               class70.field1070[++class60.field600 - 1] = (int)Math.cbrt((double)var3);
               break;
            case 4:
               class70.field1070[++class60.field600 - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
               break;
            default:
               class70.field1070[++class60.field600 - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
            }

            return 1;
         }
      } else if (var0 == 4014) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 & var4;
         return 1;
      } else if (var0 == 4015) {
         class60.field600 -= 2;
         var3 = class70.field1070[class60.field600];
         var4 = class70.field1070[class60.field600 + 1];
         class70.field1070[++class60.field600 - 1] = var3 | var4;
         return 1;
      } else if (var0 == 4018) {
         class60.field600 -= 3;
         long var9 = (long)class70.field1070[class60.field600];
         long var11 = (long)class70.field1070[class60.field600 + 1];
         long var13 = (long)class70.field1070[class60.field600 + 2];
         class70.field1070[++class60.field600 - 1] = (int)(var9 * var13 / var11);
         return 1;
      } else {
         return 2;
      }
   }

   static int method5770(int var0) {
      return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
   }
}
