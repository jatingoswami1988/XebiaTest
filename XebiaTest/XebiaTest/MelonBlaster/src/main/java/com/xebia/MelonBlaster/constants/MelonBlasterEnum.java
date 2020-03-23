package com.xebia.MelonBlaster.constants;

public enum MelonBlasterEnum {

	PERFECT_TEN(10);

	private Integer perfectTen;


	private MelonBlasterEnum(Integer perfectTen) {
		this.perfectTen = perfectTen;
	}
	
	public Integer getPerfectTen() {
		return perfectTen;
	}
}
