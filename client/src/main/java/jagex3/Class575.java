package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class575 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "B")
	byte aByte166;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "B")
	byte aByte164;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	int anInt5559;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "S")
	short aShort179;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "B")
	byte aByte165;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "[I")
	int[] anIntArray473;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[B")
	byte[] aByteArray103;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(IIIII[I[B)V")
	Class575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte166 = (byte) arg0;
		this.aByte164 = (byte) arg1;
		this.anInt5559 = arg2;
		this.aShort179 = (short) arg3;
		this.aByte165 = (byte) arg4;
		this.anIntArray473 = arg5;
		this.aByteArray103 = arg6;
	}
}