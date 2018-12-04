public final class class191 extends class184 {
   static final int[] field2445 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class192 field2446;
   int field2447;

   public class191(int var1) {
      super(var1);
   }

   public void method4050(int[] var1) {
      this.field2446 = new class192(var1);
   }

   public void method4046(class192 var1) {
      this.field2446 = var1;
   }

   public void method4047(int var1) {
      super.field2404[++super.field2405 - 1] = (byte)(var1 + this.field2446.method4085());
   }

   public int method4044() {
      return super.field2404[++super.field2405 - 1] - this.field2446.method4085() & 255;
   }

   public boolean method4048() {
      int var1 = super.field2404[super.field2405] - this.field2446.method4084() & 255;
      return var1 >= 128;
   }

   public int method4049() {
      int var1 = super.field2404[++super.field2405 - 1] - this.field2446.method4085() & 255;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.field2404[++super.field2405 - 1] - this.field2446.method4085() & 255);
   }

   public void method4058(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(super.field2404[++super.field2405 - 1] - this.field2446.method4085());
      }

   }

   public void method4056() {
      this.field2447 = super.field2405 * 8;
   }

   public int method4052(int var1) {
      int var2 = this.field2447 >> 3;
      int var3 = 8 - (this.field2447 & 7);
      int var4 = 0;

      for(this.field2447 += var1; var1 > var3; var3 = 8) {
         var4 += (super.field2404[var2++] & field2445[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += super.field2404[var2] & field2445[var3];
      } else {
         var4 += super.field2404[var2] >> var3 - var1 & field2445[var1];
      }

      return var4;
   }

   public void method4053() {
      super.field2405 = (this.field2447 + 7) / 8;
   }

   public int method4054(int var1) {
      return var1 * 8 - this.field2447;
   }
}
