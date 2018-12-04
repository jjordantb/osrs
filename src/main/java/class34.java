import java.io.File;
import java.io.RandomAccessFile;

public class class34 extends class16 {
   static int[] field328;
   int field333;
   int field336;
   int field330;
   int field329;

   void method631(class184 var1, class184 var2) {
      int var3 = var2.method3983();
      if (var3 != class25.field252.field254) {
         throw new IllegalStateException("");
      } else {
         super.field150 = var2.method3983();
         super.field148 = var2.method3983();
         super.field146 = var2.method3771();
         super.field151 = var2.method3771();
         this.field333 = var2.method3983();
         this.field336 = var2.method3983();
         super.field147 = var2.method3771();
         super.field149 = var2.method3771();
         this.field330 = var2.method3983();
         this.field329 = var2.method3983();
         super.field148 = Math.min(super.field148, 4);
         super.field152 = new short[1][64][64];
         super.field153 = new short[super.field148][64][64];
         super.field154 = new byte[super.field148][64][64];
         super.field155 = new byte[super.field148][64][64];
         super.field156 = new class19[super.field148][64][64][];
         var3 = var1.method3983();
         if (var3 != class24.field245.field247) {
            throw new IllegalStateException("");
         } else {
            int var4 = var1.method3983();
            int var5 = var1.method3983();
            int var6 = var1.method3983();
            int var7 = var1.method3983();
            if (var4 == super.field147 && var5 == super.field149 && var6 == this.field330 && var7 == this.field329) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  for(int var9 = 0; var9 < 8; ++var9) {
                     this.method181(var8 + this.field330 * 8, var9 + this.field329 * 8, var1);
                  }
               }

            } else {
               throw new IllegalStateException("");
            }
         }
      }
   }

   boolean method618(int var1, int var2) {
      if (var1 < this.field330 * 8) {
         return false;
      } else if (var2 < this.field329 * 8) {
         return false;
      } else if (var1 >= this.field330 * 8 + 8) {
         return false;
      } else {
         return var2 < this.field329 * 8 + 8;
      }
   }

   int method627() {
      return this.field333;
   }

   int method620() {
      return this.field336;
   }

   int method621() {
      return this.field330;
   }

   int method622() {
      return this.field329;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class34)) {
         return false;
      } else {
         class34 var2 = (class34)var1;
         if (super.field147 == var2.field147 && super.field149 == var2.field149) {
            return var2.field330 == this.field330 && var2.field329 == this.field329;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field147 | super.field149 << 8 | this.field330 << 16 | this.field329 << 24;
   }

   static File method645(String var0) {
      if (!class160.field2043) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class160.field2040.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(class307.field3802, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class160.field2040.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static final void method643(String var0) {
      class59.method1163(30, "", var0);
   }

   static void method617(class61 var0, int var1, int var2) {
      if (var0.field971 == var1 && var1 != -1) {
         int var3 = class29.method532(var1).field3615;
         if (var3 == 1) {
            var0.field986 = 0;
            var0.field989 = 0;
            var0.field998 = var2;
            var0.field975 = 0;
         }

         if (var3 == 2) {
            var0.field975 = 0;
         }
      } else if (var1 == -1 || var0.field971 == -1 || class29.method532(var1).field3627 >= class29.method532(var0.field971).field3627) {
         var0.field971 = var1;
         var0.field986 = 0;
         var0.field989 = 0;
         var0.field998 = var2;
         var0.field975 = 0;
         var0.field959 = var0.field939;
      }

   }

   static final void method624(int var0, int var1, int var2, int var3) {
      ++client.field741;
      class268.method5228();
      class66.method1735();
      if (client.field769 >= 0 && client.field698[client.field769] != null) {
         class61.method1207(client.field698[client.field769], false);
      }

      class117.method2851(true);
      int var4 = class83.field1226;
      int[] var5 = class83.field1222;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         if (var5[var6] != client.field769 && var5[var6] != client.field747) {
            class61.method1207(client.field698[var5[var6]], true);
         }
      }

      class117.method2851(false);

      for(class80 var28 = (class80)client.field773.method4298(); var28 != null; var28 = (class80)client.field773.method4283()) {
         if (var28.field1183 == class60.field599 && client.field655 <= var28.field1189) {
            if (client.field655 >= var28.field1188) {
               if (var28.field1192 > 0) {
                  class73 var33 = client.field806[var28.field1192 - 1];
                  if (var33 != null && var33.field953 >= 0 && var33.field953 < 13312 && var33.field999 >= 0 && var33.field999 < 13312) {
                     var28.method2042(var33.field953, var33.field999, class152.method3394(var33.field953, var33.field999, var28.field1183) - var28.field1187, client.field655);
                  }
               }

               if (var28.field1192 < 0) {
                  var6 = -var28.field1192 - 1;
                  class61 var34;
                  if (var6 == client.field747) {
                     var34 = class69.field1063;
                  } else {
                     var34 = client.field698[var6];
                  }

                  if (var34 != null && var34.field953 >= 0 && var34.field953 < 13312 && var34.field999 >= 0 && var34.field999 < 13312) {
                     var28.method2042(var34.field953, var34.field999, class152.method3394(var34.field953, var34.field999, var28.field1183) - var28.field1187, client.field655);
                  }
               }

               var28.method2048(client.field705);
               class243.field3173.method3092(class60.field599, (int)var28.field1185, (int)var28.field1191, (int)var28.field1184, 60, var28, var28.field1194, -1L, false);
            }
         } else {
            var28.method4271();
         }
      }

      for(class71 var36 = (class71)client.field711.method4298(); var36 != null; var36 = (class71)client.field711.method4283()) {
         if (var36.field1086 == class60.field599 && !var36.field1093) {
            if (client.field655 >= var36.field1085) {
               var36.method1954(client.field705);
               if (var36.field1093) {
                  var36.method4271();
               } else {
                  class243.field3173.method3092(var36.field1086, var36.field1087, var36.field1088, var36.field1089, 60, var36, 0, -1L, false);
               }
            }
         } else {
            var36.method4271();
         }
      }

      class3.method36(var0, var1, var2, var3, true);
      var0 = client.field657;
      var1 = client.field693;
      var2 = client.field644;
      var3 = client.field764;
      class319.method6067(var0, var1, var0 + var2, var3 + var1);
      class124.method3000();
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var18;
      int var19;
      int var29;
      if (!client.field889) {
         var4 = client.field712;
         if (client.field729 / 256 > var4) {
            var4 = client.field729 / 256;
         }

         if (client.field890[4] && client.field892[4] + 128 > var4) {
            var4 = client.field892[4] + 128;
         }

         var29 = client.field658 & 2047;
         var6 = class9.field68;
         var7 = class122.field1717;
         var8 = class9.field70;
         var9 = var4 * 3 + 600;
         var12 = var3 - 334;
         if (var12 < 0) {
            var12 = 0;
         } else if (var12 > 100) {
            var12 = 100;
         }

         var13 = (client.field898 - client.field897) * var12 / 100 + client.field897;
         var11 = var13 * var9 / 256;
         var12 = 2048 - var4 & 2047;
         var13 = 2048 - var29 & 2047;
         var14 = 0;
         var15 = 0;
         var16 = var11;
         int var17;
         if (var12 != 0) {
            var17 = class124.field1747[var12];
            var18 = class124.field1754[var12];
            var19 = var18 * var15 - var17 * var11 >> 16;
            var16 = var17 * var15 + var18 * var11 >> 16;
            var15 = var19;
         }

         if (var13 != 0) {
            var17 = class124.field1747[var13];
            var18 = class124.field1754[var13];
            var19 = var16 * var17 + var18 * var14 >> 16;
            var16 = var18 * var16 - var17 * var14 >> 16;
            var14 = var19;
         }

         class157.field2036 = var6 - var14;
         class184.field2409 = var7 - var15;
         class50.field508 = var8 - var16;
         class57.field576 = var4;
         class15.field143 = var29;
         if (client.field718 == 1 && client.field812 >= 2 && client.field655 % 50 == 0 && (class9.field68 >> 7 != class69.field1063.field953 >> 7 || class9.field70 >> 7 != class69.field1063.field999 >> 7)) {
            var17 = class69.field1063.field620;
            var18 = (class9.field68 >> 7) + class49.field490;
            var19 = (class9.field70 >> 7) + class11.field91;
            class49.method1023(var18, var19, var17, true);
         }
      }

      int var10;
      if (!client.field889) {
         if (class47.field435.field1029) {
            var29 = class60.field599;
         } else {
            label804: {
               var6 = 3;
               if (class57.field576 < 310) {
                  if (client.field718 == 1) {
                     var7 = class9.field68 >> 7;
                     var8 = class9.field70 >> 7;
                  } else {
                     var7 = class69.field1063.field953 >> 7;
                     var8 = class69.field1063.field999 >> 7;
                  }

                  var9 = class157.field2036 >> 7;
                  var10 = class50.field508 >> 7;
                  if (var9 < 0 || var10 < 0 || var9 >= 104 || var10 >= 104) {
                     var29 = class60.field599;
                     break label804;
                  }

                  if (var7 < 0 || var8 < 0 || var7 >= 104 || var8 >= 104) {
                     var29 = class60.field599;
                     break label804;
                  }

                  if ((class50.field492[class60.field599][var9][var10] & 4) != 0) {
                     var6 = class60.field599;
                  }

                  if (var7 > var9) {
                     var11 = var7 - var9;
                  } else {
                     var11 = var9 - var7;
                  }

                  if (var8 > var10) {
                     var12 = var8 - var10;
                  } else {
                     var12 = var10 - var8;
                  }

                  if (var11 > var12) {
                     var13 = var12 * 65536 / var11;
                     var14 = 32768;

                     while(var9 != var7) {
                        if (var9 < var7) {
                           ++var9;
                        } else if (var9 > var7) {
                           --var9;
                        }

                        if ((class50.field492[class60.field599][var9][var10] & 4) != 0) {
                           var6 = class60.field599;
                        }

                        var14 += var13;
                        if (var14 >= 65536) {
                           var14 -= 65536;
                           if (var10 < var8) {
                              ++var10;
                           } else if (var10 > var8) {
                              --var10;
                           }

                           if ((class50.field492[class60.field599][var9][var10] & 4) != 0) {
                              var6 = class60.field599;
                           }
                        }
                     }
                  } else if (var12 > 0) {
                     var13 = var11 * 65536 / var12;
                     var14 = 32768;

                     while(var8 != var10) {
                        if (var10 < var8) {
                           ++var10;
                        } else if (var10 > var8) {
                           --var10;
                        }

                        if ((class50.field492[class60.field599][var9][var10] & 4) != 0) {
                           var6 = class60.field599;
                        }

                        var14 += var13;
                        if (var14 >= 65536) {
                           var14 -= 65536;
                           if (var9 < var7) {
                              ++var9;
                           } else if (var9 > var7) {
                              --var9;
                           }

                           if ((class50.field492[class60.field599][var9][var10] & 4) != 0) {
                              var6 = class60.field599;
                           }
                        }
                     }
                  }
               }

               if (class69.field1063.field953 >= 0 && class69.field1063.field999 >= 0 && class69.field1063.field953 < 13312 && class69.field1063.field999 < 13312) {
                  if ((class50.field492[class60.field599][class69.field1063.field953 >> 7][class69.field1063.field999 >> 7] & 4) != 0) {
                     var6 = class60.field599;
                  }

                  var29 = var6;
               } else {
                  var29 = class60.field599;
               }
            }
         }

         var4 = var29;
      } else {
         if (class47.field435.field1029) {
            var29 = class60.field599;
         } else {
            var6 = class152.method3394(class157.field2036, class50.field508, class60.field599);
            if (var6 - class184.field2409 < 800 && (class50.field492[class60.field599][class157.field2036 >> 7][class50.field508 >> 7] & 4) != 0) {
               var29 = class60.field599;
            } else {
               var29 = 3;
            }
         }

         var4 = var29;
      }

      var29 = class157.field2036;
      var6 = class184.field2409;
      var7 = class50.field508;
      var8 = class57.field576;
      var9 = class15.field143;

      for(var10 = 0; var10 < 5; ++var10) {
         if (client.field890[var10]) {
            var11 = (int)(Math.random() * (double)(client.field891[var10] * 2 + 1) - (double)client.field891[var10] + Math.sin((double)client.field893[var10] / 100.0D * (double)client.field894[var10]) * (double)client.field892[var10]);
            if (var10 == 0) {
               class157.field2036 += var11;
            }

            if (var10 == 1) {
               class184.field2409 += var11;
            }

            if (var10 == 2) {
               class50.field508 += var11;
            }

            if (var10 == 3) {
               class15.field143 = var11 + class15.field143 & 2047;
            }

            if (var10 == 4) {
               class57.field576 += var11;
               if (class57.field576 < 128) {
                  class57.field576 = 128;
               }

               if (class57.field576 > 383) {
                  class57.field576 = 383;
               }
            }
         }
      }

      var10 = class48.field473;
      var11 = class48.field464 * -976212263;
      if (class48.field477 != 0) {
         var10 = class48.field478;
         var11 = class48.field467;
      }

      if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) {
         var12 = var10 - var0;
         var13 = var11 - var1;
         class122.field1712 = var12;
         class122.field1715 = var13;
         class122.field1711 = true;
         class122.field1713 = 0;
         class122.field1708 = false;
      } else {
         class40.method764();
      }

      class160.method3502();
      class319.method6047(var0, var1, var2, var3, 0);
      class160.method3502();
      var12 = class124.field1741;
      class124.field1741 = client.field907;
      class243.field3173.method3098(class157.field2036, class184.field2409, class50.field508, class57.field576, class15.field143, var4);
      class124.field1741 = var12;
      class160.method3502();
      class243.field3173.method3071();
      client.field912 = 0;
      boolean var35 = false;
      var14 = -1;
      var15 = -1;
      var16 = class83.field1226;
      int[] var30 = class83.field1222;

      for(var18 = 0; var18 < var16 + client.field686; ++var18) {
         Object var31;
         if (var18 < var16) {
            var31 = client.field698[var30[var18]];
            if (var30[var18] == client.field769) {
               var35 = true;
               var14 = var18;
               continue;
            }

            if (var31 == class69.field1063) {
               var15 = var18;
               continue;
            }
         } else {
            var31 = client.field806[client.field687[var18 - var16]];
         }

         class68.method1828((class64)var31, var18, var0, var1, var2, var3);
      }

      if (client.field762 && var15 != -1) {
         class68.method1828(class69.field1063, var15, var0, var1, var2, var3);
      }

      if (var35) {
         class68.method1828(client.field698[client.field769], var14, var0, var1, var2, var3);
      }

      for(var18 = 0; var18 < client.field912; ++var18) {
         var19 = client.field732[var18];
         int var20 = client.field733[var18];
         int var21 = client.field757[var18];
         int var22 = client.field738[var18];
         boolean var23 = true;

         while(var23) {
            var23 = false;

            for(int var24 = 0; var24 < var18; ++var24) {
               if (var20 + 2 > client.field733[var24] - client.field738[var24] && var20 - var22 < client.field733[var24] + 2 && var19 - var21 < client.field757[var24] + client.field732[var24] && var21 + var19 > client.field732[var24] - client.field757[var24] && client.field733[var24] - client.field738[var24] < var20) {
                  var20 = client.field733[var24] - client.field738[var24];
                  var23 = true;
               }
            }
         }

         client.field652 = client.field732[var18];
         client.field903 = client.field733[var18] = var20;
         String var32 = client.field739[var18];
         if (client.field807 == 0) {
            int var25 = 16776960;
            if (client.field736[var18] < 6) {
               var25 = client.field859[client.field736[var18]];
            }

            if (client.field736[var18] == 6) {
               var25 = client.field741 % 20 < 10 ? 16711680 : 16776960;
            }

            if (client.field736[var18] == 7) {
               var25 = client.field741 % 20 < 10 ? 255 : '\uffff';
            }

            if (client.field736[var18] == 8) {
               var25 = client.field741 % 20 < 10 ? '뀀' : 8454016;
            }

            int var26;
            if (client.field736[var18] == 9) {
               var26 = 150 - client.field818[var18];
               if (var26 < 50) {
                  var25 = var26 * 1280 + 16711680;
               } else if (var26 < 100) {
                  var25 = 16776960 - (var26 - 50) * 327680;
               } else if (var26 < 150) {
                  var25 = (var26 - 100) * 5 + '\uff00';
               }
            }

            if (client.field736[var18] == 10) {
               var26 = 150 - client.field818[var18];
               if (var26 < 50) {
                  var25 = var26 * 5 + 16711680;
               } else if (var26 < 100) {
                  var25 = 16711935 - (var26 - 50) * 327680;
               } else if (var26 < 150) {
                  var25 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
               }
            }

            if (client.field736[var18] == 11) {
               var26 = 150 - client.field818[var18];
               if (var26 < 50) {
                  var25 = 16777215 - var26 * 327685;
               } else if (var26 < 100) {
                  var25 = (var26 - 50) * 327685 + '\uff00';
               } else if (var26 < 150) {
                  var25 = 16777215 - (var26 - 100) * 327680;
               }
            }

            if (client.field737[var18] == 0) {
               class163.field2066.method5880(var32, var0 + client.field652, client.field903 + var1, var25, 0);
            }

            if (client.field737[var18] == 1) {
               class163.field2066.method5802(var32, var0 + client.field652, client.field903 + var1, var25, 0, client.field741);
            }

            if (client.field737[var18] == 2) {
               class163.field2066.method5803(var32, var0 + client.field652, client.field903 + var1, var25, 0, client.field741);
            }

            if (client.field737[var18] == 3) {
               class163.field2066.method5820(var32, var0 + client.field652, client.field903 + var1, var25, 0, client.field741, 150 - client.field818[var18]);
            }

            if (client.field737[var18] == 4) {
               var26 = (150 - client.field818[var18]) * (class163.field2066.method5793(var32) + 100) / 150;
               class319.method6041(var0 + client.field652 - 50, var1, var0 + client.field652 + 50, var3 + var1);
               class163.field2066.method5846(var32, var0 + client.field652 + 50 - var26, client.field903 + var1, var25, 0);
               class319.method6067(var0, var1, var0 + var2, var3 + var1);
            }

            if (client.field737[var18] == 5) {
               var26 = 150 - client.field818[var18];
               int var27 = 0;
               if (var26 < 25) {
                  var27 = var26 - 25;
               } else if (var26 > 125) {
                  var27 = var26 - 125;
               }

               class319.method6041(var0, client.field903 + var1 - class163.field2066.field3765 - 1, var0 + var2, client.field903 + var1 + 5);
               class163.field2066.method5880(var32, var0 + client.field652, var27 + client.field903 + var1, var25, 0);
               class319.method6067(var0, var1, var0 + var2, var3 + var1);
            }
         } else {
            class163.field2066.method5880(var32, var0 + client.field652, client.field903 + var1, 16776960, 0);
         }
      }

      if (client.field663 == 2) {
         class157.method3463((client.field666 - class49.field490 << 7) + client.field669, (client.field667 - class11.field91 << 7) + client.field755, client.field668 * 2);
         if (client.field652 > -1 && client.field655 % 20 < 10) {
            class49.field489[0].method6164(var0 + client.field652 - 12, client.field903 + var1 - 28);
         }
      }

      ((class113)class124.field1752).method2748(client.field705);
      class13.method144(var0, var1, var2, var3);
      class157.field2036 = var29;
      class184.field2409 = var6;
      class50.field508 = var7;
      class57.field576 = var8;
      class15.field143 = var9;
      if (client.field654 && class50.method1058(true, false) == 0) {
         client.field654 = false;
      }

      if (client.field654) {
         class319.method6047(var0, var1, var2, var3, 0);
         class58.method1132("Loading - please wait.", false);
      }

   }

   static final void method647(int var0) {
      if (var0 >= 0) {
         int var1 = client.field781[var0];
         int var2 = client.field782[var0];
         int var3 = client.field783[var0];
         int var4 = client.field784[var0];
         String var5 = client.field916[var0];
         String var6 = client.field786[var0];
         class15.method178(var1, var2, var3, var4, var5, var6, class48.field478, class48.field467);
      }
   }

   static String method644(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return client.field786[var0].length() > 0 ? client.field916[var0] + " " + client.field786[var0] : client.field916[var0];
      }
   }
}
