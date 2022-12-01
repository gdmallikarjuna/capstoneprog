package com.snipe.learning.corejava;

public final class ImmutableCls {
	private final String name;

	public ImmutableCls(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

}
