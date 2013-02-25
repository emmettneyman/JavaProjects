package frc3929.scouting;

import javax.swing.JOptionPane;

public class Scouting {

	int matchNum = 0;
	int threePoint = 0;
	int twoPoint = 0;
	int onePoint = 0;
	int pyramidGoal = 0;
	int firstLevel = 0;
	int secondLevel = 0;
	int thirdLevel = 0;
	int match = 1;
	String matchnum;

	public Scouting() {
		
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

	public void firstLevel() {
		firstLevel++;
	}

	public void secondLevel() {
		secondLevel++;
	}

	public void thirdLevel() {
		thirdLevel++;
	}

	public void run() {

		String teamnum = JOptionPane
				.showInputDialog("Please input team number");
		this.matchnum = JOptionPane
				.showInputDialog("Please input match number");
		boolean run = true;
		String[] choices = {"Done", "Third level climb", "Second level climb",
				"First level climb", "Pyramid goal", "One point", "Two point",
				"Three point" };
		while (run) {

			int numInput = 0;
			numInput = JOptionPane.showOptionDialog(null, teamnum + " -Match "
					+ matchnum, "3929 Scouting App", JOptionPane.YES_NO_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, choices, null);
			// System.out.println(numInput);
			if (numInput == 7) {
				threePoint();
				// System.out.println(sc.threePoint);
			} else if (numInput == 6) {
				twoPoint();
				// System.out.println(sc.twoPoint);
			} else if (numInput == 5) {
				onePoint();
				// System.out.println(sc.onePoint);
			} else if (numInput == 4) {
				pyramidGoal();
				System.out.println(pyramidGoal);
			} else if (numInput == 3) {
				firstLevel();
				System.out.println(firstLevel);
			} else if (numInput == 2) {
				secondLevel();
				System.out.println(secondLevel);
			} else if (numInput == 1) {
				thirdLevel();
				System.out.println(thirdLevel);
			} else if (numInput == 0) {
				// System.exit(0);
				run = false;
			}
		}
		calculate();
	}

	public void calculate() {
		int matchNum = Integer.parseInt(this.matchnum);
		if (match == 1) {
			int[] matchOne = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchOne[0] + "/" + matchOne[1] + "/"
					+ matchOne[2] + "/" + matchNum);
			int totalOne;
			totalOne = (matchOne[0] * 3) + (matchOne[1] * 2) + (matchOne[2]);
			System.out.println("Total points for Match= " + totalOne);
			match++;
		} else if (match == 2) {
			int[] matchTwo = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchTwo[0] + "/" + matchTwo[1] + "/"
					+ matchTwo[2] + "/" + matchNum);
			int totalTwo;
			totalTwo = (matchTwo[0] * 3) + (matchTwo[1] * 2) + (matchTwo[2]);
			System.out.println("Total points for Match= " + totalTwo);
			match++;
		} else if (match == 3) {
			int[] matchThree = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchThree[0] + "/" + matchThree[1] + "/"
					+ matchThree[2] + "/" + matchNum);
			int totalThree;
			totalThree = (matchThree[0] * 3) + (matchThree[1] * 2)
					+ (matchThree[2]);
			System.out.println("Total points for Match= " + totalThree);
			match++;
		} else if (match == 4) {
			int[] matchFour = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchFour[0] + "/" + matchFour[1] + "/"
					+ matchFour[2] + "/" + matchNum);
			int totalFour;
			totalFour = (matchFour[0] * 3) + (matchFour[1] * 2)
					+ (matchFour[2]);
			System.out.println("Total points for Match= " + totalFour);
			match++;
		} else if (match == 5) {
			int[] matchFive = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchFive[0] + "/" + matchFive[1] + "/"
					+ matchFive[2] + "/" + matchNum);
			int totalFive;
			totalFive = (matchFive[0] * 3) + (matchFive[1] * 2)
					+ (matchFive[2]);
			System.out.println("Total points for Match= " + totalFive);
			match++;
		} else if (match == 6) {
			int[] matchSix = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchSix[0] + "/" + matchSix[1] + "/"
					+ matchSix[2] + "/" + matchNum);
			int totalSix;
			totalSix = (matchSix[0] * 3) + (matchSix[1] * 2) + (matchSix[2]);
			System.out.println("Total points for Match= " + totalSix);
			match++;
		} else if (match == 7) {
			int[] matchSeven = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchSeven[0] + "/" + matchSeven[1] + "/"
					+ matchSeven[2] + "/" + matchNum);
			int totalSeven;
			totalSeven = (matchSeven[0] * 3) + (matchSeven[1] * 2)
					+ (matchSeven[2]);
			System.out.println("Total points for Match= " + totalSeven);
			match++;
		} else if (match == 8) {
			int[] matchEight = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchEight[0] + "/" + matchEight[1] + "/"
					+ matchEight[2] + "/" + matchNum);
			int totalEight;
			totalEight = (matchEight[0] * 3) + (matchEight[1] * 2)
					+ (matchEight[2]);
			System.out.println("Total points for Match= " + totalEight);
			match++;
		} else if (match == 9) {
			int[] matchNine = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchNine[0] + "/" + matchNine[1] + "/"
					+ matchNine[2] + "/" + matchNum);
			int totalNine;
			totalNine = (matchNine[0] * 3) + (matchNine[1] * 2)
					+ (matchNine[2]);
			System.out.println("Total points for Match= " + totalNine);
			match++;
		} else if (match == 10) {
			int[] matchTen = {/* Calc */threePoint, /* Calc */twoPoint, /* Calc */
					onePoint, matchNum };
			System.out.println(matchTen[0] + "/" + matchTen[1] + "/"
					+ matchTen[2] + "/" + matchNum);
			int totalTen;
			totalTen = (matchTen[0] * 3) + (matchTen[1] * 2) + (matchTen[2]);
			System.out.println("Total points for Match= " + totalTen);
			match++;
		}
	}

}
