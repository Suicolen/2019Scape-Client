package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yw")
public class Class695 {

	@OriginalMember(owner = "client!yw", name = "e", descriptor = "Lclient!ex;")
	static Class253 aClass253_1 = new Class253(128);

	@OriginalMember(owner = "client!yw", name = "<init>", descriptor = "()V", line = 13)
	Class695() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yw", name = "f", descriptor = "()V", line = 18)
	public static void method36629() {
		aClass253_1.method25990(-464927743);
	}

	@OriginalMember(owner = "client!yw", name = "w", descriptor = "()V", line = 18)
	public static void method36630() {
		aClass253_1.method25990(-464927743);
	}

	@OriginalMember(owner = "client!yw", name = "u", descriptor = "(I)Lclient!asc;", line = 22)
	static Class93_Sub1_Sub13 method36631(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub13 local5 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class542.aClass497_129.method30064(arg0, 0, (byte) 0);
		if (local15 == null || local15.length <= 1) {
			return null;
		}
		try {
			local5 = Class113.method7408(local15, (short) 14369);
		} catch (@Pc(30) Exception local30) {
			throw new RuntimeException(local30.getMessage() + " " + arg0);
		}
		aClass253_1.method25986(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!yw", name = "l", descriptor = "(I)Lclient!asc;", line = 22)
	static Class93_Sub1_Sub13 method36632(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub1_Sub13 local5 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = Class542.aClass497_129.method30064(arg0, 0, (byte) 0);
		if (local15 == null || local15.length <= 1) {
			return null;
		}
		try {
			local5 = Class113.method7408(local15, (short) 23611);
		} catch (@Pc(30) Exception local30) {
			throw new RuntimeException(local30.getMessage() + " " + arg0);
		}
		aClass253_1.method25986(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!yw", name = "p", descriptor = "(Lclient!uh;II)Lclient!asc;", line = 37)
	static Class93_Sub1_Sub13 method36633(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt2065 * 825039395 | arg1 << 10;
		@Pc(16) Class93_Sub1_Sub13 local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 7096), (byte) 19);
		if (local28 == null) {
			local8 = arg0.anInt2065 * 825039395 | arg2 + 65536 << 10;
			local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 8876), (byte) 95);
			if (local28 == null) {
				local8 = arg0.anInt2065 * 825039395 | 0x3FFFC00;
				local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 17112), (byte) 126);
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class113.method7408(local28, (short) 16884);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass155_70 = arg0;
					aClass253_1.method25986(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class113.method7408(local28, (short) 26007);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass155_70 = arg0;
				aClass253_1.method25986(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class113.method7408(local28, (short) 5589);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass155_70 = arg0;
			aClass253_1.method25986(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!yw", name = "z", descriptor = "(Lclient!uh;II)Lclient!asc;", line = 37)
	static Class93_Sub1_Sub13 method36634(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.anInt2065 * 825039395 | arg1 << 10;
		@Pc(16) Class93_Sub1_Sub13 local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 7718), (byte) 127);
		if (local28 == null) {
			local8 = arg0.anInt2065 * 825039395 | arg2 + 65536 << 10;
			local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 6978), (byte) 125);
			if (local28 == null) {
				local8 = arg0.anInt2065 * 825039395 | 0x3FFFC00;
				local16 = (Class93_Sub1_Sub13) aClass253_1.method25983((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class542.aClass497_129.method30079(Class542.aClass497_129.method30108(local8, (short) 1708), (byte) 117);
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class113.method7408(local28, (short) 28234);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass155_70 = arg0;
					aClass253_1.method25986(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class113.method7408(local28, (short) 7205);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass155_70 = arg0;
				aClass253_1.method25986(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class113.method7408(local28, (short) 9954);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass155_70 = arg0;
			aClass253_1.method25986(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!yw", name = "c", descriptor = "([B)Lclient!asc;", line = 89)
	static Class93_Sub1_Sub13 method36635(@OriginalArg(0) byte[] arg0) {
		return new Class93_Sub1_Sub13(new Packet(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!yw", name = "d", descriptor = "([B)Lclient!asc;", line = 89)
	static Class93_Sub1_Sub13 method36636(@OriginalArg(0) byte[] arg0) {
		return new Class93_Sub1_Sub13(new Packet(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!yw", name = "r", descriptor = "([B)Lclient!asc;", line = 89)
	static Class93_Sub1_Sub13 method36637(@OriginalArg(0) byte[] arg0) {
		return new Class93_Sub1_Sub13(new Packet(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!yw", name = "v", descriptor = "([B)Lclient!asc;", line = 89)
	static Class93_Sub1_Sub13 method36638(@OriginalArg(0) byte[] arg0) {
		return new Class93_Sub1_Sub13(new Packet(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!yw", name = "xa", descriptor = "(Lclient!yf;I)V", line = 9145)
	static final void method36639(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class93_Sub30 local13 = (Class93_Sub30) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13.anInt1610 * -427776677;
	}

	@OriginalMember(owner = "client!yw", name = "ahy", descriptor = "(Lclient!yf;S)V", line = 11199)
	static final void method36640(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(9) String local9;
		if (Class520.selfPlayer == null || Class520.selfPlayer.name1 == null) {
			local9 = "";
		} else {
			local9 = Class520.selfPlayer.method20069(true, (byte) -71);
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local9;
	}

	@OriginalMember(owner = "client!yw", name = "ajn", descriptor = "(Lclient!yf;I)V", line = 11453)
	static final void method36641(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}
}