public class class327 extends class206 {
   int field3907;
   boolean field3908;
   int field3924;
   int field3910;
   int field3911;
   int field3903;
   int field3913;
   boolean field3914;
   int field3915;
   int field3916;
   int field3917;
   int field3923;
   String field3919;
   String field3920;
   String field3909;
   String field3922;
   int field3921;
   int field3900;
   int field3925;
   int field3927;
   String field3926;
   String field3928;
   int[] field3929 = new int[3];
   int field3930;
   String field3912;

   class327(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
      this.field3907 = var1;
      this.field3908 = var2;
      this.field3924 = var3;
      this.field3910 = var4;
      this.field3911 = var5;
      this.field3903 = var6;
      this.field3913 = var7;
      this.field3914 = var8;
      this.field3915 = var9;
      this.field3916 = var10;
      this.field3917 = var11;
      this.field3923 = var12;
      this.field3919 = var13;
      this.field3920 = var14;
      this.field3909 = var15;
      this.field3922 = var16;
      this.field3921 = var17;
      this.field3900 = var18;
      this.field3925 = var19;
      this.field3927 = var20;
      this.field3926 = var21;
      this.field3928 = var22;
      this.field3929 = var23;
      this.field3930 = var24;
      this.field3912 = var25;
   }

   public void method6302(class184 var1) {
      var1.method3805(7);
      var1.method3805(this.field3907);
      var1.method3805(this.field3908 ? 1 : 0);
      var1.method3805(this.field3924);
      var1.method3805(this.field3910);
      var1.method3805(this.field3911);
      var1.method3805(this.field3903);
      var1.method3805(this.field3913);
      var1.method3805(this.field3914 ? 1 : 0);
      var1.method3754(this.field3915);
      var1.method3805(this.field3916);
      var1.method3755(this.field3917);
      var1.method3754(this.field3923);
      var1.method3956(this.field3919);
      var1.method3956(this.field3920);
      var1.method3956(this.field3909);
      var1.method3956(this.field3922);
      var1.method3805(this.field3900);
      var1.method3754(this.field3921);
      var1.method3956(this.field3926);
      var1.method3956(this.field3928);
      var1.method3805(this.field3925);
      var1.method3805(this.field3927);

      for(int var2 = 0; var2 < this.field3929.length; ++var2) {
         var1.method3921(this.field3929[var2]);
      }

      var1.method3921(this.field3930);
      var1.method3956(this.field3912);
   }

   public int method6297() {
      byte var1 = 38;
      String var4 = this.field3919;
      int var3 = var4.length() + 2;
      int var23 = var1 + var3;
      String var7 = this.field3920;
      int var6 = var7.length() + 2;
      var23 += var6;
      String var10 = this.field3909;
      int var9 = var10.length() + 2;
      var23 += var9;
      String var13 = this.field3922;
      int var12 = var13.length() + 2;
      var23 += var12;
      String var16 = this.field3926;
      int var15 = var16.length() + 2;
      var23 += var15;
      String var19 = this.field3928;
      int var18 = var19.length() + 2;
      var23 += var18;
      String var22 = this.field3912;
      int var21 = var22.length() + 2;
      var23 += var21;
      return var23;
   }
}
