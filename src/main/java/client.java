import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class47 implements class290 {
   static int field803;
   static class232 field816;
   static int field853;
   static int field847;
   static long field870;
   static boolean field879;
   static boolean[] field848;
   static boolean[] field706;
   static boolean[] field849;
   static boolean field824;
   static boolean field821;
   static int field828;
   static boolean field675;
   static int field836;
   public static int field914;
   static class97 field882;
   static int field906;
   static int field838;
   static int field713;
   static class204 field800;
   static class232 field817;
   static class232 field815;
   static int[] field763;
   static class204 field804;
   static int[] field819;
   static int field823;
   static int field855;
   static int[] field854;
   static int field812;
   static int[] field852;
   static final class60 field670;
   static class207 field842;
   static int field825;
   static int field826;
   static int field810;
   static int field851;
   static int field685;
   static int field878;
   static int[] field918;
   static int[] field900;
   static boolean field827;
   static int field888;
   static String field801;
   static int[] field831;
   static String field716;
   static int field832;
   static int field905;
   static int[] field884;
   static int[] field885;
   static int field722;
   static int[] field793;
   static int field875;
   static class93[] field710;
   static int field874;
   static int[] field887;
   static class229 field908;
   static int field881;
   static int field910;
   static int field841;
   static class232 field811;
   static int field877;
   static int field830;
   static int field876;
   static ArrayList field915;
   static int field765;
   static boolean field889;
   static int field661;
   static int field839;
   static long field868;
   static class232 field880;
   static short field649;
   static int field820;
   static short field896;
   static short field901;
   static class326 field911;
   static short field754;
   static short field684;
   static int[] field871;
   static int field907;
   static short field899;
   static int field644;
   static int[] field872;
   static class323[] field873;
   static int[] field653;
   static int field764;
   static int field657;
   static int field865;
   static int field693;
   static int field861;
   static int field730;
   static short field898;
   static short field897;
   static int field799;
   static boolean[] field890;
   static boolean field863;
   static int[] field867;
   static int[] field846;
   static int field837;
   static class207 field843;
   static int field734;
   static class207 field844;
   static int[] field892;
   static int[] field774;
   static class4[] field895;
   static int field834;
   static int[] field891;
   static int[] field893;
   static int field858;
   static int field807;
   static int[] field894;
   static int field808;
   static int field805;
   static int field642;
   static int field813;
   static long[] field840;
   static int field864;
   static int field835;
   static String field862;
   static class62 field913;
   static int[] field859;
   static class166[] field701;
   static boolean field856 = true;
   public static int field691 = 1;
   static int field660 = 0;
   static int field645 = 0;
   static class246 field646;
   static class330 field920;
   public static boolean field647 = false;
   static boolean field648 = false;
   static int field785 = 0;
   static int field650;
   static int field651 = -1;
   static boolean field770 = false;
   static int field720 = 0;
   static boolean field654 = true;
   static int field655 = 0;
   static long field656 = -1L;
   static int field735 = -1;
   static int field643 = -1;
   static long field814 = -1L;
   static boolean field919 = true;
   static boolean field886 = false;
   static int field662 = 0;
   static int field663 = 0;
   static int field664 = 0;
   static int field665 = 0;
   static int field666 = 0;
   static int field667 = 0;
   static int field668 = 0;
   static int field669 = 0;
   static int field755 = 0;
   static class78 field671;
   static class78 field672;
   static int field902;
   static int field674;
   static int field682;
   static int field787;
   static int field677;
   static int field678;
   static int field679;
   static int field760;
   static class148 field681;
   static boolean field746;
   static class82 field683;
   static byte[] field708;
   static class73[] field806;
   static int field686;
   static int[] field687;
   static int field779;
   static int[] field689;
   public static final class89 field690;
   static int field725;
   static boolean field692;
   static boolean field822;
   static class282 field904;
   static HashMap field695;
   static int field696;
   static int field697;
   static int field753;
   static int field909;
   static int field700;
   static boolean field702;
   static int[][][] field703;
   static final int[] field704;
   static int field705;
   static int field917;
   static int field778;
   static int field883;
   static int field709;
   static boolean field694;
   static int field802;
   static int field712;
   static int field658;
   static int field714;
   static int field715;
   static int field869;
   static int field717;
   static int field718;
   static int field719;
   static int field707;
   static int field721;
   static int field857;
   static int field723;
   static int field724;
   static int field659;
   static boolean field726;
   static int field727;
   static boolean field728;
   static int field729;
   static int field912;
   static int field731;
   static int[] field732;
   static int[] field733;
   static int[] field738;
   static int[] field757;
   static String field766;
   static int[] field736;
   static int[] field737;
   static int[] field818;
   static String[] field739;
   static int[][] field740;
   static int field741;
   static int field652;
   static int field903;
   static int field744;
   static int field745;
   static int field809;
   static int field759;
   static boolean field748;
   static int field749;
   static int field750;
   static int field751;
   static int field752;
   static int field845;
   static int field797;
   static boolean field673;
   static int field756;
   static int field680;
   static boolean field758;
   static class61[] field698;
   static int field747;
   static int field761;
   static boolean field762;
   static int field676;
   static int field850;
   static int[] field743;
   static final int[] field742;
   static String[] field767;
   static boolean[] field768;
   static int[] field699;
   static int field769;
   static class207[][][] field829;
   static class207 field688;
   static class207 field773;
   static class207 field711;
   static int[] field775;
   static int[] field776;
   static int[] field777;
   static int field866;
   static boolean field833;
   static int field780;
   static int[] field781;
   static int[] field782;
   static int[] field783;
   static int[] field784;
   static String[] field916;
   static String[] field786;
   static boolean[] field772;
   static boolean field788;
   static boolean field789;
   static boolean field790;
   static boolean field791;
   static int field792;
   static int field860;
   static int field794;
   static int field795;
   static int field796;
   static boolean field798;

   static {
      field671 = class78.field1134;
      field672 = class78.field1134;
      field902 = 0;
      field674 = 0;
      field682 = 0;
      field787 = 0;
      field677 = 0;
      field678 = 0;
      field679 = 0;
      field760 = 0;
      field681 = class148.field1964;
      field746 = false;
      field683 = new class82();
      field708 = null;
      field806 = new class73['耀'];
      field686 = 0;
      field687 = new int['耀'];
      field779 = 0;
      field689 = new int[250];
      field690 = new class89();
      field725 = 0;
      field692 = false;
      field822 = true;
      field904 = new class282();
      field695 = new HashMap();
      field696 = 0;
      field697 = 1;
      field753 = 0;
      field909 = 1;
      field700 = 0;
      field701 = new class166[4];
      field702 = false;
      field703 = new int[4][13][13];
      field704 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field705 = 0;
      field917 = 2301979;
      field778 = 5063219;
      field883 = 3353893;
      field709 = 7759444;
      field694 = false;
      field802 = 0;
      field712 = 128;
      field658 = 0;
      field714 = 0;
      field715 = 0;
      field869 = 0;
      field717 = 0;
      field718 = 0;
      field719 = 50;
      field707 = 0;
      field721 = 0;
      field857 = 0;
      field723 = 12;
      field724 = 6;
      field659 = 0;
      field726 = false;
      field727 = 0;
      field728 = false;
      field729 = 0;
      field912 = 0;
      field731 = 50;
      field732 = new int[field731];
      field733 = new int[field731];
      field738 = new int[field731];
      field757 = new int[field731];
      field736 = new int[field731];
      field737 = new int[field731];
      field818 = new int[field731];
      field739 = new String[field731];
      field740 = new int[104][104];
      field741 = 0;
      field652 = -1;
      field903 = -1;
      field744 = 0;
      field745 = 0;
      field809 = 0;
      field759 = 0;
      field748 = true;
      field749 = 0;
      field750 = 0;
      field751 = 0;
      field752 = 0;
      field845 = 0;
      field797 = 0;
      field673 = false;
      field756 = 0;
      field680 = 0;
      field758 = true;
      field698 = new class61[2048];
      field747 = -1;
      field761 = 0;
      field762 = true;
      field676 = 0;
      field850 = 0;
      field743 = new int[1000];
      field742 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field767 = new String[8];
      field768 = new boolean[8];
      field699 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field769 = -1;
      field829 = new class207[4][104][104];
      field688 = new class207();
      field773 = new class207();
      field711 = new class207();
      field775 = new int[25];
      field776 = new int[25];
      field777 = new int[25];
      field866 = 0;
      field833 = false;
      field780 = 0;
      field781 = new int[500];
      field782 = new int[500];
      field783 = new int[500];
      field784 = new int[500];
      field916 = new String[500];
      field786 = new String[500];
      field772 = new boolean[500];
      field788 = false;
      field789 = false;
      field790 = false;
      field791 = true;
      field792 = -1;
      field860 = -1;
      field794 = 0;
      field795 = 50;
      field796 = 0;
      field766 = null;
      field798 = false;
      field799 = -1;
      field734 = -1;
      field801 = null;
      field716 = null;
      field803 = -1;
      field804 = new class204(8);
      field805 = 0;
      field642 = -1;
      field807 = 0;
      field808 = 0;
      field880 = null;
      field810 = 0;
      field851 = 0;
      field812 = 0;
      field813 = -1;
      field863 = false;
      field815 = null;
      field816 = null;
      field817 = null;
      field906 = 0;
      field838 = 0;
      field811 = null;
      field821 = false;
      field713 = -1;
      field823 = -1;
      field824 = false;
      field825 = -1;
      field826 = -1;
      field827 = false;
      field828 = 1;
      field653 = new int[32];
      field830 = 0;
      field831 = new int[32];
      field832 = 0;
      field774 = new int[32];
      field834 = 0;
      field835 = 0;
      field836 = 0;
      field837 = 0;
      field858 = 0;
      field839 = 0;
      field685 = 0;
      field841 = 0;
      field842 = new class207();
      field843 = new class207();
      field844 = new class207();
      field800 = new class204(512);
      field853 = 0;
      field847 = -2;
      field848 = new boolean[100];
      field849 = new boolean[100];
      field706 = new boolean[100];
      field763 = new int[100];
      field852 = new int[100];
      field819 = new int[100];
      field854 = new int[100];
      field855 = 0;
      field870 = 0L;
      field675 = true;
      field859 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field730 = 0;
      field861 = 0;
      field862 = "";
      field840 = new long[100];
      field864 = 0;
      field865 = 0;
      field846 = new int[128];
      field867 = new int[128];
      field868 = -1L;
      field661 = -1;
      field820 = 0;
      field871 = new int[1000];
      field872 = new int[1000];
      field873 = new class323[1000];
      field722 = 0;
      field875 = 0;
      field876 = 0;
      field877 = 255;
      field878 = -1;
      field879 = false;
      field888 = 127;
      field881 = 127;
      field905 = 0;
      field884 = new int[50];
      field885 = new int[50];
      field793 = new int[50];
      field887 = new int[50];
      field710 = new class93[50];
      field889 = false;
      field890 = new boolean[5];
      field891 = new int[5];
      field892 = new int[5];
      field893 = new int[5];
      field894 = new int[5];
      field649 = 256;
      field896 = 205;
      field897 = 256;
      field898 = 320;
      field899 = 1;
      field684 = 32767;
      field901 = 1;
      field754 = 32767;
      field657 = 0;
      field693 = 0;
      field644 = 0;
      field764 = 0;
      field907 = 0;
      field908 = new class229();
      field874 = -1;
      field910 = -1;
      field911 = new class325();
      field895 = new class4[8];
      field913 = new class62();
      field914 = -1;
      field915 = new ArrayList(10);
      field765 = 0;
      field670 = new class60();
      field918 = new int[50];
      field900 = new int[50];
   }

   protected final void vmethod1248() {
      field870 = class120.method2866() + 500L;
      this.method1359();
      if (field803 != -1) {
         this.method1253(true);
      }

   }

   protected final void vmethod1483() {
      class246.method4819(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      class139.field1928 = field645 == 0 ? 'ꩊ' : field691 + '鱀';
      class2.field23 = field645 == 0 ? 443 : field691 + '썐';
      class144.field1947 = class139.field1928;
      class39.field385 = class230.field2650;
      class256.field3306 = class230.field2649;
      class229.field2642 = class230.field2651;
      class229.field2638 = class230.field2652;
      class37.field352 = new class137();
      this.method844();
      this.method850();
      class164.field2076 = this.method848();
      class55.field540 = new class164(255, class157.field2028, class157.field2029, 500000);
      class112 var2 = null;
      class67 var3 = new class67();

      try {
         var2 = class7.method85("", field646.field3202, false);
         byte[] var4 = new byte[(int)var2.method2719()];

         int var6;
         for(int var5 = 0; var5 < var4.length; var5 += var6) {
            var6 = var2.method2720(var4, var5, var4.length - var5);
            if (var6 == -1) {
               throw new IOException();
            }
         }

         var3 = new class67(new class184(var4));
      } catch (Exception var8) {
         ;
      }

      try {
         if (var2 != null) {
            var2.method2717();
         }
      } catch (Exception var7) {
         ;
      }

      class47.field435 = var3;
      this.method918();
      String var9 = class22.field222;
      class45.field419 = this;
      if (var9 != null) {
         class45.field420 = var9;
      }

      if (field645 != 0) {
         field886 = true;
      }

      class27.method513(class47.field435.field1031);
      class170.field2150 = new class68(field920);
   }

   protected final void vmethod1238() {
      ++field655;
      this.method1241();
      class48.method1019();

      int var1;
      try {
         if (class219.field2529 == 1) {
            var1 = class193.field2461.method4403();
            if (var1 > 0 && class193.field2461.method4492()) {
               var1 -= class0.field0;
               if (var1 < 0) {
                  var1 = 0;
               }

               class193.field2461.method4426(var1);
            } else {
               class193.field2461.method4521();
               class193.field2461.method4476();
               if (class137.field1911 != null) {
                  class219.field2529 = 2;
               } else {
                  class219.field2529 = 0;
               }

               class4.field39 = null;
               class82.field1218 = null;
            }
         }
      } catch (Exception var64) {
         var64.printStackTrace();
         class193.field2461.method4521();
         class219.field2529 = 0;
         class4.field39 = null;
         class82.field1218 = null;
         class137.field1911 = null;
      }

      class160.method3502();
      class39 var47 = class39.field386;
      int var2;
      synchronized(class39.field386) {
         ++class39.field391;
         class39.field388 = class39.field390;
         class39.field387 = 0;
         if (class39.field383 >= 0) {
            while(class39.field374 != class39.field383) {
               var2 = class39.field381[class39.field374];
               class39.field374 = class39.field374 + 1 & 127;
               if (var2 < 0) {
                  class39.field380[~var2] = false;
               } else {
                  if (!class39.field380[var2] && class39.field387 < class39.field377.length - 1) {
                     class39.field377[++class39.field387 - 1] = var2;
                  }

                  class39.field380[var2] = true;
               }
            }
         } else {
            for(var2 = 0; var2 < 112; ++var2) {
               class39.field380[var2] = false;
            }

            class39.field383 = class39.field374;
         }

         if (class39.field387 > 0) {
            class39.field391 = 0;
         }

         class39.field390 = class39.field389;
      }

      class48 var75 = class48.field470;
      synchronized(class48.field470) {
         class48.field469 = class48.field481;
         class48.field473 = class48.field466;
         class48.field464 = class48.field463 * -1727565463;
         class48.field472 = class48.field468;
         class48.field477 = class48.field471;
         class48.field478 = class48.field474;
         class48.field467 = class48.field475;
         class48.field465 = class48.field476;
         class48.field471 = 0;
      }

      if (class164.field2076 != null) {
         var1 = class164.field2076.vmethod3464();
         field841 = var1;
      }

      if (field720 == 0) {
         class82.method2068();
         class47.field433.vmethod3534();

         for(var1 = 0; var1 < 32; ++var1) {
            class47.field429[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            class47.field444[var1] = 0L;
         }

         class181.field2363 = 0;
      } else if (field720 == 5) {
         class67.method1745(this);
         class82.method2068();
         class47.field433.vmethod3534();

         for(var1 = 0; var1 < 32; ++var1) {
            class47.field429[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            class47.field444[var1] = 0L;
         }

         class181.field2363 = 0;
      } else if (field720 != 10 && field720 != 11) {
         if (field720 == 20) {
            class67.method1745(this);
            this.method1244();
         } else if (field720 == 25) {
            class73.method1983(false);
            field696 = 0;
            boolean var67 = true;

            for(var2 = 0; var2 < class192.field2458.length; ++var2) {
               if (class219.field2532[var2] != -1 && class192.field2458[var2] == null) {
                  class192.field2458[var2] = class332.field4017.method4831(class219.field2532[var2], 0);
                  if (class192.field2458[var2] == null) {
                     var67 = false;
                     ++field696;
                  }
               }

               if (class29.field295[var2] != -1 && class111.field1487[var2] == null) {
                  class111.field1487[var2] = class332.field4017.method4869(class29.field295[var2], 0, class250.field3247[var2]);
                  if (class111.field1487[var2] == null) {
                     var67 = false;
                     ++field696;
                  }
               }
            }

            if (!var67) {
               field700 = 1;
            } else {
               field753 = 0;
               var67 = true;

               int var5;
               int var48;
               for(var2 = 0; var2 < class192.field2458.length; ++var2) {
                  byte[] var3 = class111.field1487[var2];
                  if (var3 != null) {
                     var48 = (class37.field367[var2] >> 8) * 64 - class49.field490;
                     var5 = (class37.field367[var2] & 255) * 64 - class11.field91;
                     if (field702) {
                        var48 = 10;
                        var5 = 10;
                     }

                     var67 &= class193.method4099(var3, var48, var5);
                  }
               }

               if (!var67) {
                  field700 = 2;
               } else {
                  if (field700 != 0) {
                     class58.method1132("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
                  }

                  class160.method3502();
                  class243.field3173.method3057();

                  for(var2 = 0; var2 < 4; ++var2) {
                     field701[var2].method3612();
                  }

                  int var49;
                  for(var2 = 0; var2 < 4; ++var2) {
                     for(var49 = 0; var49 < 104; ++var49) {
                        for(var48 = 0; var48 < 104; ++var48) {
                           class50.field492[var2][var49][var48] = 0;
                        }
                     }
                  }

                  class160.method3502();
                  class50.field493 = 99;
                  class19.field188 = new byte[4][104][104];
                  class140.field1932 = new byte[4][104][104];
                  class50.field494 = new byte[4][104][104];
                  class8.field64 = new byte[4][104][104];
                  class55.field553 = new int[4][105][105];
                  class50.field503 = new byte[4][105][105];
                  class50.field496 = new int[105][105];
                  class246.field3210 = new int[104];
                  class50.field510 = new int[104];
                  class184.field2408 = new int[104];
                  class297.field3739 = new int[104];
                  class289.field3707 = new int[104];
                  var2 = class192.field2458.length;
                  class148.method3368();
                  class73.method1983(true);
                  int var7;
                  int var8;
                  int var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  int var20;
                  int var21;
                  int var22;
                  int var51;
                  if (!field702) {
                     var49 = 0;

                     label1352:
                     while(true) {
                        byte[] var6;
                        if (var49 >= var2) {
                           for(var49 = 0; var49 < var2; ++var49) {
                              var48 = (class37.field367[var49] >> 8) * 64 - class49.field490;
                              var5 = (class37.field367[var49] & 255) * 64 - class11.field91;
                              var6 = class192.field2458[var49];
                              if (var6 == null && class164.field2075 < 800) {
                                 class160.method3502();
                                 class180.method3731(var48, var5, 64, 64);
                              }
                           }

                           class73.method1983(true);
                           var49 = 0;

                           while(true) {
                              if (var49 >= var2) {
                                 break label1352;
                              }

                              byte[] var4 = class111.field1487[var49];
                              if (var4 != null) {
                                 var5 = (class37.field367[var49] >> 8) * 64 - class49.field490;
                                 var51 = (class37.field367[var49] & 255) * 64 - class11.field91;
                                 class160.method3502();
                                 class127 var52 = class243.field3173;
                                 class166[] var53 = field701;
                                 class184 var71 = new class184(var4);
                                 var10 = -1;

                                 while(true) {
                                    var11 = var71.method3784();
                                    if (var11 == 0) {
                                       break;
                                    }

                                    var10 += var11;
                                    var12 = 0;

                                    while(true) {
                                       var13 = var71.method3783();
                                       if (var13 == 0) {
                                          break;
                                       }

                                       var12 += var13 - 1;
                                       var14 = var12 & 63;
                                       var15 = var12 >> 6 & 63;
                                       var16 = var12 >> 12;
                                       var17 = var71.method3983();
                                       var18 = var17 >> 2;
                                       var19 = var17 & 3;
                                       var20 = var15 + var5;
                                       var21 = var51 + var14;
                                       if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                          var22 = var16;
                                          if ((class50.field492[1][var20][var21] & 2) == 2) {
                                             var22 = var16 - 1;
                                          }

                                          class166 var23 = null;
                                          if (var22 >= 0) {
                                             var23 = var53[var22];
                                          }

                                          class23.method381(var16, var20, var21, var10, var19, var18, var52, var23);
                                       }
                                    }
                                 }
                              }

                              ++var49;
                           }
                        }

                        var48 = (class37.field367[var49] >> 8) * 64 - class49.field490;
                        var5 = (class37.field367[var49] & 255) * 64 - class11.field91;
                        var6 = class192.field2458[var49];
                        if (var6 != null) {
                           class160.method3502();
                           var7 = class123.field1727 * 8 - 48;
                           var8 = class164.field2075 * 8 - 48;
                           class166[] var9 = field701;
                           var10 = 0;

                           label1349:
                           while(true) {
                              if (var10 >= 4) {
                                 class184 var50 = new class184(var6);
                                 var11 = 0;

                                 while(true) {
                                    if (var11 >= 4) {
                                       break label1349;
                                    }

                                    for(var12 = 0; var12 < 64; ++var12) {
                                       for(var13 = 0; var13 < 64; ++var13) {
                                          class126.method3053(var50, var11, var48 + var12, var5 + var13, var7, var8, 0);
                                       }
                                    }

                                    ++var11;
                                 }
                              }

                              for(var11 = 0; var11 < 64; ++var11) {
                                 for(var12 = 0; var12 < 64; ++var12) {
                                    if (var11 + var48 > 0 && var11 + var48 < 103 && var5 + var12 > 0 && var12 + var5 < 103) {
                                       var9[var10].field2101[var11 + var48][var12 + var5] &= -16777217;
                                    }
                                 }
                              }

                              ++var10;
                           }
                        }

                        ++var49;
                     }
                  }

                  int var54;
                  if (field702) {
                     var49 = 0;

                     label1285:
                     while(true) {
                        if (var49 >= 4) {
                           for(var49 = 0; var49 < 13; ++var49) {
                              for(var48 = 0; var48 < 13; ++var48) {
                                 var5 = field703[0][var49][var48];
                                 if (var5 == -1) {
                                    class180.method3731(var49 * 8, var48 * 8, 8, 8);
                                 }
                              }
                           }

                           class73.method1983(true);
                           var49 = 0;

                           while(true) {
                              if (var49 >= 4) {
                                 break label1285;
                              }

                              class160.method3502();

                              for(var48 = 0; var48 < 13; ++var48) {
                                 for(var5 = 0; var5 < 13; ++var5) {
                                    var51 = field703[var49][var48][var5];
                                    if (var51 != -1) {
                                       var7 = var51 >> 24 & 3;
                                       var8 = var51 >> 1 & 3;
                                       var54 = var51 >> 14 & 1023;
                                       var10 = var51 >> 3 & 2047;
                                       var11 = (var54 / 8 << 8) + var10 / 8;

                                       for(var12 = 0; var12 < class37.field367.length; ++var12) {
                                          if (class37.field367[var12] == var11 && class111.field1487[var12] != null) {
                                             class255.method5017(class111.field1487[var12], var49, var48 * 8, var5 * 8, var7, (var54 & 7) * 8, (var10 & 7) * 8, var8, class243.field3173, field701);
                                             break;
                                          }
                                       }
                                    }
                                 }
                              }

                              ++var49;
                           }
                        }

                        class160.method3502();

                        for(var48 = 0; var48 < 13; ++var48) {
                           for(var5 = 0; var5 < 13; ++var5) {
                              boolean var76 = false;
                              var7 = field703[var49][var48][var5];
                              if (var7 != -1) {
                                 var8 = var7 >> 24 & 3;
                                 var54 = var7 >> 1 & 3;
                                 var10 = var7 >> 14 & 1023;
                                 var11 = var7 >> 3 & 2047;
                                 var12 = (var10 / 8 << 8) + var11 / 8;

                                 for(var13 = 0; var13 < class37.field367.length; ++var13) {
                                    if (class37.field367[var13] == var12 && class192.field2458[var13] != null) {
                                       class262.method5145(class192.field2458[var13], var49, var48 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var54, field701);
                                       var76 = true;
                                       break;
                                    }
                                 }
                              }

                              if (!var76) {
                                 var8 = var49;
                                 var54 = var48 * 8;
                                 var10 = var5 * 8;

                                 for(var11 = 0; var11 < 8; ++var11) {
                                    for(var12 = 0; var12 < 8; ++var12) {
                                       class50.field506[var8][var54 + var11][var12 + var10] = 0;
                                    }
                                 }

                                 if (var54 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class50.field506[var8][var54][var11 + var10] = class50.field506[var8][var54 - 1][var11 + var10];
                                    }
                                 }

                                 if (var10 > 0) {
                                    for(var11 = 1; var11 < 8; ++var11) {
                                       class50.field506[var8][var54 + var11][var10] = class50.field506[var8][var11 + var54][var10 - 1];
                                    }
                                 }

                                 if (var54 > 0 && class50.field506[var8][var54 - 1][var10] != 0) {
                                    class50.field506[var8][var54][var10] = class50.field506[var8][var54 - 1][var10];
                                 } else if (var10 > 0 && class50.field506[var8][var54][var10 - 1] != 0) {
                                    class50.field506[var8][var54][var10] = class50.field506[var8][var54][var10 - 1];
                                 } else if (var54 > 0 && var10 > 0 && class50.field506[var8][var54 - 1][var10 - 1] != 0) {
                                    class50.field506[var8][var54][var10] = class50.field506[var8][var54 - 1][var10 - 1];
                                 }
                              }
                           }
                        }

                        ++var49;
                     }
                  }

                  class73.method1983(true);
                  class160.method3502();
                  class127 var65 = class243.field3173;
                  class166[] var66 = field701;

                  for(var5 = 0; var5 < 4; ++var5) {
                     for(var51 = 0; var51 < 104; ++var51) {
                        for(var7 = 0; var7 < 104; ++var7) {
                           if ((class50.field492[var5][var51][var7] & 1) == 1) {
                              var8 = var5;
                              if ((class50.field492[1][var51][var7] & 2) == 2) {
                                 var8 = var5 - 1;
                              }

                              if (var8 >= 0) {
                                 var66[var8].method3615(var51, var7);
                              }
                           }
                        }
                     }
                  }

                  class50.field504 += (int)(Math.random() * 5.0D) - 2;
                  if (class50.field504 < -8) {
                     class50.field504 = -8;
                  }

                  if (class50.field504 > 8) {
                     class50.field504 = 8;
                  }

                  class50.field498 += (int)(Math.random() * 5.0D) - 2;
                  if (class50.field498 < -16) {
                     class50.field498 = -16;
                  }

                  if (class50.field498 > 16) {
                     class50.field498 = 16;
                  }

                  for(var5 = 0; var5 < 4; ++var5) {
                     byte[][] var68 = class50.field503[var5];
                     var12 = (int)Math.sqrt(5100.0D);
                     var13 = var12 * 768 >> 8;

                     int var55;
                     for(var14 = 1; var14 < 103; ++var14) {
                        for(var15 = 1; var15 < 103; ++var15) {
                           var16 = class50.field506[var5][var15 + 1][var14] - class50.field506[var5][var15 - 1][var14];
                           var17 = class50.field506[var5][var15][var14 + 1] - class50.field506[var5][var15][var14 - 1];
                           var18 = (int)Math.sqrt((double)(var17 * var17 + var16 * var16 + 65536));
                           var19 = (var16 << 8) / var18;
                           var20 = 65536 / var18;
                           var21 = (var17 << 8) / var18;
                           var22 = (var19 * -50 + var21 * -50 + var20 * -10) / var13 + 96;
                           var55 = (var68[var15 - 1][var14] >> 2) + (var68[var15][var14 - 1] >> 2) + (var68[var15 + 1][var14] >> 3) + (var68[var15][var14 + 1] >> 3) + (var68[var15][var14] >> 1);
                           class50.field496[var15][var14] = var22 - var55;
                        }
                     }

                     for(var14 = 0; var14 < 104; ++var14) {
                        class246.field3210[var14] = 0;
                        class50.field510[var14] = 0;
                        class184.field2408[var14] = 0;
                        class297.field3739[var14] = 0;
                        class289.field3707[var14] = 0;
                     }

                     for(var14 = -5; var14 < 109; ++var14) {
                        for(var15 = 0; var15 < 104; ++var15) {
                           var16 = var14 + 5;
                           if (var16 >= 0 && var16 < 104) {
                              var17 = class19.field188[var5][var16][var15] & 255;
                              if (var17 > 0) {
                                 class261 var56 = class24.method474(var17 - 1);
                                 class246.field3210[var15] += var56.field3361;
                                 class50.field510[var15] += var56.field3364;
                                 class184.field2408[var15] += var56.field3363;
                                 class297.field3739[var15] += var56.field3360;
                                 ++class289.field3707[var15];
                              }
                           }

                           var17 = var14 - 5;
                           if (var17 >= 0 && var17 < 104) {
                              var18 = class19.field188[var5][var17][var15] & 255;
                              if (var18 > 0) {
                                 class261 var57 = class24.method474(var18 - 1);
                                 class246.field3210[var15] -= var57.field3361;
                                 class50.field510[var15] -= var57.field3364;
                                 class184.field2408[var15] -= var57.field3363;
                                 class297.field3739[var15] -= var57.field3360;
                                 --class289.field3707[var15];
                              }
                           }
                        }

                        if (var14 >= 1 && var14 < 103) {
                           var15 = 0;
                           var16 = 0;
                           var17 = 0;
                           var18 = 0;
                           var19 = 0;

                           for(var20 = -5; var20 < 109; ++var20) {
                              var21 = var20 + 5;
                              if (var21 >= 0 && var21 < 104) {
                                 var15 += class246.field3210[var21];
                                 var16 += class50.field510[var21];
                                 var17 += class184.field2408[var21];
                                 var18 += class297.field3739[var21];
                                 var19 += class289.field3707[var21];
                              }

                              var22 = var20 - 5;
                              if (var22 >= 0 && var22 < 104) {
                                 var15 -= class246.field3210[var22];
                                 var16 -= class50.field510[var22];
                                 var17 -= class184.field2408[var22];
                                 var18 -= class297.field3739[var22];
                                 var19 -= class289.field3707[var22];
                              }

                              if (var20 >= 1 && var20 < 103 && (!field648 || (class50.field492[0][var14][var20] & 2) != 0 || (class50.field492[var5][var14][var20] & 16) == 0)) {
                                 if (var5 < class50.field493) {
                                    class50.field493 = var5;
                                 }

                                 var55 = class19.field188[var5][var14][var20] & 255;
                                 int var24 = class140.field1932[var5][var14][var20] & 255;
                                 if (var55 > 0 || var24 > 0) {
                                    int var25 = class50.field506[var5][var14][var20];
                                    int var26 = class50.field506[var5][var14 + 1][var20];
                                    int var27 = class50.field506[var5][var14 + 1][var20 + 1];
                                    int var28 = class50.field506[var5][var14][var20 + 1];
                                    int var29 = class50.field496[var14][var20];
                                    int var30 = class50.field496[var14 + 1][var20];
                                    int var31 = class50.field496[var14 + 1][var20 + 1];
                                    int var32 = class50.field496[var14][var20 + 1];
                                    int var33 = -1;
                                    int var34 = -1;
                                    int var35;
                                    int var36;
                                    int var37;
                                    if (var55 > 0) {
                                       var35 = var15 * 256 / var18;
                                       var36 = var16 / var19;
                                       var37 = var17 / var19;
                                       var33 = class269.method5238(var35, var36, var37);
                                       var35 = var35 + class50.field504 & 255;
                                       var37 += class50.field498;
                                       if (var37 < 0) {
                                          var37 = 0;
                                       } else if (var37 > 255) {
                                          var37 = 255;
                                       }

                                       var34 = class269.method5238(var35, var36, var37);
                                    }

                                    class274 var38;
                                    if (var5 > 0) {
                                       boolean var73 = true;
                                       if (var55 == 0 && class50.field494[var5][var14][var20] != 0) {
                                          var73 = false;
                                       }

                                       if (var24 > 0) {
                                          var37 = var24 - 1;
                                          var38 = (class274)class274.field3601.method4198((long)var37);
                                          class274 var58;
                                          if (var38 != null) {
                                             var58 = var38;
                                          } else {
                                             byte[] var39 = class274.field3611.method4831(4, var37);
                                             var38 = new class274();
                                             if (var39 != null) {
                                                var38.method5452(new class184(var39), var37);
                                             }

                                             var38.method5432();
                                             class274.field3601.method4204(var38, (long)var37);
                                             var58 = var38;
                                          }

                                          if (!var58.field3602) {
                                             var73 = false;
                                          }
                                       }

                                       if (var73 && var26 == var25 && var25 == var27 && var28 == var25) {
                                          class55.field553[var5][var14][var20] |= 2340;
                                       }
                                    }

                                    var35 = 0;
                                    if (var34 != -1) {
                                       var35 = class124.field1749[class236.method4783(var34, 96)];
                                    }

                                    if (var24 == 0) {
                                       var65.method3062(var5, var14, var20, 0, 0, -1, var25, var26, var27, var28, class236.method4783(var33, var29), class236.method4783(var33, var30), class236.method4783(var33, var31), class236.method4783(var33, var32), 0, 0, 0, 0, var35, 0);
                                    } else {
                                       var36 = class50.field494[var5][var14][var20] + 1;
                                       byte var74 = class8.field64[var5][var14][var20];
                                       int var59 = var24 - 1;
                                       class274 var40 = (class274)class274.field3601.method4198((long)var59);
                                       if (var40 != null) {
                                          var38 = var40;
                                       } else {
                                          byte[] var41 = class274.field3611.method4831(4, var59);
                                          var40 = new class274();
                                          if (var41 != null) {
                                             var40.method5452(new class184(var41), var59);
                                          }

                                          var40.method5432();
                                          class274.field3601.method4204(var40, (long)var59);
                                          var38 = var40;
                                       }

                                       int var60 = var38.field3604;
                                       int var42;
                                       int var43;
                                       int var44;
                                       int var45;
                                       if (var60 >= 0) {
                                          var43 = class124.field1752.vmethod3247(var60);
                                          var42 = -1;
                                       } else if (var38.field3603 == 16711935) {
                                          var42 = -2;
                                          var60 = -1;
                                          var43 = -2;
                                       } else {
                                          var42 = class269.method5238(var38.field3607, var38.field3608, var38.field3610);
                                          var44 = var38.field3607 + class50.field504 & 255;
                                          var45 = var38.field3610 + class50.field498;
                                          if (var45 < 0) {
                                             var45 = 0;
                                          } else if (var45 > 255) {
                                             var45 = 255;
                                          }

                                          var43 = class269.method5238(var44, var38.field3608, var45);
                                       }

                                       var44 = 0;
                                       if (var43 != -2) {
                                          var44 = class124.field1749[class42.method785(var43, 96)];
                                       }

                                       if (var38.field3606 != -1) {
                                          var45 = var38.field3605 + class50.field504 & 255;
                                          int var46 = var38.field3612 + class50.field498;
                                          if (var46 < 0) {
                                             var46 = 0;
                                          } else if (var46 > 255) {
                                             var46 = 255;
                                          }

                                          var43 = class269.method5238(var45, var38.field3609, var46);
                                          var44 = class124.field1749[class42.method785(var43, 96)];
                                       }

                                       var65.method3062(var5, var14, var20, var36, var74, var60, var25, var26, var27, var28, class236.method4783(var33, var29), class236.method4783(var33, var30), class236.method4783(var33, var31), class236.method4783(var33, var32), class42.method785(var42, var29), class42.method785(var42, var30), class42.method785(var42, var31), class42.method785(var42, var32), var35, var44);
                                    }
                                 }
                              }
                           }
                        }
                     }

                     for(var14 = 1; var14 < 103; ++var14) {
                        for(var15 = 1; var15 < 103; ++var15) {
                           if ((class50.field492[var5][var15][var14] & 8) != 0) {
                              var20 = 0;
                           } else if (var5 > 0 && (class50.field492[1][var15][var14] & 2) != 0) {
                              var20 = var5 - 1;
                           } else {
                              var20 = var5;
                           }

                           var65.method3061(var5, var15, var14, var20);
                        }
                     }

                     class19.field188[var5] = null;
                     class140.field1932[var5] = null;
                     class50.field494[var5] = null;
                     class8.field64[var5] = null;
                     class50.field503[var5] = null;
                  }

                  var65.method3157(-50, -10, -50);

                  for(var5 = 0; var5 < 104; ++var5) {
                     for(var51 = 0; var51 < 104; ++var51) {
                        if ((class50.field492[1][var5][var51] & 2) == 2) {
                           var65.method3059(var5, var51);
                        }
                     }
                  }

                  var5 = 1;
                  var51 = 2;
                  var7 = 4;

                  for(var8 = 0; var8 < 4; ++var8) {
                     if (var8 > 0) {
                        var5 <<= 3;
                        var51 <<= 3;
                        var7 <<= 3;
                     }

                     for(var54 = 0; var54 <= var8; ++var54) {
                        for(var10 = 0; var10 <= 104; ++var10) {
                           for(var11 = 0; var11 <= 104; ++var11) {
                              short var72;
                              if ((class55.field553[var54][var11][var10] & var5) != 0) {
                                 var12 = var10;
                                 var13 = var10;
                                 var14 = var54;

                                 for(var15 = var54; var12 > 0 && (class55.field553[var54][var11][var12 - 1] & var5) != 0; --var12) {
                                    ;
                                 }

                                 while(var13 < 104 && (class55.field553[var54][var11][var13 + 1] & var5) != 0) {
                                    ++var13;
                                 }

                                 label936:
                                 while(var14 > 0) {
                                    for(var16 = var12; var16 <= var13; ++var16) {
                                       if ((class55.field553[var14 - 1][var11][var16] & var5) == 0) {
                                          break label936;
                                       }
                                    }

                                    --var14;
                                 }

                                 label925:
                                 while(var15 < var8) {
                                    for(var16 = var12; var16 <= var13; ++var16) {
                                       if ((class55.field553[var15 + 1][var11][var16] & var5) == 0) {
                                          break label925;
                                       }
                                    }

                                    ++var15;
                                 }

                                 var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
                                 if (var16 >= 8) {
                                    var72 = 240;
                                    var18 = class50.field506[var15][var11][var12] - var72;
                                    var19 = class50.field506[var14][var11][var12];
                                    class127.method3060(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var18, var19);

                                    for(var20 = var14; var20 <= var15; ++var20) {
                                       for(var21 = var12; var21 <= var13; ++var21) {
                                          class55.field553[var20][var11][var21] &= ~var5;
                                       }
                                    }
                                 }
                              }

                              if ((class55.field553[var54][var11][var10] & var51) != 0) {
                                 var12 = var11;
                                 var13 = var11;
                                 var14 = var54;

                                 for(var15 = var54; var12 > 0 && (class55.field553[var54][var12 - 1][var10] & var51) != 0; --var12) {
                                    ;
                                 }

                                 while(var13 < 104 && (class55.field553[var54][var13 + 1][var10] & var51) != 0) {
                                    ++var13;
                                 }

                                 label989:
                                 while(var14 > 0) {
                                    for(var16 = var12; var16 <= var13; ++var16) {
                                       if ((class55.field553[var14 - 1][var16][var10] & var51) == 0) {
                                          break label989;
                                       }
                                    }

                                    --var14;
                                 }

                                 label978:
                                 while(var15 < var8) {
                                    for(var16 = var12; var16 <= var13; ++var16) {
                                       if ((class55.field553[var15 + 1][var16][var10] & var51) == 0) {
                                          break label978;
                                       }
                                    }

                                    ++var15;
                                 }

                                 var16 = (var13 - var12 + 1) * (var15 + 1 - var14);
                                 if (var16 >= 8) {
                                    var72 = 240;
                                    var18 = class50.field506[var15][var12][var10] - var72;
                                    var19 = class50.field506[var14][var12][var10];
                                    class127.method3060(var8, 2, var12 * 128, var13 * 128 + 128, var10 * 128, var10 * 128, var18, var19);

                                    for(var20 = var14; var20 <= var15; ++var20) {
                                       for(var21 = var12; var21 <= var13; ++var21) {
                                          class55.field553[var20][var21][var10] &= ~var51;
                                       }
                                    }
                                 }
                              }

                              if ((class55.field553[var54][var11][var10] & var7) != 0) {
                                 var12 = var11;
                                 var13 = var11;
                                 var14 = var10;

                                 for(var15 = var10; var14 > 0 && (class55.field553[var54][var11][var14 - 1] & var7) != 0; --var14) {
                                    ;
                                 }

                                 while(var15 < 104 && (class55.field553[var54][var11][var15 + 1] & var7) != 0) {
                                    ++var15;
                                 }

                                 label1042:
                                 while(var12 > 0) {
                                    for(var16 = var14; var16 <= var15; ++var16) {
                                       if ((class55.field553[var54][var12 - 1][var16] & var7) == 0) {
                                          break label1042;
                                       }
                                    }

                                    --var12;
                                 }

                                 label1031:
                                 while(var13 < 104) {
                                    for(var16 = var14; var16 <= var15; ++var16) {
                                       if ((class55.field553[var54][var13 + 1][var16] & var7) == 0) {
                                          break label1031;
                                       }
                                    }

                                    ++var13;
                                 }

                                 if ((var13 - var12 + 1) * (var15 - var14 + 1) >= 4) {
                                    var16 = class50.field506[var54][var12][var14];
                                    class127.method3060(var8, 4, var12 * 128, var13 * 128 + 128, var14 * 128, var15 * 128 + 128, var16, var16);

                                    for(var17 = var12; var17 <= var13; ++var17) {
                                       for(var18 = var14; var18 <= var15; ++var18) {
                                          class55.field553[var54][var17][var18] &= ~var7;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  class73.method1983(true);
                  var5 = class50.field493;
                  if (var5 > class60.field599) {
                     var5 = class60.field599;
                  }

                  if (var5 < class60.field599 - 1) {
                     var5 = class60.field599 - 1;
                  }

                  if (field648) {
                     class243.field3173.method3056(class50.field493);
                  } else {
                     class243.field3173.method3056(0);
                  }

                  for(var51 = 0; var51 < 104; ++var51) {
                     for(var7 = 0; var7 < 104; ++var7) {
                        class238.method4784(var51, var7);
                     }
                  }

                  class160.method3502();

                  for(class63 var69 = (class63)field688.method4298(); var69 != null; var69 = (class63)field688.method4283()) {
                     if (var69.field933 == -1) {
                        var69.field932 = 0;
                        class43.method790(var69);
                     } else {
                        var69.method4271();
                     }
                  }

                  class270.field3457.method4199();
                  class174 var70;
                  if (class157.field2037.method877()) {
                     var70 = class131.method3243(class171.field2234, field690.field1282);
                     var70.field2332.method3921(1057001181);
                     field690.method2193(var70);
                  }

                  if (!field702) {
                     var51 = (class123.field1727 - 6) / 8;
                     var7 = (class123.field1727 + 6) / 8;
                     var8 = (class164.field2075 - 6) / 8;
                     var54 = (class164.field2075 + 6) / 8;

                     for(var10 = var51 - 1; var10 <= var7 + 1; ++var10) {
                        for(var11 = var8 - 1; var11 <= var54 + 1; ++var11) {
                           if (var10 < var51 || var10 > var7 || var11 < var8 || var11 > var54) {
                              class332.field4017.method4828("m" + var10 + "_" + var11);
                              class332.field4017.method4828("l" + var10 + "_" + var11);
                           }
                        }
                     }
                  }

                  class16.method202(30);
                  class160.method3502();
                  class19.field188 = null;
                  class140.field1932 = null;
                  class50.field494 = null;
                  class8.field64 = null;
                  class55.field553 = null;
                  class50.field503 = null;
                  class50.field496 = null;
                  class246.field3210 = null;
                  class50.field510 = null;
                  class184.field2408 = null;
                  class297.field3739 = null;
                  class289.field3707 = null;
                  var70 = class131.method3243(class171.field2283, field690.field1282);
                  field690.method2193(var70);
                  class47.field433.vmethod3534();

                  for(var7 = 0; var7 < 32; ++var7) {
                     class47.field429[var7] = 0L;
                  }

                  for(var7 = 0; var7 < 32; ++var7) {
                     class47.field444[var7] = 0L;
                  }

                  class181.field2363 = 0;
               }
            }
         }
      } else {
         class67.method1745(this);
      }

      if (field720 == 30) {
         this.method1245();
      } else if (field720 == 40 || field720 == 45) {
         this.method1244();
      }

   }

   protected final void vmethod1239(boolean var1) {
      boolean var2 = class180.method3733();
      if (var2 && field879 && field882 != null) {
         field882.method2348();
      }

      if ((field720 == 10 || field720 == 20 || field720 == 30) && 0L != field870 && class120.method2866() > field870) {
         class27.method513(class17.method211());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field848[var3] = true;
         }
      }

      if (field720 == 0) {
         this.method872(class79.field1158, class79.field1159, var1);
      } else if (field720 == 5) {
         class136.method3267(class163.field2066, class18.field175, class3.field25, var1);
      } else if (field720 != 10 && field720 != 11) {
         if (field720 == 20) {
            class136.method3267(class163.field2066, class18.field175, class3.field25, var1);
         } else if (field720 == 25) {
            if (field700 == 1) {
               if (field696 > field697) {
                  field697 = field696;
               }

               var3 = (field697 * 50 - field696 * 50) / field697;
               class58.method1132("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else if (field700 == 2) {
               if (field753 > field909) {
                  field909 = field753;
               }

               var3 = (field909 * 50 - field753 * 50) / field909 + 50;
               class58.method1132("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false);
            } else {
               class58.method1132("Loading - please wait.", false);
            }
         } else if (field720 == 30) {
            this.method1433();
         } else if (field720 == 40) {
            class58.method1132("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (field720 == 45) {
            class58.method1132("Please wait...", false);
         }
      } else {
         class136.method3267(class163.field2066, class18.field175, class3.field25, var1);
      }

      if (field720 == 30 && field855 == 0 && !var1 && !field675) {
         for(var3 = 0; var3 < field853; ++var3) {
            if (field849[var3]) {
               class30.field313.vmethod6123(field763[var3], field852[var3], field819[var3], field854[var3]);
               field849[var3] = false;
            }
         }
      } else if (field720 > 0) {
         class30.field313.vmethod6120(0, 0);

         for(var3 = 0; var3 < field853; ++var3) {
            field849[var3] = false;
         }
      }

   }

   protected final void vmethod1240() {
      if (class36.field348.method2099()) {
         class36.field348.method2096();
      }

      if (class36.field347 != null) {
         class36.field347.field586 = false;
      }

      class36.field347 = null;
      field690.method2190();
      class238.method4785();
      if (class48.field470 != null) {
         class48 var1 = class48.field470;
         synchronized(class48.field470) {
            class48.field470 = null;
         }
      }

      class164.field2076 = null;
      if (field882 != null) {
         field882.method2403();
      }

      if (class6.field46 != null) {
         class6.field46.method2403();
      }

      if (class252.field3263 != null) {
         class252.field3263.vmethod3558();
      }

      Object var7 = class250.field3241;
      synchronized(class250.field3241) {
         if (class250.field3243 != 0) {
            class250.field3243 = 1;

            try {
               class250.field3241.wait();
            } catch (InterruptedException var4) {
               ;
            }
         }
      }

      if (class37.field352 != null) {
         class37.field352.method3274();
         class37.field352 = null;
      }

      class112.method2723();
   }

   protected final void vmethod1465() {
   }

   public final void init() {
      try {
         if (this.method857()) {
            class281[] var1 = class126.method3054();

            for(int var2 = 0; var2 < var1.length; ++var2) {
               class281 var3 = var1[var2];
               String var4 = this.getParameter(var3.field3677);
               if (var4 != null) {
                  switch(Integer.parseInt(var3.field3677)) {
                  case 1:
                     field822 = Integer.parseInt(var4) != 0;
                  case 2:
                  case 11:
                  case 13:
                  case 16:
                  default:
                     break;
                  case 3:
                     if (var4.equalsIgnoreCase("true")) {
                        field647 = true;
                     } else {
                        field647 = false;
                     }
                     break;
                  case 4:
                     if (field651 == -1) {
                        field651 = Integer.parseInt(var4);
                     }
                     break;
                  case 5:
                     field660 = Integer.parseInt(var4);
                     break;
                  case 6:
                     field785 = Integer.parseInt(var4);
                     break;
                  case 7:
                     class189.field2441 = class75.method2001(Integer.parseInt(var4));
                     break;
                  case 8:
                     if (var4.equalsIgnoreCase("true")) {
                        ;
                     }
                     break;
                  case 9:
                     class6.field48 = var4;
                     break;
                  case 10:
                     field646 = (class246)class43.method791(class247.method4820(), Integer.parseInt(var4));
                     if (class246.field3207 == field646) {
                        field920 = class330.field4002;
                     } else {
                        field920 = class330.field4009;
                     }
                     break;
                  case 12:
                     field691 = Integer.parseInt(var4);
                     break;
                  case 14:
                     field650 = Integer.parseInt(var4);
                     break;
                  case 15:
                     field645 = Integer.parseInt(var4);
                     break;
                  case 17:
                     class112.field1496 = var4;
                  }
               }
            }

            class171.method3654();
            class10.field79 = this.getCodeBase().getHost();
            String var7 = class189.field2441.field3196;
            byte var8 = 0;

            try {
               class55.method1106("oldschool", var7, var8, 18);
            } catch (Exception var5) {
               class80.method2041((String)null, var5);
            }

            class157.field2037 = this;
            class25.field256 = field651;
            this.method855(765, 503, 177);
         }
      } catch (RuntimeException var6) {
         throw class111.method2712(var6, "client.init(" + ')');
      }
   }

   void method1241() {
      if (field720 != 1000) {
         boolean var1 = class130.method3241();
         if (!var1) {
            this.method1242();
         }

      }
   }

   void method1242() {
      if (class252.field3277 >= 4) {
         this.method874("js5crc");
         field720 = 1000;
      } else {
         if (class252.field3278 >= 4) {
            if (field720 <= 5) {
               this.method874("js5io");
               field720 = 1000;
               return;
            }

            field682 = 3000;
            class252.field3278 = 3;
         }

         if (--field682 + 1 <= 0) {
            try {
               if (field674 == 0) {
                  class13.field106 = class47.field426.method3426(class10.field79, class144.field1947);
                  ++field674;
               }

               if (field674 == 1) {
                  if (class13.field106.field2007 == 2) {
                     this.method1243(-1);
                     return;
                  }

                  if (class13.field106.field2007 == 1) {
                     ++field674;
                  }
               }

               if (field674 == 2) {
                  if (field822) {
                     class111.field1489 = class63.method1657((Socket)class13.field106.field2011, 40000, 5000);
                  } else {
                     class111.field1489 = new class163((Socket)class13.field106.field2011, class47.field426, 5000);
                  }

                  class184 var1 = new class184(5);
                  var1.method3805(15);
                  var1.method3921(177);
                  class111.field1489.vmethod3578(var1.field2404, 0, 5);
                  ++field674;
                  class43.field411 = class120.method2866();
               }

               if (field674 == 3) {
                  if (class111.field1489.vmethod3553() > 0 || !field822 && field720 <= 5) {
                     int var2 = class111.field1489.vmethod3562();
                     if (var2 != 0) {
                        this.method1243(var2);
                        return;
                     }

                     ++field674;
                  } else if (class120.method2866() - class43.field411 > 30000L) {
                     this.method1243(-2);
                     return;
                  }
               }

               if (field674 == 4) {
                  class16.method207(class111.field1489, field720 > 20);
                  class13.field106 = null;
                  class111.field1489 = null;
                  field674 = 0;
                  field787 = 0;
               }
            } catch (IOException var3) {
               this.method1243(-3);
            }

         }
      }
   }

   void method1243(int var1) {
      class13.field106 = null;
      class111.field1489 = null;
      field674 = 0;
      if (class144.field1947 == class139.field1928) {
         class144.field1947 = class2.field23;
      } else {
         class144.field1947 = class139.field1928;
      }

      ++field787;
      if (field787 >= 2 && (var1 == 7 || var1 == 9)) {
         if (field720 <= 5) {
            this.method874("js5connect_full");
            field720 = 1000;
         } else {
            field682 = 3000;
         }
      } else if (field787 >= 2 && var1 == 6) {
         this.method874("js5connect_outofdate");
         field720 = 1000;
      } else if (field787 >= 4) {
         if (field720 <= 5) {
            this.method874("js5connect");
            field720 = 1000;
         } else {
            field682 = 3000;
         }
      }

   }

   final void method1244() {
      Object var1 = field690.method2192();
      class191 var2 = field690.field1283;

      try {
         if (field677 == 0) {
            if (class12.field100 == null && (field683.method2058() || field678 > 250)) {
               class12.field100 = field683.method2059();
               field683.method2057();
               field683 = null;
            }

            if (class12.field100 != null) {
               if (var1 != null) {
                  ((class159)var1).vmethod3558();
                  var1 = null;
               }

               class138.field1924 = null;
               field692 = false;
               field678 = 0;
               field677 = 1;
            }
         }

         if (field677 == 1) {
            if (class138.field1924 == null) {
               class138.field1924 = class47.field426.method3426(class10.field79, class144.field1947);
            }

            if (class138.field1924.field2007 == 2) {
               throw new IOException();
            }

            if (class138.field1924.field2007 == 1) {
               if (field822) {
                  Socket var4 = (Socket)class138.field1924.field2011;
                  class161 var3 = new class161(var4, 40000, 5000);
                  var1 = var3;
               } else {
                  var1 = new class163((Socket)class138.field1924.field2011, class47.field426, 5000);
               }

               field690.method2189((class159)var1);
               class138.field1924 = null;
               field677 = 2;
            }
         }

         if (field677 == 2) {
            field690.method2194();
            class174 var21 = class150.method3375();
            var21.field2332.method3805(class172.field2313.field2314);
            field690.method2193(var21);
            field690.method2187();
            var2.field2405 = 0;
            field677 = 3;
         }

         boolean var12;
         int var13;
         if (field677 == 3) {
            if (field882 != null) {
               field882.method2347();
            }

            if (class6.field46 != null) {
               class6.field46.method2347();
            }

            var12 = true;
            if (field822 && !((class159)var1).vmethod3554(1)) {
               var12 = false;
            }

            if (var12) {
               var13 = ((class159)var1).vmethod3562();
               if (field882 != null) {
                  field882.method2347();
               }

               if (class6.field46 != null) {
                  class6.field46.method2347();
               }

               if (var13 != 0) {
                  class111.method2713(var13);
                  return;
               }

               var2.field2405 = 0;
               field677 = 4;
            }
         }

         int var33;
         if (field677 == 4) {
            if (var2.field2405 < 8) {
               var33 = ((class159)var1).vmethod3553();
               if (var33 > 8 - var2.field2405) {
                  var33 = 8 - var2.field2405;
               }

               if (var33 > 0) {
                  ((class159)var1).vmethod3555(var2.field2404, var2.field2405, var33);
                  var2.field2405 += var33;
               }
            }

            if (var2.field2405 == 8) {
               var2.field2405 = 0;
               class1.field6 = var2.method3775();
               field677 = 5;
            }
         }

         int var7;
         int var9;
         int var14;
         if (field677 == 5) {
            field690.field1283.field2405 = 0;
            field690.method2194();
            class191 var22 = new class191(500);
            int[] var24 = new int[]{class12.field100.nextInt(), class12.field100.nextInt(), class12.field100.nextInt(), class12.field100.nextInt()};
            var22.field2405 = 0;
            var22.method3805(1);
            var22.method3921(var24[0]);
            var22.method3921(var24[1]);
            var22.method3921(var24[2]);
            var22.method3921(var24[3]);
            var22.method3758(class1.field6);
            int var10;
            if (field720 == 40) {
               var22.method3921(class85.field1251[0]);
               var22.method3921(class85.field1251[1]);
               var22.method3921(class85.field1251[2]);
               var22.method3921(class85.field1251[3]);
            } else {
               var22.method3805(field681.vmethod6130());
               switch(field681.field1968) {
               case 0:
               case 3:
                  var22.method3755(class60.field604);
                  ++var22.field2405;
                  break;
               case 1:
                  var22.field2405 += 4;
                  break;
               case 2:
                  LinkedHashMap var6 = class47.field435.field1028;
                  String var8 = class79.field1180;
                  var9 = var8.length();
                  var10 = 0;

                  for(int var11 = 0; var11 < var9; ++var11) {
                     var10 = (var10 << 5) - var10 + var8.charAt(var11);
                  }

                  var22.method3921(((Integer)var6.get(var10)).intValue());
               }

               var22.method3805(class312.field3828.vmethod6130());
               var22.method3889(class79.field1169);
            }

            var22.method3861(class77.field1133, class77.field1129);
            class85.field1251 = var24;
            class174 var5 = class150.method3375();
            var5.field2332.field2405 = 0;
            if (field720 == 40) {
               var5.field2332.method3805(class172.field2312.field2314);
            } else {
               var5.field2332.method3805(class172.field2311.field2314);
            }

            var5.field2332.method3754(0);
            var14 = var5.field2332.field2405;
            var5.field2332.method3921(177);
            var5.field2332.method3921(1);
            var5.field2332.method3805(field651);
            var5.field2332.method3763(var22.field2404, 0, var22.field2405);
            var7 = var5.field2332.field2405;
            var5.field2332.method3889(class79.field1180);
            var5.field2332.method3805((field675 ? 1 : 0) << 1 | (field648 ? 1 : 0));
            var5.field2332.method3754(class68.field1038);
            var5.field2332.method3754(class141.field1937);
            class256.method5023(var5.field2332);
            var5.field2332.method3889(class6.field48);
            var5.field2332.method3921(field650);
            class184 var31 = new class184(class61.field634.method6297());
            class61.field634.method6302(var31);
            var5.field2332.method3763(var31.field2404, 0, var31.field2404.length);
            var5.field2332.method3805(field651);
            var5.field2332.method3921(0);
            var5.field2332.method3921(class19.field185.field3237);
            var5.field2332.method3921(class42.field401.field3237);
            var5.field2332.method3921(class50.field505.field3237);
            var5.field2332.method3921(class157.field2020.field3237);
            var5.field2332.method3921(class9.field72.field3237);
            var5.field2332.method3921(class332.field4017.field3237);
            var5.field2332.method3921(class170.field2117.field3237);
            var5.field2332.method3921(class10.field80.field3237);
            var5.field2332.method3921(class154.field2002.field3237);
            var5.field2332.method3921(class17.field162.field3237);
            var5.field2332.method3921(class12.field99.field3237);
            var5.field2332.method3921(class192.field2456.field3237);
            var5.field2332.method3921(class137.field1914.field3237);
            var5.field2332.method3921(class71.field1091.field3237);
            var5.field2332.method3921(class27.field273.field3237);
            var5.field2332.method3921(class270.field3456.field3237);
            var5.field2332.method3921(class159.field2039.field3237);
            var5.field2332.method3921(class145.field1952.field3237);
            var5.field2332.method3790(var24, var7, var5.field2332.field2405);
            var5.field2332.method3765(var5.field2332.field2405 - var14);
            field690.method2193(var5);
            field690.method2187();
            field690.field1282 = new class192(var24);
            int[] var15 = new int[4];

            for(var10 = 0; var10 < 4; ++var10) {
               var15[var10] = var24[var10] + 50;
            }

            var2.method4050(var15);
            field677 = 6;
         }

         if (field677 == 6 && ((class159)var1).vmethod3553() > 0) {
            var33 = ((class159)var1).vmethod3562();
            if (var33 == 21 && field720 == 20) {
               field677 = 9;
            } else if (var33 == 2) {
               field677 = 11;
            } else if (var33 == 15 && field720 == 40) {
               field690.field1285 = -1;
               field677 = 16;
            } else if (var33 == 64) {
               field677 = 7;
            } else if (var33 == 23 && field679 < 1) {
               ++field679;
               field677 = 0;
            } else {
               if (var33 != 29) {
                  class111.method2713(var33);
                  return;
               }

               field677 = 14;
            }
         }

         if (field677 == 7 && ((class159)var1).vmethod3553() > 0) {
            class188.field2438 = ((class159)var1).vmethod3562();
            field677 = 8;
         }

         if (field677 == 8 && ((class159)var1).vmethod3553() >= class188.field2438) {
            ((class159)var1).vmethod3555(var2.field2404, 0, class188.field2438);
            var2.field2405 = 0;
            field677 = 6;
         }

         if (field677 == 9 && ((class159)var1).vmethod3553() > 0) {
            field760 = (((class159)var1).vmethod3562() + 3) * 60;
            field677 = 10;
         }

         if (field677 == 10) {
            field678 = 0;
            class185.method4006("You have only just left another world.", "Your profile will be transferred in:", field760 / 60 + " seconds.");
            if (--field760 <= 0) {
               field677 = 0;
            }

         } else {
            if (field677 == 11 && ((class159)var1).vmethod3553() >= 1) {
               class271.field3543 = ((class159)var1).vmethod3562();
               field677 = 12;
            }

            boolean var34;
            if (field677 == 12 && ((class159)var1).vmethod3553() >= class271.field3543) {
               var12 = ((class159)var1).vmethod3562() == 1;
               ((class159)var1).vmethod3555(var2.field2404, 0, 4);
               var2.field2405 = 0;
               var34 = false;
               if (var12) {
                  var13 = var2.method4044() << 24;
                  var13 |= var2.method4044() << 16;
                  var13 |= var2.method4044() << 8;
                  var13 |= var2.method4044();
                  String var30 = class79.field1180;
                  var7 = var30.length();
                  int var16 = 0;
                  var9 = 0;

                  while(true) {
                     if (var9 >= var7) {
                        if (class47.field435.field1028.size() >= 10 && !class47.field435.field1028.containsKey(var16)) {
                           Iterator var32 = class47.field435.field1028.entrySet().iterator();
                           var32.next();
                           var32.remove();
                        }

                        class47.field435.field1028.put(var16, var13);
                        break;
                     }

                     var16 = (var16 << 5) - var16 + var30.charAt(var9);
                     ++var9;
                  }
               }

               if (field746) {
                  class47.field435.field1034 = class79.field1180;
               } else {
                  class47.field435.field1034 = null;
               }

               class61.method1202();
               field812 = ((class159)var1).vmethod3562();
               field863 = ((class159)var1).vmethod3562() == 1;
               field747 = ((class159)var1).vmethod3562();
               field747 <<= 8;
               field747 += ((class159)var1).vmethod3562();
               field761 = ((class159)var1).vmethod3562();
               ((class159)var1).vmethod3555(var2.field2404, 0, 1);
               var2.field2405 = 0;
               class170[] var28 = class63.method1656();
               var14 = var2.method4049();
               if (var14 < 0 || var14 >= var28.length) {
                  throw new IOException(var14 + " " + var2.field2405);
               }

               field690.field1280 = var28[var14];
               field690.field1285 = field690.field1280.field2151;
               ((class159)var1).vmethod3555(var2.field2404, 0, 2);
               var2.field2405 = 0;
               field690.field1285 = var2.method3771();

               try {
                  class41.method769(class157.field2037, "zap");
               } catch (Throwable var19) {
                  ;
               }

               field677 = 13;
            }

            if (field677 != 13) {
               if (field677 == 14 && ((class159)var1).vmethod3553() >= 2) {
                  var2.field2405 = 0;
                  ((class159)var1).vmethod3555(var2.field2404, 0, 2);
                  var2.field2405 = 0;
                  class1.field5 = var2.method3771();
                  field677 = 15;
               }

               if (field677 == 15 && ((class159)var1).vmethod3553() >= class1.field5) {
                  var2.field2405 = 0;
                  ((class159)var1).vmethod3555(var2.field2404, 0, class1.field5);
                  var2.field2405 = 0;
                  String var25 = var2.method3778();
                  String var27 = var2.method3778();
                  String var29 = var2.method3778();
                  class185.method4006(var25, var27, var29);
                  class16.method202(10);
               }

               if (field677 == 16) {
                  if (field690.field1285 == -1) {
                     if (((class159)var1).vmethod3553() < 2) {
                        return;
                     }

                     ((class159)var1).vmethod3555(var2.field2404, 0, 2);
                     var2.field2405 = 0;
                     field690.field1285 = var2.method3771();
                  }

                  if (((class159)var1).vmethod3553() >= field690.field1285) {
                     ((class159)var1).vmethod3555(var2.field2404, 0, field690.field1285);
                     var2.field2405 = 0;
                     var33 = field690.field1285;
                     field904.method5501();
                     class2.method24();
                     class260.method5109(var2);
                     if (var33 != var2.field2405) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field678;
                  if (field678 > 2000) {
                     if (field679 < 1) {
                        if (class139.field1928 == class144.field1947) {
                           class144.field1947 = class2.field23;
                        } else {
                           class144.field1947 = class139.field1928;
                        }

                        ++field679;
                        field677 = 0;
                     } else {
                        class111.method2713(-3);
                     }
                  }
               }
            } else {
               if (((class159)var1).vmethod3553() >= field690.field1285) {
                  var2.field2405 = 0;
                  ((class159)var1).vmethod3555(var2.field2404, 0, field690.field1285);
                  field904.method5504();
                  field656 = -1L;
                  class36.field347.field580 = 0;
                  class167.field2111 = true;
                  field919 = true;
                  field868 = -1L;
                  class247.method4821();
                  field690.method2194();
                  field690.field1283.field2405 = 0;
                  field690.field1280 = null;
                  field690.field1295 = null;
                  field690.field1284 = null;
                  field690.field1278 = null;
                  field690.field1285 = 0;
                  field690.field1287 = 0;
                  field662 = 0;
                  field725 = 0;
                  field663 = 0;
                  field780 = 0;
                  field833 = false;
                  class86.method2165(0);
                  class85.field1248.clear();
                  class85.field1249.method4178();
                  class85.field1247.method4350();
                  class85.field1246 = 0;
                  field796 = 0;
                  field798 = false;
                  field905 = 0;
                  field658 = 0;
                  field718 = 0;
                  class140.field1933 = null;
                  field876 = 0;
                  field661 = -1;
                  field722 = 0;
                  field875 = 0;
                  field671 = class78.field1134;
                  field672 = class78.field1134;
                  field686 = 0;
                  class62.method1233();

                  for(var33 = 0; var33 < 2048; ++var33) {
                     field698[var33] = null;
                  }

                  for(var33 = 0; var33 < 32768; ++var33) {
                     field806[var33] = null;
                  }

                  field769 = -1;
                  field773.method4275();
                  field711.method4275();

                  int var17;
                  for(var33 = 0; var33 < 4; ++var33) {
                     for(var13 = 0; var13 < 104; ++var13) {
                        for(var17 = 0; var17 < 104; ++var17) {
                           field829[var33][var13][var17] = null;
                        }
                     }
                  }

                  field688 = new class207();
                  class170.field2150.method1755();

                  for(var33 = 0; var33 < class256.field3302; ++var33) {
                     class256 var26 = class142.method3328(var33);
                     if (var26 != null) {
                        class227.field2630[var33] = 0;
                        class227.field2629[var33] = 0;
                     }
                  }

                  class36.field348.method2108();
                  field813 = -1;
                  if (field803 != -1) {
                     var33 = field803;
                     if (var33 != -1 && class148.field1970[var33]) {
                        class232.field2757.method4843(var33);
                        if (class145.field1951[var33] != null) {
                           var34 = true;

                           for(var17 = 0; var17 < class145.field1951[var33].length; ++var17) {
                              if (class145.field1951[var33][var17] != null) {
                                 if (class145.field1951[var33][var17].field2808 != 2) {
                                    class145.field1951[var33][var17] = null;
                                 } else {
                                    var34 = false;
                                 }
                              }
                           }

                           if (var34) {
                              class145.field1951[var33] = null;
                           }

                           class148.field1970[var33] = false;
                        }
                     }
                  }

                  for(class56 var23 = (class56)field804.method4235(); var23 != null; var23 = (class56)field804.method4229()) {
                     class6.method67(var23, true);
                  }

                  field803 = -1;
                  field804 = new class204(8);
                  field880 = null;
                  field780 = 0;
                  field833 = false;
                  field908.method4664((int[])null, new int[]{0, 0, 0, 0, 0}, false, -1);

                  for(var33 = 0; var33 < 8; ++var33) {
                     field767[var33] = null;
                     field768[var33] = false;
                  }

                  class12.method125();
                  field654 = true;

                  for(var33 = 0; var33 < 100; ++var33) {
                     field848[var33] = true;
                  }

                  class70.method1948();
                  class3.field26 = null;

                  for(var33 = 0; var33 < 8; ++var33) {
                     field895[var33] = new class4();
                  }

                  class59.field590 = null;
                  class260.method5109(var2);
                  class123.field1727 = -1;
                  class11.method120(false, var2);
                  field690.field1280 = null;
               }

            }
         }
      } catch (IOException var20) {
         if (field679 < 1) {
            if (class144.field1947 == class139.field1928) {
               class144.field1947 = class2.field23;
            } else {
               class144.field1947 = class139.field1928;
            }

            ++field679;
            field677 = 0;
         } else {
            class111.method2713(-2);
         }
      }
   }

   final void method1245() {
      if (field662 > 1) {
         --field662;
      }

      if (field725 > 0) {
         --field725;
      }

      if (field692) {
         field692 = false;
         class19.method241();
      } else {
         if (!field833) {
            class14.method163();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1249(field690); ++var1) {
            ;
         }

         if (field720 == 30) {
            int var2;
            class174 var14;
            while(class67.method1749()) {
               var14 = class131.method3243(class171.field2298, field690.field1282);
               var14.field2332.method3805(0);
               var2 = var14.field2332.field2405;
               class218.method4370(var14.field2332);
               var14.field2332.method3766(var14.field2332.field2405 - var2);
               field690.method2193(var14);
            }

            if (field904.field3680) {
               var14 = class131.method3243(class171.field2257, field690.field1282);
               var14.field2332.method3805(0);
               var2 = var14.field2332.field2405;
               field904.method5507(var14.field2332);
               var14.field2332.method3766(var14.field2332.field2405 - var2);
               field690.method2193(var14);
               field904.method5505();
            }

            Object var32 = class36.field347.field581;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            synchronized(class36.field347.field581) {
               if (!field856) {
                  class36.field347.field580 = 0;
               } else if (class48.field477 != 0 || class36.field347.field580 >= 40) {
                  class174 var15 = null;
                  var3 = 0;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;

                  for(var7 = 0; var7 < class36.field347.field580 && (var15 == null || var15.field2332.field2405 - var3 < 246); ++var7) {
                     var4 = var7;
                     var8 = class36.field347.field584[var7];
                     if (var8 < -1) {
                        var8 = -1;
                     } else if (var8 > 65534) {
                        var8 = 65534;
                     }

                     var9 = class36.field347.field585[var7];
                     if (var9 < -1) {
                        var9 = -1;
                     } else if (var9 > 65534) {
                        var9 = 65534;
                     }

                     if (var9 != field735 || var8 != field643) {
                        if (var15 == null) {
                           var15 = class131.method3243(class171.field2272, field690.field1282);
                           var15.field2332.method3805(0);
                           var3 = var15.field2332.field2405;
                           var15.field2332.field2405 += 2;
                           var5 = 0;
                           var6 = 0;
                        }

                        if (-1L != field814) {
                           var10 = var9 - field735;
                           var11 = var8 - field643;
                           var12 = (int)((class36.field347.field582[var7] - field814) / 20L);
                           var5 = (int)((long)var5 + (class36.field347.field582[var7] - field814) % 20L);
                        } else {
                           var10 = var9;
                           var11 = var8;
                           var12 = Integer.MAX_VALUE;
                        }

                        field735 = var9;
                        field643 = var8;
                        if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                           var10 += 32;
                           var11 += 32;
                           var15.field2332.method3754((var12 << 12) + var11 + (var10 << 6));
                        } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                           var10 += 128;
                           var11 += 128;
                           var15.field2332.method3805(var12 + 128);
                           var15.field2332.method3754(var11 + (var10 << 8));
                        } else if (var12 < 32) {
                           var15.field2332.method3805(var12 + 192);
                           if (var9 != -1 && var8 != -1) {
                              var15.field2332.method3921(var9 | var8 << 16);
                           } else {
                              var15.field2332.method3921(Integer.MIN_VALUE);
                           }
                        } else {
                           var15.field2332.method3754((var12 & 8191) + '\ue000');
                           if (var9 != -1 && var8 != -1) {
                              var15.field2332.method3921(var9 | var8 << 16);
                           } else {
                              var15.field2332.method3921(Integer.MIN_VALUE);
                           }
                        }

                        ++var6;
                        field814 = class36.field347.field582[var7];
                     }
                  }

                  if (var15 != null) {
                     var15.field2332.method3766(var15.field2332.field2405 - var3);
                     var7 = var15.field2332.field2405;
                     var15.field2332.field2405 = var3;
                     var15.field2332.method3805(var5 / var6);
                     var15.field2332.method3805(var5 % var6);
                     var15.field2332.field2405 = var7;
                     field690.method2193(var15);
                  }

                  if (var4 >= class36.field347.field580) {
                     class36.field347.field580 = 0;
                  } else {
                     class36.field347.field580 -= var4;
                     System.arraycopy(class36.field347.field585, var4, class36.field347.field585, 0, class36.field347.field580);
                     System.arraycopy(class36.field347.field584, var4, class36.field347.field584, 0, class36.field347.field580);
                     System.arraycopy(class36.field347.field582, var4, class36.field347.field582, 0, class36.field347.field580);
                  }
               }
            }

            if (class48.field477 == 1 || !class14.field132 && class48.field477 == 4 || class48.field477 == 2) {
               long var16 = (class48.field465 - field656) / 50L;
               if (var16 > 4095L) {
                  var16 = 4095L;
               }

               field656 = class48.field465;
               var3 = class48.field467;
               if (var3 < 0) {
                  var3 = 0;
               } else if (var3 > class141.field1937) {
                  var3 = class141.field1937;
               }

               var4 = class48.field478;
               if (var4 < 0) {
                  var4 = 0;
               } else if (var4 > class68.field1038) {
                  var4 = class68.field1038;
               }

               var5 = (int)var16;
               class174 var18 = class131.method3243(class171.field2303, field690.field1282);
               var18.field2332.method3754((class48.field477 == 2 ? 1 : 0) + (var5 << 1));
               var18.field2332.method3754(var4);
               var18.field2332.method3754(var3);
               field690.method2193(var18);
            }

            if (class39.field387 > 0) {
               var14 = class131.method3243(class171.field2274, field690.field1282);
               var14.field2332.method3754(0);
               var2 = var14.field2332.field2405;
               long var19 = class120.method2866();

               for(var5 = 0; var5 < class39.field387; ++var5) {
                  long var21 = var19 - field868;
                  if (var21 > 16777215L) {
                     var21 = 16777215L;
                  }

                  field868 = var19;
                  var14.field2332.method3796(class39.field377[var5]);
                  var14.field2332.method3755((int)var21);
               }

               var14.field2332.method3765(var14.field2332.field2405 - var2);
               field690.method2193(var14);
            }

            if (field727 > 0) {
               --field727;
            }

            if (class39.field380[96] || class39.field380[97] || class39.field380[98] || class39.field380[99]) {
               field728 = true;
            }

            if (field728 && field727 <= 0) {
               field727 = 20;
               field728 = false;
               var14 = class131.method3243(class171.field2269, field690.field1282);
               var14.field2332.method3806(field712);
               var14.field2332.method3869(field658);
               field690.method2193(var14);
            }

            if (class167.field2111 && !field919) {
               field919 = true;
               var14 = class131.method3243(class171.field2241, field690.field1282);
               var14.field2332.method3805(1);
               field690.method2193(var14);
            }

            if (!class167.field2111 && field919) {
               field919 = false;
               var14 = class131.method3243(class171.field2241, field690.field1282);
               var14.field2332.method3805(0);
               field690.method2193(var14);
            }

            if (class45.field418 != null) {
               class45.field418.method6352();
            }

            if (class22.field221) {
               if (class3.field26 != null) {
                  class3.field26.method5601();
               }

               for(var1 = 0; var1 < class83.field1226; ++var1) {
                  class61 var35 = field698[class83.field1222[var1]];
                  var35.method1186();
               }

               class22.field221 = false;
            }

            class13.method143();
            if (field720 == 30) {
               class25.method476();

               for(var1 = 0; var1 < field905; ++var1) {
                  --field793[var1];
                  if (field793[var1] >= -10) {
                     class93 var36 = field710[var1];
                     if (var36 == null) {
                        Object var10000 = null;
                        var36 = class93.method2275(class9.field72, field884[var1], 0);
                        if (var36 == null) {
                           continue;
                        }

                        field793[var1] += var36.method2274();
                        field710[var1] = var36;
                     }

                     if (field793[var1] < 0) {
                        if (field887[var1] != 0) {
                           var4 = (field887[var1] & 255) * 128;
                           var5 = field887[var1] >> 16 & 255;
                           var6 = var5 * 128 + 64 - class69.field1063.field953;
                           if (var6 < 0) {
                              var6 = -var6;
                           }

                           var7 = field887[var1] >> 8 & 255;
                           var8 = var7 * 128 + 64 - class69.field1063.field999;
                           if (var8 < 0) {
                              var8 = -var8;
                           }

                           var9 = var8 + var6 - 128;
                           if (var9 > var4) {
                              field793[var1] = -100;
                              continue;
                           }

                           if (var9 < 0) {
                              var9 = 0;
                           }

                           var3 = (var4 - var9) * field881 / var4;
                        } else {
                           var3 = field888;
                        }

                        if (var3 > 0) {
                           class95 var23 = var36.method2281().method2322(class286.field3697);
                           class105 var24 = class105.method2479(var23, 100, var3);
                           var24.method2471(field885[var1] - 1);
                           class43.field413.method2215(var24);
                        }

                        field793[var1] = -100;
                     }
                  } else {
                     --field905;

                     for(var2 = var1; var2 < field905; ++var2) {
                        field884[var2] = field884[var2 + 1];
                        field710[var2] = field710[var2 + 1];
                        field885[var2] = field885[var2 + 1];
                        field793[var2] = field793[var2 + 1];
                        field887[var2] = field887[var2 + 1];
                     }

                     --var1;
                  }
               }

               if (field879 && !class10.method117()) {
                  if (field877 != 0 && field878 != -1) {
                     class161.method3528(class170.field2117, field878, 0, field877, false);
                  }

                  field879 = false;
               }

               ++field690.field1287;
               if (field690.field1287 > 750) {
                  class19.method241();
               } else {
                  class66.method1696();
                  class80.method2053();
                  int[] var33 = class83.field1222;

                  for(var2 = 0; var2 < class83.field1226; ++var2) {
                     class61 var25 = field698[var33[var2]];
                     if (var25 != null && var25.field981 > 0) {
                        --var25.field981;
                        if (var25.field981 == 0) {
                           var25.field968 = null;
                        }
                     }
                  }

                  for(var2 = 0; var2 < field686; ++var2) {
                     var3 = field687[var2];
                     class73 var39 = field806[var3];
                     if (var39 != null && var39.field981 > 0) {
                        --var39.field981;
                        if (var39.field981 == 0) {
                           var39.field968 = null;
                        }
                     }
                  }

                  ++field705;
                  if (field759 != 0) {
                     field809 += 20;
                     if (field809 >= 400) {
                        field759 = 0;
                     }
                  }

                  if (class179.field2357 != null) {
                     ++field749;
                     if (field749 >= 15) {
                        class37.method721(class179.field2357);
                        class179.field2357 = null;
                     }
                  }

                  class232 var34 = class153.field1993;
                  class232 var37 = class50.field495;
                  class153.field1993 = null;
                  class50.field495 = null;
                  field811 = null;
                  field824 = false;
                  field821 = false;
                  field865 = 0;

                  while(class283.method5540() && field865 < 128) {
                     if (field812 >= 2 && class39.field380[82] && class59.field598 == 66) {
                        String var40 = "";

                        class59 var38;
                        for(Iterator var41 = class85.field1249.iterator(); var41.hasNext(); var40 = var40 + var38.field591 + ':' + var38.field588 + '\n') {
                           var38 = (class59)var41.next();
                        }

                        class157.field2037.method863(var40);
                     } else if (field718 != 1 || class131.field1856 <= 0) {
                        field867[field865] = class59.field598;
                        field846[field865] = class131.field1856;
                        ++field865;
                     }
                  }

                  if (class52.method1072() && class39.field380[82] && class39.field380[81] && field841 != 0) {
                     var3 = class69.field1063.field620 - field841;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != class69.field1063.field620) {
                        class49.method1023(class69.field1063.field994[0] + class49.field490, class69.field1063.field952[0] + class11.field91, var3, false);
                     }

                     field841 = 0;
                  }

                  if (field803 != -1) {
                     class6.method82(field803, 0, 0, class68.field1038, class141.field1937, 0, 0);
                  }

                  ++field828;

                  while(true) {
                     class232 var42;
                     class232 var43;
                     class57 var44;
                     do {
                        var44 = (class57)field843.method4279();
                        if (var44 == null) {
                           while(true) {
                              do {
                                 var44 = (class57)field844.method4279();
                                 if (var44 == null) {
                                    while(true) {
                                       do {
                                          var44 = (class57)field842.method4279();
                                          if (var44 == null) {
                                             this.method1334();
                                             class168.method3649();
                                             if (field816 != null) {
                                                this.method1350();
                                             }

                                             class174 var45;
                                             if (class66.field1025 != null) {
                                                class37.method721(class66.field1025);
                                                ++field756;
                                                if (class48.field469 == 0) {
                                                   if (field673) {
                                                      if (class66.field1025 == class13.field104 && field797 != field751) {
                                                         class232 var46 = class66.field1025;
                                                         byte var29 = 0;
                                                         if (field808 == 1 && var46.field2741 == 206) {
                                                            var29 = 1;
                                                         }

                                                         if (var46.field2762[field797] <= 0) {
                                                            var29 = 0;
                                                         }

                                                         if (class170.method3653(class254.method5000(var46))) {
                                                            var5 = field751;
                                                            var6 = field797;
                                                            var46.field2762[var6] = var46.field2762[var5];
                                                            var46.field2792[var6] = var46.field2792[var5];
                                                            var46.field2762[var5] = -1;
                                                            var46.field2792[var5] = 0;
                                                         } else if (var29 == 1) {
                                                            var5 = field751;
                                                            var6 = field797;

                                                            while(var5 != var6) {
                                                               if (var5 > var6) {
                                                                  var46.method4706(var5 - 1, var5);
                                                                  --var5;
                                                               } else if (var5 < var6) {
                                                                  var46.method4706(var5 + 1, var5);
                                                                  ++var5;
                                                               }
                                                            }
                                                         } else {
                                                            var46.method4706(field797, field751);
                                                         }

                                                         var45 = class131.method3243(class171.field2287, field690.field1282);
                                                         var45.field2332.method3754(field797);
                                                         var45.field2332.method3869(field751);
                                                         var45.field2332.method3921(class66.field1025.field2770);
                                                         var45.field2332.method3796(var29);
                                                         field690.method2193(var45);
                                                      }
                                                   } else if (this.method1251()) {
                                                      this.method1620(field752, field845);
                                                   } else if (field780 > 0) {
                                                      class45.method826(field752, field845);
                                                   }

                                                   field749 = 10;
                                                   class48.field477 = 0;
                                                   class66.field1025 = null;
                                                } else if (field756 >= 5 && (class48.field473 > field752 + 5 || class48.field473 < field752 - 5 || class48.field464 * -976212263 > field845 + 5 || class48.field464 * -976212263 < field845 - 5)) {
                                                   field673 = true;
                                                }
                                             }

                                             if (class127.method3109()) {
                                                var3 = class127.field1785;
                                                var4 = class127.field1805;
                                                var45 = class131.method3243(class171.field2222, field690.field1282);
                                                var45.field2332.method3805(5);
                                                var45.field2332.method3887(var4 + class11.field91);
                                                var45.field2332.method3887(var3 + class49.field490);
                                                var45.field2332.method3795(class39.field380[82] ? (class39.field380[81] ? 2 : 1) : 0);
                                                field690.method2193(var45);
                                                class127.method3097();
                                                field744 = class48.field478;
                                                field745 = class48.field467;
                                                field759 = 1;
                                                field809 = 0;
                                                field722 = var3;
                                                field875 = var4;
                                             }

                                             if (var34 != class153.field1993) {
                                                if (var34 != null) {
                                                   class37.method721(var34);
                                                }

                                                if (class153.field1993 != null) {
                                                   class37.method721(class153.field1993);
                                                }
                                             }

                                             if (var37 != class50.field495 && field795 == field794) {
                                                if (var37 != null) {
                                                   class37.method721(var37);
                                                }

                                                if (class50.field495 != null) {
                                                   class37.method721(class50.field495);
                                                }
                                             }

                                             if (class50.field495 != null) {
                                                if (field794 < field795) {
                                                   ++field794;
                                                   if (field795 == field794) {
                                                      class37.method721(class50.field495);
                                                   }
                                                }
                                             } else if (field794 > 0) {
                                                --field794;
                                             }

                                             if (field718 == 0) {
                                                var3 = class69.field1063.field953;
                                                var4 = class69.field1063.field999;
                                                if (class9.field68 - var3 < -500 || class9.field68 - var3 > 500 || class9.field70 - var4 < -500 || class9.field70 - var4 > 500) {
                                                   class9.field68 = var3;
                                                   class9.field70 = var4;
                                                }

                                                if (var3 != class9.field68) {
                                                   class9.field68 += (var3 - class9.field68) / 16;
                                                }

                                                if (var4 != class9.field70) {
                                                   class9.field70 += (var4 - class9.field70) / 16;
                                                }

                                                var5 = class9.field68 >> 7;
                                                var6 = class9.field70 >> 7;
                                                var7 = class152.method3394(class9.field68, class9.field70, class60.field599);
                                                var8 = 0;
                                                if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                   for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                      for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                         var11 = class60.field599;
                                                         if (var11 < 3 && (class50.field492[1][var9][var10] & 2) == 2) {
                                                            ++var11;
                                                         }

                                                         var12 = var7 - class50.field506[var11][var9][var10];
                                                         if (var12 > var8) {
                                                            var8 = var12;
                                                         }
                                                      }
                                                   }
                                                }

                                                var9 = var8 * 192;
                                                if (var9 > 98048) {
                                                   var9 = 98048;
                                                }

                                                if (var9 < 32768) {
                                                   var9 = 32768;
                                                }

                                                if (var9 > field729) {
                                                   field729 += (var9 - field729) / 24;
                                                } else if (var9 < field729) {
                                                   field729 += (var9 - field729) / 80;
                                                }

                                                class122.field1717 = class152.method3394(class69.field1063.field953, class69.field1063.field999, class60.field599) - field719;
                                             } else if (field718 == 1) {
                                                if (field726 && class69.field1063 != null) {
                                                   var3 = class69.field1063.field994[0];
                                                   var4 = class69.field1063.field952[0];
                                                   if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                                                      class9.field68 = class69.field1063.field953;
                                                      var5 = class152.method3394(class69.field1063.field953, class69.field1063.field999, class60.field599) - field719;
                                                      if (var5 < class122.field1717) {
                                                         class122.field1717 = var5;
                                                      }

                                                      class9.field70 = class69.field1063.field999;
                                                      field726 = false;
                                                   }
                                                }

                                                short var30 = -1;
                                                if (class39.field380[33]) {
                                                   var30 = 0;
                                                } else if (class39.field380[49]) {
                                                   var30 = 1024;
                                                }

                                                if (class39.field380[48]) {
                                                   if (var30 == 0) {
                                                      var30 = 1792;
                                                   } else if (var30 == 1024) {
                                                      var30 = 1280;
                                                   } else {
                                                      var30 = 1536;
                                                   }
                                                } else if (class39.field380[50]) {
                                                   if (var30 == 0) {
                                                      var30 = 256;
                                                   } else if (var30 == 1024) {
                                                      var30 = 768;
                                                   } else {
                                                      var30 = 512;
                                                   }
                                                }

                                                byte var31 = 0;
                                                if (class39.field380[35]) {
                                                   var31 = -1;
                                                } else if (class39.field380[51]) {
                                                   var31 = 1;
                                                }

                                                var5 = 0;
                                                if (var30 >= 0 || var31 != 0) {
                                                   var5 = class39.field380[81] ? field724 : field723;
                                                   var5 *= 16;
                                                   field721 = var30;
                                                   field857 = var31;
                                                }

                                                if (field707 < var5) {
                                                   field707 += var5 / 8;
                                                   if (field707 > var5) {
                                                      field707 = var5;
                                                   }
                                                } else if (field707 > var5) {
                                                   field707 = field707 * 9 / 10;
                                                }

                                                if (field707 > 0) {
                                                   var6 = field707 / 16;
                                                   if (field721 >= 0) {
                                                      var3 = field721 - class15.field143 & 2047;
                                                      var7 = class124.field1747[var3];
                                                      var8 = class124.field1754[var3];
                                                      class9.field68 += var6 * var7 / 65536;
                                                      class9.field70 += var6 * var8 / 65536;
                                                   }

                                                   if (field857 != 0) {
                                                      class122.field1717 += var6 * field857;
                                                      if (class122.field1717 > 0) {
                                                         class122.field1717 = 0;
                                                      }
                                                   }
                                                } else {
                                                   field721 = -1;
                                                   field857 = -1;
                                                }

                                                if (class39.field380[13]) {
                                                   field690.method2193(class131.method3243(class171.field2285, field690.field1282));
                                                   field718 = 0;
                                                }
                                             }

                                             if (class48.field469 == 4 && class14.field132) {
                                                var3 = class48.field464 * -976212263 - field717;
                                                field715 = var3 * 2;
                                                field717 = var3 != -1 && var3 != 1 ? (class48.field464 * -976212263 + field717) / 2 : class48.field464 * -976212263;
                                                var4 = field869 - class48.field473;
                                                field714 = var4 * 2;
                                                field869 = var4 != -1 && var4 != 1 ? (field869 + class48.field473) / 2 : class48.field473;
                                             } else {
                                                if (class39.field380[96]) {
                                                   field714 += (-24 - field714) / 2;
                                                } else if (class39.field380[97]) {
                                                   field714 += (24 - field714) / 2;
                                                } else {
                                                   field714 /= 2;
                                                }

                                                if (class39.field380[98]) {
                                                   field715 += (12 - field715) / 2;
                                                } else if (class39.field380[99]) {
                                                   field715 += (-12 - field715) / 2;
                                                } else {
                                                   field715 /= 2;
                                                }

                                                field717 = class48.field464 * -976212263;
                                                field869 = class48.field473;
                                             }

                                             field658 = field714 / 2 + field658 & 2047;
                                             field712 += field715 / 2;
                                             if (field712 < 128) {
                                                field712 = 128;
                                             }

                                             if (field712 > 383) {
                                                field712 = 383;
                                             }

                                             if (field889) {
                                                class12.method136();
                                             }

                                             for(var3 = 0; var3 < 5; ++var3) {
                                                ++field894[var3];
                                             }

                                             class36.field348.method2090();
                                             var3 = ++class48.field484 - 1;
                                             var5 = class39.field391;
                                             class174 var26;
                                             if (var3 > 15000 && var5 > 15000) {
                                                field725 = 250;
                                                class86.method2165(14500);
                                                var26 = class131.method3243(class171.field2256, field690.field1282);
                                                field690.method2193(var26);
                                             }

                                             class170.field2150.method1823();
                                             ++field690.field1288;
                                             if (field690.field1288 > 50) {
                                                var26 = class131.method3243(class171.field2224, field690.field1282);
                                                field690.method2193(var26);
                                             }

                                             try {
                                                field690.method2187();
                                             } catch (IOException var27) {
                                                class19.method241();
                                             }

                                             return;
                                          }

                                          var42 = var44.field570;
                                          if (var42.field2787 < 0) {
                                             break;
                                          }

                                          var43 = class18.method213(var42.field2700);
                                       } while(var43 == null || var43.field2791 == null || var42.field2787 >= var43.field2791.length || var42 != var43.field2791[var42.field2787]);

                                       class53.method1076(var44);
                                    }
                                 }

                                 var42 = var44.field570;
                                 if (var42.field2787 < 0) {
                                    break;
                                 }

                                 var43 = class18.method213(var42.field2700);
                              } while(var43 == null || var43.field2791 == null || var42.field2787 >= var43.field2791.length || var42 != var43.field2791[var42.field2787]);

                              class53.method1076(var44);
                           }
                        }

                        var42 = var44.field570;
                        if (var42.field2787 < 0) {
                           break;
                        }

                        var43 = class18.method213(var42.field2700);
                     } while(var43 == null || var43.field2791 == null || var42.field2787 >= var43.field2791.length || var42 != var43.field2791[var42.field2787]);

                     class53.method1076(var44);
                  }
               }
            }
         }
      }
   }

   void method1359() {
      int var1 = class68.field1038;
      int var2 = class141.field1937;
      if (super.field439 < var1) {
         var1 = super.field439;
      }

      if (super.field440 < var2) {
         var2 = super.field440;
      }

      if (class47.field435 != null) {
         try {
            class41.method772(class157.field2037, "resize", new Object[]{class17.method211()});
         } catch (Throwable var4) {
            ;
         }
      }

   }

   final void method1433() {
      int var1;
      if (field803 != -1) {
         var1 = field803;
         if (class189.method4028(var1)) {
            class53.method1077(class145.field1951[var1], -1);
         }
      }

      for(var1 = 0; var1 < field853; ++var1) {
         if (field848[var1]) {
            field849[var1] = true;
         }

         field706[var1] = field848[var1];
         field848[var1] = false;
      }

      field847 = field655;
      field792 = -1;
      field860 = -1;
      class13.field104 = null;
      if (field803 != -1) {
         field853 = 0;
         class45.method828(field803, 0, 0, class68.field1038, class141.field1937, 0, 0, -1);
      }

      class319.method6037();
      if (field748) {
         if (field759 == 1) {
            class144.field1945[field809 / 100].method6164(field744 - 8, field745 - 8);
         }

         if (field759 == 2) {
            class144.field1945[field809 / 100 + 4].method6164(field744 - 8, field745 - 8);
         }
      }

      int var2;
      int var3;
      if (!field833) {
         if (field792 != -1) {
            var1 = field792;
            var2 = field860;
            if ((field780 >= 2 || field796 != 0 || field798) && field791) {
               var3 = field780 - 1;
               String var5;
               if (field796 == 1 && field780 < 2) {
                  var5 = "Use" + " " + field766 + " " + "->";
               } else if (field798 && field780 < 2) {
                  var5 = field801 + " " + field716 + " " + "->";
               } else {
                  var5 = class34.method644(var3);
               }

               if (field780 > 2) {
                  var5 = var5 + class128.method3233(16777215) + " " + '/' + " " + (field780 - 2) + " more options";
               }

               class163.field2066.method5828(var5, var1 + 4, var2 + 15, 16777215, 0, field655 / 1000);
            }
         }
      } else {
         var1 = class163.field2067;
         var2 = class86.field1260;
         var3 = class74.field1113;
         int var4 = class128.field1838;
         int var11 = 6116423;
         class319.method6047(var1, var2, var3, var4, var11);
         class319.method6047(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         class319.method6116(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class163.field2066.method5846("Choose Option", var1 + 3, var2 + 14, var11, -1);
         int var6 = class48.field473;
         int var7 = class48.field464 * -976212263;

         for(int var8 = 0; var8 < field780; ++var8) {
            int var9 = var2 + (field780 - 1 - var8) * 15 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            class163.field2066.method5846(class34.method644(var8), var1 + 3, var9, var10, 0);
         }

         class227.method4641(class163.field2067, class86.field1260, class74.field1113, class128.field1838);
      }

      if (field855 == 3) {
         for(var1 = 0; var1 < field853; ++var1) {
            if (field706[var1]) {
               class319.method6046(field763[var1], field852[var1], field819[var1], field854[var1], 16711935, 128);
            } else if (field849[var1]) {
               class319.method6046(field763[var1], field852[var1], field819[var1], field854[var1], 16711680, 128);
            }
         }
      }

      class21.method322(class60.field599, class69.field1063.field953, class69.field1063.field999, field705);
      field705 = 0;
   }

   final boolean method1249(class89 var1) {
      class159 var2 = var1.method2192();
      class191 var3 = var1.field1283;
      if (var2 == null) {
         return false;
      } else {
         String var17;
         int var18;
         try {
            int var5;
            if (var1.field1280 == null) {
               if (var1.field1286) {
                  if (!var2.vmethod3554(1)) {
                     return false;
                  }

                  var2.vmethod3555(var1.field1283.field2404, 0, 1);
                  var1.field1287 = 0;
                  var1.field1286 = false;
               }

               var3.field2405 = 0;
               if (var3.method4048()) {
                  if (!var2.vmethod3554(1)) {
                     return false;
                  }

                  var2.vmethod3555(var1.field1283.field2404, 1, 1);
                  var1.field1287 = 0;
               }

               var1.field1286 = true;
               class170[] var4 = class63.method1656();
               var5 = var3.method4049();
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.field2405);
               }

               var1.field1280 = var4[var5];
               var1.field1285 = var1.field1280.field2151;
            }

            if (var1.field1285 == -1) {
               if (!var2.vmethod3554(1)) {
                  return false;
               }

               var1.method2192().vmethod3555(var3.field2404, 0, 1);
               var1.field1285 = var3.field2404[0] & 255;
            }

            if (var1.field1285 == -2) {
               if (!var2.vmethod3554(2)) {
                  return false;
               }

               var1.method2192().vmethod3555(var3.field2404, 0, 2);
               var3.field2405 = 0;
               var1.field1285 = var3.method3771();
            }

            if (!var2.vmethod3554(var1.field1285)) {
               return false;
            }

            var3.field2405 = 0;
            var2.vmethod3555(var3.field2404, 0, var1.field1285);
            var1.field1287 = 0;
            field904.method5517();
            var1.field1278 = var1.field1284;
            var1.field1284 = var1.field1295;
            var1.field1295 = var1.field1280;
            if (class170.field2178 == var1.field1280) {
               class11.method120(false, var1.field1283);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2159 == var1.field1280) {
               class74.method1987();
               var1.field1280 = null;
               return false;
            }

            if (class170.field2177 == var1.field1280) {
               class0.method11();
               field810 = var3.method3983();
               field685 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2188 == var1.field1280) {
               class0.method11();
               field851 = var3.method3814();
               field685 = field828;
               var1.field1280 = null;
               return true;
            }

            class232 var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var16;
            if (class170.field2196 == var1.field1280) {
               var16 = var3.method3892();
               var5 = var3.method3771();
               if (var16 < -70000) {
                  var5 += 32768;
               }

               if (var16 >= 0) {
                  var6 = class18.method213(var16);
               } else {
                  var6 = null;
               }

               if (var6 != null) {
                  for(var7 = 0; var7 < var6.field2762.length; ++var7) {
                     var6.field2762[var7] = 0;
                     var6.field2792[var7] = 0;
                  }
               }

               class71.method1957(var5);
               var7 = var3.method3771();

               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var3.method3771();
                  var10 = var3.method3983();
                  if (var10 == 255) {
                     var10 = var3.method3772();
                  }

                  if (var6 != null && var8 < var6.field2762.length) {
                     var6.field2762[var8] = var9;
                     var6.field2792[var8] = var10;
                  }

                  class27.method492(var5, var8, var9 - 1, var10);
               }

               if (var6 != null) {
                  class37.method721(var6);
               }

               class0.method11();
               field831[++field832 - 1 & 31] = var5 & 32767;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2148 == var1.field1280) {
               var16 = var3.method3772();
               var5 = var3.method3792();
               var6 = class18.method213(var16);
               if (var6.field2740 != 1 || var5 != var6.field2755) {
                  var6.field2740 = 1;
                  var6.field2755 = var5;
                  class37.method721(var6);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2136 == var1.field1280) {
               var16 = var3.method3892();
               var17 = var3.method3778();
               var6 = class18.method213(var16);
               if (!var17.equals(var6.field2728)) {
                  var6.field2728 = var17;
                  class37.method721(var6);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2145 == var1.field1280) {
               for(var16 = 0; var16 < field698.length; ++var16) {
                  if (field698[var16] != null) {
                     field698[var16].field971 = -1;
                  }
               }

               for(var16 = 0; var16 < field806.length; ++var16) {
                  if (field806[var16] != null) {
                     field806[var16].field971 = -1;
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2182 == var1.field1280) {
               var16 = var3.method3771();
               var5 = var3.method3983();
               var18 = var3.method3771();
               class36.method693(var16, var5, var18);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2129 == var1.field1280) {
               class160.method3500(class173.field2321);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2125 == var1.field1280) {
               class160.method3500(class173.field2319);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2201 == var1.field1280) {
               class67.method1748(var3, var1.field1285);
               class16.method182();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2164 == var1.field1280) {
               class66 var41 = new class66();
               var41.field1019 = var3.method3778();
               var41.field1015 = var3.method3771();
               var5 = var3.method3892();
               var41.field1008 = var5;
               class16.method202(45);
               var2.vmethod3558();
               var2 = null;
               class138.method3292(var41);
               var1.field1280 = null;
               return false;
            }

            if (class170.field2161 == var1.field1280) {
               var16 = var3.method3892();
               var5 = var3.method3771();
               if (var16 < -70000) {
                  var5 += 32768;
               }

               if (var16 >= 0) {
                  var6 = class18.method213(var16);
               } else {
                  var6 = null;
               }

               for(; var3.field2405 < var1.field1285; class27.method492(var5, var7, var8 - 1, var9)) {
                  var7 = var3.method3783();
                  var8 = var3.method3771();
                  var9 = 0;
                  if (var8 != 0) {
                     var9 = var3.method3983();
                     if (var9 == 255) {
                        var9 = var3.method3892();
                     }
                  }

                  if (var6 != null && var7 >= 0 && var7 < var6.field2762.length) {
                     var6.field2762[var7] = var8;
                     var6.field2792[var7] = var9;
                  }
               }

               if (var6 != null) {
                  class37.method721(var6);
               }

               class0.method11();
               field831[++field832 - 1 & 31] = var5 & 32767;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2172 == var1.field1280) {
               class187.field2433 = var3.method3799();
               class72.field1100 = var3.method3891();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2163 == var1.field1280) {
               var16 = var3.method3807();
               class30.method575(var16);
               field831[++field832 - 1 & 31] = var16 & 32767;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2174 == var1.field1280) {
               var3.field2405 += 28;
               if (var3.method3786()) {
                  class86.method2163(var3, var3.field2405 - 28);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2140 == var1.field1280) {
               var16 = var3.method3792();
               if (var16 == 65535) {
                  var16 = -1;
               }

               class69.method1841(var16);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2157 == var1.field1280) {
               var16 = var3.method3812();
               var5 = var3.method3808();
               if (var5 == 65535) {
                  var5 = -1;
               }

               class254.method4994(var5, var16);
               var1.field1280 = null;
               return true;
            }

            class232 var56;
            if (class170.field2176 == var1.field1280) {
               var16 = var3.method3964();
               var5 = var3.method3811();
               var18 = var3.method3810();
               var56 = class18.method213(var16);
               if (var18 != var56.field2676 || var5 != var56.field2751 || var56.field2672 != 0 || var56.field2673 != 0) {
                  var56.field2676 = var18;
                  var56.field2751 = var5;
                  var56.field2672 = 0;
                  var56.field2673 = 0;
                  class37.method721(var56);
                  this.method1577(var56);
                  if (var56.field2808 == 0) {
                     class223.method4594(class145.field1951[var16 >> 16], var56, false);
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2131 == var1.field1280) {
               for(var16 = 0; var16 < class256.field3302; ++var16) {
                  class256 var55 = class142.method3328(var16);
                  if (var55 != null) {
                     class227.field2630[var16] = 0;
                     class227.field2629[var16] = 0;
                  }
               }

               class0.method11();
               field830 += 32;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2149 == var1.field1280) {
               class170.field2150.field1041.method5574(var3, var1.field1285);
               class2.method20();
               field836 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2134 == var1.field1280) {
               class72.field1100 = var3.method3891();
               class187.field2433 = var3.method3799();

               while(var3.field2405 < var1.field1285) {
                  var16 = var3.method3983();
                  class173 var54 = class66.method1733()[var16];
                  class160.method3500(var54);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2190 == var1.field1280) {
               if (field803 != -1) {
                  class33.method607(field803, 0);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2170 == var1.field1280) {
               class12.method141(var3, var1.field1285);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2138 == var1.field1280) {
               var16 = var3.method3814();
               var5 = var3.method3772();
               var6 = class18.method213(var5);
               if (var16 != var6.field2714 || var16 == -1) {
                  var6.field2714 = var16;
                  var6.field2795 = 0;
                  var6.field2750 = 0;
                  class37.method721(var6);
               }

               var1.field1280 = null;
               return true;
            }

            boolean var51;
            if (class170.field2181 == var1.field1280) {
               var51 = var3.method3983() == 1;
               if (var51) {
                  class113.field1511 = class120.method2866() - var3.method3775();
                  class59.field590 = new class1(var3, true);
               } else {
                  class59.field590 = null;
               }

               field839 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2192 == var1.field1280) {
               field889 = true;
               class27.field266 = var3.method3983();
               class180.field2361 = var3.method3983();
               class138.field1926 = var3.method3771();
               class170.field2206 = var3.method3983();
               class30.field314 = var3.method3983();
               if (class30.field314 >= 100) {
                  class157.field2036 = class27.field266 * 128 + 64;
                  class50.field508 = class180.field2361 * 128 + 64;
                  class184.field2409 = class152.method3394(class157.field2036, class50.field508, class60.field599) - class138.field1926;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2194 == var1.field1280) {
               class160.method3500(class173.field2320);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2175 == var1.field1280) {
               class53.method1082(false, var3);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2203 == var1.field1280) {
               class160.method3500(class173.field2318);
               var1.field1280 = null;
               return true;
            }

            class56 var19;
            class232 var20;
            if (class170.field2142 == var1.field1280) {
               var16 = var3.method3892();
               var5 = var3.method3892();
               class56 var44 = (class56)field804.method4224((long)var5);
               var19 = (class56)field804.method4224((long)var16);
               if (var19 != null) {
                  class6.method67(var19, var44 == null || var19.field556 != var44.field556);
               }

               if (var44 != null) {
                  var44.method4271();
                  field804.method4226(var44, (long)var16);
               }

               var20 = class18.method213(var5);
               if (var20 != null) {
                  class37.method721(var20);
               }

               var20 = class18.method213(var16);
               if (var20 != null) {
                  class37.method721(var20);
                  class223.method4594(class145.field1951[var20.field2770 >>> 16], var20, true);
               }

               if (field803 != -1) {
                  class33.method607(field803, 1);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2144 == var1.field1280) {
               var16 = var3.method3983();
               class24.method472(var16);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2153 == var1.field1280) {
               field663 = var3.method3983();
               if (field663 == 1) {
                  field664 = var3.method3771();
               }

               if (field663 >= 2 && field663 <= 6) {
                  if (field663 == 2) {
                     field669 = 64;
                     field755 = 64;
                  }

                  if (field663 == 3) {
                     field669 = 0;
                     field755 = 64;
                  }

                  if (field663 == 4) {
                     field669 = 128;
                     field755 = 64;
                  }

                  if (field663 == 5) {
                     field669 = 64;
                     field755 = 0;
                  }

                  if (field663 == 6) {
                     field669 = 64;
                     field755 = 128;
                  }

                  field663 = 2;
                  field666 = var3.method3771();
                  field667 = var3.method3771();
                  field668 = var3.method3983();
               }

               if (field663 == 10) {
                  field665 = var3.method3771();
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2184 == var1.field1280) {
               field722 = var3.method3983();
               if (field722 == 255) {
                  field722 = 0;
               }

               field875 = var3.method3983();
               if (field875 == 255) {
                  field875 = 0;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2126 == var1.field1280) {
               var16 = var3.method3892();
               class56 var52 = (class56)field804.method4224((long)var16);
               if (var52 != null) {
                  class6.method67(var52, true);
               }

               if (field880 != null) {
                  class37.method721(field880);
                  field880 = null;
               }

               var1.field1280 = null;
               return true;
            }

            class232 var49;
            if (class170.field2147 == var1.field1280) {
               var16 = var3.method3772();
               var49 = class18.method213(var16);
               var49.field2740 = 3;
               var49.field2755 = class69.field1063.field630.method4672();
               class37.method721(var49);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2121 == var1.field1280) {
               var16 = var3.method3771();
               var5 = var3.method3892();
               class227.field2630[var16] = var5;
               if (class227.field2629[var16] != var5) {
                  class227.field2629[var16] = var5;
               }

               class223.method4595(var16);
               field653[++field830 - 1 & 31] = var16;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2158 == var1.field1280) {
               var16 = var3.method3808();
               var5 = var3.method3807();
               var18 = var3.method3964();
               var56 = class18.method213(var18);
               var56.field2723 = var16 + (var5 << 16);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2128 == var1.field1280) {
               class160.method3500(class173.field2316);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2152 == var1.field1280) {
               var16 = var3.method3792();
               var5 = var3.method3772();
               var6 = class18.method213(var5);
               if (var6.field2740 != 2 || var16 != var6.field2755) {
                  var6.field2740 = 2;
                  var6.field2755 = var16;
                  class37.method721(var6);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2124 == var1.field1280) {
               var16 = var3.method3892();
               var5 = var3.method3771();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var18 = var3.method3772();
               var56 = class18.method213(var16);
               class271 var58;
               if (!var56.field2685) {
                  if (var5 == -1) {
                     var56.field2740 = 0;
                     var1.field1280 = null;
                     return true;
                  }

                  var58 = class84.method2125(var5);
                  var56.field2740 = 4;
                  var56.field2755 = var5;
                  var56.field2732 = var58.field3524;
                  var56.field2719 = var58.field3519;
                  var56.field2721 = var58.field3517 * 100 / var18;
                  class37.method721(var56);
               } else {
                  var56.field2793 = var5;
                  var56.field2794 = var18;
                  var58 = class84.method2125(var5);
                  var56.field2732 = var58.field3524;
                  var56.field2719 = var58.field3519;
                  var56.field2720 = var58.field3520;
                  var56.field2718 = var58.field3521;
                  var56.field2717 = var58.field3522;
                  var56.field2721 = var58.field3517;
                  if (var58.field3523 == 1) {
                     var56.field2797 = 1;
                  } else {
                     var56.field2797 = 2;
                  }

                  if (var56.field2722 > 0) {
                     var56.field2721 = var56.field2721 * 32 / var56.field2722;
                  } else if (var56.field2678 > 0) {
                     var56.field2721 = var56.field2721 * 32 / var56.field2678;
                  }

                  class37.method721(var56);
               }

               var1.field1280 = null;
               return true;
            }

            String var40;
            boolean var43;
            if (class170.field2187 == var1.field1280) {
               var16 = var3.method3783();
               var43 = var3.method3983() == 1;
               var40 = "";
               boolean var45 = false;
               if (var43) {
                  var40 = var3.method3778();
                  if (class170.field2150.method1803(new class293(var40, field920))) {
                     var45 = true;
                  }
               }

               String var57 = var3.method3778();
               if (!var45) {
                  class59.method1163(var16, var40, var57);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2166 == var1.field1280) {
               field889 = true;
               class67.field1027 = var3.method3983();
               class141.field1939 = var3.method3983();
               class21.field208 = var3.method3771();
               class66.field1026 = var3.method3983();
               class253.field3289 = var3.method3983();
               if (class253.field3289 >= 100) {
                  var16 = class67.field1027 * 128 + 64;
                  var5 = class141.field1939 * 128 + 64;
                  var18 = class152.method3394(var16, var5, class60.field599) - class21.field208;
                  var7 = var16 - class157.field2036;
                  var8 = var18 - class184.field2409;
                  var9 = var5 - class50.field508;
                  var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
                  class57.field576 = (int)(Math.atan2((double)var8, (double)var10) * 325.949D) & 2047;
                  class15.field143 = (int)(Math.atan2((double)var7, (double)var9) * -325.949D) & 2047;
                  if (class57.field576 < 128) {
                     class57.field576 = 128;
                  }

                  if (class57.field576 > 383) {
                     class57.field576 = 383;
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2120 == var1.field1280) {
               var16 = var3.method3772();
               var5 = var3.method3792();
               var6 = class18.method213(var16);
               if (var6 != null && var6.field2808 == 0) {
                  if (var5 > var6.field2691 - var6.field2683) {
                     var5 = var6.field2691 - var6.field2683;
                  }

                  if (var5 < 0) {
                     var5 = 0;
                  }

                  if (var5 != var6.field2689) {
                     var6.field2689 = var5;
                     class37.method721(var6);
                  }
               }

               var1.field1280 = null;
               return true;
            }

            String var38;
            if (class170.field2179 == var1.field1280) {
               var38 = var3.method3778();
               Object[] var50 = new Object[var38.length() + 1];

               for(var18 = var38.length() - 1; var18 >= 0; --var18) {
                  if (var38.charAt(var18) == 's') {
                     var50[var18 + 1] = var3.method3778();
                  } else {
                     var50[var18 + 1] = new Integer(var3.method3892());
                  }
               }

               var50[0] = new Integer(var3.method3892());
               class57 var42 = new class57();
               var42.field575 = var50;
               class53.method1076(var42);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2199 == var1.field1280) {
               var16 = var3.method3964();
               var49 = class18.method213(var16);

               for(var18 = 0; var18 < var49.field2762.length; ++var18) {
                  var49.field2762[var18] = -1;
                  var49.field2762[var18] = 0;
               }

               class37.method721(var49);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2197 == var1.field1280) {
               field861 = var3.method3799();
               field730 = var3.method3799();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2167 == var1.field1280) {
               var16 = var3.method3792();
               var5 = var3.method3792();
               var18 = var3.method3792();
               var7 = var3.method3772();
               var20 = class18.method213(var7);
               if (var16 != var20.field2732 || var18 != var20.field2719 || var5 != var20.field2721) {
                  var20.field2732 = var16;
                  var20.field2719 = var18;
                  var20.field2721 = var5;
                  class37.method721(var20);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2123 == var1.field1280) {
               class160.method3500(class173.field2325);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2191 == var1.field1280) {
               field876 = var3.method3983();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2141 == var1.field1280) {
               var16 = var3.method3964();
               var5 = var3.method3808();
               var18 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var8 = var5 & 31;
               var9 = (var7 << 11) + (var18 << 19) + (var8 << 3);
               class232 var59 = class18.method213(var16);
               if (var9 != var59.field2686) {
                  var59.field2686 = var9;
                  class37.method721(var59);
               }

               var1.field1280 = null;
               return true;
            }

            long var12;
            if (class170.field2173 == var1.field1280) {
               var16 = var3.field2405 + var1.field1285;
               var5 = var3.method3771();
               var18 = var3.method3771();
               if (var5 != field803) {
                  field803 = var5;
                  this.method1253(false);
                  class160.method3504(field803);
                  class25.method480(field803);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field848[var7] = true;
                  }
               }

               class56 var21;
               for(; var18-- > 0; var21.field555 = true) {
                  var7 = var3.method3892();
                  var8 = var3.method3771();
                  var9 = var3.method3983();
                  var21 = (class56)field804.method4224((long)var7);
                  if (var21 != null && var8 != var21.field556) {
                     class6.method67(var21, true);
                     var21 = null;
                  }

                  if (var21 == null) {
                     var21 = class17.method209(var7, var8, var9);
                  }
               }

               for(var19 = (class56)field804.method4235(); var19 != null; var19 = (class56)field804.method4229()) {
                  if (var19.field555) {
                     var19.field555 = false;
                  } else {
                     class6.method67(var19, true);
                  }
               }

               field800 = new class204(512);

               while(var3.field2405 < var16) {
                  var7 = var3.method3892();
                  var8 = var3.method3771();
                  var9 = var3.method3771();
                  var10 = var3.method3892();

                  for(int var11 = var8; var11 <= var9; ++var11) {
                     var12 = (long)var11 + ((long)var7 << 32);
                     field800.method4226(new class213(var10), var12);
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2119 == var1.field1280) {
               field889 = false;

               for(var16 = 0; var16 < 5; ++var16) {
                  field890[var16] = false;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2118 == var1.field1280) {
               class160.method3500(class173.field2317);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2204 == var1.field1280) {
               var16 = var3.method3792();
               field803 = var16;
               this.method1253(false);
               class160.method3504(var16);
               class25.method480(field803);

               for(var5 = 0; var5 < 100; ++var5) {
                  field848[var5] = true;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2162 == var1.field1280) {
               if (class3.field26 != null) {
                  class3.field26.method5743(var3);
               }

               class40.method760();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2139 == var1.field1280) {
               class0.method11();
               var16 = var3.method3816();
               var5 = var3.method3799();
               var18 = var3.method3983();
               field777[var5] = var16;
               field775[var5] = var18;
               field776[var5] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if (var16 >= class236.field2844[var7]) {
                     field776[var5] = var7 + 2;
                  }
               }

               field774[++field834 - 1 & 31] = var5;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2200 == var1.field1280) {
               class277.method5493(var3.method3778());
               var1.field1280 = null;
               return true;
            }

            if (class170.field2156 == var1.field1280) {
               if (var1.field1285 == 0) {
                  class3.field26 = null;
               } else {
                  if (class3.field26 == null) {
                     class3.field26 = new class295(field920, class157.field2037);
                  }

                  class3.field26.method5742(var3);
               }

               class40.method760();
               var1.field1280 = null;
               return true;
            }

            if (class170.field2169 == var1.field1280) {
               byte[] var39 = new byte[var1.field1285];
               var3.method4058(var39, 0, var39.length);
               class184 var47 = new class184(var39);
               var40 = var47.method3778();
               class138.method3291(var40, true, false);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2160 == var1.field1280) {
               var16 = var3.method3983();
               if (var3.method3983() == 0) {
                  field895[var16] = new class4();
                  var3.field2405 += 18;
               } else {
                  --var3.field2405;
                  field895[var16] = new class4(var3, false);
               }

               field858 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2146 == var1.field1280) {
               class170.field2150.method1804();
               field836 = field828;
               var1.field1280 = null;
               return true;
            }

            long var22;
            long var24;
            if (class170.field2127 == var1.field1280) {
               var38 = var3.method3778();
               var22 = (long)var3.method3771();
               var24 = (long)var3.method3773();
               class244 var26 = (class244)class43.method791(class6.method80(), var3.method3983());
               long var27 = (var22 << 32) + var24;
               boolean var29 = false;

               for(int var13 = 0; var13 < 100; ++var13) {
                  if (field840[var13] == var27) {
                     var29 = true;
                     break;
                  }
               }

               if (class170.field2150.method1803(new class293(var38, field920))) {
                  var29 = true;
               }

               if (!var29 && field680 == 0) {
                  field840[field864] = var27;
                  field864 = (field864 + 1) % 100;
                  String var30 = class301.method5797(class235.method4782(class22.method332(var3)));
                  byte var46;
                  if (var26.field3188) {
                     var46 = 7;
                  } else {
                     var46 = 3;
                  }

                  if (var26.field3185 != -1) {
                     class59.method1163(var46, class19.method243(var26.field3185) + var38, var30);
                  } else {
                     class59.method1163(var46, var38, var30);
                  }
               }

               var1.field1280 = null;
               return true;
            }

            long var31;
            if (class170.field2171 == var1.field1280) {
               var38 = var3.method3778();
               var22 = var3.method3775();
               var24 = (long)var3.method3771();
               var31 = (long)var3.method3773();
               class244 var60 = (class244)class43.method791(class6.method80(), var3.method3983());
               var12 = (var24 << 32) + var31;
               boolean var14 = false;

               for(int var15 = 0; var15 < 100; ++var15) {
                  if (field840[var15] == var12) {
                     var14 = true;
                     break;
                  }
               }

               if (var60.field3190 && class170.field2150.method1803(new class293(var38, field920))) {
                  var14 = true;
               }

               if (!var14 && field680 == 0) {
                  field840[field864] = var12;
                  field864 = (field864 + 1) % 100;
                  String var34 = class301.method5797(class235.method4782(class22.method332(var3)));
                  if (var60.field3185 != -1) {
                     class9.method104(9, class19.method243(var60.field3185) + var38, var34, class256.method5038(var22));
                  } else {
                     class9.method104(9, var38, var34, class256.method5038(var22));
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2155 == var1.field1280) {
               var38 = var3.method3778();
               var17 = class301.method5797(class235.method4782(class22.method332(var3)));
               class59.method1163(6, var38, var17);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2154 == var1.field1280) {
               for(var16 = 0; var16 < class227.field2629.length; ++var16) {
                  if (class227.field2630[var16] != class227.field2629[var16]) {
                     class227.field2629[var16] = class227.field2630[var16];
                     class223.method4595(var16);
                     field653[++field830 - 1 & 31] = var16;
                  }
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2122 == var1.field1280) {
               var16 = var3.method3892();
               if (var16 != field659) {
                  field659 = var16;
                  class12.method139();
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2133 == var1.field1280) {
               var51 = var3.method3776();
               if (var51) {
                  if (class140.field1933 == null) {
                     class140.field1933 = new class253();
                  }
               } else {
                  class140.field1933 = null;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2186 == var1.field1280) {
               var16 = var3.method3892();
               var5 = var3.method3892();
               var18 = class177.method3695();
               class174 var53 = class131.method3243(class171.field2218, field690.field1282);
               var53.field2332.method3796(var18);
               var53.field2332.method3805(class47.field434);
               var53.field2332.method3893(var16);
               var53.field2332.method3813(var5);
               field690.method2193(var53);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2183 == var1.field1280) {
               var16 = var3.method3883();
               var5 = var3.method3883();
               var40 = var3.method3778();
               if (var5 >= 1 && var5 <= 8) {
                  if (var40.equalsIgnoreCase("null")) {
                     var40 = null;
                  }

                  field767[var5 - 1] = var40;
                  field768[var5 - 1] = var16 == 0;
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2180 == var1.field1280) {
               byte var48 = var3.method3968();
               var5 = var3.method3808();
               class227.field2630[var5] = var48;
               if (class227.field2629[var5] != var48) {
                  class227.field2629[var5] = var48;
               }

               class223.method4595(var5);
               field653[++field830 - 1 & 31] = var5;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2193 == var1.field1280) {
               class170.field2150.method1753(var3, var1.field1285);
               field836 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2132 == var1.field1280) {
               class160.method3500(class173.field2323);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2130 == var1.field1280) {
               class160.method3500(class173.field2322);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2165 == var1.field1280) {
               var16 = var3.method3892();
               var43 = var3.method3983() == 1;
               var6 = class18.method213(var16);
               if (var43 != var6.field2704) {
                  var6.field2704 = var43;
                  class37.method721(var6);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2137 == var1.field1280) {
               var16 = var3.method3883();
               var5 = var3.method3964();
               var18 = var3.method3792();
               var19 = (class56)field804.method4224((long)var5);
               if (var19 != null) {
                  class6.method67(var19, var18 != var19.field556);
               }

               class17.method209(var5, var18, var16);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2143 == var1.field1280) {
               class160.method3500(class173.field2329);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2168 == var1.field1280) {
               class11.method120(true, var1.field1283);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2189 == var1.field1280) {
               field662 = var3.method3771() * 30;
               field685 = field828;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2205 == var1.field1280) {
               var16 = var3.method3983();
               var5 = var3.method3983();
               var18 = var3.method3983();
               var7 = var3.method3983();
               field890[var16] = true;
               field891[var16] = var5;
               field892[var16] = var18;
               field893[var16] = var7;
               field894[var16] = 0;
               var1.field1280 = null;
               return true;
            }

            if (class170.field2135 == var1.field1280) {
               class53.method1082(true, var3);
               var1.field1280 = null;
               return true;
            }

            if (class170.field2185 == var1.field1280) {
               class274.field3613 = class51.method1060(var3.method3983());
               var1.field1280 = null;
               return true;
            }

            if (class170.field2195 == var1.field1280) {
               var16 = var3.method3816();
               var5 = var3.method3808();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var18 = var3.method3772();
               var7 = var3.method3771();
               if (var7 == 65535) {
                  var7 = -1;
               }

               for(var8 = var7; var8 <= var5; ++var8) {
                  var31 = ((long)var18 << 32) + (long)var8;
                  class206 var33 = field800.method4224(var31);
                  if (var33 != null) {
                     var33.method4271();
                  }

                  field800.method4226(new class213(var16), var31);
               }

               var1.field1280 = null;
               return true;
            }

            if (class170.field2198 == var1.field1280) {
               class72.field1100 = var3.method3799();
               class187.field2433 = var3.method3983();

               for(var16 = class187.field2433; var16 < class187.field2433 + 8; ++var16) {
                  for(var5 = class72.field1100; var5 < class72.field1100 + 8; ++var5) {
                     if (field829[class60.field599][var16][var5] != null) {
                        field829[class60.field599][var16][var5] = null;
                        class238.method4784(var16, var5);
                     }
                  }
               }

               for(class63 var37 = (class63)field688.method4298(); var37 != null; var37 = (class63)field688.method4283()) {
                  if (var37.field922 >= class187.field2433 && var37.field922 < class187.field2433 + 8 && var37.field925 >= class72.field1100 && var37.field925 < class72.field1100 + 8 && var37.field934 == class60.field599) {
                     var37.field933 = 0;
                  }
               }

               var1.field1280 = null;
               return true;
            }

            class80.method2041("" + (var1.field1280 != null ? var1.field1280.field2202 : -1) + "," + (var1.field1284 != null ? var1.field1284.field2202 : -1) + "," + (var1.field1278 != null ? var1.field1278.field2202 : -1) + "," + var1.field1285, (Throwable)null);
            class74.method1987();
         } catch (IOException var35) {
            class19.method241();
         } catch (Exception var36) {
            var17 = "" + (var1.field1280 != null ? var1.field1280.field2202 : -1) + "," + (var1.field1284 != null ? var1.field1284.field2202 : -1) + "," + (var1.field1278 != null ? var1.field1278.field2202 : -1) + "," + var1.field1285 + "," + (class69.field1063.field994[0] + class49.field490) + "," + (class69.field1063.field952[0] + class11.field91) + ",";

            for(var18 = 0; var18 < var1.field1285 && var18 < 50; ++var18) {
               var17 = var17 + var3.field2404[var18] + ",";
            }

            class80.method2041(var17, var36);
            class74.method1987();
         }

         return true;
      }
   }

   final void method1334() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < field780 - 1; ++var2) {
            if (field783[var2] < 1000 && field783[var2 + 1] > 1000) {
               String var3 = field786[var2];
               field786[var2] = field786[var2 + 1];
               field786[var2 + 1] = var3;
               String var4 = field916[var2];
               field916[var2] = field916[var2 + 1];
               field916[var2 + 1] = var4;
               var5 = field783[var2];
               field783[var2] = field783[var2 + 1];
               field783[var2 + 1] = var5;
               var5 = field781[var2];
               field781[var2] = field781[var2 + 1];
               field781[var2 + 1] = var5;
               var5 = field782[var2];
               field782[var2] = field782[var2 + 1];
               field782[var2 + 1] = var5;
               var5 = field784[var2];
               field784[var2] = field784[var2 + 1];
               field784[var2 + 1] = var5;
               boolean var6 = field772[var2];
               field772[var2] = field772[var2 + 1];
               field772[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

      if (class66.field1025 == null) {
         if (field816 == null) {
            int var17;
            label318: {
               int var16 = class48.field477;
               int var9;
               int var14;
               if (field833) {
                  int var7;
                  int var13;
                  int var18;
                  if (var16 != 1 && (class14.field132 || var16 != 4)) {
                     var2 = class48.field473;
                     var13 = class48.field464 * -976212263;
                     if (var2 < class163.field2067 - 10 || var2 > class163.field2067 + class74.field1113 + 10 || var13 < class86.field1260 - 10 || var13 > class128.field1838 + class86.field1260 + 10) {
                        field833 = false;
                        var14 = class163.field2067;
                        var5 = class86.field1260;
                        var17 = class74.field1113;
                        var7 = class128.field1838;

                        for(var18 = 0; var18 < field853; ++var18) {
                           if (field819[var18] + field763[var18] > var14 && field763[var18] < var17 + var14 && field852[var18] + field854[var18] > var5 && field852[var18] < var5 + var7) {
                              field848[var18] = true;
                           }
                        }
                     }
                  }

                  if (var16 == 1 || !class14.field132 && var16 == 4) {
                     var2 = class163.field2067;
                     var13 = class86.field1260;
                     var14 = class74.field1113;
                     var5 = class48.field478;
                     var17 = class48.field467;
                     var7 = -1;

                     for(var18 = 0; var18 < field780; ++var18) {
                        var9 = var13 + (field780 - 1 - var18) * 15 + 31;
                        if (var5 > var2 && var5 < var2 + var14 && var17 > var9 - 13 && var17 < var9 + 3) {
                           var7 = var18;
                        }
                     }

                     if (var7 != -1) {
                        class34.method647(var7);
                     }

                     field833 = false;
                     var18 = class163.field2067;
                     var9 = class86.field1260;
                     int var10 = class74.field1113;
                     int var11 = class128.field1838;

                     for(int var12 = 0; var12 < field853; ++var12) {
                        if (field763[var12] + field819[var12] > var18 && field763[var12] < var18 + var10 && field854[var12] + field852[var12] > var9 && field852[var12] < var11 + var9) {
                           field848[var12] = true;
                        }
                     }
                  }
               } else {
                  var2 = field780 - 1;
                  if ((var16 == 1 || !class14.field132 && var16 == 4) && var2 >= 0) {
                     var14 = field783[var2];
                     if (var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                        var5 = field781[var2];
                        var17 = field782[var2];
                        class232 var15 = class18.method213(var17);
                        var9 = class254.method5000(var15);
                        boolean var8 = (var9 >> 28 & 1) != 0;
                        if (var8) {
                           break label318;
                        }

                        Object var10000 = null;
                        if (class170.method3653(class254.method5000(var15))) {
                           break label318;
                        }
                     }
                  }

                  if ((var16 == 1 || !class14.field132 && var16 == 4) && this.method1251()) {
                     var16 = 2;
                  }

                  if ((var16 == 1 || !class14.field132 && var16 == 4) && field780 > 0) {
                     class34.method647(var2);
                  }

                  if (var16 == 2 && field780 > 0) {
                     this.method1620(class48.field478, class48.field467);
                  }
               }

               return;
            }

            if (class66.field1025 != null && !field673 && field780 > 0 && !this.method1251()) {
               class45.method826(field752, field845);
            }

            field673 = false;
            field756 = 0;
            if (class66.field1025 != null) {
               class37.method721(class66.field1025);
            }

            class66.field1025 = class18.method213(var17);
            field751 = var5;
            field752 = class48.field478;
            field845 = class48.field467;
            if (var2 >= 0) {
               class0.method10(var2);
            }

            class37.method721(class66.field1025);
         }
      }
   }

   final boolean method1251() {
      int var1 = field780 - 1;
      boolean var3 = field866 == 1 && field780 > 2;
      if (!var3) {
         boolean var4;
         if (var1 < 0) {
            var4 = false;
         } else {
            int var5 = field783[var1];
            if (var5 >= 2000) {
               var5 -= 2000;
            }

            if (var5 == 1007) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         var3 = var4;
      }

      return var3 && !field772[var1];
   }

   final void method1620(int var1, int var2) {
      class56.method1108(var1, var2);
      class243.field3173.method3080(class60.field599, var1, var2, false);
      field833 = true;
   }

   final void method1253(boolean var1) {
      class30.method536(field803, class68.field1038, class141.field1937, var1);
   }

   void method1577(class232 var1) {
      class232 var2 = var1.field2700 == -1 ? null : class18.method213(var1.field2700);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = class68.field1038;
         var4 = class141.field1937;
      } else {
         var3 = var2.field2682;
         var4 = var2.field2683;
      }

      class136.method3270(var1, var3, var4, false);
      class117.method2852(var1, var3, var4);
   }

   final void method1350() {
      class37.method721(field816);
      ++class234.field2817;
      if (field824 && field821) {
         int var1 = class48.field473;
         int var2 = class48.field464 * -976212263;
         var1 -= field906;
         var2 -= field838;
         if (var1 < field713) {
            var1 = field713;
         }

         if (var1 + field816.field2682 > field713 + field817.field2682) {
            var1 = field713 + field817.field2682 - field816.field2682;
         }

         if (var2 < field823) {
            var2 = field823;
         }

         if (var2 + field816.field2683 > field823 + field817.field2683) {
            var2 = field823 + field817.field2683 - field816.field2683;
         }

         int var3 = var1 - field825;
         int var4 = var2 - field826;
         int var5 = field816.field2749;
         if (class234.field2817 > field816.field2799 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            field827 = true;
         }

         int var6 = var1 - field713 + field817.field2711;
         int var7 = var2 - field823 + field817.field2689;
         class57 var8;
         if (field816.field2712 != null && field827) {
            var8 = new class57();
            var8.field570 = field816;
            var8.field565 = var6;
            var8.field566 = var7;
            var8.field575 = field816.field2712;
            class53.method1076(var8);
         }

         if (class48.field469 == 0) {
            if (field827) {
               if (field816.field2763 != null) {
                  var8 = new class57();
                  var8.field570 = field816;
                  var8.field565 = var6;
                  var8.field566 = var7;
                  var8.field568 = field811;
                  var8.field575 = field816.field2763;
                  class53.method1076(var8);
               }

               if (field811 != null && class244.method4799(field816) != null) {
                  class174 var9 = class131.method3243(class171.field2264, field690.field1282);
                  var9.field2332.method3887(field816.field2787);
                  var9.field2332.method3887(field811.field2793);
                  var9.field2332.method3754(field811.field2787);
                  var9.field2332.method3813(field816.field2770);
                  var9.field2332.method3893(field811.field2770);
                  var9.field2332.method3754(field816.field2793);
                  field690.method2193(var9);
               }
            } else if (this.method1251()) {
               this.method1620(field906 + field825, field826 + field838);
            } else if (field780 > 0) {
               class45.method826(field906 + field825, field838 + field826);
            }

            field816 = null;
         }

      } else {
         if (class234.field2817 > 1) {
            field816 = null;
         }

      }
   }

   public class293 vmethod5687() {
      return class69.field1063 != null ? class69.field1063.field625 : null;
   }

   static void method1655(class57 var0, int var1) {
      Object[] var2 = var0.field575;
      class86 var3;
      int var17;
      if (class128.method3234(var0.field573)) {
         class152.field1985 = (class36)var2[0];
         class257 var4 = class162.method3533(class152.field1985.field343);
         var3 = class30.method578(var0.field573, var4.field3313, var4.field3317);
      } else {
         var17 = ((Integer)var2[0]).intValue();
         var3 = class9.method99(var17);
      }

      if (var3 != null) {
         class60.field600 = 0;
         class70.field1072 = 0;
         var17 = -1;
         int[] var5 = var3.field1257;
         int[] var6 = var3.field1252;
         byte var7 = -1;
         class70.field1083 = 0;
         class70.field1078 = false;

         try {
            int var10;
            try {
               class70.field1077 = new int[var3.field1256];
               int var8 = 0;
               class70.field1067 = new String[var3.field1254];
               int var9 = 0;

               int var11;
               String var18;
               for(var10 = 1; var10 < var2.length; ++var10) {
                  if (var2[var10] instanceof Integer) {
                     var11 = ((Integer)var2[var10]).intValue();
                     if (var11 == -2147483647) {
                        var11 = var0.field565;
                     }

                     if (var11 == -2147483646) {
                        var11 = var0.field566;
                     }

                     if (var11 == -2147483645) {
                        var11 = var0.field570 != null ? var0.field570.field2770 : -1;
                     }

                     if (var11 == -2147483644) {
                        var11 = var0.field567;
                     }

                     if (var11 == -2147483643) {
                        var11 = var0.field570 != null ? var0.field570.field2787 : -1;
                     }

                     if (var11 == -2147483642) {
                        var11 = var0.field568 != null ? var0.field568.field2770 : -1;
                     }

                     if (var11 == -2147483641) {
                        var11 = var0.field568 != null ? var0.field568.field2787 : -1;
                     }

                     if (var11 == -2147483640) {
                        var11 = var0.field569;
                     }

                     if (var11 == -2147483639) {
                        var11 = var0.field562;
                     }

                     class70.field1077[var8++] = var11;
                  } else if (var2[var10] instanceof String) {
                     var18 = (String)var2[var10];
                     if (var18.equals("event_opbase")) {
                        var18 = var0.field571;
                     }

                     class70.field1067[var9++] = var18;
                  }
               }

               var10 = 0;
               class70.field1075 = var0.field572;

               while(true) {
                  ++var10;
                  if (var10 > var1) {
                     throw new RuntimeException();
                  }

                  ++var17;
                  int var29 = var5[var17];
                  int var20;
                  if (var29 >= 100) {
                     boolean var33;
                     if (var3.field1252[var17] == 1) {
                        var33 = true;
                     } else {
                        var33 = false;
                     }

                     var20 = class140.method3311(var29, var3, var33);
                     switch(var20) {
                     case 0:
                        return;
                     case 1:
                     default:
                        break;
                     case 2:
                        throw new IllegalStateException();
                     }
                  } else if (var29 == 0) {
                     class70.field1070[++class60.field600 - 1] = var6[var17];
                  } else if (var29 == 1) {
                     var11 = var6[var17];
                     class70.field1070[++class60.field600 - 1] = class227.field2629[var11];
                  } else if (var29 == 2) {
                     var11 = var6[var17];
                     class227.field2629[var11] = class70.field1070[--class60.field600];
                     class223.method4595(var11);
                  } else if (var29 == 3) {
                     class70.field1065[++class70.field1072 - 1] = var3.field1255[var17];
                  } else if (var29 == 6) {
                     var17 += var6[var17];
                  } else if (var29 == 7) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] != class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 8) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] == class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 9) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] < class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 10) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] > class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 21) {
                     if (class70.field1083 == 0) {
                        return;
                     }

                     class51 var34 = class70.field1074[--class70.field1083];
                     var3 = var34.field521;
                     var5 = var3.field1257;
                     var6 = var3.field1252;
                     var17 = var34.field523;
                     class70.field1077 = var34.field514;
                     class70.field1067 = var34.field517;
                  } else if (var29 == 25) {
                     var11 = var6[var17];
                     class70.field1070[++class60.field600 - 1] = class97.method2405(var11);
                  } else if (var29 == 27) {
                     var11 = var6[var17];
                     class40.method766(var11, class70.field1070[--class60.field600]);
                  } else if (var29 == 31) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] <= class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 32) {
                     class60.field600 -= 2;
                     if (class70.field1070[class60.field600] >= class70.field1070[class60.field600 + 1]) {
                        var17 += var6[var17];
                     }
                  } else if (var29 == 33) {
                     class70.field1070[++class60.field600 - 1] = class70.field1077[var6[var17]];
                  } else if (var29 == 34) {
                     class70.field1077[var6[var17]] = class70.field1070[--class60.field600];
                  } else if (var29 == 35) {
                     class70.field1065[++class70.field1072 - 1] = class70.field1067[var6[var17]];
                  } else if (var29 == 36) {
                     class70.field1067[var6[var17]] = class70.field1065[--class70.field1072];
                  } else if (var29 == 37) {
                     var11 = var6[var17];
                     class70.field1072 -= var11;
                     String var31 = class25.method477(class70.field1065, class70.field1072, var11);
                     class70.field1065[++class70.field1072 - 1] = var31;
                  } else if (var29 == 38) {
                     --class60.field600;
                  } else if (var29 == 39) {
                     --class70.field1072;
                  } else {
                     int var15;
                     if (var29 != 40) {
                        if (var29 == 42) {
                           class70.field1070[++class60.field600 - 1] = class36.field348.method2091(var6[var17]);
                        } else if (var29 == 43) {
                           class36.field348.method2114(var6[var17], class70.field1070[--class60.field600]);
                        } else if (var29 == 44) {
                           var11 = var6[var17] >> 16;
                           var20 = var6[var17] & '\uffff';
                           int var21 = class70.field1070[--class60.field600];
                           if (var21 < 0 || var21 > 5000) {
                              throw new RuntimeException();
                           }

                           class70.field1068[var11] = var21;
                           byte var22 = -1;
                           if (var20 == 105) {
                              var22 = 0;
                           }

                           for(var15 = 0; var15 < var21; ++var15) {
                              class70.field1069[var11][var15] = var22;
                           }
                        } else if (var29 == 45) {
                           var11 = var6[var17];
                           var20 = class70.field1070[--class60.field600];
                           if (var20 < 0 || var20 >= class70.field1068[var11]) {
                              throw new RuntimeException();
                           }

                           class70.field1070[++class60.field600 - 1] = class70.field1069[var11][var20];
                        } else if (var29 == 46) {
                           var11 = var6[var17];
                           class60.field600 -= 2;
                           var20 = class70.field1070[class60.field600];
                           if (var20 < 0 || var20 >= class70.field1068[var11]) {
                              throw new RuntimeException();
                           }

                           class70.field1069[var11][var20] = class70.field1070[class60.field600 + 1];
                        } else if (var29 == 47) {
                           var18 = class36.field348.method2089(var6[var17]);
                           if (var18 == null) {
                              var18 = "null";
                           }

                           class70.field1065[++class70.field1072 - 1] = var18;
                        } else if (var29 == 48) {
                           class36.field348.method2106(var6[var17], class70.field1065[--class70.field1072]);
                        } else {
                           if (var29 != 60) {
                              throw new IllegalStateException();
                           }

                           class199 var32 = var3.field1253[var6[var17]];
                           class213 var30 = (class213)var32.method4185((long)class70.field1070[--class60.field600]);
                           if (var30 != null) {
                              var17 += var30.field2512;
                           }
                        }
                     } else {
                        var11 = var6[var17];
                        class86 var12 = class9.method99(var11);
                        int[] var13 = new int[var12.field1256];
                        String[] var14 = new String[var12.field1254];

                        for(var15 = 0; var15 < var12.field1258; ++var15) {
                           var13[var15] = class70.field1070[var15 + (class60.field600 - var12.field1258)];
                        }

                        for(var15 = 0; var15 < var12.field1259; ++var15) {
                           var14[var15] = class70.field1065[var15 + (class70.field1072 - var12.field1259)];
                        }

                        class60.field600 -= var12.field1258;
                        class70.field1072 -= var12.field1259;
                        class51 var19 = new class51();
                        var19.field521 = var3;
                        var19.field523 = var17;
                        var19.field514 = class70.field1077;
                        var19.field517 = class70.field1067;
                        class70.field1074[++class70.field1083 - 1] = var19;
                        var3 = var12;
                        var5 = var12.field1257;
                        var6 = var12.field1252;
                        var17 = -1;
                        class70.field1077 = var13;
                        class70.field1067 = var14;
                     }
                  }
               }
            } catch (Exception var27) {
               StringBuilder var24 = new StringBuilder(30);
               var24.append("").append(var3.field2496).append(" ");

               for(var10 = class70.field1083 - 1; var10 >= 0; --var10) {
                  var24.append("").append(class70.field1074[var10].field521.field2496).append(" ");
               }

               var24.append("").append(var7);
               class80.method2041(var24.toString(), var27);
            }
         } finally {
            if (class70.field1078) {
               class70.field1079 = true;
               class42.method783();
               class70.field1079 = false;
               class70.field1078 = false;
            }

         }
      }
   }
}
