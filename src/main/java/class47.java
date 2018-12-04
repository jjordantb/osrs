import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {
   static class67 field435;
   protected static class156 field426;
   static class47 field427 = null;
   static int field428 = 0;
   static long field436 = 0L;
   static boolean field430 = false;
   static int field432 = 20;
   static int field438 = 1;
   protected static int field434 = 0;
   protected static class162 field433;
   protected static long[] field429 = new long[32];
   static int field437;
   protected static long[] field444 = new long[32];
   static int field450 = 500;
   static volatile boolean field457 = true;
   static long field460 = -1L;
   static long field459 = -1L;
   static class323[] field461;
   boolean field431 = false;
   protected int field439;
   protected int field440;
   int field442 = 0;
   int field441 = 0;
   int field443;
   int field458;
   int field445;
   int field446;
   Frame field447;
   Canvas field448;
   volatile boolean field449 = true;
   boolean field451 = false;
   volatile boolean field452 = false;
   volatile long field453 = 0L;
   class38 field454;
   Clipboard field455;
   final EventQueue field456;

   protected class47() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
         ;
      }

      this.field456 = var1;
      class40 var2 = new class40();
      class67.field1036 = var2;
   }

   protected final void method950(int var1, int var2) {
      if (this.field445 != var1 || var2 != this.field446) {
         this.method867();
      }

      this.field445 = var1;
      this.field446 = var2;
   }

   final void method845(Object var1) {
      if (this.field456 != null) {
         for(int var2 = 0; var2 < 50 && this.field456.peekEvent() != null; ++var2) {
            class272.method5390(1L);
         }

         if (var1 != null) {
            this.field456.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class158 method848() {
      if (this.field454 == null) {
         this.field454 = new class38();
         this.field454.method722(this.field448);
      }

      return this.field454;
   }

   protected void method918() {
      this.field455 = this.getToolkit().getSystemClipboard();
   }

   protected void method863(String var1) {
      this.field455.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final void method844() {
      class70.method1949();
      class30.method574(this.field448);
   }

   protected final void method850() {
      class30.method579(this.field448);
   }

   final void method935() {
      Container var1 = this.method883();
      if (var1 != null) {
         class315 var2 = this.method876();
         this.field439 = Math.max(var2.field3837, this.field443);
         this.field440 = Math.max(var2.field3838, this.field458);
         if (this.field439 <= 0) {
            this.field439 = 1;
         }

         if (this.field440 <= 0) {
            this.field440 = 1;
         }

         class68.field1038 = Math.min(this.field439, this.field445);
         class141.field1937 = Math.min(this.field440, this.field446);
         this.field442 = (this.field439 - class68.field1038) / 2;
         this.field441 = 0;
         this.field448.setSize(class68.field1038, class141.field1937);
         class30.field313 = new class46(class68.field1038, class141.field1937, this.field448);
         if (var1 == this.field447) {
            Insets var3 = this.field447.getInsets();
            this.field448.setLocation(this.field442 + var3.left, var3.top + this.field441);
         } else {
            this.field448.setLocation(this.field442, this.field441);
         }

         this.field449 = true;
         this.vmethod1248();
      }
   }

   protected abstract void vmethod1248();

   void method981() {
      int var1 = this.field442;
      int var2 = this.field441;
      int var3 = this.field439 - class68.field1038 - var1;
      int var4 = this.field440 - class141.field1937 - var2;
      if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
         try {
            Container var5 = this.method883();
            int var6 = 0;
            int var7 = 0;
            if (var5 == this.field447) {
               Insets var8 = this.field447.getInsets();
               var6 = var8.left;
               var7 = var8.top;
            }

            Graphics var10 = var5.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
               var10.fillRect(var6, var7, var1, this.field440);
            }

            if (var2 > 0) {
               var10.fillRect(var6, var7, this.field439, var2);
            }

            if (var3 > 0) {
               var10.fillRect(var6 + this.field439 - var3, var7, var3, this.field440);
            }

            if (var4 > 0) {
               var10.fillRect(var6, var7 + this.field440 - var4, this.field439, var4);
            }
         } catch (Exception var9) {
            ;
         }
      }

   }

   final void method854() {
      class85.method2144(this.field448);
      Canvas var1 = this.field448;
      var1.removeMouseListener(class48.field470);
      var1.removeMouseMotionListener(class48.field470);
      var1.removeFocusListener(class48.field470);
      class48.field481 = 0;
      if (this.field454 != null) {
         this.field454.method728(this.field448);
      }

      this.method931();
      class30.method574(this.field448);
      class30.method579(this.field448);
      if (this.field454 != null) {
         this.field454.method722(this.field448);
      }

      this.method867();
   }

   protected final void method855(int var1, int var2, int var3) {
      try {
         if (field427 != null) {
            ++field428;
            if (field428 >= 3) {
               this.method874("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field427 = this;
         class68.field1038 = var1;
         class141.field1937 = var2;
         class313.field3831 = var3;
         class154.field1999 = this;
         if (field426 == null) {
            field426 = new class156();
         }

         field426.method3439(this, 1);
      } catch (Exception var5) {
         class80.method2041((String)null, var5);
         this.method874("crash");
      }

   }

   final synchronized void method931() {
      Container var1 = this.method883();
      if (this.field448 != null) {
         this.field448.removeFocusListener(this);
         var1.remove(this.field448);
      }

      class68.field1038 = Math.max(var1.getWidth(), this.field443);
      class141.field1937 = Math.max(var1.getHeight(), this.field458);
      Insets var2;
      if (this.field447 != null) {
         var2 = this.field447.getInsets();
         class68.field1038 -= var2.right + var2.left;
         class141.field1937 -= var2.bottom + var2.top;
      }

      this.field448 = new class42(this);
      var1.setBackground(Color.BLACK);
      var1.setLayout((LayoutManager)null);
      var1.add(this.field448);
      this.field448.setSize(class68.field1038, class141.field1937);
      this.field448.setVisible(true);
      this.field448.setBackground(Color.BLACK);
      if (var1 == this.field447) {
         var2 = this.field447.getInsets();
         this.field448.setLocation(var2.left + this.field442, this.field441 + var2.top);
      } else {
         this.field448.setLocation(this.field442, this.field441);
      }

      this.field448.addFocusListener(this);
      this.field448.requestFocus();
      this.field449 = true;
      if (class30.field313 != null && class68.field1038 == class30.field313.field3864 && class141.field1937 == class30.field313.field3861) {
         ((class46)class30.field313).method830(this.field448);
         class30.field313.vmethod6120(0, 0);
      } else {
         class30.field313 = new class46(class68.field1038, class141.field1937, this.field448);
      }

      this.field452 = false;
      this.field453 = class120.method2866();
   }

   protected final boolean method857() {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.equals("jagex.com") && !var1.endsWith(".jagex.com")) {
         if (!var1.equals("runescape.com") && !var1.endsWith(".runescape.com")) {
            if (var1.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                  var1 = var1.substring(0, var1.length() - 1);
               }

               if (var1.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method874("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method858() {
      long var1 = class120.method2866();
      long var3 = field444[class320.field3863];
      field444[class320.field3863] = var1;
      class320.field3863 = class320.field3863 + 1 & 31;
      if (0L != var3 && var1 > var3) {
         ;
      }

      synchronized(this) {
         class167.field2111 = field457;
      }

      this.vmethod1238();
   }

   void method859() {
      Container var1 = this.method883();
      long var2 = class120.method2866();
      long var4 = field429[field437];
      field429[field437] = var2;
      field437 = field437 + 1 & 31;
      if (0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         field434 = ((var6 >> 1) + 32000) / var6;
      }

      if (++field450 - 1 > 50) {
         field450 -= 50;
         this.field449 = true;
         this.field448.setSize(class68.field1038, class141.field1937);
         this.field448.setVisible(true);
         if (var1 == this.field447) {
            Insets var7 = this.field447.getInsets();
            this.field448.setLocation(var7.left + this.field442, var7.top + this.field441);
         } else {
            this.field448.setLocation(this.field442, this.field441);
         }
      }

      if (this.field452) {
         this.method854();
      }

      this.method851();
      this.vmethod1239(this.field449);
      if (this.field449) {
         this.method981();
      }

      this.field449 = false;
   }

   final void method851() {
      class315 var1 = this.method876();
      if (var1.field3837 != this.field439 || var1.field3838 != this.field440 || this.field451) {
         this.method935();
         this.field451 = false;
      }

   }

   final void method867() {
      this.field451 = true;
   }

   final synchronized void method862() {
      if (!field430) {
         field430 = true;

         try {
            this.field448.removeFocusListener(this);
         } catch (Exception var5) {
            ;
         }

         try {
            this.vmethod1240();
         } catch (Exception var4) {
            ;
         }

         if (this.field447 != null) {
            try {
               System.exit(0);
            } catch (Throwable var3) {
               ;
            }
         }

         if (field426 != null) {
            try {
               field426.method3429();
            } catch (Exception var2) {
               ;
            }
         }

         this.vmethod1465();
      }
   }

   protected abstract void vmethod1483();

   protected abstract void vmethod1238();

   protected abstract void vmethod1239(boolean var1);

   protected abstract void vmethod1240();

   protected final void method872(int var1, String var2, boolean var3) {
      try {
         Graphics var4 = this.field448.getGraphics();
         if (class147.field1963 == null) {
            class147.field1963 = new Font("Helvetica", 1, 13);
            class137.field1917 = this.field448.getFontMetrics(class147.field1963);
         }

         if (var3) {
            var4.setColor(Color.black);
            var4.fillRect(0, 0, class68.field1038, class141.field1937);
         }

         Color var5 = new Color(140, 17, 17);

         try {
            if (class136.field1892 == null) {
               class136.field1892 = this.field448.createImage(304, 34);
            }

            Graphics var6 = class136.field1892.getGraphics();
            var6.setColor(var5);
            var6.drawRect(0, 0, 303, 33);
            var6.fillRect(2, 2, var1 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1, 1, 301, 31);
            var6.fillRect(var1 * 3 + 2, 2, 300 - var1 * 3, 30);
            var6.setFont(class147.field1963);
            var6.setColor(Color.white);
            var6.drawString(var2, (304 - class137.field1917.stringWidth(var2)) / 2, 22);
            var4.drawImage(class136.field1892, class68.field1038 / 2 - 152, class141.field1937 / 2 - 18, (ImageObserver)null);
         } catch (Exception var9) {
            int var7 = class68.field1038 / 2 - 152;
            int var8 = class141.field1937 / 2 - 18;
            var4.setColor(var5);
            var4.drawRect(var7, var8, 303, 33);
            var4.fillRect(var7 + 2, var8 + 2, var1 * 3, 30);
            var4.setColor(Color.black);
            var4.drawRect(var7 + 1, var8 + 1, 301, 31);
            var4.fillRect(var1 * 3 + var7 + 2, var8 + 2, 300 - var1 * 3, 30);
            var4.setFont(class147.field1963);
            var4.setColor(Color.white);
            var4.drawString(var2, var7 + (304 - class137.field1917.stringWidth(var2)) / 2, var8 + 22);
         }
      } catch (Exception var10) {
         this.field448.repaint();
      }

   }

   protected final void method873() {
      class136.field1892 = null;
      class147.field1963 = null;
      class137.field1917 = null;
   }

   protected void method874(String var1) {
      if (!this.field431) {
         this.field431 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var3) {
            ;
         }

      }
   }

   Container method883() {
      return (Container)(this.field447 != null ? this.field447 : this);
   }

   class315 method876() {
      Container var1 = this.method883();
      int var2 = Math.max(var1.getWidth(), this.field443);
      int var3 = Math.max(var1.getHeight(), this.field458);
      if (this.field447 != null) {
         Insets var4 = this.field447.getInsets();
         var2 -= var4.left + var4.right;
         var3 -= var4.bottom + var4.top;
      }

      return new class315(var2, var3);
   }

   protected final boolean method877() {
      return this.field447 != null;
   }

   protected abstract void vmethod1465();

   public final synchronized void paint(Graphics var1) {
      if (this == field427 && !field430) {
         this.field449 = true;
         if (class120.method2866() - this.field453 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (var2 == null || var2.width >= class68.field1038 && var2.height >= class141.field1937) {
               this.field452 = true;
            }
         }

      }
   }

   public final void destroy() {
      if (this == field427 && !field430) {
         field436 = class120.method2866();
         class272.method5390(5000L);
         this.method862();
      }
   }

   public void run() {
      try {
         if (class156.field2017 != null) {
            String var1 = class156.field2017.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class156.field2013;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method874("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class239.method4788(var2.charAt(var3)); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  if (class219.method4375(var4) && class172.method3663(var4) < 10) {
                     this.method874("wrongjava");
                     return;
                  }
               }

               field438 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method931();
         this.vmethod1483();
         field433 = class220.method4523();

         while(0L == field436 || class120.method2866() < field436) {
            class181.field2363 = field433.vmethod3535(field432, field438);

            for(int var5 = 0; var5 < class181.field2363; ++var5) {
               this.method858();
            }

            this.method859();
            this.method845(this.field448);
         }
      } catch (Exception var6) {
         class80.method2041((String)null, var6);
         this.method874("crash");
      }

      this.method862();
   }

   public final void start() {
      if (this == field427 && !field430) {
         field436 = 0L;
      }
   }

   public final void focusGained(FocusEvent var1) {
      field457 = true;
      this.field449 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field457 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   public abstract void init();

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final void stop() {
      if (this == field427 && !field430) {
         field436 = class120.method2866() + 4000L;
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
   }
}
