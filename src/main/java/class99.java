public class class99 implements Runnable {
   volatile class97[] field1391 = new class97[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class97 var2 = this.field1391[var1];
            if (var2 != null) {
               var2.method2346();
            }
         }
      } catch (Exception var4) {
         class80.method2041((String)null, var4);
      }

   }

   static char method2421(char var0, int var1) {
      if (var0 >= 'À' && var0 <= 'ÿ') {
         if (var0 >= 'À' && var0 <= 'Æ') {
            return 'A';
         }

         if (var0 == 'Ç') {
            return 'C';
         }

         if (var0 >= 'È' && var0 <= 'Ë') {
            return 'E';
         }

         if (var0 >= 'Ì' && var0 <= 'Ï') {
            return 'I';
         }

         if (var0 >= 'Ò' && var0 <= 'Ö') {
            return 'O';
         }

         if (var0 >= 'Ù' && var0 <= 'Ü') {
            return 'U';
         }

         if (var0 == 'Ý') {
            return 'Y';
         }

         if (var0 == 'ß') {
            return 's';
         }

         if (var0 >= 'à' && var0 <= 'æ') {
            return 'a';
         }

         if (var0 == 'ç') {
            return 'c';
         }

         if (var0 >= 'è' && var0 <= 'ë') {
            return 'e';
         }

         if (var0 >= 'ì' && var0 <= 'ï') {
            return 'i';
         }

         if (var0 >= 'ò' && var0 <= 'ö') {
            return 'o';
         }

         if (var0 >= 'ù' && var0 <= 'ü') {
            return 'u';
         }

         if (var0 == 'ý' || var0 == 'ÿ') {
            return 'y';
         }
      }

      if (var0 == 'Œ') {
         return 'O';
      } else if (var0 == 'œ') {
         return 'o';
      } else {
         return var0 == 'Ÿ' ? 'Y' : var0;
      }
   }

   static char method2426(char var0) {
      switch(var0) {
      case ' ':
      case '-':
      case '_':
      case ' ':
         return '_';
      case '#':
      case '[':
      case ']':
         return var0;
      case 'À':
      case 'Á':
      case 'Â':
      case 'Ã':
      case 'Ä':
      case 'à':
      case 'á':
      case 'â':
      case 'ã':
      case 'ä':
         return 'a';
      case 'Ç':
      case 'ç':
         return 'c';
      case 'È':
      case 'É':
      case 'Ê':
      case 'Ë':
      case 'è':
      case 'é':
      case 'ê':
      case 'ë':
         return 'e';
      case 'Í':
      case 'Î':
      case 'Ï':
      case 'í':
      case 'î':
      case 'ï':
         return 'i';
      case 'Ñ':
      case 'ñ':
         return 'n';
      case 'Ò':
      case 'Ó':
      case 'Ô':
      case 'Õ':
      case 'Ö':
      case 'ò':
      case 'ó':
      case 'ô':
      case 'õ':
      case 'ö':
         return 'o';
      case 'Ù':
      case 'Ú':
      case 'Û':
      case 'Ü':
      case 'ù':
      case 'ú':
      case 'û':
      case 'ü':
         return 'u';
      case 'ß':
         return 'b';
      case 'ÿ':
      case 'Ÿ':
         return 'y';
      default:
         return Character.toLowerCase(var0);
      }
   }
}
