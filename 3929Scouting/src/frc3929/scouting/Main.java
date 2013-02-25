package frc3929.scouting;

import javax.swing.JOptionPane;

public class Main {
	static Team tm;
	

	public static void main(String[] args) {
		
		String[] firstChoice = { "Add Team", "Select Team" };
		int firstInput = JOptionPane.showOptionDialog(null,
				"Select an old team or add a new one", "3929 Scouting App",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
				firstChoice, null);

		switch (firstInput) {
		case 0:
			newTeam();
			break;

		case 1:
			teamList();
			break;
		}

	}

	public static void teamList() {
		
	}

	public static void newTeam() {
		String teamString = JOptionPane
				.showInputDialog("Please input team number");
		tm = new Team(Integer.parseInt(teamString));

		matchInput();
	}

	public static void matchChoice(){
		String[] secondChoice = {"Back", "Old Matches", "New Match"};
		int secondInput = JOptionPane.showOptionDialog(null, "Look at old matches or enter data for a new match.", "3929 Scouting App", 
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, secondChoice, null);
		switch(secondInput){
		case 0:
			teamList();
			break;
		case 1:
			matchList();
			break;
		case 2:
			matchInput();
			break;
		}
	}

	public static void matchList() {		
		JOptionPane.showMessageDialog(null,
				matches, "FRC 3929 Scouting App" , -1);
		
	}

	public static void matchInput() {

		String matchString = JOptionPane
				.showInputDialog("Please input match number");
		Match mtc = new Match(Integer.parseInt(matchString));
		tm.addMatch(mtc);
		tm.printList();
		// System.out.println(tm.getTeamNum());
		// System.out.println(mtc.getMatchNum());
		boolean matchInput = true;

		while (matchInput) {
			String[] choices = { "Done", "Third level climb",
					"Second level climb", "First level climb",
					"One Point Auton", "Two Point Auton", "Three Point Auton",
					"Pyramid goal", "One point", "Two point", "Three point" };
			int numInput = JOptionPane.showOptionDialog(null, tm.getTeamNum()
					+ " -Match " + mtc.getMatchNum(), "3929 Scouting App",
					JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
					choices, null);
			switch (numInput) {
			case 10:
				mtc.threePoint();
				break;
			case 9:
				mtc.twoPoint();
				break;
			case 8:
				mtc.onePoint();
				break;
			case 7:
				mtc.pyramidGoal();
				break;
			case 6:
				mtc.threeAuton();
				break;
			case 5:
				mtc.twoAuton();
				break;
			case 4:
				mtc.oneAuton();
				break;
			case 3:
				mtc.firstLevel();
				break;
			case 2:
				mtc.secondLevel();
				break;
			case 1:
				mtc.thirdLevel();
				break;
			case 0:
				matchInput = false;

			}
		}

		System.out.println("Total points in match: " + mtc.total() + "\n"
				+ "Total disc points: " + mtc.discPointsTotal() + "\n"
				+ "Total discs: " + mtc.discTotal() + "\n"
				+ "Total Auton Points: " + mtc.autonTotal()
				+ "\n" + "Total Climbing Points: "+ mtc.climbingPoints());

	}

}
