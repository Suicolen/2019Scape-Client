package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!age")
public final class Class110_Sub8 extends Class110 {

	@OriginalMember(owner = "client!age", name = "ko", descriptor = "I")
	public static int anInt917;

	@OriginalMember(owner = "client!age", name = "n", descriptor = "I")
	final int anInt912;

	@OriginalMember(owner = "client!age", name = "m", descriptor = "I")
	final int anInt915;

	@OriginalMember(owner = "client!age", name = "k", descriptor = "I")
	final int anInt913;

	@OriginalMember(owner = "client!age", name = "f", descriptor = "I")
	final int anInt914;

	@OriginalMember(owner = "client!age", name = "w", descriptor = "I")
	final int anInt911;

	@OriginalMember(owner = "client!age", name = "l", descriptor = "I")
	final int anInt916;

	@OriginalMember(owner = "client!age", name = "ie", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V")
	static void method7959(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg0.anInt4042 = -2003331097;
		arg0.anInt4078 = client.anInt3513 * 1786756713;
		arg0.anInt4079 = 0;
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class124_Sub3_Sub1.method19778(arg0.anInt3994 * -1549590237, 256284111);
		}
	}

	@OriginalMember(owner = "client!age", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub8(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt912 = arg0.method22427(-1434290800) * 1961320037;
		this.anInt915 = arg0.method22427(-1434290800) * -1795509975;
		this.anInt913 = arg0.method22427(-1434290800) * 567576759;
		this.anInt914 = arg0.method22427(-1434290800) * 34801743;
		this.anInt911 = arg0.method22427(-1434290800) * 2109223857;
		this.anInt916 = arg0.method22427(-1434290800) * -243407281;
	}

	@OriginalMember(owner = "client!age", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		Class249.aClass255Array1[this.anInt912 * -378461331].method26096(0, (short) -8355);
		Class249.aClass255Array1[this.anInt915 * 200702745].method26096(1, (short) -7655);
		client.anInt3486 = 0;
		client.anInt3491 = this.anInt913 * 1547891937;
		client.anInt3525 = 0;
		client.anInt3456 = this.anInt911 * -1311740245;
		client.anInt3493 = this.anInt916 * 152620609;
		client.anInt3490 = 468246877;
		client.anInt3506 = this.anInt914 * -269449439;
		Class429.anInt4942 = 911755286;
		Class631.method32464(1785470908);
		client.aBoolean615 = true;
	}

	@OriginalMember(owner = "client!age", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		Class249.aClass255Array1[this.anInt912 * -378461331].method26096(0, (short) 14344);
		Class249.aClass255Array1[this.anInt915 * 200702745].method26096(1, (short) 4295);
		client.anInt3486 = 0;
		client.anInt3491 = this.anInt913 * 1547891937;
		client.anInt3525 = 0;
		client.anInt3456 = this.anInt911 * -1311740245;
		client.anInt3493 = this.anInt916 * 152620609;
		client.anInt3490 = 468246877;
		client.anInt3506 = this.anInt914 * -269449439;
		Class429.anInt4942 = 911755286;
		Class631.method32464(1752521561);
		client.aBoolean615 = true;
	}
}