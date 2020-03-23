package com.xebia.MelonBlaster.service;

import com.xebia.MelonBlaster.MelonBlaster;
import com.xebia.MelonBlaster.constants.MelonBlasterEnum;
import com.xebia.MelonBlaster.util.MelonBlasterUtil;

public class MelonBlasterServiceImpl implements MelonBlasterService {

	@Override
	public Boolean checkIfPerfectTenAfterAddingBothShot(Integer firstArrowOne, Integer secondArrow) {
		return MelonBlasterEnum.PERFECT_TEN.getPerfectTen()
				.equals(MelonBlasterUtil.sumOfTwoArrows.apply(firstArrowOne, secondArrow));
	}

	@Override
	public Boolean checkIfAnyShotIsPerfectTen(MelonBlaster melonBlaster) {
		return MelonBlasterEnum.PERFECT_TEN.getPerfectTen().equals(melonBlaster.getFirstArrow())
				|| MelonBlasterEnum.PERFECT_TEN.getPerfectTen().equals(melonBlaster.getSecondArrow());
	}

	@Override
	public Boolean checkIfItsTenthTurn(MelonBlaster melonBlaster) {
		return MelonBlasterUtil.checkIfItsTenthTurn.test(melonBlaster);
	}

	@Override
	public Boolean checkIfFirstArrowScoreLessThanPerfectTen(MelonBlaster melonBlaster) {
		return melonBlaster.getFirstArrow() < MelonBlasterEnum.PERFECT_TEN.getPerfectTen();
	}

	@Override
	public Boolean checkIfPerfectTenInFirstArrowShot(MelonBlaster melonBlaster) {
		return MelonBlasterEnum.PERFECT_TEN.getPerfectTen().equals(melonBlaster.getFirstArrow());
	}

	@Override
	public Boolean checkIfPerfectTenInSecondArrowShot(MelonBlaster melonBlaster) {
		return MelonBlasterEnum.PERFECT_TEN.getPerfectTen().equals(melonBlaster.getSecondArrow());
	}

}
