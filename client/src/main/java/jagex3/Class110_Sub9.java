package jagex3;

import java.security.SecureRandom;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agf")
public final class Class110_Sub9 extends Class110 {

	@OriginalMember(owner = "client!agf", name = "jr", descriptor = "Ljava/security/SecureRandom;")
	static SecureRandom aSecureRandom1;

	@OriginalMember(owner = "client!agf", name = "n", descriptor = "I")
	final int anInt919;

	@OriginalMember(owner = "client!agf", name = "m", descriptor = "I")
	final int anInt920;

	@OriginalMember(owner = "client!agf", name = "k", descriptor = "I")
	final int anInt921;

	@OriginalMember(owner = "client!agf", name = "f", descriptor = "I")
	final int anInt922;

	@OriginalMember(owner = "client!agf", name = "w", descriptor = "I")
	final int anInt923;

	@OriginalMember(owner = "client!agf", name = "hr", descriptor = "(Lclient!yf;I)V")
	static void method7974(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 85319042);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method188(local16, local22, true, 1, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!agf", name = "bez", descriptor = "(Lclient!yf;B)V")
	static void method7975(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -725861497;
		Class533.method30786(arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1], 1713133178);
	}

	@OriginalMember(owner = "client!agf", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub9(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt919 = arg0.method22427(-1434290800) * 1095782231;
		@Pc(13) int local13 = arg0.method22431(-118643075);
		this.anInt920 = (local13 >>> 16) * -643042539;
		this.anInt921 = (local13 & 0xFFFF) * -1307325291;
		this.anInt922 = arg0.method22425((short) 16384) * -398280083;
		this.anInt923 = arg0.method22425((short) 16384) * 1652587663;
	}

	@OriginalMember(owner = "client!agf", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class152.aClass243Array2[this.anInt919 * 801639527].method25974(this.anInt922 * -1246339227, this.anInt920 * 1929364541, this.anInt921 * -316236099, this.anInt923 * 1741759087, (byte) 0);
	}

	@OriginalMember(owner = "client!agf", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class152.aClass243Array2[this.anInt919 * 801639527].method25974(this.anInt922 * -1246339227, this.anInt920 * 1929364541, this.anInt921 * -316236099, this.anInt923 * 1741759087, (byte) 0);
	}
}