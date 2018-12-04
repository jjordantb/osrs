import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class38 implements class158, MouseWheelListener {
   int field368 = 0;

   void method722(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method728(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized int vmethod3464() {
      int var1 = this.field368;
      this.field368 = 0;
      return var1;
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field368 += var1.getWheelRotation();
   }
}
