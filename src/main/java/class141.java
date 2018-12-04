public class class141 extends class285 {
   static int field1939;
   public static int field1937;
   final boolean field1936;

   public class141(boolean var1) {
      this.field1936 = var1;
   }

   int method3312(class289 var1, class289 var2) {
      if (client.field691 == var1.field3708) {
         if (var2.field3708 != client.field691) {
            return this.field1936 ? -1 : 1;
         }
      } else if (var2.field3708 == client.field691) {
         return this.field1936 ? 1 : -1;
      }

      return this.method5566(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3312((class289)var1, (class289)var2);
   }

   static final void method3314(class61 var0, int var1, int var2, int var3) {
      if (class69.field1063 != var0) {
         if (client.field780 < 400) {
            String var4;
            int var7;
            if (var0.field617 == 0) {
               String var5 = var0.field627[0] + var0.field625 + var0.field627[1];
               var7 = var0.field611;
               int var8 = class69.field1063.field611;
               int var9 = var8 - var7;
               String var6;
               if (var9 < -9) {
                  var6 = class128.method3233(16711680);
               } else if (var9 < -6) {
                  var6 = class128.method3233(16723968);
               } else if (var9 < -3) {
                  var6 = class128.method3233(16740352);
               } else if (var9 < 0) {
                  var6 = class128.method3233(16756736);
               } else if (var9 > 9) {
                  var6 = class128.method3233(65280);
               } else if (var9 > 6) {
                  var6 = class128.method3233(4259584);
               } else if (var9 > 3) {
                  var6 = class128.method3233(8453888);
               } else if (var9 > 0) {
                  var6 = class128.method3233(12648192);
               } else {
                  var6 = class128.method3233(16776960);
               }

               var4 = var5 + var6 + " " + " (" + "level-" + var0.field611 + ")" + var0.field627[2];
            } else {
               var4 = var0.field627[0] + var0.field625 + var0.field627[1] + " " + " (" + "skill-" + var0.field617 + ")" + var0.field627[2];
            }

            int var10;
            if (client.field796 == 1) {
               class79.method2039("Use", client.field766 + " " + "->" + " " + class128.method3233(16777215) + var4, 14, var1, var2, var3);
            } else if (client.field798) {
               if ((class297.field3740 & 8) == 8) {
                  class79.method2039(client.field801, client.field716 + " " + "->" + " " + class128.method3233(16777215) + var4, 15, var1, var2, var3);
               }
            } else {
               for(var10 = 7; var10 >= 0; --var10) {
                  if (client.field767[var10] != null) {
                     short var11 = 0;
                     if (client.field767[var10].equalsIgnoreCase("Attack")) {
                        if (class78.field1134 == client.field671) {
                           continue;
                        }

                        if (class78.field1139 == client.field671 || client.field671 == class78.field1141 && var0.field611 > class69.field1063.field611) {
                           var11 = 2000;
                        }

                        if (class69.field1063.field622 != 0 && var0.field622 != 0) {
                           if (var0.field622 == class69.field1063.field622) {
                              var11 = 2000;
                           } else {
                              var11 = 0;
                           }
                        }
                     } else if (client.field768[var10]) {
                        var11 = 2000;
                     }

                     boolean var12 = false;
                     var7 = client.field742[var10] + var11;
                     class79.method2039(client.field767[var10], class128.method3233(16777215) + var4, var7, var1, var2, var3);
                  }
               }
            }

            for(var10 = 0; var10 < client.field780; ++var10) {
               if (client.field783[var10] == 23) {
                  client.field786[var10] = class128.method3233(16777215) + var4;
                  break;
               }
            }

         }
      }
   }
}
