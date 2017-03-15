package com.nasa.mars.enums;

public enum OrientationsEnum {

	NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');
	
	private char code;

	private OrientationsEnum(char code) {
		this.code = code;
	}

	public char getCode() {
		return this.code;
	}
	
}
