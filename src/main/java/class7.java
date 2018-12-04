import java.io.File;
import java.io.IOException;
import java.util.Comparator;

final class class7 implements Comparator {
   int method84(class2 var1, class2 var2) {
      return var1.field16 < var2.field16 ? -1 : (var1.field16 == var2.field16 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method84((class2)var1, (class2)var2);
   }

   public static class112 method85(String var0, String var1, boolean var2) {
      File var3 = new File(class51.field519, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            class112 var10 = new class112(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
            ;
         }
      }

      String var4 = "";
      if (class157.field2033 == 33) {
         var4 = "_rc";
      } else if (class157.field2033 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(class21.field206, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      class112 var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new class112(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
            ;
         }
      }

      try {
         var6 = new class112(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   static void method89() {
      if (class11.method121()) {
         class79.field1176 = true;
      }

   }

   static int method95(int var0, class86 var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = class60.field599;
         int var9 = (class69.field1063.field953 >> 7) + class49.field490;
         int var5 = (class69.field1063.field999 >> 7) + class11.field91;
         method88().method6329(var3, var9, var5, true);
         return 1;
      } else {
         class20 var11;
         if (var0 == 6601) {
            var3 = class70.field1070[--class60.field600];
            String var16 = "";
            var11 = method88().method6347(var3);
            if (var11 != null) {
               var16 = var11.method267();
            }

            class70.field1065[++class70.field1072 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var3 = class70.field1070[--class60.field600];
            method88().method6330(var3);
            return 1;
         } else if (var0 == 6603) {
            class70.field1070[++class60.field600 - 1] = method88().method6389();
            return 1;
         } else if (var0 == 6604) {
            var3 = class70.field1070[--class60.field600];
            method88().method6324(var3);
            return 1;
         } else if (var0 == 6605) {
            class70.field1070[++class60.field600 - 1] = method88().method6326() ? 1 : 0;
            return 1;
         } else {
            class228 var15;
            if (var0 == 6606) {
               var15 = new class228(class70.field1070[--class60.field600]);
               method88().method6486(var15.field2632, var15.field2633);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class228(class70.field1070[--class60.field600]);
               method88().method6437(var15.field2632, var15.field2633);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class228(class70.field1070[--class60.field600]);
               method88().method6350(var15.field2634, var15.field2632, var15.field2633);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class228(class70.field1070[--class60.field600]);
               method88().method6351(var15.field2634, var15.field2632, var15.field2633);
               return 1;
            } else if (var0 == 6610) {
               class70.field1070[++class60.field600 - 1] = method88().method6367();
               class70.field1070[++class60.field600 - 1] = method88().method6353();
               return 1;
            } else {
               class20 var13;
               if (var0 == 6611) {
                  var3 = class70.field1070[--class60.field600];
                  var13 = method88().method6347(var3);
                  if (var13 == null) {
                     class70.field1070[++class60.field600 - 1] = 0;
                  } else {
                     class70.field1070[++class60.field600 - 1] = var13.method266().method4646();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var3 = class70.field1070[--class60.field600];
                  var13 = method88().method6347(var3);
                  if (var13 == null) {
                     class70.field1070[++class60.field600 - 1] = 0;
                     class70.field1070[++class60.field600 - 1] = 0;
                  } else {
                     class70.field1070[++class60.field600 - 1] = (var13.method260() - var13.method280() + 1) * 64;
                     class70.field1070[++class60.field600 - 1] = (var13.method271() - var13.method251() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var3 = class70.field1070[--class60.field600];
                  var13 = method88().method6347(var3);
                  if (var13 == null) {
                     class70.field1070[++class60.field600 - 1] = 0;
                     class70.field1070[++class60.field600 - 1] = 0;
                     class70.field1070[++class60.field600 - 1] = 0;
                     class70.field1070[++class60.field600 - 1] = 0;
                  } else {
                     class70.field1070[++class60.field600 - 1] = var13.method280() * 64;
                     class70.field1070[++class60.field600 - 1] = var13.method251() * 64;
                     class70.field1070[++class60.field600 - 1] = var13.method260() * 64 + 64 - 1;
                     class70.field1070[++class60.field600 - 1] = var13.method271() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var3 = class70.field1070[--class60.field600];
                  var13 = method88().method6347(var3);
                  if (var13 == null) {
                     class70.field1070[++class60.field600 - 1] = -1;
                  } else {
                     class70.field1070[++class60.field600 - 1] = var13.method258();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = method88().method6354();
                  if (var15 == null) {
                     class70.field1070[++class60.field600 - 1] = -1;
                     class70.field1070[++class60.field600 - 1] = -1;
                  } else {
                     class70.field1070[++class60.field600 - 1] = var15.field2632;
                     class70.field1070[++class60.field600 - 1] = var15.field2633;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class70.field1070[++class60.field600 - 1] = method88().method6336();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class228(class70.field1070[--class60.field600]);
                  var13 = method88().method6332();
                  if (var13 == null) {
                     class70.field1070[++class60.field600 - 1] = -1;
                     class70.field1070[++class60.field600 - 1] = -1;
                     return 1;
                  } else {
                     int[] var14 = var13.method250(var15.field2634, var15.field2632, var15.field2633);
                     if (var14 == null) {
                        class70.field1070[++class60.field600 - 1] = -1;
                        class70.field1070[++class60.field600 - 1] = -1;
                     } else {
                        class70.field1070[++class60.field600 - 1] = var14[0];
                        class70.field1070[++class60.field600 - 1] = var14[1];
                     }

                     return 1;
                  }
               } else {
                  class228 var7;
                  if (var0 == 6618) {
                     var15 = new class228(class70.field1070[--class60.field600]);
                     var13 = method88().method6332();
                     if (var13 == null) {
                        class70.field1070[++class60.field600 - 1] = -1;
                        class70.field1070[++class60.field600 - 1] = -1;
                        return 1;
                     } else {
                        var7 = var13.method279(var15.field2632, var15.field2633);
                        if (var7 == null) {
                           class70.field1070[++class60.field600 - 1] = -1;
                        } else {
                           class70.field1070[++class60.field600 - 1] = var7.method4646();
                        }

                        return 1;
                     }
                  } else {
                     class228 var12;
                     if (var0 == 6619) {
                        class60.field600 -= 2;
                        var3 = class70.field1070[class60.field600];
                        var12 = new class228(class70.field1070[class60.field600 + 1]);
                        class55.method1107(var3, var12, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class60.field600 -= 2;
                        var3 = class70.field1070[class60.field600];
                        var12 = new class228(class70.field1070[class60.field600 + 1]);
                        class55.method1107(var3, var12, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class60.field600 -= 2;
                        var3 = class70.field1070[class60.field600];
                        var12 = new class228(class70.field1070[class60.field600 + 1]);
                        var11 = method88().method6347(var3);
                        if (var11 == null) {
                           class70.field1070[++class60.field600 - 1] = 0;
                           return 1;
                        } else {
                           class70.field1070[++class60.field600 - 1] = var11.method248(var12.field2634, var12.field2632, var12.field2633) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class70.field1070[++class60.field600 - 1] = method88().method6355();
                        class70.field1070[++class60.field600 - 1] = method88().method6356();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class228(class70.field1070[--class60.field600]);
                        var13 = method88().method6328(var15.field2634, var15.field2632, var15.field2633);
                        if (var13 == null) {
                           class70.field1070[++class60.field600 - 1] = -1;
                        } else {
                           class70.field1070[++class60.field600 - 1] = var13.method253();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        method88().method6357(class70.field1070[--class60.field600]);
                        return 1;
                     } else if (var0 == 6625) {
                        method88().method6358();
                        return 1;
                     } else if (var0 == 6626) {
                        method88().method6359(class70.field1070[--class60.field600]);
                        return 1;
                     } else if (var0 == 6627) {
                        method88().method6360();
                        return 1;
                     } else {
                        boolean var10;
                        if (var0 == 6628) {
                           var10 = class70.field1070[--class60.field600] == 1;
                           method88().method6414(var10);
                           return 1;
                        } else if (var0 == 6629) {
                           var3 = class70.field1070[--class60.field600];
                           method88().method6375(var3);
                           return 1;
                        } else if (var0 == 6630) {
                           var3 = class70.field1070[--class60.field600];
                           method88().method6363(var3);
                           return 1;
                        } else if (var0 == 6631) {
                           method88().method6364();
                           return 1;
                        } else if (var0 == 6632) {
                           var10 = class70.field1070[--class60.field600] == 1;
                           method88().method6492(var10);
                           return 1;
                        } else {
                           boolean var4;
                           if (var0 == 6633) {
                              class60.field600 -= 2;
                              var3 = class70.field1070[class60.field600];
                              var4 = class70.field1070[class60.field600 + 1] == 1;
                              method88().method6323(var3, var4);
                              return 1;
                           } else if (var0 == 6634) {
                              class60.field600 -= 2;
                              var3 = class70.field1070[class60.field600];
                              var4 = class70.field1070[class60.field600 + 1] == 1;
                              method88().method6320(var3, var4);
                              return 1;
                           } else if (var0 == 6635) {
                              class70.field1070[++class60.field600 - 1] = method88().method6368() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var3 = class70.field1070[--class60.field600];
                              class70.field1070[++class60.field600 - 1] = method88().method6370(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var3 = class70.field1070[--class60.field600];
                              class70.field1070[++class60.field600 - 1] = method88().method6372(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class60.field600 -= 2;
                              var3 = class70.field1070[class60.field600];
                              var12 = new class228(class70.field1070[class60.field600 + 1]);
                              var7 = method88().method6373(var3, var12);
                              if (var7 == null) {
                                 class70.field1070[++class60.field600 - 1] = -1;
                              } else {
                                 class70.field1070[++class60.field600 - 1] = var7.method4646();
                              }

                              return 1;
                           } else {
                              class28 var8;
                              if (var0 == 6639) {
                                 var8 = method88().method6506();
                                 if (var8 == null) {
                                    class70.field1070[++class60.field600 - 1] = -1;
                                    class70.field1070[++class60.field600 - 1] = -1;
                                 } else {
                                    class70.field1070[++class60.field600 - 1] = var8.field285;
                                    class70.field1070[++class60.field600 - 1] = var8.field277.method4646();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var8 = method88().method6376();
                                 if (var8 == null) {
                                    class70.field1070[++class60.field600 - 1] = -1;
                                    class70.field1070[++class60.field600 - 1] = -1;
                                 } else {
                                    class70.field1070[++class60.field600 - 1] = var8.field285;
                                    class70.field1070[++class60.field600 - 1] = var8.field277.method4646();
                                 }

                                 return 1;
                              } else {
                                 class257 var6;
                                 if (var0 == 6693) {
                                    var3 = class70.field1070[--class60.field600];
                                    var6 = class162.method3533(var3);
                                    if (var6.field3316 == null) {
                                       class70.field1065[++class70.field1072 - 1] = "";
                                    } else {
                                       class70.field1065[++class70.field1072 - 1] = var6.field3316;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var3 = class70.field1070[--class60.field600];
                                    var6 = class162.method3533(var3);
                                    class70.field1070[++class60.field600 - 1] = var6.field3318;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var3 = class70.field1070[--class60.field600];
                                    var6 = class162.method3533(var3);
                                    if (var6 == null) {
                                       class70.field1070[++class60.field600 - 1] = -1;
                                    } else {
                                       class70.field1070[++class60.field600 - 1] = var6.field3317;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var3 = class70.field1070[--class60.field600];
                                    var6 = class162.method3533(var3);
                                    if (var6 == null) {
                                       class70.field1070[++class60.field600 - 1] = -1;
                                    } else {
                                       class70.field1070[++class60.field600 - 1] = var6.field3315;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class70.field1070[++class60.field600 - 1] = class152.field1985.field343;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class70.field1070[++class60.field600 - 1] = class152.field1985.field344.method4646();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class70.field1070[++class60.field600 - 1] = class152.field1985.field345.method4646();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static class329 method88() {
      return class45.field418;
   }
}
