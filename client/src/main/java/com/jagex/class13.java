package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("w")
public class class13 {

	@ObfuscatedName("w.f")
	public static final BigInteger field495 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@ObfuscatedName("w.w")
	public static final BigInteger field496 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	public class13() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abx.e(I)J")
	public static long method14886() {
		try {
			URL var0 = new URL(client.method4591("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			class997 var4 = new class997(new byte[1000]);
			do {
				int var5 = var3.read(var4.field11502, var4.field11503 * 212851357, 1000 - var4.field11503 * 212851357);
				if (var5 == -1) {
					var4.field11503 = 0;
					return var4.method17914();
				}
				var4.field11503 += var5 * -1445626955;
			} while (var4.field11503 * 212851357 < 1000);
			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("abn.n(JLjava/lang/String;B)I")
	public static final int method14753(long arg0, String arg1) {
		Random var3 = new Random();
		class997 var4 = new class997(128);
		class997 var5 = new class997(128);
		int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		var4.method18001(10);
		for (int var7 = 0; var7 < 4; var7++) {
			var4.method17886(var3.nextInt());
		}
		var4.method17886(var6[0]);
		var4.method17886(var6[1]);
		var4.method17890(arg0);
		var4.method17890(0L);
		for (int var8 = 0; var8 < 4; var8++) {
			var4.method17886(var3.nextInt());
		}
		var4.method17907(field495, field496);
		var5.method18001(10);
		for (int var9 = 0; var9 < 3; var9++) {
			var5.method17886(var3.nextInt());
		}
		var5.method17890(var3.nextLong());
		var5.method17889(var3.nextLong());
		class507.method4286(var5);
		var5.method17890(var3.nextLong());
		var5.method17907(field495, field496);
		int var10 = class997.method14803(arg1);
		if (var10 % 8 != 0) {
			var10 += 8 - var10 % 8;
		}
		class997 var11 = new class997(var10);
		var11.method17893(arg1);
		var11.field11503 = var10 * -1445626955;
		var11.method17966(var6);
		class997 var12 = new class997(var11.field11503 * 212851357 + var5.field11503 * 212851357 + var4.field11503 * 212851357 + 5);
		var12.method18001(2);
		var12.method18001(var4.field11503 * 212851357);
		var12.method17896(var4.field11502, 0, var4.field11503 * 212851357);
		var12.method18001(var5.field11503 * 212851357);
		var12.method17896(var5.field11502, 0, var5.field11503 * 212851357);
		var12.method17945(var11.field11503 * 212851357);
		var12.method17896(var11.field11502, 0, var11.field11503 * 212851357);
		String var13 = class694.method10220(var12.field11502);
		try {
			URL var14 = new URL(client.method4591("services", false) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			var16.write("data2=" + class805.method18779(var13) + "&dest=" + class805.method18779("passwordchoice.ws"));
			var16.flush();
			InputStream var17 = var15.getInputStream();
			class997 var18 = new class997(new byte[1000]);
			do {
				int var19 = var17.read(var18.field11502, var18.field11503 * 212851357, 1000 - var18.field11503 * 212851357);
				if (var19 == -1) {
					var16.close();
					var17.close();
					String var20 = new String(var18.field11502);
					if (var20.startsWith("OFFLINE")) {
						return 4;
					} else if (var20.startsWith("WRONG")) {
						return 7;
					} else if (var20.startsWith("RELOAD")) {
						return 3;
					} else if (var20.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var18.method17931(var6);
						while (var18.field11503 * 212851357 > 0 && var18.field11502[var18.field11503 * 212851357 - 1] == 0) {
							var18.field11503 -= -1445626955;
						}
						String var21 = new String(var18.field11502, 0, var18.field11503 * 212851357);
						if (method15242(var21)) {
							class505.method4607(var21, true, client.field10784);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var18.field11503 += var19 * -1445626955;
			} while (var18.field11503 * 212851357 < 1000);
			return 5;
		} catch (Throwable var23) {
			var23.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("adr.m(Ljava/lang/String;B)Z")
	public static boolean method15242(String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (MalformedURLException var2) {
			return false;
		}
	}
}