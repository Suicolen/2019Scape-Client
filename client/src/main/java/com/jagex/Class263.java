package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public class Class263 implements Interface13 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!aan;")
	Class16 aClass16_26;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "[I")
	public int[] anIntArray368;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "[I")
	public int[] anIntArray369;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Lclient!fm;")
	public Class268 aClass268_1;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public int anInt3871 = 0;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public int anInt3878 = -2036536913;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	int anInt3879 = 1103879291;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public int anInt3872 = 1161582777;

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	public int anInt3873 = 1852901847;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
	public int anInt3874 = 7880353;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	public int anInt3875 = -881615215;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
	public int anInt3870 = 2052807611;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public int anInt3867 = -2085860811;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
	public int anInt3876 = -156802381;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	public int anInt3868 = 1481821234;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Z")
	public boolean aBoolean671 = false;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
	public boolean aBoolean669 = false;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	public int anInt3877 = 1199931741;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!fu;")
	Class117 aClass117_1;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILclient!fu;)V", line = 42)
	Class263(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		this.anInt3869 = arg0 * -353005353;
		this.aClass117_1 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(Lclient!alw;B)V", line = 49)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26182(arg0, local3, -533416270);
		}
	}

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "(Lclient!alw;)V", line = 49)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26182(arg0, local3, -193297966);
		}
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(Lclient!alw;)V", line = 49)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26182(arg0, local3, 2133758214);
		}
	}

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "(Lclient!alw;)V", line = 49)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26182(arg0, local3, 78596108);
		}
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(Lclient!alw;)V", line = 49)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method26182(arg0, local3, 1423769869);
		}
	}

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "(Lclient!alw;II)V", line = 56)
	void method26182(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.g2(-1434290800);
			this.anIntArray369 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] = arg0.g2(-1434290800);
			}
			this.anIntArray364 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray364[local12] = arg0.g2(-1434290800);
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray364[local12] += arg0.g2(-1434290800) << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3872 = arg0.g2(-1434290800) * -1161582777;
		} else if (arg1 == 5) {
			this.anInt3873 = arg0.g1((short) 16384) * -1347406549;
		} else if (arg1 == 6) {
			this.anInt3874 = arg0.g2(-1434290800) * -7880353;
		} else if (arg1 == 7) {
			this.anInt3875 = arg0.g2(-1434290800) * 881615215;
		} else if (arg1 == 8) {
			this.anInt3870 = arg0.g1((short) 16384) * -1497687351;
		} else if (arg1 == 9) {
			this.anInt3867 = arg0.g1((short) 16384) * 2085860811;
		} else if (arg1 == 10) {
			this.anInt3876 = arg0.g1((short) 16384) * 156802381;
		} else if (arg1 == 11) {
			this.anInt3868 = arg0.g1((short) 16384) * -1406573031;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.g1((short) 16384);
			} else {
				local6 = arg0.g2(-1434290800);
			}
			this.anIntArray365 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray365[local12] = arg0.g2(-1434290800);
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray365[local12] += arg0.g2(-1434290800) << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.g2(-1434290800);
				this.anIntArrayArray47 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.g1((short) 16384);
					if (local230 > 0) {
						this.anIntArrayArray47[local12] = new int[local230];
						this.anIntArrayArray47[local12][0] = arg0.g3((short) -19586);
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray47[local12][local249] = arg0.g2(-1434290800);
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean671 = true;
			} else if (arg1 == 15) {
				this.aBoolean669 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray366 == null) {
						this.anIntArray366 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray366[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.g1((short) 16384);
					} else {
						local6 = arg0.g2(-1434290800);
					}
					this.anIntArray366[local6] = arg0.g1((short) 16384);
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray367 == null || this.anIntArray368 == null) {
						this.anIntArray367 = new int[this.anIntArrayArray47.length];
						this.anIntArray368 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray367[local6] = 256;
							this.anIntArray368[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.g1((short) 16384);
					} else {
						local6 = arg0.g2(-1434290800);
					}
					this.anIntArray367[local6] = arg0.g2(-1434290800);
					this.anIntArray368[local6] = arg0.g2(-1434290800);
				} else if (arg1 == 22) {
					this.anInt3877 = arg0.g1((short) 16384) * -1199931741;
				} else if (arg1 == 23) {
					arg0.g2(-1434290800);
				} else if (arg1 == 24) {
					this.anInt3879 = arg0.g2(-1434290800) * -1103879291;
					if (this.aClass117_1 != null) {
						this.aClass268_1 = (Class268) this.aClass117_1.anInterface11_4.method18261(this.anInt3879 * -421372595, 942640473);
					}
				} else if (arg1 == 25) {
					this.anInt3878 = arg0.g2(-1434290800) * 2036536913;
				} else if (arg1 == 249) {
					local6 = arg0.g1((short) 16384);
					if (this.aClass16_26 == null) {
						local12 = Class134_Sub2.method10207(local6, (byte) 27);
						this.aClass16_26 = new Class16(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(498) boolean local498 = arg0.g1((short) 16384) == 1;
						local249 = arg0.g3((short) 9030);
						@Pc(511) Class93 local511;
						if (local498) {
							local511 = new Class93_Sub15(arg0.gjstr(528117079));
						} else {
							local511 = new Class93_Sub14(arg0.g4(-118643075));
						}
						this.aClass16_26.method220(local511, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "(Lclient!alw;I)V", line = 56)
	void method26183(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local6 = arg0.g2(-1434290800);
			this.anIntArray369 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray369[local12] = arg0.g2(-1434290800);
			}
			this.anIntArray364 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray364[local12] = arg0.g2(-1434290800);
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray364[local12] += arg0.g2(-1434290800) << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3872 = arg0.g2(-1434290800) * -1161582777;
		} else if (arg1 == 5) {
			this.anInt3873 = arg0.g1((short) 16384) * -1347406549;
		} else if (arg1 == 6) {
			this.anInt3874 = arg0.g2(-1434290800) * -7880353;
		} else if (arg1 == 7) {
			this.anInt3875 = arg0.g2(-1434290800) * 881615215;
		} else if (arg1 == 8) {
			this.anInt3870 = arg0.g1((short) 16384) * -1497687351;
		} else if (arg1 == 9) {
			this.anInt3867 = arg0.g1((short) 16384) * 2085860811;
		} else if (arg1 == 10) {
			this.anInt3876 = arg0.g1((short) 16384) * 156802381;
		} else if (arg1 == 11) {
			this.anInt3868 = arg0.g1((short) 16384) * -1406573031;
		} else if (arg1 == 12 || arg1 == 112) {
			if (arg1 == 12) {
				local6 = arg0.g1((short) 16384);
			} else {
				local6 = arg0.g2(-1434290800);
			}
			this.anIntArray365 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray365[local12] = arg0.g2(-1434290800);
			}
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray365[local12] += arg0.g2(-1434290800) << 16;
			}
		} else {
			@Pc(249) int local249;
			if (arg1 == 13) {
				local6 = arg0.g2(-1434290800);
				this.anIntArrayArray47 = new int[local6][];
				for (local12 = 0; local12 < local6; local12++) {
					@Pc(230) int local230 = arg0.g1((short) 16384);
					if (local230 > 0) {
						this.anIntArrayArray47[local12] = new int[local230];
						this.anIntArrayArray47[local12][0] = arg0.g3((short) 16032);
						for (local249 = 1; local249 < local230; local249++) {
							this.anIntArrayArray47[local12][local249] = arg0.g2(-1434290800);
						}
					}
				}
			} else if (arg1 == 14) {
				this.aBoolean671 = true;
			} else if (arg1 == 15) {
				this.aBoolean669 = true;
			} else if (arg1 != 16 && arg1 != 18) {
				if (arg1 == 19 || arg1 == 119) {
					if (this.anIntArray366 == null) {
						this.anIntArray366 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray366[local6] = 255;
						}
					}
					if (arg1 == 19) {
						local6 = arg0.g1((short) 16384);
					} else {
						local6 = arg0.g2(-1434290800);
					}
					this.anIntArray366[local6] = arg0.g1((short) 16384);
				} else if (arg1 == 20 || arg1 == 120) {
					if (this.anIntArray367 == null || this.anIntArray368 == null) {
						this.anIntArray367 = new int[this.anIntArrayArray47.length];
						this.anIntArray368 = new int[this.anIntArrayArray47.length];
						for (local6 = 0; local6 < this.anIntArrayArray47.length; local6++) {
							this.anIntArray367[local6] = 256;
							this.anIntArray368[local6] = 256;
						}
					}
					if (arg1 == 20) {
						local6 = arg0.g1((short) 16384);
					} else {
						local6 = arg0.g2(-1434290800);
					}
					this.anIntArray367[local6] = arg0.g2(-1434290800);
					this.anIntArray368[local6] = arg0.g2(-1434290800);
				} else if (arg1 == 22) {
					this.anInt3877 = arg0.g1((short) 16384) * -1199931741;
				} else if (arg1 == 23) {
					arg0.g2(-1434290800);
				} else if (arg1 == 24) {
					this.anInt3879 = arg0.g2(-1434290800) * -1103879291;
					if (this.aClass117_1 != null) {
						this.aClass268_1 = (Class268) this.aClass117_1.anInterface11_4.method18261(this.anInt3879 * -421372595, 131950226);
					}
				} else if (arg1 == 25) {
					this.anInt3878 = arg0.g2(-1434290800) * 2036536913;
				} else if (arg1 == 249) {
					local6 = arg0.g1((short) 16384);
					if (this.aClass16_26 == null) {
						local12 = Class134_Sub2.method10207(local6, (byte) 112);
						this.aClass16_26 = new Class16(local12);
					}
					for (local12 = 0; local12 < local6; local12++) {
						@Pc(498) boolean local498 = arg0.g1((short) 16384) == 1;
						local249 = arg0.g3((short) -9749);
						@Pc(511) Class93 local511;
						if (local498) {
							local511 = new Class93_Sub15(arg0.gjstr(1257008278));
						} else {
							local511 = new Class93_Sub14(arg0.g4(-118643075));
						}
						this.aClass16_26.method220(local511, (long) local249);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(II)Lclient!cy;", line = 123)
	static Class218 method26184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class218 local6 = (Class218) Class107.method18116(Class104.method20430((byte) -110), arg0, -1915563430);
		if (local6 == null) {
			local6 = Class218.aClass218_9;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "(I)V", line = 153)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
		if (-2017474589 * this.anInt3867 == -1) {
			if (this.aClass268_1 == null || this.aClass268_1.aBooleanArray23 == null) {
				this.anInt3867 = 0;
			} else {
				this.anInt3867 = -123245674;
			}
		}
		if (this.anInt3876 * -1511529595 == -1) {
			if (this.aClass268_1 == null || this.aClass268_1.aBooleanArray23 == null) {
				this.anInt3876 = 0;
			} else {
				this.anInt3876 = 313604762;
			}
		}
		if (this.anIntArray369 != null) {
			this.anInt3871 = 0;
			for (@Pc(49) int local49 = 0; local49 < this.anIntArray369.length; local49++) {
				this.anInt3871 += this.anIntArray369[local49] * 560235045;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "()V", line = 153)
	@Override
	public void method36659() {
		if (-2017474589 * this.anInt3867 == -1) {
			if (this.aClass268_1 == null || this.aClass268_1.aBooleanArray23 == null) {
				this.anInt3867 = 0;
			} else {
				this.anInt3867 = -123245674;
			}
		}
		if (this.anInt3876 * -1511529595 == -1) {
			if (this.aClass268_1 == null || this.aClass268_1.aBooleanArray23 == null) {
				this.anInt3876 = 0;
			} else {
				this.anInt3876 = 313604762;
			}
		}
		if (this.anIntArray369 != null) {
			this.anInt3871 = 0;
			for (@Pc(49) int local49 = 0; local49 < this.anIntArray369.length; local49++) {
				this.anInt3871 += this.anIntArray369[local49] * 560235045;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "()Z", line = 168)
	public boolean method26185() {
		if (this.anIntArray364 == null && this.anInt3878 * -153750863 == -1) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		if (this.anIntArray364 != null) {
			@Pc(19) int[] local19 = this.anIntArray364;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8369(local29 >>> 16, (byte) 58) == null) {
					local13 = false;
				}
			}
		} else if (this.aClass117_1.method8371(this.anInt3878 * -153750863, (byte) 6) == null) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "()Z", line = 168)
	public boolean method26186() {
		if (this.anIntArray364 == null && this.anInt3878 * -153750863 == -1) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		if (this.anIntArray364 != null) {
			@Pc(19) int[] local19 = this.anIntArray364;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8369(local29 >>> 16, (byte) 83) == null) {
					local13 = false;
				}
			}
		} else if (this.aClass117_1.method8371(this.anInt3878 * -153750863, (byte) -32) == null) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "()Z", line = 168)
	public boolean method26187() {
		if (this.anIntArray364 == null && this.anInt3878 * -153750863 == -1) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		if (this.anIntArray364 != null) {
			@Pc(19) int[] local19 = this.anIntArray364;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8369(local29 >>> 16, (byte) 90) == null) {
					local13 = false;
				}
			}
		} else if (this.aClass117_1.method8371(this.anInt3878 * -153750863, (byte) 64) == null) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "(B)Z", line = 168)
	public boolean method26188(@OriginalArg(0) byte arg0) {
		if (this.anIntArray364 == null && this.anInt3878 * -153750863 == -1) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		if (this.anIntArray364 != null) {
			@Pc(19) int[] local19 = this.anIntArray364;
			for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
				@Pc(29) int local29 = local19[local21];
				if (this.aClass117_1.method8369(local29 >>> 16, (byte) 23) == null) {
					local13 = false;
				}
			}
		} else if (this.aClass117_1.method8371(this.anInt3878 * -153750863, (byte) 10) == null) {
			local13 = false;
		}
		return local13;
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "(IIB)I", line = 190)
	public int method26189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass16_26 == null) {
			return arg1;
		} else {
			@Pc(11) Class93_Sub14 local11 = (Class93_Sub14) this.aClass16_26.method214((long) arg0);
			return local11 == null ? arg1 : local11.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 197)
	public String method26190(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_26.method214((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 197)
	public String method26191(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_26.method214((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 197)
	public String method26192(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.aClass16_26 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_26.method214((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()Z", line = 204)
	public boolean method26193() {
		return this.anInt3878 * -153750863 != -1;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)Z", line = 204)
	public boolean method26194(@OriginalArg(0) int arg0) {
		return this.anInt3878 * -153750863 != -1;
	}

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "()Z", line = 204)
	public boolean method26195() {
		return this.anInt3878 * -153750863 != -1;
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "()Z", line = 204)
	public boolean method26196() {
		return this.anInt3878 * -153750863 != -1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()Z", line = 204)
	public boolean method26197() {
		return this.anInt3878 * -153750863 != -1;
	}

	@OriginalMember(owner = "client!fg", name = "aa", descriptor = "(Lclient!yf;I)V", line = 5064)
	static final void method26198(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5894 -= -1364417339;
	}

	@OriginalMember(owner = "client!fg", name = "qv", descriptor = "(Lclient!yf;B)V", line = 8025)
	static final void method26199(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, -238698113);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class57.method1089(local16, local22, arg0, 65534);
	}
}