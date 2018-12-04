import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class44 extends class97 {
   AudioFormat field414;
   SourceDataLine field415;
   int field417;
   byte[] field416;

   protected void vmethod2353() {
      this.field414 = new AudioFormat((float)class97.field1377, 16, class26.field264 ? 2 : 1, true, false);
      this.field416 = new byte[256 << (class26.field264 ? 2 : 1)];
   }

   protected void vmethod2354(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field414, var1 << (class26.field264 ? 2 : 1));
         this.field415 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field415.open();
         this.field415.start();
         this.field417 = var1;
      } catch (LineUnavailableException var3) {
         if (class52.method1070(var1) != 1) {
            this.vmethod2354(class3.method28(var1));
         } else {
            this.field415 = null;
            throw var3;
         }
      }
   }

   protected int vmethod2355() {
      return this.field417 - (this.field415.available() >> (class26.field264 ? 2 : 1));
   }

   protected void vmethod2356() {
      int var1 = 256;
      if (class26.field264) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1362[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field416[var2 * 2] = (byte)(var3 >> 8);
         this.field416[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field415.write(this.field416, 0, var1 << 1);
   }

   protected void vmethod2357() {
      if (this.field415 != null) {
         this.field415.close();
         this.field415 = null;
      }

   }

   protected void vmethod2358() {
      this.field415.flush();
   }
}
