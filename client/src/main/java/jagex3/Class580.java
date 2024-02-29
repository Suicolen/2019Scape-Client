package jagex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class580 {

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	int anInt5573;

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
	int anInt5574;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ts", name = "this$0", descriptor = "Lclient!aiz;")
	final Class146_Sub2 aClass146_Sub2_3;

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
	int anInt5575;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	int anInt5577;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "Ljava/util/List;")
	List aList23;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "F")
	float aFloat343;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "[B")
	byte[] aByteArray105;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "[B")
	byte[] aByteArray104;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
	int anInt5576;

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Z")
	boolean aBoolean825;

	@OriginalMember(owner = "client!ts", name = "gl", descriptor = "(Lclient!yf;B)V")
	static void method31566(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class35.method686(local11, local14, arg0, 1580790519);
	}

	@OriginalMember(owner = "client!ts", name = "aah", descriptor = "(Lclient!yf;S)V")
	static void method31567(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27663(0, -1614681388)) || local13.startsWith(Class346.method27663(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class476.method29868(local13, (byte) 118) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "(IIB)I")
	static int method31568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return local7 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!ts", name = "bdo", descriptor = "(Lclient!yf;B)V")
	static void method31569(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26371(local13, -1111851480).method26469(local23, 310789150) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ts", name = "ah", descriptor = "(B)J")
	static long method31570(@OriginalArg(0) byte arg0) {
		return Class553.aClass147_2.method12701(1406007506);
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!aiz;FI)V")
	Class580(@OriginalArg(0) Class146_Sub2 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aClass146_Sub2_3 = arg0;
		this.anInt5575 = 1345597808;
		this.anInt5577 = -933045362;
		this.aList23 = new ArrayList();
		if (!this.aBoolean825) {
			this.aFloat343 = arg1;
			if (this.anInt5575 * 1007690919 > 16) {
				throw new RuntimeException("");
			}
			try {
				@Pc(49) AudioFormat local49 = new AudioFormat(this.aFloat343, this.anInt5575 * 1007690919, this.anInt5577 * 1187791863, true, false);
				try {
					@Pc(56) Info local56 = new Info(SourceDataLine.class, local49, arg2);
					this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local56);
				} catch (@Pc(63) IllegalArgumentException local63) {
					return;
				}
				this.aSourceDataLine1.open(local49, arg2);
				this.aSourceDataLine1.start();
			} catch (@Pc(74) LineUnavailableException local74) {
				return;
			}
			this.aByteArray105 = new byte[arg2];
			this.aByteArray104 = new byte[this.anInt5575 * 1007690919 / 8];
			this.anInt5576 = 0;
			this.aBoolean825 = true;
		}
	}

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "()V")
	void method31555() {
		if (this.aBoolean825 && this.aSourceDataLine1 != null) {
			this.anInt5574 = this.aSourceDataLine1.available() * -778815923;
		}
	}

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	void method31556(@OriginalArg(0) int arg0) {
		if (this.aBoolean825 && this.aSourceDataLine1 != null) {
			this.anInt5574 = this.aSourceDataLine1.available() * -778815923;
		}
	}

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "(I)V")
	void method31557(@OriginalArg(0) int arg0) {
		this.anInt5573 = 0;
		this.method31558(1640788014);
		while (this.anInt5573 * 1527836441 > 0) {
			@Pc(15) int local15 = this.anInt5573 * 1527836441;
			if (local15 + this.anInt5576 * 1422566599 >= this.aByteArray105.length) {
				local15 = this.aByteArray105.length - this.anInt5576 * 1422566599;
			}
			this.aSourceDataLine1.write(this.aByteArray105, this.anInt5576 * 1422566599, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray105[this.anInt5576 * 1422566599 + local47] = 0;
			}
			this.anInt5576 += local15 * -31400713;
			this.anInt5576 = this.anInt5576 * 1422566599 % this.aByteArray105.length * -31400713;
			this.anInt5573 -= local15 * -475071191;
		}
	}

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "(I)V")
	void method31558(@OriginalArg(0) int arg0) {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt5575 * 1007690919 / 8 * 1187791863 * this.anInt5577);
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList23.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class570 local31 = (Class570) local24.next();
				@Pc(40) int local40 = local31.aByteArray101.length - local31.anInt5554 * 46530583;
				if (local31.aFloat342 != this.aFloat343) {
					local40 = (int) ((float) local40 * (this.aFloat343 / local31.aFloat342));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt5555 = local40 * 1281210275;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt5574 * 148370053) {
				local5 = this.anInt5574 * 148370053;
			}
			if (local5 != 0 && local20) {
				@Pc(105) int local105 = this.anInt5575 * 1007690919 / 8;
				@Pc(109) Iterator local109 = this.aList23.iterator();
				while (true) {
					@Pc(116) Class570 local116;
					do {
						if (!local109.hasNext()) {
							this.anInt5573 = local5 * -475071191;
							return;
						}
						local116 = (Class570) local109.next();
					} while (local116.anInt5555 * 1902392331 < local5);
					@Pc(128) int local128 = this.anInt5576 * 1422566599;
					@Pc(130) int local130 = 0;
					@Pc(137) int local137 = local116.anInt5553 * 1663581913 / 8;
					@Pc(139) double local139 = 0.0D;
					@Pc(141) int local141 = 0;
					@Pc(145) double local145 = (double) this.aFloat343;
					@Pc(149) double local149 = (double) local116.aFloat342;
					@Pc(154) int local154 = local116.anInt5557 * 1471181545;
					while (local116.anInt5555 * 1902392331 > 0 && local130 < local5) {
						@Pc(164) short local164 = 0;
						@Pc(166) short local166 = 0;
						@Pc(169) byte[] local169 = this.aByteArray104;
						for (@Pc(171) int local171 = 0; local171 < local169.length; local171++) {
							local169[local171] = this.aByteArray105[local171 + local128];
							local164 = (short) (local164 | (local169[local171] & 0xFF) << local171 * 8);
						}
						@Pc(208) byte[] local208;
						if (local116.aFloat342 == this.aFloat343) {
							local208 = local116.aByteArray102;
							for (@Pc(395) int local395 = 0; local395 < local208.length; local395++) {
								local208[local395] = local116.aByteArray101[local395 + local116.anInt5557 * 1471181545];
								local166 = (short) (local166 | (local208[local395] & 0xFF) << local395 * 8);
							}
							local116.anInt5557 += local137 * 1563264345;
							local116.anInt5557 = local116.anInt5557 * 1471181545 % local116.aByteArray101.length * 1563264345;
							local116.anInt5554 += local137 * -1185466457;
						} else {
							local208 = local116.aByteArray102;
							@Pc(215) float local215 = (float) (local149 * (local139 / local145));
							@Pc(220) float local220 = (float) Math.floor((double) local215);
							@Pc(222) short local222 = 0;
							@Pc(224) short local224 = 0;
							@Pc(229) int local229 = (int) Math.floor((double) local215);
							@Pc(234) int local234 = (int) Math.ceil((double) local215);
							@Pc(249) int local249 = local208.length * local141 + local208.length * local116.anInt5556 * -152337559 * local229;
							@Pc(264) int local264 = local234 * local116.anInt5556 * -152337559 * local208.length + local141 * local208.length;
							@Pc(268) int local268 = local249 + local154;
							@Pc(272) int local272 = local264 + local154;
							@Pc(278) int local278 = local268 % local116.aByteArray101.length;
							@Pc(284) int local284 = local272 % local116.aByteArray101.length;
							@Pc(286) int local286;
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray101[local286 + local278];
								local222 = (short) (local222 | (local208[local286] & 0xFF) << local286 * 8);
							}
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray101[local284 + local286];
								local224 = (short) (local224 | (local208[local286] & 0xFF) << local286 * 8);
							}
							@Pc(348) float local348 = local215 - local220;
							if (local348 < 0.0F || local348 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(366) float local366 = (float) (local224 - local222);
							local166 = (short) ((float) local222 + local348 * local366);
							local141++;
							local141 %= local116.anInt5556 * -152337559;
							if (local141 == 0) {
								local139++;
							}
						}
						local166 += local164;
						if (local166 > 32767) {
							local166 = 32767;
						}
						if (local166 < -32768) {
							local166 = -32768;
						}
						this.aByteArray105[local128] = (byte) local166;
						this.aByteArray105[local128 + 1] = (byte) (local166 >> 8);
						local128 += local105;
						local128 %= this.aByteArray105.length;
						local130 += local137;
					}
					if (local116.aFloat342 != this.aFloat343) {
						@Pc(515) double local515 = (double) local5 * (local149 / local145);
						@Pc(523) int local523 = (int) (local18 * Math.ceil(local515 / local18));
						local116.anInt5557 += local523 * 1563264345;
						local116.anInt5557 = local116.anInt5557 * 1471181545 % local116.aByteArray101.length * 1563264345;
						local116.anInt5554 += local523 * -1185466457;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "(Lclient!th;B)V")
	void method31559(@OriginalArg(0) Class570 arg0, @OriginalArg(1) byte arg1) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(Lclient!th;I)V")
	void method31560(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1) {
		this.aList23.remove(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "()V")
	void method31561() {
		if (this.aBoolean825 && this.aSourceDataLine1 != null) {
			this.anInt5574 = this.aSourceDataLine1.available() * -778815923;
		}
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(Lclient!th;)V")
	void method31562(@OriginalArg(0) Class570 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "()V")
	void method31563() {
		this.anInt5573 = 0;
		this.method31558(90770131);
		while (this.anInt5573 * 1527836441 > 0) {
			@Pc(15) int local15 = this.anInt5573 * 1527836441;
			if (local15 + this.anInt5576 * 1422566599 >= this.aByteArray105.length) {
				local15 = this.aByteArray105.length - this.anInt5576 * 1422566599;
			}
			this.aSourceDataLine1.write(this.aByteArray105, this.anInt5576 * 1422566599, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray105[this.anInt5576 * 1422566599 + local47] = 0;
			}
			this.anInt5576 += local15 * -31400713;
			this.anInt5576 = this.anInt5576 * 1422566599 % this.aByteArray105.length * -31400713;
			this.anInt5573 -= local15 * -475071191;
		}
	}

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "()V")
	void method31564() {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt5575 * 1007690919 / 8 * 1187791863 * this.anInt5577);
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList23.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class570 local31 = (Class570) local24.next();
				@Pc(40) int local40 = local31.aByteArray101.length - local31.anInt5554 * 46530583;
				if (local31.aFloat342 != this.aFloat343) {
					local40 = (int) ((float) local40 * (this.aFloat343 / local31.aFloat342));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt5555 = local40 * 1281210275;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt5574 * 148370053) {
				local5 = this.anInt5574 * 148370053;
			}
			if (local5 != 0 && local20) {
				@Pc(105) int local105 = this.anInt5575 * 1007690919 / 8;
				@Pc(109) Iterator local109 = this.aList23.iterator();
				while (true) {
					@Pc(116) Class570 local116;
					do {
						if (!local109.hasNext()) {
							this.anInt5573 = local5 * -475071191;
							return;
						}
						local116 = (Class570) local109.next();
					} while (local116.anInt5555 * 1902392331 < local5);
					@Pc(128) int local128 = this.anInt5576 * 1422566599;
					@Pc(130) int local130 = 0;
					@Pc(137) int local137 = local116.anInt5553 * 1663581913 / 8;
					@Pc(139) double local139 = 0.0D;
					@Pc(141) int local141 = 0;
					@Pc(145) double local145 = (double) this.aFloat343;
					@Pc(149) double local149 = (double) local116.aFloat342;
					@Pc(154) int local154 = local116.anInt5557 * 1471181545;
					while (local116.anInt5555 * 1902392331 > 0 && local130 < local5) {
						@Pc(164) short local164 = 0;
						@Pc(166) short local166 = 0;
						@Pc(169) byte[] local169 = this.aByteArray104;
						for (@Pc(171) int local171 = 0; local171 < local169.length; local171++) {
							local169[local171] = this.aByteArray105[local171 + local128];
							local164 = (short) (local164 | (local169[local171] & 0xFF) << local171 * 8);
						}
						@Pc(208) byte[] local208;
						if (local116.aFloat342 == this.aFloat343) {
							local208 = local116.aByteArray102;
							for (@Pc(395) int local395 = 0; local395 < local208.length; local395++) {
								local208[local395] = local116.aByteArray101[local395 + local116.anInt5557 * 1471181545];
								local166 = (short) (local166 | (local208[local395] & 0xFF) << local395 * 8);
							}
							local116.anInt5557 += local137 * 1563264345;
							local116.anInt5557 = local116.anInt5557 * 1471181545 % local116.aByteArray101.length * 1563264345;
							local116.anInt5554 += local137 * -1185466457;
						} else {
							local208 = local116.aByteArray102;
							@Pc(215) float local215 = (float) (local149 * (local139 / local145));
							@Pc(220) float local220 = (float) Math.floor((double) local215);
							@Pc(222) short local222 = 0;
							@Pc(224) short local224 = 0;
							@Pc(229) int local229 = (int) Math.floor((double) local215);
							@Pc(234) int local234 = (int) Math.ceil((double) local215);
							@Pc(249) int local249 = local208.length * local141 + local208.length * local116.anInt5556 * -152337559 * local229;
							@Pc(264) int local264 = local234 * local116.anInt5556 * -152337559 * local208.length + local141 * local208.length;
							@Pc(268) int local268 = local249 + local154;
							@Pc(272) int local272 = local264 + local154;
							@Pc(278) int local278 = local268 % local116.aByteArray101.length;
							@Pc(284) int local284 = local272 % local116.aByteArray101.length;
							@Pc(286) int local286;
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray101[local286 + local278];
								local222 = (short) (local222 | (local208[local286] & 0xFF) << local286 * 8);
							}
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray101[local284 + local286];
								local224 = (short) (local224 | (local208[local286] & 0xFF) << local286 * 8);
							}
							@Pc(348) float local348 = local215 - local220;
							if (local348 < 0.0F || local348 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(366) float local366 = (float) (local224 - local222);
							local166 = (short) ((float) local222 + local348 * local366);
							local141++;
							local141 %= local116.anInt5556 * -152337559;
							if (local141 == 0) {
								local139++;
							}
						}
						local166 += local164;
						if (local166 > 32767) {
							local166 = 32767;
						}
						if (local166 < -32768) {
							local166 = -32768;
						}
						this.aByteArray105[local128] = (byte) local166;
						this.aByteArray105[local128 + 1] = (byte) (local166 >> 8);
						local128 += local105;
						local128 %= this.aByteArray105.length;
						local130 += local137;
					}
					if (local116.aFloat342 != this.aFloat343) {
						@Pc(515) double local515 = (double) local5 * (local149 / local145);
						@Pc(523) int local523 = (int) (local18 * Math.ceil(local515 / local18));
						local116.anInt5557 += local523 * 1563264345;
						local116.anInt5557 = local116.anInt5557 * 1471181545 % local116.aByteArray101.length * 1563264345;
						local116.anInt5554 += local523 * -1185466457;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "(Lclient!th;)V")
	void method31565(@OriginalArg(0) Class570 arg0) {
		this.aList23.add(arg0);
	}
}