package com.xebia.MelonBlaster.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.xebia.MelonBlaster.MelonBlaster;
import com.xebia.MelonBlaster.util.MelonBlasterUtil;

public class MelonBlasterFacade {	
	
		public Integer getArcherScore(String parameter){

			MelonBlaster melonBlaster = new MelonBlaster();
			Scanner inputFile = null;
			try {
				inputFile = new Scanner(new File(parameter));
				 while (inputFile.hasNextLine()) {
					String turns[] = inputFile.nextLine().split(",");
					
					/////  First and Second arrow hit count
					melonBlaster.setFirstArrow(Integer.valueOf(turns[0]));
					melonBlaster.setSecondArrow(turns.length > 1 ? Integer.valueOf(turns[1]) : 0);
					melonBlaster.setThirdArrow(turns.length > 2 ? Integer.valueOf(turns[2]) : 0);

					
					//// checking for Advantage which the archer gets after getting all shots hit
					if (melonBlaster.getAdvantageOfGettingPerfectTenAfterAddingBothShots()) {
						melonBlaster.setFinalScore(MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFinalScore(),melonBlaster.getFirstArrow()));
						melonBlaster.setAdvantageOfGettingPerfectTenAfterAddingBothShots(Boolean.FALSE);
					}
					//// checking for Advantage which the archer gets after getting all shots hit
					if (melonBlaster.getAdvantageOfGettingPerfectTenInSingleShot()) {
						melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow()));
						melonBlaster.setAdvantageOfGettingPerfectTenInSingleShot(Boolean.FALSE);
					}

					
					///// Checking if Its 10th Turn and its advantage
					if (MelonBlasterFactory.getMelonBlasterService().checkIfItsTenthTurn(melonBlaster)) {  

						if (MelonBlasterFactory.getMelonBlasterService().checkIfFirstArrowScoreLessThanPerfectTen(melonBlaster)) {
							melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow()));
						} else if (MelonBlasterFactory.getMelonBlasterService().checkIfPerfectTenInFirstArrowShot(melonBlaster)) {
							melonBlaster.setFinalScore(MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFinalScore(),melonBlaster.getFirstArrow()));
							if (MelonBlasterFactory.getMelonBlasterService().checkIfPerfectTenInSecondArrowShot(melonBlaster)) {
								melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getThirdArrow()));
							} else {
								melonBlaster.setFinalScore(melonBlaster.getFinalScore() + melonBlaster.getSecondArrow());
							}
						}
						/// Checking if any perfect 10 in any hit.
					} else if (MelonBlasterFactory.getMelonBlasterService().checkIfAnyShotIsPerfectTen(melonBlaster)) {
						melonBlaster.setAdvantageOfGettingPerfectTenInSingleShot(Boolean.TRUE);
						melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow()));
					} else if (MelonBlasterFactory.getMelonBlasterService().checkIfPerfectTenAfterAddingBothShot(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow())) {
						melonBlaster.setAdvantageOfGettingPerfectTenAfterAddingBothShots(Boolean.TRUE);
						melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow()));
					} else {
						melonBlaster.setFinalScore(melonBlaster.getFinalScore() + MelonBlasterUtil.sumOfTwoArrows.apply(melonBlaster.getFirstArrow(), melonBlaster.getSecondArrow()));
					}
					
					/// adding every turn 
					melonBlaster.setTurn(melonBlaster.getTurn() + 1);

				}

			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println(e);
			} finally {
				inputFile.close();

			}			
			return melonBlaster.getFinalScore();

		}

}
