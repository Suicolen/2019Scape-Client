package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class310 implements Interface75 {

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_2 = new Class310(2, 0);

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_4 = new Class310(0, 1);

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_3 = new Class310(3, 2);

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_5 = new Class310(1, 3);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_1 = new Class310(4, 4);

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!hd;")
	public static final Class310 aClass310_6 = new Class310(5, 5);

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
	public final int anInt3990;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	final int anInt3991;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)V")
	static void method26924(@OriginalArg(0) int arg0) {
		Class1.aClass123_Sub1_1 = null;
		Class1.aBoolean1 = false;
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
	Class310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3990 = arg0 * 1717782243;
		this.anInt3991 = arg1 * -2095449769;
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt3991 * 1173750375;
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt3991 * 1173750375;
	}
}