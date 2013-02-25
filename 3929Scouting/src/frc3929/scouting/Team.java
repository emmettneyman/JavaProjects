package frc3929.scouting;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private int teamNum;
	List<Match> matches;
	
	public Team(int teamNum){
		this.teamNum = teamNum;
		this.matches= new ArrayList<Match>();
	}

	public void addMatch(Match mtc){
		matches.add(mtc);
	}
	public void printList()
	{
		System.out.println(matches);
	}
	public int totalPoints(){
		int total=0;
		for(int i=0; i<matches.size();i++){
			total+= matches.get(i).total();
		}
		return total;
	}
	public int totalDiscPoints(){
		int total=0;
		for(int i=0; i<matches.size();i++){
			total+= matches.get(i).discPointsTotal();
		}
		return total;
	}
	public double shootingPercentage(){
		int totalShots = 0;
		int totalAttempts = 0;
		for(int i=0; i<matches.size();i++){
			totalShots+= matches.get(i).discTotal();
			totalAttempts+= matches.get(i).discAttemptsTotal();
		}
		return ((double)totalShots / (double)(totalShots + totalAttempts));
	}
	public int totalAutonPoints(){
		int totalAuton=0;
		for(int i=0; i<matches.size();i++){
			totalAuton+= matches.get(i).autonTotal();
		}
		return totalAuton;
	}

	public int getTeamNum() {
		return teamNum;
	}
	
}
