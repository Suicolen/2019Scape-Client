package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
final class Class260 implements Interface58 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fd", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_3;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "(I)V")
	public static void method26246(@OriginalArg(0) int arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1, (byte) 39);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1, (byte) 75);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1, (byte) 70);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1, (byte) 121);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0, (byte) 84);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0, (byte) 10);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0, (byte) 93);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0, (byte) 85);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0, (byte) 59);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0, (byte) 59);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0, (byte) 112);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0, (byte) 96);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0, (byte) 103);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0, (byte) 75);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0, (byte) 11);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4188 * 595334117, (byte) 67);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0, (byte) 72);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20577() && Class694.aClass104_14.method20553()) {
			Class694.aClass104_14.method20584();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0, (byte) 121);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0, (byte) 99);
		Class386.method28416((byte) 5);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2, (byte) 95);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 2, (byte) 46);
		Class610.method32202(286513806);
		client.aClass532_1.method30713((byte) 79).method33184(-51699213);
		client.aBoolean611 = true;
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(IIII)I")
	public static int method26247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!fd", name = "bdk", descriptor = "(Lclient!yf;I)V")
	static void method26248(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fd", name = "ja", descriptor = "(Lclient!yf;I)V")
	static void method26249(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!fd", name = "lv", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method26250(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3444 * 862418793; local5++) {
			if (arg0.equalsIgnoreCase(client.aClass281Array1[local5].aString159)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(IB)Lclient!ib;")
	public static Class332 method26251(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class332[] local2 = Class25_Sub1.method16007(-15550298);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class332 local12 = local2[local4];
			if (local12.anInt4188 * 595334117 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fd", name = "aui", descriptor = "(Lclient!yf;I)V")
	static void method26252(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15877(1045625469);
	}

	@OriginalMember(owner = "client!fd", name = "als", descriptor = "(Lclient!yf;I)V")
	static void method26253(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class159.aClass93_Sub1_Sub20_2 == null ? -1 : Class159.aClass93_Sub1_Sub20_2.anInt3168 * 937363209;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class260(@OriginalArg(0) Class258 arg0) {
		this.aClass258_3 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	@Override
	public void method26443(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) -3064);
		@Pc(10) float local10 = local2.method31028(-1910177998);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(19) Class472 local19 = this.aClass258_3.method26123(-1778975888);
		@Pc(23) Class472 local23 = Class472.method29755(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29746();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat325 > local6.aFloat325 - local45 / 2.0F && local19.aFloat325 < local6.aFloat325 + local45 / 2.0F && local19.aFloat327 > local6.aFloat327 - local51 / 2.0F && local19.aFloat327 < local51 / 2.0F + local6.aFloat327) {
				local102 = Math.abs(local19.aFloat325 - (local6.aFloat325 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat325 - (local6.aFloat325 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat327 - (local6.aFloat325 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat327 - (local6.aFloat325 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
				@Pc(227) int local227;
				if (Class429.anInt4942 * -1453926679 == 3) {
					local102 = Class65.aClass123_Sub1_2.method8962((byte) -99);
					if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = (16384 - local240 >> 1) + local240 * local227 / 8192;
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local295 * local227 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26444(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) -6079);
		@Pc(10) float local10 = local2.method31028(1481058266);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(19) Class472 local19 = this.aClass258_3.method26123(-877387327);
		@Pc(23) Class472 local23 = Class472.method29755(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29746();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat325 > local6.aFloat325 - local45 / 2.0F && local19.aFloat325 < local6.aFloat325 + local45 / 2.0F && local19.aFloat327 > local6.aFloat327 - local51 / 2.0F && local19.aFloat327 < local51 / 2.0F + local6.aFloat327) {
				local102 = Math.abs(local19.aFloat325 - (local6.aFloat325 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat325 - (local6.aFloat325 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat327 - (local6.aFloat325 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat327 - (local6.aFloat325 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
				@Pc(227) int local227;
				if (Class429.anInt4942 * -1453926679 == 3) {
					local102 = Class65.aClass123_Sub1_2.method8962((byte) -68);
					if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = (16384 - local240 >> 1) + local240 * local227 / 8192;
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local295 * local227 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	@Override
	public void method26445(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class539 local2 = (Class539) arg0;
		@Pc(6) Class472 local6 = local2.method30987((short) -26723);
		@Pc(10) float local10 = local2.method31028(1487184598);
		@Pc(14) float local14 = local2.method30989((byte) 1);
		@Pc(19) Class472 local19 = this.aClass258_3.method26123(-990702853);
		@Pc(23) Class472 local23 = Class472.method29755(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(27) int local27 = 8192;
		@Pc(30) float local30 = local23.method29746();
		@Pc(32) float local32 = 0.0F;
		if (local30 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(45) float local45 = (Float) arg2[0];
			@Pc(51) float local51 = (Float) arg2[1];
			@Pc(102) float local102;
			if (local19.aFloat325 > local6.aFloat325 - local45 / 2.0F && local19.aFloat325 < local6.aFloat325 + local45 / 2.0F && local19.aFloat327 > local6.aFloat327 - local51 / 2.0F && local19.aFloat327 < local51 / 2.0F + local6.aFloat327) {
				local102 = Math.abs(local19.aFloat325 - (local6.aFloat325 + local45 / 2.0F));
				@Pc(113) float local113 = Math.abs(local19.aFloat325 - (local6.aFloat325 - local45 / 2.0F));
				@Pc(124) float local124 = Math.abs(local19.aFloat327 - (local6.aFloat325 + local51 / 2.0F));
				@Pc(135) float local135 = Math.abs(local19.aFloat327 - (local6.aFloat325 - local51 / 2.0F));
				@Pc(139) float local139 = local14 - local10;
				@Pc(143) float local143 = Math.min(local102, local113);
				@Pc(147) float local147 = Math.min(local124, local135);
				@Pc(153) float local153 = local143 * (1.0F / local139);
				@Pc(159) float local159 = local147 * (1.0F / local139);
				@Pc(165) float local165 = Math.min(Math.max(local153, 0.0F), 1.0F);
				@Pc(171) float local171 = Math.min(Math.max(local159, 0.0F), 1.0F);
				local25 = Math.min(local165, local171);
			}
			if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
				@Pc(227) int local227;
				if (Class429.anInt4942 * -1453926679 == 3) {
					local102 = Class65.aClass123_Sub1_2.method8962((byte) -33);
					if (local23.aFloat325 != 0.0F || local23.aFloat327 != 0.0F) {
						local227 = (int) ((double) (-1.0F * local102) * 2607.5945876176133D) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (local227 > 8192) {
							local227 = 16384 - local227;
						}
						@Pc(240) int local240;
						if (local30 <= 0.0F) {
							local240 = 8192;
						} else if (local30 >= 4096.0F) {
							local240 = 16384;
						} else {
							local240 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
						}
						local27 = (16384 - local240 >> 1) + local240 * local227 / 8192;
					}
					local32 = (float) local27 * 6.1035156E-5F;
				} else {
					@Pc(295) int local295 = -(Class24.anInt82 * -20667523) - (int) (Math.atan2((double) local23.aFloat325, (double) local23.aFloat327) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (local295 > 8192) {
						local295 = 16384 - local295;
					}
					if (local30 <= 0.0F) {
						local227 = 8192;
					} else if (local30 >= 4096.0F) {
						local227 = 16384;
					} else {
						local227 = (int) (local30 * 8192.0F / 4096.0F + 8192.0F);
					}
					local27 = (16384 - local227 >> 1) + local295 * local227 / 8192;
					local32 = (float) local27 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (local27 < 0 ? (double) local25 : (double) local25 * Math.sqrt((double) (1.0F - local32)));
		arg1[1] = (float) (local27 < 0 ? (double) -local25 : (double) local25 * Math.sqrt((double) local32));
	}
}