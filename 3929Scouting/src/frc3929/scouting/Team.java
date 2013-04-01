package frc3929.scouting;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

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
	private int getTotalOne(){
		int f = 0;
		for(int i = 0; i < Math.round(matches.size() * 4/9); i++)
		{
			f += matches.get(matches.size() - i).getOnePoint();
		}
		return f;
	}
	private int getTotalTwo(){
		int t = 0;
		for(int i = 0; i < Math.round(matches.size() * 4/9); i++)
		{
			t += matches.get(matches.size() - i).getTwoPoint();
		}
		return t * 2;
	}
	private int getNeededThree(){
		int t = 0;
		for(int i = 0; i < Math.round(matches.size() * 4/9); i++)
		{
			t += matches.get(matches.size() - i).getThreePoint();
		}
		return t * 3;
	}
	private int getTotalShots(){
		int shots = 0;
		for(int i = 0; i < Math.round(matches.size() * 4/9); i++)
		{
			shots += matches.get(matches.size() - i).getTotalShots();
		}
		return shots;
	}
	private double expectedValuePerShot(){
		return (getTotalOne() + getTotalTwo() + getTotalThree()) / getTotalShots();
	}
	
	private int expectedShotsMade(){
		int shots = 0;
		for(int i = 0; i < Math.round(matches.size() * 4/9); i++)
		{
			shots += matches.get(matches.size() - i).getTotalShots();
		}
		return Math.round(shots * 4/9);
	}
	
	public int expectedPoints(){
		
		return expectedValuePerShot() + expectedShotsMade();
		
	}
	
}
