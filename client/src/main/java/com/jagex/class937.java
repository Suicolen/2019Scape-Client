package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.IOException;
import java.util.Iterator;

@ObfuscatedName("aik")
public class class937 extends class447 {

	@ObfuscatedName("aik.g")
	public class561 field10751;

	@ObfuscatedName("aik.w(IIB)V")
	public void method7015(int arg0, int arg1) {
		try {
			this.field10751.method9031();
		} catch (Exception var4) {
		}
		this.field10751 = null;
		this.field4455++;
		this.field4454 = -1;
		this.field4447 = (byte) (Math.random() * 255.0D + 1.0D);
		this.field4457 = arg0;
		this.field4456 = arg1;
	}

	@ObfuscatedName("aik.l(I)Z")
	public boolean method7016() {
		if (this.field10751 != null) {
			long var1 = class213.method3655();
			int var3 = (int) (var1 - this.field4452);
			this.field4452 = var1;
			if (var3 > 200) {
				var3 = 200;
			}
			this.field4441 += var3;
			if (this.field4441 > 30000) {
				try {
					this.field10751.method9031();
				} catch (Exception var34) {
				}
				this.field10751 = null;
			}
		}
		if (this.field10751 == null) {
			return this.method7021() == 0 && this.method7013() == 0;
		}
		try {
			for (class1230 var5 = (class1230) this.field4448.method14317(); var5 != null; var5 = (class1230) this.field4448.method14324()) {
				this.field4450.field11503 = 0;
				this.field4450.method18001(1);
				this.field4450.method17888(var5.field11440);
				this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
				this.field4451.method14339(var5);
			}
			for (class1230 var6 = (class1230) this.field4449.method14317(); var6 != null; var6 = (class1230) this.field4449.method14324()) {
				this.field4450.field11503 = 0;
				this.field4450.method18001(0);
				this.field4450.method17888(var6.field11440);
				this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
				this.field4443.method14339(var6);
			}
			for (int var7 = 0; var7 < 100; var7++) {
				int var8 = this.field10751.method9043();
				if (var8 < 0) {
					throw new IOException();
				}
				if (var8 == 0) {
					break;
				}
				this.field4441 = 0;
				if (this.field4462 == null) {
					int var9 = 5 - this.field4459.field11503 * 212851357;
					if (var9 > var8) {
						var9 = var8;
					}
					this.field10751.method9029(this.field4459.field11502, this.field4459.field11503 * 212851357, var9);
					if (this.field4447 != 0) {
						for (int var10 = 0; var10 < var9; var10++) {
							this.field4459.field11502[this.field4459.field11503 * 212851357 + var10] ^= this.field4447;
						}
					}
					this.field4459.field11503 += var9 * -1445626955;
					if (this.field4459.field11503 * 212851357 >= 5) {
						this.field4459.field11503 = 0;
						int var11 = this.field4459.method17904();
						int var12 = this.field4459.method17910();
						boolean var13 = (var12 & Integer.MIN_VALUE) != 0;
						int var14 = var12 & Integer.MAX_VALUE;
						long var15 = ((long) var11 << 32) + (long) var14;
						if (var13) {
							Iterator var17 = this.field4443.iterator();
							while (var17.hasNext()) {
								class1230 var18 = (class1230) var17.next();
								if (var18.field11440 == var15) {
									this.field4462 = var18;
									break;
								}
							}
						} else {
							Iterator var19 = this.field4451.iterator();
							while (var19.hasNext()) {
								class1230 var20 = (class1230) var19.next();
								if (var20.field11440 == var15) {
									this.field4462 = var20;
									break;
								}
							}
						}
						if (this.field4462 == null) {
							throw new IOException();
						}
						this.field4461 = 5;
						this.field4459.field11503 = 0;
						this.field4460.field11503 = 0;
					}
				} else {
					class997 var21 = this.field4462.field12564;
					if (var21 == null) {
						int var22 = 5 - this.field4460.field11503 * 212851357;
						if (var22 > var8) {
							var22 = var8;
						}
						this.field10751.method9029(this.field4460.field11502, this.field4460.field11503 * 212851357, var22);
						if (this.field4447 != 0) {
							for (int var23 = 0; var23 < var22; var23++) {
								this.field4460.field11502[this.field4460.field11503 * 212851357 + var23] ^= this.field4447;
							}
						}
						this.field4460.field11503 += var22 * -1445626955;
						if (this.field4460.field11503 * 212851357 >= 5) {
							this.field4460.field11503 = 0;
							int var24 = this.field4460.method17904();
							int var25 = this.field4460.method17910();
							byte var26 = 5;
							if (var24 != class445.field4434.method1303()) {
								var26 = 9;
							}
							class997 var27 = this.field4462.field12564 = new class997(var25 + var26 + this.field4462.field12565);
							var27.method18001(var24);
							var27.method17886(var25);
							this.field4461 += 5;
						}
					} else {
						int var28 = var21.field11502.length - this.field4462.field12565;
						int var29 = 102400 - this.field4461;
						if (var29 > var28 - var21.field11503 * 212851357) {
							var29 = var28 - var21.field11503 * 212851357;
						}
						if (var29 > var8) {
							var29 = var8;
						}
						this.field10751.method9029(var21.field11502, var21.field11503 * 212851357, var29);
						if (this.field4447 != 0) {
							for (int var30 = 0; var30 < var29; var30++) {
								var21.field11502[var21.field11503 * 212851357 + var30] ^= this.field4447;
							}
						}
						var21.field11503 += var29 * -1445626955;
						this.field4461 += var29;
						if (var21.field11503 * 212851357 == var28) {
							this.field4462.method17806();
							this.field4462.field12344 = false;
							this.field4462 = null;
						} else if (this.field4461 == 102400) {
							this.field4461 = 0;
							this.field4462 = null;
						}
					}
				}
			}
			return true;
		} catch (IOException var35) {
			try {
				this.field10751.method9031();
			} catch (Exception var33) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
			return this.method7021() == 0 && this.method7013() == 0;
		}
	}

