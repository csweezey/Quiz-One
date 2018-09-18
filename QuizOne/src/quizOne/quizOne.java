package quizOne;

import java.util.Scanner;

public class quizOne {
	
	static Scanner sc= new Scanner(System.in);
	public static void BA(double H, double AB) {
		double battingAverage = H/AB;
		System.out.print("Batting Average: " + battingAverage);
	}
	
	public static void OBP(double H, double BB, double AB) {
		double onBasePercentage = (H + BB)/(AB + BB);
		System.out.print("On-Base Percentage: " + onBasePercentage);
	}
	
	public static void SLG(double R, double D, double T, double HR, double AB) {
		double sluggingPercentage = ((R + (2*D) + (3*T) + (4*HR))/AB);
		System.out.print("Slugging Percentage: " + sluggingPercentage);
	}
	
	public static void OPS(double R, double D, double T, double HR, double AB, double H, double BB) {
		double onBaseSluggingPercentage = ((R + (2*D) + (3*T) + (4*HR))/AB)/((H + BB)/(AB + BB));
		System.out.print("On-Base and Slugging Percentage: " + onBaseSluggingPercentage);
	}
	
	public static void TB(double R, double D, double T, double HR) {
		double totalBases = (R + (2*D) + (3*T) + (4*HR));
		System.out.print("Total Bases: " + totalBases);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter player name:");
		String name = sc.nextLine();
		System.out.println("Enter player's at bats:");
		double AB = sc.nextInt();
		System.out.println("Enter player's number of hits:");
		double H = sc.nextInt();
		System.out.println("Enter player's number of doubles:");
		double D = sc.nextInt();
		System.out.println("Enter player's number of triples:");
		double T = sc.nextInt();
		System.out.println("Enter player's number of home runs:");
		double HR = sc.nextInt();
		System.out.println("Enter player's number of runs:");
		double R = sc.nextInt();
		System.out.println("Enter player's number of walks:");
		double BB = sc.nextInt();
		System.out.println("Statistics for " + name + ":");
		quizOne.BA(H, AB);
		System.out.print("\n");
		quizOne.OBP(H, BB, AB);
		System.out.print("\n");
		quizOne.SLG(R, D, T, HR, AB);
		System.out.print("\n");
		quizOne.OPS(R, D, T, HR, AB, HR, BB);
		System.out.print("\n");
		quizOne.TB(R, D, T, HR);
	}
}