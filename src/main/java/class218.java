import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class218 {
   byte[] field2521;
   byte[] field2524;
   int field2522;
   int field2528;
   int field2527;
   int field2525;
   int field2526;
   int field2523;
   int field2520;

   public static class274 method4369(int var0) {
      class274 var1 = (class274)class274.field3601.method4198((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class274.field3611.method4831(4, var0);
         var1 = new class274();
         if (var2 != null) {
            var1.method5452(new class184(var2), var0);
         }

         var1.method5432();
         class274.field3601.method4204(var1, (long)var0);
         return var1;
      }
   }

   public static void method4370(class191 var0) {
      class317 var1 = (class317)class318.field3852.method4250();
      if (var1 != null) {
         int var2 = var0.field2405;
         var0.method3921(var1.field3845);

         for(int var3 = 0; var3 < var1.field3844; ++var3) {
            if (var1.field3846[var3] != 0) {
               var0.method3805(var1.field3846[var3]);
            } else {
               try {
                  int var4 = var1.field3849[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.field3847[var3];
                     var6 = var5.getInt((Object)null);
                     var0.method3805(0);
                     var0.method3921(var6);
                  } else if (var4 == 1) {
                     var5 = var1.field3847[var3];
                     var5.setInt((Object)null, var1.field3848[var3]);
                     var0.method3805(0);
                  } else if (var4 == 2) {
                     var5 = var1.field3847[var3];
                     var6 = var5.getModifiers();
                     var0.method3805(0);
                     var0.method3921(var6);
                  }

                  Method var25;
                  if (var4 != 3) {
                     if (var4 == 4) {
                        var25 = var1.field3843[var3];
                        var6 = var25.getModifiers();
                        var0.method3805(0);
                        var0.method3921(var6);
                     }
                  } else {
                     var25 = var1.field3843[var3];
                     byte[][] var10 = var1.field3850[var3];
                     Object[] var7 = new Object[var10.length];

                     for(int var8 = 0; var8 < var10.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var11 = var25.invoke((Object)null, var7);
                     if (var11 == null) {
                        var0.method3805(0);
                     } else if (var11 instanceof Number) {
                        var0.method3805(1);
                        var0.method3758(((Number)var11).longValue());
                     } else if (var11 instanceof String) {
                        var0.method3805(2);
                        var0.method3889((String)var11);
                     } else {
                        var0.method3805(4);
                     }
                  }
               } catch (ClassNotFoundException var13) {
                  var0.method3805(-10);
               } catch (InvalidClassException var14) {
                  var0.method3805(-11);
               } catch (StreamCorruptedException var15) {
                  var0.method3805(-12);
               } catch (OptionalDataException var16) {
                  var0.method3805(-13);
               } catch (IllegalAccessException var17) {
                  var0.method3805(-14);
               } catch (IllegalArgumentException var18) {
                  var0.method3805(-15);
               } catch (InvocationTargetException var19) {
                  var0.method3805(-16);
               } catch (SecurityException var20) {
                  var0.method3805(-17);
               } catch (IOException var21) {
                  var0.method3805(-18);
               } catch (NullPointerException var22) {
                  var0.method3805(-19);
               } catch (Exception var23) {
                  var0.method3805(-20);
               } catch (Throwable var24) {
                  var0.method3805(-21);
               }
            }
         }

         var0.method3750(var2);
         var1.method4271();
      }
   }

   static final void method4368(class232 var0, int var1, int var2) {
      if (client.field876 == 0 || client.field876 == 3) {
         if (!client.field833 && (class48.field477 == 1 || !class14.field132 && class48.field477 == 4)) {
            class226 var3 = var0.method4745(true);
            if (var3 == null) {
               return;
            }

            int var4 = class48.field478 - var1;
            int var5 = class48.field467 - var2;
            if (var3.method4635(var4, var5)) {
               var4 -= var3.field2626 / 2;
               var5 -= var3.field2621 / 2;
               int var6 = client.field658 & 2047;
               int var7 = class124.field1747[var6];
               int var8 = class124.field1754[var6];
               int var9 = var4 * var8 + var5 * var7 >> 11;
               int var10 = var5 * var8 - var7 * var4 >> 11;
               int var11 = var9 + class69.field1063.field953 >> 7;
               int var12 = class69.field1063.field999 - var10 >> 7;
               class174 var13 = class131.method3243(class171.field2238, client.field690.field1282);
               var13.field2332.method3805(18);
               var13.field2332.method3887(var12 + class11.field91);
               var13.field2332.method3887(var11 + class49.field490);
               var13.field2332.method3795(class39.field380[82] ? (class39.field380[81] ? 2 : 1) : 0);
               var13.field2332.method3805(var4);
               var13.field2332.method3805(var5);
               var13.field2332.method3754(client.field658);
               var13.field2332.method3805(57);
               var13.field2332.method3805(0);
               var13.field2332.method3805(0);
               var13.field2332.method3805(89);
               var13.field2332.method3754(class69.field1063.field953);
               var13.field2332.method3754(class69.field1063.field999);
               var13.field2332.method3805(63);
               client.field690.method2193(var13);
               client.field722 = var11;
               client.field875 = var12;
            }
         }

      }
   }
}
