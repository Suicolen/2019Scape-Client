package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class593 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[B")
	static byte[] aByteArray106 = new byte[520];

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!abp;")
	Class42 aClass42_7 = null;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!abp;")
	Class42 aClass42_8 = null;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	int anInt5478 = 204727016;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	int anInt5477;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(ILclient!abp;Lclient!abp;I)V", line = 13)
	public Class593(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3) {
		this.anInt5477 = arg0 * 819342901;
		this.aClass42_7 = arg1;
		this.aClass42_8 = arg2;
		this.anInt5478 = arg3 * 887343393;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(II)[B", line = 21)
	public byte[] method31706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method826(aByteArray106, 0, 6, -1876228298);
				@Pc(56) int local56 = ((aByteArray106[0] & 0xFF) << 16) + ((aByteArray106[1] & 0xFF) << 8) + (aByteArray106[2] & 0xFF);
				@Pc(78) int local78 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
				if (local56 < 0 || local56 > this.anInt5478 * -81593631) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass42_7.method822((byte) 1) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass42_7.method819((long) local78 * 520L);
						@Pc(133) int local133 = local56 - local111;
						@Pc(182) int local182;
						@Pc(196) int local196;
						@Pc(218) int local218;
						@Pc(224) int local224;
						@Pc(143) byte local143;
						if (arg0 > 65535) {
							if (local133 > 510) {
								local133 = 510;
							}
							local143 = 10;
							this.aClass42_7.method826(aByteArray106, 0, local133 + local143, -2008457232);
							local182 = (aByteArray106[3] & 0xFF) + ((aByteArray106[1] & 0xFF) << 16) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[2] & 0xFF) << 8);
							local196 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
							local218 = ((aByteArray106[7] & 0xFF) << 8) + ((aByteArray106[6] & 0xFF) << 16) + (aByteArray106[8] & 0xFF);
							local224 = aByteArray106[9] & 0xFF;
						} else {
							if (local133 > 512) {
								local133 = 512;
							}
							local143 = 8;
							this.aClass42_7.method826(aByteArray106, 0, local143 + local133, -2113246486);
							local182 = ((aByteArray106[0] & 0xFF) << 8) + (aByteArray106[1] & 0xFF);
							local196 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
							local218 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
							local224 = aByteArray106[7] & 0xFF;
						}
						if (arg0 == local182 && local113 == local196 && local224 == this.anInt5477 * 808596509) {
							if (local218 >= 0 && (long) local218 <= this.aClass42_7.method822((byte) 1) / 520L) {
								@Pc(333) int local333 = local133 + local143;
								for (@Pc(335) int local335 = local143; local335 < local333; local335++) {
									local109[local111++] = aByteArray106[local335];
								}
								local78 = local218;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(352) byte[] local352 = local109;
					return local352;
				}
				local17 = null;
			} catch (@Pc(356) IOException local356) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "(I)[B", line = 21)
	public byte[] method31707(@OriginalArg(0) int arg0) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method826(aByteArray106, 0, 6, -2091416186);
				@Pc(56) int local56 = ((aByteArray106[0] & 0xFF) << 16) + ((aByteArray106[1] & 0xFF) << 8) + (aByteArray106[2] & 0xFF);
				@Pc(78) int local78 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
				if (local56 < 0 || local56 > this.anInt5478 * -81593631) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass42_7.method822((byte) 1) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass42_7.method819((long) local78 * 520L);
						@Pc(133) int local133 = local56 - local111;
						@Pc(182) int local182;
						@Pc(196) int local196;
						@Pc(218) int local218;
						@Pc(224) int local224;
						@Pc(143) byte local143;
						if (arg0 > 65535) {
							if (local133 > 510) {
								local133 = 510;
							}
							local143 = 10;
							this.aClass42_7.method826(aByteArray106, 0, local133 + local143, -1804410476);
							local182 = (aByteArray106[3] & 0xFF) + ((aByteArray106[1] & 0xFF) << 16) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[2] & 0xFF) << 8);
							local196 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
							local218 = ((aByteArray106[7] & 0xFF) << 8) + ((aByteArray106[6] & 0xFF) << 16) + (aByteArray106[8] & 0xFF);
							local224 = aByteArray106[9] & 0xFF;
						} else {
							if (local133 > 512) {
								local133 = 512;
							}
							local143 = 8;
							this.aClass42_7.method826(aByteArray106, 0, local143 + local133, -1621864904);
							local182 = ((aByteArray106[0] & 0xFF) << 8) + (aByteArray106[1] & 0xFF);
							local196 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
							local218 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
							local224 = aByteArray106[7] & 0xFF;
						}
						if (arg0 == local182 && local113 == local196 && local224 == this.anInt5477 * 808596509) {
							if (local218 >= 0 && (long) local218 <= this.aClass42_7.method822((byte) 1) / 520L) {
								@Pc(333) int local333 = local133 + local143;
								for (@Pc(335) int local335 = local143; local335 < local333; local335++) {
									local109[local111++] = aByteArray106[local335];
								}
								local78 = local218;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(352) byte[] local352 = local109;
					return local352;
				}
				local17 = null;
			} catch (@Pc(356) IOException local356) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "(I)[B", line = 21)
	public byte[] method31708(@OriginalArg(0) int arg0) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method826(aByteArray106, 0, 6, -1870948179);
				@Pc(56) int local56 = ((aByteArray106[0] & 0xFF) << 16) + ((aByteArray106[1] & 0xFF) << 8) + (aByteArray106[2] & 0xFF);
				@Pc(78) int local78 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
				if (local56 < 0 || local56 > this.anInt5478 * -81593631) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass42_7.method822((byte) 1) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass42_7.method819((long) local78 * 520L);
						@Pc(133) int local133 = local56 - local111;
						@Pc(182) int local182;
						@Pc(196) int local196;
						@Pc(218) int local218;
						@Pc(224) int local224;
						@Pc(143) byte local143;
						if (arg0 > 65535) {
							if (local133 > 510) {
								local133 = 510;
							}
							local143 = 10;
							this.aClass42_7.method826(aByteArray106, 0, local133 + local143, -1851928214);
							local182 = (aByteArray106[3] & 0xFF) + ((aByteArray106[1] & 0xFF) << 16) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[2] & 0xFF) << 8);
							local196 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
							local218 = ((aByteArray106[7] & 0xFF) << 8) + ((aByteArray106[6] & 0xFF) << 16) + (aByteArray106[8] & 0xFF);
							local224 = aByteArray106[9] & 0xFF;
						} else {
							if (local133 > 512) {
								local133 = 512;
							}
							local143 = 8;
							this.aClass42_7.method826(aByteArray106, 0, local143 + local133, -1778671221);
							local182 = ((aByteArray106[0] & 0xFF) << 8) + (aByteArray106[1] & 0xFF);
							local196 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
							local218 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
							local224 = aByteArray106[7] & 0xFF;
						}
						if (arg0 == local182 && local113 == local196 && local224 == this.anInt5477 * 808596509) {
							if (local218 >= 0 && (long) local218 <= this.aClass42_7.method822((byte) 1) / 520L) {
								@Pc(333) int local333 = local133 + local143;
								for (@Pc(335) int local335 = local143; local335 < local333; local335++) {
									local109[local111++] = aByteArray106[local335];
								}
								local78 = local218;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(352) byte[] local352 = local109;
					return local352;
				}
				local17 = null;
			} catch (@Pc(356) IOException local356) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)[B", line = 21)
	public byte[] method31709(@OriginalArg(0) int arg0) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			@Pc(17) Object local17;
			try {
				if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
					local17 = null;
					return (byte[]) local17;
				}
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method826(aByteArray106, 0, 6, -1768263334);
				@Pc(56) int local56 = ((aByteArray106[0] & 0xFF) << 16) + ((aByteArray106[1] & 0xFF) << 8) + (aByteArray106[2] & 0xFF);
				@Pc(78) int local78 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
				if (local56 < 0 || local56 > this.anInt5478 * -81593631) {
					local17 = null;
					return (byte[]) local17;
				}
				if (local78 > 0 && (long) local78 <= this.aClass42_7.method822((byte) 1) / 520L) {
					@Pc(109) byte[] local109 = new byte[local56];
					@Pc(111) int local111 = 0;
					@Pc(113) int local113 = 0;
					while (local111 < local56) {
						if (local78 == 0) {
							local17 = null;
							return (byte[]) local17;
						}
						this.aClass42_7.method819((long) local78 * 520L);
						@Pc(133) int local133 = local56 - local111;
						@Pc(182) int local182;
						@Pc(196) int local196;
						@Pc(218) int local218;
						@Pc(224) int local224;
						@Pc(143) byte local143;
						if (arg0 > 65535) {
							if (local133 > 510) {
								local133 = 510;
							}
							local143 = 10;
							this.aClass42_7.method826(aByteArray106, 0, local133 + local143, -2053465901);
							local182 = (aByteArray106[3] & 0xFF) + ((aByteArray106[1] & 0xFF) << 16) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[2] & 0xFF) << 8);
							local196 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
							local218 = ((aByteArray106[7] & 0xFF) << 8) + ((aByteArray106[6] & 0xFF) << 16) + (aByteArray106[8] & 0xFF);
							local224 = aByteArray106[9] & 0xFF;
						} else {
							if (local133 > 512) {
								local133 = 512;
							}
							local143 = 8;
							this.aClass42_7.method826(aByteArray106, 0, local143 + local133, -2099615183);
							local182 = ((aByteArray106[0] & 0xFF) << 8) + (aByteArray106[1] & 0xFF);
							local196 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
							local218 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
							local224 = aByteArray106[7] & 0xFF;
						}
						if (arg0 == local182 && local113 == local196 && local224 == this.anInt5477 * 808596509) {
							if (local218 >= 0 && (long) local218 <= this.aClass42_7.method822((byte) 1) / 520L) {
								@Pc(333) int local333 = local133 + local143;
								for (@Pc(335) int local335 = local143; local335 < local333; local335++) {
									local109[local111++] = aByteArray106[local335];
								}
								local78 = local218;
								local113++;
								continue;
							}
							local17 = null;
							return (byte[]) local17;
						}
						local17 = null;
						return (byte[]) local17;
					}
					@Pc(352) byte[] local352 = local109;
					return local352;
				}
				local17 = null;
			} catch (@Pc(356) IOException local356) {
				return null;
			}
			return (byte[]) local17;
		}
	}

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "(I[BI)Z", line = 76)
	public boolean method31710(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			if (arg2 < 0 || arg2 > this.anInt5478 * -81593631) {
				throw new IllegalArgumentException("" + this.anInt5477 * 808596509 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31712(arg0, arg1, arg2, true, (byte) 63);
			if (!local43) {
				local43 = this.method31712(arg0, arg1, arg2, false, (byte) -2);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "(I[BII)Z", line = 76)
	public boolean method31711(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			if (arg2 < 0 || arg2 > this.anInt5478 * -81593631) {
				throw new IllegalArgumentException("" + this.anInt5477 * 808596509 + ',' + arg0 + ',' + arg2);
			}
			@Pc(43) boolean local43 = this.method31712(arg0, arg1, arg2, true, (byte) -63);
			if (!local43) {
				local43 = this.method31712(arg0, arg1, arg2, false, (byte) 5);
			}
			return local43;
		}
	}

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "(I[BIZB)Z", line = 87)
	boolean method31712(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass42_8.method819((long) (arg0 * 6));
					this.aClass42_8.method826(aByteArray106, 0, 6, -1706000372);
					local58 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass42_7.method822((byte) 1) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass42_7.method822((byte) 1) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray106[0] = (byte) (arg2 >> 16);
				aByteArray106[1] = (byte) (arg2 >> 8);
				aByteArray106[2] = (byte) arg2;
				aByteArray106[3] = (byte) (local58 >> 16);
				aByteArray106[4] = (byte) (local58 >> 8);
				aByteArray106[5] = (byte) local58;
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method835(aByteArray106, 0, 6, -1255011063);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass42_7.method819((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass42_7.method826(aByteArray106, 0, 10, -2046024180);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = ((aByteArray106[2] & 0xFF) << 8) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[1] & 0xFF) << 16) + (aByteArray106[3] & 0xFF);
									local215 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
									local149 = ((aByteArray106[6] & 0xFF) << 16) + ((aByteArray106[7] & 0xFF) << 8) + (aByteArray106[8] & 0xFF);
									local243 = aByteArray106[9] & 0xFF;
								} else {
									try {
										this.aClass42_7.method826(aByteArray106, 0, 8, -1985620964);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray106[1] & 0xFF) + ((aByteArray106[0] & 0xFF) << 8);
									local215 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
									local149 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
									local243 = aByteArray106[7] & 0xFF;
								}
								if (local201 != arg0 || local144 != local215 || this.anInt5477 * 808596509 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass42_7.method822((byte) 1) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass42_7.method822((byte) 1) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray106[0] = (byte) (arg0 >> 24);
								aByteArray106[1] = (byte) (arg0 >> 16);
								aByteArray106[2] = (byte) (arg0 >> 8);
								aByteArray106[3] = (byte) arg0;
								aByteArray106[4] = (byte) (local144 >> 8);
								aByteArray106[5] = (byte) local144;
								aByteArray106[6] = (byte) (local149 >> 16);
								aByteArray106[7] = (byte) (local149 >> 8);
								aByteArray106[8] = (byte) local149;
								aByteArray106[9] = (byte) (this.anInt5477 * 808596509);
								this.aClass42_7.method819((long) local58 * 520L);
								this.aClass42_7.method835(aByteArray106, 0, 10, 837031173);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass42_7.method835(arg1, local142, local201, 2003177008);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray106[0] = (byte) (arg0 >> 8);
								aByteArray106[1] = (byte) arg0;
								aByteArray106[2] = (byte) (local144 >> 8);
								aByteArray106[3] = (byte) local144;
								aByteArray106[4] = (byte) (local149 >> 16);
								aByteArray106[5] = (byte) (local149 >> 8);
								aByteArray106[6] = (byte) local149;
								aByteArray106[7] = (byte) (this.anInt5477 * 808596509);
								this.aClass42_7.method819((long) local58 * 520L);
								this.aClass42_7.method835(aByteArray106, 0, 8, 207929483);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass42_7.method835(arg1, local142, local201, 1410532631);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "(I[BIZ)Z", line = 87)
	boolean method31713(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(3) Class42 local3 = this.aClass42_7;
		synchronized (this.aClass42_7) {
			try {
				@Pc(58) int local58;
				@Pc(19) boolean local19;
				if (arg3) {
					if (this.aClass42_8.method822((byte) 1) < (long) (arg0 * 6 + 6)) {
						local19 = false;
						return local19;
					}
					this.aClass42_8.method819((long) (arg0 * 6));
					this.aClass42_8.method826(aByteArray106, 0, 6, -1920632128);
					local58 = ((aByteArray106[3] & 0xFF) << 16) + ((aByteArray106[4] & 0xFF) << 8) + (aByteArray106[5] & 0xFF);
					if (local58 <= 0 || (long) local58 > this.aClass42_7.method822((byte) 1) / 520L) {
						local19 = false;
						return local19;
					}
				} else {
					local58 = (int) ((this.aClass42_7.method822((byte) 1) + 519L) / 520L);
					if (local58 == 0) {
						local58 = 1;
					}
				}
				aByteArray106[0] = (byte) (arg2 >> 16);
				aByteArray106[1] = (byte) (arg2 >> 8);
				aByteArray106[2] = (byte) arg2;
				aByteArray106[3] = (byte) (local58 >> 16);
				aByteArray106[4] = (byte) (local58 >> 8);
				aByteArray106[5] = (byte) local58;
				this.aClass42_8.method819((long) (arg0 * 6));
				this.aClass42_8.method835(aByteArray106, 0, 6, 918066956);
				@Pc(142) int local142 = 0;
				@Pc(144) int local144 = 0;
				while (true) {
					if (local142 < arg2) {
						label154: {
							@Pc(149) int local149 = 0;
							@Pc(201) int local201;
							if (arg3) {
								this.aClass42_7.method819((long) local58 * 520L);
								@Pc(215) int local215;
								@Pc(243) int local243;
								if (arg0 > 65535) {
									try {
										this.aClass42_7.method826(aByteArray106, 0, 10, -2077898766);
									} catch (@Pc(170) EOFException local170) {
										break label154;
									}
									local201 = ((aByteArray106[2] & 0xFF) << 8) + ((aByteArray106[0] & 0xFF) << 24) + ((aByteArray106[1] & 0xFF) << 16) + (aByteArray106[3] & 0xFF);
									local215 = (aByteArray106[5] & 0xFF) + ((aByteArray106[4] & 0xFF) << 8);
									local149 = ((aByteArray106[6] & 0xFF) << 16) + ((aByteArray106[7] & 0xFF) << 8) + (aByteArray106[8] & 0xFF);
									local243 = aByteArray106[9] & 0xFF;
								} else {
									try {
										this.aClass42_7.method826(aByteArray106, 0, 8, -1898916366);
									} catch (@Pc(253) EOFException local253) {
										break label154;
									}
									local201 = (aByteArray106[1] & 0xFF) + ((aByteArray106[0] & 0xFF) << 8);
									local215 = (aByteArray106[3] & 0xFF) + ((aByteArray106[2] & 0xFF) << 8);
									local149 = ((aByteArray106[4] & 0xFF) << 16) + ((aByteArray106[5] & 0xFF) << 8) + (aByteArray106[6] & 0xFF);
									local243 = aByteArray106[7] & 0xFF;
								}
								if (local201 != arg0 || local144 != local215 || this.anInt5477 * 808596509 != local243) {
									local19 = false;
									return local19;
								}
								if (local149 < 0 || (long) local149 > this.aClass42_7.method822((byte) 1) / 520L) {
									local19 = false;
									return local19;
								}
							}
							if (local149 == 0) {
								arg3 = false;
								local149 = (int) ((this.aClass42_7.method822((byte) 1) + 519L) / 520L);
								if (local149 == 0) {
									local149++;
								}
								if (local58 == local149) {
									local149++;
								}
							}
							if (arg0 > 65535) {
								if (arg2 - local142 <= 510) {
									local149 = 0;
								}
								aByteArray106[0] = (byte) (arg0 >> 24);
								aByteArray106[1] = (byte) (arg0 >> 16);
								aByteArray106[2] = (byte) (arg0 >> 8);
								aByteArray106[3] = (byte) arg0;
								aByteArray106[4] = (byte) (local144 >> 8);
								aByteArray106[5] = (byte) local144;
								aByteArray106[6] = (byte) (local149 >> 16);
								aByteArray106[7] = (byte) (local149 >> 8);
								aByteArray106[8] = (byte) local149;
								aByteArray106[9] = (byte) (this.anInt5477 * 808596509);
								this.aClass42_7.method819((long) local58 * 520L);
								this.aClass42_7.method835(aByteArray106, 0, 10, -652066129);
								local201 = arg2 - local142;
								if (local201 > 510) {
									local201 = 510;
								}
								this.aClass42_7.method835(arg1, local142, local201, 1672035796);
								local142 += local201;
							} else {
								if (arg2 - local142 <= 512) {
									local149 = 0;
								}
								aByteArray106[0] = (byte) (arg0 >> 8);
								aByteArray106[1] = (byte) arg0;
								aByteArray106[2] = (byte) (local144 >> 8);
								aByteArray106[3] = (byte) local144;
								aByteArray106[4] = (byte) (local149 >> 16);
								aByteArray106[5] = (byte) (local149 >> 8);
								aByteArray106[6] = (byte) local149;
								aByteArray106[7] = (byte) (this.anInt5477 * 808596509);
								this.aClass42_7.method819((long) local58 * 520L);
								this.aClass42_7.method835(aByteArray106, 0, 8, 1230742328);
								local201 = arg2 - local142;
								if (local201 > 512) {
									local201 = 512;
								}
								this.aClass42_7.method835(arg1, local142, local201, -2020049207);
								local142 += local201;
							}
							local58 = local149;
							local144++;
							continue;
						}
					}
					local19 = true;
					return local19;
				}
			} catch (@Pc(575) IOException local575) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "(Lclient!ajt;B)V", line = 113)
	static final void method31714(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class585 local3 = client.world.method30481(-1276251391);
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31534(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -1309876799);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31544(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -2121498180);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31551(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1, (byte) 3);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31556(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, -968156135);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423(-1037211373) * 1906814085;
			arg0.anInt1467 = local9.method13420(1655619619) * -878129807;
			arg0.anInt1466 = local9.method13404(1716163398) * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "(B)V", line = 169)
	static void method31715(@OriginalArg(0) byte arg0) {
		if (client.anInt3462 * 1756332913 >= 0) {
			return;
		}
		@Pc(7) Class5 local7 = Class142_Sub1.method10971((byte) 11);
		if (!Class454.aBoolean773) {
			Class454.aBoolean772 = Class454.anInt5056 * 755390299 != -1 && Class454.anInt5042 * -1838307953 >= Class454.anInt5056 * 755390299 || (Class454.aBoolean774 ? 26 : 22) + Class454.anInt5036 * -875883057 * Class454.anInt5042 * -1838307953 > Class553.height * 2091353777;
		}
		Class454.aClass22_54.method405(-2037259486);
		Class454.aClass22_56.method405(-2037259486);
		@Pc(61) int local61;
		for (@Pc(53) Class93_Sub1_Sub7 local53 = (Class93_Sub1_Sub7) Class454.aClass22_55.method428((byte) 5); local53 != null; local53 = (Class93_Sub1_Sub7) Class454.aClass22_55.method442(1569880883)) {
			local61 = local53.anInt3012 * -92627949;
			if (local61 < 1000) {
				local53.method23969(-1517244636);
				if (local61 == 59 || local61 == 2 || local61 == 8 || local61 == 17 || local61 == 15 || local61 == 16 || local61 == 58) {
					Class454.aClass22_56.method408(local53, -1675442092);
				} else {
					Class454.aClass22_54.method408(local53, 352542018);
				}
			}
		}
		Class454.aClass22_54.method427(Class454.aClass22_55, 619226323);
		Class454.aClass22_56.method427(Class454.aClass22_55, -2022481678);
		if (Class454.anInt5042 * -1838307953 > 1) {
			if (Class527.method30387((byte) 2) && Class454.anInt5042 * -1838307953 > 2) {
				Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 = (Class93_Sub1_Sub7) Class454.aClass22_55.aClass93_8.aClass93_228.aClass93_228;
			} else {
				Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 = (Class93_Sub1_Sub7) Class454.aClass22_55.aClass93_8.aClass93_228;
			}
			Class594.aClass93_Sub1_Sub7_6 = (Class93_Sub1_Sub7) Class454.aClass22_55.aClass93_8.aClass93_228;
			if (Class454.anInt5042 * -1838307953 > 2) {
				Class272.aClass93_Sub1_Sub7_5 = (Class93_Sub1_Sub7) Class594.aClass93_Sub1_Sub7_6.aClass93_228;
			} else {
				Class272.aClass93_Sub1_Sub7_5 = null;
			}
		} else {
			Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 = null;
			Class594.aClass93_Sub1_Sub7_6 = null;
			Class272.aClass93_Sub1_Sub7_5 = null;
		}
		@Pc(165) Class93_Sub23 local165 = (Class93_Sub23) client.aClass22_45.method428((byte) 105);
		@Pc(176) int local176;
		if (local165 == null) {
			local61 = Class82.aClass153_1.method14070(206956204);
			local176 = Class82.aClass153_1.method14075(1078539329);
		} else {
			local61 = local165.method22875(-1678286317);
			local176 = local165.method22876((byte) -101);
		}
		@Pc(615) boolean local615;
		if (!Class454.aBoolean773) {
			local615 = Class296.method26609(Class288.aClass636_1.anInterface67_4, local165, -1964346619);
			@Pc(846) boolean local846 = Class296.method26609(Class288.aClass636_1.anInterface67_1, local165, 618321372);
			@Pc(852) boolean local852 = Class296.method26609(Class288.aClass636_1.anInterface67_3, local165, -1339762076);
			if ((local615 || local846) && (client.anInt3519 * -169503325 == 1 && Class454.anInt5042 * -1838307953 > 2 || Class491.method29979((byte) -31))) {
				local852 = true;
			}
			if (local852 && Class454.anInt5042 * -1838307953 > 0) {
				if (client.aClass312_5 == null && client.anInt3535 * 1955586241 == 0) {
					Class31.method637(local61, local176, (short) -18698);
				} else {
					Class454.anInt5041 = -1739533930;
				}
			} else if (local846) {
				if (Class272.aClass93_Sub1_Sub7_5 != null) {
					Class169.method18341(Class272.aClass93_Sub1_Sub7_5, local61, local176, false, 1927370838);
				}
			} else if (local615) {
				if (Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4 != null) {
					@Pc(918) boolean local918 = client.aClass312_5 != null || client.anInt3535 * 1955586241 > 0;
					if (local918) {
						Class454.anInt5041 = 1277716683;
						Class102.aClass93_Sub1_Sub7_3 = Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4;
					} else {
						Class169.method18341(Class112_Sub1_Sub1.aClass93_Sub1_Sub7_4, local61, local176, false, 1967053711);
					}
				} else if (client.aBoolean625) {
					Class624.method32159(682408472);
				}
			}
			if (client.aClass312_5 == null && client.anInt3535 * 1955586241 == 0) {
				Class454.anInt5041 = 0;
				Class102.aClass93_Sub1_Sub7_3 = null;
			}
			return;
		}
		@Pc(227) int local227;
		@Pc(254) int local254;
		if (!Class296.method26609(Class288.aClass636_1.anInterface67_2, local165, 3064134)) {
			local615 = false;
			if (Class454.aClass93_Sub1_Sub8_1 != null) {
				if (local61 >= Class301.anInt3931 * 1939408525 - 10 && local61 <= Class454.anInt5046 * -816478179 + Class301.anInt3931 * 1939408525 + 10 && local176 >= Class318.anInt4095 * -988861719 - 10 && local176 <= Class360.anInt4570 * 2144271703 + 10 + Class318.anInt4095 * -988861719) {
					local615 = true;
				} else {
					Class219.method25512(543603806);
				}
			}
			if (!local615) {
				if (local61 < Class166_Sub17.anInt2179 * 1703853389 - 10 || local61 > Class221.anInt3629 * 1555894759 + 10 + Class166_Sub17.anInt2179 * 1703853389 || local176 < Class369.anInt4589 * -310709577 - 10 || local176 > Class369.anInt4589 * -310709577 + 10 + Class115.anInt972 * 1280805653) {
					Class436.method28812(-916881791);
				} else if (Class454.aBoolean772) {
					local227 = -1;
					local254 = -1;
					@Pc(708) int local708;
					for (local708 = 0; local708 < Class454.anInt5039 * -2074084977; local708++) {
						@Pc(734) int local734;
						if (Class454.aBoolean774) {
							local734 = local7.anInt6 * -8978697 + 1 + 20 + Class369.anInt4589 * -310709577 + Class454.anInt5036 * -875883057 * local708;
							if (local176 > local734 - local7.anInt6 * -8978697 - 1 && local176 < local7.anInt10 * -1093354073 + local734) {
								local227 = local708;
								local254 = local734 - local7.anInt6 * -8978697 - 1;
								break;
							}
						} else {
							local734 = local708 * Class454.anInt5036 * -875883057 + 31 + Class369.anInt4589 * -310709577;
							if (local176 > local734 - 13 && local176 < local734 + 3) {
								local227 = local708;
								local254 = local734 - 13;
								break;
							}
						}
					}
					if (local227 != -1) {
						local708 = 0;
						@Pc(805) Class11 local805 = new Class11(Class454.aClass18_16);
						for (@Pc(810) Class93_Sub1_Sub8 local810 = (Class93_Sub1_Sub8) local805.method170(-1452517832); local810 != null; local810 = (Class93_Sub1_Sub8) local805.next()) {
							if (local227 == local708) {
								if (local810.anInt3013 * -2109043087 > 1) {
									Class342.method27509(local810, local254, (byte) -59);
								}
								break;
							}
							local708++;
						}
					}
				}
			}
			return;
		}
		@Pc(225) int local225;
		@Pc(317) Class93_Sub1_Sub7 local317;
		@Pc(312) Class11 local312;
		if (Class454.aClass93_Sub1_Sub8_1 != null && local61 >= Class301.anInt3931 * 1939408525 && local61 <= Class454.anInt5046 * -816478179 + Class301.anInt3931 * 1939408525 && local176 >= Class318.anInt4095 * -988861719 && local176 <= Class318.anInt4095 * -988861719 + Class360.anInt4570 * 2144271703) {
			local225 = -1;
			for (local227 = 0; local227 < Class454.aClass93_Sub1_Sub8_1.anInt3013 * -2109043087; local227++) {
				if (Class454.aBoolean774) {
					local254 = Class318.anInt4095 * -988861719 + 20 + local7.anInt6 * -8978697 + 1 + local227 * -875883057 * Class454.anInt5036;
					if (local176 > local254 - local7.anInt6 * -8978697 - 1 && local176 < local7.anInt10 * -1093354073 + local254) {
						local225 = local227;
					}
				} else {
					local254 = Class454.anInt5036 * -875883057 * local227 + 31 + Class318.anInt4095 * -988861719;
					if (local176 > local254 - 13 && local176 < local254 + 3) {
						local225 = local227;
					}
				}
			}
			if (local225 != -1) {
				local227 = 0;
				local312 = new Class11(Class454.aClass93_Sub1_Sub8_1.aClass18_10);
				for (local317 = (Class93_Sub1_Sub7) local312.method170(-873034851); local317 != null; local317 = (Class93_Sub1_Sub7) local312.next()) {
					if (local225 == local227) {
						Class169.method18341(local317, local61, local176, true, 1771726998);
						break;
					}
					local227++;
				}
			}
			Class436.method28812(-916881791);
		} else if (local61 >= Class166_Sub17.anInt2179 * 1703853389 && local61 <= Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3629 * 1555894759 && local176 >= Class369.anInt4589 * -310709577 && local176 <= Class369.anInt4589 * -310709577 + Class115.anInt972 * 1280805653) {
			if (Class454.aBoolean772) {
				local225 = -1;
				for (local227 = 0; local227 < Class454.anInt5039 * -2074084977; local227++) {
					if (Class454.aBoolean774) {
						local254 = Class454.anInt5036 * -875883057 * local227 + 20 + Class369.anInt4589 * -310709577 + local7.anInt6 * -8978697 + 1;
						if (local176 > local254 - local7.anInt6 * -8978697 - 1 && local176 < local254 + local7.anInt10 * -1093354073) {
							local225 = local227;
							break;
						}
					} else {
						local254 = Class454.anInt5036 * -875883057 * local227 + 31 + Class369.anInt4589 * -310709577;
						if (local176 > local254 - 13 && local176 < local254 + 3) {
							local225 = local227;
							break;
						}
					}
				}
				if (local225 != -1) {
					local227 = 0;
					local312 = new Class11(Class454.aClass18_16);
					for (@Pc(588) Class93_Sub1_Sub8 local588 = (Class93_Sub1_Sub8) local312.method170(-1219241938); local588 != null; local588 = (Class93_Sub1_Sub8) local312.next()) {
						if (local227 == local225) {
							Class169.method18341((Class93_Sub1_Sub7) local588.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68, local61, local176, true, 1404994115);
							Class436.method28812(-916881791);
							break;
						}
						local227++;
					}
				}
			} else {
				local225 = -1;
				for (local227 = 0; local227 < Class454.anInt5042 * -1838307953; local227++) {
					if (Class454.aBoolean774) {
						local254 = Class454.anInt5036 * -875883057 * (Class454.anInt5042 * -1838307953 - 1 - local227) + 20 + Class369.anInt4589 * -310709577 + local7.anInt6 * -8978697 + 1;
						if (local176 > local254 - local7.anInt6 * -8978697 - 1 && local176 < local7.anInt10 * -1093354073 + local254) {
							local225 = local227;
						}
					} else {
						local254 = Class454.anInt5036 * -875883057 * (Class454.anInt5042 * -1838307953 - 1 - local227) + 31 + Class369.anInt4589 * -310709577;
						if (local176 > local254 - 13 && local176 < local254 + 3) {
							local225 = local227;
						}
					}
				}
				if (local225 != -1) {
					local227 = 0;
					@Pc(468) Class20 local468 = new Class20(Class454.aClass22_55);
					for (local317 = (Class93_Sub1_Sub7) local468.method366(699749822); local317 != null; local317 = (Class93_Sub1_Sub7) local468.next()) {
						if (local227 == local225) {
							Class169.method18341(local317, local61, local176, true, 1417218142);
							break;
						}
						local227++;
					}
				}
				Class436.method28812(-916881791);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "toString", descriptor = "()Ljava/lang/String;", line = 198)
	@Override
	public String toString() {
		return "" + this.anInt5477 * 808596509;
	}

	@OriginalMember(owner = "client!uf", name = "rj", descriptor = "()Ljava/lang/String;", line = 198)
	public String method31716() {
		return "" + this.anInt5477 * 808596509;
	}

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "(Lclient!uh;IILclient!yd;Lclient!aut;I)V", line = 300)
	public static void method31717(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class679 arg3, @OriginalArg(4) Class132_Sub1_Sub5_Sub1 arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class681 local2 = Class96.method2324(700958403);
		local2.aClass132_Sub1_Sub5_Sub1_1 = arg4;
		Class346.method27566(arg0, arg1, arg2, local2, 1677070776);
		local2.aClass132_Sub1_Sub5_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!uf", name = "gh", descriptor = "(S)V", line = 3808)
	static final void method31718(@OriginalArg(0) short arg0) {
		@Pc(3) Class611 local3 = client.world.method30455(2040681733);
		@Pc(7) Class472 local7 = Class65.aClass123_Sub1_2.method9025(300515238);
		Class163.anInt2002 = ((int) local7.aFloat317 - (local3.anInt5623 * 270611681 << 9)) * 1636217271;
		Class130_Sub2.anInt1117 = -((int) local7.aFloat318) * 1820517185;
		Class270.anInt3884 = ((int) local7.aFloat319 - (local3.anInt5624 * -1994307635 << 9)) * -967471741;
		Class620.anInt5644 = ((int) ((double) Class65.aClass123_Sub1_2.method9040((byte) 72) * 2607.5945876176133D) & 0x3FFF) * -1151839067;
		IsaacRandom.anInt82 = ((int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -126) * 2607.5945876176133D) & 0x3FFF) * 1056124373;
		Class348.anInt4199 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "ex", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5852)
	static final void method31719(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean686 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] == 1;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!uf", name = "gb", descriptor = "(Lclient!yf;I)V", line = 6211)
	static final void method31720(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class286.method26530(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!uf", name = "mv", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V", line = 7188)
	static final void method31721(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray16 = Class499.method30149(local13, arg2, 31469190);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!uf", name = "yl", descriptor = "(Lclient!yf;I)V", line = 9323)
	static final void method31722(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class699.method36706(-1554814718);
	}

	@OriginalMember(owner = "client!uf", name = "aqg", descriptor = "(Lclient!yf;B)V", line = 12874)
	static final void method31723(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}