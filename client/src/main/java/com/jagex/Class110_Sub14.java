package com.jagex;

import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agk")
public final class Class110_Sub14 extends Class110 {

	@OriginalMember(owner = "client!agk", name = "ae", descriptor = "[Lclient!cm;")
	public static Class100[] aClass100Array4;

	@OriginalMember(owner = "client!agk", name = "n", descriptor = "I")
	final int anInt955;

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "[I")
	final int[] anIntArray83;

	@OriginalMember(owner = "client!agk", name = "m", descriptor = "I")
	final int anInt953;

	@OriginalMember(owner = "client!agk", name = "k", descriptor = "I")
	final int anInt954;

	@OriginalMember(owner = "client!agk", name = "vr", descriptor = "(Lclient!yf;I)V")
	static void method8051(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 612605750);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.method25250(local16).method13620((short) 1426);
	}

	@OriginalMember(owner = "client!agk", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub14(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt955 = arg0.method22427(-1434290800) * -1039422713;
		this.anIntArray83 = new int[4];
		this.anInt953 = arg0.method22448(-1410250426) * 519064321;
		Arrays.fill(this.anIntArray83, 0, this.anIntArray83.length, this.anInt953 * -1542933247);
		this.anInt954 = arg0.method22431(-118643075) * -1990374291;
	}

	@OriginalMember(owner = "client!agk", name = "w", descriptor = "()Z")
	@Override
	boolean method20153() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt953 * -1542933247, 801450270);
		return local8.method26287((byte) -37);
	}

	@OriginalMember(owner = "client!agk", name = "k", descriptor = "(I)Z")
	@Override
	boolean method20151(@OriginalArg(0) int arg0) {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt953 * -1542933247, 1722237017);
		return local8.method26287((byte) -119);
	}

	@OriginalMember(owner = "client!agk", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt955 * 1568395959].method25900(-2058124491);
		if (this.anInt954 * -1738891931 == 0) {
			Class623.method32329(local8, this.anIntArray83, 0, false, 1736878199);
		} else {
			Class133_Sub1.method10077(local8, new int[] { this.anInt953 * -1542933247 }, new int[] { 0 }, new int[] { this.anInt954 * -1738891931 }, (short) 355);
		}
	}

	@OriginalMember(owner = "client!agk", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt955 * 1568395959].method25900(-1100475246);
		if (this.anInt954 * -1738891931 == 0) {
			Class623.method32329(local8, this.anIntArray83, 0, false, 382834664);
		} else {
			Class133_Sub1.method10077(local8, new int[] { this.anInt953 * -1542933247 }, new int[] { 0 }, new int[] { this.anInt954 * -1738891931 }, (short) 98);
		}
	}

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "()Z")
	@Override
	boolean method20154() {
		@Pc(8) Class263 local8 = (Class263) Class32.aClass32_Sub17_23.method18273(this.anInt953 * -1542933247, -1289167082);
		return local8.method26287((byte) -87);
	}
}