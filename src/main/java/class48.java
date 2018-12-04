import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class48 implements MouseListener, MouseMotionListener, FocusListener {
   public static class48 field470 = new class48();
   public static volatile int field484 = 0;
   public static volatile int field481 = 0;
   public static volatile int field466 = -1;
   public static volatile int field463 = -1;
   public static volatile long field468 = -1L;
   public static int field469 = 0;
   public static int field473 = 0;
   public static int field464 = 0;
   public static long field472 = 0L;
   public static volatile int field471 = 0;
   public static volatile int field474 = 0;
   public static volatile int field475 = 0;
   public static volatile long field476 = 0L;
   public static int field477 = 0;
   public static int field478 = 0;
   public static int field467 = 0;
   public static long field465 = 0L;

   final int method985(MouseEvent var1) {
      int var2 = var1.getButton();
      if (!var1.isAltDown() && var2 != 2) {
         return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (field470 != null) {
         field484 = 0;
         field466 = var1.getX();
         field463 = var1.getY();
         field468 = var1.getWhen();
      }

   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (field470 != null) {
         field484 = 0;
         field474 = var1.getX();
         field475 = var1.getY();
         field476 = class120.method2866();
         field471 = this.method985(var1);
         if (field471 != 0) {
            field481 = field471;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field470 != null) {
         field484 = 0;
         field481 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (field470 != null) {
         field484 = 0;
         field466 = -1;
         field463 = -1;
         field468 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field470 != null) {
         field481 = 0;
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public static void method1019() {
      while(true) {
         class207 var1 = class250.field3242;
         class247 var0;
         synchronized(class250.field3242) {
            var0 = (class247)class250.field3244.method4279();
         }

         if (var0 == null) {
            return;
         }

         var0.field3214.method4928(var0.field3215, (int)var0.field2496, var0.field3212, false);
      }
   }

   static class59 method989(int var0, int var1) {
      class88 var2 = (class88)class85.field1248.get(var0);
      return var2.method2176(var1);
   }

   public static void method1021() {
      class274.field3601.method4199();
   }

   static void method1017(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var2 = new short[16];
      int var3 = 0;

      for(int var4 = 0; var4 < class316.field3840; ++var4) {
         class271 var5 = class84.method2125(var4);
         if ((!var1 || var5.field3509) && var5.field3552 == -1 && var5.field3515.toLowerCase().indexOf(var0) != -1) {
            if (var3 >= 250) {
               class152.field1983 = -1;
               class33.field325 = null;
               return;
            }

            if (var3 >= var2.length) {
               short[] var6 = new short[var2.length * 2];

               for(int var7 = 0; var7 < var3; ++var7) {
                  var6[var7] = var2[var7];
               }

               var2 = var6;
            }

            var2[var3++] = (short)var4;
         }
      }

      class33.field325 = var2;
      class9.field69 = 0;
      class152.field1983 = var3;
      String[] var8 = new String[class152.field1983];

      for(int var9 = 0; var9 < class152.field1983; ++var9) {
         var8[var9] = class84.method2125(var2[var9]).field3515;
      }

      short[] var10 = class33.field325;
      class177.method3696(var8, var10, 0, var8.length - 1);
   }
}
