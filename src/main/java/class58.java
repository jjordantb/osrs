public class class58 implements Runnable {
   static int[] field583;
   boolean field586 = true;
   Object field581 = new Object();
   int field580 = 0;
   int[] field585 = new int[500];
   int[] field584 = new int[500];
   long[] field582 = new long[500];

   public void run() {
      for(; this.field586; class272.method5390(50L)) {
         Object var1 = this.field581;
         synchronized(this.field581) {
            if (this.field580 < 500) {
               this.field585[this.field580] = class48.field473;
               this.field584[this.field580] = class48.field464 * -976212263;
               this.field582[this.field580] = class48.field472;
               ++this.field580;
            }
         }
      }

   }

   public static void method1131(class249 var0, class249 var1, class249 var2) {
      class275.field3631 = var0;
      class275.field3616 = var1;
      class275.field3617 = var2;
   }

   static final void method1130(class107 var0) {
      var0.field1445 = false;
      if (var0.field1442 != null) {
         var0.field1442.field1476 = 0;
      }

      for(class107 var1 = var0.vmethod4596(); var1 != null; var1 = var0.vmethod4598()) {
         method1130(var1);
      }

   }

   static final void method1132(String var0, boolean var1) {
      if (client.field758) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class3.field25.method5795(var0, 250);
         int var6 = class3.field25.method5796(var0, 250) * 13;
         class319.method6047(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
         class319.method6116(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var2 + var6, 16777215);
         class3.field25.method5792(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         int var7 = var3 - var2;
         int var8 = var4 - var2;
         int var9 = var2 + var5 + var2;
         int var10 = var2 + var6 + var2;

         for(int var11 = 0; var11 < client.field853; ++var11) {
            if (client.field819[var11] + client.field763[var11] > var7 && client.field763[var11] < var9 + var7 && client.field854[var11] + client.field852[var11] > var8 && client.field852[var11] < var8 + var10) {
               client.field848[var11] = true;
            }
         }

         if (var1) {
            class30.field313.vmethod6120(0, 0);
         } else {
            class227.method4641(var3, var4, var5, var6);
         }

      }
   }
}
