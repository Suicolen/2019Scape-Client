package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hy")
public class MapAlignmentY implements SerializableEnum {

	@ObfuscatedName("hy.e")
	public static final MapAlignmentY field2426 = new MapAlignmentY(1, 0);

	@ObfuscatedName("hy.n")
	public static final MapAlignmentY field2424 = new MapAlignmentY(2, 1);

	@ObfuscatedName("hy.m")
	public static final MapAlignmentY field2422 = new MapAlignmentY(0, 2);

	@ObfuscatedName("hy.k")
	public final int field2425;

	@ObfuscatedName("hy.f")
	public final int field2423;

	public MapAlignmentY(int arg0, int arg1) {
		this.field2425 = arg0;
		this.field2423 = arg1;
	}

	@ObfuscatedName("hy.n()I")
	public int getId() {
		return this.field2423;
	}
}