package com.xebia.MelonBlaster.service;

public class MelonBlasterFactory {

	public static MelonBlasterService getMelonBlasterService() {

		return new MelonBlasterServiceImpl();

	}

}
