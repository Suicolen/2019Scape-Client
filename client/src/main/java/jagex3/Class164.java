package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yc")
public abstract class Class164 implements Interface4 {

	@OriginalMember(owner = "client!yc", name = "m", descriptor = "I")
	int anInt2017;

	@OriginalMember(owner = "client!yc", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_39 = new Class240(60);

	@OriginalMember(owner = "client!yc", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_58;

	@OriginalMember(owner = "client!yc", name = "r", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I")
	public static int method15297(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(19) int[] local19 = new int[local2 + 1];
			@Pc(24) int[] local24 = new int[local2 + 1];
			@Pc(26) int local26 = 0;
			while (local26 <= local2) {
				local19[local26] = local26++;
			}
			for (local26 = 1; local26 <= local5; local26++) {
				local24[0] = local26;
				@Pc(50) char local50 = arg1.charAt(local26 - 1);
				for (@Pc(52) int local52 = 1; local52 <= local2; local52++) {
					local24[local52] = Math.min(Math.min(local24[local52 - 1] + 1, local19[local52] + 1), local19[local52 - 1] + (arg0.charAt(local52 - 1) == local50 ? 0 : 1));
				}
				@Pc(92) int[] local92 = local19;
				local19 = local24;
				local24 = local92;
			}
			return local19[local2];
		}
	}

	@OriginalMember(owner = "client!yc", name = "gc", descriptor = "(I)V")
	public static void method15298(@OriginalArg(0) int arg0) {
		if (!client.aBoolean633) {
			client.aFloat254 += (24.0F - client.aFloat254) / 2.0F;
			client.aBoolean621 = true;
			client.aBoolean633 = true;
		}
	}

	@OriginalMember(owner = "client!yc", name = "wh", descriptor = "(Lclient!yf;I)V")
	static void method15299(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.method18273(local12, 428702843)).anInt316 * 820091969;
	}

	@OriginalMember(owner = "client!yc", name = "<init>", descriptor = "(Lclient!py;)V")
	Class164(@OriginalArg(0) Class497 arg0) {
		this.aClass497_58 = arg0;
	}

	@OriginalMember(owner = "client!yc", name = "l", descriptor = "(I)V")
	final void method15281(@OriginalArg(0) int arg0) {
		this.anInt2017 = arg0 * 702484223;
		@Pc(8) Class240 local8 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -105);
		}
	}

	@OriginalMember(owner = "client!yc", name = "b", descriptor = "()V")
	final void method15282() {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!yc", name = "m", descriptor = "(IB)V")
	final void method15283(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25925(arg0, (byte) -23);
		}
	}

	@OriginalMember(owner = "client!yc", name = "k", descriptor = "(I)V")
	final void method15284(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!yc", name = "f", descriptor = "(I)V")
	final void method15285(@OriginalArg(0) int arg0) {
		this.anInt2017 = arg0 * 702484223;
		@Pc(8) Class240 local8 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -77);
		}
	}

	@OriginalMember(owner = "client!yc", name = "w", descriptor = "(I)V")
	final void method15286(@OriginalArg(0) int arg0) {
		this.anInt2017 = arg0 * 702484223;
		@Pc(8) Class240 local8 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -104);
		}
	}

	@OriginalMember(owner = "client!yc", name = "d", descriptor = "(I)V")
	final void method15287(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25925(arg0, (byte) -90);
		}
	}

	@OriginalMember(owner = "client!yc", name = "u", descriptor = "(I)V")
	final void method15288(@OriginalArg(0) int arg0) {
		this.anInt2017 = arg0 * 702484223;
		@Pc(8) Class240 local8 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -53);
		}
	}

	@OriginalMember(owner = "client!yc", name = "z", descriptor = "()V")
	final void method15289() {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -104);
		}
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "()V")
	final void method15290() {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -15);
		}
	}

	@OriginalMember(owner = "client!yc", name = "a", descriptor = "()V")
	final void method15291() {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "(I)V")
	final void method15292(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25925(arg0, (byte) -50);
		}
	}

	@OriginalMember(owner = "client!yc", name = "r", descriptor = "(I)V")
	final void method15293(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25925(arg0, (byte) -49);
		}
	}

	@OriginalMember(owner = "client!yc", name = "e", descriptor = "(II)V")
	final void method15294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2017 = arg0 * 702484223;
		@Pc(8) Class240 local8 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -39);
		}
	}

	@OriginalMember(owner = "client!yc", name = "h", descriptor = "()V")
	final void method15295() {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!yc", name = "n", descriptor = "(B)V")
	final void method15296(@OriginalArg(0) byte arg0) {
		@Pc(3) Class240 local3 = this.aClass240_39;
		synchronized (this.aClass240_39) {
			this.aClass240_39.method25926((byte) -11);
		}
	}
}