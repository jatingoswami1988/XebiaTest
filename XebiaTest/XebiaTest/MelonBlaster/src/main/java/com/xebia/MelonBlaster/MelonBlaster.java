package com.xebia.MelonBlaster;

public class MelonBlaster {

	private Integer firstArrow;

	private Integer secondArrow;

	private Integer thirdArrow;

	private Boolean advantageOfGettingPerfectTenAfterAddingBothShots = Boolean.FALSE;

	private Boolean advantageOfGettingPerfectTenInSingleShot = Boolean.FALSE;

	private Integer finalScore=0;;
	
	private Integer turn=1;

	public Integer getTurn() {
		return turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}

	public Integer getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(Integer finalScore) {
		this.finalScore = finalScore;
	}

	public Integer getFirstArrow() {
		return firstArrow;
	}

	public void setFirstArrow(Integer firstArrow) {
		this.firstArrow = firstArrow;
	}

	public Integer getSecondArrow() {
		return secondArrow;
	}

	public void setSecondArrow(Integer secondArrow) {
		this.secondArrow = secondArrow;
	}

	public Integer getThirdArrow() {
		return thirdArrow;
	}

	public void setThirdArrow(Integer thirdArrow) {
		this.thirdArrow = thirdArrow;
	}

	public Boolean getAdvantageOfGettingPerfectTenAfterAddingBothShots() {
		return advantageOfGettingPerfectTenAfterAddingBothShots;
	}

	public void setAdvantageOfGettingPerfectTenAfterAddingBothShots(
			Boolean advantageOfGettingPerfectTenAfterAddingBothShots) {
		this.advantageOfGettingPerfectTenAfterAddingBothShots = advantageOfGettingPerfectTenAfterAddingBothShots;
	}

	public Boolean getAdvantageOfGettingPerfectTenInSingleShot() {
		return advantageOfGettingPerfectTenInSingleShot;
	}

	public void setAdvantageOfGettingPerfectTenInSingleShot(Boolean advantageOfGettingPerfectTenInSingleShot) {
		this.advantageOfGettingPerfectTenInSingleShot = advantageOfGettingPerfectTenInSingleShot;
	}

}
