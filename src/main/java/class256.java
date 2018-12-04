import java.io.IOException;

public class class256 extends class208 {
   static class249 field3303;
   public static int field3302;
   static class202 field3304 = new class202(64);
   public static short[][] field3306;
   public int field3305 = 0;

   void method5019(class184 var1) {
      while(true) {
         int var2 = var1.method3983();
         if (var2 == 0) {
            return;
         }

         this.method5020(var1, var2);
      }
   }

   void method5020(class184 var1, int var2) {
      if (var2 == 5) {
         this.field3305 = var1.method3771();
      }

   }

   public static void method5039(class176 var0) {
      class302.field3784 = var0;
   }

   public static String method5038(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class305.field3791[(int)(var6 - 37L * var0)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = ' ';
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static int method5037(int var0, class86 var1, boolean var2) {
      if (var0 == 3600) {
         if (class170.field2150.field1042 == 0) {
            class70.field1070[++class60.field600 - 1] = -2;
         } else if (class170.field2150.field1042 == 1) {
            class70.field1070[++class60.field600 - 1] = -1;
         } else {
            class70.field1070[++class60.field600 - 1] = class170.field2150.field1040.method5586();
         }

         return 1;
      } else {
         int var3;
         if (var0 == 3601) {
            var3 = class70.field1070[--class60.field600];
            if (class170.field2150.method1751() && var3 >= 0 && var3 < class170.field2150.field1040.method5586()) {
               class294 var8 = (class294)class170.field2150.field1040.method5595(var3);
               class70.field1065[++class70.field1072 - 1] = var8.method5548();
               class70.field1065[++class70.field1072 - 1] = var8.method5544();
            } else {
               class70.field1065[++class70.field1072 - 1] = "";
               class70.field1065[++class70.field1072 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var3 = class70.field1070[--class60.field600];
            if (class170.field2150.method1751() && var3 >= 0 && var3 < class170.field2150.field1040.method5586()) {
               class70.field1070[++class60.field600 - 1] = ((class289)class170.field2150.field1040.method5595(var3)).field3708;
            } else {
               class70.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var3 = class70.field1070[--class60.field600];
            if (class170.field2150.method1751() && var3 >= 0 && var3 < class170.field2150.field1040.method5586()) {
               class70.field1070[++class60.field600 - 1] = ((class289)class170.field2150.field1040.method5595(var3)).field3710;
            } else {
               class70.field1070[++class60.field600 - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == 3604) {
               var5 = class70.field1065[--class70.field1072];
               int var6 = class70.field1070[--class60.field600];
               class146.method3356(var5, var6);
               return 1;
            } else if (var0 == 3605) {
               var5 = class70.field1065[--class70.field1072];
               class170.field2150.method1758(var5);
               return 1;
            } else if (var0 == 3606) {
               var5 = class70.field1065[--class70.field1072];
               class170.field2150.method1762(var5);
               return 1;
            } else if (var0 == 3607) {
               var5 = class70.field1065[--class70.field1072];
               class170.field2150.method1760(var5);
               return 1;
            } else if (var0 == 3608) {
               var5 = class70.field1065[--class70.field1072];
               class170.field2150.method1780(var5);
               return 1;
            } else if (var0 == 3609) {
               var5 = class70.field1065[--class70.field1072];
               var5 = class85.method2145(var5);
               class70.field1070[++class60.field600 - 1] = class170.field2150.method1776(new class293(var5, client.field920), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (class3.field26 != null) {
                  class70.field1065[++class70.field1072 - 1] = class3.field26.field3726;
               } else {
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (class3.field26 != null) {
                  class70.field1070[++class60.field600 - 1] = class3.field26.method5586();
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586()) {
                  class70.field1065[++class70.field1072 - 1] = class3.field26.method5595(var3).method5542().method5706();
               } else {
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586()) {
                  class70.field1070[++class60.field600 - 1] = ((class289)class3.field26.method5595(var3)).method5677();
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586()) {
                  class70.field1070[++class60.field600 - 1] = ((class289)class3.field26.method5595(var3)).field3710;
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class70.field1070[++class60.field600 - 1] = class3.field26 != null ? class3.field26.field3731 : 0;
               return 1;
            } else if (var0 == 3617) {
               var5 = class70.field1065[--class70.field1072];
               class4.method43(var5);
               return 1;
            } else if (var0 == 3618) {
               class70.field1070[++class60.field600 - 1] = class3.field26 != null ? class3.field26.field3732 : 0;
               return 1;
            } else if (var0 == 3619) {
               var5 = class70.field1065[--class70.field1072];
               class269.method5255(var5);
               return 1;
            } else if (var0 == 3620) {
               class52.method1064();
               return 1;
            } else if (var0 == 3621) {
               if (!class170.field2150.method1751()) {
                  class70.field1070[++class60.field600 - 1] = -1;
               } else {
                  class70.field1070[++class60.field600 - 1] = class170.field2150.field1041.method5586();
               }

               return 1;
            } else if (var0 == 3622) {
               var3 = class70.field1070[--class60.field600];
               if (class170.field2150.method1751() && var3 >= 0 && var3 < class170.field2150.field1041.method5586()) {
                  class288 var4 = (class288)class170.field2150.field1041.method5595(var3);
                  class70.field1065[++class70.field1072 - 1] = var4.method5548();
                  class70.field1065[++class70.field1072 - 1] = var4.method5544();
               } else {
                  class70.field1065[++class70.field1072 - 1] = "";
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var5 = class70.field1065[--class70.field1072];
               var5 = class85.method2145(var5);
               class70.field1070[++class60.field600 - 1] = class170.field2150.method1803(new class293(var5, client.field920)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586() && class3.field26.method5595(var3).method5542().equals(class69.field1063.field625)) {
                  class70.field1070[++class60.field600 - 1] = 1;
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (class3.field26 != null && class3.field26.field3730 != null) {
                  class70.field1065[++class70.field1072 - 1] = class3.field26.field3730;
               } else {
                  class70.field1065[++class70.field1072 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586() && ((class283)class3.field26.method5595(var3)).method5522()) {
                  class70.field1070[++class60.field600 - 1] = 1;
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class170.field2150.field1040.method5605();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class313(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class314(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class145(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class139(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class144(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class147(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class143(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class141(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class140(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class142(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     class170.field2150.field1040.method5601();
                     return 1;
                  } else if (var0 == 3640) {
                     class170.field2150.field1041.method5605();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1041.method5606(new class313(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1041.method5606(new class314(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     class170.field2150.field1041.method5601();
                     return 1;
                  } else if (var0 == 3644) {
                     if (class3.field26 != null) {
                        class3.field26.method5605();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class313(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class314(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class145(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class139(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class144(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class147(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class143(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class141(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class140(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class142(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (class3.field26 != null) {
                        class3.field26.method5601();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     class170.field2150.field1040.method5606(new class146(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = class70.field1070[--class60.field600] == 1;
                     if (class3.field26 != null) {
                        class3.field26.method5606(new class146(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = class70.field1070[--class60.field600];
               if (class3.field26 != null && var3 < class3.field26.method5586() && ((class283)class3.field26.method5595(var3)).method5525()) {
                  class70.field1070[++class60.field600 - 1] = 1;
               } else {
                  class70.field1070[++class60.field600 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }

   static void method5023(class184 var0) {
      if (client.field708 != null) {
         var0.method3763(client.field708, 0, client.field708.length);
      } else {
         byte[] var2 = new byte[24];

         try {
            class157.field2038.method2683(0L);
            class157.field2038.method2685(var2);

            int var3;
            for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
               ;
            }

            if (var3 >= 24) {
               throw new IOException();
            }
         } catch (Exception var6) {
            for(int var4 = 0; var4 < 24; ++var4) {
               var2[var4] = -1;
            }
         }

         var0.method3763(var2, 0, var2.length);
      }
   }
}
