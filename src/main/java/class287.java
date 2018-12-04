import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class287 {
   final int field3704;
   int field3699 = 0;
   class284[] field3700;
   HashMap field3701;
   HashMap field3702;
   Comparator field3698 = null;

   class287(int var1) {
      this.field3704 = var1;
      this.field3700 = this.vmethod5760(var1);
      this.field3701 = new HashMap(var1 / 8);
      this.field3702 = new HashMap(var1 / 8);
   }

   abstract class284 vmethod5744();

   abstract class284[] vmethod5760(int var1);

   public void method5585() {
      this.field3699 = 0;
      Arrays.fill(this.field3700, (Object)null);
      this.field3701.clear();
      this.field3702.clear();
   }

   public int method5586() {
      return this.field3699;
   }

   public boolean method5587() {
      return this.field3704 == this.field3699;
   }

   public boolean method5608(class293 var1) {
      if (!var1.method5707()) {
         return false;
      } else {
         return this.field3701.containsKey(var1) ? true : this.field3702.containsKey(var1);
      }
   }

   public class284 method5589(class293 var1) {
      class284 var2 = this.method5590(var1);
      return var2 != null ? var2 : this.method5629(var1);
   }

   class284 method5590(class293 var1) {
      return !var1.method5707() ? null : (class284)this.field3701.get(var1);
   }

   class284 method5629(class293 var1) {
      return !var1.method5707() ? null : (class284)this.field3702.get(var1);
   }

   public final boolean method5592(class293 var1) {
      class284 var2 = this.method5590(var1);
      if (var2 == null) {
         return false;
      } else {
         this.method5641(var2);
         return true;
      }
   }

   final void method5641(class284 var1) {
      int var2 = this.method5598(var1);
      if (var2 != -1) {
         this.method5602(var2);
         this.method5599(var1);
      }
   }

   class284 method5663(class293 var1) {
      return this.method5594(var1, (class293)null);
   }

   class284 method5594(class293 var1, class293 var2) {
      if (this.method5590(var1) != null) {
         throw new IllegalStateException();
      } else {
         class284 var3 = this.vmethod5744();
         var3.method5545(var1, var2);
         this.method5660(var3);
         this.method5588(var3);
         return var3;
      }
   }

   public final class284 method5595(int var1) {
      if (var1 >= 0 && var1 < this.field3699) {
         return this.field3700[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void method5601() {
      if (this.field3698 == null) {
         Arrays.sort(this.field3700, 0, this.field3699);
      } else {
         Arrays.sort(this.field3700, 0, this.field3699, this.field3698);
      }

   }

   final void method5591(class284 var1, class293 var2, class293 var3) {
      this.method5599(var1);
      var1.method5545(var2, var3);
      this.method5588(var1);
   }

   final int method5598(class284 var1) {
      for(int var2 = 0; var2 < this.field3699; ++var2) {
         if (this.field3700[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final void method5599(class284 var1) {
      if (this.field3701.remove(var1.field3692) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.field3693 != null) {
            this.field3702.remove(var1.field3693);
         }

      }
   }

   final void method5660(class284 var1) {
      this.field3700[++this.field3699 - 1] = var1;
   }

   final void method5588(class284 var1) {
      this.field3701.put(var1.field3692, var1);
      if (var1.field3693 != null) {
         class284 var2 = (class284)this.field3702.put(var1.field3693, var1);
         if (var2 != null && var2 != var1) {
            var2.field3693 = null;
         }
      }

   }

   final void method5602(int var1) {
      --this.field3699;
      if (var1 < this.field3699) {
         System.arraycopy(this.field3700, var1 + 1, this.field3700, var1, this.field3699 - var1);
      }

   }

   public final void method5605() {
      this.field3698 = null;
   }

   public final void method5606(Comparator var1) {
      if (this.field3698 == null) {
         this.field3698 = var1;
      } else if (this.field3698 instanceof class285) {
         ((class285)this.field3698).method5562(var1);
      }

   }
}
