import java.io.EOFException;
import java.io.IOException;

public class class111 {
   static class322[] field1490;
   static class159 field1489;
   static byte[][] field1487;
   class112 field1478;
   byte[] field1482;
   long field1479 = -1L;
   int field1480;
   byte[] field1481;
   long field1485 = -1L;
   int field1483 = 0;
   long field1477;
   long field1488;
   long field1486;
   long field1484;

   public class111(class112 var1, int var2, int var3) throws IOException {
      this.field1478 = var1;
      this.field1486 = this.field1488 = var1.method2719();
      this.field1482 = new byte[var2];
      this.field1481 = new byte[var3];
      this.field1477 = 0L;
   }

   public void method2682() throws IOException {
      this.method2691();
      this.field1478.method2717();
   }

   public void method2683(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field1477 = var1;
      }
   }

   public long method2695() {
      return this.field1486;
   }

   public void method2685(byte[] var1) throws IOException {
      this.method2686(var1, 0, var1.length);
   }

   public void method2686(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field1485 && this.field1477 >= this.field1485 && (long)var3 + this.field1477 <= this.field1485 + (long)this.field1483) {
            System.arraycopy(this.field1481, (int)(this.field1477 - this.field1485), var1, var2, var3);
            this.field1477 += (long)var3;
            return;
         }

         long var4 = this.field1477;
         int var7 = var3;
         int var8;
         if (this.field1477 >= this.field1479 && this.field1477 < this.field1479 + (long)this.field1480) {
            var8 = (int)((long)this.field1480 - (this.field1477 - this.field1479));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field1482, (int)(this.field1477 - this.field1479), var1, var2, var8);
            this.field1477 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field1482.length) {
            this.field1478.method2718(this.field1477);

            for(this.field1484 = this.field1477; var3 > 0; var3 -= var8) {
               var8 = this.field1478.method2720(var1, var2, var3);
               if (var8 == -1) {
                  break;
               }

               this.field1484 += (long)var8;
               this.field1477 += (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.method2687();
            var8 = var3;
            if (var3 > this.field1480) {
               var8 = this.field1480;
            }

            System.arraycopy(this.field1482, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field1477 += (long)var8;
         }

         if (this.field1485 != -1L) {
            if (this.field1485 > this.field1477 && var3 > 0) {
               var8 = var2 + (int)(this.field1485 - this.field1477);
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field1477;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if (this.field1485 >= var4 && this.field1485 < var4 + (long)var7) {
               var13 = this.field1485;
            } else if (var4 >= this.field1485 && var4 < this.field1485 + (long)this.field1483) {
               var13 = var4;
            }

            if ((long)this.field1483 + this.field1485 > var4 && (long)this.field1483 + this.field1485 <= (long)var7 + var4) {
               var10 = (long)this.field1483 + this.field1485;
            } else if ((long)var7 + var4 > this.field1485 && (long)var7 + var4 <= (long)this.field1483 + this.field1485) {
               var10 = (long)var7 + var4;
            }

            if (var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field1481, (int)(var13 - this.field1485), var1, (int)(var13 - var4) + var2, var12);
               if (var10 > this.field1477) {
                  var3 = (int)((long)var3 - (var10 - this.field1477));
                  this.field1477 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field1484 = -1L;
         throw var16;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method2687() throws IOException {
      this.field1480 = 0;
      if (this.field1484 != this.field1477) {
         this.field1478.method2718(this.field1477);
         this.field1484 = this.field1477;
      }

      int var1;
      for(this.field1479 = this.field1477; this.field1480 < this.field1482.length; this.field1480 += var1) {
         var1 = this.field1478.method2720(this.field1482, this.field1480, this.field1482.length - this.field1480);
         if (var1 == -1) {
            break;
         }

         this.field1484 += (long)var1;
      }

   }

   public void method2692(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field1477 > this.field1486) {
            this.field1486 = this.field1477 + (long)var3;
         }

         if (-1L != this.field1485 && (this.field1477 < this.field1485 || this.field1477 > (long)this.field1483 + this.field1485)) {
            this.method2691();
         }

         if (-1L != this.field1485 && (long)var3 + this.field1477 > this.field1485 + (long)this.field1481.length) {
            int var4 = (int)((long)this.field1481.length - (this.field1477 - this.field1485));
            System.arraycopy(var1, var2, this.field1481, (int)(this.field1477 - this.field1485), var4);
            this.field1477 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field1483 = this.field1481.length;
            this.method2691();
         }

         if (var3 <= this.field1481.length) {
            if (var3 > 0) {
               if (-1L == this.field1485) {
                  this.field1485 = this.field1477;
               }

               System.arraycopy(var1, var2, this.field1481, (int)(this.field1477 - this.field1485), var3);
               this.field1477 += (long)var3;
               if (this.field1477 - this.field1485 > (long)this.field1483) {
                  this.field1483 = (int)(this.field1477 - this.field1485);
               }

            }
         } else {
            if (this.field1477 != this.field1484) {
               this.field1478.method2718(this.field1477);
               this.field1484 = this.field1477;
            }

            this.field1478.method2716(var1, var2, var3);
            this.field1484 += (long)var3;
            if (this.field1484 > this.field1488) {
               this.field1488 = this.field1484;
            }

            long var9 = -1L;
            long var6 = -1L;
            if (this.field1477 >= this.field1479 && this.field1477 < (long)this.field1480 + this.field1479) {
               var9 = this.field1477;
            } else if (this.field1479 >= this.field1477 && this.field1479 < this.field1477 + (long)var3) {
               var9 = this.field1479;
            }

            if ((long)var3 + this.field1477 > this.field1479 && this.field1477 + (long)var3 <= this.field1479 + (long)this.field1480) {
               var6 = (long)var3 + this.field1477;
            } else if (this.field1479 + (long)this.field1480 > this.field1477 && (long)this.field1480 + this.field1479 <= (long)var3 + this.field1477) {
               var6 = this.field1479 + (long)this.field1480;
            }

            if (var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field1477), this.field1482, (int)(var9 - this.field1479), var8);
            }

            this.field1477 += (long)var3;
         }
      } catch (IOException var12) {
         this.field1484 = -1L;
         throw var12;
      }
   }

   void method2691() throws IOException {
      if (this.field1485 != -1L) {
         if (this.field1484 != this.field1485) {
            this.field1478.method2718(this.field1485);
            this.field1484 = this.field1485;
         }

         this.field1478.method2716(this.field1481, 0, this.field1483);
         this.field1484 += (long)(this.field1483 * 136693003) * -239280477L;
         if (this.field1484 > this.field1488) {
            this.field1488 = this.field1484;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field1485 >= this.field1479 && this.field1485 < this.field1479 + (long)this.field1480) {
            var1 = this.field1485;
         } else if (this.field1479 >= this.field1485 && this.field1479 < this.field1485 + (long)this.field1483) {
            var1 = this.field1479;
         }

         if ((long)this.field1483 + this.field1485 > this.field1479 && this.field1485 + (long)this.field1483 <= (long)this.field1480 + this.field1479) {
            var3 = (long)this.field1483 + this.field1485;
         } else if (this.field1479 + (long)this.field1480 > this.field1485 && this.field1479 + (long)this.field1480 <= (long)this.field1483 + this.field1485) {
            var3 = (long)this.field1480 + this.field1479;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field1481, (int)(var1 - this.field1485), this.field1482, (int)(var1 - this.field1479), var5);
         }

         this.field1485 = -1L;
         this.field1483 = 0;
      }

   }

   public static class154 method2712(Throwable var0, String var1) {
      class154 var2;
      if (var0 instanceof class154) {
         var2 = (class154)var0;
         var2.field2001 = var2.field2001 + ' ' + var1;
      } else {
         var2 = new class154(var0, var1);
      }

      return var2;
   }

   static void method2713(int var0) {
      if (var0 == -3) {
         class185.method4006("Connection timed out.", "Please try using a different world.", "");
      } else if (var0 == -2) {
         class185.method4006("", "Error connecting to server.", "");
      } else if (var0 == -1) {
         class185.method4006("No response from server.", "Please try using a different world.", "");
      } else if (var0 == 3) {
         class79.field1163 = 3;
         class79.field1161 = 1;
      } else if (var0 == 4) {
         class79.field1163 = 12;
         class79.field1142 = 0;
      } else if (var0 == 5) {
         class79.field1161 = 2;
         class185.method4006("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
      } else if (var0 == 6 || !client.field770 && var0 == 68) {
         class185.method4006("RuneScape has been updated!", "Please reload this page.", "");
      } else if (var0 == 7) {
         class185.method4006("This world is full.", "Please use a different world.", "");
      } else if (var0 == 8) {
         class185.method4006("Unable to connect.", "Login server offline.", "");
      } else if (var0 == 9) {
         class185.method4006("Login limit exceeded.", "Too many connections from your address.", "");
      } else if (var0 == 10) {
         class185.method4006("Unable to connect.", "Bad session id.", "");
      } else if (var0 == 11) {
         class185.method4006("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
      } else if (var0 == 12) {
         class185.method4006("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
      } else if (var0 == 13) {
         class185.method4006("Could not complete login.", "Please try using a different world.", "");
      } else if (var0 == 14) {
         class185.method4006("The server is being updated.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 16) {
         class185.method4006("Too many login attempts.", "Please wait a few minutes before trying again.", "");
      } else if (var0 == 17) {
         class185.method4006("You are standing in a members-only area.", "To play on this world move to a free area first", "");
      } else if (var0 == 18) {
         class79.field1163 = 12;
         class79.field1142 = 1;
      } else if (var0 == 19) {
         class185.method4006("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
      } else if (var0 == 20) {
         class185.method4006("Invalid loginserver requested.", "Please try using a different world.", "");
      } else if (var0 == 22) {
         class185.method4006("Malformed login packet.", "Please try again.", "");
      } else if (var0 == 23) {
         class185.method4006("No reply from loginserver.", "Please wait 1 minute and try again.", "");
      } else if (var0 == 24) {
         class185.method4006("Error loading your profile.", "Please contact customer support.", "");
      } else if (var0 == 25) {
         class185.method4006("Unexpected loginserver response.", "Please try using a different world.", "");
      } else if (var0 == 26) {
         class185.method4006("This computers address has been blocked", "as it was used to break our rules.", "");
      } else if (var0 == 27) {
         class185.method4006("", "Service unavailable.", "");
      } else if (var0 == 31) {
         class185.method4006("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
      } else if (var0 == 32) {
         class185.method4006("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
      } else if (var0 == 37) {
         class185.method4006("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
      } else if (var0 == 38) {
         class185.method4006("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
      } else if (var0 == 55) {
         class79.field1163 = 8;
      } else {
         if (var0 == 56) {
            class185.method4006("Enter the 6-digit code generated by your", "authenticator app.", "");
            class16.method202(11);
            return;
         }

         if (var0 == 57) {
            class185.method4006("The code you entered was incorrect.", "Please try again.", "");
            class16.method202(11);
            return;
         }

         if (var0 == 61) {
            class79.field1163 = 7;
         } else {
            class185.method4006("Unexpected server response", "Please try using a different world.", "");
         }
      }

      class16.method202(10);
   }
}