	@ObfuscatedName("aik.u(Ljava/lang/Object;ZI)V")
	public void method7017(Object arg0, boolean arg1) {
		if (this.field10751 != null) {
			try {
				this.field10751.method9031();
			} catch (Exception var10) {
			}
			this.field10751 = null;
		}
		this.field10751 = (class561) arg0;
		this.method16859();
		this.method7010(arg1);
		this.field4459.field11503 = 0;
		this.field4460.field11503 = 0;
		this.field4462 = null;
		while (true) {
			class1230 var4 = (class1230) this.field4451.method14315();
			if (var4 == null) {
				while (true) {
					class1230 var5 = (class1230) this.field4443.method14315();
					if (var5 == null) {
						if (this.field4447 != 0) {
							try {
								this.field4450.field11503 = 0;
								this.field4450.method18001(4);
								this.field4450.method18001(this.field4447);
								this.field4450.method17886(0);
								this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
							} catch (IOException var9) {
								try {
									this.field10751.method9031();
								} catch (Exception var8) {
								}
								this.field10751 = null;
								this.field4455++;
								this.field4454 = -2;
							}
						}
						this.field4441 = 0;
						this.field4452 = class213.method3655();
						return;
					}
					var5.field12564 = null;
					this.field4449.method14339(var5);
				}
			}
			var4.field12564 = null;
			this.field4448.method14339(var4);
		}
	}

	@ObfuscatedName("aik.ac(I)V")
	public void method16859() {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.field11503 = 0;
			this.field4450.method18001(6);
			this.field4450.method17885(4);
			this.field4450.method17945(0);
			this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
		} catch (IOException var4) {
			try {
				this.field10751.method9031();
			} catch (Exception var3) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.z(ZI)V")
	public void method7010(boolean arg0) {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.field11503 = 0;
			this.field4450.method18001(arg0 ? 2 : 3);
			this.field4450.method17888(0L);
			this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
		} catch (IOException var5) {
			try {
				this.field10751.method9031();
			} catch (Exception var4) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.p(I)V")
	public void method7014() {
		if (this.field10751 == null) {
			return;
		}
		try {
			this.field4450.field11503 = 0;
			this.field4450.method18001(7);
			this.field4450.method17888(0L);
			this.field10751.method9030(this.field4450.field11502, 0, this.field4450.field11502.length);
		} catch (IOException var4) {
			try {
				this.field10751.method9031();
			} catch (Exception var3) {
			}
			this.field10751 = null;
			this.field4455++;
			this.field4454 = -2;
		}
	}

	@ObfuscatedName("aik.d(I)V")
	public void method7020() {
		if (this.field10751 != null) {
			this.field10751.method9031();
		}
	}

	@ObfuscatedName("aik.c(I)V")
	public void method7035() {
		if (this.field10751 != null) {
			this.field10751.method9032();
		}
	}
}