package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afp")
public final class Class110_Sub3 extends Class110 {

	@OriginalMember(owner = "client!afp", name = "s", descriptor = "Lclient!aac;")
	static Class5 aClass5_7;

	@OriginalMember(owner = "client!afp", name = "n", descriptor = "I")
	final int anInt835;

	@OriginalMember(owner = "client!afp", name = "m", descriptor = "I")
	final int anInt834;

	@OriginalMember(owner = "client!afp", name = "k", descriptor = "I")
	final int anInt838;

	@OriginalMember(owner = "client!afp", name = "f", descriptor = "I")
	final int anInt836;

	@OriginalMember(owner = "client!afp", name = "w", descriptor = "I")
	final int anInt837;

	@OriginalMember(owner = "client!afp", name = "na", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method7101(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30329(local13, arg2, -1204439644);
	}

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub3(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt835 = arg0.method22427(-1434290800) * 25858007;
		@Pc(13) int local13 = arg0.method22431(-118643075);
		this.anInt834 = (local13 >>> 16) * -1200593097;
		this.anInt838 = (local13 & 0xFFFF) * 541750459;
		this.anInt836 = arg0.method22425((short) 16384) * 1446986663;
		this.anInt837 = arg0.method22443(-358186793) * -1126680193;
	}

	@OriginalMember(owner = "client!afp", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class249.aClass239Array1[this.anInt835 * -1364798489].method25897(this.anInt834 * 45612679, this.anInt838 * 479703155, this.anInt836 * 322253847, this.anInt837 * -2132965761, -1366563989);
	}

	@OriginalMember(owner = "client!afp", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class249.aClass239Array1[this.anInt835 * -1364798489].method25897(this.anInt834 * 45612679, this.anInt838 * 479703155, this.anInt836 * 322253847, this.anInt837 * -2132965761, -1588549366);
	}
}