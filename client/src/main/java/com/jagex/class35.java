package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.awt.Canvas;

@ObfuscatedName("ag")
public class class35 {

	@ObfuscatedName("ag.m")
	public static class715 field631 = new class715();

	public class35() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Ldh;Lhf;I)V")
	public static void method539(class133 arg0, class226 arg1) {
		boolean var2 = Statics.field1842.method18900(arg0, arg1.field2334, arg1.field2335, arg1.field2218, arg1.field2219 | 0xFF000000, arg1.field2241, arg1.field2246 ? Statics.field4490.field12061 : null) == null;
		if (var2) {
			field631.method14153(new class964(arg1.field2334, arg1.field2335, arg1.field2218, arg1.field2219 | 0xFF000000, arg1.field2241, arg1.field2246));
			client.method4616(arg1);
		}
	}

	@ObfuscatedName("xk.n(Ldh;S)V")
	public static void method10323(class133 arg0) {
		if (field631.method14157() == 0) {
			return;
		}
		if (Statics.field688.field11540.method18545() == 0) {
			for (class964 var1 = (class964) field631.method14191(); var1 != null; var1 = (class964) field631.method14161()) {
				Statics.field1842.method18905(arg0, arg0, var1.field11256, var1.field11255, var1.field11258, var1.field11257, false, false, var1.field11254, Statics.field8321, var1.field11259 ? Statics.field4490.field12061 : null, Statics.field11389);
				var1.method8440();
			}
			client.method9734();
			return;
		}
		if (Statics.field630 == null) {
			Canvas var2 = new Canvas();
			var2.setSize(36, 32);
			Statics.field630 = class133.method14575(0, var2, Statics.field7366, Statics.field7669, Statics.field9211, Statics.field7282, Statics.field2013, Statics.field2900, 0);
			Statics.field629 = Statics.field630.method2207(class733.method1593(Statics.field7672, Statics.field506, 0), class111.method1609(Statics.field10317, Statics.field506, 0), true);
		}
		for (class964 var3 = (class964) field631.method14191(); var3 != null; var3 = (class964) field631.method14161()) {
			Statics.field1842.method18905(Statics.field630, arg0, var3.field11256, var3.field11255, var3.field11258, var3.field11257, false, false, var3.field11254, Statics.field629, var3.field11259 ? Statics.field4490.field12061 : null, Statics.field11389);
			var3.method8440();
		}
	}

	@ObfuscatedName("akf.m(I)V")
	public static void method17658() {
		if (Statics.field630 != null) {
			Statics.field630.method2578();
			Statics.field630 = null;
			Statics.field629 = null;
		}
	}
}