public class class294 extends class289 {
   static int field3725;
   boolean field3723;
   boolean field3724;

   int method5728(class294 var1) {
      if (super.field3708 == client.field691 && client.field691 != var1.field3708) {
         return -1;
      } else if (client.field691 == var1.field3708 && super.field3708 != client.field691) {
         return 1;
      } else if (super.field3708 != 0 && var1.field3708 == 0) {
         return -1;
      } else if (var1.field3708 != 0 && super.field3708 == 0) {
         return 1;
      } else if (this.field3723 && !var1.field3723) {
         return -1;
      } else if (!this.field3723 && var1.field3723) {
         return 1;
      } else if (this.field3724 && !var1.field3724) {
         return -1;
      } else if (!this.field3724 && var1.field3724) {
         return 1;
      } else {
         return super.field3708 != 0 ? super.field3706 - var1.field3706 : var1.field3706 - super.field3706;
      }
   }

   public int vmethod5729(class284 var1) {
      return this.method5728((class294)var1);
   }

   public int compareTo(Object var1) {
      return this.method5728((class294)var1);
   }

   public static int method5727(int var0) {
      return class22.method334(class122.field1714[var0]);
   }
}
