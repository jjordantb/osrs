import java.nio.ByteBuffer;

public class class182 extends class188 {
   ByteBuffer field2365;

   byte[] vmethod4013() {
      byte[] var1 = new byte[this.field2365.capacity()];
      this.field2365.position(0);
      this.field2365.get(var1);
      return var1;
   }

   void vmethod4022(byte[] var1) {
      this.field2365 = ByteBuffer.allocateDirect(var1.length);
      this.field2365.position(0);
      this.field2365.put(var1);
   }
}
