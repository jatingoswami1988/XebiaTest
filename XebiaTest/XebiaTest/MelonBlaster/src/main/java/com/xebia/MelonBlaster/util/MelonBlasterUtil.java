package com.xebia.MelonBlaster.util;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.xebia.MelonBlaster.MelonBlaster;
import com.xebia.MelonBlaster.constants.MelonBlasterEnum;

public class MelonBlasterUtil {

	public static BiFunction<Integer, Integer, Integer> sumOfTwoArrows = (firstArrow, secondArrow) -> {
		return firstArrow + secondArrow;
	};

	public static Predicate<MelonBlaster> checkPerfectTenInFirstArrowShot = new Predicate<MelonBlaster>() {

		@Override
		public boolean test(MelonBlaster o) {
			MelonBlaster melonBlaster = (MelonBlaster) o;
			return MelonBlasterEnum.PERFECT_TEN.getPerfectTen() == melonBlaster.getFirstArrow();
		}

	};
	
	public static Predicate<MelonBlaster> checkPerfectTenInSecondArrowShot = new Predicate<MelonBlaster>() {

		@Override
		public boolean test(MelonBlaster o) {
			MelonBlaster melonBlaster = (MelonBlaster) o;
			return MelonBlasterEnum.PERFECT_TEN.getPerfectTen() == melonBlaster.getSecondArrow();
		}

	};
	
	public static Predicate<MelonBlaster> checkIfItsTenthTurn = new Predicate<MelonBlaster>() {

		@Override
		public boolean test(MelonBlaster o) {
			MelonBlaster melonBlaster = (MelonBlaster) o;
			return MelonBlasterEnum.PERFECT_TEN.getPerfectTen() == melonBlaster.getTurn();
		}

	};

}
