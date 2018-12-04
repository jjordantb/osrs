public final class class120 extends class206 {
   int field1621;
   int field1616;
   int field1617;
   int field1618;
   class125 field1619;
   class116 field1620;
   class130 field1637;
   class135 field1622;
   class117 field1629;
   class114 field1623;
   int field1625;
   class136[] field1626 = new class136[5];
   int[] field1627 = new int[5];
   int field1628 = 0;
   int field1633;
   boolean field1624;
   boolean field1631;
   boolean field1632;
   int field1635;
   int field1634;
   int field1615;
   int field1636;
   class120 field1630;

   class120(int var1, int var2, int var3) {
      this.field1618 = this.field1621 = var1;
      this.field1616 = var2;
      this.field1617 = var3;
   }

   public static synchronized long method2866() {
      long var0 = System.currentTimeMillis();
      if (var0 < class186.field2420) {
         class186.field2419 += class186.field2420 - var0;
      }

      class186.field2420 = var0;
      return class186.field2419 + var0;
   }

   static String method2865(class184 var0, int var1) {
      try {
         int var2 = var0.method3783();
         if (var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.field2405 += class302.field3784.method3691(var0.field2404, var0.field2405, var3, 0, var2);
         String var4 = class192.method4091(var3, 0, var2);
         return var4;
      } catch (Exception var6) {
         return "Cabbage";
      }
   }
}
