package frc3929.scouting;

public class Match {
	
	private int matchNum;
	private int threePoint = 0;
	private int twoPoint = 0;
	private int onePoint = 0;
	private int pyramidGoal = 0;
	private int firstLevel = 0;
	private int secondLevel = 0;
	private int thirdLevel = 0;
	private int threeAuton = 0;
	private int twoAuton = 0;
	private int oneAuton = 0;
	
	private int thirdAttempt = 0;
	private int secondAttempt = 0;
	private int firstAttempt = 0;
	private int pyramidAttempt=0;
	private int autonAttempt=0;
	
	public Match(int matchNum){
		this.matchNum= matchNum;
	}
	
	public int total(){
		return (threeAuton*6)+(twoAuton*4)+(oneAuton*2)+(threePoint*3)+(twoPoint*2)+onePoint+(pyramidGoal*5)+(firstLevel*10)+(secondLevel*20)+(thirdLevel*30);
	}
	
	public int discPointsTotal(){
		return (threeAuton*6)+(twoAuton*4)+(oneAuton*2)+(threePoint*3)+(twoPoint*2)+onePoint+(pyramidGoal*5);
	}
	public int discAttemptsTotal(){
		return thirdAttempt+secondAttempt+firstAttempt+pyramidAttempt+autonAttempt;
	}
	public int discTotal(){
		return (threeAuton)+(twoAuton)+(oneAuton)+(threePoint)+(twoPoint)+onePoint+(pyramidGoal);
	}
	public int autonTotal(){
		return (threeAuton*6)+(twoAuton*4)+(oneAuton*2);
	}
	public int climbingPoints(){
		return (thirdLevel*30)+(secondLevel*20)+(firstLevel*10);
	}
	
	public void threePoint() {
		threePoint++;
	}

	public void twoPoint() {
		twoPoint++;
	}

	public void onePoint() {
		onePoint++;
	}

	public void pyramidGoal() {
		pyramidGoal++;
	}
	
	public void threeAuton(){
		threeAuton++;
	}
	
	public void twoAuton(){
		twoAuton++;
	}
	
	public void oneAuton(){
		oneAuton++;
	}

	public void firstLevel() {
		firstLevel++;
	}

	public void secondLevel() {
		secondLevel++;
	}

	public void thirdLevel() {
		thirdLevel++;
	}

	public void thirdAttempt() {
		thirdAttempt++;
	}
	public void secondAttempt() {
		secondAttempt++;
	}
	public void firstAttempt() {

		firstAttempt++;
	}
	public void pyramidAttempt(){
		pyramidAttempt++;
	}
	
	public void autonAttempt(){
		autonAttempt++;
	}
	
	public int getThirdAttempt() {
		return thirdAttempt;
	}

	public int getSecondAttempt() {
		return secondAttempt;
	}

	public int getFirstAttempt() {
		return firstAttempt;
	}

	public int getPyramidAttempt() {
		return pyramidAttempt;
	}
	
	public int getAutonAttempt(){
		return autonAttempt;
	}

	public int getMatchNum() {
		return matchNum;
	}

	public int getThreePoint() {
		return threePoint;
	}

	public int getTwoPoint() {
		return twoPoint;
	}

	public int getOnePoint() {
		return onePoint;
	}

	public int getPyramidGoal() {
		return pyramidGoal;
	}
	
	public int getThreeAuton(){
		return threeAuton;
	}
	
	public int getTwoAuton(){
		return twoAuton;
	}
	
	public int getOneAuton(){
		return oneAuton;
	}

	public int getFirstLevel() {
		return firstLevel;
	}

	public int getSecondLevel() {
		return secondLevel;
	}

	public int getThirdLevel() {
		return thirdLevel;
	}
}
