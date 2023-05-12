package ch12.sc;

import ch12.sc.unit.Marine;
import ch12.sc.unit.Medic;
import ch12.sc.unit.Unit;
import ch12.sc.unit.Zealot;
import ch12.sc.unit.Zergling;

public class StarcraftCloneCoding {
	
	static Marine[] marines;
	static Zergling[] zerglings;
	static Zealot[] zealots;
	
	public static void main(String[] args) {
//		int numOfMarines = 5;
//		Marine[] marines = new Marine[numOfMarines]; // 배열 객체만 담은 것
//		
//		for (int i = 0; i < numOfMarines; i++) {
//			marines[i] = new Marine(i + 1);
//		}
		
		initUnits();
		reportAllUnits();
		
		System.out.println("\n\n마린#1이 저글링#1에 대해 2회 공격 후\n");
		marines[0].attack(zerglings[0], 2);
		zerglings[0].reportStatus();
		
		System.out.println("\n\n마린#2이 질럿#2에 대해 5회 공격 후\n");
		marines[1].attack(zealots[1], 5);
		zealots[1].reportStatus();

		System.out.println("\n\n저글링#1이 마린#3에 대해 3회 공격 후\n");
		zerglings[0].attack(marines[2], 3);
		marines[2].reportStatus();
		
		System.out.println("\n\n저글링#1이 질럿#2에 대해 7회 공격 후\n");
		zerglings[0].attack(zealots[1], 7);
		zealots[1].reportStatus();

		System.out.println("\n\n질럿#1이 마린#3에 대해 3회 공격 후\n");
		zealots[0].attack(marines[2], 3);
		marines[2].reportStatus();
		
		System.out.println("\n\n질럿#2이 질럿#1에 대해 7회 공격 후\n");
		zealots[1].attack(zealots[0], 7);
		zealots[0].reportStatus();
		
		Medic medic = new Medic();
		medic.reportStatus();
		System.out.println("\n\n저글링#1이 메딕에 대해 2회 공격 후\n");
		zerglings[0].attack(medic, 2);
		medic.reportStatus();
		
	}
	
	static void initUnits() {
		marines = new Marine[] {
				new Marine(1), new Marine(2), new Marine(3), new Marine(4), new Marine(5)	
		};
		
		zerglings = new Zergling[] {
				new Zergling(1)
		};
		
		zealots = new Zealot[] {
				new Zealot(), new Zealot(2)
		};
	}
	
	static void reportAllUnits() {
		reportUnits(marines);
		reportUnits(zerglings);
		reportUnits(zealots);
//		System.out.println(zerglings[0]);
	}
	
	static void reportUnits(Unit[] units) {
		for (Unit unit : units) {
			unit.reportStatus();
		}
		System.out.println();
	}

}
