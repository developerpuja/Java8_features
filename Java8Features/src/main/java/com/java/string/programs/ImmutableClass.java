
package com.java.string.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lombok.ToString;

public final class ImmutableClass {
	private final int id;
	private final String name;
	private final List<String> favColors;
	
	public ImmutableClass(int id, String name, List<String> favColors) {
		super();
		this.id = id;
		this.name = name;
		this.favColors = favColors;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getFavColors() {
		return Collections.unmodifiableList(this.favColors);
	}
}
