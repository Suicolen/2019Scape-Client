package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public abstract class Class102 {

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_3;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(II)Lclient!iu;")
	public static Class349 method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class349.aClass349_7.anInt4241 * 1424636537) {
			return Class349.aClass349_7;
		} else if (arg0 == Class349.aClass349_3.anInt4241 * 1424636537) {
			return Class349.aClass349_3;
		} else if (arg0 == Class349.aClass349_2.anInt4241 * 1424636537) {
			return Class349.aClass349_2;
		} else if (Class349.aClass349_4.anInt4241 * 1424636537 == arg0) {
			return Class349.aClass349_4;
		} else if (Class349.aClass349_5.anInt4241 * 1424636537 == arg0) {
			return Class349.aClass349_5;
		} else if (arg0 == Class349.aClass349_6.anInt4241 * 1424636537) {
			return Class349.aClass349_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "ll", descriptor = "(Ljava/lang/String;I)V")
	public static void method2588(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(7) Class175 local7 = Class330.method27465(-1580060079);
		@Pc(13) Class93_Sub22 local13 = method2592(Class446.aClass446_94, local7.aClass24_2, (byte) 29);
		local13.aClass93_Sub41_Sub2_1.method22522(Class46.method894(arg0, -1857161175), (byte) -28);
		local13.aClass93_Sub41_Sub2_1.method22414(arg0, 932008120);
		local7.method24363(local13, -2047560182);
	}

	@OriginalMember(owner = "client!cj", name = "afa", descriptor = "(Lclient!yf;I)V")
	static void method2589(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Integer.toString(local12);
	}

	@OriginalMember(owner = "client!cj", name = "bcd", descriptor = "(Lclient!yf;I)V")
	static void method2590(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3433 * -914512487 == arg0.aClass132_Sub1_Sub1_Sub1_4.method20035(785257419) ? 1 : 0;
	}

	@OriginalMember(owner = "client!cj", name = "ud", descriptor = "(Lclient!yf;B)V")
	static void method2591(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 2013134692);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4036 * -1566573331;
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "(Lclient!nr;Lclient!aav;B)Lclient!akl;")
	public static Class93_Sub22 method2592(@OriginalArg(0) Class446 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) Class93_Sub22 local2 = Class527.method30572(1355424345);
		local2.aClass446_1 = arg0;
		local2.anInt1570 = arg0.anInt5113 * -84230039;
		if (local2.anInt1570 * -702266491 == -1) {
			local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(260);
		} else if (local2.anInt1570 * -702266491 == -2) {
			local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(10000);
		} else if (local2.anInt1570 * -702266491 <= 18) {
			local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(20);
		} else if (local2.anInt1570 * -702266491 <= 98) {
			local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(100);
		} else {
			local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(260);
		}
		local2.aClass93_Sub41_Sub2_1.method22684(arg1, (byte) -28);
		local2.aClass93_Sub41_Sub2_1.method22673(local2.aClass446_1.anInt5112 * -1222765451, -1213648128);
		local2.anInt1569 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	Class102() {
	}
}