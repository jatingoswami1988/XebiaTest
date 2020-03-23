package com.xebia.MelonBlaster.service;

import com.xebia.MelonBlaster.MelonBlaster;

public interface MelonBlasterService {
	
	Boolean checkIfPerfectTenAfterAddingBothShot(Integer firstArrow,Integer secondArrow);
	
	Boolean checkIfAnyShotIsPerfectTen(MelonBlaster melonBlaster);
	
	Boolean checkIfItsTenthTurn(MelonBlaster melonBlaster);
	
	Boolean checkIfFirstArrowScoreLessThanPerfectTen(MelonBlaster melonBlaster);
	
	Boolean checkIfPerfectTenInFirstArrowShot(MelonBlaster melonBlaster);
	
	Boolean checkIfPerfectTenInSecondArrowShot(MelonBlaster melonBlaster);

}
