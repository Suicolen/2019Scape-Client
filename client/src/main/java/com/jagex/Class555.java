package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public class Class555 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!sm;")
	public static final Class555 aClass555_3 = new Class555();

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "Lclient!sm;")
	static final Class555 aClass555_4 = new Class555();

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Lclient!sm;")
	static final Class555 aClass555_5 = new Class555();

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "(S)V", line = 80)
	static void method31053(@OriginalArg(0) short arg0) {
		Class168.anInt2444 = Class110_Sub3.aClass5_7.anInt10 * -417462789 + Class110_Sub3.aClass5_7.anInt6 * 1889873675 + 1994133274;
		Class168.anInt2441 = Class348.aClass5_14.anInt10 * -328262389 + 270365690 + Class348.aClass5_14.anInt6 * 542931227;
		Class518.aStringArray31 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class518.aStringArray31.length; local28++) {
			Class518.aStringArray31[local28] = "";
		}
		Class314.method26939(Class74.aClass74_107.method1259(Class106.lang, (byte) -29), -2030188977);
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 846)
	Class555() {
	}

	@OriginalMember(owner = "client!sm", name = "ft", descriptor = "(I)V", line = 2435)
	public static void method31054(@OriginalArg(0) int arg0) {
		if (Class125_Sub2_Sub1.aFrame1 != null) {
			return;
		}
		@Pc(7) int local7 = client.anInt3414 * 495533241;
		@Pc(11) int local11 = client.anInt3415 * -1074927711;
		@Pc(21) int local21 = client.anInt3413 * -108363597 - client.width * -1378711501 - local7;
		@Pc(31) int local31 = Class504.anInt5201 * 2090134413 - client.height * 2091353777 - local11;
		if (local7 <= 0 && local21 <= 0 && local11 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(42) Container local42 = Class504.method30196(-283088421);
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			if (local42 == Class628.aFrame2) {
				@Pc(52) Insets local52 = Class628.aFrame2.getInsets();
				local44 = local52.left;
				local46 = local52.top;
			}
			@Pc(61) Graphics local61 = local42.getGraphics();
			local61.setColor(Color.black);
			if (local7 > 0) {
				local61.fillRect(local44, local46, local7, Class504.anInt5201 * 2090134413);
			}
			if (local11 > 0) {
				local61.fillRect(local44, local46, client.anInt3413 * -108363597, local11);
			}
			if (local21 > 0) {
				local61.fillRect(client.anInt3413 * -108363597 + local44 - local21, local46, local21, Class504.anInt5201 * 2090134413);
			}
			if (local31 > 0) {
				local61.fillRect(local44, local46 + Class504.anInt5201 * 2090134413 - local31, client.anInt3413 * -108363597, local31);
			}
		} catch (@Pc(118) Exception local118) {
		}
	}
}