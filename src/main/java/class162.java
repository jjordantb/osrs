import java.io.File;
import java.io.IOException;

public abstract class class162 {
   public abstract void vmethod3534();

   public abstract int vmethod3535(int var1, int var2);

   public static class257 method3533(int var0) {
      return var0 >= 0 && var0 < class257.field3310.length && class257.field3310[var0] != null ? class257.field3310[var0] : new class257(var0);
   }

   static void method3538(File var0, File var1) {
      try {
         class112 var2 = new class112(class157.field2023, "rw", 10000L);
         class184 var3 = new class184(500);
         var3.method3805(3);
         var3.method3805(var1 != null ? 1 : 0);
         var3.method3989(var0.getPath());
         if (var1 != null) {
            var3.method3989("");
         }

         var2.method2716(var3.field2404, 0, var3.field2405);
         var2.method2717();
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   static void method3548() {
      class79.field1180 = class79.field1180.trim();
      if (class79.field1180.length() == 0) {
         class185.method4006("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1 = class268.method5222();
         int var0;
         if (var1 == 0L) {
            var0 = 5;
         } else {
            var0 = class114.method2768(var1, class79.field1180);
         }

         switch(var0) {
         case 2:
            class185.method4006(class239.field2943, class239.field3118, class239.field3081);
            class79.field1163 = 6;
            break;
         case 3:
            class185.method4006("", "Error connecting to server.", "");
            break;
         case 4:
            class185.method4006("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            class185.method4006("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            class185.method4006("", "Error connecting to server.", "");
            break;
         case 7:
            class185.method4006("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   public static byte[] method3547(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof class188) {
         class188 var2 = (class188)var0;
         return var2.vmethod4013();
      } else {
         throw new IllegalArgumentException();
      }
   }

   static void method3545(class232[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < var0.length; ++var5) {
         class232 var6 = var0[var5];
         if (var6 != null && var6.field2700 == var1) {
            class136.method3270(var6, var2, var3, var4);
            class117.method2852(var6, var2, var3);
            if (var6.field2711 > var6.field2690 - var6.field2682) {
               var6.field2711 = var6.field2690 - var6.field2682;
            }

            if (var6.field2711 < 0) {
               var6.field2711 = 0;
            }

            if (var6.field2689 > var6.field2691 - var6.field2683) {
               var6.field2689 = var6.field2691 - var6.field2683;
            }

            if (var6.field2689 < 0) {
               var6.field2689 = 0;
            }

            if (var6.field2808 == 0) {
               class223.method4594(var0, var6, var4);
            }
         }
      }

   }
}
