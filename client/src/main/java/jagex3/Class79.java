package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public abstract class Class79 implements Interface11 {

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	protected int anInt263;

	@OriginalMember(owner = "client!aj", name = "kf", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method1453(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) int local12 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091];
		@Pc(25) int local25 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091];
		if (local25 >= 1 && local25 <= 10) {
			arg0.method26949(local25 - 1, local12, 809539046);
		}
	}

	@OriginalMember(owner = "client!aj", name = "afk", descriptor = "(Lclient!yf;I)V")
	static void method1454(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local14 + local25;
	}

	@OriginalMember(owner = "client!aj", name = "agp", descriptor = "(Lclient!yf;B)V")
	static void method1455(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(18) Class47 local18 = (Class47) Class277.aClass32_Sub12_1.method18273(local12, 1781516810);
		if (local18.anInt175 * 858499729 >= 0 && local18.anInt174 * -391282687 >= 0) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local18.anInt174 * -391282687;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "(Lclient!alw;Lclient!add;I)Lclient!abn;")
	static Class40 method1456(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22425((short) 16384);
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8, (byte) 1);
			while (true) {
				@Pc(22) int local22 = arg0.method22425((short) 16384);
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18, (byte) 1);
				if (local38 != null) {
					local4.method776(local38.anInt5253 * -1181855333, local38.anObject19, (byte) 25);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "ajc", descriptor = "(Lclient!yf;I)V")
	static void method1457(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!aj", name = "wu", descriptor = "(Lclient!yf;I)V")
	static void method1458(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		Class274.aClass258_11.method26211(arg0.anIntArray521[arg0.anInt6052 * -1497248091], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2], (byte) 0);
	}

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;I)V")
	Class79(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) int arg2) {
		this.anInt263 = arg2 * -1412221577;
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "()I")
	@Override
	public int method18275() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "(I)I")
	@Override
	public int method18274(@OriginalArg(0) int arg0) {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "()I")
	@Override
	public int method18279() {
		return this.anInt263 * -1091554233;
	}

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "()I")
	@Override
	public int method18278() {
		return this.anInt263 * -1091554233;
	}
}