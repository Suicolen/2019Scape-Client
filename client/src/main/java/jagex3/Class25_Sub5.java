package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anw")
public final class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!anw", name = "k", descriptor = "Z")
	boolean aBoolean368;

	@OriginalMember(owner = "client!anw", name = "n", descriptor = "Lclient!jn;")
	Interface29 anInterface29_2;

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "Lclient!ox;")
	final Class472 aClass472_52 = new Class472();

	@OriginalMember(owner = "client!anw", name = "f", descriptor = "Lclient!ox;")
	final Class472 aClass472_53 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anw", name = "w", descriptor = "Lclient!ox;")
	final Class472 aClass472_51 = new Class472(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!anw", name = "l", descriptor = "Lclient!ox;")
	final Class472 aClass472_54 = new Class472();

	@OriginalMember(owner = "client!anw", name = "acs", descriptor = "(Lclient!yf;I)V")
	static void method16499(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		Class144.method11179(local13, local28, (byte) 11);
	}

	@OriginalMember(owner = "client!anw", name = "azc", descriptor = "(Lclient!yf;I)V")
	static void method16500(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15874((byte) 27) ? 1 : 0;
	}

	@OriginalMember(owner = "client!anw", name = "<init>", descriptor = "(Lclient!je;)V")
	public Class25_Sub5(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anw", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V")
	@Override
	public void method23138(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(5) Class472 local5 = Class472.method29711(this.aClass123_16.method8957(-1719464790));
		local5.aFloat325 -= arg2;
		local5.aFloat327 -= arg3;
		local5.aFloat326 *= -1.0F;
		@Pc(29) Class472 local29 = this.method23132(-1393426412);
		local29.aFloat325 -= arg2;
		local29.aFloat327 -= arg3;
		local29.aFloat326 *= -1.0F;
		arg1.method29549((double) local5.aFloat325, (double) local5.aFloat326, (double) local5.aFloat327, (double) local29.aFloat325, (double) local29.aFloat326, (double) local29.aFloat327, 0.0F, 1.0F, 0.0F);
		local5.method29713();
		local29.method29713();
	}

	@OriginalMember(owner = "client!anw", name = "l", descriptor = "(F)V")
	@Override
	public void method23140(@OriginalArg(0) float arg0) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29719(this.anInterface29_2.method19950((byte) 35).method13870(-401610637));
			this.aClass123_16.method9050(false, arg0, this.aClass472_53, this.aClass123_16.method8964(1750744935), this.aClass472_51, this.aClass472_54, (byte) -88);
		}
	}

	@OriginalMember(owner = "client!anw", name = "x", descriptor = "(I)V")
	public void method16484(@OriginalArg(0) int arg0) {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-1543105430).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "e", descriptor = "(FB)V")
	@Override
	public void method23130(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29719(this.anInterface29_2.method19950((byte) 45).method13870(-1418517391));
			this.aClass123_16.method9050(false, arg0, this.aClass472_53, this.aClass123_16.method8964(2101651103), this.aClass472_51, this.aClass472_54, (byte) -12);
		}
	}

	@OriginalMember(owner = "client!anw", name = "n", descriptor = "(I)Z")
	@Override
	public boolean method23144(@OriginalArg(0) int arg0) {
		return !Float.isNaN(this.aClass472_53.aFloat325);
	}

	@OriginalMember(owner = "client!anw", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V")
	@Override
	public void method23135(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) byte arg5) {
		@Pc(5) Class472 local5 = Class472.method29711(this.aClass123_16.method8957(-446994613));
		local5.aFloat325 -= arg2;
		local5.aFloat327 -= arg3;
		local5.aFloat326 *= -1.0F;
		@Pc(29) Class472 local29 = this.method23132(-290218276);
		local29.aFloat325 -= arg2;
		local29.aFloat327 -= arg3;
		local29.aFloat326 *= -1.0F;
		arg1.method29549((double) local5.aFloat325, (double) local5.aFloat326, (double) local5.aFloat327, (double) local29.aFloat325, (double) local29.aFloat326, (double) local29.aFloat327, 0.0F, 1.0F, 0.0F);
		local5.method29713();
		local29.method29713();
	}

	@OriginalMember(owner = "client!anw", name = "m", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23132(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_53);
		@Pc(7) Class472 local7 = Class472.method29711(this.aClass472_52);
		if (this.aBoolean368) {
			local7.method29753(this.anInterface29_2.method19951(65535));
		}
		local3.method29724(local7);
		local7.method29713();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "k", descriptor = "(I)Lclient!ox;")
	@Override
	public Class472 method23134(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29711(this.aClass472_52);
		if (this.aBoolean368) {
			local7.method29753(this.anInterface29_2.method19951(65535));
		}
		local3.method29724(local7);
		local7.method29713();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "q", descriptor = "(Lclient!jn;Lclient!ox;ZI)V")
	public void method16485(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29719(arg1);
		this.aBoolean368 = arg2;
		arg0.method19950((byte) 65);
	}

	@OriginalMember(owner = "client!anw", name = "w", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method23131(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2127878358);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method8940(-1921359625).method36886(local5, local9, (byte) 32);
		this.aClass472_52.method29717(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean368 = true;
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "ai", descriptor = "()Lclient!ox;")
	public Class472 method16486() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "u", descriptor = "(F)V")
	@Override
	public void method23136(@OriginalArg(0) float arg0) {
		if (this.anInterface29_2 != null) {
			this.aClass472_51.method29719(this.anInterface29_2.method19950((byte) 24).method13870(553862716));
			this.aClass123_16.method9050(false, arg0, this.aClass472_53, this.aClass123_16.method8964(1216027066), this.aClass472_51, this.aClass472_54, (byte) 17);
		}
	}

	@OriginalMember(owner = "client!anw", name = "z", descriptor = "()Z")
	@Override
	public boolean method23137() {
		return !Float.isNaN(this.aClass472_53.aFloat325);
	}

	@OriginalMember(owner = "client!anw", name = "v", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23142(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2046023789);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method8940(-1636717958).method36886(local5, local9, (byte) 32);
		this.aClass472_52.method29717(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean368 = true;
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "c", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23133(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2004967171);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method8940(-1606557995).method36886(local5, local9, (byte) 32);
		this.aClass472_52.method29717(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean368 = true;
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "ag", descriptor = "()V")
	public void method16487() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-1692104186).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "r", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23141(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2065185880);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method8940(-1608360168).method36886(local5, local9, (byte) 32);
		this.aClass472_52.method29717(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean368 = true;
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "b", descriptor = "(I)Lclient!ox;")
	public Class472 method16488(@OriginalArg(0) int arg0) {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "o", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23143(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(5) Class363 local5 = Class90.method1601(arg0.method22425((short) 16384), -2019436694);
		@Pc(9) int local9 = arg0.method22427(-1434290800);
		this.anInterface29_2 = this.aClass123_16.method8940(-1782321774).method36886(local5, local9, (byte) 32);
		this.aClass472_52.method29717(arg0);
		if (arg0.method22425((short) 16384) == 1) {
			this.aBoolean368 = true;
		} else {
			this.aBoolean368 = false;
		}
	}

	@OriginalMember(owner = "client!anw", name = "s", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23129() {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29711(this.aClass472_52);
		if (this.aBoolean368) {
			local7.method29753(this.anInterface29_2.method19951(65535));
		}
		local3.method29724(local7);
		local7.method29713();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "al", descriptor = "()Lclient!ox;")
	public Class472 method16489() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "h", descriptor = "(Lclient!jn;Lclient!ox;Z)V")
	public void method16490(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29719(arg1);
		this.aBoolean368 = arg2;
		arg0.method19950((byte) 96);
	}

	@OriginalMember(owner = "client!anw", name = "a", descriptor = "(Lclient!jn;Lclient!ox;Z)V")
	public void method16491(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29719(arg1);
		this.aBoolean368 = arg2;
		arg0.method19950((byte) 91);
	}

	@OriginalMember(owner = "client!anw", name = "g", descriptor = "(Lclient!jn;Lclient!ox;Z)V")
	public void method16492(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29719(arg1);
		this.aBoolean368 = arg2;
		arg0.method19950((byte) 114);
	}

	@OriginalMember(owner = "client!anw", name = "d", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23139() {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_53);
		@Pc(7) Class472 local7 = Class472.method29711(this.aClass472_52);
		if (this.aBoolean368) {
			local7.method29753(this.anInterface29_2.method19951(65535));
		}
		local3.method29724(local7);
		local7.method29713();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "j", descriptor = "()V")
	public void method16493() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-1844885721).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "t", descriptor = "()V")
	public void method16494() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-1707053059).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "y", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method23145() {
		@Pc(3) Class472 local3 = Class472.method29711(this.aClass472_51);
		@Pc(7) Class472 local7 = Class472.method29711(this.aClass472_52);
		if (this.aBoolean368) {
			local7.method29753(this.anInterface29_2.method19951(65535));
		}
		local3.method29724(local7);
		local7.method29713();
		return local3;
	}

	@OriginalMember(owner = "client!anw", name = "ae", descriptor = "()V")
	public void method16495() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-1789369804).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}

	@OriginalMember(owner = "client!anw", name = "i", descriptor = "(Lclient!jn;Lclient!ox;Z)V")
	public void method16496(@OriginalArg(0) Interface29 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) boolean arg2) {
		this.anInterface29_2 = arg0;
		this.aClass472_52.method29719(arg1);
		this.aBoolean368 = arg2;
		arg0.method19950((byte) 62);
	}

	@OriginalMember(owner = "client!anw", name = "ac", descriptor = "()Lclient!ox;")
	public Class472 method16497() {
		return this.aClass472_53;
	}

	@OriginalMember(owner = "client!anw", name = "ah", descriptor = "()V")
	public void method16498() {
		if (this.anInterface29_2 != null) {
			this.anInterface29_2 = this.aClass123_16.method8940(-2045939413).method36886(this.anInterface29_2.method19958(65280), this.anInterface29_2.method19953(230905611), (byte) 32);
		}
	}
}