package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zi")
public final class Class706 implements Interface75 {

	@OriginalMember(owner = "client!zi", name = "e", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_9 = new Class706(7, 0);

	@OriginalMember(owner = "client!zi", name = "n", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_3 = new Class706(6, 1);

	@OriginalMember(owner = "client!zi", name = "m", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_2 = new Class706(3, 2);

	@OriginalMember(owner = "client!zi", name = "k", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_4 = new Class706(5, 3);

	@OriginalMember(owner = "client!zi", name = "f", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_5 = new Class706(0, 4);

	@OriginalMember(owner = "client!zi", name = "w", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_6 = new Class706(4, 5);

	@OriginalMember(owner = "client!zi", name = "l", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_7 = new Class706(1, 6);

	@OriginalMember(owner = "client!zi", name = "u", descriptor = "Lclient!zi;")
	public static final Class706 aClass706_8 = new Class706(2, 7);

	@OriginalMember(owner = "client!zi", name = "z", descriptor = "I")
	public final int anInt6116;

	@OriginalMember(owner = "client!zi", name = "p", descriptor = "I")
	final int anInt6117;

	@OriginalMember(owner = "client!zi", name = "f", descriptor = "()[Lclient!zi;")
	public static Class706[] method36919() {
		return new Class706[] { aClass706_3, aClass706_5, aClass706_2, aClass706_9, aClass706_8, aClass706_7, aClass706_4, aClass706_6 };
	}

	@OriginalMember(owner = "client!zi", name = "w", descriptor = "()[Lclient!zi;")
	public static Class706[] method36920() {
		return new Class706[] { aClass706_3, aClass706_5, aClass706_2, aClass706_9, aClass706_8, aClass706_7, aClass706_4, aClass706_6 };
	}

	@OriginalMember(owner = "client!zi", name = "w", descriptor = "(J)I")
	public static int method36922(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!zi", name = "<init>", descriptor = "(II)V")
	Class706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6116 = arg0 * 1258467091;
		this.anInt6117 = arg1 * -423173955;
	}

	@OriginalMember(owner = "client!zi", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt6117 * -841213291;
	}

	@OriginalMember(owner = "client!zi", name = "m", descriptor = "(I)Lclient!zi;")
	public Class706 method36918(@OriginalArg(0) int arg0) {
		switch(this.anInt6116 * -303664357) {
			case 0:
				return aClass706_9;
			case 1:
				return aClass706_2;
			case 2:
				return aClass706_4;
			case 3:
				return aClass706_7;
			case 4:
				return aClass706_3;
			case 5:
				return aClass706_8;
			case 6:
				return aClass706_6;
			case 7:
				return aClass706_5;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!zi", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt6117 * -841213291;
	}

	@OriginalMember(owner = "client!zi", name = "l", descriptor = "()Lclient!zi;")
	public Class706 method36921() {
		switch(this.anInt6116 * -303664357) {
			case 0:
				return aClass706_9;
			case 1:
				return aClass706_2;
			case 2:
				return aClass706_4;
			case 3:
				return aClass706_7;
			case 4:
				return aClass706_3;
			case 5:
				return aClass706_8;
			case 6:
				return aClass706_6;
			case 7:
				return aClass706_5;
			default:
				throw new IllegalStateException();
		}
	}
}