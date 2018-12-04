public class class151 extends class162 {
   long field1975 = System.nanoTime();

   public void vmethod3534() {
      this.field1975 = System.nanoTime();
   }

   public int vmethod3535(int var1, int var2) {
      long var3 = 1000000L * (long)var2;
      long var5 = this.field1975 - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      class272.method5390(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.field1975 < var7); this.field1975 += (long)var1 * 1000000L) {
         ++var9;
      }

      if (this.field1975 < var7) {
         this.field1975 = var7;
      }

      return var9;
   }
}
