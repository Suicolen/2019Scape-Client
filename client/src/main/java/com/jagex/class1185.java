package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;

@ObfuscatedName("asc")
public class class1185 extends class986 {

	@ObfuscatedName("asc.l")
	public class572 field12373;

	@ObfuscatedName("asc.u")
	public String field12365;

	@ObfuscatedName("asc.z")
	public class504[] field12369;

	@ObfuscatedName("asc.p")
	public int[] field12367;

	@ObfuscatedName("asc.d")
	public Object[] field12366;

	@ObfuscatedName("asc.c")
	public int field12370;

	@ObfuscatedName("asc.r")
	public int field12368;

	@ObfuscatedName("asc.v")
	public int field12371;

	@ObfuscatedName("asc.o")
	public int field12372;

	@ObfuscatedName("asc.s")
	public int field12374;

	@ObfuscatedName("asc.y")
	public int field12364;

	@ObfuscatedName("asc.q")
	public class729[] field12375;

	@ObfuscatedName("asc.x")
	public final class151 field12376;

	public class1185(class997 arg0, class151 arg1) {
		this.field12376 = arg1;
		int var3 = this.method19494(arg0);
		int var4 = 0;
		class504[] var5 = class504.method7897();
		while (arg0.field11503 * 212851357 < var3) {
			class504 var6 = this.method19493(arg0, var5);
			this.method19495(arg0, var4, var6);
			var4++;
		}
	}

	@ObfuscatedName("asc.e(Lalw;[Lss;I)Lss;")
	public class504 method19493(class997 arg0, class504[] arg1) {
		int var3 = arg0.method17906();
		if (var3 < 0 || var3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[var3];
	}

	@ObfuscatedName("asc.n(Lalw;I)I")
	public int method19494(class997 arg0) {
		arg0.field11503 = (arg0.field11502.length - 2) * -1445626955;
		int var2 = arg0.method17906();
		int var3 = arg0.field11502.length - 2 - var2 - 16;
		arg0.field11503 = var3 * -1445626955;
		int var4 = arg0.method17910();
		this.field12370 = arg0.method17906();
		this.field12368 = arg0.method17906();
		this.field12371 = arg0.method17906();
		this.field12372 = arg0.method17906();
		this.field12374 = arg0.method17906();
		this.field12364 = arg0.method17906();
		int var5 = arg0.method17904();
		if (var5 > 0) {
			this.field12375 = new class729[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = arg0.method17906();
				class729 var8 = new class729(var7 > 0 ? class783.method16657(var7) : 1);
				this.field12375[var6] = var8;
				while (var7-- > 0) {
					int var9 = arg0.method17910();
					int var10 = arg0.method17910();
					var8.method14501(new class988(var10), (long) var9);
				}
			}
		}
		arg0.field11503 = 0;
		this.field12365 = arg0.method17917();
		this.field12369 = new class504[var4];
		return var3;
	}

	@ObfuscatedName("asc.m(Lalw;ILss;I)V")
	public void method19495(class997 arg0, int arg1, class504 arg2) {
		int var4 = this.field12369.length;
		if (class504.field5937 == arg2 || class504.field5651 == arg2) {
			class455 var7 = (class455) class686.method1897(class455.method7216(), arg0.method17904());
			int var8 = arg0.method17906();
			if (this.field12366 == null) {
				this.field12366 = new Object[var4];
			}
			this.field12366[arg1] = this.field12376.method695(var7, var8);
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			this.field12367[arg1] = arg0.method17904();
		} else if (class504.field5144 == arg2) {
			class470 var5 = (class470) class686.method1897(Statics.method7338(), arg0.method17904());
			switch(var5.field4841) {
				case 1:
					if (this.field12366 == null) {
						this.field12366 = new Object[var4];
					}
					this.field12366[arg1] = arg0.method17918().intern();
					break;
				case 2:
					if (this.field12367 == null) {
						this.field12367 = new int[var4];
					}
					arg2 = class504.field5463;
					this.field12367[arg1] = arg0.method17910();
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.field12366 == null) {
						this.field12366 = new Object[var4];
					}
					arg2 = class504.field5164;
					this.field12366[arg1] = arg0.method17914();
			}
		} else if (class504.field5142 == arg2 || class504.field5143 == arg2) {
			int var6 = arg0.method17906();
			if (this.field12366 == null) {
				this.field12366 = new Object[var4];
			}
			this.field12366[arg1] = this.field12376.method694(var6);
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			this.field12367[arg1] = arg0.method17904();
		} else {
			if (this.field12367 == null) {
				this.field12367 = new int[var4];
			}
			if (arg2 != null && arg2.field6572) {
				this.field12367[arg1] = arg0.method17910();
			} else {
				this.field12367[arg1] = arg0.method17904();
			}
		}
		this.field12369[arg1] = arg2;
	}
}