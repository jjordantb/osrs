import java.net.URL;

public class class242 implements class190 {
   public static final class242 field3172 = new class242(5, 0);
   public static final class242 field3163 = new class242(6, 1);
   public static final class242 field3164 = new class242(1, 2);
   public static final class242 field3162 = new class242(0, 3);
   public static final class242 field3166 = new class242(4, 4);
   public static final class242 field3169 = new class242(3, 5);
   public static final class242 field3168 = new class242(2, 6);
   public static final class242 field3167 = new class242(7, 7);
   public final int field3170;
   final int field3171;

   class242(int var1, int var2) {
      this.field3170 = var1;
      this.field3171 = var2;
   }

   public int vmethod6130() {
      return this.field3171;
   }

   static boolean method4796(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class45.field420.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var10.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var3 = class41.method772(class45.field419, var2, new Object[]{(new URL(class45.field419.getCodeBase(), var0)).toString()});
            return var3 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class45.field419.getAppletContext().showDocument(new URL(class45.field419.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class41.method769(class45.field419, "loggedout");
         } catch (Throwable var9) {
            ;
         }

         try {
            class45.field419.getAppletContext().showDocument(new URL(class45.field419.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
